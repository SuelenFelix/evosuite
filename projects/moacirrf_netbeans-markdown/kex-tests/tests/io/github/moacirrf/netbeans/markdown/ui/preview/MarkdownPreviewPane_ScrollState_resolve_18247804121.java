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

public class MarkdownPreviewPane_ScrollState_resolve_18247804121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5089;
     Object term5091;
     Object term5093;

    public MarkdownPreviewPane_ScrollState_resolve_18247804121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5089 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState"));
        setFloatField(term5089, term5089.getClass(), "ratio", 0.89057696F);
        term5091 = new Integer(1141317871);
        term5093 = new Integer(890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5091;
        args[1] = term5093;
        callMethod(klass, "resolve", argTypes, term5089, args);
    }

};


