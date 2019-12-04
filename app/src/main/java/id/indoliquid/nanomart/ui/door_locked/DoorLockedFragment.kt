package id.indoliquid.nanomart.ui.door_locked

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class DoorLockedFragment : Fragment() {

    companion object {
        fun newInstance() = DoorLockedFragment()
    }

    private lateinit var viewModel: DoorLockedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.door_locked_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DoorLockedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
