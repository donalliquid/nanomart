package id.indoliquid.nanomart.ui.calculating

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class CalculatingFragment : Fragment() {

    companion object {
        fun newInstance() = CalculatingFragment()
    }

    private lateinit var viewModel: CalculatingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.calculating_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CalculatingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
