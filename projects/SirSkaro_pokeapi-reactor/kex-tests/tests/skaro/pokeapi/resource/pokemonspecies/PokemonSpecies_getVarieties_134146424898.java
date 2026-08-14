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

public class PokemonSpecies_getVarieties_134146424898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19620;

    public PokemonSpecies_getVarieties_134146424898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19620 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term19620, term19620.getClass(), "id", null);
        setField(term19620, term19620.getClass(), "name", null);
        setField(term19620, term19620.getClass(), "order", null);
        setField(term19620, term19620.getClass(), "genderRate", null);
        setField(term19620, term19620.getClass(), "captureRate", null);
        setField(term19620, term19620.getClass(), "baseHappiness", null);
        setField(term19620, term19620.getClass(), "isBaby", null);
        setField(term19620, term19620.getClass(), "isLegendary", null);
        setField(term19620, term19620.getClass(), "isMythical", null);
        setField(term19620, term19620.getClass(), "hatchCounter", null);
        setField(term19620, term19620.getClass(), "hasGenderDifferences", null);
        setField(term19620, term19620.getClass(), "formsSwitchable", null);
        setField(term19620, term19620.getClass(), "growthRate", null);
        setField(term19620, term19620.getClass(), "pokedexNumbers", null);
        setField(term19620, term19620.getClass(), "eggGroups", null);
        setField(term19620, term19620.getClass(), "color", null);
        setField(term19620, term19620.getClass(), "shape", null);
        setField(term19620, term19620.getClass(), "evolvesFromSpecies", null);
        setField(term19620, term19620.getClass(), "evolutionChain", null);
        setField(term19620, term19620.getClass(), "habitat", null);
        setField(term19620, term19620.getClass(), "generation", null);
        setField(term19620, term19620.getClass(), "names", null);
        setField(term19620, term19620.getClass(), "flavorTextEntries", null);
        setField(term19620, term19620.getClass(), "formDescriptions", null);
        setField(term19620, term19620.getClass(), "genera", null);
        setField(term19620, term19620.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVarieties", argTypes, term19620, args);
    }

};


