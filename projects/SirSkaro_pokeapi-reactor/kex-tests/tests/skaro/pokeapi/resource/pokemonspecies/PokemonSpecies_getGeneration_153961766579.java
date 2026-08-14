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

public class PokemonSpecies_getGeneration_153961766579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15851;

    public PokemonSpecies_getGeneration_153961766579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15851 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term15851, term15851.getClass(), "id", null);
        setField(term15851, term15851.getClass(), "name", null);
        setField(term15851, term15851.getClass(), "order", null);
        setField(term15851, term15851.getClass(), "genderRate", null);
        setField(term15851, term15851.getClass(), "captureRate", null);
        setField(term15851, term15851.getClass(), "baseHappiness", null);
        setField(term15851, term15851.getClass(), "isBaby", null);
        setField(term15851, term15851.getClass(), "isLegendary", null);
        setField(term15851, term15851.getClass(), "isMythical", null);
        setField(term15851, term15851.getClass(), "hatchCounter", null);
        setField(term15851, term15851.getClass(), "hasGenderDifferences", null);
        setField(term15851, term15851.getClass(), "formsSwitchable", null);
        setField(term15851, term15851.getClass(), "growthRate", null);
        setField(term15851, term15851.getClass(), "pokedexNumbers", null);
        setField(term15851, term15851.getClass(), "eggGroups", null);
        setField(term15851, term15851.getClass(), "color", null);
        setField(term15851, term15851.getClass(), "shape", null);
        setField(term15851, term15851.getClass(), "evolvesFromSpecies", null);
        setField(term15851, term15851.getClass(), "evolutionChain", null);
        setField(term15851, term15851.getClass(), "habitat", null);
        setField(term15851, term15851.getClass(), "generation", null);
        setField(term15851, term15851.getClass(), "names", null);
        setField(term15851, term15851.getClass(), "flavorTextEntries", null);
        setField(term15851, term15851.getClass(), "formDescriptions", null);
        setField(term15851, term15851.getClass(), "genera", null);
        setField(term15851, term15851.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term15851, args);
    }

};


