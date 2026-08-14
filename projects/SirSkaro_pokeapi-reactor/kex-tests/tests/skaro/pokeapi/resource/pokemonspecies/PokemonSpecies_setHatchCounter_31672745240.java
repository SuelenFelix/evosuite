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

public class PokemonSpecies_setHatchCounter_31672745240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8268;

    public PokemonSpecies_setHatchCounter_31672745240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8268 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term8268, term8268.getClass(), "id", null);
        setField(term8268, term8268.getClass(), "name", null);
        setField(term8268, term8268.getClass(), "order", null);
        setField(term8268, term8268.getClass(), "genderRate", null);
        setField(term8268, term8268.getClass(), "captureRate", null);
        setField(term8268, term8268.getClass(), "baseHappiness", null);
        setField(term8268, term8268.getClass(), "isBaby", null);
        setField(term8268, term8268.getClass(), "isLegendary", null);
        setField(term8268, term8268.getClass(), "isMythical", null);
        setField(term8268, term8268.getClass(), "hatchCounter", null);
        setField(term8268, term8268.getClass(), "hasGenderDifferences", null);
        setField(term8268, term8268.getClass(), "formsSwitchable", null);
        setField(term8268, term8268.getClass(), "growthRate", null);
        setField(term8268, term8268.getClass(), "pokedexNumbers", null);
        setField(term8268, term8268.getClass(), "eggGroups", null);
        setField(term8268, term8268.getClass(), "color", null);
        setField(term8268, term8268.getClass(), "shape", null);
        setField(term8268, term8268.getClass(), "evolvesFromSpecies", null);
        setField(term8268, term8268.getClass(), "evolutionChain", null);
        setField(term8268, term8268.getClass(), "habitat", null);
        setField(term8268, term8268.getClass(), "generation", null);
        setField(term8268, term8268.getClass(), "names", null);
        setField(term8268, term8268.getClass(), "flavorTextEntries", null);
        setField(term8268, term8268.getClass(), "formDescriptions", null);
        setField(term8268, term8268.getClass(), "genera", null);
        setField(term8268, term8268.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHatchCounter", argTypes, term8268, args);
    }

};


