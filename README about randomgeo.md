# Tryout0013
The line import random imports the random module, which provides functions for generating random numbers.

The function gerar_coordenadas() is defined. It generates random latitude and longitude coordinates using the random.uniform() function. The random.uniform() function returns a random floating-point number between the specified lower and upper bounds. In this case, the latitude is generated between -90 and 90, and the longitude between -180 and 180.

The gerar_coordenadas() function returns the latitude and longitude as a tuple.

The code enters a while loop with the condition while True. This creates an infinite loop that will keep running until it is manually stopped or encounters a break statement.

Inside the loop, the latitude and longitude variables are assigned the values returned by the gerar_coordenadas() function.

The print() function is used to display the current latitude and longitude of the aircraft. The f-string format is used to embed the values of the latitude and longitude variables into the printed string.

The comment suggests that you can add additional code within the loop to process or send the coordinates to an external system or store them somewhere like a database. This comment is a placeholder for any additional functionality you might want to implement based on the generated coordinates.

The loop will continue to generate and display random coordinates indefinitely until the program is manually interrupted.

Still improving this one :)
