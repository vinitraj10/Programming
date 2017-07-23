while True:
    try:
        number = int(input("What's Your Favourite Number?\n"))
        print(number)
        break
    except:
        print("Enter Wisely")
    finally:
        print("Completed")
