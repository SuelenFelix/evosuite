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

public class PokemonSpecies_setGeneration_143730503981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16315;

    public PokemonSpecies_setGeneration_143730503981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16315 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term16315, term16315.getClass(), "id", null);
        setField(term16315, term16315.getClass(), "name", null);
        setField(term16315, term16315.getClass(), "order", null);
        setField(term16315, term16315.getClass(), "genderRate", null);
        setField(term16315, term16315.getClass(), "captureRate", null);
        setField(term16315, term16315.getClass(), "baseHappiness", null);
        setField(term16315, term16315.getClass(), "isBaby", null);
        setField(term16315, term16315.getClass(), "isLegendary", null);
        setField(term16315, term16315.getClass(), "isMythical", null);
        setField(term16315, term16315.getClass(), "hatchCounter", null);
        setField(term16315, term16315.getClass(), "hasGenderDifferences", null);
        setField(term16315, term16315.getClass(), "formsSwitchable", null);
        setField(term16315, term16315.getClass(), "growthRate", null);
        setField(term16315, term16315.getClass(), "pokedexNumbers", null);
        setField(term16315, term16315.getClass(), "eggGroups", null);
        setField(term16315, term16315.getClass(), "color", null);
        setField(term16315, term16315.getClass(), "shape", null);
        setField(term16315, term16315.getClass(), "evolvesFromSpecies", null);
        setField(term16315, term16315.getClass(), "evolutionChain", null);
        setField(term16315, term16315.getClass(), "habitat", null);
        setField(term16315, term16315.getClass(), "generation", null);
        setField(term16315, term16315.getClass(), "names", null);
        setField(term16315, term16315.getClass(), "flavorTextEntries", null);
        setField(term16315, term16315.getClass(), "formDescriptions", null);
        setField(term16315, term16315.getClass(), "genera", null);
        setField(term16315, term16315.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneration", argTypes, term16315, args);
    }

};


