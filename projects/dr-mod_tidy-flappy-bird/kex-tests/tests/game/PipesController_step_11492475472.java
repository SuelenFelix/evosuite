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

public class PipesController_step_11492475472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;

    public PipesController_step_11492475472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term127 = newInstance(Class.forName("game.Pipe"));
        setIntField(term127, term127.getClass(), "x", 972867650);
        setIntField(term127, term127.getClass(), "yOpeningStart", 1655935355);
        setIntField(term127, term127.getClass(), "yOpeningEnd", -481533957);
        setIntField(term127, term127.getClass(), "width", 1240914516);
        Object term132 = newInstance(Class.forName("game.Pipe"));
        setIntField(term132, term132.getClass(), "x", -1465035361);
        setIntField(term132, term132.getClass(), "yOpeningStart", 1090617576);
        setIntField(term132, term132.getClass(), "yOpeningEnd", -1547384488);
        setIntField(term132, term132.getClass(), "width", 1442160736);
        Object term137 = newInstance(Class.forName("game.Pipe"));
        setIntField(term137, term137.getClass(), "x", 1114000454);
        setIntField(term137, term137.getClass(), "yOpeningStart", -556405712);
        setIntField(term137, term137.getClass(), "yOpeningEnd", -1772434990);
        setIntField(term137, term137.getClass(), "width", -1845499264);
        ArrayList term125 = new ArrayList();
        ((ArrayList) term125).add(term127);
        ((ArrayList) term125).add(term132);
        ((ArrayList) term125).add(term137);
        term124 = newInstance(Class.forName("game.PipesController"));
        Object term144 = newInstance(Class.forName("game.Pipe"));
        Object term150 = newInstance(Class.forName("game.Pipe"));
        Object term155 = newInstance(Class.forName("java.util.Random"));
        Object term156 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term124, term124.getClass(), "pipes", term125);
        setIntField(term144, term144.getClass(), "x", -505439934);
        setIntField(term144, term144.getClass(), "yOpeningStart", -344842608);
        setIntField(term144, term144.getClass(), "yOpeningEnd", 941650513);
        setIntField(term144, term144.getClass(), "width", 444029505);
        setField(term124, term124.getClass(), "currentPipe", term144);
        setIntField(term124, term124.getClass(), "xMarker", -1034506028);
        setIntField(term150, term150.getClass(), "x", -1263114719);
        setIntField(term150, term150.getClass(), "yOpeningStart", -894662986);
        setIntField(term150, term150.getClass(), "yOpeningEnd", 304775596);
        setIntField(term150, term150.getClass(), "width", -1347665717);
        setField(term124, term124.getClass(), "lastPipe", term150);
        setLongField(term156, term156.getClass(), "value", 138084886359162L);
        setField(term155, term155.getClass(), "seed", term156);
        setDoubleField(term155, term155.getClass(), "nextNextGaussian", 0.5523635872663106);
        setBooleanField(term155, term155.getClass(), "haveNextNextGaussian", false);
        setField(term124, term124.getClass(), "random", term155);
        setIntField(term124, term124.getClass(), "activeCount", -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term124, args);
    }

};


