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

public class PokemonSpecies_setPokedexNumbers_714032053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71309;

    public PokemonSpecies_setPokedexNumbers_714032053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71309 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term71309, term71309.getClass(), "id", null);
        setField(term71309, term71309.getClass(), "name", null);
        setField(term71309, term71309.getClass(), "order", null);
        setField(term71309, term71309.getClass(), "genderRate", null);
        setField(term71309, term71309.getClass(), "captureRate", null);
        setField(term71309, term71309.getClass(), "baseHappiness", null);
        setField(term71309, term71309.getClass(), "isBaby", null);
        setField(term71309, term71309.getClass(), "isLegendary", null);
        setField(term71309, term71309.getClass(), "isMythical", null);
        setField(term71309, term71309.getClass(), "hatchCounter", null);
        setField(term71309, term71309.getClass(), "hasGenderDifferences", null);
        setField(term71309, term71309.getClass(), "formsSwitchable", null);
        setField(term71309, term71309.getClass(), "growthRate", null);
        setField(term71309, term71309.getClass(), "pokedexNumbers", null);
        setField(term71309, term71309.getClass(), "eggGroups", null);
        setField(term71309, term71309.getClass(), "color", null);
        setField(term71309, term71309.getClass(), "shape", null);
        setField(term71309, term71309.getClass(), "evolvesFromSpecies", null);
        setField(term71309, term71309.getClass(), "evolutionChain", null);
        setField(term71309, term71309.getClass(), "habitat", null);
        setField(term71309, term71309.getClass(), "generation", null);
        setField(term71309, term71309.getClass(), "names", null);
        setField(term71309, term71309.getClass(), "flavorTextEntries", null);
        setField(term71309, term71309.getClass(), "formDescriptions", null);
        setField(term71309, term71309.getClass(), "genera", null);
        setField(term71309, term71309.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPokedexNumbers", argTypes, term71309, args);
    }

};


