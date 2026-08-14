package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class GenerationGameIndex_setGameIndex_17614083092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132543;
     Object term132571;

    public GenerationGameIndex_setGameIndex_17614083092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132544 = new Integer(1859865234);
        term132543 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term132546 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132543, term132543.getClass(), "gameIndex", term132544);
        setField(term132546, term132546.getClass(), "name", "ivRXmzWDIf");
        setField(term132546, term132546.getClass(), "url", "hQeJuYTNoq");
        setField(term132543, term132543.getClass(), "generation", term132546);
        term132571 = new Integer(-201519710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.GenerationGameIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term132571;
        callMethod(klass, "setGameIndex", argTypes, term132543, args);
    }

};


