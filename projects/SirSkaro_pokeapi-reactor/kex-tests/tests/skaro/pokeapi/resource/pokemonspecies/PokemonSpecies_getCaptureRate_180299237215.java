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

public class PokemonSpecies_getCaptureRate_180299237215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64772;

    public PokemonSpecies_getCaptureRate_180299237215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64772 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term64772, term64772.getClass(), "id", null);
        setField(term64772, term64772.getClass(), "name", null);
        setField(term64772, term64772.getClass(), "order", null);
        setField(term64772, term64772.getClass(), "genderRate", null);
        setField(term64772, term64772.getClass(), "captureRate", null);
        setField(term64772, term64772.getClass(), "baseHappiness", null);
        setField(term64772, term64772.getClass(), "isBaby", null);
        setField(term64772, term64772.getClass(), "isLegendary", null);
        setField(term64772, term64772.getClass(), "isMythical", null);
        setField(term64772, term64772.getClass(), "hatchCounter", null);
        setField(term64772, term64772.getClass(), "hasGenderDifferences", null);
        setField(term64772, term64772.getClass(), "formsSwitchable", null);
        setField(term64772, term64772.getClass(), "growthRate", null);
        setField(term64772, term64772.getClass(), "pokedexNumbers", null);
        setField(term64772, term64772.getClass(), "eggGroups", null);
        setField(term64772, term64772.getClass(), "color", null);
        setField(term64772, term64772.getClass(), "shape", null);
        setField(term64772, term64772.getClass(), "evolvesFromSpecies", null);
        setField(term64772, term64772.getClass(), "evolutionChain", null);
        setField(term64772, term64772.getClass(), "habitat", null);
        setField(term64772, term64772.getClass(), "generation", null);
        setField(term64772, term64772.getClass(), "names", null);
        setField(term64772, term64772.getClass(), "flavorTextEntries", null);
        setField(term64772, term64772.getClass(), "formDescriptions", null);
        setField(term64772, term64772.getClass(), "genera", null);
        setField(term64772, term64772.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCaptureRate", argTypes, term64772, args);
    }

};


