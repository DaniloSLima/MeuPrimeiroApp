package br.usjt.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    /** Constante static para identificar a mensagem
     * Danilo de Souza Lima RA:816114969
     */
    //private EditText editText;
    public final static String EXTRA_MESSAGE =
            "br.usjt.meuprimeiroapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Será chamado quando o usuário clicar em Enviar
     * Danilo de Souza Lima RA:816114969
     */
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
