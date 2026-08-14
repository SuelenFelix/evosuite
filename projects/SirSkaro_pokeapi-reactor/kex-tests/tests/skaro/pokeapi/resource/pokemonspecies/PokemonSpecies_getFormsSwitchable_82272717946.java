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

public class PokemonSpecies_getFormsSwitchable_82272717946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9150;

    public PokemonSpecies_getFormsSwitchable_82272717946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9150 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term9150, term9150.getClass(), "id", null);
        setField(term9150, term9150.getClass(), "name", null);
        setField(term9150, term9150.getClass(), "order", null);
        setField(term9150, term9150.getClass(), "genderRate", null);
        setField(term9150, term9150.getClass(), "captureRate", null);
        setField(term9150, term9150.getClass(), "baseHappiness", null);
        setField(term9150, term9150.getClass(), "isBaby", null);
        setField(term9150, term9150.getClass(), "isLegendary", null);
        setField(term9150, term9150.getClass(), "isMythical", null);
        setField(term9150, term9150.getClass(), "hatchCounter", null);
        setField(term9150, term9150.getClass(), "hasGenderDifferences", null);
        setField(term9150, term9150.getClass(), "formsSwitchable", null);
        setField(term9150, term9150.getClass(), "growthRate", null);
        setField(term9150, term9150.getClass(), "pokedexNumbers", null);
        setField(term9150, term9150.getClass(), "eggGroups", null);
        setField(term9150, term9150.getClass(), "color", null);
        setField(term9150, term9150.getClass(), "shape", null);
        setField(term9150, term9150.getClass(), "evolvesFromSpecies", null);
        setField(term9150, term9150.getClass(), "evolutionChain", null);
        setField(term9150, term9150.getClass(), "habitat", null);
        setField(term9150, term9150.getClass(), "generation", null);
        setField(term9150, term9150.getClass(), "names", null);
        setField(term9150, term9150.getClass(), "flavorTextEntries", null);
        setField(term9150, term9150.getClass(), "formDescriptions", null);
        setField(term9150, term9150.getClass(), "genera", null);
        setField(term9150, term9150.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormsSwitchable", argTypes, term9150, args);
    }

};


