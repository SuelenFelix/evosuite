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

public class BerryFirmness_getBerries_20545951705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;

    public BerryFirmness_getBerries_20545951705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term218 = new Integer(-616727354);
        ArrayList term232 = new ArrayList();
        Object term238 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term240 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term238, term238.getClass(), "name", "");
        setField(term240, term240.getClass(), "name", null);
        setField(term240, term240.getClass(), "url", null);
        setField(term238, term238.getClass(), "language", term240);
        ArrayList term236 = new ArrayList();
        ((ArrayList) term236).add(term238);
        term217 = newInstance(Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness"));
        setField(term217, term217.getClass(), "id", term218);
        setField(term217, term217.getClass(), "name", "uWHnvSvaPl");
        setField(term217, term217.getClass(), "berries", term232);
        setField(term217, term217.getClass(), "names", term236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBerries", argTypes, term217, args);
    }

};


