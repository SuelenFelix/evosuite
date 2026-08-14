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

public class PokemonSpecies_getGenera_107616705894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18788;

    public PokemonSpecies_getGenera_107616705894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18788 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term18788, term18788.getClass(), "id", null);
        setField(term18788, term18788.getClass(), "name", null);
        setField(term18788, term18788.getClass(), "order", null);
        setField(term18788, term18788.getClass(), "genderRate", null);
        setField(term18788, term18788.getClass(), "captureRate", null);
        setField(term18788, term18788.getClass(), "baseHappiness", null);
        setField(term18788, term18788.getClass(), "isBaby", null);
        setField(term18788, term18788.getClass(), "isLegendary", null);
        setField(term18788, term18788.getClass(), "isMythical", null);
        setField(term18788, term18788.getClass(), "hatchCounter", null);
        setField(term18788, term18788.getClass(), "hasGenderDifferences", null);
        setField(term18788, term18788.getClass(), "formsSwitchable", null);
        setField(term18788, term18788.getClass(), "growthRate", null);
        setField(term18788, term18788.getClass(), "pokedexNumbers", null);
        setField(term18788, term18788.getClass(), "eggGroups", null);
        setField(term18788, term18788.getClass(), "color", null);
        setField(term18788, term18788.getClass(), "shape", null);
        setField(term18788, term18788.getClass(), "evolvesFromSpecies", null);
        setField(term18788, term18788.getClass(), "evolutionChain", null);
        setField(term18788, term18788.getClass(), "habitat", null);
        setField(term18788, term18788.getClass(), "generation", null);
        setField(term18788, term18788.getClass(), "names", null);
        setField(term18788, term18788.getClass(), "flavorTextEntries", null);
        setField(term18788, term18788.getClass(), "formDescriptions", null);
        setField(term18788, term18788.getClass(), "genera", null);
        setField(term18788, term18788.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenera", argTypes, term18788, args);
    }

};


