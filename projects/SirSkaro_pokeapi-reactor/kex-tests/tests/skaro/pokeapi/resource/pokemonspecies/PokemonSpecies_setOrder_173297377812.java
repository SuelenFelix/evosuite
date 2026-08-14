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

public class PokemonSpecies_setOrder_173297377812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112;

    public PokemonSpecies_setOrder_173297377812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3112 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term3112, term3112.getClass(), "id", null);
        setField(term3112, term3112.getClass(), "name", null);
        setField(term3112, term3112.getClass(), "order", null);
        setField(term3112, term3112.getClass(), "genderRate", null);
        setField(term3112, term3112.getClass(), "captureRate", null);
        setField(term3112, term3112.getClass(), "baseHappiness", null);
        setField(term3112, term3112.getClass(), "isBaby", null);
        setField(term3112, term3112.getClass(), "isLegendary", null);
        setField(term3112, term3112.getClass(), "isMythical", null);
        setField(term3112, term3112.getClass(), "hatchCounter", null);
        setField(term3112, term3112.getClass(), "hasGenderDifferences", null);
        setField(term3112, term3112.getClass(), "formsSwitchable", null);
        setField(term3112, term3112.getClass(), "growthRate", null);
        setField(term3112, term3112.getClass(), "pokedexNumbers", null);
        setField(term3112, term3112.getClass(), "eggGroups", null);
        setField(term3112, term3112.getClass(), "color", null);
        setField(term3112, term3112.getClass(), "shape", null);
        setField(term3112, term3112.getClass(), "evolvesFromSpecies", null);
        setField(term3112, term3112.getClass(), "evolutionChain", null);
        setField(term3112, term3112.getClass(), "habitat", null);
        setField(term3112, term3112.getClass(), "generation", null);
        setField(term3112, term3112.getClass(), "names", null);
        setField(term3112, term3112.getClass(), "flavorTextEntries", null);
        setField(term3112, term3112.getClass(), "formDescriptions", null);
        setField(term3112, term3112.getClass(), "genera", null);
        setField(term3112, term3112.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrder", argTypes, term3112, args);
    }

};


