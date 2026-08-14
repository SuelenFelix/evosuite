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
import java.lang.Integer;

public class ImageView_getAlignment_21108599582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;
     Object term1316;

    public ImageView_getAlignment_21108599582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1313 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.ImageView"));
        setField(term1313, term1313.getClass(), "editorPane", null);
        setField(term1313, term1313.getClass(), "createdC", null);
        setField(term1313, term1313.getClass(), "c", null);
        setField(term1313, term1313.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "elem", null);
        setIntField(term1313, term1313.getClass(), "firstUpdateIndex", 0);
        setIntField(term1313, term1313.getClass(), "lastUpdateIndex", 0);
        term1316 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.ImageView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1316;
        callMethod(klass, "getAlignment", argTypes, term1313, args);
    }

};


