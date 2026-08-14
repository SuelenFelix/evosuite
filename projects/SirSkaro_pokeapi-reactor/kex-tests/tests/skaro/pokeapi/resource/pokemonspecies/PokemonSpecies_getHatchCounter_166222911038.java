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

public class PokemonSpecies_getHatchCounter_166222911038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7865;

    public PokemonSpecies_getHatchCounter_166222911038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7865 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term7865, term7865.getClass(), "id", null);
        setField(term7865, term7865.getClass(), "name", null);
        setField(term7865, term7865.getClass(), "order", null);
        setField(term7865, term7865.getClass(), "genderRate", null);
        setField(term7865, term7865.getClass(), "captureRate", null);
        setField(term7865, term7865.getClass(), "baseHappiness", null);
        setField(term7865, term7865.getClass(), "isBaby", null);
        setField(term7865, term7865.getClass(), "isLegendary", null);
        setField(term7865, term7865.getClass(), "isMythical", null);
        setField(term7865, term7865.getClass(), "hatchCounter", null);
        setField(term7865, term7865.getClass(), "hasGenderDifferences", null);
        setField(term7865, term7865.getClass(), "formsSwitchable", null);
        setField(term7865, term7865.getClass(), "growthRate", null);
        setField(term7865, term7865.getClass(), "pokedexNumbers", null);
        setField(term7865, term7865.getClass(), "eggGroups", null);
        setField(term7865, term7865.getClass(), "color", null);
        setField(term7865, term7865.getClass(), "shape", null);
        setField(term7865, term7865.getClass(), "evolvesFromSpecies", null);
        setField(term7865, term7865.getClass(), "evolutionChain", null);
        setField(term7865, term7865.getClass(), "habitat", null);
        setField(term7865, term7865.getClass(), "generation", null);
        setField(term7865, term7865.getClass(), "names", null);
        setField(term7865, term7865.getClass(), "flavorTextEntries", null);
        setField(term7865, term7865.getClass(), "formDescriptions", null);
        setField(term7865, term7865.getClass(), "genera", null);
        setField(term7865, term7865.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHatchCounter", argTypes, term7865, args);
    }

};


