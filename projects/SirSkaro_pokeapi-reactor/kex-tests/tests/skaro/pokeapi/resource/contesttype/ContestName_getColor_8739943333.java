package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContestName_getColor_8739943333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;

    public ContestName_getColor_8739943333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term203, term203.getClass(), "name", "RMFIsYGgne");
        setField(term203, term203.getClass(), "color", "NRdvgJlhkX");
        setField(term228, term228.getClass(), "name", "uuaPigETmJ");
        setField(term228, term228.getClass(), "url", "MxlszYVzRf");
        setField(term203, term203.getClass(), "language", term228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term203, args);
    }

};


