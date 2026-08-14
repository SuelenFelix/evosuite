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

public class PokemonSpecies_setGeneration_143730503979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76729;

    public PokemonSpecies_setGeneration_143730503979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76729 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term76729, term76729.getClass(), "id", null);
        setField(term76729, term76729.getClass(), "name", null);
        setField(term76729, term76729.getClass(), "order", null);
        setField(term76729, term76729.getClass(), "genderRate", null);
        setField(term76729, term76729.getClass(), "captureRate", null);
        setField(term76729, term76729.getClass(), "baseHappiness", null);
        setField(term76729, term76729.getClass(), "isBaby", null);
        setField(term76729, term76729.getClass(), "isLegendary", null);
        setField(term76729, term76729.getClass(), "isMythical", null);
        setField(term76729, term76729.getClass(), "hatchCounter", null);
        setField(term76729, term76729.getClass(), "hasGenderDifferences", null);
        setField(term76729, term76729.getClass(), "formsSwitchable", null);
        setField(term76729, term76729.getClass(), "growthRate", null);
        setField(term76729, term76729.getClass(), "pokedexNumbers", null);
        setField(term76729, term76729.getClass(), "eggGroups", null);
        setField(term76729, term76729.getClass(), "color", null);
        setField(term76729, term76729.getClass(), "shape", null);
        setField(term76729, term76729.getClass(), "evolvesFromSpecies", null);
        setField(term76729, term76729.getClass(), "evolutionChain", null);
        setField(term76729, term76729.getClass(), "habitat", null);
        setField(term76729, term76729.getClass(), "generation", null);
        setField(term76729, term76729.getClass(), "names", null);
        setField(term76729, term76729.getClass(), "flavorTextEntries", null);
        setField(term76729, term76729.getClass(), "formDescriptions", null);
        setField(term76729, term76729.getClass(), "genera", null);
        setField(term76729, term76729.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneration", argTypes, term76729, args);
    }

};


