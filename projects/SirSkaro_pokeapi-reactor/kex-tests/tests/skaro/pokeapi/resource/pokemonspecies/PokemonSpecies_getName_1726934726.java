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

public class PokemonSpecies_getName_1726934726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1966;

    public PokemonSpecies_getName_1726934726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1966 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term1966, term1966.getClass(), "id", null);
        setField(term1966, term1966.getClass(), "name", null);
        setField(term1966, term1966.getClass(), "order", null);
        setField(term1966, term1966.getClass(), "genderRate", null);
        setField(term1966, term1966.getClass(), "captureRate", null);
        setField(term1966, term1966.getClass(), "baseHappiness", null);
        setField(term1966, term1966.getClass(), "isBaby", null);
        setField(term1966, term1966.getClass(), "isLegendary", null);
        setField(term1966, term1966.getClass(), "isMythical", null);
        setField(term1966, term1966.getClass(), "hatchCounter", null);
        setField(term1966, term1966.getClass(), "hasGenderDifferences", null);
        setField(term1966, term1966.getClass(), "formsSwitchable", null);
        setField(term1966, term1966.getClass(), "growthRate", null);
        setField(term1966, term1966.getClass(), "pokedexNumbers", null);
        setField(term1966, term1966.getClass(), "eggGroups", null);
        setField(term1966, term1966.getClass(), "color", null);
        setField(term1966, term1966.getClass(), "shape", null);
        setField(term1966, term1966.getClass(), "evolvesFromSpecies", null);
        setField(term1966, term1966.getClass(), "evolutionChain", null);
        setField(term1966, term1966.getClass(), "habitat", null);
        setField(term1966, term1966.getClass(), "generation", null);
        setField(term1966, term1966.getClass(), "names", null);
        setField(term1966, term1966.getClass(), "flavorTextEntries", null);
        setField(term1966, term1966.getClass(), "formDescriptions", null);
        setField(term1966, term1966.getClass(), "genera", null);
        setField(term1966, term1966.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1966, args);
    }

};


