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

public class ViewUtils_isElementOfTag_19936343310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5218;

    public ViewUtils_isElementOfTag_19936343310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5218 = newInstance(Class.forName("javax.swing.text.html.HTML$Tag"));
        setBooleanField(term5218, term5218.getClass(), "blockTag", true);
        setBooleanField(term5218, term5218.getClass(), "breakTag", true);
        setField(term5218, term5218.getClass(), "name", "hMmaoREuCK");
        setBooleanField(term5218, term5218.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.ViewUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        argTypes[1] = Class.forName("javax.swing.text.html.HTML$Tag");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5218;
        callMethod(klass, "isElementOfTag", argTypes, null, args);
    }

};


