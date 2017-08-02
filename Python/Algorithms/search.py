class enemy:
	energy=3
	def __init__(self):
		print("Ouch")
		self.energy=self.energy-1
	def getenergy(self):
		print(self.energy)

enemy1 = enemy()
enemy2 = enemy()
enemy1.getenergy()
