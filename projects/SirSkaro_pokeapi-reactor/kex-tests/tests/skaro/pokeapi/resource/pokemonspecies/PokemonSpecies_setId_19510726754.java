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

public class PokemonSpecies_setId_19510726754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1548;

    public PokemonSpecies_setId_19510726754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1548 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term1548, term1548.getClass(), "id", null);
        setField(term1548, term1548.getClass(), "name", null);
        setField(term1548, term1548.getClass(), "order", null);
        setField(term1548, term1548.getClass(), "genderRate", null);
        setField(term1548, term1548.getClass(), "captureRate", null);
        setField(term1548, term1548.getClass(), "baseHappiness", null);
        setField(term1548, term1548.getClass(), "isBaby", null);
        setField(term1548, term1548.getClass(), "isLegendary", null);
        setField(term1548, term1548.getClass(), "isMythical", null);
        setField(term1548, term1548.getClass(), "hatchCounter", null);
        setField(term1548, term1548.getClass(), "hasGenderDifferences", null);
        setField(term1548, term1548.getClass(), "formsSwitchable", null);
        setField(term1548, term1548.getClass(), "growthRate", null);
        setField(term1548, term1548.getClass(), "pokedexNumbers", null);
        setField(term1548, term1548.getClass(), "eggGroups", null);
        setField(term1548, term1548.getClass(), "color", null);
        setField(term1548, term1548.getClass(), "shape", null);
        setField(term1548, term1548.getClass(), "evolvesFromSpecies", null);
        setField(term1548, term1548.getClass(), "evolutionChain", null);
        setField(term1548, term1548.getClass(), "habitat", null);
        setField(term1548, term1548.getClass(), "generation", null);
        setField(term1548, term1548.getClass(), "names", null);
        setField(term1548, term1548.getClass(), "flavorTextEntries", null);
        setField(term1548, term1548.getClass(), "formDescriptions", null);
        setField(term1548, term1548.getClass(), "genera", null);
        setField(term1548, term1548.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term1548, args);
    }

};


