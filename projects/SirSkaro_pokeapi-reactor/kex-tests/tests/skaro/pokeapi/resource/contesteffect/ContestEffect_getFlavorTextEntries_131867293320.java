package skaro.pokeapi.resource.contesteffect;

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
import static skaro.pokeapi.resource.contesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContestEffect_getFlavorTextEntries_131867293320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;

    public ContestEffect_getFlavorTextEntries_131867293320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term453, term453.getClass(), "id", null);
        setField(term453, term453.getClass(), "appeal", null);
        setField(term453, term453.getClass(), "jam", null);
        setField(term453, term453.getClass(), "effectEntries", null);
        setField(term453, term453.getClass(), "flavorTextEntries", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term453, args);
    }

};


