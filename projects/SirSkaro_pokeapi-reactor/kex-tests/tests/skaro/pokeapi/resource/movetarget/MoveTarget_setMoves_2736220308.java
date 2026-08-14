package skaro.pokeapi.resource.movetarget;

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
import static skaro.pokeapi.resource.movetarget.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MoveTarget_setMoves_2736220308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437;
     Object term473;

    public MoveTarget_setMoves_2736220308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term438 = new Integer(1227103734);
        Object term454 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term456 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term454, term454.getClass(), "description", "");
        setField(term456, term456.getClass(), "name", null);
        setField(term456, term456.getClass(), "url", null);
        setField(term454, term454.getClass(), "language", term456);
        Object term457 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term457, term457.getClass(), "description", "");
        setField(term459, term459.getClass(), "name", null);
        setField(term459, term459.getClass(), "url", null);
        setField(term457, term457.getClass(), "language", term459);
        ArrayList term452 = new ArrayList();
        ((ArrayList) term452).add(term454);
        ((ArrayList) term452).add(term457);
        ArrayList term462 = new ArrayList();
        Object term468 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term470 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term468, term468.getClass(), "name", "");
        setField(term470, term470.getClass(), "name", null);
        setField(term470, term470.getClass(), "url", null);
        setField(term468, term468.getClass(), "language", term470);
        ArrayList term466 = new ArrayList();
        ((ArrayList) term466).add(term468);
        term437 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term437, term437.getClass(), "id", term438);
        setField(term437, term437.getClass(), "name", "HWkpTmtlrc");
        setField(term437, term437.getClass(), "descriptions", term452);
        setField(term437, term437.getClass(), "moves", term462);
        setField(term437, term437.getClass(), "names", term466);
        term473 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term473;
        callMethod(klass, "setMoves", argTypes, term437, args);
    }

};


