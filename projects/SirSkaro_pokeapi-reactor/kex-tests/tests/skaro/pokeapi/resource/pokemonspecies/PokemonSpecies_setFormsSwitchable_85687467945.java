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

public class PokemonSpecies_setFormsSwitchable_85687467945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69684;

    public PokemonSpecies_setFormsSwitchable_85687467945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69684 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term69684, term69684.getClass(), "id", null);
        setField(term69684, term69684.getClass(), "name", null);
        setField(term69684, term69684.getClass(), "order", null);
        setField(term69684, term69684.getClass(), "genderRate", null);
        setField(term69684, term69684.getClass(), "captureRate", null);
        setField(term69684, term69684.getClass(), "baseHappiness", null);
        setField(term69684, term69684.getClass(), "isBaby", null);
        setField(term69684, term69684.getClass(), "isLegendary", null);
        setField(term69684, term69684.getClass(), "isMythical", null);
        setField(term69684, term69684.getClass(), "hatchCounter", null);
        setField(term69684, term69684.getClass(), "hasGenderDifferences", null);
        setField(term69684, term69684.getClass(), "formsSwitchable", null);
        setField(term69684, term69684.getClass(), "growthRate", null);
        setField(term69684, term69684.getClass(), "pokedexNumbers", null);
        setField(term69684, term69684.getClass(), "eggGroups", null);
        setField(term69684, term69684.getClass(), "color", null);
        setField(term69684, term69684.getClass(), "shape", null);
        setField(term69684, term69684.getClass(), "evolvesFromSpecies", null);
        setField(term69684, term69684.getClass(), "evolutionChain", null);
        setField(term69684, term69684.getClass(), "habitat", null);
        setField(term69684, term69684.getClass(), "generation", null);
        setField(term69684, term69684.getClass(), "names", null);
        setField(term69684, term69684.getClass(), "flavorTextEntries", null);
        setField(term69684, term69684.getClass(), "formDescriptions", null);
        setField(term69684, term69684.getClass(), "genera", null);
        setField(term69684, term69684.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormsSwitchable", argTypes, term69684, args);
    }

};


