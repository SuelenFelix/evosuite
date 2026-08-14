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

public class Location_setRegion_8214456136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;
     Object term617;

    public Location_setRegion_8214456136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term563 = new Integer(1135664017);
        Object term604 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term606 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term604, term604.getClass(), "name", "");
        setField(term606, term606.getClass(), "name", null);
        setField(term606, term606.getClass(), "url", null);
        setField(term604, term604.getClass(), "language", term606);
        ArrayList term602 = new ArrayList();
        ((ArrayList) term602).add(term604);
        ArrayList term609 = new ArrayList();
        ArrayList term613 = new ArrayList();
        term562 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term562, term562.getClass(), "id", term563);
        setField(term562, term562.getClass(), "name", "qxSDVejjiY");
        setField(term577, term577.getClass(), "name", "xBsXSDjXYK");
        setField(term577, term577.getClass(), "url", "sEnIVFtZuQ");
        setField(term562, term562.getClass(), "region", term577);
        setField(term562, term562.getClass(), "names", term602);
        setField(term562, term562.getClass(), "gameIndices", term609);
        setField(term562, term562.getClass(), "areas", term613);
        term617 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term617, term617.getClass(), "name", "RYdKCNNMBR");
        setField(term617, term617.getClass(), "url", "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term617;
        callMethod(klass, "setRegion", argTypes, term562, args);
    }

};


