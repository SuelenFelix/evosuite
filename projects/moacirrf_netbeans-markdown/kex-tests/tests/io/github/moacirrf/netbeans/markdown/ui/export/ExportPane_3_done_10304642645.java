package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExportPane_3_done_10304642645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49012;

    public ExportPane_3_done_10304642645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49012 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3"));
        setField(term49012, term49012.getClass(), "val$e", null);
        setField(term49012, term49012.getClass(), "this$0", null);
        setIntField(term49012, term49012.getClass(), "progress", 0);
        setField(term49012, term49012.getClass(), "state", null);
        setField(term49012, term49012.getClass(), "future", null);
        setField(term49012, term49012.getClass(), "propertyChangeSupport", null);
        setField(term49012, term49012.getClass(), "doProcess", null);
        setField(term49012, term49012.getClass(), "doNotifyProgressChange", null);
        setField(term49012, term49012.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "done", argTypes, term49012, args);
    }

};


