package sanaebadi.info.allinonenavigationjetpack.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.main_fragment.*
import sanaebadi.info.allinonenavigationjetpack.R
import sanaebadi.info.allinonenavigationjetpack.ui.main.MainViewModel

class MainFragment : androidx.fragment.app.Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txt_app_name.text=arguments?.getString("NameApp")

        btn_next.setOnClickListener {
            view.findNavController().navigate(R.id.to_personal)
        }

        btn_skip.setOnClickListener {
            view.findNavController().navigate(R.id.main_to_skip)
        }
    }
}
