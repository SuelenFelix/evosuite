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

public class PipesController_checkCurrentPipe_4164191503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;

    public PipesController_checkCurrentPipe_4164191503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term164 = newInstance(Class.forName("game.Pipe"));
        setIntField(term164, term164.getClass(), "x", 683666002);
        setIntField(term164, term164.getClass(), "yOpeningStart", 1596213415);
        setIntField(term164, term164.getClass(), "yOpeningEnd", -268815336);
        setIntField(term164, term164.getClass(), "width", -1210583429);
        Object term169 = newInstance(Class.forName("game.Pipe"));
        setIntField(term169, term169.getClass(), "x", -663691365);
        setIntField(term169, term169.getClass(), "yOpeningStart", 339854490);
        setIntField(term169, term169.getClass(), "yOpeningEnd", -615654495);
        setIntField(term169, term169.getClass(), "width", -1476117762);
        Object term174 = newInstance(Class.forName("game.Pipe"));
        setIntField(term174, term174.getClass(), "x", -341962980);
        setIntField(term174, term174.getClass(), "yOpeningStart", 1532716628);
        setIntField(term174, term174.getClass(), "yOpeningEnd", -1801760683);
        setIntField(term174, term174.getClass(), "width", 1141317871);
        Object term179 = newInstance(Class.forName("game.Pipe"));
        setIntField(term179, term179.getClass(), "x", 890669485);
        setIntField(term179, term179.getClass(), "yOpeningStart", 691577392);
        setIntField(term179, term179.getClass(), "yOpeningEnd", -893623680);
        setIntField(term179, term179.getClass(), "width", -1963434938);
        ArrayList term162 = new ArrayList();
        ((ArrayList) term162).add(term164);
        ((ArrayList) term162).add(term169);
        ((ArrayList) term162).add(term174);
        ((ArrayList) term162).add(term179);
        term161 = newInstance(Class.forName("game.PipesController"));
        Object term186 = newInstance(Class.forName("game.Pipe"));
        Object term192 = newInstance(Class.forName("game.Pipe"));
        Object term197 = newInstance(Class.forName("java.util.Random"));
        Object term198 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term161, term161.getClass(), "pipes", term162);
        setIntField(term186, term186.getClass(), "x", 906181092);
        setIntField(term186, term186.getClass(), "yOpeningStart", 1045657203);
        setIntField(term186, term186.getClass(), "yOpeningEnd", 1386130016);
        setIntField(term186, term186.getClass(), "width", 1072005683);
        setField(term161, term161.getClass(), "currentPipe", term186);
        setIntField(term161, term161.getClass(), "xMarker", 1861318859);
        setIntField(term192, term192.getClass(), "x", 1474524152);
        setIntField(term192, term192.getClass(), "yOpeningStart", 568954359);
        setIntField(term192, term192.getClass(), "yOpeningEnd", 53410913);
        setIntField(term192, term192.getClass(), "width", -375014958);
        setField(term161, term161.getClass(), "lastPipe", term192);
        setLongField(term198, term198.getClass(), "value", 148956301934813L);
        setField(term197, term197.getClass(), "seed", term198);
        setDoubleField(term197, term197.getClass(), "nextNextGaussian", 0.544608645520025);
        setBooleanField(term197, term197.getClass(), "haveNextNextGaussian", false);
        setField(term161, term161.getClass(), "random", term197);
        setIntField(term161, term161.getClass(), "activeCount", 1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("game.PipesController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkCurrentPipe", argTypes, term161, args);
    }

};


