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

public class NamedApiResourceList_getName_13935086610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9126;

    public NamedApiResourceList_getName_13935086610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9127 = new Integer(1816273440);
        ArrayList term9153 = new ArrayList();
        term9126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResourceList"));
        setField(term9126, term9126.getClass(), "count", term9127);
        setField(term9126, term9126.getClass(), "next", "pkQawlBtEF");
        setField(term9126, term9126.getClass(), "previous", "rdKTcvHHnV");
        setField(term9126, term9126.getClass(), "results", term9153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.NamedApiResourceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term9126, args);
    }

};


