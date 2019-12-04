package id.indoliquid.nanomart.ui.close_door

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class CloseDoorFragment : Fragment() {

    companion object {
        fun newInstance() = CloseDoorFragment()
    }

    private lateinit var viewModel: CloseDoorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.close_door_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CloseDoorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
