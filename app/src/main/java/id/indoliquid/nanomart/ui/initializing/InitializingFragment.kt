package id.indoliquid.nanomart.ui.initializing

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class InitializingFragment : Fragment() {

    companion object {
        fun newInstance() = InitializingFragment()
    }

    private lateinit var viewModel: InitializingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.initializing_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InitializingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
