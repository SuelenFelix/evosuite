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

public class PokemonSpecies_getCaptureRate_180299237218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4125;

    public PokemonSpecies_getCaptureRate_180299237218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4125 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term4125, term4125.getClass(), "id", null);
        setField(term4125, term4125.getClass(), "name", null);
        setField(term4125, term4125.getClass(), "order", null);
        setField(term4125, term4125.getClass(), "genderRate", null);
        setField(term4125, term4125.getClass(), "captureRate", null);
        setField(term4125, term4125.getClass(), "baseHappiness", null);
        setField(term4125, term4125.getClass(), "isBaby", null);
        setField(term4125, term4125.getClass(), "isLegendary", null);
        setField(term4125, term4125.getClass(), "isMythical", null);
        setField(term4125, term4125.getClass(), "hatchCounter", null);
        setField(term4125, term4125.getClass(), "hasGenderDifferences", null);
        setField(term4125, term4125.getClass(), "formsSwitchable", null);
        setField(term4125, term4125.getClass(), "growthRate", null);
        setField(term4125, term4125.getClass(), "pokedexNumbers", null);
        setField(term4125, term4125.getClass(), "eggGroups", null);
        setField(term4125, term4125.getClass(), "color", null);
        setField(term4125, term4125.getClass(), "shape", null);
        setField(term4125, term4125.getClass(), "evolvesFromSpecies", null);
        setField(term4125, term4125.getClass(), "evolutionChain", null);
        setField(term4125, term4125.getClass(), "habitat", null);
        setField(term4125, term4125.getClass(), "generation", null);
        setField(term4125, term4125.getClass(), "names", null);
        setField(term4125, term4125.getClass(), "flavorTextEntries", null);
        setField(term4125, term4125.getClass(), "formDescriptions", null);
        setField(term4125, term4125.getClass(), "genera", null);
        setField(term4125, term4125.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCaptureRate", argTypes, term4125, args);
    }

};


