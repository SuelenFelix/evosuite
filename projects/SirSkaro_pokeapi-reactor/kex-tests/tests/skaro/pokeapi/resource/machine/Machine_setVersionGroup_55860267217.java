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

public class Machine_setVersionGroup_55860267217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1249;

    public Machine_setVersionGroup_55860267217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1249 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        setField(term1249, term1249.getClass(), "id", null);
        setField(term1249, term1249.getClass(), "item", null);
        setField(term1249, term1249.getClass(), "move", null);
        setField(term1249, term1249.getClass(), "versionGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVersionGroup", argTypes, term1249, args);
    }

};


