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

public class PokemonSpecies_setPokedexNumbers_714032055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10872;

    public PokemonSpecies_setPokedexNumbers_714032055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10872 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term10872, term10872.getClass(), "id", null);
        setField(term10872, term10872.getClass(), "name", null);
        setField(term10872, term10872.getClass(), "order", null);
        setField(term10872, term10872.getClass(), "genderRate", null);
        setField(term10872, term10872.getClass(), "captureRate", null);
        setField(term10872, term10872.getClass(), "baseHappiness", null);
        setField(term10872, term10872.getClass(), "isBaby", null);
        setField(term10872, term10872.getClass(), "isLegendary", null);
        setField(term10872, term10872.getClass(), "isMythical", null);
        setField(term10872, term10872.getClass(), "hatchCounter", null);
        setField(term10872, term10872.getClass(), "hasGenderDifferences", null);
        setField(term10872, term10872.getClass(), "formsSwitchable", null);
        setField(term10872, term10872.getClass(), "growthRate", null);
        setField(term10872, term10872.getClass(), "pokedexNumbers", null);
        setField(term10872, term10872.getClass(), "eggGroups", null);
        setField(term10872, term10872.getClass(), "color", null);
        setField(term10872, term10872.getClass(), "shape", null);
        setField(term10872, term10872.getClass(), "evolvesFromSpecies", null);
        setField(term10872, term10872.getClass(), "evolutionChain", null);
        setField(term10872, term10872.getClass(), "habitat", null);
        setField(term10872, term10872.getClass(), "generation", null);
        setField(term10872, term10872.getClass(), "names", null);
        setField(term10872, term10872.getClass(), "flavorTextEntries", null);
        setField(term10872, term10872.getClass(), "formDescriptions", null);
        setField(term10872, term10872.getClass(), "genera", null);
        setField(term10872, term10872.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPokedexNumbers", argTypes, term10872, args);
    }

};


