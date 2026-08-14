package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Nature_getIncreasedStat_9822181638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18095;

    public Nature_getIncreasedStat_9822181638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18095 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        setField(term18095, term18095.getClass(), "id", null);
        setField(term18095, term18095.getClass(), "name", null);
        setField(term18095, term18095.getClass(), "decreasedStat", null);
        setField(term18095, term18095.getClass(), "increasedStat", null);
        setField(term18095, term18095.getClass(), "hatesFlavor", null);
        setField(term18095, term18095.getClass(), "likesFlavor", null);
        setField(term18095, term18095.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncreasedStat", argTypes, term18095, args);
    }

};


