package io.github.moacirrf.netbeans.markdown.ui.scroll;

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
import static io.github.moacirrf.netbeans.markdown.ui.scroll.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ScrollUtils_isScrolledToMaximum_9717300801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2253;

    public ScrollUtils_isScrolledToMaximum_9717300801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2253 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JScrollPane");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isScrolledToMaximum", argTypes, term2253, args);
    }

};


