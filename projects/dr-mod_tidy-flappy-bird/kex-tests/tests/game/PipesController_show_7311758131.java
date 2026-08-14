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

public class PipesController_show_7311758131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public PipesController_show_7311758131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85 = newInstance(Class.forName("game.Pipe"));
        setIntField(term85, term85.getClass(), "x", -1048298087);
        setIntField(term85, term85.getClass(), "yOpeningStart", 292681826);
        setIntField(term85, term85.getClass(), "yOpeningEnd", 458147407);
        setIntField(term85, term85.getClass(), "width", -184153539);
        Object term90 = newInstance(Class.forName("game.Pipe"));
        setIntField(term90, term90.getClass(), "x", 493620644);
        setIntField(term90, term90.getClass(), "yOpeningStart", 1328271830);
        setIntField(term90, term90.getClass(), "yOpeningEnd", 1596070772);
        setIntField(term90, term90.getClass(), "width", 97029295);
        Object term95 = newInstance(Class.forName("game.Pipe"));
        setIntField(term95, term95.getClass(), "x", -1371869594);
        setIntField(term95, term95.getClass(), "yOpeningStart", -2095575670);
        setIntField(term95, term95.getClass(), "yOpeningEnd", 1225272962);
        setIntField(term95, term95.getClass(), "width", 1324040357);
        Object term100 = newInstance(Class.forName("game.Pipe"));
        setIntField(term100, term100.getClass(), "x", -1588772968);
        setIntField(term100, term100.getClass(), "yOpeningStart", -93135961);
        setIntField(term100, term100.getClass(), "yOpeningEnd", -112921587);
        setIntField(term100, term100.getClass(), "width", 933028652);
        ArrayList term83 = new ArrayList();
        ((ArrayList) term83).add(term85);
        ((ArrayList) term83).add(term90);
        ((ArrayList) term83).add(term95);
        ((ArrayList) term83).add(term100);
        term82 = newInstance(Class.forName("game.PipesController"));
        Object term107 = newInstance(Class.forName("game.Pipe"));
        Object term113 = newInstance(Class.forName("game.Pipe"));
        Object term118 = newInstance(Class.forName("java.util.Random"));
        Object term119 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term82, term82.getClass(), "pipes", term83);
        setIntField(term107, term107.getClass(), "x", 287287233);
        setIntField(term107, term107.getClass(), "yOpeningStart", 962840079);
        setIntField(term107, term107.getClass(), "yOpeningEnd", 1540719661);
        setIntField(term107, term107.getClass(), "width", 1265463001);
        setField(term82, term82.getClass(), "currentPipe", term107);
        setIntField(term82, term82.getClass(), "xMarker", 335112684);
        setIntField(term113, term113.getClass(), "x", 1551099402);
        setIntField(term113, term113.getClass(), "yOpeningStart", -2027534003);
        setIntField(term113, term113.getClass(), "yOpeningEnd", 1063420942);
        setIntField(term113, term113.getClass(), "width", 1375330971);
        setField(term82, term82.getClass(), "lastPipe", term113);
        setLongField(term119, term119.getClass(), "value", 268904849823883L);
        setField(term118, term118.getClass(), "seed", term119);
        setDoubleField(term118, term118.getClass(), "nextNextGaussian", 0.3455959125047594);
        setBooleanField(term118, term118.getClass(), "haveNextNextGaussian", false);
        setField(term82, term82.getClass(), "random", term118);
        setIntField(term82, term82.getClass(), "activeCount", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term82, args);
    }

};


