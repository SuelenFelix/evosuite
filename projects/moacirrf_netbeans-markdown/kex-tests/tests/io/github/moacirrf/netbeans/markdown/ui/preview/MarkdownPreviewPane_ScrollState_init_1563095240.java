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

public class MarkdownPreviewPane_ScrollState_init_1563095240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5082;
     Object term5085;
     Object term5087;

    public MarkdownPreviewPane_ScrollState_init_1563095240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5082 = newInstance(Class.forName("java.awt.Point"));
        setIntField(term5082, term5082.getClass(), "x", -1476117762);
        setIntField(term5082, term5082.getClass(), "y", -341962980);
        term5085 = new Integer(1532716628);
        term5087 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Point");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5082;
        args[1] = term5085;
        args[2] = term5087;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


