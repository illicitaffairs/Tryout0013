# Tryout0013
The code begins by importing the necessary modules: random and time. The random module is used to generate a random temperature value, and the time module is used to introduce a delay between temperature readings.

The obter_leitura_temperatura() function simulates reading the temperature of the engine. It generates a random temperature value between 60 and 100 degrees Celsius using the random.uniform() function. This function returns a random float number within the specified range.

The monitorar_temperatura() function is the main part of the code. It runs an infinite loop using the while True: statement. Inside the loop, it calls the obter_leitura_temperatura() function to obtain the current temperature reading.

The current temperature is then printed using the print() function, displaying the message "Temperatura do motor: [temperatura] °C" where [temperatura] is the actual temperature value.

Next, an if statement checks if the temperature exceeds 90 degrees. If it does, an alert message is printed using the print() function, indicating that a high temperature has been detected. At this point, you can add additional logic to notify the maintenance team or take other necessary actions.

Afterward, the time.sleep(1) line introduces a one-second delay using the sleep() function from the time module. This delay ensures that there is a one-second interval between temperature readings.

Finally, the monitorar_temperatura() function is called to start the temperature monitoring process. It will run indefinitely until manually stopped or interrupted.

This code serves as a basic framework for monitoring the temperature of an engine. In a real-world scenario, you would likely have additional code to interface with temperature sensors and perform more complex actions based on the temperature readings.



Still working on this :)
