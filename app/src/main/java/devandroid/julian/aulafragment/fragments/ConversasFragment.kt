package devandroid.julian.aulafragment.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import devandroid.julian.aulafragment.R

class ConversasFragment : Fragment() {

    private lateinit var editNome: EditText
    private lateinit var btnExecutar: Button
    private lateinit var textResultado: TextView
    private lateinit var textConversas: TextView
    private var nome: String? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "Fragment onCreate")

        nome = arguments?.getString("nome")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida", "Fragment onCreateView")
        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )


        textConversas = view.findViewById(R.id.textConversas)
        editNome = view.findViewById(R.id.edit_nome)
        btnExecutar = view.findViewById(R.id.btn_executar)
        textResultado = view.findViewById(R.id.text_resultado)

        textConversas.text = arguments?.getString("categoria") ?: "Nulo"
        textResultado.text = nome
        textResultado.visibility = View.VISIBLE

        btnExecutar.setOnClickListener{

            textResultado.text = editNome.text.toString()
            textResultado.visibility = View.VISIBLE

        }

        //Processamento da visualização

        return view
    }

    /* Depreciado
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo_vida", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo_vida", "Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo_vida", "Fragment onDetach")
    }

}