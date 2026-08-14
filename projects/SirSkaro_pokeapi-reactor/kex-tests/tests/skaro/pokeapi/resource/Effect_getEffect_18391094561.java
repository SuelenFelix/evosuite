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

public class Effect_getEffect_18391094561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6851;

    public Effect_getEffect_18391094561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6851 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term6864 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6851, term6851.getClass(), "effect", "JPUZuGxKlI");
        setField(term6864, term6864.getClass(), "name", "xqIbVsUspl");
        setField(term6864, term6864.getClass(), "url", "GnjLRtJywq");
        setField(term6851, term6851.getClass(), "language", term6864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Effect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffect", argTypes, term6851, args);
    }

};


