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

public class PokemonSpecies_setEggGroups_130631621559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11736;

    public PokemonSpecies_setEggGroups_130631621559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11736 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term11736, term11736.getClass(), "id", null);
        setField(term11736, term11736.getClass(), "name", null);
        setField(term11736, term11736.getClass(), "order", null);
        setField(term11736, term11736.getClass(), "genderRate", null);
        setField(term11736, term11736.getClass(), "captureRate", null);
        setField(term11736, term11736.getClass(), "baseHappiness", null);
        setField(term11736, term11736.getClass(), "isBaby", null);
        setField(term11736, term11736.getClass(), "isLegendary", null);
        setField(term11736, term11736.getClass(), "isMythical", null);
        setField(term11736, term11736.getClass(), "hatchCounter", null);
        setField(term11736, term11736.getClass(), "hasGenderDifferences", null);
        setField(term11736, term11736.getClass(), "formsSwitchable", null);
        setField(term11736, term11736.getClass(), "growthRate", null);
        setField(term11736, term11736.getClass(), "pokedexNumbers", null);
        setField(term11736, term11736.getClass(), "eggGroups", null);
        setField(term11736, term11736.getClass(), "color", null);
        setField(term11736, term11736.getClass(), "shape", null);
        setField(term11736, term11736.getClass(), "evolvesFromSpecies", null);
        setField(term11736, term11736.getClass(), "evolutionChain", null);
        setField(term11736, term11736.getClass(), "habitat", null);
        setField(term11736, term11736.getClass(), "generation", null);
        setField(term11736, term11736.getClass(), "names", null);
        setField(term11736, term11736.getClass(), "flavorTextEntries", null);
        setField(term11736, term11736.getClass(), "formDescriptions", null);
        setField(term11736, term11736.getClass(), "genera", null);
        setField(term11736, term11736.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEggGroups", argTypes, term11736, args);
    }

};


