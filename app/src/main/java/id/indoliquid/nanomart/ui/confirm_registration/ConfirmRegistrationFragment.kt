package id.indoliquid.nanomart.ui.confirm_registration

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class ConfirmRegistrationFragment : Fragment() {

    companion object {
        fun newInstance() = ConfirmRegistrationFragment()
    }

    private lateinit var viewModel: ConfirmRegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.confirm_registration_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ConfirmRegistrationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
