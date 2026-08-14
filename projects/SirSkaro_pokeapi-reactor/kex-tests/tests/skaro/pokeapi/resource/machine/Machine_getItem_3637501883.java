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
import java.lang.Integer;
import java.lang.Object;

public class Machine_getItem_3637501883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;

    public Machine_getItem_3637501883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term280 = new Integer(391863371);
        term279 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term282 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term307 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term332 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term279, term279.getClass(), "id", term280);
        setField(term282, term282.getClass(), "name", "MxlszYVzRf");
        setField(term282, term282.getClass(), "url", "LQFpaHEwXR");
        setField(term279, term279.getClass(), "item", term282);
        setField(term307, term307.getClass(), "name", "oVcInYnLWB");
        setField(term307, term307.getClass(), "url", "aJlieCFVtF");
        setField(term279, term279.getClass(), "move", term307);
        setField(term332, term332.getClass(), "name", "ZiaGIbnzTs");
        setField(term332, term332.getClass(), "url", "tbcdzjIfER");
        setField(term279, term279.getClass(), "versionGroup", term332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term279, args);
    }

};


