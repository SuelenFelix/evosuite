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

public class PokemonSpecies_getGenderRate_190753698799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81333;

    public PokemonSpecies_getGenderRate_190753698799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81333 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term81333, term81333.getClass(), "id", null);
        setField(term81333, term81333.getClass(), "name", null);
        setField(term81333, term81333.getClass(), "order", null);
        setField(term81333, term81333.getClass(), "genderRate", null);
        setField(term81333, term81333.getClass(), "captureRate", null);
        setField(term81333, term81333.getClass(), "baseHappiness", null);
        setField(term81333, term81333.getClass(), "isBaby", null);
        setField(term81333, term81333.getClass(), "isLegendary", null);
        setField(term81333, term81333.getClass(), "isMythical", null);
        setField(term81333, term81333.getClass(), "hatchCounter", null);
        setField(term81333, term81333.getClass(), "hasGenderDifferences", null);
        setField(term81333, term81333.getClass(), "formsSwitchable", null);
        setField(term81333, term81333.getClass(), "growthRate", null);
        setField(term81333, term81333.getClass(), "pokedexNumbers", null);
        setField(term81333, term81333.getClass(), "eggGroups", null);
        setField(term81333, term81333.getClass(), "color", null);
        setField(term81333, term81333.getClass(), "shape", null);
        setField(term81333, term81333.getClass(), "evolvesFromSpecies", null);
        setField(term81333, term81333.getClass(), "evolutionChain", null);
        setField(term81333, term81333.getClass(), "habitat", null);
        setField(term81333, term81333.getClass(), "generation", null);
        setField(term81333, term81333.getClass(), "names", null);
        setField(term81333, term81333.getClass(), "flavorTextEntries", null);
        setField(term81333, term81333.getClass(), "formDescriptions", null);
        setField(term81333, term81333.getClass(), "genera", null);
        setField(term81333, term81333.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenderRate", argTypes, term81333, args);
    }

};


