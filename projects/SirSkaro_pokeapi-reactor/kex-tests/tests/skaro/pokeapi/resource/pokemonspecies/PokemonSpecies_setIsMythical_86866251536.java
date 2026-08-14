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

public class PokemonSpecies_setIsMythical_86866251536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7533;

    public PokemonSpecies_setIsMythical_86866251536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7533 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term7533, term7533.getClass(), "id", null);
        setField(term7533, term7533.getClass(), "name", null);
        setField(term7533, term7533.getClass(), "order", null);
        setField(term7533, term7533.getClass(), "genderRate", null);
        setField(term7533, term7533.getClass(), "captureRate", null);
        setField(term7533, term7533.getClass(), "baseHappiness", null);
        setField(term7533, term7533.getClass(), "isBaby", null);
        setField(term7533, term7533.getClass(), "isLegendary", null);
        setField(term7533, term7533.getClass(), "isMythical", null);
        setField(term7533, term7533.getClass(), "hatchCounter", null);
        setField(term7533, term7533.getClass(), "hasGenderDifferences", null);
        setField(term7533, term7533.getClass(), "formsSwitchable", null);
        setField(term7533, term7533.getClass(), "growthRate", null);
        setField(term7533, term7533.getClass(), "pokedexNumbers", null);
        setField(term7533, term7533.getClass(), "eggGroups", null);
        setField(term7533, term7533.getClass(), "color", null);
        setField(term7533, term7533.getClass(), "shape", null);
        setField(term7533, term7533.getClass(), "evolvesFromSpecies", null);
        setField(term7533, term7533.getClass(), "evolutionChain", null);
        setField(term7533, term7533.getClass(), "habitat", null);
        setField(term7533, term7533.getClass(), "generation", null);
        setField(term7533, term7533.getClass(), "names", null);
        setField(term7533, term7533.getClass(), "flavorTextEntries", null);
        setField(term7533, term7533.getClass(), "formDescriptions", null);
        setField(term7533, term7533.getClass(), "genera", null);
        setField(term7533, term7533.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsMythical", argTypes, term7533, args);
    }

};


