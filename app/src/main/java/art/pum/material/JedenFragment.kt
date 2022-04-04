package art.pum.material

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import art.pum.material.databinding.ActivityMainBinding
import art.pum.material.databinding.FragmentJedenBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import java.util.*


class JedenFragment : Fragment() {

    private lateinit var binding: FragmentJedenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_jeden,
            container, false)

        setHasOptionsMenu(true)

        binding.bGoTo2.setOnClickListener {
            findNavController().navigate(R.id.action_jedenFragment_to_dwaFragment)
        }

        binding.floatingActionButton.setOnClickListener {
           Snackbar.make(it, "Pokaż dialog", Snackbar.LENGTH_INDEFINITE).apply {
               setAction("Dialog", View.OnClickListener { pokazDialog() })
               show()
           }
        }

        binding.outlinedButton.setOnClickListener {
            binding.textView.text = binding.t1.text.toString()
        }

        return binding.root
    }

    private fun pokazDialog() {
        context?.let {
            MaterialAlertDialogBuilder(it)
                .setTitle("Tytuł")
                .setMessage("Tekst")
                .setNeutralButton("Cancel") { dialog, which ->
                    // Respond to neutral button press
                }
                .setNegativeButton("decline") { dialog, which ->
                    // Respond to negative button press
                }
                .setPositiveButton("Accept") { dialog, which ->
                    // Respond to positive button press
                }
                .show()
        }
    }
}