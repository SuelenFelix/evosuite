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
import java.lang.Boolean;

public class Message_setRandomEventPop_107254153743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30739;
     Object term30742;

    public Message_setRandomEventPop_107254153743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30739 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        setField(term30739, term30739.getClass(), "coordinate", null);
        setIntField(term30739, term30739.getClass(), "index", 0);
        setField(term30739, term30739.getClass(), "type", null);
        setField(term30739, term30739.getClass(), "message", null);
        setField(term30739, term30739.getClass(), "icon", null);
        setField(term30739, term30739.getClass(), "matchByString", null);
        setBooleanField(term30739, term30739.getClass(), "randomEventPopup", false);
        term30742 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30742;
        callMethod(klass, "setRandomEventPop", argTypes, term30739, args);
    }

};


