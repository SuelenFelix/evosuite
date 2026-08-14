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

public class PokemonSpecies_getEvolvesFromSpecies_51240623568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13567;

    public PokemonSpecies_getEvolvesFromSpecies_51240623568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13567 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term13567, term13567.getClass(), "id", null);
        setField(term13567, term13567.getClass(), "name", null);
        setField(term13567, term13567.getClass(), "order", null);
        setField(term13567, term13567.getClass(), "genderRate", null);
        setField(term13567, term13567.getClass(), "captureRate", null);
        setField(term13567, term13567.getClass(), "baseHappiness", null);
        setField(term13567, term13567.getClass(), "isBaby", null);
        setField(term13567, term13567.getClass(), "isLegendary", null);
        setField(term13567, term13567.getClass(), "isMythical", null);
        setField(term13567, term13567.getClass(), "hatchCounter", null);
        setField(term13567, term13567.getClass(), "hasGenderDifferences", null);
        setField(term13567, term13567.getClass(), "formsSwitchable", null);
        setField(term13567, term13567.getClass(), "growthRate", null);
        setField(term13567, term13567.getClass(), "pokedexNumbers", null);
        setField(term13567, term13567.getClass(), "eggGroups", null);
        setField(term13567, term13567.getClass(), "color", null);
        setField(term13567, term13567.getClass(), "shape", null);
        setField(term13567, term13567.getClass(), "evolvesFromSpecies", null);
        setField(term13567, term13567.getClass(), "evolutionChain", null);
        setField(term13567, term13567.getClass(), "habitat", null);
        setField(term13567, term13567.getClass(), "generation", null);
        setField(term13567, term13567.getClass(), "names", null);
        setField(term13567, term13567.getClass(), "flavorTextEntries", null);
        setField(term13567, term13567.getClass(), "formDescriptions", null);
        setField(term13567, term13567.getClass(), "genera", null);
        setField(term13567, term13567.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvolvesFromSpecies", argTypes, term13567, args);
    }

};


