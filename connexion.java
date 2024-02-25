public class MainActivity extends AppCompatActivity {

    private EditText editTextIdentifiant;
    private EditText editTextMotdepasse;
    private Button buttonConnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextIdentifiant = findViewById(R.id.editText_identifiant);
        editTextMotdepasse = findViewById(R.id.editText_motdepasse);
        buttonConnexion = findViewById(R.id.button_connexion);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String identifiant = editTextIdentifiant.getText().toString();
                String motdepasse = editTextMotdepasse.getText().toString();

                // TODO: Vérifier l'identifiant et le mot de passe

                if (identifiant.equals("admin") && motdepasse.equals("password")) {
                    // Ouvrir l'activité suivante
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else {
                    // Afficher un message d'erreur
                    Toast.makeText(MainActivity.this, "Identifiant ou mot de passe incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
