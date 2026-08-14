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

public class NamedApiResourceList_setNext_15845619024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8723;

    public NamedApiResourceList_setNext_15845619024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8724 = new Integer(-124088550);
        ArrayList term8750 = new ArrayList();
        term8723 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8723, term8723.getClass(), "count", term8724);
        setField(term8723, term8723.getClass(), "next", "GiNZRBZjgO");
        setField(term8723, term8723.getClass(), "previous", "ceGAKcClsG");
        setField(term8723, term8723.getClass(), "results", term8750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SEldZGJyvX";
        callMethod(klass, "setNext", argTypes, term8723, args);
    }

};


