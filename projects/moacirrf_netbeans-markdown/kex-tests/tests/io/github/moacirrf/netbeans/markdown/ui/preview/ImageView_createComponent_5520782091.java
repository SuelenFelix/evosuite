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

public class ImageView_createComponent_5520782091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937;

    public ImageView_createComponent_5520782091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term937 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.ImageView"));
        setField(term937, term937.getClass(), "editorPane", null);
        setField(term937, term937.getClass(), "createdC", null);
        setField(term937, term937.getClass(), "c", null);
        setField(term937, term937.getClass(), "parent", null);
        setField(term937, term937.getClass(), "elem", null);
        setIntField(term937, term937.getClass(), "firstUpdateIndex", 0);
        setIntField(term937, term937.getClass(), "lastUpdateIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.ImageView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createComponent", argTypes, term937, args);
    }

};


