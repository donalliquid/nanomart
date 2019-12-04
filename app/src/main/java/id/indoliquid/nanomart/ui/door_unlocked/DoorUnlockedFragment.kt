package id.indoliquid.nanomart.ui.door_unlocked

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class DoorUnlockedFragment : Fragment() {

    companion object {
        fun newInstance() = DoorUnlockedFragment()
    }

    private lateinit var viewModel: DoorUnlockedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.door_unlocked_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DoorUnlockedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
