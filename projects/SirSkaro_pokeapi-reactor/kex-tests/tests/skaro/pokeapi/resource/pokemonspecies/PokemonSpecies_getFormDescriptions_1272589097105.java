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

public class PokemonSpecies_getFormDescriptions_1272589097105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19948;

    public PokemonSpecies_getFormDescriptions_1272589097105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19948 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term19948, term19948.getClass(), "id", null);
        setField(term19948, term19948.getClass(), "name", null);
        setField(term19948, term19948.getClass(), "order", null);
        setField(term19948, term19948.getClass(), "genderRate", null);
        setField(term19948, term19948.getClass(), "captureRate", null);
        setField(term19948, term19948.getClass(), "baseHappiness", null);
        setField(term19948, term19948.getClass(), "isBaby", null);
        setField(term19948, term19948.getClass(), "isLegendary", null);
        setField(term19948, term19948.getClass(), "isMythical", null);
        setField(term19948, term19948.getClass(), "hatchCounter", null);
        setField(term19948, term19948.getClass(), "hasGenderDifferences", null);
        setField(term19948, term19948.getClass(), "formsSwitchable", null);
        setField(term19948, term19948.getClass(), "growthRate", null);
        setField(term19948, term19948.getClass(), "pokedexNumbers", null);
        setField(term19948, term19948.getClass(), "eggGroups", null);
        setField(term19948, term19948.getClass(), "color", null);
        setField(term19948, term19948.getClass(), "shape", null);
        setField(term19948, term19948.getClass(), "evolvesFromSpecies", null);
        setField(term19948, term19948.getClass(), "evolutionChain", null);
        setField(term19948, term19948.getClass(), "habitat", null);
        setField(term19948, term19948.getClass(), "generation", null);
        setField(term19948, term19948.getClass(), "names", null);
        setField(term19948, term19948.getClass(), "flavorTextEntries", null);
        setField(term19948, term19948.getClass(), "formDescriptions", null);
        setField(term19948, term19948.getClass(), "genera", null);
        setField(term19948, term19948.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormDescriptions", argTypes, term19948, args);
    }

};


