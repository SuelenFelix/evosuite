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

public class NamedApiResourceList_getResults_6583189387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8920;

    public NamedApiResourceList_getResults_6583189387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8921 = new Integer(255145822);
        ArrayList term8947 = new ArrayList();
        term8920 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8920, term8920.getClass(), "count", term8921);
        setField(term8920, term8920.getClass(), "next", "zQPAxUFaeX");
        setField(term8920, term8920.getClass(), "previous", "cKNHUkrYfK");
        setField(term8920, term8920.getClass(), "results", term8947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResults", argTypes, term8920, args);
    }

};


