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

public class PokemonSpecies_setNames_200590269685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17110;

    public PokemonSpecies_setNames_200590269685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17110 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term17110, term17110.getClass(), "id", null);
        setField(term17110, term17110.getClass(), "name", null);
        setField(term17110, term17110.getClass(), "order", null);
        setField(term17110, term17110.getClass(), "genderRate", null);
        setField(term17110, term17110.getClass(), "captureRate", null);
        setField(term17110, term17110.getClass(), "baseHappiness", null);
        setField(term17110, term17110.getClass(), "isBaby", null);
        setField(term17110, term17110.getClass(), "isLegendary", null);
        setField(term17110, term17110.getClass(), "isMythical", null);
        setField(term17110, term17110.getClass(), "hatchCounter", null);
        setField(term17110, term17110.getClass(), "hasGenderDifferences", null);
        setField(term17110, term17110.getClass(), "formsSwitchable", null);
        setField(term17110, term17110.getClass(), "growthRate", null);
        setField(term17110, term17110.getClass(), "pokedexNumbers", null);
        setField(term17110, term17110.getClass(), "eggGroups", null);
        setField(term17110, term17110.getClass(), "color", null);
        setField(term17110, term17110.getClass(), "shape", null);
        setField(term17110, term17110.getClass(), "evolvesFromSpecies", null);
        setField(term17110, term17110.getClass(), "evolutionChain", null);
        setField(term17110, term17110.getClass(), "habitat", null);
        setField(term17110, term17110.getClass(), "generation", null);
        setField(term17110, term17110.getClass(), "names", null);
        setField(term17110, term17110.getClass(), "flavorTextEntries", null);
        setField(term17110, term17110.getClass(), "formDescriptions", null);
        setField(term17110, term17110.getClass(), "genera", null);
        setField(term17110, term17110.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term17110, args);
    }

};


