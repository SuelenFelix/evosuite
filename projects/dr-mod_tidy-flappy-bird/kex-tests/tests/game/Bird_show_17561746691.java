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

public class Bird_show_17561746691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8600;

    public Bird_show_17561746691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8600 = newInstance(Class.forName("game.Bird"));
        Object[] term8607 = (Object[]) newArray("java.awt.image.BufferedImage", 0);
        setIntField(term8600, term8600.getClass(), "x", -1641244494);
        setIntField(term8600, term8600.getClass(), "y", 1124282188);
        setIntField(term8600, term8600.getClass(), "birdHeight", -489441521);
        setIntField(term8600, term8600.getClass(), "birdWidth", 225873732);
        setDoubleField(term8600, term8600.getClass(), "velocity", 0.5279279537140873);
        setIntField(term8600, term8600.getClass(), "count", 529879356);
        setField(term8600, term8600.getClass(), "images", term8607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Bird");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "show", argTypes, term8600, args);
    }

};


