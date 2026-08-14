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

public class PokemonSpecies_setEvolutionChain_39939599471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75078;

    public PokemonSpecies_setEvolutionChain_39939599471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75078 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term75078, term75078.getClass(), "id", null);
        setField(term75078, term75078.getClass(), "name", null);
        setField(term75078, term75078.getClass(), "order", null);
        setField(term75078, term75078.getClass(), "genderRate", null);
        setField(term75078, term75078.getClass(), "captureRate", null);
        setField(term75078, term75078.getClass(), "baseHappiness", null);
        setField(term75078, term75078.getClass(), "isBaby", null);
        setField(term75078, term75078.getClass(), "isLegendary", null);
        setField(term75078, term75078.getClass(), "isMythical", null);
        setField(term75078, term75078.getClass(), "hatchCounter", null);
        setField(term75078, term75078.getClass(), "hasGenderDifferences", null);
        setField(term75078, term75078.getClass(), "formsSwitchable", null);
        setField(term75078, term75078.getClass(), "growthRate", null);
        setField(term75078, term75078.getClass(), "pokedexNumbers", null);
        setField(term75078, term75078.getClass(), "eggGroups", null);
        setField(term75078, term75078.getClass(), "color", null);
        setField(term75078, term75078.getClass(), "shape", null);
        setField(term75078, term75078.getClass(), "evolvesFromSpecies", null);
        setField(term75078, term75078.getClass(), "evolutionChain", null);
        setField(term75078, term75078.getClass(), "habitat", null);
        setField(term75078, term75078.getClass(), "generation", null);
        setField(term75078, term75078.getClass(), "names", null);
        setField(term75078, term75078.getClass(), "flavorTextEntries", null);
        setField(term75078, term75078.getClass(), "formDescriptions", null);
        setField(term75078, term75078.getClass(), "genera", null);
        setField(term75078, term75078.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.ApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEvolutionChain", argTypes, term75078, args);
    }

};


