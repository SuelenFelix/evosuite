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

public class PokemonSpecies_setGrowthRate_156621884849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70525;

    public PokemonSpecies_setGrowthRate_156621884849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70525 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term70525, term70525.getClass(), "id", null);
        setField(term70525, term70525.getClass(), "name", null);
        setField(term70525, term70525.getClass(), "order", null);
        setField(term70525, term70525.getClass(), "genderRate", null);
        setField(term70525, term70525.getClass(), "captureRate", null);
        setField(term70525, term70525.getClass(), "baseHappiness", null);
        setField(term70525, term70525.getClass(), "isBaby", null);
        setField(term70525, term70525.getClass(), "isLegendary", null);
        setField(term70525, term70525.getClass(), "isMythical", null);
        setField(term70525, term70525.getClass(), "hatchCounter", null);
        setField(term70525, term70525.getClass(), "hasGenderDifferences", null);
        setField(term70525, term70525.getClass(), "formsSwitchable", null);
        setField(term70525, term70525.getClass(), "growthRate", null);
        setField(term70525, term70525.getClass(), "pokedexNumbers", null);
        setField(term70525, term70525.getClass(), "eggGroups", null);
        setField(term70525, term70525.getClass(), "color", null);
        setField(term70525, term70525.getClass(), "shape", null);
        setField(term70525, term70525.getClass(), "evolvesFromSpecies", null);
        setField(term70525, term70525.getClass(), "evolutionChain", null);
        setField(term70525, term70525.getClass(), "habitat", null);
        setField(term70525, term70525.getClass(), "generation", null);
        setField(term70525, term70525.getClass(), "names", null);
        setField(term70525, term70525.getClass(), "flavorTextEntries", null);
        setField(term70525, term70525.getClass(), "formDescriptions", null);
        setField(term70525, term70525.getClass(), "genera", null);
        setField(term70525, term70525.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGrowthRate", argTypes, term70525, args);
    }

};


