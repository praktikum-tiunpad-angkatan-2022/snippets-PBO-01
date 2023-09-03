from Ship import Ship

ferry = Ship()

print("Initially, this ship has", ferry.getCrew(), "crew.")

if (ferry.getCrew() < 30):
    ferry.setCrew(30)

print("But then, now this ship has", ferry.getCrew(),"crew.")