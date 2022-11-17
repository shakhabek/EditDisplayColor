package mrsh.shakha.editdisplaycolor.fragments


import android.os.Bundle
import android.provider.CalendarContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import mrsh.shakha.editdisplaycolor.Colors
import mrsh.shakha.editdisplaycolor.R


class BlankFragment2 : Fragment() {
    private lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        root = inflater.inflate(R.layout.fragment_blank2, container, false)


        root.findViewById<Button>(R.id.btn_green)
            .setOnClickListener {
                Colors.color = root.findViewById<Button>(R.id.btn_green).background
            }

        root.findViewById<Button>(R.id.btn_purple_200)
            .setOnClickListener {
                Colors.color = root.findViewById<Button>(R.id.btn_purple_200).background
            }

        root.findViewById<Button>(R.id.btn_black)
            .setOnClickListener {
                Colors.color = root.findViewById<Button>(R.id.btn_black).background
            }

        root.findViewById<Button>(R.id.btn_purple_500)
            .setOnClickListener {
                Colors.color = root.findViewById<Button>(R.id.btn_purple_500).background
            }

        root.findViewById<Button>(R.id.btn_purple_700)
            .setOnClickListener {
                Colors.color = root.findViewById<Button>(R.id.btn_purple_700).background
            }

        root.findViewById<Button>(R.id.btn_yellow)
            .setOnClickListener {
                Colors.color = root.findViewById<Button>(R.id.btn_yellow).background
            }



        root.findViewById<Button>(R.id.btn_save)
            .setOnClickListener {
                val blankFragment = BlankFragment()
                val manager = parentFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.my_container , blankFragment)
                transaction.commit()
            }

        return root

    }

}
