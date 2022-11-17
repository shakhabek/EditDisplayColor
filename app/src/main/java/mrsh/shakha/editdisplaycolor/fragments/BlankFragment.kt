package mrsh.shakha.editdisplaycolor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import mrsh.shakha.editdisplaycolor.Colors
import mrsh.shakha.editdisplaycolor.R

class BlankFragment : Fragment() {

    private lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_blank, container, false)


        root.findViewById<Button>(R.id.btn_next)
            .setOnClickListener {
                val blankFragment2 = BlankFragment2()
                val manager = parentFragmentManager
                manager.beginTransaction().replace(R.id.my_container, blankFragment2)
                    .addToBackStack(blankFragment2.toString())
                    .commit()

            }

        root.findViewById<LinearLayout>(R.id.linear1).background = Colors.color

        return root
    }

}