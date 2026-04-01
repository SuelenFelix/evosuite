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

public class PlayerColorListRenderer_getListCellRendererComponent_3625915402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8913;
     Object term8914;
     Object term8916;
     Object term8918;

    public PlayerColorListRenderer_getListCellRendererComponent_3625915402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8913 = newInstance(Class.forName("org.openRealmOfStars.gui.list.PlayerColorListRenderer"));
        setField(term8913, term8913.getClass(), "defaultRenderer", null);
        term8914 = new Integer(0);
        term8916 = new Boolean(false);
        term8918 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.PlayerColorListRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerColor");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term8914;
        args[3] = term8916;
        args[4] = term8918;
        callMethod(klass, "getListCellRendererComponent", argTypes, term8913, args);
    }

};


