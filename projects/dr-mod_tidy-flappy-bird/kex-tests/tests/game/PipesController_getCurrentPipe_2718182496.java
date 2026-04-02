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

public class PipesController_getCurrentPipe_2718182496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public PipesController_getCurrentPipe_2718182496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term285 = newInstance(Class.forName("game.Pipe"));
        setIntField(term285, term285.getClass(), "x", -2066804303);
        setIntField(term285, term285.getClass(), "yOpeningStart", -1731761810);
        setIntField(term285, term285.getClass(), "yOpeningEnd", 197109649);
        setIntField(term285, term285.getClass(), "width", -1239406390);
        Object term290 = newInstance(Class.forName("game.Pipe"));
        setIntField(term290, term290.getClass(), "x", 1557431527);
        setIntField(term290, term290.getClass(), "yOpeningStart", -1504890659);
        setIntField(term290, term290.getClass(), "yOpeningEnd", 1358829571);
        setIntField(term290, term290.getClass(), "width", 991356662);
        ArrayList term283 = new ArrayList();
        ((ArrayList) term283).add(term285);
        ((ArrayList) term283).add(term290);
        term282 = newInstance(Class.forName("game.PipesController"));
        Object term297 = newInstance(Class.forName("game.Pipe"));
        Object term303 = newInstance(Class.forName("game.Pipe"));
        Object term308 = newInstance(Class.forName("java.util.Random"));
        Object term309 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term282, term282.getClass(), "pipes", term283);
        setIntField(term297, term297.getClass(), "x", -506958186);
        setIntField(term297, term297.getClass(), "yOpeningStart", -507387516);
        setIntField(term297, term297.getClass(), "yOpeningEnd", -1970452551);
        setIntField(term297, term297.getClass(), "width", -1896376975);
        setField(term282, term282.getClass(), "currentPipe", term297);
        setIntField(term282, term282.getClass(), "xMarker", 729658803);
        setIntField(term303, term303.getClass(), "x", 114754804);
        setIntField(term303, term303.getClass(), "yOpeningStart", 1687361082);
        setIntField(term303, term303.getClass(), "yOpeningEnd", 584893196);
        setIntField(term303, term303.getClass(), "width", 497269071);
        setField(term282, term282.getClass(), "lastPipe", term303);
        setLongField(term309, term309.getClass(), "value", 95958464912423L);
        setField(term308, term308.getClass(), "seed", term309);
        setDoubleField(term308, term308.getClass(), "nextNextGaussian", 0.2641345529914265);
        setBooleanField(term308, term308.getClass(), "haveNextNextGaussian", true);
        setField(term282, term282.getClass(), "random", term308);
        setIntField(term282, term282.getClass(), "activeCount", -1899301124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentPipe", argTypes, term282, args);
    }

};


