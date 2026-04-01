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

public class ShipComponentListRenderer_getListCellRendererComponent_4289178252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47526;
     Object term47527;
     Object term47529;
     Object term47531;

    public ShipComponentListRenderer_getListCellRendererComponent_4289178252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47526 = newInstance(Class.forName("org.openRealmOfStars.gui.list.ShipComponentListRenderer"));
        setField(term47526, term47526.getClass(), "defaultRenderer", null);
        term47527 = new Integer(0);
        term47529 = new Boolean(false);
        term47531 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.ShipComponentListRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term47527;
        args[3] = term47529;
        args[4] = term47531;
        callMethod(klass, "getListCellRendererComponent", argTypes, term47526, args);
    }

};


