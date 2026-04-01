package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class AITurnView_findClosestCoordinate_13285231217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130948;
     Object term1130970;

    public AITurnView_findClosestCoordinate_13285231217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1130950 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130950, term1130950.getClass(), "x", -1246433147);
        setIntField(term1130950, term1130950.getClass(), "y", 909552529);
        Object term1130953 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130953, term1130953.getClass(), "x", -1579003706);
        setIntField(term1130953, term1130953.getClass(), "y", -653151392);
        Object term1130956 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130956, term1130956.getClass(), "x", 1167727921);
        setIntField(term1130956, term1130956.getClass(), "y", -31534263);
        Object term1130959 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130959, term1130959.getClass(), "x", 502237456);
        setIntField(term1130959, term1130959.getClass(), "y", 2022343758);
        Object term1130962 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130962, term1130962.getClass(), "x", -1858886583);
        setIntField(term1130962, term1130962.getClass(), "y", 1353603683);
        Object term1130965 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130965, term1130965.getClass(), "x", -1254573329);
        setIntField(term1130965, term1130965.getClass(), "y", -361071150);
        term1130948 = new ArrayList();
        ((ArrayList) term1130948).add(term1130950);
        ((ArrayList) term1130948).add(term1130953);
        ((ArrayList) term1130948).add(term1130956);
        ((ArrayList) term1130948).add(term1130959);
        ((ArrayList) term1130948).add(term1130962);
        ((ArrayList) term1130948).add(term1130965);
        term1130970 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1130970, term1130970.getClass(), "x", 1401980795);
        setIntField(term1130970, term1130970.getClass(), "y", -1569232309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[2];
        args[0] = term1130948;
        args[1] = term1130970;
        callMethod(klass, "findClosestCoordinate", argTypes, null, args);
    }

};


