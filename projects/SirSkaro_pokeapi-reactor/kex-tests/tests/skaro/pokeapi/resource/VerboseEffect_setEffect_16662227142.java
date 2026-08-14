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
import java.lang.Object;

public class VerboseEffect_setEffect_16662227142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134398;

    public VerboseEffect_setEffect_16662227142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134398 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term134423 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term134398, term134398.getClass(), "effect", "YDUtapzoYD");
        setField(term134398, term134398.getClass(), "shortEffect", "mXRwQRQVtP");
        setField(term134423, term134423.getClass(), "name", "dsERyYQebK");
        setField(term134423, term134423.getClass(), "url", "SufgTpmWeI");
        setField(term134398, term134398.getClass(), "language", term134423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VerboseEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RZSsenFXxC";
        callMethod(klass, "setEffect", argTypes, term134398, args);
    }

};


