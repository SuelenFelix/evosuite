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

public class PokemonSpecies_setBaseHappiness_199158857022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64990;

    public PokemonSpecies_setBaseHappiness_199158857022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64990 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term64990, term64990.getClass(), "id", null);
        setField(term64990, term64990.getClass(), "name", null);
        setField(term64990, term64990.getClass(), "order", null);
        setField(term64990, term64990.getClass(), "genderRate", null);
        setField(term64990, term64990.getClass(), "captureRate", null);
        setField(term64990, term64990.getClass(), "baseHappiness", null);
        setField(term64990, term64990.getClass(), "isBaby", null);
        setField(term64990, term64990.getClass(), "isLegendary", null);
        setField(term64990, term64990.getClass(), "isMythical", null);
        setField(term64990, term64990.getClass(), "hatchCounter", null);
        setField(term64990, term64990.getClass(), "hasGenderDifferences", null);
        setField(term64990, term64990.getClass(), "formsSwitchable", null);
        setField(term64990, term64990.getClass(), "growthRate", null);
        setField(term64990, term64990.getClass(), "pokedexNumbers", null);
        setField(term64990, term64990.getClass(), "eggGroups", null);
        setField(term64990, term64990.getClass(), "color", null);
        setField(term64990, term64990.getClass(), "shape", null);
        setField(term64990, term64990.getClass(), "evolvesFromSpecies", null);
        setField(term64990, term64990.getClass(), "evolutionChain", null);
        setField(term64990, term64990.getClass(), "habitat", null);
        setField(term64990, term64990.getClass(), "generation", null);
        setField(term64990, term64990.getClass(), "names", null);
        setField(term64990, term64990.getClass(), "flavorTextEntries", null);
        setField(term64990, term64990.getClass(), "formDescriptions", null);
        setField(term64990, term64990.getClass(), "genera", null);
        setField(term64990, term64990.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBaseHappiness", argTypes, term64990, args);
    }

};


