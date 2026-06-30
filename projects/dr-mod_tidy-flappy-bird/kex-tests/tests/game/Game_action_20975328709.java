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

public class Game_action_20975328709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1360;

    public Game_action_20975328709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1360 = newInstance(Class.forName("game.Game"));
        setField(term1360, term1360.getClass(), "bird", null);
        setField(term1360, term1360.getClass(), "neuralNetwork", null);
        setField(term1360, term1360.getClass(), "bottomPanel", null);
        setField(term1360, term1360.getClass(), "pipesController", null);
        setField(term1360, term1360.getClass(), "collisionDetector", null);
        setBooleanField(term1360, term1360.getClass(), "collision", false);
        setField(term1360, term1360.getClass(), "font", null);
        setLongField(term1360, term1360.getClass(), "allSteps", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "action", argTypes, term1360, args);
    }

};


