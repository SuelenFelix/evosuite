package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class SuperContestEffect_setId_13158440612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term59;

    public SuperContestEffect_setId_13158440612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35 = new Integer(1484323161);
        Integer term37 = new Integer(391863371);
        Object term41 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term43 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term44 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term41, term41.getClass(), "flavorText", "");
        setField(term43, term43.getClass(), "name", null);
        setField(term43, term43.getClass(), "url", null);
        setField(term41, term41.getClass(), "language", term43);
        setField(term44, term44.getClass(), "name", null);
        setField(term44, term44.getClass(), "url", null);
        setField(term41, term41.getClass(), "version", term44);
        Object term45 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term47 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term48 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term45, term45.getClass(), "flavorText", "");
        setField(term47, term47.getClass(), "name", null);
        setField(term47, term47.getClass(), "url", null);
        setField(term45, term45.getClass(), "language", term47);
        setField(term48, term48.getClass(), "name", null);
        setField(term48, term48.getClass(), "url", null);
        setField(term45, term45.getClass(), "version", term48);
        Object term49 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term51 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term52 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term49, term49.getClass(), "flavorText", "");
        setField(term51, term51.getClass(), "name", null);
        setField(term51, term51.getClass(), "url", null);
        setField(term49, term49.getClass(), "language", term51);
        setField(term52, term52.getClass(), "name", null);
        setField(term52, term52.getClass(), "url", null);
        setField(term49, term49.getClass(), "version", term52);
        ArrayList term39 = new ArrayList();
        ((ArrayList) term39).add(term41);
        ((ArrayList) term39).add(term45);
        ((ArrayList) term39).add(term49);
        ArrayList term55 = new ArrayList();
        term34 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term34, term34.getClass(), "id", term35);
        setField(term34, term34.getClass(), "appeal", term37);
        setField(term34, term34.getClass(), "flavorTextEntries", term39);
        setField(term34, term34.getClass(), "moves", term55);
        term59 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "setId", argTypes, term34, args);
    }

};


