package ar.com.bhstudio.activitiespermisoslists.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ar.com.bhstudio.activitiespermisoslists.R
import ar.com.bhstudio.activitiespermisoslists.adapters.PersonAdapter
import ar.com.bhstudio.activitiespermisoslists.models.Person
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter: PersonAdapter
    private lateinit var personList: List<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        personList= getPersons()
        adapter = PersonAdapter(this, R.layout.row_list_view_person, personList)
        listView.adapter =adapter
    }

    private fun getPersons(): List<Person> {
        return listOf(
                Person("Alejandro", "Lora", 27),
                Person("Fernando", "Vega", 37),
                Person("Alicia", "Gómez", 19),
                Person("Paula", "Escobar", 33),
                Person("Alberto", "Parada", 22)
        )
    }
}
