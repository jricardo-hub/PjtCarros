package impacta.com.br.pjtcarros.activities

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("Registered")

open class BaseActivity : AppCompatActivity() {
    protected  val context : Context get() = this
}