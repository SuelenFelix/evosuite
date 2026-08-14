package skaro.pokeapi.resource.berryfirmness;

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
import static skaro.pokeapi.resource.berryfirmness.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFirmness_setName_19886096004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;

    public BerryFirmness_setName_19886096004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term145 = new Integer(-1922583790);
        ArrayList term159 = new ArrayList();
        Object term165 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term167 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term165, term165.getClass(), "name", "");
        setField(term167, term167.getClass(), "name", null);
        setField(term167, term167.getClass(), "url", null);
        setField(term165, term165.getClass(), "language", term167);
        Object term168 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term170 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term168, term168.getClass(), "name", "");
        setField(term170, term170.getClass(), "name", null);
        setField(term170, term170.getClass(), "url", null);
        setField(term168, term168.getClass(), "language", term170);
        Object term171 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term173 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term171, term171.getClass(), "name", "");
        setField(term173, term173.getClass(), "name", null);
        setField(term173, term173.getClass(), "url", null);
        setField(term171, term171.getClass(), "language", term173);
        Object term174 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term176 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term174, term174.getClass(), "name", "");
        setField(term176, term176.getClass(), "name", null);
        setField(term176, term176.getClass(), "url", null);
        setField(term174, term174.getClass(), "language", term176);
        Object term177 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term179 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term177, term177.getClass(), "name", "");
        setField(term179, term179.getClass(), "name", null);
        setField(term179, term179.getClass(), "url", null);
        setField(term177, term177.getClass(), "language", term179);
        Object term180 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term182 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term180, term180.getClass(), "name", "");
        setField(term182, term182.getClass(), "name", null);
        setField(term182, term182.getClass(), "url", null);
        setField(term180, term180.getClass(), "language", term182);
        ArrayList term163 = new ArrayList();
        ((ArrayList) term163).add(term165);
        ((ArrayList) term163).add(term168);
        ((ArrayList) term163).add(term171);
        ((ArrayList) term163).add(term174);
        ((ArrayList) term163).add(term177);
        ((ArrayList) term163).add(term180);
        term144 = newInstance(Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness"));
        setField(term144, term144.getClass(), "id", term145);
        setField(term144, term144.getClass(), "name", "GzFkzHGYFt");
        setField(term144, term144.getClass(), "berries", term159);
        setField(term144, term144.getClass(), "names", term163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setName", argTypes, term144, args);
    }

};


