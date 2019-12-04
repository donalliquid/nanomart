package id.indoliquid.nanomart.ui.stand_by

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class StandByFragment : Fragment() {

    companion object {
        fun newInstance() = StandByFragment()
    }

    private lateinit var viewModel: StandByViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.stand_by_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StandByViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
