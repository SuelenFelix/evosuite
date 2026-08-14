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

public class ScrollableModel_ScrollableModelList_before_5785181621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528;

    public ScrollableModel_ScrollableModelList_before_5785181621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollableModel$ScrollableModelList"));
        setField(term528, term528.getClass(), "elementData", null);
        setIntField(term528, term528.getClass(), "size", 0);
        setIntField(term528, term528.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollableModel$ScrollableModelList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollableModel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "before", argTypes, term528, args);
    }

};


