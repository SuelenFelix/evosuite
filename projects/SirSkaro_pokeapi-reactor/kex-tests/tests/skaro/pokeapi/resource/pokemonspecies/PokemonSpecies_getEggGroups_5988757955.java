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

public class PokemonSpecies_getEggGroups_5988757955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71739;

    public PokemonSpecies_getEggGroups_5988757955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71739 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term71739, term71739.getClass(), "id", null);
        setField(term71739, term71739.getClass(), "name", null);
        setField(term71739, term71739.getClass(), "order", null);
        setField(term71739, term71739.getClass(), "genderRate", null);
        setField(term71739, term71739.getClass(), "captureRate", null);
        setField(term71739, term71739.getClass(), "baseHappiness", null);
        setField(term71739, term71739.getClass(), "isBaby", null);
        setField(term71739, term71739.getClass(), "isLegendary", null);
        setField(term71739, term71739.getClass(), "isMythical", null);
        setField(term71739, term71739.getClass(), "hatchCounter", null);
        setField(term71739, term71739.getClass(), "hasGenderDifferences", null);
        setField(term71739, term71739.getClass(), "formsSwitchable", null);
        setField(term71739, term71739.getClass(), "growthRate", null);
        setField(term71739, term71739.getClass(), "pokedexNumbers", null);
        setField(term71739, term71739.getClass(), "eggGroups", null);
        setField(term71739, term71739.getClass(), "color", null);
        setField(term71739, term71739.getClass(), "shape", null);
        setField(term71739, term71739.getClass(), "evolvesFromSpecies", null);
        setField(term71739, term71739.getClass(), "evolutionChain", null);
        setField(term71739, term71739.getClass(), "habitat", null);
        setField(term71739, term71739.getClass(), "generation", null);
        setField(term71739, term71739.getClass(), "names", null);
        setField(term71739, term71739.getClass(), "flavorTextEntries", null);
        setField(term71739, term71739.getClass(), "formDescriptions", null);
        setField(term71739, term71739.getClass(), "genera", null);
        setField(term71739, term71739.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEggGroups", argTypes, term71739, args);
    }

};


