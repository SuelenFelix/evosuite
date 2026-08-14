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

public class PokemonSpecies_setName_18925700408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2409;

    public PokemonSpecies_setName_18925700408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2409 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term2409, term2409.getClass(), "id", null);
        setField(term2409, term2409.getClass(), "name", null);
        setField(term2409, term2409.getClass(), "order", null);
        setField(term2409, term2409.getClass(), "genderRate", null);
        setField(term2409, term2409.getClass(), "captureRate", null);
        setField(term2409, term2409.getClass(), "baseHappiness", null);
        setField(term2409, term2409.getClass(), "isBaby", null);
        setField(term2409, term2409.getClass(), "isLegendary", null);
        setField(term2409, term2409.getClass(), "isMythical", null);
        setField(term2409, term2409.getClass(), "hatchCounter", null);
        setField(term2409, term2409.getClass(), "hasGenderDifferences", null);
        setField(term2409, term2409.getClass(), "formsSwitchable", null);
        setField(term2409, term2409.getClass(), "growthRate", null);
        setField(term2409, term2409.getClass(), "pokedexNumbers", null);
        setField(term2409, term2409.getClass(), "eggGroups", null);
        setField(term2409, term2409.getClass(), "color", null);
        setField(term2409, term2409.getClass(), "shape", null);
        setField(term2409, term2409.getClass(), "evolvesFromSpecies", null);
        setField(term2409, term2409.getClass(), "evolutionChain", null);
        setField(term2409, term2409.getClass(), "habitat", null);
        setField(term2409, term2409.getClass(), "generation", null);
        setField(term2409, term2409.getClass(), "names", null);
        setField(term2409, term2409.getClass(), "flavorTextEntries", null);
        setField(term2409, term2409.getClass(), "formDescriptions", null);
        setField(term2409, term2409.getClass(), "genera", null);
        setField(term2409, term2409.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term2409, args);
    }

};


