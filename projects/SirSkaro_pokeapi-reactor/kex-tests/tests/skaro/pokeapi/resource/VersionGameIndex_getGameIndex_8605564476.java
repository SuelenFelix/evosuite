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

public class VersionGameIndex_getGameIndex_8605564476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135661;

    public VersionGameIndex_getGameIndex_8605564476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135661 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGameIndex"));
        setField(term135661, term135661.getClass(), "gameIndex", null);
        setField(term135661, term135661.getClass(), "version", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGameIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndex", argTypes, term135661, args);
    }

};


