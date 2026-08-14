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

public class PokemonSpecies_setVarieties_158729925498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80180;

    public PokemonSpecies_setVarieties_158729925498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80180 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term80180, term80180.getClass(), "id", null);
        setField(term80180, term80180.getClass(), "name", null);
        setField(term80180, term80180.getClass(), "order", null);
        setField(term80180, term80180.getClass(), "genderRate", null);
        setField(term80180, term80180.getClass(), "captureRate", null);
        setField(term80180, term80180.getClass(), "baseHappiness", null);
        setField(term80180, term80180.getClass(), "isBaby", null);
        setField(term80180, term80180.getClass(), "isLegendary", null);
        setField(term80180, term80180.getClass(), "isMythical", null);
        setField(term80180, term80180.getClass(), "hatchCounter", null);
        setField(term80180, term80180.getClass(), "hasGenderDifferences", null);
        setField(term80180, term80180.getClass(), "formsSwitchable", null);
        setField(term80180, term80180.getClass(), "growthRate", null);
        setField(term80180, term80180.getClass(), "pokedexNumbers", null);
        setField(term80180, term80180.getClass(), "eggGroups", null);
        setField(term80180, term80180.getClass(), "color", null);
        setField(term80180, term80180.getClass(), "shape", null);
        setField(term80180, term80180.getClass(), "evolvesFromSpecies", null);
        setField(term80180, term80180.getClass(), "evolutionChain", null);
        setField(term80180, term80180.getClass(), "habitat", null);
        setField(term80180, term80180.getClass(), "generation", null);
        setField(term80180, term80180.getClass(), "names", null);
        setField(term80180, term80180.getClass(), "flavorTextEntries", null);
        setField(term80180, term80180.getClass(), "formDescriptions", null);
        setField(term80180, term80180.getClass(), "genera", null);
        setField(term80180, term80180.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVarieties", argTypes, term80180, args);
    }

};


