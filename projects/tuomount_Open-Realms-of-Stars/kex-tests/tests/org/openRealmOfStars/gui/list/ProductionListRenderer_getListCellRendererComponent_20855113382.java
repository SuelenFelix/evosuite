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

public class ProductionListRenderer_getListCellRendererComponent_20855113382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61527;
     Object term61528;
     Object term61530;
     Object term61532;

    public ProductionListRenderer_getListCellRendererComponent_20855113382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61527 = newInstance(Class.forName("org.openRealmOfStars.gui.list.ProductionListRenderer"));
        setField(term61527, term61527.getClass(), "label", null);
        term61528 = new Integer(0);
        term61530 = new Boolean(false);
        term61532 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.ProductionListRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term61528;
        args[3] = term61530;
        args[4] = term61532;
        callMethod(klass, "getListCellRendererComponent", argTypes, term61527, args);
    }

};


