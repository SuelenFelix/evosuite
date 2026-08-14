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

public class PastMoveStatValues_setType_81610686912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1329;
     Object term1392;

    public PastMoveStatValues_setType_81610686912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1330 = new Integer(579005622);
        Integer term1332 = new Integer(-14890619);
        Integer term1334 = new Integer(1632125673);
        Integer term1336 = new Integer(454281060);
        ArrayList term1338 = new ArrayList();
        term1329 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term1342 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1367 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1329, term1329.getClass(), "accuracy", term1330);
        setField(term1329, term1329.getClass(), "effectChance", term1332);
        setField(term1329, term1329.getClass(), "power", term1334);
        setField(term1329, term1329.getClass(), "pp", term1336);
        setField(term1329, term1329.getClass(), "effectEntries", term1338);
        setField(term1342, term1342.getClass(), "name", "gUvcueTURF");
        setField(term1342, term1342.getClass(), "url", "EwQBhZjCIT");
        setField(term1329, term1329.getClass(), "type", term1342);
        setField(term1367, term1367.getClass(), "name", "aSkmSwTnEw");
        setField(term1367, term1367.getClass(), "url", "xvkbvaEGYd");
        setField(term1329, term1329.getClass(), "versionGroup", term1367);
        term1392 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1392, term1392.getClass(), "name", "OcJCIDNIXA");
        setField(term1392, term1392.getClass(), "url", "XfRABIFVEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1392;
        callMethod(klass, "setType", argTypes, term1329, args);
    }

};


