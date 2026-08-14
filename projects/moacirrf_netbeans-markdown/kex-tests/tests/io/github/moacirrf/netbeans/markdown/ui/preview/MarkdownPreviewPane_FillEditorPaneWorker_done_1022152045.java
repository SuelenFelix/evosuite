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

public class MarkdownPreviewPane_FillEditorPaneWorker_done_1022152045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5079;

    public MarkdownPreviewPane_FillEditorPaneWorker_done_1022152045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5079 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker"));
        setField(term5079, term5079.getClass(), "markdownText", null);
        setIntField(term5079, term5079.getClass(), "version", 0);
        setField(term5079, term5079.getClass(), "scrollState", null);
        setField(term5079, term5079.getClass(), "this$0", null);
        setIntField(term5079, term5079.getClass(), "progress", 0);
        setField(term5079, term5079.getClass(), "state", null);
        setField(term5079, term5079.getClass(), "future", null);
        setField(term5079, term5079.getClass(), "propertyChangeSupport", null);
        setField(term5079, term5079.getClass(), "doProcess", null);
        setField(term5079, term5079.getClass(), "doNotifyProgressChange", null);
        setField(term5079, term5079.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.MarkdownPreviewPane$FillEditorPaneWorker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "done", argTypes, term5079, args);
    }

};


