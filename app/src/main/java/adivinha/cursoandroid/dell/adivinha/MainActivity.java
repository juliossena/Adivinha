package adivinha.cursoandroid.dell.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botao_jogar_id);
        textoResultado = (TextView) findViewById(R.id.resultado_id);

        //textoResultado.setText("Texto Alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int numeroAleatorio = r.nextInt(10);

                textoResultado.setText("número escolhido: " + numeroAleatorio);
            }
        });
    }
}
