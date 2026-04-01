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

public class Message_getIcon_90592610133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30709;

    public Message_getIcon_90592610133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30709 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        setField(term30709, term30709.getClass(), "coordinate", null);
        setIntField(term30709, term30709.getClass(), "index", 0);
        setField(term30709, term30709.getClass(), "type", null);
        setField(term30709, term30709.getClass(), "message", null);
        setField(term30709, term30709.getClass(), "icon", null);
        setField(term30709, term30709.getClass(), "matchByString", null);
        setBooleanField(term30709, term30709.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term30709, args);
    }

};


