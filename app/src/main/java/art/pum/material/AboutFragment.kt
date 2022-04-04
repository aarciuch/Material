package art.pum.material

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import art.pum.material.databinding.FragmentAboutBinding
import art.pum.material.databinding.FragmentJedenBinding


class AboutFragment : Fragment() {


    private lateinit var binding: FragmentAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about,
            container, false)

        return binding.root
    }


}