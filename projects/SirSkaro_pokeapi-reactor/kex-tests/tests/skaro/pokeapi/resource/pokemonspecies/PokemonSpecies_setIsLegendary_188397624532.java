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

public class PokemonSpecies_setIsLegendary_188397624532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6762;

    public PokemonSpecies_setIsLegendary_188397624532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6762 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term6762, term6762.getClass(), "id", null);
        setField(term6762, term6762.getClass(), "name", null);
        setField(term6762, term6762.getClass(), "order", null);
        setField(term6762, term6762.getClass(), "genderRate", null);
        setField(term6762, term6762.getClass(), "captureRate", null);
        setField(term6762, term6762.getClass(), "baseHappiness", null);
        setField(term6762, term6762.getClass(), "isBaby", null);
        setField(term6762, term6762.getClass(), "isLegendary", null);
        setField(term6762, term6762.getClass(), "isMythical", null);
        setField(term6762, term6762.getClass(), "hatchCounter", null);
        setField(term6762, term6762.getClass(), "hasGenderDifferences", null);
        setField(term6762, term6762.getClass(), "formsSwitchable", null);
        setField(term6762, term6762.getClass(), "growthRate", null);
        setField(term6762, term6762.getClass(), "pokedexNumbers", null);
        setField(term6762, term6762.getClass(), "eggGroups", null);
        setField(term6762, term6762.getClass(), "color", null);
        setField(term6762, term6762.getClass(), "shape", null);
        setField(term6762, term6762.getClass(), "evolvesFromSpecies", null);
        setField(term6762, term6762.getClass(), "evolutionChain", null);
        setField(term6762, term6762.getClass(), "habitat", null);
        setField(term6762, term6762.getClass(), "generation", null);
        setField(term6762, term6762.getClass(), "names", null);
        setField(term6762, term6762.getClass(), "flavorTextEntries", null);
        setField(term6762, term6762.getClass(), "formDescriptions", null);
        setField(term6762, term6762.getClass(), "genera", null);
        setField(term6762, term6762.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsLegendary", argTypes, term6762, args);
    }

};


