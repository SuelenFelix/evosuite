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

public class ExportPane_3_doInBackground_1752766694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49010;

    public ExportPane_3_doInBackground_1752766694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49010 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3"));
        setField(term49010, term49010.getClass(), "val$e", null);
        setField(term49010, term49010.getClass(), "this$0", null);
        setIntField(term49010, term49010.getClass(), "progress", 0);
        setField(term49010, term49010.getClass(), "state", null);
        setField(term49010, term49010.getClass(), "future", null);
        setField(term49010, term49010.getClass(), "propertyChangeSupport", null);
        setField(term49010, term49010.getClass(), "doProcess", null);
        setField(term49010, term49010.getClass(), "doNotifyProgressChange", null);
        setField(term49010, term49010.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doInBackground", argTypes, term49010, args);
    }

};


