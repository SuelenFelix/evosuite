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

public class PokemonSpecies_getBaseHappiness_211035866022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4820;

    public PokemonSpecies_getBaseHappiness_211035866022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4820 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term4820, term4820.getClass(), "id", null);
        setField(term4820, term4820.getClass(), "name", null);
        setField(term4820, term4820.getClass(), "order", null);
        setField(term4820, term4820.getClass(), "genderRate", null);
        setField(term4820, term4820.getClass(), "captureRate", null);
        setField(term4820, term4820.getClass(), "baseHappiness", null);
        setField(term4820, term4820.getClass(), "isBaby", null);
        setField(term4820, term4820.getClass(), "isLegendary", null);
        setField(term4820, term4820.getClass(), "isMythical", null);
        setField(term4820, term4820.getClass(), "hatchCounter", null);
        setField(term4820, term4820.getClass(), "hasGenderDifferences", null);
        setField(term4820, term4820.getClass(), "formsSwitchable", null);
        setField(term4820, term4820.getClass(), "growthRate", null);
        setField(term4820, term4820.getClass(), "pokedexNumbers", null);
        setField(term4820, term4820.getClass(), "eggGroups", null);
        setField(term4820, term4820.getClass(), "color", null);
        setField(term4820, term4820.getClass(), "shape", null);
        setField(term4820, term4820.getClass(), "evolvesFromSpecies", null);
        setField(term4820, term4820.getClass(), "evolutionChain", null);
        setField(term4820, term4820.getClass(), "habitat", null);
        setField(term4820, term4820.getClass(), "generation", null);
        setField(term4820, term4820.getClass(), "names", null);
        setField(term4820, term4820.getClass(), "flavorTextEntries", null);
        setField(term4820, term4820.getClass(), "formDescriptions", null);
        setField(term4820, term4820.getClass(), "genera", null);
        setField(term4820, term4820.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseHappiness", argTypes, term4820, args);
    }

};


