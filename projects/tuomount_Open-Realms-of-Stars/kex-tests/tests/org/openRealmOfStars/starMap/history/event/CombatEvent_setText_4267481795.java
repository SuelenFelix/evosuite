package org.openRealmOfStars.starMap.history.event;

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
import static org.openRealmOfStars.starMap.history.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class CombatEvent_setText_4267481795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40806;

    public CombatEvent_setText_4267481795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40888 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term40887 = ((Class) term40888).getDeclaredField((String) "ASCENSION_PORTAL");
        ((Field) term40887).setAccessible(true);
        Object enum104 = ((Field) term40887).get((Object) null);
        term40806 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        Object term40807 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term40807, term40807.getClass(), "x", -1070592289);
        setIntField(term40807, term40807.getClass(), "y", -1464172784);
        setField(term40806, term40806.getClass(), "coordinate", term40807);
        setField(term40806, term40806.getClass(), "planetName", "OwPIiBRuKK");
        setField(term40806, term40806.getClass(), "text", "sgfGySMODT");
        setField(term40806, term40806.getClass(), "type", enum104);
        setByteField(term40806, term40806.getClass(), "playerIndex", (byte) 66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ndAITnOsny";
        callMethod(klass, "setText", argTypes, term40806, args);
    }

};


