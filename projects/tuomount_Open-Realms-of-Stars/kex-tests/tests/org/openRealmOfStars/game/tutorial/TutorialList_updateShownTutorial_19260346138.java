package org.openRealmOfStars.game.tutorial;

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
import static org.openRealmOfStars.game.tutorial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class TutorialList_updateShownTutorial_19260346138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term136;

    public TutorialList_updateShownTutorial_19260346138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term132 = new ArrayList();
        term131 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.TutorialList"));
        setField(term131, term131.getClass(), "list", term132);
        Integer term138 = new Integer(568599855);
        Integer term140 = new Integer(1162663216);
        Integer term142 = new Integer(1484323161);
        Integer term144 = new Integer(391863371);
        Integer term146 = new Integer(-1922583790);
        term136 = new ArrayList();
        ((ArrayList) term136).add(term138);
        ((ArrayList) term136).add(term140);
        ((ArrayList) term136).add(term142);
        ((ArrayList) term136).add(term144);
        ((ArrayList) term136).add(term146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.TutorialList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = term136;
        callMethod(klass, "updateShownTutorial", argTypes, term131, args);
    }

};


