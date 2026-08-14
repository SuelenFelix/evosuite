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

public class PokemonSpecies_getHabitat_62992438873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75504;

    public PokemonSpecies_getHabitat_62992438873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75504 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term75504, term75504.getClass(), "id", null);
        setField(term75504, term75504.getClass(), "name", null);
        setField(term75504, term75504.getClass(), "order", null);
        setField(term75504, term75504.getClass(), "genderRate", null);
        setField(term75504, term75504.getClass(), "captureRate", null);
        setField(term75504, term75504.getClass(), "baseHappiness", null);
        setField(term75504, term75504.getClass(), "isBaby", null);
        setField(term75504, term75504.getClass(), "isLegendary", null);
        setField(term75504, term75504.getClass(), "isMythical", null);
        setField(term75504, term75504.getClass(), "hatchCounter", null);
        setField(term75504, term75504.getClass(), "hasGenderDifferences", null);
        setField(term75504, term75504.getClass(), "formsSwitchable", null);
        setField(term75504, term75504.getClass(), "growthRate", null);
        setField(term75504, term75504.getClass(), "pokedexNumbers", null);
        setField(term75504, term75504.getClass(), "eggGroups", null);
        setField(term75504, term75504.getClass(), "color", null);
        setField(term75504, term75504.getClass(), "shape", null);
        setField(term75504, term75504.getClass(), "evolvesFromSpecies", null);
        setField(term75504, term75504.getClass(), "evolutionChain", null);
        setField(term75504, term75504.getClass(), "habitat", null);
        setField(term75504, term75504.getClass(), "generation", null);
        setField(term75504, term75504.getClass(), "names", null);
        setField(term75504, term75504.getClass(), "flavorTextEntries", null);
        setField(term75504, term75504.getClass(), "formDescriptions", null);
        setField(term75504, term75504.getClass(), "genera", null);
        setField(term75504, term75504.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHabitat", argTypes, term75504, args);
    }

};


