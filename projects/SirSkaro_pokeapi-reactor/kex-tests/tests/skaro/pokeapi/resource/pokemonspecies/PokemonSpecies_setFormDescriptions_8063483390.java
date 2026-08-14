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

public class PokemonSpecies_setFormDescriptions_8063483390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78886;

    public PokemonSpecies_setFormDescriptions_8063483390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78886 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term78886, term78886.getClass(), "id", null);
        setField(term78886, term78886.getClass(), "name", null);
        setField(term78886, term78886.getClass(), "order", null);
        setField(term78886, term78886.getClass(), "genderRate", null);
        setField(term78886, term78886.getClass(), "captureRate", null);
        setField(term78886, term78886.getClass(), "baseHappiness", null);
        setField(term78886, term78886.getClass(), "isBaby", null);
        setField(term78886, term78886.getClass(), "isLegendary", null);
        setField(term78886, term78886.getClass(), "isMythical", null);
        setField(term78886, term78886.getClass(), "hatchCounter", null);
        setField(term78886, term78886.getClass(), "hasGenderDifferences", null);
        setField(term78886, term78886.getClass(), "formsSwitchable", null);
        setField(term78886, term78886.getClass(), "growthRate", null);
        setField(term78886, term78886.getClass(), "pokedexNumbers", null);
        setField(term78886, term78886.getClass(), "eggGroups", null);
        setField(term78886, term78886.getClass(), "color", null);
        setField(term78886, term78886.getClass(), "shape", null);
        setField(term78886, term78886.getClass(), "evolvesFromSpecies", null);
        setField(term78886, term78886.getClass(), "evolutionChain", null);
        setField(term78886, term78886.getClass(), "habitat", null);
        setField(term78886, term78886.getClass(), "generation", null);
        setField(term78886, term78886.getClass(), "names", null);
        setField(term78886, term78886.getClass(), "flavorTextEntries", null);
        setField(term78886, term78886.getClass(), "formDescriptions", null);
        setField(term78886, term78886.getClass(), "genera", null);
        setField(term78886, term78886.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormDescriptions", argTypes, term78886, args);
    }

};


