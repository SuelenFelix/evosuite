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

public class PokemonSpecies_setIsLegendary_188397624530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66684;

    public PokemonSpecies_setIsLegendary_188397624530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66684 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term66684, term66684.getClass(), "id", null);
        setField(term66684, term66684.getClass(), "name", null);
        setField(term66684, term66684.getClass(), "order", null);
        setField(term66684, term66684.getClass(), "genderRate", null);
        setField(term66684, term66684.getClass(), "captureRate", null);
        setField(term66684, term66684.getClass(), "baseHappiness", null);
        setField(term66684, term66684.getClass(), "isBaby", null);
        setField(term66684, term66684.getClass(), "isLegendary", null);
        setField(term66684, term66684.getClass(), "isMythical", null);
        setField(term66684, term66684.getClass(), "hatchCounter", null);
        setField(term66684, term66684.getClass(), "hasGenderDifferences", null);
        setField(term66684, term66684.getClass(), "formsSwitchable", null);
        setField(term66684, term66684.getClass(), "growthRate", null);
        setField(term66684, term66684.getClass(), "pokedexNumbers", null);
        setField(term66684, term66684.getClass(), "eggGroups", null);
        setField(term66684, term66684.getClass(), "color", null);
        setField(term66684, term66684.getClass(), "shape", null);
        setField(term66684, term66684.getClass(), "evolvesFromSpecies", null);
        setField(term66684, term66684.getClass(), "evolutionChain", null);
        setField(term66684, term66684.getClass(), "habitat", null);
        setField(term66684, term66684.getClass(), "generation", null);
        setField(term66684, term66684.getClass(), "names", null);
        setField(term66684, term66684.getClass(), "flavorTextEntries", null);
        setField(term66684, term66684.getClass(), "formDescriptions", null);
        setField(term66684, term66684.getClass(), "genera", null);
        setField(term66684, term66684.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsLegendary", argTypes, term66684, args);
    }

};


