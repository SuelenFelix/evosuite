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

public class NamedApiResourceList_getNext_1353146663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8672;

    public NamedApiResourceList_getNext_1353146663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8673 = new Integer(1532723756);
        ArrayList term8699 = new ArrayList();
        term8672 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8672, term8672.getClass(), "count", term8673);
        setField(term8672, term8672.getClass(), "next", "nGYLfZrtWO");
        setField(term8672, term8672.getClass(), "previous", "DBufEhhBCQ");
        setField(term8672, term8672.getClass(), "results", term8699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNext", argTypes, term8672, args);
    }

};


