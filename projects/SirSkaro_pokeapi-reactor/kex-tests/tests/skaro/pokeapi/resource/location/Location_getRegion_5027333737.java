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

public class Location_getRegion_5027333737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124617;

    public Location_getRegion_5027333737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term124618 = new Integer(-1423864560);
        Object term124659 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term124661 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124659, term124659.getClass(), "name", "");
        setField(term124661, term124661.getClass(), "name", null);
        setField(term124661, term124661.getClass(), "url", null);
        setField(term124659, term124659.getClass(), "language", term124661);
        Object term124662 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term124664 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124662, term124662.getClass(), "name", "");
        setField(term124664, term124664.getClass(), "name", null);
        setField(term124664, term124664.getClass(), "url", null);
        setField(term124662, term124662.getClass(), "language", term124664);
        Object term124665 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term124667 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124665, term124665.getClass(), "name", "");
        setField(term124667, term124667.getClass(), "name", null);
        setField(term124667, term124667.getClass(), "url", null);
        setField(term124665, term124665.getClass(), "language", term124667);
        Object term124668 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term124670 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124668, term124668.getClass(), "name", "");
        setField(term124670, term124670.getClass(), "name", null);
        setField(term124670, term124670.getClass(), "url", null);
        setField(term124668, term124668.getClass(), "language", term124670);
        ArrayList term124657 = new ArrayList();
        ((ArrayList) term124657).add(term124659);
        ((ArrayList) term124657).add(term124662);
        ((ArrayList) term124657).add(term124665);
        ((ArrayList) term124657).add(term124668);
        Integer term124676 = new Integer(1155538873);
        Object term124675 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124678 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124675, term124675.getClass(), "gameIndex", term124676);
        setField(term124678, term124678.getClass(), "name", null);
        setField(term124678, term124678.getClass(), "url", null);
        setField(term124675, term124675.getClass(), "generation", term124678);
        ArrayList term124673 = new ArrayList();
        ((ArrayList) term124673).add(term124675);
        ArrayList term124681 = new ArrayList();
        term124617 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term124632 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124617, term124617.getClass(), "id", term124618);
        setField(term124617, term124617.getClass(), "name", "ZtFQBjnckU");
        setField(term124632, term124632.getClass(), "name", "mPNcVymGtq");
        setField(term124632, term124632.getClass(), "url", "CPPNvBKocX");
        setField(term124617, term124617.getClass(), "region", term124632);
        setField(term124617, term124617.getClass(), "names", term124657);
        setField(term124617, term124617.getClass(), "gameIndices", term124673);
        setField(term124617, term124617.getClass(), "areas", term124681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term124617, args);
    }

};


