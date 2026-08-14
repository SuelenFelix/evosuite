package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Location_setRegion_8214456138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124715;
     Object term124771;

    public Location_setRegion_8214456138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term124716 = new Integer(868120753);
        ArrayList term124755 = new ArrayList();
        Integer term124762 = new Integer(691240568);
        Object term124761 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124764 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124761, term124761.getClass(), "gameIndex", term124762);
        setField(term124764, term124764.getClass(), "name", null);
        setField(term124764, term124764.getClass(), "url", null);
        setField(term124761, term124761.getClass(), "generation", term124764);
        ArrayList term124759 = new ArrayList();
        ((ArrayList) term124759).add(term124761);
        ArrayList term124767 = new ArrayList();
        term124715 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term124730 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124715, term124715.getClass(), "id", term124716);
        setField(term124715, term124715.getClass(), "name", "yehATIYozP");
        setField(term124730, term124730.getClass(), "name", "OIYKWuALzC");
        setField(term124730, term124730.getClass(), "url", "prCDUpGeTL");
        setField(term124715, term124715.getClass(), "region", term124730);
        setField(term124715, term124715.getClass(), "names", term124755);
        setField(term124715, term124715.getClass(), "gameIndices", term124759);
        setField(term124715, term124715.getClass(), "areas", term124767);
        term124771 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124771, term124771.getClass(), "name", "VxYPRMncBg");
        setField(term124771, term124771.getClass(), "url", "QfXCYuxTpu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term124771;
        callMethod(klass, "setRegion", argTypes, term124715, args);
    }

};


