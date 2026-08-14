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

public class PostStatBO_PostStatBOBuilder_toString_54109262415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21342;

    public PostStatBO_PostStatBOBuilder_toString_54109262415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21342 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        setField(term21342, term21342.getClass(), "id", null);
        setField(term21342, term21342.getClass(), "postId", null);
        setBooleanField(term21342, term21342.getClass(), "likeCount$set", false);
        setField(term21342, term21342.getClass(), "likeCount$value", null);
        setField(term21342, term21342.getClass(), "createdAt", null);
        setField(term21342, term21342.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21342, args);
    }

};


