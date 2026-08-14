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

public class PokemonSpecies_getEggGroups_5988757957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11309;

    public PokemonSpecies_getEggGroups_5988757957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11309 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term11309, term11309.getClass(), "id", null);
        setField(term11309, term11309.getClass(), "name", null);
        setField(term11309, term11309.getClass(), "order", null);
        setField(term11309, term11309.getClass(), "genderRate", null);
        setField(term11309, term11309.getClass(), "captureRate", null);
        setField(term11309, term11309.getClass(), "baseHappiness", null);
        setField(term11309, term11309.getClass(), "isBaby", null);
        setField(term11309, term11309.getClass(), "isLegendary", null);
        setField(term11309, term11309.getClass(), "isMythical", null);
        setField(term11309, term11309.getClass(), "hatchCounter", null);
        setField(term11309, term11309.getClass(), "hasGenderDifferences", null);
        setField(term11309, term11309.getClass(), "formsSwitchable", null);
        setField(term11309, term11309.getClass(), "growthRate", null);
        setField(term11309, term11309.getClass(), "pokedexNumbers", null);
        setField(term11309, term11309.getClass(), "eggGroups", null);
        setField(term11309, term11309.getClass(), "color", null);
        setField(term11309, term11309.getClass(), "shape", null);
        setField(term11309, term11309.getClass(), "evolvesFromSpecies", null);
        setField(term11309, term11309.getClass(), "evolutionChain", null);
        setField(term11309, term11309.getClass(), "habitat", null);
        setField(term11309, term11309.getClass(), "generation", null);
        setField(term11309, term11309.getClass(), "names", null);
        setField(term11309, term11309.getClass(), "flavorTextEntries", null);
        setField(term11309, term11309.getClass(), "formDescriptions", null);
        setField(term11309, term11309.getClass(), "genera", null);
        setField(term11309, term11309.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEggGroups", argTypes, term11309, args);
    }

};


