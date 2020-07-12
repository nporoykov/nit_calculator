package com.example.company.myapplication

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.lang.Exception
import java.net.URL
import javax.net.ssl.HttpsURLConnection



class MainActivity : AppCompatActivity() {

    private suspend fun checkCode(url:String):String{
      //  val result = withContext()
        Log.d("url_pered","params[0] = $url")
        var code:String
        try {
            var connection: HttpsURLConnection? = URL(url).openConnection() as HttpsURLConnection?
            connection?.connect()
            code = connection?.responseCode.toString()
            Log.d("url_pered", "code = $code")
        }catch (e:Exception){
            code="no connection"
        }
        return code.toString()
    }

  /*  inner class HTTPAsyncTask: AsyncTask<String, Void, String>() {
        override fun doInBackground(vararg params: String): String? {
            return checkCode(params[0])
        }
        override fun onPostExecute(result: String?) {
            textView.text = result.toString()
        }
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            CoroutineScope(IO).launch {
                
            }



         //   HTTPAsyncTask().execute(editText.text.toString())
        //val status=ContextCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH)

      /*  if(status==PackageManager.PERMISSION_GRANTED){
            textView.text="априори дадено разрешение $status"
        }
        else{
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.BLUETOOTH), REQ_CODE)
        } */


        }


       /* spinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

        }*/

     /*   gridView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position).toString()
            textView.setText(selectedItem +" is selected.")

           val beforeName:String = adapter.getItem(position)
           // val changedName:String = beforeName.getItemName().toString().concat("(chosen)");
            val row:Int=(id.toInt()/gridView.numColumns)+1
            val col:Int=(id.toInt()%gridView.numColumns)+1

            adapter.remove(selectedItem);
            adapter.insert("выбрали $row, $col", position); */
           // adapter.notifyDataSetChanged();


     /*   textView.text=seekBar.progress.toString()

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
              if (progress in 1..20){
                    textView.text=progress.toString()
                    val demoData = MutableList(progress, {x-> "Item ${x.toDouble().pow(2.0)}"})
                    val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, demoData)
                    listView1.adapter = adapter
                }
                else{
                    textView.text=progress.toString()
                  val demoData = MutableList(progress, {x-> "Item ${x.toDouble().pow(2.0)}"})
                  val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, demoData)
                  listView1.adapter = adapter
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Do something
             //   Toast.makeText(applicationContext,"start tracking",Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Do something
            //    Toast.makeText(applicationContext,"stop tracking",Toast.LENGTH_SHORT).show()
            }

        }) */

        /*listView1.setOnItemClickListener { parent, view, position, id ->
            val myIntent=Intent(this, SecondActivity::class.java)
            myIntent.putExtra("tuda", id.toString())
            startActivity(myIntent)
        }*/


    /*    button.setOnClickListener{
            val myIntent=Intent(this, SecondActivity::class.java)
            myIntent.putExtra("tuda", editText.text.toString())
            Log.d("acttext","передн туда = ${editText.text.toString()}")
            startActivityForResult(myIntent, 1)
        }*/
    } /// onCreate

   /* override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            if (data != null) {
                Log.d("acttext","передн оттуда = ${data.getStringExtra("ottuda")}")
                editText.setText("")
                textView.text = data.getStringExtra("ottuda")
            }
    } */


  /*  override fun onResume() {
        super.onResume()
        editText.setText("")
     override fun

        //Log.d("acttext","передн оттуда = ${intent.getStringExtra("pered")}")
        //textView.text = intent.getStringExtra("pered")
    } */

  /*  override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when(requestCode){
            REQ_CODE-> {
                if(grantResults.size>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    textView.text="дадено разрешение $grantResults[0]"
                }
            }
        }
    }*/
}
