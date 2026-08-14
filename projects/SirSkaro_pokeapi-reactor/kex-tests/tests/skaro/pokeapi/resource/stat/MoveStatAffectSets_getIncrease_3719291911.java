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

public class MoveStatAffectSets_getIncrease_3719291911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;

    public MoveStatAffectSets_getIncrease_3719291911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term347 = new Integer(-616727354);
        Object term346 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term349 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term346, term346.getClass(), "change", term347);
        setField(term349, term349.getClass(), "name", null);
        setField(term349, term349.getClass(), "url", null);
        setField(term346, term346.getClass(), "move", term349);
        ArrayList term344 = new ArrayList();
        ((ArrayList) term344).add(term346);
        Integer term355 = new Integer(-1955890973);
        Object term354 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term357 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term354, term354.getClass(), "change", term355);
        setField(term357, term357.getClass(), "name", null);
        setField(term357, term357.getClass(), "url", null);
        setField(term354, term354.getClass(), "move", term357);
        Integer term359 = new Integer(-2038273078);
        Object term358 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term361 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term358, term358.getClass(), "change", term359);
        setField(term361, term361.getClass(), "name", null);
        setField(term361, term361.getClass(), "url", null);
        setField(term358, term358.getClass(), "move", term361);
        Integer term363 = new Integer(1227103734);
        Object term362 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term365 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term362, term362.getClass(), "change", term363);
        setField(term365, term365.getClass(), "name", null);
        setField(term365, term365.getClass(), "url", null);
        setField(term362, term362.getClass(), "move", term365);
        Integer term367 = new Integer(-1339778481);
        Object term366 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term369 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term366, term366.getClass(), "change", term367);
        setField(term369, term369.getClass(), "name", null);
        setField(term369, term369.getClass(), "url", null);
        setField(term366, term366.getClass(), "move", term369);
        Integer term371 = new Integer(1725571209);
        Object term370 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term373 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term370, term370.getClass(), "change", term371);
        setField(term373, term373.getClass(), "name", null);
        setField(term373, term373.getClass(), "url", null);
        setField(term370, term370.getClass(), "move", term373);
        Integer term375 = new Integer(-522618178);
        Object term374 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        Object term377 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term374, term374.getClass(), "change", term375);
        setField(term377, term377.getClass(), "name", null);
        setField(term377, term377.getClass(), "url", null);
        setField(term374, term374.getClass(), "move", term377);
        ArrayList term352 = new ArrayList();
        ((ArrayList) term352).add(term354);
        ((ArrayList) term352).add(term358);
        ((ArrayList) term352).add(term362);
        ((ArrayList) term352).add(term366);
        ((ArrayList) term352).add(term370);
        ((ArrayList) term352).add(term374);
        term343 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        setField(term343, term343.getClass(), "increase", term344);
        setField(term343, term343.getClass(), "decrease", term352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncrease", argTypes, term343, args);
    }

};


