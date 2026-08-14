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

public class PokemonSpecies_setFormsSwitchable_856874679101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81335;

    public PokemonSpecies_setFormsSwitchable_856874679101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81335 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term81335, term81335.getClass(), "id", null);
        setField(term81335, term81335.getClass(), "name", null);
        setField(term81335, term81335.getClass(), "order", null);
        setField(term81335, term81335.getClass(), "genderRate", null);
        setField(term81335, term81335.getClass(), "captureRate", null);
        setField(term81335, term81335.getClass(), "baseHappiness", null);
        setField(term81335, term81335.getClass(), "isBaby", null);
        setField(term81335, term81335.getClass(), "isLegendary", null);
        setField(term81335, term81335.getClass(), "isMythical", null);
        setField(term81335, term81335.getClass(), "hatchCounter", null);
        setField(term81335, term81335.getClass(), "hasGenderDifferences", null);
        setField(term81335, term81335.getClass(), "formsSwitchable", null);
        setField(term81335, term81335.getClass(), "growthRate", null);
        setField(term81335, term81335.getClass(), "pokedexNumbers", null);
        setField(term81335, term81335.getClass(), "eggGroups", null);
        setField(term81335, term81335.getClass(), "color", null);
        setField(term81335, term81335.getClass(), "shape", null);
        setField(term81335, term81335.getClass(), "evolvesFromSpecies", null);
        setField(term81335, term81335.getClass(), "evolutionChain", null);
        setField(term81335, term81335.getClass(), "habitat", null);
        setField(term81335, term81335.getClass(), "generation", null);
        setField(term81335, term81335.getClass(), "names", null);
        setField(term81335, term81335.getClass(), "flavorTextEntries", null);
        setField(term81335, term81335.getClass(), "formDescriptions", null);
        setField(term81335, term81335.getClass(), "genera", null);
        setField(term81335, term81335.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormsSwitchable", argTypes, term81335, args);
    }

};


