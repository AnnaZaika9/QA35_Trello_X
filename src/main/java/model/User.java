package model;

public class User {


        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public model.User withEmail(String email) {
            this.email = email;
            return this;
        }

        public model.User withPassword(String password) {
            this.password = password;
            return this;
        }
}
