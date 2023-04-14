def letter_appearance():
    word = "MISSISSIPPI"
    count_i = 0
    count_s = 0
    for letter in word:
        if letter == "S":
            count_s += 1
        elif letter == "I":
            count_i += 1

    print("letter i appears", count_i, "times")
    print("letter s appears", count_s, "times")


letter_appearance()
