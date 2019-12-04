package id.indoliquid.nanomart.ui.thank_you

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.indoliquid.nanomart.R

class ThankYouFragment : Fragment() {

    companion object {
        fun newInstance() = ThankYouFragment()
    }

    private lateinit var viewModel: ThankYouViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.thank_you_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ThankYouViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
