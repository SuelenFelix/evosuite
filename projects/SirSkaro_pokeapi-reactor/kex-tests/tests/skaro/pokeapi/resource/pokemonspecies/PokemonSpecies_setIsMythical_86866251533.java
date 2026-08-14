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

public class PokemonSpecies_setIsMythical_86866251533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67238;

    public PokemonSpecies_setIsMythical_86866251533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67238 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term67238, term67238.getClass(), "id", null);
        setField(term67238, term67238.getClass(), "name", null);
        setField(term67238, term67238.getClass(), "order", null);
        setField(term67238, term67238.getClass(), "genderRate", null);
        setField(term67238, term67238.getClass(), "captureRate", null);
        setField(term67238, term67238.getClass(), "baseHappiness", null);
        setField(term67238, term67238.getClass(), "isBaby", null);
        setField(term67238, term67238.getClass(), "isLegendary", null);
        setField(term67238, term67238.getClass(), "isMythical", null);
        setField(term67238, term67238.getClass(), "hatchCounter", null);
        setField(term67238, term67238.getClass(), "hasGenderDifferences", null);
        setField(term67238, term67238.getClass(), "formsSwitchable", null);
        setField(term67238, term67238.getClass(), "growthRate", null);
        setField(term67238, term67238.getClass(), "pokedexNumbers", null);
        setField(term67238, term67238.getClass(), "eggGroups", null);
        setField(term67238, term67238.getClass(), "color", null);
        setField(term67238, term67238.getClass(), "shape", null);
        setField(term67238, term67238.getClass(), "evolvesFromSpecies", null);
        setField(term67238, term67238.getClass(), "evolutionChain", null);
        setField(term67238, term67238.getClass(), "habitat", null);
        setField(term67238, term67238.getClass(), "generation", null);
        setField(term67238, term67238.getClass(), "names", null);
        setField(term67238, term67238.getClass(), "flavorTextEntries", null);
        setField(term67238, term67238.getClass(), "formDescriptions", null);
        setField(term67238, term67238.getClass(), "genera", null);
        setField(term67238, term67238.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsMythical", argTypes, term67238, args);
    }

};


