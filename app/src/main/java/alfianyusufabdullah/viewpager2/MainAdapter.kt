package alfianyusufabdullah.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val texts: List<String>, private val action: () -> Unit) :
    RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager, parent, false)
        return MainHolder(view)
    }

    override fun getItemCount() = texts.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) =
        holder.bind(texts[position], action)

    class MainHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val itemTextMain = view.findViewById<TextView>(R.id.itemTextMain)
        private val itemChangeOrientation = view.findViewById<Button>(R.id.itemChangeOrientation)

        fun bind(text: String, action: () -> Unit) {
            itemTextMain.text = text
            itemChangeOrientation.setOnClickListener { action() }
        }
    }
}