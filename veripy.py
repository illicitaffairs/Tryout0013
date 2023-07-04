import random

# Example user database
user_database = {
    "john": {
        "password": "password123",
        "verification_code": None
    },
    "alice": {
        "password": "qwerty456",
        "verification_code": None
    },
    "bob": {
        "password": "secure789",
        "verification_code": None
    }
}

def generate_verification_code():
    """Generate a random verification code."""
    return random.randint(1000, 9999)

def login():
    """Prompt the user for login credentials and verify them."""
    while True:
        username = input("Username: ")
        password = input("Password: ")

        if username in user_database and user_database[username]["password"] == password:
            user = user_database[username]
            if user["verification_code"] is None:
                verification_code = generate_verification_code()
                user["verification_code"] = verification_code
            else:
                verification_code = user["verification_code"]
            print("Login successful!")
            print("Verification code:", verification_code)
            break
        else:
            print("Invalid username or password. Please try again.")

login()
