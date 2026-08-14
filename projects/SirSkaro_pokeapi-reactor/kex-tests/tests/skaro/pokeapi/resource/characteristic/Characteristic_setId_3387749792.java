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

public class Characteristic_setId_3387749792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term37;

    public Characteristic_setId_3387749792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21 = new Integer(-2038273078);
        Integer term23 = new Integer(1227103734);
        Integer term27 = new Integer(-1339778481);
        Integer term29 = new Integer(1725571209);
        Integer term31 = new Integer(-522618178);
        Integer term33 = new Integer(1134449235);
        ArrayList term25 = new ArrayList();
        ((ArrayList) term25).add(term27);
        ((ArrayList) term25).add(term29);
        ((ArrayList) term25).add(term31);
        ((ArrayList) term25).add(term33);
        term20 = newInstance(Class.forName("skaro.pokeapi.resource.characteristic.Characteristic"));
        setField(term20, term20.getClass(), "id", term21);
        setField(term20, term20.getClass(), "geneModulo", term23);
        setField(term20, term20.getClass(), "possibleValues", term25);
        term37 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.characteristic.Characteristic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term37;
        callMethod(klass, "setId", argTypes, term20, args);
    }

};


