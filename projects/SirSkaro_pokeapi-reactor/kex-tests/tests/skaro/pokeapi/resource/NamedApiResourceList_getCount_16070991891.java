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

public class NamedApiResourceList_getCount_16070991891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8568;

    public NamedApiResourceList_getCount_16070991891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8569 = new Integer(-838848221);
        ArrayList term8595 = new ArrayList();
        term8568 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term8568, term8568.getClass(), "count", term8569);
        setField(term8568, term8568.getClass(), "next", "aJUGPodUIW");
        setField(term8568, term8568.getClass(), "previous", "NpjPDfnDRd");
        setField(term8568, term8568.getClass(), "results", term8595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term8568, args);
    }

};


