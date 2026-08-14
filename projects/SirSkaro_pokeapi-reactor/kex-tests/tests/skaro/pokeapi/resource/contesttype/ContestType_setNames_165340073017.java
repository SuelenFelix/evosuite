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

public class ContestType_setNames_165340073017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1431;

    public ContestType_setNames_165340073017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1431 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        setField(term1431, term1431.getClass(), "id", null);
        setField(term1431, term1431.getClass(), "name", null);
        setField(term1431, term1431.getClass(), "berryFlavor", null);
        setField(term1431, term1431.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term1431, args);
    }

};


