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

public class PokemonSpecies_getFormsSwitchable_82272717943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69240;

    public PokemonSpecies_getFormsSwitchable_82272717943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69240 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term69240, term69240.getClass(), "id", null);
        setField(term69240, term69240.getClass(), "name", null);
        setField(term69240, term69240.getClass(), "order", null);
        setField(term69240, term69240.getClass(), "genderRate", null);
        setField(term69240, term69240.getClass(), "captureRate", null);
        setField(term69240, term69240.getClass(), "baseHappiness", null);
        setField(term69240, term69240.getClass(), "isBaby", null);
        setField(term69240, term69240.getClass(), "isLegendary", null);
        setField(term69240, term69240.getClass(), "isMythical", null);
        setField(term69240, term69240.getClass(), "hatchCounter", null);
        setField(term69240, term69240.getClass(), "hasGenderDifferences", null);
        setField(term69240, term69240.getClass(), "formsSwitchable", null);
        setField(term69240, term69240.getClass(), "growthRate", null);
        setField(term69240, term69240.getClass(), "pokedexNumbers", null);
        setField(term69240, term69240.getClass(), "eggGroups", null);
        setField(term69240, term69240.getClass(), "color", null);
        setField(term69240, term69240.getClass(), "shape", null);
        setField(term69240, term69240.getClass(), "evolvesFromSpecies", null);
        setField(term69240, term69240.getClass(), "evolutionChain", null);
        setField(term69240, term69240.getClass(), "habitat", null);
        setField(term69240, term69240.getClass(), "generation", null);
        setField(term69240, term69240.getClass(), "names", null);
        setField(term69240, term69240.getClass(), "flavorTextEntries", null);
        setField(term69240, term69240.getClass(), "formDescriptions", null);
        setField(term69240, term69240.getClass(), "genera", null);
        setField(term69240, term69240.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormsSwitchable", argTypes, term69240, args);
    }

};


