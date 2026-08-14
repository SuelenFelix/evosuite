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

public class MarkdownEditorKit_getStyleSheet_15752344611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7682;

    public MarkdownEditorKit_getStyleSheet_15752344611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7682 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownEditorKit"));
        setField(term7682, term7682.getClass(), "styleSheet", null);
        setField(term7682, term7682.getClass(), "viewFactory", null);
        setField(term7682, term7682.getClass(), "theEditor", null);
        setField(term7682, term7682.getClass(), "accessibleContext", null);
        setField(term7682, term7682.getClass(), "input", null);
        setField(term7682, term7682.getClass(), "linkHandler", null);
        setField(term7682, term7682.getClass(), "defaultCursor", null);
        setField(term7682, term7682.getClass(), "linkCursor", null);
        setBooleanField(term7682, term7682.getClass(), "isAutoFormSubmission", false);
        setBooleanField(term7682, term7682.getClass(), "foundLink", false);
        setIntField(term7682, term7682.getClass(), "prevHypertextOffset", 0);
        setField(term7682, term7682.getClass(), "linkNavigationTag", null);
        setField(term7682, term7682.getClass(), "currentRun", null);
        setField(term7682, term7682.getClass(), "currentParagraph", null);
        setField(term7682, term7682.getClass(), "inputAttributes", null);
        setField(term7682, term7682.getClass(), "inputAttributeUpdater", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownEditorKit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStyleSheet", argTypes, term7682, args);
    }

};


