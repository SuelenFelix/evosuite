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

public class MarkdownPreviewPane_ScrollState_resolve_18247804123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5099;
     Object term5101;
     Object term5103;

    public MarkdownPreviewPane_ScrollState_resolve_18247804123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5099 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState"));
        setFloatField(term5099, term5099.getClass(), "ratio", 0.0F);
        term5101 = new Integer(0);
        term5103 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5101;
        args[1] = term5103;
        callMethod(klass, "resolve", argTypes, term5099, args);
    }

};


