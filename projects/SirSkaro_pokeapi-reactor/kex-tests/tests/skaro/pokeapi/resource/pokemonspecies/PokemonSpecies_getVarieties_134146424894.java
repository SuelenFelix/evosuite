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

public class PokemonSpecies_getVarieties_134146424894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80973;

    public PokemonSpecies_getVarieties_134146424894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80973 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term80973, term80973.getClass(), "id", null);
        setField(term80973, term80973.getClass(), "name", null);
        setField(term80973, term80973.getClass(), "order", null);
        setField(term80973, term80973.getClass(), "genderRate", null);
        setField(term80973, term80973.getClass(), "captureRate", null);
        setField(term80973, term80973.getClass(), "baseHappiness", null);
        setField(term80973, term80973.getClass(), "isBaby", null);
        setField(term80973, term80973.getClass(), "isLegendary", null);
        setField(term80973, term80973.getClass(), "isMythical", null);
        setField(term80973, term80973.getClass(), "hatchCounter", null);
        setField(term80973, term80973.getClass(), "hasGenderDifferences", null);
        setField(term80973, term80973.getClass(), "formsSwitchable", null);
        setField(term80973, term80973.getClass(), "growthRate", null);
        setField(term80973, term80973.getClass(), "pokedexNumbers", null);
        setField(term80973, term80973.getClass(), "eggGroups", null);
        setField(term80973, term80973.getClass(), "color", null);
        setField(term80973, term80973.getClass(), "shape", null);
        setField(term80973, term80973.getClass(), "evolvesFromSpecies", null);
        setField(term80973, term80973.getClass(), "evolutionChain", null);
        setField(term80973, term80973.getClass(), "habitat", null);
        setField(term80973, term80973.getClass(), "generation", null);
        setField(term80973, term80973.getClass(), "names", null);
        setField(term80973, term80973.getClass(), "flavorTextEntries", null);
        setField(term80973, term80973.getClass(), "formDescriptions", null);
        setField(term80973, term80973.getClass(), "genera", null);
        setField(term80973, term80973.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVarieties", argTypes, term80973, args);
    }

};


