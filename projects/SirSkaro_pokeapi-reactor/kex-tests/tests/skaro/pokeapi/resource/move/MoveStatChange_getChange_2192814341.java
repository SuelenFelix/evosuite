package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MoveStatChange_getChange_2192814341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4688;

    public MoveStatChange_getChange_2192814341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4689 = new Integer(-1835839814);
        term4688 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveStatChange"));
        Object term4691 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4688, term4688.getClass(), "change", term4689);
        setField(term4691, term4691.getClass(), "name", "PvmBHIXaMY");
        setField(term4691, term4691.getClass(), "url", "hulYxtowxw");
        setField(term4688, term4688.getClass(), "stat", term4691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveStatChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChange", argTypes, term4688, args);
    }

};


