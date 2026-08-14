package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_setEffectChance_14973040914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360;
     Object term439;

    public PastMoveStatValues_setEffectChance_14973040914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term361 = new Integer(-883034806);
        Integer term363 = new Integer(1585847225);
        Integer term365 = new Integer(597278769);
        Integer term367 = new Integer(-1685132342);
        Object term371 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term374 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term371, term371.getClass(), "effect", "");
        setField(term371, term371.getClass(), "shortEffect", "");
        setField(term374, term374.getClass(), "name", null);
        setField(term374, term374.getClass(), "url", null);
        setField(term371, term371.getClass(), "language", term374);
        Object term375 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term378 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term375, term375.getClass(), "effect", "");
        setField(term375, term375.getClass(), "shortEffect", "");
        setField(term378, term378.getClass(), "name", null);
        setField(term378, term378.getClass(), "url", null);
        setField(term375, term375.getClass(), "language", term378);
        Object term379 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term379, term379.getClass(), "effect", "");
        setField(term379, term379.getClass(), "shortEffect", "");
        setField(term382, term382.getClass(), "name", null);
        setField(term382, term382.getClass(), "url", null);
        setField(term379, term379.getClass(), "language", term382);
        Object term383 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term386 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term383, term383.getClass(), "effect", "");
        setField(term383, term383.getClass(), "shortEffect", "");
        setField(term386, term386.getClass(), "name", null);
        setField(term386, term386.getClass(), "url", null);
        setField(term383, term383.getClass(), "language", term386);
        ArrayList term369 = new ArrayList();
        ((ArrayList) term369).add(term371);
        ((ArrayList) term369).add(term375);
        ((ArrayList) term369).add(term379);
        ((ArrayList) term369).add(term383);
        term360 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term389 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term414 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term360, term360.getClass(), "accuracy", term361);
        setField(term360, term360.getClass(), "effectChance", term363);
        setField(term360, term360.getClass(), "power", term365);
        setField(term360, term360.getClass(), "pp", term367);
        setField(term360, term360.getClass(), "effectEntries", term369);
        setField(term389, term389.getClass(), "name", "oVgzLbrsFr");
        setField(term389, term389.getClass(), "url", "vQVyKLdtaz");
        setField(term360, term360.getClass(), "type", term389);
        setField(term414, term414.getClass(), "name", "OWKQODBLzb");
        setField(term414, term414.getClass(), "url", "wGmYcqUkgE");
        setField(term360, term360.getClass(), "versionGroup", term414);
        term439 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term439;
        callMethod(klass, "setEffectChance", argTypes, term360, args);
    }

};


