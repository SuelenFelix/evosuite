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

public class PokemonSpecies_getGenera_107616705892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79174;

    public PokemonSpecies_getGenera_107616705892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79174 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term79174, term79174.getClass(), "id", null);
        setField(term79174, term79174.getClass(), "name", null);
        setField(term79174, term79174.getClass(), "order", null);
        setField(term79174, term79174.getClass(), "genderRate", null);
        setField(term79174, term79174.getClass(), "captureRate", null);
        setField(term79174, term79174.getClass(), "baseHappiness", null);
        setField(term79174, term79174.getClass(), "isBaby", null);
        setField(term79174, term79174.getClass(), "isLegendary", null);
        setField(term79174, term79174.getClass(), "isMythical", null);
        setField(term79174, term79174.getClass(), "hatchCounter", null);
        setField(term79174, term79174.getClass(), "hasGenderDifferences", null);
        setField(term79174, term79174.getClass(), "formsSwitchable", null);
        setField(term79174, term79174.getClass(), "growthRate", null);
        setField(term79174, term79174.getClass(), "pokedexNumbers", null);
        setField(term79174, term79174.getClass(), "eggGroups", null);
        setField(term79174, term79174.getClass(), "color", null);
        setField(term79174, term79174.getClass(), "shape", null);
        setField(term79174, term79174.getClass(), "evolvesFromSpecies", null);
        setField(term79174, term79174.getClass(), "evolutionChain", null);
        setField(term79174, term79174.getClass(), "habitat", null);
        setField(term79174, term79174.getClass(), "generation", null);
        setField(term79174, term79174.getClass(), "names", null);
        setField(term79174, term79174.getClass(), "flavorTextEntries", null);
        setField(term79174, term79174.getClass(), "formDescriptions", null);
        setField(term79174, term79174.getClass(), "genera", null);
        setField(term79174, term79174.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenera", argTypes, term79174, args);
    }

};


