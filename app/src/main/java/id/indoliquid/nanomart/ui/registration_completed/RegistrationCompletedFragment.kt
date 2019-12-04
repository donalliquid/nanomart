package id.indoliquid.nanomart.ui.registration_completed

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class RegistrationCompletedFragment : Fragment() {

    companion object {
        fun newInstance() = RegistrationCompletedFragment()
    }

    private lateinit var viewModel: RegistrationCompletedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registration_completed_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RegistrationCompletedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
