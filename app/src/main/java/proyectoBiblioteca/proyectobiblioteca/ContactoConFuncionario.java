package proyectoBiblioteca.proyectobiblioteca;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectobiblioteca.R;

public class ContactoConFuncionario extends AppCompatActivity {
    private static final String BROKER_URL = "mqtt://androidteststiqq.cloud.shiftr.io:1883";
    private static final String CLIENT_ID = "BAMC";
    private MqttHandler mqttHandler;

    private EditText inputTopico;
    private EditText inputMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_con_funcionario);

        inputTopico = (EditText) findViewById(R.id.inputTopico);
        inputMensaje = (EditText) findViewById(R.id.inputMensaje);
        mqttHandler = new MqttHandler();
        mqttHandler.connect(BROKER_URL,CLIENT_ID,this);
        subscribeToTopic("biblioteca");
    }

    @Override
    protected void onDestroy() {
        mqttHandler.disconnect();
        super.onDestroy();

    }

    public void enviarMqtt(View v){
        if (inputTopico.length()!=0 && inputMensaje.length()!=0){
            publishMessage(inputTopico.getText().toString(), inputMensaje.getText().toString());
        }
        else {
            Toast.makeText(this, "Ambos campos deben tener datos", Toast.LENGTH_SHORT);
        }
    }

    private void publishMessage(String topic, String message){
        Toast.makeText(this, "Publishing message: " + message, Toast.LENGTH_SHORT).show();
        mqttHandler.publish(topic,message);
    }
    private void subscribeToTopic(String topic){
        Toast.makeText(this, "Subscribing to topic "+ topic, Toast.LENGTH_SHORT).show();
        mqttHandler.subscribe(topic);
    }

}