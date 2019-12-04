package id.indoliquid.nanomart.ui.face_auth_failed

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class FaceAuthFailedFragment : Fragment() {

    companion object {
        fun newInstance() = FaceAuthFailedFragment()
    }

    private lateinit var viewModel: FaceAuthFailedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.face_auth_failed_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FaceAuthFailedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
