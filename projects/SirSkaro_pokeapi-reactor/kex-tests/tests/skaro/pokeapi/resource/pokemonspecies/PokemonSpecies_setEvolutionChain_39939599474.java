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

public class PokemonSpecies_setEvolutionChain_39939599474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14848;

    public PokemonSpecies_setEvolutionChain_39939599474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14848 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term14848, term14848.getClass(), "id", null);
        setField(term14848, term14848.getClass(), "name", null);
        setField(term14848, term14848.getClass(), "order", null);
        setField(term14848, term14848.getClass(), "genderRate", null);
        setField(term14848, term14848.getClass(), "captureRate", null);
        setField(term14848, term14848.getClass(), "baseHappiness", null);
        setField(term14848, term14848.getClass(), "isBaby", null);
        setField(term14848, term14848.getClass(), "isLegendary", null);
        setField(term14848, term14848.getClass(), "isMythical", null);
        setField(term14848, term14848.getClass(), "hatchCounter", null);
        setField(term14848, term14848.getClass(), "hasGenderDifferences", null);
        setField(term14848, term14848.getClass(), "formsSwitchable", null);
        setField(term14848, term14848.getClass(), "growthRate", null);
        setField(term14848, term14848.getClass(), "pokedexNumbers", null);
        setField(term14848, term14848.getClass(), "eggGroups", null);
        setField(term14848, term14848.getClass(), "color", null);
        setField(term14848, term14848.getClass(), "shape", null);
        setField(term14848, term14848.getClass(), "evolvesFromSpecies", null);
        setField(term14848, term14848.getClass(), "evolutionChain", null);
        setField(term14848, term14848.getClass(), "habitat", null);
        setField(term14848, term14848.getClass(), "generation", null);
        setField(term14848, term14848.getClass(), "names", null);
        setField(term14848, term14848.getClass(), "flavorTextEntries", null);
        setField(term14848, term14848.getClass(), "formDescriptions", null);
        setField(term14848, term14848.getClass(), "genera", null);
        setField(term14848, term14848.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.ApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEvolutionChain", argTypes, term14848, args);
    }

};


