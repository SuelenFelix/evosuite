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

public class Message_setImageInstructions_206870390232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30706;

    public Message_setImageInstructions_206870390232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30706 = newInstance(Class.forName("org.openRealmOfStars.player.message.Message"));
        setField(term30706, term30706.getClass(), "coordinate", null);
        setIntField(term30706, term30706.getClass(), "index", 0);
        setField(term30706, term30706.getClass(), "type", null);
        setField(term30706, term30706.getClass(), "message", null);
        setField(term30706, term30706.getClass(), "icon", null);
        setField(term30706, term30706.getClass(), "matchByString", null);
        setBooleanField(term30706, term30706.getClass(), "randomEventPopup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.Message");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImageInstructions", argTypes, term30706, args);
    }

};


