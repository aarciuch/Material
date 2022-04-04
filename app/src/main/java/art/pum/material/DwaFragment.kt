package art.pum.material

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import art.pum.material.databinding.FragmentDwaBinding
import art.pum.material.databinding.FragmentJedenBinding


class DwaFragment : Fragment() {

    private lateinit var binding: FragmentDwaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dwa,
            container, false)

        return binding.root
    }


}