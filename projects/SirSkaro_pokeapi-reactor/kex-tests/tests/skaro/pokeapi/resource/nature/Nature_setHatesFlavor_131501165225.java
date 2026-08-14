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

public class Nature_setHatesFlavor_131501165225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;

    public Nature_setHatesFlavor_131501165225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3313 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        setField(term3313, term3313.getClass(), "id", null);
        setField(term3313, term3313.getClass(), "name", null);
        setField(term3313, term3313.getClass(), "decreasedStat", null);
        setField(term3313, term3313.getClass(), "increasedStat", null);
        setField(term3313, term3313.getClass(), "hatesFlavor", null);
        setField(term3313, term3313.getClass(), "likesFlavor", null);
        setField(term3313, term3313.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHatesFlavor", argTypes, term3313, args);
    }

};


