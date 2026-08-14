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

public class PokemonSpecies_getId_9297668372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1205;

    public PokemonSpecies_getId_9297668372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1205 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term1205, term1205.getClass(), "id", null);
        setField(term1205, term1205.getClass(), "name", null);
        setField(term1205, term1205.getClass(), "order", null);
        setField(term1205, term1205.getClass(), "genderRate", null);
        setField(term1205, term1205.getClass(), "captureRate", null);
        setField(term1205, term1205.getClass(), "baseHappiness", null);
        setField(term1205, term1205.getClass(), "isBaby", null);
        setField(term1205, term1205.getClass(), "isLegendary", null);
        setField(term1205, term1205.getClass(), "isMythical", null);
        setField(term1205, term1205.getClass(), "hatchCounter", null);
        setField(term1205, term1205.getClass(), "hasGenderDifferences", null);
        setField(term1205, term1205.getClass(), "formsSwitchable", null);
        setField(term1205, term1205.getClass(), "growthRate", null);
        setField(term1205, term1205.getClass(), "pokedexNumbers", null);
        setField(term1205, term1205.getClass(), "eggGroups", null);
        setField(term1205, term1205.getClass(), "color", null);
        setField(term1205, term1205.getClass(), "shape", null);
        setField(term1205, term1205.getClass(), "evolvesFromSpecies", null);
        setField(term1205, term1205.getClass(), "evolutionChain", null);
        setField(term1205, term1205.getClass(), "habitat", null);
        setField(term1205, term1205.getClass(), "generation", null);
        setField(term1205, term1205.getClass(), "names", null);
        setField(term1205, term1205.getClass(), "flavorTextEntries", null);
        setField(term1205, term1205.getClass(), "formDescriptions", null);
        setField(term1205, term1205.getClass(), "genera", null);
        setField(term1205, term1205.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1205, args);
    }

};


