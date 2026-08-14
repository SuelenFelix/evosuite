package skaro.pokeapi.resource.pokemonspecies;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static skaro.pokeapi.resource.pokemonspecies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonSpecies_getEggGroups_5988757953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72382;

    public PokemonSpecies_getEggGroups_5988757953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72382 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term72382, term72382.getClass(), "id", null);
        setField(term72382, term72382.getClass(), "name", null);
        setField(term72382, term72382.getClass(), "order", null);
        setField(term72382, term72382.getClass(), "genderRate", null);
        setField(term72382, term72382.getClass(), "captureRate", null);
        setField(term72382, term72382.getClass(), "baseHappiness", null);
        setField(term72382, term72382.getClass(), "isBaby", null);
        setField(term72382, term72382.getClass(), "isLegendary", null);
        setField(term72382, term72382.getClass(), "isMythical", null);
        setField(term72382, term72382.getClass(), "hatchCounter", null);
        setField(term72382, term72382.getClass(), "hasGenderDifferences", null);
        setField(term72382, term72382.getClass(), "formsSwitchable", null);
        setField(term72382, term72382.getClass(), "growthRate", null);
        setField(term72382, term72382.getClass(), "pokedexNumbers", null);
        setField(term72382, term72382.getClass(), "eggGroups", null);
        setField(term72382, term72382.getClass(), "color", null);
        setField(term72382, term72382.getClass(), "shape", null);
        setField(term72382, term72382.getClass(), "evolvesFromSpecies", null);
        setField(term72382, term72382.getClass(), "evolutionChain", null);
        setField(term72382, term72382.getClass(), "habitat", null);
        setField(term72382, term72382.getClass(), "generation", null);
        setField(term72382, term72382.getClass(), "names", null);
        setField(term72382, term72382.getClass(), "flavorTextEntries", null);
        setField(term72382, term72382.getClass(), "formDescriptions", null);
        setField(term72382, term72382.getClass(), "genera", null);
        setField(term72382, term72382.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEggGroups", argTypes, term72382, args);
    }

};


