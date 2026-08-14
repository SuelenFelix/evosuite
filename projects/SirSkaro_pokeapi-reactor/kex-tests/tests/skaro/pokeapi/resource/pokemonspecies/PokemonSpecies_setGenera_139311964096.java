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

public class PokemonSpecies_setGenera_139311964096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19249;

    public PokemonSpecies_setGenera_139311964096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19249 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term19249, term19249.getClass(), "id", null);
        setField(term19249, term19249.getClass(), "name", null);
        setField(term19249, term19249.getClass(), "order", null);
        setField(term19249, term19249.getClass(), "genderRate", null);
        setField(term19249, term19249.getClass(), "captureRate", null);
        setField(term19249, term19249.getClass(), "baseHappiness", null);
        setField(term19249, term19249.getClass(), "isBaby", null);
        setField(term19249, term19249.getClass(), "isLegendary", null);
        setField(term19249, term19249.getClass(), "isMythical", null);
        setField(term19249, term19249.getClass(), "hatchCounter", null);
        setField(term19249, term19249.getClass(), "hasGenderDifferences", null);
        setField(term19249, term19249.getClass(), "formsSwitchable", null);
        setField(term19249, term19249.getClass(), "growthRate", null);
        setField(term19249, term19249.getClass(), "pokedexNumbers", null);
        setField(term19249, term19249.getClass(), "eggGroups", null);
        setField(term19249, term19249.getClass(), "color", null);
        setField(term19249, term19249.getClass(), "shape", null);
        setField(term19249, term19249.getClass(), "evolvesFromSpecies", null);
        setField(term19249, term19249.getClass(), "evolutionChain", null);
        setField(term19249, term19249.getClass(), "habitat", null);
        setField(term19249, term19249.getClass(), "generation", null);
        setField(term19249, term19249.getClass(), "names", null);
        setField(term19249, term19249.getClass(), "flavorTextEntries", null);
        setField(term19249, term19249.getClass(), "formDescriptions", null);
        setField(term19249, term19249.getClass(), "genera", null);
        setField(term19249, term19249.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenera", argTypes, term19249, args);
    }

};


