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

public class PokemonSpecies_setFormDescriptions_8063483392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18446;

    public PokemonSpecies_setFormDescriptions_8063483392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18446 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term18446, term18446.getClass(), "id", null);
        setField(term18446, term18446.getClass(), "name", null);
        setField(term18446, term18446.getClass(), "order", null);
        setField(term18446, term18446.getClass(), "genderRate", null);
        setField(term18446, term18446.getClass(), "captureRate", null);
        setField(term18446, term18446.getClass(), "baseHappiness", null);
        setField(term18446, term18446.getClass(), "isBaby", null);
        setField(term18446, term18446.getClass(), "isLegendary", null);
        setField(term18446, term18446.getClass(), "isMythical", null);
        setField(term18446, term18446.getClass(), "hatchCounter", null);
        setField(term18446, term18446.getClass(), "hasGenderDifferences", null);
        setField(term18446, term18446.getClass(), "formsSwitchable", null);
        setField(term18446, term18446.getClass(), "growthRate", null);
        setField(term18446, term18446.getClass(), "pokedexNumbers", null);
        setField(term18446, term18446.getClass(), "eggGroups", null);
        setField(term18446, term18446.getClass(), "color", null);
        setField(term18446, term18446.getClass(), "shape", null);
        setField(term18446, term18446.getClass(), "evolvesFromSpecies", null);
        setField(term18446, term18446.getClass(), "evolutionChain", null);
        setField(term18446, term18446.getClass(), "habitat", null);
        setField(term18446, term18446.getClass(), "generation", null);
        setField(term18446, term18446.getClass(), "names", null);
        setField(term18446, term18446.getClass(), "flavorTextEntries", null);
        setField(term18446, term18446.getClass(), "formDescriptions", null);
        setField(term18446, term18446.getClass(), "genera", null);
        setField(term18446, term18446.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormDescriptions", argTypes, term18446, args);
    }

};


