package com.example.crimeintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.crimeintent.databinding.ActivityMainBinding;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.btnDate.setOnClickListener(view -> {
            DialogFragment dialogFragment=new DatePickerFragment();
            dialogFragment.show(getSupportFragmentManager(),"datePicker");

        });
        final Calendar a= Calendar.getInstance();
        int year=a.get(Calendar.YEAR);
        int month =a.get(Calendar.MONTH);
        int day=a.get(Calendar.DAY_OF_MONTH);
        int min=a.get(Calendar.MINUTE);
        int hour=a.get(Calendar.HOUR_OF_DAY);

        String month_string=Integer.toString(month+1);
        String day_string=Integer.toString(day);
        String year_string=Integer.toString(year);
        String min_string=Integer.toString(min);
        String hour_string=Integer.toString(hour);

        String dateMessage1=(month_string+"/"+day_string+"/"+year_string+"    "+hour_string+":"+min_string);
        binding.btnDate.setText(dateMessage1);




    }

    public void processDatePickerResult(int year,int month,int day){
        String month_string=Integer.toString(month+1);
        String day_string=Integer.toString(day);
        String year_string=Integer.toString(year);


        String dateMessage=(month_string+"/"+day_string+"/"+year_string);
        binding.btnDate.setText(dateMessage);
//        Toast.makeText(this,"date"+dateMessage,Toast.LENGTH_SHORT).show();

    }









//    public  void  showDatePicker(View view){
//        DialogFragment newFragment =new DatePickerFragment();
//        newFragment.show(getSupportFragmentManager(),"datePicker");
//    }
}