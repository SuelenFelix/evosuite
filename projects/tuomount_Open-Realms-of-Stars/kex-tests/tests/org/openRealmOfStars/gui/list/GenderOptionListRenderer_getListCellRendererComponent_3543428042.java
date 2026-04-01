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

public class GenderOptionListRenderer_getListCellRendererComponent_3543428042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77833;
     Object term77834;
     Object term77836;
     Object term77838;

    public GenderOptionListRenderer_getListCellRendererComponent_3543428042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77833 = newInstance(Class.forName("org.openRealmOfStars.gui.list.GenderOptionListRenderer"));
        setField(term77833, term77833.getClass(), "defaultRenderer", null);
        term77834 = new Integer(0);
        term77836 = new Boolean(false);
        term77838 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.GenderOptionListRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.game.state.options.GenderOption");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term77834;
        args[3] = term77836;
        args[4] = term77838;
        callMethod(klass, "getListCellRendererComponent", argTypes, term77833, args);
    }

};


