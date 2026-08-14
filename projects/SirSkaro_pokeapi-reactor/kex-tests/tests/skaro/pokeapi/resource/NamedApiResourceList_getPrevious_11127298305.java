package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class NamedApiResourceList_getPrevious_11127298305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8796;

    public NamedApiResourceList_getPrevious_11127298305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8797 = new Integer(777492093);
        ArrayList term8823 = new ArrayList();
        term8796 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8796, term8796.getClass(), "count", term8797);
        setField(term8796, term8796.getClass(), "next", "vyvpqcHTQN");
        setField(term8796, term8796.getClass(), "previous", "QQcpNMSHvA");
        setField(term8796, term8796.getClass(), "results", term8823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrevious", argTypes, term8796, args);
    }

};


