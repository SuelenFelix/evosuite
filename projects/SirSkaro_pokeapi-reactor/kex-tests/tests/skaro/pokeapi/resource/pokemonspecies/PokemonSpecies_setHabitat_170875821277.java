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

public class PokemonSpecies_setHabitat_170875821277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15443;

    public PokemonSpecies_setHabitat_170875821277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15443 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term15443, term15443.getClass(), "id", null);
        setField(term15443, term15443.getClass(), "name", null);
        setField(term15443, term15443.getClass(), "order", null);
        setField(term15443, term15443.getClass(), "genderRate", null);
        setField(term15443, term15443.getClass(), "captureRate", null);
        setField(term15443, term15443.getClass(), "baseHappiness", null);
        setField(term15443, term15443.getClass(), "isBaby", null);
        setField(term15443, term15443.getClass(), "isLegendary", null);
        setField(term15443, term15443.getClass(), "isMythical", null);
        setField(term15443, term15443.getClass(), "hatchCounter", null);
        setField(term15443, term15443.getClass(), "hasGenderDifferences", null);
        setField(term15443, term15443.getClass(), "formsSwitchable", null);
        setField(term15443, term15443.getClass(), "growthRate", null);
        setField(term15443, term15443.getClass(), "pokedexNumbers", null);
        setField(term15443, term15443.getClass(), "eggGroups", null);
        setField(term15443, term15443.getClass(), "color", null);
        setField(term15443, term15443.getClass(), "shape", null);
        setField(term15443, term15443.getClass(), "evolvesFromSpecies", null);
        setField(term15443, term15443.getClass(), "evolutionChain", null);
        setField(term15443, term15443.getClass(), "habitat", null);
        setField(term15443, term15443.getClass(), "generation", null);
        setField(term15443, term15443.getClass(), "names", null);
        setField(term15443, term15443.getClass(), "flavorTextEntries", null);
        setField(term15443, term15443.getClass(), "formDescriptions", null);
        setField(term15443, term15443.getClass(), "genera", null);
        setField(term15443, term15443.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHabitat", argTypes, term15443, args);
    }

};


