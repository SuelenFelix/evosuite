package skaro.pokeapi.resource.characteristic;

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
import static skaro.pokeapi.resource.characteristic.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class Characteristic_getGeneModulo_17760324213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;

    public Characteristic_getGeneModulo_17760324213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40 = new Integer(1585847225);
        Integer term42 = new Integer(597278769);
        Integer term46 = new Integer(-1685132342);
        Integer term48 = new Integer(-1456670397);
        Integer term50 = new Integer(1622346318);
        ArrayList term44 = new ArrayList();
        ((ArrayList) term44).add(term46);
        ((ArrayList) term44).add(term48);
        ((ArrayList) term44).add(term50);
        term39 = newInstance(Class.forName("skaro.pokeapi.resource.characteristic.Characteristic"));
        setField(term39, term39.getClass(), "id", term40);
        setField(term39, term39.getClass(), "geneModulo", term42);
        setField(term39, term39.getClass(), "possibleValues", term44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.characteristic.Characteristic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneModulo", argTypes, term39, args);
    }

};


