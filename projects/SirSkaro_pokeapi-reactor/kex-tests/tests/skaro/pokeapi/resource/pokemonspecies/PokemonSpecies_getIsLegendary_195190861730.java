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

public class PokemonSpecies_getIsLegendary_195190861730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6350;

    public PokemonSpecies_getIsLegendary_195190861730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6350 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term6350, term6350.getClass(), "id", null);
        setField(term6350, term6350.getClass(), "name", null);
        setField(term6350, term6350.getClass(), "order", null);
        setField(term6350, term6350.getClass(), "genderRate", null);
        setField(term6350, term6350.getClass(), "captureRate", null);
        setField(term6350, term6350.getClass(), "baseHappiness", null);
        setField(term6350, term6350.getClass(), "isBaby", null);
        setField(term6350, term6350.getClass(), "isLegendary", null);
        setField(term6350, term6350.getClass(), "isMythical", null);
        setField(term6350, term6350.getClass(), "hatchCounter", null);
        setField(term6350, term6350.getClass(), "hasGenderDifferences", null);
        setField(term6350, term6350.getClass(), "formsSwitchable", null);
        setField(term6350, term6350.getClass(), "growthRate", null);
        setField(term6350, term6350.getClass(), "pokedexNumbers", null);
        setField(term6350, term6350.getClass(), "eggGroups", null);
        setField(term6350, term6350.getClass(), "color", null);
        setField(term6350, term6350.getClass(), "shape", null);
        setField(term6350, term6350.getClass(), "evolvesFromSpecies", null);
        setField(term6350, term6350.getClass(), "evolutionChain", null);
        setField(term6350, term6350.getClass(), "habitat", null);
        setField(term6350, term6350.getClass(), "generation", null);
        setField(term6350, term6350.getClass(), "names", null);
        setField(term6350, term6350.getClass(), "flavorTextEntries", null);
        setField(term6350, term6350.getClass(), "formDescriptions", null);
        setField(term6350, term6350.getClass(), "genera", null);
        setField(term6350, term6350.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsLegendary", argTypes, term6350, args);
    }

};


