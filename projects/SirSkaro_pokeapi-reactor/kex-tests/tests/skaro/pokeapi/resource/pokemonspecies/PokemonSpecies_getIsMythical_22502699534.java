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

public class PokemonSpecies_getIsMythical_22502699534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7165;

    public PokemonSpecies_getIsMythical_22502699534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7165 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term7165, term7165.getClass(), "id", null);
        setField(term7165, term7165.getClass(), "name", null);
        setField(term7165, term7165.getClass(), "order", null);
        setField(term7165, term7165.getClass(), "genderRate", null);
        setField(term7165, term7165.getClass(), "captureRate", null);
        setField(term7165, term7165.getClass(), "baseHappiness", null);
        setField(term7165, term7165.getClass(), "isBaby", null);
        setField(term7165, term7165.getClass(), "isLegendary", null);
        setField(term7165, term7165.getClass(), "isMythical", null);
        setField(term7165, term7165.getClass(), "hatchCounter", null);
        setField(term7165, term7165.getClass(), "hasGenderDifferences", null);
        setField(term7165, term7165.getClass(), "formsSwitchable", null);
        setField(term7165, term7165.getClass(), "growthRate", null);
        setField(term7165, term7165.getClass(), "pokedexNumbers", null);
        setField(term7165, term7165.getClass(), "eggGroups", null);
        setField(term7165, term7165.getClass(), "color", null);
        setField(term7165, term7165.getClass(), "shape", null);
        setField(term7165, term7165.getClass(), "evolvesFromSpecies", null);
        setField(term7165, term7165.getClass(), "evolutionChain", null);
        setField(term7165, term7165.getClass(), "habitat", null);
        setField(term7165, term7165.getClass(), "generation", null);
        setField(term7165, term7165.getClass(), "names", null);
        setField(term7165, term7165.getClass(), "flavorTextEntries", null);
        setField(term7165, term7165.getClass(), "formDescriptions", null);
        setField(term7165, term7165.getClass(), "genera", null);
        setField(term7165, term7165.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsMythical", argTypes, term7165, args);
    }

};


