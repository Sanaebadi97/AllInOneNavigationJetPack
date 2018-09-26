package sanaebadi.info.allinonenavigationjetpack.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_pumped_up.*
import kotlinx.android.synthetic.main.fragment_skip.*
import sanaebadi.info.allinonenavigationjetpack.R


class SkipFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skip, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_start.setOnClickListener {

            val nameBundle = Bundle()
            nameBundle.putString("NameApp", getString(R.string.name_app))

            it.findNavController().navigate(R.id.skip_to_main, nameBundle)
        }


    }
}
