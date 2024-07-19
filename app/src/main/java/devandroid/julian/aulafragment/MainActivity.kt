package devandroid.julian.aulafragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import devandroid.julian.aulafragment.fragments.ChamadasFragment
import devandroid.julian.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("ciclo_vida", "Activity onCreate")

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        /*val fragmentManager = supportFragmentManager.beginTransaction()

        //Diversas alterações em fragments
        fragmentManager.add( R.id.fragment_conteudo, ConversasFragment() )

        fragmentManager.commit()*/
        btnConversas.setOnClickListener {
//            val conversasFragment = ConversasFragment()

            val bundle = bundleOf(
                "categoria" to "CONVERSAS",
                "nome" to "Login App"
            )

//            conversasFragment.arguments = bundle


            supportFragmentManager.commit {
                replace<ConversasFragment>(
                    R.id.fragment_conteudo,
                    args = bundle
                )
            }
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, ChamadasFragment()  )
                //.remove( conversasFragment )
                .commit()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Activity onStop")
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "Activity onDestroy")
        super.onDestroy()
    }

}