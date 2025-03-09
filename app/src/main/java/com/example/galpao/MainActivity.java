package com.example.galpao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Galpao galpao;
    private EditText prateleiraEditText, ladoEditText, tipoProjetoEditText, anoEditText, filtroTipoProjetoEditText, filtroAnoEditText, descricaoEditText;
    private Button adicionarButton, buscarButton;
    private TextView resultadosTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        galpao = new Galpao(20);

        prateleiraEditText = findViewById(R.id.prateleiraEditText);
        ladoEditText = findViewById(R.id.ladoEditText);
        tipoProjetoEditText = findViewById(R.id.tipoProjetoEditText);
        anoEditText = findViewById(R.id.anoEditText);
        filtroTipoProjetoEditText = findViewById(R.id.filtroTipoProjetoEditText);
        filtroAnoEditText = findViewById(R.id.filtroAnoEditText);
        descricaoEditText = findViewById(R.id.descricaoEditText);
        adicionarButton = findViewById(R.id.adicionarButton);
        buscarButton = findViewById(R.id.buscarButton);
        resultadosTextView = findViewById(R.id.resultadosTextView);

        adicionarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionarContainer();
            }
        });

        buscarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarContainers();
            }
        });
    }

    private void adicionarContainer() {
        int prateleira = Integer.parseInt(prateleiraEditText.getText().toString());
        String lado = ladoEditText.getText().toString().toUpperCase();
        String tipoProjeto = tipoProjetoEditText.getText().toString();
        int ano = Integer.parseInt(anoEditText.getText().toString());
        String descricao = descricaoEditText.getText().toString();

        Container container = new Container(tipoProjeto, ano, descricao);
        Prateleira prateleiraObj = galpao.getPrateleira(prateleira - 1);

        if (prateleiraObj != null) {
            if (lado.equals("A")) {
                prateleiraObj.getLadoA().adicionarContainer(container);
            } else if (lado.equals("B")) {
                prateleiraObj.getLadoB().adicionarContainer(container);
            }
            resultadosTextView.setText("Contêiner adicionado!");
        } else {
            resultadosTextView.setText("Prateleira inválida.");
        }
    }

    private void buscarContainers() {
        String filtroTipoProjeto = filtroTipoProjetoEditText.getText().toString();
        int filtroAno = Integer.parseInt(filtroAnoEditText.getText().toString());

        StringBuilder resultadoTexto = new StringBuilder();
        boolean encontrado = false; // Adiciona uma variável para verificar se encontrou algum resultado

        for (int i = 0; i < 20; i++) {
            Prateleira prateleira = galpao.getPrateleira(i);
            if (prateleira != null) {
                for (Container container : prateleira.getLadoA().getContainers()) {
                    if (container.getTipoProjeto().equalsIgnoreCase(filtroTipoProjeto) && container.getAno() == filtroAno) {
                        resultadoTexto.append("Prateleira ").append(i + 1).append(" Lado A: ").append(container.toString()).append("\n");
                        encontrado = true;
                    }
                }
                for (Container container : prateleira.getLadoB().getContainers()) {
                    if (container.getTipoProjeto().equalsIgnoreCase(filtroTipoProjeto) && container.getAno() == filtroAno) {
                        resultadoTexto.append("Prateleira ").append(i + 1).append(" Lado B: ").append(container.toString()).append("\n");
                        encontrado = true;
                    }
                }
            }
        }

        if (!encontrado) {
            resultadoTexto.append("Nenhum resultado encontrado.");
        }

        resultadosTextView.setText(resultadoTexto.toString());
    }
}