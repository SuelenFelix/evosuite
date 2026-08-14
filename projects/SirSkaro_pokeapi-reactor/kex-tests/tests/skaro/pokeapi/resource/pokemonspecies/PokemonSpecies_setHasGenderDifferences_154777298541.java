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

public class PokemonSpecies_setHasGenderDifferences_154777298541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68809;

    public PokemonSpecies_setHasGenderDifferences_154777298541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68809 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term68809, term68809.getClass(), "id", null);
        setField(term68809, term68809.getClass(), "name", null);
        setField(term68809, term68809.getClass(), "order", null);
        setField(term68809, term68809.getClass(), "genderRate", null);
        setField(term68809, term68809.getClass(), "captureRate", null);
        setField(term68809, term68809.getClass(), "baseHappiness", null);
        setField(term68809, term68809.getClass(), "isBaby", null);
        setField(term68809, term68809.getClass(), "isLegendary", null);
        setField(term68809, term68809.getClass(), "isMythical", null);
        setField(term68809, term68809.getClass(), "hatchCounter", null);
        setField(term68809, term68809.getClass(), "hasGenderDifferences", null);
        setField(term68809, term68809.getClass(), "formsSwitchable", null);
        setField(term68809, term68809.getClass(), "growthRate", null);
        setField(term68809, term68809.getClass(), "pokedexNumbers", null);
        setField(term68809, term68809.getClass(), "eggGroups", null);
        setField(term68809, term68809.getClass(), "color", null);
        setField(term68809, term68809.getClass(), "shape", null);
        setField(term68809, term68809.getClass(), "evolvesFromSpecies", null);
        setField(term68809, term68809.getClass(), "evolutionChain", null);
        setField(term68809, term68809.getClass(), "habitat", null);
        setField(term68809, term68809.getClass(), "generation", null);
        setField(term68809, term68809.getClass(), "names", null);
        setField(term68809, term68809.getClass(), "flavorTextEntries", null);
        setField(term68809, term68809.getClass(), "formDescriptions", null);
        setField(term68809, term68809.getClass(), "genera", null);
        setField(term68809, term68809.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasGenderDifferences", argTypes, term68809, args);
    }

};


