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

public class PokemonSpecies_getPokedexNumbers_113105513051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70944;

    public PokemonSpecies_getPokedexNumbers_113105513051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70944 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term70944, term70944.getClass(), "id", null);
        setField(term70944, term70944.getClass(), "name", null);
        setField(term70944, term70944.getClass(), "order", null);
        setField(term70944, term70944.getClass(), "genderRate", null);
        setField(term70944, term70944.getClass(), "captureRate", null);
        setField(term70944, term70944.getClass(), "baseHappiness", null);
        setField(term70944, term70944.getClass(), "isBaby", null);
        setField(term70944, term70944.getClass(), "isLegendary", null);
        setField(term70944, term70944.getClass(), "isMythical", null);
        setField(term70944, term70944.getClass(), "hatchCounter", null);
        setField(term70944, term70944.getClass(), "hasGenderDifferences", null);
        setField(term70944, term70944.getClass(), "formsSwitchable", null);
        setField(term70944, term70944.getClass(), "growthRate", null);
        setField(term70944, term70944.getClass(), "pokedexNumbers", null);
        setField(term70944, term70944.getClass(), "eggGroups", null);
        setField(term70944, term70944.getClass(), "color", null);
        setField(term70944, term70944.getClass(), "shape", null);
        setField(term70944, term70944.getClass(), "evolvesFromSpecies", null);
        setField(term70944, term70944.getClass(), "evolutionChain", null);
        setField(term70944, term70944.getClass(), "habitat", null);
        setField(term70944, term70944.getClass(), "generation", null);
        setField(term70944, term70944.getClass(), "names", null);
        setField(term70944, term70944.getClass(), "flavorTextEntries", null);
        setField(term70944, term70944.getClass(), "formDescriptions", null);
        setField(term70944, term70944.getClass(), "genera", null);
        setField(term70944, term70944.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokedexNumbers", argTypes, term70944, args);
    }

};


