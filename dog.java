class Dog:
    def __init__(self, name):
        self.name = name
        self.energy = 100

    def bark(self):
        if self.energy >= 10:
            print(f"{self.name} barks: Woof woof!")
            self.energy -= 10
        else:
            print(f"{self.name} is too tired to bark.")

    def eat(self):
        print(f"{self.name} is eating.")
        self.energy += 20

    def sleep(self):
        print(f"{self.name} is sleeping.")
        self.energy = 100

def main():
    dog_name = input("Enter your dog's name: ")
    dog = Dog(dog_name)

    while True:
        print(f"\n{dog.name}'s Energy: {dog.energy}")
        choice = input("What do you want to do with your dog? (bark / eat / sleep / quit): ")

        if choice == "bark":
            dog.bark()
        elif choice == "eat":
            dog.eat()
        elif choice == "sleep":
            dog.sleep()
        elif choice == "quit":
            print("Goodbye!")
            break
        else:
            print("Invalid choice. Try again.")

if __name__ == "__main__":
    main()
