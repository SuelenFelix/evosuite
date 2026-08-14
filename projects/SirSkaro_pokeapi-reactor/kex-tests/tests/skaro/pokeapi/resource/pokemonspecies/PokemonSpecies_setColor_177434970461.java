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

public class PokemonSpecies_setColor_177434970461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72893;

    public PokemonSpecies_setColor_177434970461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72893 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term72893, term72893.getClass(), "id", null);
        setField(term72893, term72893.getClass(), "name", null);
        setField(term72893, term72893.getClass(), "order", null);
        setField(term72893, term72893.getClass(), "genderRate", null);
        setField(term72893, term72893.getClass(), "captureRate", null);
        setField(term72893, term72893.getClass(), "baseHappiness", null);
        setField(term72893, term72893.getClass(), "isBaby", null);
        setField(term72893, term72893.getClass(), "isLegendary", null);
        setField(term72893, term72893.getClass(), "isMythical", null);
        setField(term72893, term72893.getClass(), "hatchCounter", null);
        setField(term72893, term72893.getClass(), "hasGenderDifferences", null);
        setField(term72893, term72893.getClass(), "formsSwitchable", null);
        setField(term72893, term72893.getClass(), "growthRate", null);
        setField(term72893, term72893.getClass(), "pokedexNumbers", null);
        setField(term72893, term72893.getClass(), "eggGroups", null);
        setField(term72893, term72893.getClass(), "color", null);
        setField(term72893, term72893.getClass(), "shape", null);
        setField(term72893, term72893.getClass(), "evolvesFromSpecies", null);
        setField(term72893, term72893.getClass(), "evolutionChain", null);
        setField(term72893, term72893.getClass(), "habitat", null);
        setField(term72893, term72893.getClass(), "generation", null);
        setField(term72893, term72893.getClass(), "names", null);
        setField(term72893, term72893.getClass(), "flavorTextEntries", null);
        setField(term72893, term72893.getClass(), "formDescriptions", null);
        setField(term72893, term72893.getClass(), "genera", null);
        setField(term72893, term72893.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setColor", argTypes, term72893, args);
    }

};


