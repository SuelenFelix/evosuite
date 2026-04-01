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

public class Message_getMessage_3895922729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30697;

    public Message_getMessage_3895922729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30697 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        setField(term30697, term30697.getClass(), "coordinate", null);
        setIntField(term30697, term30697.getClass(), "index", 0);
        setField(term30697, term30697.getClass(), "type", null);
        setField(term30697, term30697.getClass(), "message", null);
        setField(term30697, term30697.getClass(), "icon", null);
        setField(term30697, term30697.getClass(), "matchByString", null);
        setBooleanField(term30697, term30697.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term30697, args);
    }

};


