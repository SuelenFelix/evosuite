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

public class PokemonSpecies_setVarieties_1587299254100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19944;

    public PokemonSpecies_setVarieties_1587299254100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19944 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term19944, term19944.getClass(), "id", null);
        setField(term19944, term19944.getClass(), "name", null);
        setField(term19944, term19944.getClass(), "order", null);
        setField(term19944, term19944.getClass(), "genderRate", null);
        setField(term19944, term19944.getClass(), "captureRate", null);
        setField(term19944, term19944.getClass(), "baseHappiness", null);
        setField(term19944, term19944.getClass(), "isBaby", null);
        setField(term19944, term19944.getClass(), "isLegendary", null);
        setField(term19944, term19944.getClass(), "isMythical", null);
        setField(term19944, term19944.getClass(), "hatchCounter", null);
        setField(term19944, term19944.getClass(), "hasGenderDifferences", null);
        setField(term19944, term19944.getClass(), "formsSwitchable", null);
        setField(term19944, term19944.getClass(), "growthRate", null);
        setField(term19944, term19944.getClass(), "pokedexNumbers", null);
        setField(term19944, term19944.getClass(), "eggGroups", null);
        setField(term19944, term19944.getClass(), "color", null);
        setField(term19944, term19944.getClass(), "shape", null);
        setField(term19944, term19944.getClass(), "evolvesFromSpecies", null);
        setField(term19944, term19944.getClass(), "evolutionChain", null);
        setField(term19944, term19944.getClass(), "habitat", null);
        setField(term19944, term19944.getClass(), "generation", null);
        setField(term19944, term19944.getClass(), "names", null);
        setField(term19944, term19944.getClass(), "flavorTextEntries", null);
        setField(term19944, term19944.getClass(), "formDescriptions", null);
        setField(term19944, term19944.getClass(), "genera", null);
        setField(term19944, term19944.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVarieties", argTypes, term19944, args);
    }

};


