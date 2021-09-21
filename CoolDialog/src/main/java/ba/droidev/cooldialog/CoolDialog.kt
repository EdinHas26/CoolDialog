package ba.droidev.cooldialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton
import de.hdodenhof.circleimageview.CircleImageView
import java.lang.Exception

open class Dialog(context: Context)
class CoolDialog(context: Context): Dialog(context) {

    //Override setContentView so its always set to R.layout.dialog_layout
    override fun setContentView(layoutResID: Int) {
        super.setContentView(R.layout.dialog_layout)
    }

    //Call this function to request content view and set it to R.layout.dialog_layout
    fun requestContentView() {
        setContentView(R.layout.dialog_layout)
    }

    //set image resource by resource id
    fun setImageResource(id: Int) {
        try {
            this.findViewById<ImageView>(R.id.iv_circle_image).setImageResource(id)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

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

    //get root layout of the dialog layout
    fun getRootLayout() : RelativeLayout {
        val relativeLayout: RelativeLayout = this.findViewById(R.id.rl_root)
        return relativeLayout
    }

    //set text on the first TextView in the layout
    fun setTextOnFirstTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text1).setText(text)
    }
    //set text on the second TextView in the layout
    fun setTextOnSecondTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text2).setText(text)
    }
    //set text on the third TextView in the layout
    fun setTextOnThirdTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text3).setText(text)
    }
    //set text on the fourth TextView in the layout
    fun setTextOnFourthTextView(text: String) {
        this.findViewById<TextView>(R.id.tv_text4).setText(text)
    }
    //set text on all TextView's in the layout
    fun setTextToAll(text: String, text2: String, text3: String, text4: String) {

        this.findViewById<TextView>(R.id.tv_text1).setText(text)
        this.findViewById<TextView>(R.id.tv_text2).setText(text2)
        this.findViewById<TextView>(R.id.tv_text3).setText(text3)
        this.findViewById<TextView>(R.id.tv_text4).setText(text4)
    }

    //Set text for CallButton
    fun setCallButtonText(text: String) {
        this.findViewById<MaterialButton>(R.id.btn_call).setText(text)
    }

    //Set ClickListener for CallButton
    fun setCallButtonOnClickListener(listener: View.OnClickListener) {
        this.findViewById<MaterialButton>(R.id.btn_call).setOnClickListener(listener)
    }

    //Set text for CancelButton
    fun setCancelButtonText(text: String) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setText(text)
    }

    //Set ClickListener for CancelButton
    fun setCancelButtonOnClickListener(listener: View.OnClickListener) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).setOnClickListener(listener)
    }

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

    fun hideCallButton() {
        this.findViewById<MaterialButton>(R.id.btn_call).visibility = View.GONE
    }

    fun hideCancelButton() {
        this.findViewById<MaterialButton>(R.id.btn_cancel).visibility = View.GONE
    }

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

    fun showCallButton() {
        this.findViewById<MaterialButton>(R.id.btn_call).visibility = View.VISIBLE
    }

    fun showCancelButton() {
        this.findViewById<MaterialButton>(R.id.btn_cancel).visibility = View.VISIBLE
    }

    fun setCallButtonClickable(isClickable: Boolean) {
        this.findViewById<MaterialButton>(R.id.btn_call).isClickable = isClickable
    }

    fun setCancelButtonClickable(isClickable: Boolean) {
        this.findViewById<MaterialButton>(R.id.btn_cancel).isClickable = isClickable
    }

    fun setCallButtonIconResource(resourceID: Int) {
        this.findViewById<MaterialButton>(R.id.btn_call).setIconResource(resourceID)
    }

    fun setCallButtonIconDrawable(drawable: Drawable?) {
        this.findViewById<MaterialButton>(R.id.btn_call).icon = drawable
    }

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

    fun getCallButtonView(): MaterialButton {
        return this.findViewById(R.id.btn_call)
    }

    fun getCancelButtonView(): MaterialButton {
        return this.findViewById(R.id.btn_cancel)
    }
}