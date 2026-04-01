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
import java.lang.Boolean;

public class HelpView_init_11266125830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608979;
     Object term608984;

    public HelpView_init_11266125830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term608980 = new ArrayList();
        term608979 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.TutorialList"));
        setField(term608979, term608979.getClass(), "list", term608980);
        term608984 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.tutorial.TutorialList");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[3];
        args[0] = term608979;
        args[1] = term608984;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


