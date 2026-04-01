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

public class VotingListRenderer_getListCellRendererComponent_7464111893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16179;
     Object term16180;
     Object term16182;
     Object term16184;

    public VotingListRenderer_getListCellRendererComponent_7464111893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16179 = newInstance(Class.forName("org.openRealmOfStars.gui.list.VotingListRenderer"));
        setField(term16179, term16179.getClass(), "defaultRenderer", null);
        setField(term16179, term16179.getClass(), "map", null);
        term16180 = new Integer(0);
        term16182 = new Boolean(false);
        term16184 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.VotingListRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JList");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term16180;
        args[3] = term16182;
        args[4] = term16184;
        callMethod(klass, "getListCellRendererComponent", argTypes, term16179, args);
    }

};


