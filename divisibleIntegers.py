def integers_divisible_by_three():
    numbers = set(range(1, 31))
    total = 0
    for number in numbers:
        if number % 3 == 0:
            total += number
    print(total)


integers_divisible_by_three()
