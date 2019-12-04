package id.indoliquid.nanomart.ui.enter_phone_number

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class enterPhoneNumberFragment : Fragment() {

    companion object {
        fun newInstance() = enterPhoneNumberFragment()
    }

    private lateinit var viewModel: EnterPhoneNumberViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.enter_phone_number_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EnterPhoneNumberViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
