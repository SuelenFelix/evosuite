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

public class PokemonSpecies_setCaptureRate_106725419817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65032;

    public PokemonSpecies_setCaptureRate_106725419817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65032 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term65032, term65032.getClass(), "id", null);
        setField(term65032, term65032.getClass(), "name", null);
        setField(term65032, term65032.getClass(), "order", null);
        setField(term65032, term65032.getClass(), "genderRate", null);
        setField(term65032, term65032.getClass(), "captureRate", null);
        setField(term65032, term65032.getClass(), "baseHappiness", null);
        setField(term65032, term65032.getClass(), "isBaby", null);
        setField(term65032, term65032.getClass(), "isLegendary", null);
        setField(term65032, term65032.getClass(), "isMythical", null);
        setField(term65032, term65032.getClass(), "hatchCounter", null);
        setField(term65032, term65032.getClass(), "hasGenderDifferences", null);
        setField(term65032, term65032.getClass(), "formsSwitchable", null);
        setField(term65032, term65032.getClass(), "growthRate", null);
        setField(term65032, term65032.getClass(), "pokedexNumbers", null);
        setField(term65032, term65032.getClass(), "eggGroups", null);
        setField(term65032, term65032.getClass(), "color", null);
        setField(term65032, term65032.getClass(), "shape", null);
        setField(term65032, term65032.getClass(), "evolvesFromSpecies", null);
        setField(term65032, term65032.getClass(), "evolutionChain", null);
        setField(term65032, term65032.getClass(), "habitat", null);
        setField(term65032, term65032.getClass(), "generation", null);
        setField(term65032, term65032.getClass(), "names", null);
        setField(term65032, term65032.getClass(), "flavorTextEntries", null);
        setField(term65032, term65032.getClass(), "formDescriptions", null);
        setField(term65032, term65032.getClass(), "genera", null);
        setField(term65032, term65032.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCaptureRate", argTypes, term65032, args);
    }

};


