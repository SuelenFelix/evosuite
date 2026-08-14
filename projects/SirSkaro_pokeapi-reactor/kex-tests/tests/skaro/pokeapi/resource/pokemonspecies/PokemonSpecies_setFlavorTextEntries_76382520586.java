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

public class PokemonSpecies_setFlavorTextEntries_76382520586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78092;

    public PokemonSpecies_setFlavorTextEntries_76382520586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78092 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term78092, term78092.getClass(), "id", null);
        setField(term78092, term78092.getClass(), "name", null);
        setField(term78092, term78092.getClass(), "order", null);
        setField(term78092, term78092.getClass(), "genderRate", null);
        setField(term78092, term78092.getClass(), "captureRate", null);
        setField(term78092, term78092.getClass(), "baseHappiness", null);
        setField(term78092, term78092.getClass(), "isBaby", null);
        setField(term78092, term78092.getClass(), "isLegendary", null);
        setField(term78092, term78092.getClass(), "isMythical", null);
        setField(term78092, term78092.getClass(), "hatchCounter", null);
        setField(term78092, term78092.getClass(), "hasGenderDifferences", null);
        setField(term78092, term78092.getClass(), "formsSwitchable", null);
        setField(term78092, term78092.getClass(), "growthRate", null);
        setField(term78092, term78092.getClass(), "pokedexNumbers", null);
        setField(term78092, term78092.getClass(), "eggGroups", null);
        setField(term78092, term78092.getClass(), "color", null);
        setField(term78092, term78092.getClass(), "shape", null);
        setField(term78092, term78092.getClass(), "evolvesFromSpecies", null);
        setField(term78092, term78092.getClass(), "evolutionChain", null);
        setField(term78092, term78092.getClass(), "habitat", null);
        setField(term78092, term78092.getClass(), "generation", null);
        setField(term78092, term78092.getClass(), "names", null);
        setField(term78092, term78092.getClass(), "flavorTextEntries", null);
        setField(term78092, term78092.getClass(), "formDescriptions", null);
        setField(term78092, term78092.getClass(), "genera", null);
        setField(term78092, term78092.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlavorTextEntries", argTypes, term78092, args);
    }

};


