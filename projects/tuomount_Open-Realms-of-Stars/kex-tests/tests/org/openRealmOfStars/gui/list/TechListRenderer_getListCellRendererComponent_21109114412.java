package org.openRealmOfStars.gui.list;

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
import static org.openRealmOfStars.gui.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class TechListRenderer_getListCellRendererComponent_21109114412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7020;
     Object term7021;
     Object term7023;
     Object term7025;

    public TechListRenderer_getListCellRendererComponent_21109114412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7020 = newInstance(Class.forName("org.openRealmOfStars.gui.list.TechListRenderer"));
        setField(term7020, term7020.getClass(), "defaultRenderer", null);
        term7021 = new Integer(0);
        term7023 = new Boolean(false);
        term7025 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.TechListRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.Tech");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term7021;
        args[3] = term7023;
        args[4] = term7025;
        callMethod(klass, "getListCellRendererComponent", argTypes, term7020, args);
    }

};


