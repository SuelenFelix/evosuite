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

public class PokemonSpecies_getNames_5327304683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16710;

    public PokemonSpecies_getNames_5327304683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16710 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term16710, term16710.getClass(), "id", null);
        setField(term16710, term16710.getClass(), "name", null);
        setField(term16710, term16710.getClass(), "order", null);
        setField(term16710, term16710.getClass(), "genderRate", null);
        setField(term16710, term16710.getClass(), "captureRate", null);
        setField(term16710, term16710.getClass(), "baseHappiness", null);
        setField(term16710, term16710.getClass(), "isBaby", null);
        setField(term16710, term16710.getClass(), "isLegendary", null);
        setField(term16710, term16710.getClass(), "isMythical", null);
        setField(term16710, term16710.getClass(), "hatchCounter", null);
        setField(term16710, term16710.getClass(), "hasGenderDifferences", null);
        setField(term16710, term16710.getClass(), "formsSwitchable", null);
        setField(term16710, term16710.getClass(), "growthRate", null);
        setField(term16710, term16710.getClass(), "pokedexNumbers", null);
        setField(term16710, term16710.getClass(), "eggGroups", null);
        setField(term16710, term16710.getClass(), "color", null);
        setField(term16710, term16710.getClass(), "shape", null);
        setField(term16710, term16710.getClass(), "evolvesFromSpecies", null);
        setField(term16710, term16710.getClass(), "evolutionChain", null);
        setField(term16710, term16710.getClass(), "habitat", null);
        setField(term16710, term16710.getClass(), "generation", null);
        setField(term16710, term16710.getClass(), "names", null);
        setField(term16710, term16710.getClass(), "flavorTextEntries", null);
        setField(term16710, term16710.getClass(), "formDescriptions", null);
        setField(term16710, term16710.getClass(), "genera", null);
        setField(term16710, term16710.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term16710, args);
    }

};


