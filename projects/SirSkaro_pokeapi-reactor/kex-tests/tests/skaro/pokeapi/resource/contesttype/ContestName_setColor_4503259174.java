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
import java.lang.Object;

public class ContestName_setColor_4503259174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public ContestName_setColor_4503259174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term293, term293.getClass(), "name", "LQFpaHEwXR");
        setField(term293, term293.getClass(), "color", "oVcInYnLWB");
        setField(term318, term318.getClass(), "name", "aJlieCFVtF");
        setField(term318, term318.getClass(), "url", "ZiaGIbnzTs");
        setField(term293, term293.getClass(), "language", term318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "setColor", argTypes, term293, args);
    }

};


