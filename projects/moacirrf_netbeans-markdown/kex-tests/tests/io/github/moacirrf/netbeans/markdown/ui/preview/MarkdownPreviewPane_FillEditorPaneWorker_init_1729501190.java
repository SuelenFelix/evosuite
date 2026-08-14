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

public class MarkdownPreviewPane_FillEditorPaneWorker_init_1729501190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4894;
     Object term4896;

    public MarkdownPreviewPane_FillEditorPaneWorker_init_1729501190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4894 = new Integer(-1347665717);
        term4896 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState"));
        setFloatField(term4896, term4896.getClass(), "ratio", 0.27797186F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$ScrollState");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "XkIoWJRNwN";
        args[2] = term4894;
        args[3] = term4896;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


