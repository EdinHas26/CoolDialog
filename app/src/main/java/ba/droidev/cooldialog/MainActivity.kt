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
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: MaterialButton = findViewById<MaterialButton>(R.id.btn_open_dialog)
        button.setOnClickListener{
            val coolDialog = CoolDialog(this)
            coolDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            coolDialog.requestContentView()
            coolDialog.setCanceledOnTouchOutside(false)
            val dialogWindow = coolDialog.window
            dialogWindow?.setLayout(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT)

            coolDialog.setTextToAll("Edin Hasanović", "edin.hasanovic@sourecode.ba", "+38762484877", "Slavinovići bb")
            coolDialog.setImageSize(150)
            coolDialog.setImageResource(R.drawable.profile_picture)
            coolDialog.setCallButtonIconResource(R.drawable.ic_baseline)
            coolDialog.setCallButtonIconColor(R.color.purple_200)
            coolDialog.setCallButtonText("View profile")

            coolDialog.show()
        }
    }
}