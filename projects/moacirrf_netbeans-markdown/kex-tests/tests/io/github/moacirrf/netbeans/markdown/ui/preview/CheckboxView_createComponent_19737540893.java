package io.github.moacirrf.netbeans.markdown.ui.preview;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CheckboxView_createComponent_19737540893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5214;

    public CheckboxView_createComponent_19737540893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5214 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.CheckboxView"));
        setShortField(term5214, term5214.getClass(), "maxIsPreferred", (short) 0);
        setField(term5214, term5214.getClass(), "createdC", null);
        setField(term5214, term5214.getClass(), "c", null);
        setField(term5214, term5214.getClass(), "parent", null);
        setField(term5214, term5214.getClass(), "elem", null);
        setIntField(term5214, term5214.getClass(), "firstUpdateIndex", 0);
        setIntField(term5214, term5214.getClass(), "lastUpdateIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.CheckboxView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createComponent", argTypes, term5214, args);
    }

};


