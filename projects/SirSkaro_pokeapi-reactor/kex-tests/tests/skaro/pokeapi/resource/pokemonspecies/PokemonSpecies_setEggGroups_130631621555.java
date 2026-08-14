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

public class PokemonSpecies_setEggGroups_130631621555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72896;

    public PokemonSpecies_setEggGroups_130631621555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72896 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term72896, term72896.getClass(), "id", null);
        setField(term72896, term72896.getClass(), "name", null);
        setField(term72896, term72896.getClass(), "order", null);
        setField(term72896, term72896.getClass(), "genderRate", null);
        setField(term72896, term72896.getClass(), "captureRate", null);
        setField(term72896, term72896.getClass(), "baseHappiness", null);
        setField(term72896, term72896.getClass(), "isBaby", null);
        setField(term72896, term72896.getClass(), "isLegendary", null);
        setField(term72896, term72896.getClass(), "isMythical", null);
        setField(term72896, term72896.getClass(), "hatchCounter", null);
        setField(term72896, term72896.getClass(), "hasGenderDifferences", null);
        setField(term72896, term72896.getClass(), "formsSwitchable", null);
        setField(term72896, term72896.getClass(), "growthRate", null);
        setField(term72896, term72896.getClass(), "pokedexNumbers", null);
        setField(term72896, term72896.getClass(), "eggGroups", null);
        setField(term72896, term72896.getClass(), "color", null);
        setField(term72896, term72896.getClass(), "shape", null);
        setField(term72896, term72896.getClass(), "evolvesFromSpecies", null);
        setField(term72896, term72896.getClass(), "evolutionChain", null);
        setField(term72896, term72896.getClass(), "habitat", null);
        setField(term72896, term72896.getClass(), "generation", null);
        setField(term72896, term72896.getClass(), "names", null);
        setField(term72896, term72896.getClass(), "flavorTextEntries", null);
        setField(term72896, term72896.getClass(), "formDescriptions", null);
        setField(term72896, term72896.getClass(), "genera", null);
        setField(term72896, term72896.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEggGroups", argTypes, term72896, args);
    }

};


