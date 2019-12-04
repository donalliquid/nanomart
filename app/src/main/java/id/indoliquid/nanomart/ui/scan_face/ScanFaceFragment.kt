package id.indoliquid.nanomart.ui.scan_face

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class ScanFaceFragment : Fragment() {

    companion object {
        fun newInstance() = ScanFaceFragment()
    }

    private lateinit var viewModel: ScanFaceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.scan_face_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ScanFaceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
