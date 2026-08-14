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

public class PokemonSpecies_setColor_1774349704103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19946;

    public PokemonSpecies_setColor_1774349704103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19946 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term19946, term19946.getClass(), "id", null);
        setField(term19946, term19946.getClass(), "name", null);
        setField(term19946, term19946.getClass(), "order", null);
        setField(term19946, term19946.getClass(), "genderRate", null);
        setField(term19946, term19946.getClass(), "captureRate", null);
        setField(term19946, term19946.getClass(), "baseHappiness", null);
        setField(term19946, term19946.getClass(), "isBaby", null);
        setField(term19946, term19946.getClass(), "isLegendary", null);
        setField(term19946, term19946.getClass(), "isMythical", null);
        setField(term19946, term19946.getClass(), "hatchCounter", null);
        setField(term19946, term19946.getClass(), "hasGenderDifferences", null);
        setField(term19946, term19946.getClass(), "formsSwitchable", null);
        setField(term19946, term19946.getClass(), "growthRate", null);
        setField(term19946, term19946.getClass(), "pokedexNumbers", null);
        setField(term19946, term19946.getClass(), "eggGroups", null);
        setField(term19946, term19946.getClass(), "color", null);
        setField(term19946, term19946.getClass(), "shape", null);
        setField(term19946, term19946.getClass(), "evolvesFromSpecies", null);
        setField(term19946, term19946.getClass(), "evolutionChain", null);
        setField(term19946, term19946.getClass(), "habitat", null);
        setField(term19946, term19946.getClass(), "generation", null);
        setField(term19946, term19946.getClass(), "names", null);
        setField(term19946, term19946.getClass(), "flavorTextEntries", null);
        setField(term19946, term19946.getClass(), "formDescriptions", null);
        setField(term19946, term19946.getClass(), "genera", null);
        setField(term19946, term19946.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setColor", argTypes, term19946, args);
    }

};


