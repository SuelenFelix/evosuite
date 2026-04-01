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

public class BridgeDeviceRenderer_getListCellRendererComponent_15193551732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53052;
     Object term53053;
     Object term53055;
     Object term53057;

    public BridgeDeviceRenderer_getListCellRendererComponent_15193551732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53052 = newInstance(Class.forName("org.openRealmOfStars.gui.list.BridgeDeviceRenderer"));
        setField(term53052, term53052.getClass(), "defaultRenderer", null);
        term53053 = new Integer(0);
        term53055 = new Boolean(false);
        term53057 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.BridgeDeviceRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.ambient.BridgeDevice");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term53053;
        args[3] = term53055;
        args[4] = term53057;
        callMethod(klass, "getListCellRendererComponent", argTypes, term53052, args);
    }

};


