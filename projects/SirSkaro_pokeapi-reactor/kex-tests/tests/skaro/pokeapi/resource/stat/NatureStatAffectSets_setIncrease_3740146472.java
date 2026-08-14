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
import java.util.LinkedList;
import java.lang.Object;

public class NatureStatAffectSets_setIncrease_3740146472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;
     Object term262;

    public NatureStatAffectSets_setIncrease_3740146472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term254 = new ArrayList();
        ArrayList term258 = new ArrayList();
        term253 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        setField(term253, term253.getClass(), "increase", term254);
        setField(term253, term253.getClass(), "decrease", term258);
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term265, term265.getClass(), "name", "oVcInYnLWB");
        setField(term265, term265.getClass(), "url", "aJlieCFVtF");
        Object term291 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term291, term291.getClass(), "name", "");
        setField(term291, term291.getClass(), "url", "");
        Object term295 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term295, term295.getClass(), "name", null);
        setField(term295, term295.getClass(), "url", null);
        term262 = new LinkedList();
        ((LinkedList) term262).add(term265);
        ((LinkedList) term262).add(term291);
        ((LinkedList) term262).add(term295);
        ((LinkedList) term262).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term262;
        callMethod(klass, "setIncrease", argTypes, term253, args);
    }

};


