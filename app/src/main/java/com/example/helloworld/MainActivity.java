package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para criar uma varíavel, é preciso instaciar fazendo "CAST" que é referênciar o tipo de variavel.
        //Esses são componentes da sua activity, ou seja, você pode chamar eles assim para poder adicionar a funcionalidade aos componentes.
        // Existe esse metodo de de buscar o elemento pelo ID
        //Toda vez que for chamar um objeto, você precisa verificar se a IDE importou  lá em cima o tipo de variavel que esse objeto é.
        //TextView é o tipo para o elemento do tipo "print", ou como se fosse um elemento sendo exposto em tela.
        TextView result =(TextView)findViewById(R.id.primeiroApp);
        // EditText é o tipo para elemento INPUT Texto
        EditText inputText = (EditText)findViewById(R.id.InputText);
        //Button é o tipo para o elemento Button
        Button btInput =(Button) findViewById(R.id.btRename);
        Button btRenomear =(Button) findViewById(R.id.btRenomear);

        //Aqui estamos adicionado o mesmo que o Listener para o click no botão
    btInput.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Aqui iremos exibir uma notificação estilo toast exibindo a informação "Click no botão"
            //Primeiro você precisa referenciar o contexto, onde a notificação irá ser exibida, depois você passa um parametro para ela onde irá dizer se ela vai ser do tipo "LONG" ou "SHORT"
            //Depois chama ela para ser exibida atraves do Show()
            Toast.makeText(MainActivity.this,"Click no botão",Toast.LENGTH_SHORT).show();
        }

    });
    // Aqui estamos novamente chamando o listener para o click
    btRenomear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Aqui estamos setando o valor do texto para o campo "result", o mesmo valor que vai ter sido passado no valor "inputText"
                result.setText(inputText.getText());


        }
    });
    }
    }
