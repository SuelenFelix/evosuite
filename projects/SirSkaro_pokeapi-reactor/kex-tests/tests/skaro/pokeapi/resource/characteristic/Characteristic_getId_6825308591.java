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

public class Characteristic_getId_6825308591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Characteristic_getId_6825308591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term4 = new Integer(1162663216);
        Integer term8 = new Integer(1484323161);
        Integer term10 = new Integer(391863371);
        Integer term12 = new Integer(-1922583790);
        Integer term14 = new Integer(-616727354);
        Integer term16 = new Integer(-1955890973);
        ArrayList term6 = new ArrayList();
        ((ArrayList) term6).add(term8);
        ((ArrayList) term6).add(term10);
        ((ArrayList) term6).add(term12);
        ((ArrayList) term6).add(term14);
        ((ArrayList) term6).add(term16);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.characteristic.Characteristic"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "geneModulo", term4);
        setField(term1, term1.getClass(), "possibleValues", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.characteristic.Characteristic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


