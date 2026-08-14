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

public class MarkdownEditorKit_getViewFactory_11579730572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8192;

    public MarkdownEditorKit_getViewFactory_11579730572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8192 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownEditorKit"));
        setField(term8192, term8192.getClass(), "styleSheet", null);
        setField(term8192, term8192.getClass(), "viewFactory", null);
        setField(term8192, term8192.getClass(), "theEditor", null);
        setField(term8192, term8192.getClass(), "accessibleContext", null);
        setField(term8192, term8192.getClass(), "input", null);
        setField(term8192, term8192.getClass(), "linkHandler", null);
        setField(term8192, term8192.getClass(), "defaultCursor", null);
        setField(term8192, term8192.getClass(), "linkCursor", null);
        setBooleanField(term8192, term8192.getClass(), "isAutoFormSubmission", false);
        setBooleanField(term8192, term8192.getClass(), "foundLink", false);
        setIntField(term8192, term8192.getClass(), "prevHypertextOffset", 0);
        setField(term8192, term8192.getClass(), "linkNavigationTag", null);
        setField(term8192, term8192.getClass(), "currentRun", null);
        setField(term8192, term8192.getClass(), "currentParagraph", null);
        setField(term8192, term8192.getClass(), "inputAttributes", null);
        setField(term8192, term8192.getClass(), "inputAttributeUpdater", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownEditorKit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getViewFactory", argTypes, term8192, args);
    }

};


