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
import java.util.LinkedList;
import java.lang.Object;

public class Characteristic_setPossibleValues_491263756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term105;

    public Characteristic_setPossibleValues_491263756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term85 = new Integer(-244121226);
        Integer term87 = new Integer(-203030934);
        Integer term91 = new Integer(-1179120542);
        Integer term93 = new Integer(-73683645);
        Integer term95 = new Integer(-226514366);
        Integer term97 = new Integer(1193880199);
        Integer term99 = new Integer(-1087774327);
        Integer term101 = new Integer(-1530420153);
        ArrayList term89 = new ArrayList();
        ((ArrayList) term89).add(term91);
        ((ArrayList) term89).add(term93);
        ((ArrayList) term89).add(term95);
        ((ArrayList) term89).add(term97);
        ((ArrayList) term89).add(term99);
        ((ArrayList) term89).add(term101);
        term84 = newInstance(Class.forName("skaro.pokeapi.resource.characteristic.Characteristic"));
        setField(term84, term84.getClass(), "id", term85);
        setField(term84, term84.getClass(), "geneModulo", term87);
        setField(term84, term84.getClass(), "possibleValues", term89);
        Integer term108 = new Integer(-469968304);
        Integer term111 = new Integer(-1145578966);
        Integer term114 = new Integer(679763016);
        Integer term117 = new Integer(1962444399);
        term105 = new LinkedList();
        ((LinkedList) term105).add(term108);
        ((LinkedList) term105).add(term111);
        ((LinkedList) term105).add(term114);
        ((LinkedList) term105).add(term117);
        ((LinkedList) term105).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.characteristic.Characteristic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "setPossibleValues", argTypes, term84, args);
    }

};


