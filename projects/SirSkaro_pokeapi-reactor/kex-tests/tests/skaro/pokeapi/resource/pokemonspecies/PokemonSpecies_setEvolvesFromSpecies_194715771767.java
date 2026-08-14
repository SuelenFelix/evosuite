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

public class PokemonSpecies_setEvolvesFromSpecies_194715771767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74173;

    public PokemonSpecies_setEvolvesFromSpecies_194715771767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74173 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term74173, term74173.getClass(), "id", null);
        setField(term74173, term74173.getClass(), "name", null);
        setField(term74173, term74173.getClass(), "order", null);
        setField(term74173, term74173.getClass(), "genderRate", null);
        setField(term74173, term74173.getClass(), "captureRate", null);
        setField(term74173, term74173.getClass(), "baseHappiness", null);
        setField(term74173, term74173.getClass(), "isBaby", null);
        setField(term74173, term74173.getClass(), "isLegendary", null);
        setField(term74173, term74173.getClass(), "isMythical", null);
        setField(term74173, term74173.getClass(), "hatchCounter", null);
        setField(term74173, term74173.getClass(), "hasGenderDifferences", null);
        setField(term74173, term74173.getClass(), "formsSwitchable", null);
        setField(term74173, term74173.getClass(), "growthRate", null);
        setField(term74173, term74173.getClass(), "pokedexNumbers", null);
        setField(term74173, term74173.getClass(), "eggGroups", null);
        setField(term74173, term74173.getClass(), "color", null);
        setField(term74173, term74173.getClass(), "shape", null);
        setField(term74173, term74173.getClass(), "evolvesFromSpecies", null);
        setField(term74173, term74173.getClass(), "evolutionChain", null);
        setField(term74173, term74173.getClass(), "habitat", null);
        setField(term74173, term74173.getClass(), "generation", null);
        setField(term74173, term74173.getClass(), "names", null);
        setField(term74173, term74173.getClass(), "flavorTextEntries", null);
        setField(term74173, term74173.getClass(), "formDescriptions", null);
        setField(term74173, term74173.getClass(), "genera", null);
        setField(term74173, term74173.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEvolvesFromSpecies", argTypes, term74173, args);
    }

};


