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

public class PokemonSpecies_setFlavorTextEntries_76382520589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17792;

    public PokemonSpecies_setFlavorTextEntries_76382520589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17792 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term17792, term17792.getClass(), "id", null);
        setField(term17792, term17792.getClass(), "name", null);
        setField(term17792, term17792.getClass(), "order", null);
        setField(term17792, term17792.getClass(), "genderRate", null);
        setField(term17792, term17792.getClass(), "captureRate", null);
        setField(term17792, term17792.getClass(), "baseHappiness", null);
        setField(term17792, term17792.getClass(), "isBaby", null);
        setField(term17792, term17792.getClass(), "isLegendary", null);
        setField(term17792, term17792.getClass(), "isMythical", null);
        setField(term17792, term17792.getClass(), "hatchCounter", null);
        setField(term17792, term17792.getClass(), "hasGenderDifferences", null);
        setField(term17792, term17792.getClass(), "formsSwitchable", null);
        setField(term17792, term17792.getClass(), "growthRate", null);
        setField(term17792, term17792.getClass(), "pokedexNumbers", null);
        setField(term17792, term17792.getClass(), "eggGroups", null);
        setField(term17792, term17792.getClass(), "color", null);
        setField(term17792, term17792.getClass(), "shape", null);
        setField(term17792, term17792.getClass(), "evolvesFromSpecies", null);
        setField(term17792, term17792.getClass(), "evolutionChain", null);
        setField(term17792, term17792.getClass(), "habitat", null);
        setField(term17792, term17792.getClass(), "generation", null);
        setField(term17792, term17792.getClass(), "names", null);
        setField(term17792, term17792.getClass(), "flavorTextEntries", null);
        setField(term17792, term17792.getClass(), "formDescriptions", null);
        setField(term17792, term17792.getClass(), "genera", null);
        setField(term17792, term17792.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlavorTextEntries", argTypes, term17792, args);
    }

};


