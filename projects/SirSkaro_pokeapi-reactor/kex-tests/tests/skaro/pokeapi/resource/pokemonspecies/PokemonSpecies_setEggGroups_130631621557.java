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

public class PokemonSpecies_setEggGroups_130631621557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72128;

    public PokemonSpecies_setEggGroups_130631621557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72128 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term72128, term72128.getClass(), "id", null);
        setField(term72128, term72128.getClass(), "name", null);
        setField(term72128, term72128.getClass(), "order", null);
        setField(term72128, term72128.getClass(), "genderRate", null);
        setField(term72128, term72128.getClass(), "captureRate", null);
        setField(term72128, term72128.getClass(), "baseHappiness", null);
        setField(term72128, term72128.getClass(), "isBaby", null);
        setField(term72128, term72128.getClass(), "isLegendary", null);
        setField(term72128, term72128.getClass(), "isMythical", null);
        setField(term72128, term72128.getClass(), "hatchCounter", null);
        setField(term72128, term72128.getClass(), "hasGenderDifferences", null);
        setField(term72128, term72128.getClass(), "formsSwitchable", null);
        setField(term72128, term72128.getClass(), "growthRate", null);
        setField(term72128, term72128.getClass(), "pokedexNumbers", null);
        setField(term72128, term72128.getClass(), "eggGroups", null);
        setField(term72128, term72128.getClass(), "color", null);
        setField(term72128, term72128.getClass(), "shape", null);
        setField(term72128, term72128.getClass(), "evolvesFromSpecies", null);
        setField(term72128, term72128.getClass(), "evolutionChain", null);
        setField(term72128, term72128.getClass(), "habitat", null);
        setField(term72128, term72128.getClass(), "generation", null);
        setField(term72128, term72128.getClass(), "names", null);
        setField(term72128, term72128.getClass(), "flavorTextEntries", null);
        setField(term72128, term72128.getClass(), "formDescriptions", null);
        setField(term72128, term72128.getClass(), "genera", null);
        setField(term72128, term72128.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEggGroups", argTypes, term72128, args);
    }

};


