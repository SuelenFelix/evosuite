package io.codeworth.panelmatic.util.customizers;

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
import static io.codeworth.panelmatic.util.customizers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AutoScrollPaneCustomizer_customize_20034234581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;

    public AutoScrollPaneCustomizer_customize_20034234581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.AutoScrollPaneCustomizer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.AutoScrollPaneCustomizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = null;
        callMethod(klass, "customize", argTypes, term260, args);
    }

};


