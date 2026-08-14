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

public class PokemonSpecies_getFlavorTextEntries_95483551387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17386;

    public PokemonSpecies_getFlavorTextEntries_95483551387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17386 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term17386, term17386.getClass(), "id", null);
        setField(term17386, term17386.getClass(), "name", null);
        setField(term17386, term17386.getClass(), "order", null);
        setField(term17386, term17386.getClass(), "genderRate", null);
        setField(term17386, term17386.getClass(), "captureRate", null);
        setField(term17386, term17386.getClass(), "baseHappiness", null);
        setField(term17386, term17386.getClass(), "isBaby", null);
        setField(term17386, term17386.getClass(), "isLegendary", null);
        setField(term17386, term17386.getClass(), "isMythical", null);
        setField(term17386, term17386.getClass(), "hatchCounter", null);
        setField(term17386, term17386.getClass(), "hasGenderDifferences", null);
        setField(term17386, term17386.getClass(), "formsSwitchable", null);
        setField(term17386, term17386.getClass(), "growthRate", null);
        setField(term17386, term17386.getClass(), "pokedexNumbers", null);
        setField(term17386, term17386.getClass(), "eggGroups", null);
        setField(term17386, term17386.getClass(), "color", null);
        setField(term17386, term17386.getClass(), "shape", null);
        setField(term17386, term17386.getClass(), "evolvesFromSpecies", null);
        setField(term17386, term17386.getClass(), "evolutionChain", null);
        setField(term17386, term17386.getClass(), "habitat", null);
        setField(term17386, term17386.getClass(), "generation", null);
        setField(term17386, term17386.getClass(), "names", null);
        setField(term17386, term17386.getClass(), "flavorTextEntries", null);
        setField(term17386, term17386.getClass(), "formDescriptions", null);
        setField(term17386, term17386.getClass(), "genera", null);
        setField(term17386, term17386.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term17386, args);
    }

};


