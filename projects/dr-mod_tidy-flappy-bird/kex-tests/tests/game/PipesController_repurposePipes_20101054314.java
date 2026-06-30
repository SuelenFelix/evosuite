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

public class PipesController_repurposePipes_20101054314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;

    public PipesController_repurposePipes_20101054314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term206 = newInstance(Class.forName("game.Pipe"));
        setIntField(term206, term206.getClass(), "x", 480137250);
        setIntField(term206, term206.getClass(), "yOpeningStart", -341152642);
        setIntField(term206, term206.getClass(), "yOpeningEnd", -2015854073);
        setIntField(term206, term206.getClass(), "width", 538259104);
        ArrayList term204 = new ArrayList();
        ((ArrayList) term204).add(term206);
        term203 = newInstance(Class.forName("game.PipesController"));
        Object term213 = newInstance(Class.forName("game.Pipe"));
        Object term219 = newInstance(Class.forName("game.Pipe"));
        Object term224 = newInstance(Class.forName("java.util.Random"));
        Object term225 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term203, term203.getClass(), "pipes", term204);
        setIntField(term213, term213.getClass(), "x", 96566506);
        setIntField(term213, term213.getClass(), "yOpeningStart", -343325701);
        setIntField(term213, term213.getClass(), "yOpeningEnd", 107945604);
        setIntField(term213, term213.getClass(), "width", -1963464809);
        setField(term203, term203.getClass(), "currentPipe", term213);
        setIntField(term203, term203.getClass(), "xMarker", 71190297);
        setIntField(term219, term219.getClass(), "x", 1202361360);
        setIntField(term219, term219.getClass(), "yOpeningStart", -2015048153);
        setIntField(term219, term219.getClass(), "yOpeningEnd", -2063457669);
        setIntField(term219, term219.getClass(), "width", -1222006000);
        setField(term203, term203.getClass(), "lastPipe", term219);
        setLongField(term225, term225.getClass(), "value", 258994784665478L);
        setField(term224, term224.getClass(), "seed", term225);
        setDoubleField(term224, term224.getClass(), "nextNextGaussian", 0.28570734989730284);
        setBooleanField(term224, term224.getClass(), "haveNextNextGaussian", false);
        setField(term203, term203.getClass(), "random", term224);
        setIntField(term203, term203.getClass(), "activeCount", 2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "repurposePipes", argTypes, term203, args);
    }

};


