class Ship:
    def __init__(self):
        self.__crew = 24

    def setCrew(self,crew):
        self.__crew = crew

    def getCrew(self):
        return self.__crew