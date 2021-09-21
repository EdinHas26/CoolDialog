package ba.droidev.cooldialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.AbsListView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: MaterialButton = findViewById<MaterialButton>(R.id.btn_open_dialog)
        button.setOnClickListener{
            val dialog: CoolDialog = CoolDialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.requestContentView()
            val dialog_window = dialog.window
            dialog_window?.setLayout(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelButtonOnClickListener(View.OnClickListener { dialog.dismiss() })
            dialog.setCallButtonOnClickListener(View.OnClickListener { Toast.makeText(baseContext, "CALL BUTTON CLICKED", Toast.LENGTH_LONG).show() })
            dialog.setTextToAll("Annie Fox", "annie.fox@droidev.com", "812-913-7452", "New Jersey, NY, USA")
            dialog.setImageResource("https://torange.biz/photofxnew/76/HD/lion-profile-picture-76801.jpg")
            dialog.setImageSize(170)

            val textView: TextView = dialog.getFirstTextView()
            textView.textSize = 20f

            dialog.show()
        }
    }
}