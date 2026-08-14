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

public class Nature_getDecreasedStat_200551325721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19803;

    public Nature_getDecreasedStat_200551325721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19803 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        setField(term19803, term19803.getClass(), "id", null);
        setField(term19803, term19803.getClass(), "name", null);
        setField(term19803, term19803.getClass(), "decreasedStat", null);
        setField(term19803, term19803.getClass(), "increasedStat", null);
        setField(term19803, term19803.getClass(), "hatesFlavor", null);
        setField(term19803, term19803.getClass(), "likesFlavor", null);
        setField(term19803, term19803.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDecreasedStat", argTypes, term19803, args);
    }

};


