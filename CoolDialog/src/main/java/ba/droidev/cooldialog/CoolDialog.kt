package ba.droidev.cooldialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton
import de.hdodenhof.circleimageview.CircleImageView
import java.lang.Exception

class CoolDialog(context: Context): Dialog(context) {

    /**********************
    *** LAYOUT SETTINGS ***
    **********************/

    /** <! Override .setContentView so it's always dialog_layout */
    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.dialog_layout)
    }
    /** <! Request content view so there is no need to call .setContentView() */
    fun requestContentView() {
        setContentView(R.layout.dialog_layout)
    }
    /** <! Get root layout of dialog_layout.xml */
    fun getRootLayout(): RelativeLayout {
        return this.findViewById(R.id.rl_root)
    }
    /** <! Get dialog TextViews */
    fun getFirstTextView(): TextView {
        return this.findViewById(R.id.tv_text1)
    }
    fun getSecondTextView(): TextView {
        return this.findViewById(R.id.tv_text2)
    }
    fun getThirdTextView(): TextView {
        return this.findViewById(R.id.tv_text3)
    }
    fun getFourthTextView(): TextView {
        return this.findViewById(R.id.tv_text4)
    }
    /** <! Get dialog MaterialButtonViews */
    fun getCallButtonView(): MaterialButton {
        return this.findViewById(R.id.btn_call)
    }
    fun getCancelButtonView(): MaterialButton {
        return this.findViewById(R.id.btn_cancel)
    }

    /*********************
    *** IMAGE RESOURCE ***
    *********************/

    /** <! Set image by drawable ID */
    fun setImageResource(id: Int) {
        try {
            this.findViewById<ImageView>(R.id.iv_circle_image).setImageResource(id)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    /** <! Set image by URL using Glide library (NEEDS INTERNET CONNECTION!) */
    fun setImageResource(url: String) {
        try {
            val circleImageView: CircleImageView = this.findViewById(R.id.iv_circle_image)
            Glide.with(context)
                .load(
                    url
                )
                .into(this.findViewById(R.id.iv_circle_image))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /*************************
    *** TEXTVIEW FUNCTIONS ***
    *************************/

    /** <! Set text on TextViews */
    fun setTextOnFirstTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text1).setText(text)
    }
    fun setTextOnSecondTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text2).setText(text)
    }
    fun setTextOnThirdTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text3).setText(text)
    }
    fun setTextOnFourthTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text4).setText(text)
    }
    fun setTextToAll(text: String, text2: String, text3: String, text4: String) {

        this.findViewById<TextView>(R.id.tv_text1).setText(text)
        this.findViewById<TextView>(R.id.tv_text2).setText(text2)
        this.findViewById<TextView>(R.id.tv_text3).setText(text3)
        this.findViewById<TextView>(R.id.tv_text4).setText(text4)
    }
    /** <! Hide TextViews */
    fun hideFirstTextView() {
        this.findViewById<TextView>(R.id.tv_text1).visibility = View.GONE
    }
    fun hideSecondTextView() {
        this.findViewById<TextView>(R.id.tv_text2).visibility = View.GONE
    }
    fun hideThirdTextView() {
        this.findViewById<TextView>(R.id.tv_text3).visibility = View.GONE
    }
    fun hideFourthTextView() {
        this.findViewById<TextView>(R.id.tv_text4).visibility = View.GONE
    }
    /** <! Show TextViews */
    fun showFirstTextView() {
        this.findViewById<TextView>(R.id.tv_text1).visibility = View.VISIBLE
    }
    fun showSecondTextView() {
        this.findViewById<TextView>(R.id.tv_text2).visibility = View.VISIBLE
    }
    fun showThirdTextView() {
        this.findViewById<TextView>(R.id.tv_text3).visibility = View.VISIBLE
    }
    fun showFourthTextView() {
        this.findViewById<TextView>(R.id.tv_text4).visibility = View.VISIBLE
    }
    /** <! Change text color on all dialog TextViews */
    fun setDialogTextColor(hexCode: String) {
        this.findViewById<TextView>(R.id.tv_text1).setTextColor(Color.parseColor(hexCode))
        this.findViewById<TextView>(R.id.tv_text2).setTextColor(Color.parseColor(hexCode))
        this.findViewById<TextView>(R.id.tv_text3).setTextColor(Color.parseColor(hexCode))
        this.findViewById<TextView>(R.id.tv_text4).setTextColor(Color.parseColor(hexCode))
    }
    fun setDialogTextColor(colorCode: Int) {
        this.findViewById<TextView>(R.id.tv_text1).setTextColor(colorCode)
        this.findViewById<TextView>(R.id.tv_text2).setTextColor(colorCode)
        this.findViewById<TextView>(R.id.tv_text3).setTextColor(colorCode)
        this.findViewById<TextView>(R.id.tv_text4).setTextColor(colorCode)
    }

    /***********************
    *** BUTTON FUNCTIONS ***
    ***********************/

    /** <! Set call button text */
    fun setCallButtonText(text: String) {
        this.findViewById<MaterialButton>(R.id.btn_call).setText(text)
    }
    /** <! Set call button text color */
    fun setCallButtonTextColor(hexCode: String) {
        this.findViewById<MaterialButton>(R.id.btn_call).setTextColor(Color.parseColor(hexCode))
    } /** Using hex code to set color */
    fun setCallButtonTextColor(colorCode: Int) {
        this.findViewById<MaterialButton>(R.id.btn_call).setTextColor(colorCode)
    } /** Using ContextCompat.getColor() to set color */
    /** <! Set call button background color */
    fun setCallButtonColor(hexCode: String) {
        this.findViewById<MaterialButton>(R.id.btn_call).setBackgroundColor(Color.parseColor(hexCode))
    } /** Using hex code to set color */
    fun setCallButtonColor(colorCode: Int) {
        this.findViewById<MaterialButton>(R.id.btn_call).setBackgroundColor(colorCode)
    } /** Using ContextCompat.getColor() to set color */
    /** <! Set call button onClickListener() */
    fun setCallButtonOnClickListener(listener: View.OnClickListener) {
        this.findViewById<MaterialButton>(R.id.btn_call).setOnClickListener(listener)
    }
    /** <! Hide/Show call button */
    fun hideCallButton() {
        this.findViewById<MaterialButton>(R.id.btn_call).visibility = View.GONE
    }
    fun showCallButton() {
        this.findViewById<MaterialButton>(R.id.btn_call).visibility = View.VISIBLE
    }
    /** <! Set call button clickable */
    fun setCallButtonClickable(isClickable: Boolean) {
        this.findViewById<MaterialButton>(R.id.btn_call).isClickable = isClickable
    }
    /** <! Set call button icon resource */
    fun setCallButtonIconResource(resourceID: Int) {
        this.findViewById<MaterialButton>(R.id.btn_call).setIconResource(resourceID)
    }
    fun setCallButtonIconDrawable(drawable: Drawable?) {
        this.findViewById<MaterialButton>(R.id.btn_call).icon = drawable
    }
    /** <! Set call button icon resource color */
    fun setCallButtonIconColor(hexCode: String) {
        this.findViewById<MaterialButton>(R.id.btn_call).icon.setTint(Color.parseColor(hexCode))
    }
    fun setCallButtonIconColor(colorCode: Int) {
        this.findViewById<MaterialButton>(R.id.btn_call).icon.setTint(colorCode)
    }

    /** <! Set cancel button text */
    fun setCancelButtonText(text: String) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setText(text)
    }
    /** <! Set cancel button text color */
    fun setCancelButtonTextColor(hexCode: String) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setTextColor(Color.parseColor(hexCode))
    } /** Using hex code to set color */
    fun setCancelButtonTextColor(colorCode: Int) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setTextColor(colorCode)
    } /** Using ContextCompat.getColor() to set color */
    /** <! Set cancel button background color */
    fun setCancelButtonColor(hexCode: String) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setBackgroundColor(Color.parseColor(hexCode))
    } /** Using hex code to set color */
    fun setCancelButtonColor(colorCode: Int) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setBackgroundColor(colorCode)
    } /** Using ContextCompat.getColor() to set color */
    /** <! Set cancel button OnClickListener() */
    fun setCancelButtonOnClickListener(listener: View.OnClickListener) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setOnClickListener(listener)
    }
    /** <! Hide/Show cancel button */
    fun hideCancelButton() {
        this.findViewById<MaterialButton>(R.id.btn_cancel).visibility = View.GONE
    }
    fun showCancelButton() {
        this.findViewById<MaterialButton>(R.id.btn_cancel).visibility = View.VISIBLE
    }
    /** <! Set cancel button clickable */
    fun setCancelButtonClickable(isClickable: Boolean) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).isClickable = isClickable
    }

    /**********************************
    *** CIRCLE IMAGE VIEW FUNCTIONS ***
    **********************************/

    /** <! Set Image size on dialog */
    @SuppressLint("CutPasteId")
    fun setImageSize(size: Int) {
        val scale: Float = context.resources.displayMetrics.density
        val size_px: Int = ((size * scale + 0.5f).toInt())
        this.findViewById<RelativeLayout>(R.id.rl_image_root).layoutParams.width = size_px
        this.findViewById<RelativeLayout>(R.id.rl_image_root).layoutParams.height = size_px
        val cardView = this.findViewById<CardView>(R.id.cv_main_cardview)
        val cv_params = (cardView.layoutParams as ViewGroup.MarginLayoutParams).apply { topMargin = size_px/2 }
        cardView.layoutParams = cv_params
        val ll_data = this.findViewById<LinearLayout>(R.id.ll_data)
        val ll_params = (ll_data.layoutParams as ViewGroup.MarginLayoutParams).apply { topMargin = size_px/2 }
        ll_data.layoutParams = ll_params
    }
    /** <! Set CircleImageView stroke color */
    fun setImageStrokeColor(hexCode: String) {
        this.findViewById<RelativeLayout>(R.id.rl_image_root).background.setTint(Color.parseColor(hexCode))
    } /** Using hex code to set color */
    fun setImageStrokeColor(colorCode: Int) {
        this.findViewById<RelativeLayout>(R.id.rl_image_root).background.setTint(colorCode)
    } /** Using ContextCompat.getColor() to set color */

    /************************
    *** DIALOG BACKGROUND ****
    *************************/

    /** <! Set dialog background color */
    fun setDialogBackground(hexCode: String) {
        this.findViewById<CardView>(R.id.cv_main_cardview).setCardBackgroundColor(Color.parseColor(hexCode))
    } /** Using hex code to set color */
    fun setDialogBackground(colorCode: Int) {
        this.findViewById<CardView>(R.id.cv_main_cardview).setCardBackgroundColor(colorCode)
    } /** Using ContextCompat.getColor() to set color */










}