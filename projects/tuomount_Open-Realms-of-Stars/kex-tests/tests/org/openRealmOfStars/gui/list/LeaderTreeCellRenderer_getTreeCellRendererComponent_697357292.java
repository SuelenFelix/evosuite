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

public class LeaderTreeCellRenderer_getTreeCellRendererComponent_697357292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54852;
     Object term54853;
     Object term54855;
     Object term54857;
     Object term54859;
     Object term54861;

    public LeaderTreeCellRenderer_getTreeCellRendererComponent_697357292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54852 = newInstance(Class.forName("org.openRealmOfStars.gui.list.LeaderTreeCellRenderer"));
        setField(term54852, term54852.getClass(), "defaultRenderer", null);
        term54853 = new Boolean(false);
        term54855 = new Boolean(false);
        term54857 = new Boolean(false);
        term54859 = new Integer(0);
        term54861 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.LeaderTreeCellRenderer");
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
        args[2] = term54853;
        args[3] = term54855;
        args[4] = term54857;
        args[5] = term54859;
        args[6] = term54861;
        callMethod(klass, "getTreeCellRendererComponent", argTypes, term54852, args);
    }

};


