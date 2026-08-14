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

public class Characteristic_getPossibleValues_11873218255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public Characteristic_getPossibleValues_11873218255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term74 = new Integer(590364439);
        Integer term76 = new Integer(865208305);
        Integer term80 = new Integer(-1275173084);
        ArrayList term78 = new ArrayList();
        ((ArrayList) term78).add(term80);
        term73 = newInstance(Class.forName("skaro.pokeapi.resource.characteristic.Characteristic"));
        setField(term73, term73.getClass(), "id", term74);
        setField(term73, term73.getClass(), "geneModulo", term76);
        setField(term73, term73.getClass(), "possibleValues", term78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.characteristic.Characteristic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPossibleValues", argTypes, term73, args);
    }

};


