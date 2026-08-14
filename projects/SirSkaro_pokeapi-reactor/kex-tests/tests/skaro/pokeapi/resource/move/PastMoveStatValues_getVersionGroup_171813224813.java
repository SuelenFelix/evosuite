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

public class PastMoveStatValues_getVersionGroup_171813224813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;

    public PastMoveStatValues_getVersionGroup_171813224813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1478 = new Integer(-1786399638);
        Integer term1480 = new Integer(2055867847);
        Integer term1482 = new Integer(-1048298087);
        Integer term1484 = new Integer(292681826);
        Object term1488 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1491 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1488, term1488.getClass(), "effect", "");
        setField(term1488, term1488.getClass(), "shortEffect", "");
        setField(term1491, term1491.getClass(), "name", null);
        setField(term1491, term1491.getClass(), "url", null);
        setField(term1488, term1488.getClass(), "language", term1491);
        ArrayList term1486 = new ArrayList();
        ((ArrayList) term1486).add(term1488);
        term1477 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term1494 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1519 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1477, term1477.getClass(), "accuracy", term1478);
        setField(term1477, term1477.getClass(), "effectChance", term1480);
        setField(term1477, term1477.getClass(), "power", term1482);
        setField(term1477, term1477.getClass(), "pp", term1484);
        setField(term1477, term1477.getClass(), "effectEntries", term1486);
        setField(term1494, term1494.getClass(), "name", "iIRsCSYqXH");
        setField(term1494, term1494.getClass(), "url", "nghfqDXyCG");
        setField(term1477, term1477.getClass(), "type", term1494);
        setField(term1519, term1519.getClass(), "name", "WBAOTqErtm");
        setField(term1519, term1519.getClass(), "url", "PqtVXXZMqK");
        setField(term1477, term1477.getClass(), "versionGroup", term1519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term1477, args);
    }

};


