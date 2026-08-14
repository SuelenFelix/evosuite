package skaro.pokeapi.resource.machine;

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
import static skaro.pokeapi.resource.machine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Machine_setMove_66682293815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;

    public Machine_setMove_66682293815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1247 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        setField(term1247, term1247.getClass(), "id", null);
        setField(term1247, term1247.getClass(), "item", null);
        setField(term1247, term1247.getClass(), "move", null);
        setField(term1247, term1247.getClass(), "versionGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMove", argTypes, term1247, args);
    }

};


