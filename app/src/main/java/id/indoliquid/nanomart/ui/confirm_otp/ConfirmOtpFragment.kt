package id.indoliquid.nanomart.ui.confirm_otp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class ConfirmOtpFragment : Fragment() {

    companion object {
        fun newInstance() = ConfirmOtpFragment()
    }

    private lateinit var viewModel: ConfirmOtpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.confirm_otp_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ConfirmOtpViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
