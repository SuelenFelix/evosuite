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

public class PokemonSpecies_setShape_66973818666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13150;

    public PokemonSpecies_setShape_66973818666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13150 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term13150, term13150.getClass(), "id", null);
        setField(term13150, term13150.getClass(), "name", null);
        setField(term13150, term13150.getClass(), "order", null);
        setField(term13150, term13150.getClass(), "genderRate", null);
        setField(term13150, term13150.getClass(), "captureRate", null);
        setField(term13150, term13150.getClass(), "baseHappiness", null);
        setField(term13150, term13150.getClass(), "isBaby", null);
        setField(term13150, term13150.getClass(), "isLegendary", null);
        setField(term13150, term13150.getClass(), "isMythical", null);
        setField(term13150, term13150.getClass(), "hatchCounter", null);
        setField(term13150, term13150.getClass(), "hasGenderDifferences", null);
        setField(term13150, term13150.getClass(), "formsSwitchable", null);
        setField(term13150, term13150.getClass(), "growthRate", null);
        setField(term13150, term13150.getClass(), "pokedexNumbers", null);
        setField(term13150, term13150.getClass(), "eggGroups", null);
        setField(term13150, term13150.getClass(), "color", null);
        setField(term13150, term13150.getClass(), "shape", null);
        setField(term13150, term13150.getClass(), "evolvesFromSpecies", null);
        setField(term13150, term13150.getClass(), "evolutionChain", null);
        setField(term13150, term13150.getClass(), "habitat", null);
        setField(term13150, term13150.getClass(), "generation", null);
        setField(term13150, term13150.getClass(), "names", null);
        setField(term13150, term13150.getClass(), "flavorTextEntries", null);
        setField(term13150, term13150.getClass(), "formDescriptions", null);
        setField(term13150, term13150.getClass(), "genera", null);
        setField(term13150, term13150.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShape", argTypes, term13150, args);
    }

};


