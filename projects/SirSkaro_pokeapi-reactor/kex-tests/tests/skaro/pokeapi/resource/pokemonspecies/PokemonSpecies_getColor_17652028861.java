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

public class PokemonSpecies_getColor_17652028861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12122;

    public PokemonSpecies_getColor_17652028861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12122 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term12122, term12122.getClass(), "id", null);
        setField(term12122, term12122.getClass(), "name", null);
        setField(term12122, term12122.getClass(), "order", null);
        setField(term12122, term12122.getClass(), "genderRate", null);
        setField(term12122, term12122.getClass(), "captureRate", null);
        setField(term12122, term12122.getClass(), "baseHappiness", null);
        setField(term12122, term12122.getClass(), "isBaby", null);
        setField(term12122, term12122.getClass(), "isLegendary", null);
        setField(term12122, term12122.getClass(), "isMythical", null);
        setField(term12122, term12122.getClass(), "hatchCounter", null);
        setField(term12122, term12122.getClass(), "hasGenderDifferences", null);
        setField(term12122, term12122.getClass(), "formsSwitchable", null);
        setField(term12122, term12122.getClass(), "growthRate", null);
        setField(term12122, term12122.getClass(), "pokedexNumbers", null);
        setField(term12122, term12122.getClass(), "eggGroups", null);
        setField(term12122, term12122.getClass(), "color", null);
        setField(term12122, term12122.getClass(), "shape", null);
        setField(term12122, term12122.getClass(), "evolvesFromSpecies", null);
        setField(term12122, term12122.getClass(), "evolutionChain", null);
        setField(term12122, term12122.getClass(), "habitat", null);
        setField(term12122, term12122.getClass(), "generation", null);
        setField(term12122, term12122.getClass(), "names", null);
        setField(term12122, term12122.getClass(), "flavorTextEntries", null);
        setField(term12122, term12122.getClass(), "formDescriptions", null);
        setField(term12122, term12122.getClass(), "genera", null);
        setField(term12122, term12122.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term12122, args);
    }

};


