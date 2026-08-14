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
import java.util.LinkedList;
import java.lang.Object;

public class NamedApiResourceList_setResults_12962061008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8971;
     Object term9002;

    public NamedApiResourceList_setResults_12962061008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8972 = new Integer(-573608449);
        ArrayList term8998 = new ArrayList();
        term8971 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8971, term8971.getClass(), "count", term8972);
        setField(term8971, term8971.getClass(), "next", "crMeWqJOCQ");
        setField(term8971, term8971.getClass(), "previous", "VUVgiQvSYa");
        setField(term8971, term8971.getClass(), "results", term8998);
        Object term9005 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term9005, term9005.getClass(), "name", "ZBLFNFVEHD");
        setField(term9005, term9005.getClass(), "url", "miNxpUfOyL");
        Object term9031 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term9031, term9031.getClass(), "name", "");
        setField(term9031, term9031.getClass(), "url", "");
        term9002 = new LinkedList();
        ((LinkedList) term9002).add(term9005);
        ((LinkedList) term9002).add(term9031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9002;
        callMethod(klass, "setResults", argTypes, term8971, args);
    }

};


