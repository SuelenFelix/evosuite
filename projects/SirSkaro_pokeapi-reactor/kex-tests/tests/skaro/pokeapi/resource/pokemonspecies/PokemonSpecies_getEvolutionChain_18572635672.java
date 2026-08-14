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

public class PokemonSpecies_getEvolutionChain_18572635672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14517;

    public PokemonSpecies_getEvolutionChain_18572635672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14517 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term14517, term14517.getClass(), "id", null);
        setField(term14517, term14517.getClass(), "name", null);
        setField(term14517, term14517.getClass(), "order", null);
        setField(term14517, term14517.getClass(), "genderRate", null);
        setField(term14517, term14517.getClass(), "captureRate", null);
        setField(term14517, term14517.getClass(), "baseHappiness", null);
        setField(term14517, term14517.getClass(), "isBaby", null);
        setField(term14517, term14517.getClass(), "isLegendary", null);
        setField(term14517, term14517.getClass(), "isMythical", null);
        setField(term14517, term14517.getClass(), "hatchCounter", null);
        setField(term14517, term14517.getClass(), "hasGenderDifferences", null);
        setField(term14517, term14517.getClass(), "formsSwitchable", null);
        setField(term14517, term14517.getClass(), "growthRate", null);
        setField(term14517, term14517.getClass(), "pokedexNumbers", null);
        setField(term14517, term14517.getClass(), "eggGroups", null);
        setField(term14517, term14517.getClass(), "color", null);
        setField(term14517, term14517.getClass(), "shape", null);
        setField(term14517, term14517.getClass(), "evolvesFromSpecies", null);
        setField(term14517, term14517.getClass(), "evolutionChain", null);
        setField(term14517, term14517.getClass(), "habitat", null);
        setField(term14517, term14517.getClass(), "generation", null);
        setField(term14517, term14517.getClass(), "names", null);
        setField(term14517, term14517.getClass(), "flavorTextEntries", null);
        setField(term14517, term14517.getClass(), "formDescriptions", null);
        setField(term14517, term14517.getClass(), "genera", null);
        setField(term14517, term14517.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvolutionChain", argTypes, term14517, args);
    }

};


