package mr.kostua.youstillhavetimeto.ui.start.age

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import mr.kostua.youstillhavetimeto.databinding.AgeFragmentBinding
import mr.kostua.youstillhavetimeto.util.event.observeEvent
import org.koin.androidx.viewmodel.ext.android.viewModel

class AgeFragment : Fragment() {
    private val mViewModel by viewModel<AgeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = AgeFragmentBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = mViewModel
        }
        initObservers()

        return binding.root
    }

    private fun initObservers() {
        mViewModel.apply {
            observeEvent(event, ::handleEvents)
        }
    }

    private fun handleEvents(event: AgeEvents?) {

    }

}