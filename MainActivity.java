package com.example.androidapptwo1;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends Activity {
Context context;
CharSequence text;
int duration;
Toast toast;
String check_box = "";
String radio_button ="One";
String toggle_button = "Off";
String rating_bar = "0.0";
String edit_text = "";
boolean fruit = false;
boolean meat = false;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
context = getApplicationContext();
duration = Toast.LENGTH_SHORT;
Button btn_text = (Button) findViewById(R.id.btn_txt);
btn_text.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View v) {
// TODO Auto-generated method stub
text = "You Clicked Text Button";
toast = Toast.makeText(context, text, duration);
toast.show();} });
RatingBar ratingBar = (RatingBar) findViewById(R.id.rbar_star);
ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
@Override
public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
// TODO Auto-generated method stub
rating_bar = String.valueOf(rating);
}
});
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.main, menu);
return true;
}
public void doButtonTextImage(View v){
text = "You Clicked Image Text Button";
toast = Toast.makeText(context, text, duration);
toast.show();
}
public void doImageButton(View v){
text = "You Clicked Image Button";
toast = Toast.makeText(context, text, duration);
toast.show();
}
public void doCheckBox(View v){
boolean checked = ((CheckBox)v).isChecked();
switch(v.getId()){
case R.id.cbx_fruit:
if(checked){
fruit = true;
} else {
fruit = false;
}
break;
case R.id.cbx_meat:
if(checked){
meat = true;
} else {
meat = false;
}
break;
}
if(fruit && meat){
check_box = "Fruit and Meat";
} else if(fruit){
check_box = "Fruit";
} else if(meat){
check_box = "Meat";
} else {
check_box = "No Selection";
}
}
public void doRadioButton(View v){
boolean checked = ((RadioButton)v).isChecked();
switch(v.getId()){
case R.id.rbtn_one:
if(checked)
radio_button = "One";
break;
case R.id.rbtn_two:
radio_button = "Two";
break;
case R.id.rbtn_three:
radio_button = "Three";
break;
}
}
public void doToggleButton(View v){
boolean on = ((ToggleButton) v).isChecked();
if(on){
toggle_button = "On";
} else {
toggle_button = "Off";} }
public void doButton(View v){
EditText etxt_msg = (EditText) findViewById(R.id.etxt_msg);
edit_text = etxt_msg.getText().toString();
text = "Check Box: " + check_box + "\n";
text = text.toString() + "Radio Button: " + radio_button + "\n";
text = text.toString() + "Toggle Button: " + toggle_button + "\n";
text = text.toString() + "Rating Bar: " + rating_bar + "\n";
text = text.toString() + "Edit Text: ";
text = text.toString() + edit_text;
toast = Toast.makeText(context, text, duration);
toast.show();
}
};

