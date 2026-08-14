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

public class ScrollPreviewUtils_syncronizeScrolls_11331220120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482;

    public ScrollPreviewUtils_syncronizeScrolls_11331220120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term482 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollPreviewUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.scroll.ScrollPreviewUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.JEditorPane");
        argTypes[1] = Class.forName("javax.swing.JEditorPane");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "syncronizeScrolls", argTypes, term482, args);
    }

};


