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

public class PokemonSpecies_setGenera_139311964094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79461;

    public PokemonSpecies_setGenera_139311964094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79461 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term79461, term79461.getClass(), "id", null);
        setField(term79461, term79461.getClass(), "name", null);
        setField(term79461, term79461.getClass(), "order", null);
        setField(term79461, term79461.getClass(), "genderRate", null);
        setField(term79461, term79461.getClass(), "captureRate", null);
        setField(term79461, term79461.getClass(), "baseHappiness", null);
        setField(term79461, term79461.getClass(), "isBaby", null);
        setField(term79461, term79461.getClass(), "isLegendary", null);
        setField(term79461, term79461.getClass(), "isMythical", null);
        setField(term79461, term79461.getClass(), "hatchCounter", null);
        setField(term79461, term79461.getClass(), "hasGenderDifferences", null);
        setField(term79461, term79461.getClass(), "formsSwitchable", null);
        setField(term79461, term79461.getClass(), "growthRate", null);
        setField(term79461, term79461.getClass(), "pokedexNumbers", null);
        setField(term79461, term79461.getClass(), "eggGroups", null);
        setField(term79461, term79461.getClass(), "color", null);
        setField(term79461, term79461.getClass(), "shape", null);
        setField(term79461, term79461.getClass(), "evolvesFromSpecies", null);
        setField(term79461, term79461.getClass(), "evolutionChain", null);
        setField(term79461, term79461.getClass(), "habitat", null);
        setField(term79461, term79461.getClass(), "generation", null);
        setField(term79461, term79461.getClass(), "names", null);
        setField(term79461, term79461.getClass(), "flavorTextEntries", null);
        setField(term79461, term79461.getClass(), "formDescriptions", null);
        setField(term79461, term79461.getClass(), "genera", null);
        setField(term79461, term79461.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenera", argTypes, term79461, args);
    }

};


