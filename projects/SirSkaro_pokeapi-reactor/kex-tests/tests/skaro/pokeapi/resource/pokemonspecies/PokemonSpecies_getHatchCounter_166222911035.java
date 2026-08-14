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

public class PokemonSpecies_getHatchCounter_166222911035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67502;

    public PokemonSpecies_getHatchCounter_166222911035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67502 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term67502, term67502.getClass(), "id", null);
        setField(term67502, term67502.getClass(), "name", null);
        setField(term67502, term67502.getClass(), "order", null);
        setField(term67502, term67502.getClass(), "genderRate", null);
        setField(term67502, term67502.getClass(), "captureRate", null);
        setField(term67502, term67502.getClass(), "baseHappiness", null);
        setField(term67502, term67502.getClass(), "isBaby", null);
        setField(term67502, term67502.getClass(), "isLegendary", null);
        setField(term67502, term67502.getClass(), "isMythical", null);
        setField(term67502, term67502.getClass(), "hatchCounter", null);
        setField(term67502, term67502.getClass(), "hasGenderDifferences", null);
        setField(term67502, term67502.getClass(), "formsSwitchable", null);
        setField(term67502, term67502.getClass(), "growthRate", null);
        setField(term67502, term67502.getClass(), "pokedexNumbers", null);
        setField(term67502, term67502.getClass(), "eggGroups", null);
        setField(term67502, term67502.getClass(), "color", null);
        setField(term67502, term67502.getClass(), "shape", null);
        setField(term67502, term67502.getClass(), "evolvesFromSpecies", null);
        setField(term67502, term67502.getClass(), "evolutionChain", null);
        setField(term67502, term67502.getClass(), "habitat", null);
        setField(term67502, term67502.getClass(), "generation", null);
        setField(term67502, term67502.getClass(), "names", null);
        setField(term67502, term67502.getClass(), "flavorTextEntries", null);
        setField(term67502, term67502.getClass(), "formDescriptions", null);
        setField(term67502, term67502.getClass(), "genera", null);
        setField(term67502, term67502.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHatchCounter", argTypes, term67502, args);
    }

};


