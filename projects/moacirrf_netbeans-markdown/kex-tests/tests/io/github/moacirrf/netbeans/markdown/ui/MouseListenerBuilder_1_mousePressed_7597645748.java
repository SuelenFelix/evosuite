package io.github.moacirrf.netbeans.markdown.ui;

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
import static io.github.moacirrf.netbeans.markdown.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MouseListenerBuilder_1_mousePressed_7597645748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109640;

    public MouseListenerBuilder_1_mousePressed_7597645748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109640 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1"));
        setField(term109640, term109640.getClass(), "val$eventPerformed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mousePressed", argTypes, term109640, args);
    }

};


