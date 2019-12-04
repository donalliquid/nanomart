package id.indoliquid.nanomart.ui.no_item_takenout

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class NoItemTakenOutFragment : Fragment() {

    companion object {
        fun newInstance() = NoItemTakenOutFragment()
    }

    private lateinit var viewModel: NoItemTakenOutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.no_item_taken_out_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NoItemTakenOutViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
