package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PostBO_PostBOBuilder_text_146543802515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24457;

    public PostBO_PostBOBuilder_text_146543802515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24457 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        setField(term24457, term24457.getClass(), "id", null);
        setField(term24457, term24457.getClass(), "userId", null);
        setField(term24457, term24457.getClass(), "type", null);
        setField(term24457, term24457.getClass(), "text", null);
        setField(term24457, term24457.getClass(), "imageIds", null);
        setField(term24457, term24457.getClass(), "videoId", null);
        setField(term24457, term24457.getClass(), "createdAt", null);
        setField(term24457, term24457.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "text", argTypes, term24457, args);
    }

};


