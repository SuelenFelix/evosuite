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
import java.util.LinkedList;

public class BerryFirmness_setNames_15921150408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;
     Object term381;

    public BerryFirmness_setNames_15921150408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term338 = new Integer(1227103734);
        ArrayList term352 = new ArrayList();
        Object term358 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term360 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term358, term358.getClass(), "name", "");
        setField(term360, term360.getClass(), "name", null);
        setField(term360, term360.getClass(), "url", null);
        setField(term358, term358.getClass(), "language", term360);
        Object term361 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term363 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term361, term361.getClass(), "name", "");
        setField(term363, term363.getClass(), "name", null);
        setField(term363, term363.getClass(), "url", null);
        setField(term361, term361.getClass(), "language", term363);
        Object term364 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term366 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term364, term364.getClass(), "name", "");
        setField(term366, term366.getClass(), "name", null);
        setField(term366, term366.getClass(), "url", null);
        setField(term364, term364.getClass(), "language", term366);
        Object term367 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term369 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term367, term367.getClass(), "name", "");
        setField(term369, term369.getClass(), "name", null);
        setField(term369, term369.getClass(), "url", null);
        setField(term367, term367.getClass(), "language", term369);
        Object term370 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term370, term370.getClass(), "name", "");
        setField(term372, term372.getClass(), "name", null);
        setField(term372, term372.getClass(), "url", null);
        setField(term370, term370.getClass(), "language", term372);
        Object term373 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term375 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term373, term373.getClass(), "name", "");
        setField(term375, term375.getClass(), "name", null);
        setField(term375, term375.getClass(), "url", null);
        setField(term373, term373.getClass(), "language", term375);
        Object term376 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term378 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term376, term376.getClass(), "name", "");
        setField(term378, term378.getClass(), "name", null);
        setField(term378, term378.getClass(), "url", null);
        setField(term376, term376.getClass(), "language", term378);
        ArrayList term356 = new ArrayList();
        ((ArrayList) term356).add(term358);
        ((ArrayList) term356).add(term361);
        ((ArrayList) term356).add(term364);
        ((ArrayList) term356).add(term367);
        ((ArrayList) term356).add(term370);
        ((ArrayList) term356).add(term373);
        ((ArrayList) term356).add(term376);
        term337 = newInstance(Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness"));
        setField(term337, term337.getClass(), "id", term338);
        setField(term337, term337.getClass(), "name", "PHvxnGHptP");
        setField(term337, term337.getClass(), "berries", term352);
        setField(term337, term337.getClass(), "names", term356);
        term381 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryfirmness.BerryFirmness");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term381;
        callMethod(klass, "setNames", argTypes, term337, args);
    }

};


