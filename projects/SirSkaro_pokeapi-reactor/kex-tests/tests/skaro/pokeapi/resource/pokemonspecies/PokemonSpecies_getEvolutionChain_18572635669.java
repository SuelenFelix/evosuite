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

public class PokemonSpecies_getEvolutionChain_18572635669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74606;

    public PokemonSpecies_getEvolutionChain_18572635669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74606 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term74606, term74606.getClass(), "id", null);
        setField(term74606, term74606.getClass(), "name", null);
        setField(term74606, term74606.getClass(), "order", null);
        setField(term74606, term74606.getClass(), "genderRate", null);
        setField(term74606, term74606.getClass(), "captureRate", null);
        setField(term74606, term74606.getClass(), "baseHappiness", null);
        setField(term74606, term74606.getClass(), "isBaby", null);
        setField(term74606, term74606.getClass(), "isLegendary", null);
        setField(term74606, term74606.getClass(), "isMythical", null);
        setField(term74606, term74606.getClass(), "hatchCounter", null);
        setField(term74606, term74606.getClass(), "hasGenderDifferences", null);
        setField(term74606, term74606.getClass(), "formsSwitchable", null);
        setField(term74606, term74606.getClass(), "growthRate", null);
        setField(term74606, term74606.getClass(), "pokedexNumbers", null);
        setField(term74606, term74606.getClass(), "eggGroups", null);
        setField(term74606, term74606.getClass(), "color", null);
        setField(term74606, term74606.getClass(), "shape", null);
        setField(term74606, term74606.getClass(), "evolvesFromSpecies", null);
        setField(term74606, term74606.getClass(), "evolutionChain", null);
        setField(term74606, term74606.getClass(), "habitat", null);
        setField(term74606, term74606.getClass(), "generation", null);
        setField(term74606, term74606.getClass(), "names", null);
        setField(term74606, term74606.getClass(), "flavorTextEntries", null);
        setField(term74606, term74606.getClass(), "formDescriptions", null);
        setField(term74606, term74606.getClass(), "genera", null);
        setField(term74606, term74606.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvolutionChain", argTypes, term74606, args);
    }

};


