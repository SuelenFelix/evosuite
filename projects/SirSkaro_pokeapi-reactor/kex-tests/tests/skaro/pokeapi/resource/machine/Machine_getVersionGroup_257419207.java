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

public class Machine_getVersionGroup_257419207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public Machine_getVersionGroup_257419207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term922 = new Integer(-2038273078);
        term921 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term924 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term949 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term974 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term921, term921.getClass(), "id", term922);
        setField(term924, term924.getClass(), "name", "BndsHwAFMv");
        setField(term924, term924.getClass(), "url", "GzFkzHGYFt");
        setField(term921, term921.getClass(), "item", term924);
        setField(term949, term949.getClass(), "name", "tShwQLRGNe");
        setField(term949, term949.getClass(), "url", "LvtrsXUliU");
        setField(term921, term921.getClass(), "move", term949);
        setField(term974, term974.getClass(), "name", "xLbjWUgOIL");
        setField(term974, term974.getClass(), "url", "jDtqGUpnZN");
        setField(term921, term921.getClass(), "versionGroup", term974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term921, args);
    }

};


