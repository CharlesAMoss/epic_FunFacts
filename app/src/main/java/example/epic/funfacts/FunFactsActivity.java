package example.epic.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] facts = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can see through time.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an adult you will have 206.",
                        "It takes about 8 minutes for light from the Sun to reach Earth.",
                        "Some bamboo plants can grow almost a meter in just one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid was being built." };

                // The button is clicked, so update the fact label with a new fact
                String fact = "";

                // Randomly select a fact
                Random randomGenerator = new Random(); // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(facts.length);
                //Convert the randomNumber to a text fact

                fact = facts[randomNumber];

                // Update the lable with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

    }
}