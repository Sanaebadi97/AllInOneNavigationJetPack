package sanaebadi.info.allinonenavigationjetpack.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.main_fragment.*
import sanaebadi.info.allinonenavigationjetpack.R




class PersonalFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next.setOnClickListener {
            view.findNavController().navigate(R.id.to_pumped)
        }

        btn_skip.setOnClickListener {
            view.findNavController().navigate(R.id.person_to_skip)
        }
    }

}
