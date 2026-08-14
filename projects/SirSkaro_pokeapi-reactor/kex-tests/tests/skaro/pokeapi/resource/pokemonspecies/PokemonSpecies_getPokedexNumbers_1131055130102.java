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

public class PokemonSpecies_getPokedexNumbers_1131055130102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19945;

    public PokemonSpecies_getPokedexNumbers_1131055130102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19945 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term19945, term19945.getClass(), "id", null);
        setField(term19945, term19945.getClass(), "name", null);
        setField(term19945, term19945.getClass(), "order", null);
        setField(term19945, term19945.getClass(), "genderRate", null);
        setField(term19945, term19945.getClass(), "captureRate", null);
        setField(term19945, term19945.getClass(), "baseHappiness", null);
        setField(term19945, term19945.getClass(), "isBaby", null);
        setField(term19945, term19945.getClass(), "isLegendary", null);
        setField(term19945, term19945.getClass(), "isMythical", null);
        setField(term19945, term19945.getClass(), "hatchCounter", null);
        setField(term19945, term19945.getClass(), "hasGenderDifferences", null);
        setField(term19945, term19945.getClass(), "formsSwitchable", null);
        setField(term19945, term19945.getClass(), "growthRate", null);
        setField(term19945, term19945.getClass(), "pokedexNumbers", null);
        setField(term19945, term19945.getClass(), "eggGroups", null);
        setField(term19945, term19945.getClass(), "color", null);
        setField(term19945, term19945.getClass(), "shape", null);
        setField(term19945, term19945.getClass(), "evolvesFromSpecies", null);
        setField(term19945, term19945.getClass(), "evolutionChain", null);
        setField(term19945, term19945.getClass(), "habitat", null);
        setField(term19945, term19945.getClass(), "generation", null);
        setField(term19945, term19945.getClass(), "names", null);
        setField(term19945, term19945.getClass(), "flavorTextEntries", null);
        setField(term19945, term19945.getClass(), "formDescriptions", null);
        setField(term19945, term19945.getClass(), "genera", null);
        setField(term19945, term19945.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokedexNumbers", argTypes, term19945, args);
    }

};


