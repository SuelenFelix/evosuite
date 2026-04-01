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

public class Message_getX_205053329536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30718;

    public Message_getX_205053329536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30718 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        setField(term30718, term30718.getClass(), "coordinate", null);
        setIntField(term30718, term30718.getClass(), "index", 0);
        setField(term30718, term30718.getClass(), "type", null);
        setField(term30718, term30718.getClass(), "message", null);
        setField(term30718, term30718.getClass(), "icon", null);
        setField(term30718, term30718.getClass(), "matchByString", null);
        setBooleanField(term30718, term30718.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term30718, args);
    }

};


