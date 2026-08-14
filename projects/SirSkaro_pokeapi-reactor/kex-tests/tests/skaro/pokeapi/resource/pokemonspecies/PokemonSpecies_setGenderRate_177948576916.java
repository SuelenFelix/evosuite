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

public class PokemonSpecies_setGenderRate_177948576916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3780;

    public PokemonSpecies_setGenderRate_177948576916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3780 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term3780, term3780.getClass(), "id", null);
        setField(term3780, term3780.getClass(), "name", null);
        setField(term3780, term3780.getClass(), "order", null);
        setField(term3780, term3780.getClass(), "genderRate", null);
        setField(term3780, term3780.getClass(), "captureRate", null);
        setField(term3780, term3780.getClass(), "baseHappiness", null);
        setField(term3780, term3780.getClass(), "isBaby", null);
        setField(term3780, term3780.getClass(), "isLegendary", null);
        setField(term3780, term3780.getClass(), "isMythical", null);
        setField(term3780, term3780.getClass(), "hatchCounter", null);
        setField(term3780, term3780.getClass(), "hasGenderDifferences", null);
        setField(term3780, term3780.getClass(), "formsSwitchable", null);
        setField(term3780, term3780.getClass(), "growthRate", null);
        setField(term3780, term3780.getClass(), "pokedexNumbers", null);
        setField(term3780, term3780.getClass(), "eggGroups", null);
        setField(term3780, term3780.getClass(), "color", null);
        setField(term3780, term3780.getClass(), "shape", null);
        setField(term3780, term3780.getClass(), "evolvesFromSpecies", null);
        setField(term3780, term3780.getClass(), "evolutionChain", null);
        setField(term3780, term3780.getClass(), "habitat", null);
        setField(term3780, term3780.getClass(), "generation", null);
        setField(term3780, term3780.getClass(), "names", null);
        setField(term3780, term3780.getClass(), "flavorTextEntries", null);
        setField(term3780, term3780.getClass(), "formDescriptions", null);
        setField(term3780, term3780.getClass(), "genera", null);
        setField(term3780, term3780.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenderRate", argTypes, term3780, args);
    }

};


