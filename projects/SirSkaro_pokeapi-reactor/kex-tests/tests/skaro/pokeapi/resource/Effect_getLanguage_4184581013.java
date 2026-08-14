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

public class Effect_getLanguage_4184581013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7009;

    public Effect_getLanguage_4184581013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7009 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term7022 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7009, term7009.getClass(), "effect", "dfZepHfGwh");
        setField(term7022, term7022.getClass(), "name", "zjfMxUERFZ");
        setField(term7022, term7022.getClass(), "url", "ooVlhmiOff");
        setField(term7009, term7009.getClass(), "language", term7022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Effect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term7009, args);
    }

};


