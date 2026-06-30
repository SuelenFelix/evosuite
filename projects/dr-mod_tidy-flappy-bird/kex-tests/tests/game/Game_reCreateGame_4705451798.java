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

public class Game_reCreateGame_4705451798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1357;

    public Game_reCreateGame_4705451798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1357 = newInstance(Class.forName("game.Game"));
        setField(term1357, term1357.getClass(), "bird", null);
        setField(term1357, term1357.getClass(), "neuralNetwork", null);
        setField(term1357, term1357.getClass(), "bottomPanel", null);
        setField(term1357, term1357.getClass(), "pipesController", null);
        setField(term1357, term1357.getClass(), "collisionDetector", null);
        setBooleanField(term1357, term1357.getClass(), "collision", false);
        setField(term1357, term1357.getClass(), "font", null);
        setLongField(term1357, term1357.getClass(), "allSteps", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reCreateGame", argTypes, term1357, args);
    }

};


