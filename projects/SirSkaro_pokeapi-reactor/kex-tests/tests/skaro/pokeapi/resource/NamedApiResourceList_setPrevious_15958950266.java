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

public class NamedApiResourceList_setPrevious_15958950266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8847;

    public NamedApiResourceList_setPrevious_15958950266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8848 = new Integer(1414025609);
        ArrayList term8874 = new ArrayList();
        term8847 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8847, term8847.getClass(), "count", term8848);
        setField(term8847, term8847.getClass(), "next", "FLLklaMZvg");
        setField(term8847, term8847.getClass(), "previous", "jRDZpkFkoD");
        setField(term8847, term8847.getClass(), "results", term8874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wwSknqIBIO";
        callMethod(klass, "setPrevious", argTypes, term8847, args);
    }

};


