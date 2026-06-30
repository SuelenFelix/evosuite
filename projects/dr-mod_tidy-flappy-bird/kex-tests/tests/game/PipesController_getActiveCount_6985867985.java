package game;

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
import static game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PipesController_getActiveCount_6985867985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;

    public PipesController_getActiveCount_6985867985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term233 = newInstance(Class.forName("game.Pipe"));
        setIntField(term233, term233.getClass(), "x", -1565502840);
        setIntField(term233, term233.getClass(), "yOpeningStart", 344323424);
        setIntField(term233, term233.getClass(), "yOpeningEnd", 9726679);
        setIntField(term233, term233.getClass(), "width", -25637976);
        Object term238 = newInstance(Class.forName("game.Pipe"));
        setIntField(term238, term238.getClass(), "x", 1555897383);
        setIntField(term238, term238.getClass(), "yOpeningStart", 202001407);
        setIntField(term238, term238.getClass(), "yOpeningEnd", 158873461);
        setIntField(term238, term238.getClass(), "width", -430151637);
        Object term243 = newInstance(Class.forName("game.Pipe"));
        setIntField(term243, term243.getClass(), "x", -1697741339);
        setIntField(term243, term243.getClass(), "yOpeningStart", 98922530);
        setIntField(term243, term243.getClass(), "yOpeningEnd", -1388471422);
        setIntField(term243, term243.getClass(), "width", -1498296052);
        Object term248 = newInstance(Class.forName("game.Pipe"));
        setIntField(term248, term248.getClass(), "x", 2098647989);
        setIntField(term248, term248.getClass(), "yOpeningStart", 1598895173);
        setIntField(term248, term248.getClass(), "yOpeningEnd", 1830648570);
        setIntField(term248, term248.getClass(), "width", -227365013);
        Object term253 = newInstance(Class.forName("game.Pipe"));
        setIntField(term253, term253.getClass(), "x", 11724947);
        setIntField(term253, term253.getClass(), "yOpeningStart", 1953277050);
        setIntField(term253, term253.getClass(), "yOpeningEnd", 1283079251);
        setIntField(term253, term253.getClass(), "width", -523949691);
        Object term258 = newInstance(Class.forName("game.Pipe"));
        setIntField(term258, term258.getClass(), "x", 1398204340);
        setIntField(term258, term258.getClass(), "yOpeningStart", 229204365);
        setIntField(term258, term258.getClass(), "yOpeningEnd", -461771056);
        setIntField(term258, term258.getClass(), "width", -243422082);
        ArrayList term231 = new ArrayList();
        ((ArrayList) term231).add(term233);
        ((ArrayList) term231).add(term238);
        ((ArrayList) term231).add(term243);
        ((ArrayList) term231).add(term248);
        ((ArrayList) term231).add(term253);
        ((ArrayList) term231).add(term258);
        term230 = newInstance(Class.forName("game.PipesController"));
        Object term265 = newInstance(Class.forName("game.Pipe"));
        Object term271 = newInstance(Class.forName("game.Pipe"));
        Object term276 = newInstance(Class.forName("java.util.Random"));
        Object term277 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term230, term230.getClass(), "pipes", term231);
        setIntField(term265, term265.getClass(), "x", 1384592638);
        setIntField(term265, term265.getClass(), "yOpeningStart", -1002370457);
        setIntField(term265, term265.getClass(), "yOpeningEnd", -2014576105);
        setIntField(term265, term265.getClass(), "width", 1296895584);
        setField(term230, term230.getClass(), "currentPipe", term265);
        setIntField(term230, term230.getClass(), "xMarker", 628918458);
        setIntField(term271, term271.getClass(), "x", -1274456137);
        setIntField(term271, term271.getClass(), "yOpeningStart", 1041916673);
        setIntField(term271, term271.getClass(), "yOpeningEnd", -601863069);
        setIntField(term271, term271.getClass(), "width", 663292551);
        setField(term230, term230.getClass(), "lastPipe", term271);
        setLongField(term277, term277.getClass(), "value", 206346310939732L);
        setField(term276, term276.getClass(), "seed", term277);
        setDoubleField(term276, term276.getClass(), "nextNextGaussian", 0.40176586625454525);
        setBooleanField(term276, term276.getClass(), "haveNextNextGaussian", true);
        setField(term230, term230.getClass(), "random", term276);
        setIntField(term230, term230.getClass(), "activeCount", -1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActiveCount", argTypes, term230, args);
    }

};


