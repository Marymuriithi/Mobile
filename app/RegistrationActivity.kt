
import ...

class RegistrationActivity : android.support.v7.app.AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundl){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin.setOnClickListener{
            var firstName = etFirstName.text.toString()
            var lastName = etLastName.text.toString()
            var email = etEmail.text.toString()
            var phoneNumber = etPhoneNumber.text.toString()
            var password = etPassword.text.toString()
            var passwordConfirmation = etPasswordConfirmatio.text.toString()
    }
}