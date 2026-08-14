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

public class PokemonSpecies_setColor_177434970459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73793;

    public PokemonSpecies_setColor_177434970459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73793 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term73793, term73793.getClass(), "id", null);
        setField(term73793, term73793.getClass(), "name", null);
        setField(term73793, term73793.getClass(), "order", null);
        setField(term73793, term73793.getClass(), "genderRate", null);
        setField(term73793, term73793.getClass(), "captureRate", null);
        setField(term73793, term73793.getClass(), "baseHappiness", null);
        setField(term73793, term73793.getClass(), "isBaby", null);
        setField(term73793, term73793.getClass(), "isLegendary", null);
        setField(term73793, term73793.getClass(), "isMythical", null);
        setField(term73793, term73793.getClass(), "hatchCounter", null);
        setField(term73793, term73793.getClass(), "hasGenderDifferences", null);
        setField(term73793, term73793.getClass(), "formsSwitchable", null);
        setField(term73793, term73793.getClass(), "growthRate", null);
        setField(term73793, term73793.getClass(), "pokedexNumbers", null);
        setField(term73793, term73793.getClass(), "eggGroups", null);
        setField(term73793, term73793.getClass(), "color", null);
        setField(term73793, term73793.getClass(), "shape", null);
        setField(term73793, term73793.getClass(), "evolvesFromSpecies", null);
        setField(term73793, term73793.getClass(), "evolutionChain", null);
        setField(term73793, term73793.getClass(), "habitat", null);
        setField(term73793, term73793.getClass(), "generation", null);
        setField(term73793, term73793.getClass(), "names", null);
        setField(term73793, term73793.getClass(), "flavorTextEntries", null);
        setField(term73793, term73793.getClass(), "formDescriptions", null);
        setField(term73793, term73793.getClass(), "genera", null);
        setField(term73793, term73793.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setColor", argTypes, term73793, args);
    }

};


