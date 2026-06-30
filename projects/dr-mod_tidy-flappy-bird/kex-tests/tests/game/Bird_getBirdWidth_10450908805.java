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
import java.lang.Object;

public class Bird_getBirdWidth_10450908805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8770;

    public Bird_getBirdWidth_10450908805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8770 = newInstance(Class.forName("game.Bird"));
        Object[] term8777 = (Object[]) newArray("java.awt.image.BufferedImage", 0);
        setIntField(term8770, term8770.getClass(), "x", 1425342686);
        setIntField(term8770, term8770.getClass(), "y", -1042470635);
        setIntField(term8770, term8770.getClass(), "birdHeight", -524352937);
        setIntField(term8770, term8770.getClass(), "birdWidth", 1472218987);
        setDoubleField(term8770, term8770.getClass(), "velocity", 0.6588948704887806);
        setIntField(term8770, term8770.getClass(), "count", 805176809);
        setField(term8770, term8770.getClass(), "images", term8777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirdWidth", argTypes, term8770, args);
    }

};


