package org.openRealmOfStars.player.message;

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
import static org.openRealmOfStars.player.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Message_setIndex_17557002726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30686;
     Object term30689;

    public Message_setIndex_17557002726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30686 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        setField(term30686, term30686.getClass(), "coordinate", null);
        setIntField(term30686, term30686.getClass(), "index", 0);
        setField(term30686, term30686.getClass(), "type", null);
        setField(term30686, term30686.getClass(), "message", null);
        setField(term30686, term30686.getClass(), "icon", null);
        setField(term30686, term30686.getClass(), "matchByString", null);
        setBooleanField(term30686, term30686.getClass(), "randomEventPopup", false);
        term30689 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30689;
        callMethod(klass, "setIndex", argTypes, term30686, args);
    }

};


