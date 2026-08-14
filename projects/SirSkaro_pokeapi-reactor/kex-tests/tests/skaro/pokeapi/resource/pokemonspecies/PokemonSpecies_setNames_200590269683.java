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

public class PokemonSpecies_setNames_200590269683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77501;

    public PokemonSpecies_setNames_200590269683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77501 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term77501, term77501.getClass(), "id", null);
        setField(term77501, term77501.getClass(), "name", null);
        setField(term77501, term77501.getClass(), "order", null);
        setField(term77501, term77501.getClass(), "genderRate", null);
        setField(term77501, term77501.getClass(), "captureRate", null);
        setField(term77501, term77501.getClass(), "baseHappiness", null);
        setField(term77501, term77501.getClass(), "isBaby", null);
        setField(term77501, term77501.getClass(), "isLegendary", null);
        setField(term77501, term77501.getClass(), "isMythical", null);
        setField(term77501, term77501.getClass(), "hatchCounter", null);
        setField(term77501, term77501.getClass(), "hasGenderDifferences", null);
        setField(term77501, term77501.getClass(), "formsSwitchable", null);
        setField(term77501, term77501.getClass(), "growthRate", null);
        setField(term77501, term77501.getClass(), "pokedexNumbers", null);
        setField(term77501, term77501.getClass(), "eggGroups", null);
        setField(term77501, term77501.getClass(), "color", null);
        setField(term77501, term77501.getClass(), "shape", null);
        setField(term77501, term77501.getClass(), "evolvesFromSpecies", null);
        setField(term77501, term77501.getClass(), "evolutionChain", null);
        setField(term77501, term77501.getClass(), "habitat", null);
        setField(term77501, term77501.getClass(), "generation", null);
        setField(term77501, term77501.getClass(), "names", null);
        setField(term77501, term77501.getClass(), "flavorTextEntries", null);
        setField(term77501, term77501.getClass(), "formDescriptions", null);
        setField(term77501, term77501.getClass(), "genera", null);
        setField(term77501, term77501.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term77501, args);
    }

};


