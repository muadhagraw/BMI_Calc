package ca.yorku.bmi_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void setContentsOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputofTextFeild(int, id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString;
        return input;
    }
    public void computeBMIButtonClicked(View view){
        //get values for the editText feilds
        String textName = getInputofTextFeild(R.id.labelName);
        String textWeight = getInputofTextFeild(R.id.labelWeight);
        String textHeight = getInputofTextFeild(R.id.labelHeight);

        double weight = Double.parseDouble(textWeight);
        double height = Double.parseDouble(textHeight);
        double bmi =  weight / (height*height);

        //display bmi
        String contents = textName + "has weight" + textWeight + "has height" + textHeight;
        setContentsOfTextView(R.id.labelAnswer, contents);
    }
}
