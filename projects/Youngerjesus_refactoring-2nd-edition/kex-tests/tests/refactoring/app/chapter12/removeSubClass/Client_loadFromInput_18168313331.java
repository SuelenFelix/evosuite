package refactoring.app.chapter12.removeSubClass;

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
import static refactoring.app.chapter12.removeSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class Client_loadFromInput_18168313331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term138;

    public Client_loadFromInput_18168313331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("refactoring.app.chapter12.removeSubClass.Client"));
        Object term141 = newInstance(Class.forName("refactoring.app.chapter12.removeSubClass.Data"));
        setField(term141, term141.getClass(), "name", "SzjVpOQTyS");
        setField(term141, term141.getClass(), "gender", "MjGYSRKTNF");
        Object term167 = newInstance(Class.forName("refactoring.app.chapter12.removeSubClass.Data"));
        setField(term167, term167.getClass(), "name", "");
        setField(term167, term167.getClass(), "gender", "");
        Object term171 = newInstance(Class.forName("refactoring.app.chapter12.removeSubClass.Data"));
        setField(term171, term171.getClass(), "name", null);
        setField(term171, term171.getClass(), "gender", null);
        term138 = new LinkedList();
        ((LinkedList) term138).add(term141);
        ((LinkedList) term138).add(term167);
        ((LinkedList) term138).add(term171);
        ((LinkedList) term138).add((Object)null);
        ((LinkedList) term138).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.removeSubClass.Client");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term138;
        callMethod(klass, "loadFromInput", argTypes, term137, args);
    }

};


