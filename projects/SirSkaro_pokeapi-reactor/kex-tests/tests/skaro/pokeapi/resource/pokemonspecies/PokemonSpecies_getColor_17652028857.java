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

public class PokemonSpecies_getColor_17652028857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73332;

    public PokemonSpecies_getColor_17652028857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73332 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term73332, term73332.getClass(), "id", null);
        setField(term73332, term73332.getClass(), "name", null);
        setField(term73332, term73332.getClass(), "order", null);
        setField(term73332, term73332.getClass(), "genderRate", null);
        setField(term73332, term73332.getClass(), "captureRate", null);
        setField(term73332, term73332.getClass(), "baseHappiness", null);
        setField(term73332, term73332.getClass(), "isBaby", null);
        setField(term73332, term73332.getClass(), "isLegendary", null);
        setField(term73332, term73332.getClass(), "isMythical", null);
        setField(term73332, term73332.getClass(), "hatchCounter", null);
        setField(term73332, term73332.getClass(), "hasGenderDifferences", null);
        setField(term73332, term73332.getClass(), "formsSwitchable", null);
        setField(term73332, term73332.getClass(), "growthRate", null);
        setField(term73332, term73332.getClass(), "pokedexNumbers", null);
        setField(term73332, term73332.getClass(), "eggGroups", null);
        setField(term73332, term73332.getClass(), "color", null);
        setField(term73332, term73332.getClass(), "shape", null);
        setField(term73332, term73332.getClass(), "evolvesFromSpecies", null);
        setField(term73332, term73332.getClass(), "evolutionChain", null);
        setField(term73332, term73332.getClass(), "habitat", null);
        setField(term73332, term73332.getClass(), "generation", null);
        setField(term73332, term73332.getClass(), "names", null);
        setField(term73332, term73332.getClass(), "flavorTextEntries", null);
        setField(term73332, term73332.getClass(), "formDescriptions", null);
        setField(term73332, term73332.getClass(), "genera", null);
        setField(term73332, term73332.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term73332, args);
    }

};


