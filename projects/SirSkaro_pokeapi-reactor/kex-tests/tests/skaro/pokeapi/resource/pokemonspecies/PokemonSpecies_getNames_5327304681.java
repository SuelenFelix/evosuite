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

public class PokemonSpecies_getNames_5327304681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77141;

    public PokemonSpecies_getNames_5327304681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77141 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term77141, term77141.getClass(), "id", null);
        setField(term77141, term77141.getClass(), "name", null);
        setField(term77141, term77141.getClass(), "order", null);
        setField(term77141, term77141.getClass(), "genderRate", null);
        setField(term77141, term77141.getClass(), "captureRate", null);
        setField(term77141, term77141.getClass(), "baseHappiness", null);
        setField(term77141, term77141.getClass(), "isBaby", null);
        setField(term77141, term77141.getClass(), "isLegendary", null);
        setField(term77141, term77141.getClass(), "isMythical", null);
        setField(term77141, term77141.getClass(), "hatchCounter", null);
        setField(term77141, term77141.getClass(), "hasGenderDifferences", null);
        setField(term77141, term77141.getClass(), "formsSwitchable", null);
        setField(term77141, term77141.getClass(), "growthRate", null);
        setField(term77141, term77141.getClass(), "pokedexNumbers", null);
        setField(term77141, term77141.getClass(), "eggGroups", null);
        setField(term77141, term77141.getClass(), "color", null);
        setField(term77141, term77141.getClass(), "shape", null);
        setField(term77141, term77141.getClass(), "evolvesFromSpecies", null);
        setField(term77141, term77141.getClass(), "evolutionChain", null);
        setField(term77141, term77141.getClass(), "habitat", null);
        setField(term77141, term77141.getClass(), "generation", null);
        setField(term77141, term77141.getClass(), "names", null);
        setField(term77141, term77141.getClass(), "flavorTextEntries", null);
        setField(term77141, term77141.getClass(), "formDescriptions", null);
        setField(term77141, term77141.getClass(), "genera", null);
        setField(term77141, term77141.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term77141, args);
    }

};


