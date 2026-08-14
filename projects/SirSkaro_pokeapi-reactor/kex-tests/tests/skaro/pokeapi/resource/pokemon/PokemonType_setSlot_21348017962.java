package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class PokemonType_setSlot_21348017962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;
     Object term1008;

    public PokemonType_setSlot_21348017962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term981 = new Integer(1962444399);
        term980 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term983 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term980, term980.getClass(), "slot", term981);
        setField(term983, term983.getClass(), "name", "jUbSRrkrYZ");
        setField(term983, term983.getClass(), "url", "bWWfajKbEX");
        setField(term980, term980.getClass(), "type", term983);
        term1008 = new Integer(767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1008;
        callMethod(klass, "setSlot", argTypes, term980, args);
    }

};


