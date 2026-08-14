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

public class PokemonSpecies_setVarieties_158729925496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81331;

    public PokemonSpecies_setVarieties_158729925496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81331 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term81331, term81331.getClass(), "id", null);
        setField(term81331, term81331.getClass(), "name", null);
        setField(term81331, term81331.getClass(), "order", null);
        setField(term81331, term81331.getClass(), "genderRate", null);
        setField(term81331, term81331.getClass(), "captureRate", null);
        setField(term81331, term81331.getClass(), "baseHappiness", null);
        setField(term81331, term81331.getClass(), "isBaby", null);
        setField(term81331, term81331.getClass(), "isLegendary", null);
        setField(term81331, term81331.getClass(), "isMythical", null);
        setField(term81331, term81331.getClass(), "hatchCounter", null);
        setField(term81331, term81331.getClass(), "hasGenderDifferences", null);
        setField(term81331, term81331.getClass(), "formsSwitchable", null);
        setField(term81331, term81331.getClass(), "growthRate", null);
        setField(term81331, term81331.getClass(), "pokedexNumbers", null);
        setField(term81331, term81331.getClass(), "eggGroups", null);
        setField(term81331, term81331.getClass(), "color", null);
        setField(term81331, term81331.getClass(), "shape", null);
        setField(term81331, term81331.getClass(), "evolvesFromSpecies", null);
        setField(term81331, term81331.getClass(), "evolutionChain", null);
        setField(term81331, term81331.getClass(), "habitat", null);
        setField(term81331, term81331.getClass(), "generation", null);
        setField(term81331, term81331.getClass(), "names", null);
        setField(term81331, term81331.getClass(), "flavorTextEntries", null);
        setField(term81331, term81331.getClass(), "formDescriptions", null);
        setField(term81331, term81331.getClass(), "genera", null);
        setField(term81331, term81331.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVarieties", argTypes, term81331, args);
    }

};


