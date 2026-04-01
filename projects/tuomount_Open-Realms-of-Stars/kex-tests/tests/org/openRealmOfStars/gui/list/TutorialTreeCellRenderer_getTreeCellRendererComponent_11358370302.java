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

public class TutorialTreeCellRenderer_getTreeCellRendererComponent_11358370302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94097;
     Object term94098;
     Object term94100;
     Object term94102;
     Object term94104;
     Object term94106;

    public TutorialTreeCellRenderer_getTreeCellRendererComponent_11358370302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94097 = newInstance(Class.forName("org.openRealmOfStars.gui.list.TutorialTreeCellRenderer"));
        setField(term94097, term94097.getClass(), "defaultRenderer", null);
        term94098 = new Boolean(false);
        term94100 = new Boolean(false);
        term94102 = new Boolean(false);
        term94104 = new Integer(0);
        term94106 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.TutorialTreeCellRenderer");
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
        args[2] = term94098;
        args[3] = term94100;
        args[4] = term94102;
        args[5] = term94104;
        args[6] = term94106;
        callMethod(klass, "getTreeCellRendererComponent", argTypes, term94097, args);
    }

};


