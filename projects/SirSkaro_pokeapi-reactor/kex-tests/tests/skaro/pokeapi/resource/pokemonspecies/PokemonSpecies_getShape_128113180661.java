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

public class PokemonSpecies_getShape_128113180661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74140;

    public PokemonSpecies_getShape_128113180661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74140 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term74140, term74140.getClass(), "id", null);
        setField(term74140, term74140.getClass(), "name", null);
        setField(term74140, term74140.getClass(), "order", null);
        setField(term74140, term74140.getClass(), "genderRate", null);
        setField(term74140, term74140.getClass(), "captureRate", null);
        setField(term74140, term74140.getClass(), "baseHappiness", null);
        setField(term74140, term74140.getClass(), "isBaby", null);
        setField(term74140, term74140.getClass(), "isLegendary", null);
        setField(term74140, term74140.getClass(), "isMythical", null);
        setField(term74140, term74140.getClass(), "hatchCounter", null);
        setField(term74140, term74140.getClass(), "hasGenderDifferences", null);
        setField(term74140, term74140.getClass(), "formsSwitchable", null);
        setField(term74140, term74140.getClass(), "growthRate", null);
        setField(term74140, term74140.getClass(), "pokedexNumbers", null);
        setField(term74140, term74140.getClass(), "eggGroups", null);
        setField(term74140, term74140.getClass(), "color", null);
        setField(term74140, term74140.getClass(), "shape", null);
        setField(term74140, term74140.getClass(), "evolvesFromSpecies", null);
        setField(term74140, term74140.getClass(), "evolutionChain", null);
        setField(term74140, term74140.getClass(), "habitat", null);
        setField(term74140, term74140.getClass(), "generation", null);
        setField(term74140, term74140.getClass(), "names", null);
        setField(term74140, term74140.getClass(), "flavorTextEntries", null);
        setField(term74140, term74140.getClass(), "formDescriptions", null);
        setField(term74140, term74140.getClass(), "genera", null);
        setField(term74140, term74140.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShape", argTypes, term74140, args);
    }

};


