class SmallestInfiniteSet:

    def __init__(self):
        self.l=list(range(1,1004))
    
    def popSmallest(self) -> int:
        self.l.sort()
        n=self.l[0]
        self.l.remove(n)
        return n

    def addBack(self, num: int) -> None:
        if num not in self.l:
            self.l.append(num)


# Your SmallestInfiniteSet object will be instantiated and called as such:
# obj = SmallestInfiniteSet()
# param_1 = obj.popSmallest()
# obj.addBack(num)