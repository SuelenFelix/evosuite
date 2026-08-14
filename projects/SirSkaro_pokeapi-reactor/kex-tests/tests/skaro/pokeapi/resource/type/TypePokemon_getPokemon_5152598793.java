package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class TypePokemon_getPokemon_5152598793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;

    public TypePokemon_getPokemon_5152598793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term100 = new Integer(391863371);
        term99 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term102 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term99, term99.getClass(), "slot", term100);
        setField(term102, term102.getClass(), "name", "jJCZpVmanW");
        setField(term102, term102.getClass(), "url", "EGtDIRbSSb");
        setField(term99, term99.getClass(), "pokemon", term102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypePokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term99, args);
    }

};


