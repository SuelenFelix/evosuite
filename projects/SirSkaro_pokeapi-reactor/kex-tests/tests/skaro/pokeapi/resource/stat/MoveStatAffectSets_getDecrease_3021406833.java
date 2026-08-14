package skaro.pokeapi.resource.stat;

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
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class MoveStatAffectSets_getDecrease_3021406833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;

    public MoveStatAffectSets_getDecrease_3021406833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term467 = new ArrayList();
        Integer term474 = new Integer(-1179120542);
        Object term473 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term476 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term473, term473.getClass(), "change", term474);
        setField(term476, term476.getClass(), "name", null);
        setField(term476, term476.getClass(), "url", null);
        setField(term473, term473.getClass(), "move", term476);
        Integer term478 = new Integer(-73683645);
        Object term477 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term480 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term477, term477.getClass(), "change", term478);
        setField(term480, term480.getClass(), "name", null);
        setField(term480, term480.getClass(), "url", null);
        setField(term477, term477.getClass(), "move", term480);
        ArrayList term471 = new ArrayList();
        ((ArrayList) term471).add(term473);
        ((ArrayList) term471).add(term477);
        term466 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        setField(term466, term466.getClass(), "increase", term467);
        setField(term466, term466.getClass(), "decrease", term471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDecrease", argTypes, term466, args);
    }

};


