package com.example.proyectobiblioteca;
import android.content.Context;
import android.widget.Toast;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttHandler {
        private MqttClient client;
        private String usuario = "androidteststiqq";
        private String password = "W0U2XNxCKinXaOBv";

        public void connect(String brokerUrl, String clientId) {
            try {
                // persistencia de datos
                MemoryPersistence persistence = new MemoryPersistence();
                MqttConnectOptions options = new MqttConnectOptions();
                options.setUserName(this.usuario);
                options.setPassword(this.password.toCharArray());
                // Iniciar clietne MQTT
                client = new MqttClient(brokerUrl, clientId, persistence);

                // Opciones de conexion
                MqttConnectOptions connectOptions = new MqttConnectOptions();
                connectOptions.setCleanSession(true);

                client.setCallback(new MqttCallback() {
                    @Override
                    public void connectionLost(Throwable cause) {
                        // Manejar pérdida de conexión
                    }

                    @Override
                    public void messageArrived(String topic, MqttMessage message) throws Exception {
                        // Este método se llama cuando se recibe un mensaje en el tema suscrito
                        String messageText = new String(message.getPayload());
                        // Muestra el mensaje con un Toast
                        Toast.makeText(,messageText, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void deliveryComplete(IMqttDeliveryToken token) {

                    }
                });
                // Conectar al broker
                client.connect(connectOptions);
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }

        public void disconnect() {
            try {
                client.disconnect();
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }

        public void publish(String topic, String message) {
            try {
                MqttMessage mqttMessage = new MqttMessage(message.getBytes());
                client.publish(topic, mqttMessage);
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }

        public void subscribe(String topic) {
            try {
                client.subscribe(topic);
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }

}
