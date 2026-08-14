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

public class NamedApiResourceList_setCount_7090976952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8619;
     Object term8650;

    public NamedApiResourceList_setCount_7090976952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8620 = new Integer(1163761623);
        ArrayList term8646 = new ArrayList();
        term8619 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8619, term8619.getClass(), "count", term8620);
        setField(term8619, term8619.getClass(), "next", "SWMYovqYdk");
        setField(term8619, term8619.getClass(), "previous", "TQuvAoQcBe");
        setField(term8619, term8619.getClass(), "results", term8646);
        term8650 = new Integer(718742281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term8650;
        callMethod(klass, "setCount", argTypes, term8619, args);
    }

};


