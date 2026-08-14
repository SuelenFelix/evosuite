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
import java.lang.Integer;
import java.lang.Object;

public class VersionGameIndex_setGameIndex_6238709032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135470;
     Object term135498;

    public VersionGameIndex_setGameIndex_6238709032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term135471 = new Integer(-222360853);
        term135470 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGameIndex"));
        Object term135473 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135470, term135470.getClass(), "gameIndex", term135471);
        setField(term135473, term135473.getClass(), "name", "pQvwqAQDnY");
        setField(term135473, term135473.getClass(), "url", "uAnhyhvuhZ");
        setField(term135470, term135470.getClass(), "version", term135473);
        term135498 = new Integer(-886522384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGameIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term135498;
        callMethod(klass, "setGameIndex", argTypes, term135470, args);
    }

};


