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

public class PokemonSpecies_getIsLegendary_195190861728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66256;

    public PokemonSpecies_getIsLegendary_195190861728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66256 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term66256, term66256.getClass(), "id", null);
        setField(term66256, term66256.getClass(), "name", null);
        setField(term66256, term66256.getClass(), "order", null);
        setField(term66256, term66256.getClass(), "genderRate", null);
        setField(term66256, term66256.getClass(), "captureRate", null);
        setField(term66256, term66256.getClass(), "baseHappiness", null);
        setField(term66256, term66256.getClass(), "isBaby", null);
        setField(term66256, term66256.getClass(), "isLegendary", null);
        setField(term66256, term66256.getClass(), "isMythical", null);
        setField(term66256, term66256.getClass(), "hatchCounter", null);
        setField(term66256, term66256.getClass(), "hasGenderDifferences", null);
        setField(term66256, term66256.getClass(), "formsSwitchable", null);
        setField(term66256, term66256.getClass(), "growthRate", null);
        setField(term66256, term66256.getClass(), "pokedexNumbers", null);
        setField(term66256, term66256.getClass(), "eggGroups", null);
        setField(term66256, term66256.getClass(), "color", null);
        setField(term66256, term66256.getClass(), "shape", null);
        setField(term66256, term66256.getClass(), "evolvesFromSpecies", null);
        setField(term66256, term66256.getClass(), "evolutionChain", null);
        setField(term66256, term66256.getClass(), "habitat", null);
        setField(term66256, term66256.getClass(), "generation", null);
        setField(term66256, term66256.getClass(), "names", null);
        setField(term66256, term66256.getClass(), "flavorTextEntries", null);
        setField(term66256, term66256.getClass(), "formDescriptions", null);
        setField(term66256, term66256.getClass(), "genera", null);
        setField(term66256, term66256.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsLegendary", argTypes, term66256, args);
    }

};


