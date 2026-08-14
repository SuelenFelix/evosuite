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

public class PokemonSpecies_getGrowthRate_141070385647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70093;

    public PokemonSpecies_getGrowthRate_141070385647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70093 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term70093, term70093.getClass(), "id", null);
        setField(term70093, term70093.getClass(), "name", null);
        setField(term70093, term70093.getClass(), "order", null);
        setField(term70093, term70093.getClass(), "genderRate", null);
        setField(term70093, term70093.getClass(), "captureRate", null);
        setField(term70093, term70093.getClass(), "baseHappiness", null);
        setField(term70093, term70093.getClass(), "isBaby", null);
        setField(term70093, term70093.getClass(), "isLegendary", null);
        setField(term70093, term70093.getClass(), "isMythical", null);
        setField(term70093, term70093.getClass(), "hatchCounter", null);
        setField(term70093, term70093.getClass(), "hasGenderDifferences", null);
        setField(term70093, term70093.getClass(), "formsSwitchable", null);
        setField(term70093, term70093.getClass(), "growthRate", null);
        setField(term70093, term70093.getClass(), "pokedexNumbers", null);
        setField(term70093, term70093.getClass(), "eggGroups", null);
        setField(term70093, term70093.getClass(), "color", null);
        setField(term70093, term70093.getClass(), "shape", null);
        setField(term70093, term70093.getClass(), "evolvesFromSpecies", null);
        setField(term70093, term70093.getClass(), "evolutionChain", null);
        setField(term70093, term70093.getClass(), "habitat", null);
        setField(term70093, term70093.getClass(), "generation", null);
        setField(term70093, term70093.getClass(), "names", null);
        setField(term70093, term70093.getClass(), "flavorTextEntries", null);
        setField(term70093, term70093.getClass(), "formDescriptions", null);
        setField(term70093, term70093.getClass(), "genera", null);
        setField(term70093, term70093.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGrowthRate", argTypes, term70093, args);
    }

};


