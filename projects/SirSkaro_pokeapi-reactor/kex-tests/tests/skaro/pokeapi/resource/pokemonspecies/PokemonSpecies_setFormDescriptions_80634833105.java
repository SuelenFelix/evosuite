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

public class PokemonSpecies_setFormDescriptions_80634833105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81339;

    public PokemonSpecies_setFormDescriptions_80634833105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81339 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term81339, term81339.getClass(), "id", null);
        setField(term81339, term81339.getClass(), "name", null);
        setField(term81339, term81339.getClass(), "order", null);
        setField(term81339, term81339.getClass(), "genderRate", null);
        setField(term81339, term81339.getClass(), "captureRate", null);
        setField(term81339, term81339.getClass(), "baseHappiness", null);
        setField(term81339, term81339.getClass(), "isBaby", null);
        setField(term81339, term81339.getClass(), "isLegendary", null);
        setField(term81339, term81339.getClass(), "isMythical", null);
        setField(term81339, term81339.getClass(), "hatchCounter", null);
        setField(term81339, term81339.getClass(), "hasGenderDifferences", null);
        setField(term81339, term81339.getClass(), "formsSwitchable", null);
        setField(term81339, term81339.getClass(), "growthRate", null);
        setField(term81339, term81339.getClass(), "pokedexNumbers", null);
        setField(term81339, term81339.getClass(), "eggGroups", null);
        setField(term81339, term81339.getClass(), "color", null);
        setField(term81339, term81339.getClass(), "shape", null);
        setField(term81339, term81339.getClass(), "evolvesFromSpecies", null);
        setField(term81339, term81339.getClass(), "evolutionChain", null);
        setField(term81339, term81339.getClass(), "habitat", null);
        setField(term81339, term81339.getClass(), "generation", null);
        setField(term81339, term81339.getClass(), "names", null);
        setField(term81339, term81339.getClass(), "flavorTextEntries", null);
        setField(term81339, term81339.getClass(), "formDescriptions", null);
        setField(term81339, term81339.getClass(), "genera", null);
        setField(term81339, term81339.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormDescriptions", argTypes, term81339, args);
    }

};


