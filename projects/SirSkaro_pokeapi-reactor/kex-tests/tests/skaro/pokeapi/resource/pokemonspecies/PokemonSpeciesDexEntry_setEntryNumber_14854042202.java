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
import java.lang.Integer;
import java.lang.Object;

public class PokemonSpeciesDexEntry_setEntryNumber_14854042202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;
     Object term663;

    public PokemonSpeciesDexEntry_setEntryNumber_14854042202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term636 = new Integer(1162663216);
        term635 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesDexEntry"));
        Object term638 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term635, term635.getClass(), "entryNumber", term636);
        setField(term638, term638.getClass(), "name", "dWRymuLBtr");
        setField(term638, term638.getClass(), "url", "AijpHYOFuy");
        setField(term635, term635.getClass(), "pokedex", term638);
        term663 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpeciesDexEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term663;
        callMethod(klass, "setEntryNumber", argTypes, term635, args);
    }

};


