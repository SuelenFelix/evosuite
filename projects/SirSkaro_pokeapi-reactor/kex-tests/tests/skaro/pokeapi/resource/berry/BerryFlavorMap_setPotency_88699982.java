package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class BerryFlavorMap_setPotency_88699982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4808;
     Object term4836;

    public BerryFlavorMap_setPotency_88699982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4809 = new Integer(-376422566);
        term4808 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term4811 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4808, term4808.getClass(), "potency", term4809);
        setField(term4811, term4811.getClass(), "name", "HpZXWDPhlg");
        setField(term4811, term4811.getClass(), "url", "lBOokzEPfe");
        setField(term4808, term4808.getClass(), "flavor", term4811);
        term4836 = new Integer(306847454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4836;
        callMethod(klass, "setPotency", argTypes, term4808, args);
    }

};


