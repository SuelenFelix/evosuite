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

public class PokemonSpecies_getIsBaby_46712534824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65364;

    public PokemonSpecies_getIsBaby_46712534824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65364 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term65364, term65364.getClass(), "id", null);
        setField(term65364, term65364.getClass(), "name", null);
        setField(term65364, term65364.getClass(), "order", null);
        setField(term65364, term65364.getClass(), "genderRate", null);
        setField(term65364, term65364.getClass(), "captureRate", null);
        setField(term65364, term65364.getClass(), "baseHappiness", null);
        setField(term65364, term65364.getClass(), "isBaby", null);
        setField(term65364, term65364.getClass(), "isLegendary", null);
        setField(term65364, term65364.getClass(), "isMythical", null);
        setField(term65364, term65364.getClass(), "hatchCounter", null);
        setField(term65364, term65364.getClass(), "hasGenderDifferences", null);
        setField(term65364, term65364.getClass(), "formsSwitchable", null);
        setField(term65364, term65364.getClass(), "growthRate", null);
        setField(term65364, term65364.getClass(), "pokedexNumbers", null);
        setField(term65364, term65364.getClass(), "eggGroups", null);
        setField(term65364, term65364.getClass(), "color", null);
        setField(term65364, term65364.getClass(), "shape", null);
        setField(term65364, term65364.getClass(), "evolvesFromSpecies", null);
        setField(term65364, term65364.getClass(), "evolutionChain", null);
        setField(term65364, term65364.getClass(), "habitat", null);
        setField(term65364, term65364.getClass(), "generation", null);
        setField(term65364, term65364.getClass(), "names", null);
        setField(term65364, term65364.getClass(), "flavorTextEntries", null);
        setField(term65364, term65364.getClass(), "formDescriptions", null);
        setField(term65364, term65364.getClass(), "genera", null);
        setField(term65364, term65364.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsBaby", argTypes, term65364, args);
    }

};


