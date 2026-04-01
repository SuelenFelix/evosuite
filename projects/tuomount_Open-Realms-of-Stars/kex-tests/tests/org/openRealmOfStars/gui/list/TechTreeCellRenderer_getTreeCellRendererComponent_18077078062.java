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
import java.lang.Boolean;
import java.lang.Integer;

public class TechTreeCellRenderer_getTreeCellRendererComponent_18077078062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60122;
     Object term60123;
     Object term60125;
     Object term60127;
     Object term60129;
     Object term60131;

    public TechTreeCellRenderer_getTreeCellRendererComponent_18077078062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60122 = newInstance(Class.forName("org.openRealmOfStars.gui.list.TechTreeCellRenderer"));
        setField(term60122, term60122.getClass(), "defaultRenderer", null);
        term60123 = new Boolean(false);
        term60125 = new Boolean(false);
        term60127 = new Boolean(false);
        term60129 = new Integer(0);
        term60131 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.TechTreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("javax.swing.JTree");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term60123;
        args[3] = term60125;
        args[4] = term60127;
        args[5] = term60129;
        args[6] = term60131;
        callMethod(klass, "getTreeCellRendererComponent", argTypes, term60122, args);
    }

};


