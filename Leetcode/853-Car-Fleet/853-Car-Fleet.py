class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = sorted(zip(position, speed))
        stack = []

        for car in cars:
            while len(stack) > 0:
                top = stack[-1]
                b, a = top
                d, c = car

                if a == c:
                    break

                intersection = ((d - b) / (a - c)) * a + b

                if intersection > target or intersection <= max(b, d):
                    break

                stack.pop()

            stack.append(car)

        return len(stack)
