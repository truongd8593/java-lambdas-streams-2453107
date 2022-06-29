package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {

  public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
    return planets.stream()
            .filter(item -> item.getName().startsWith("M"))
            .collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithRings(List<Planet> planets) {
    return planets.stream()
            .filter(Planet::getHasRings)
            .collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
    return planets.stream()
            .filter(item -> item.getNumberOfMoons() >= 3)
            .collect(Collectors.toList());
  }

  public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
    return planets.stream()
            .filter(item -> item.getDensity() > 5)
            .collect(Collectors.toList());
  }

}
