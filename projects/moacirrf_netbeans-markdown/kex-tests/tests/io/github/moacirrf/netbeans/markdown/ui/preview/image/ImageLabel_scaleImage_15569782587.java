package io.github.moacirrf.netbeans.markdown.ui.preview.image;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.image.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ImageLabel_scaleImage_15569782587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1753;

    public ImageLabel_scaleImage_15569782587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1753 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term1753, term1753.getClass(), "width", 1632125673);
        setIntField(term1753, term1753.getClass(), "height", 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Image");
        argTypes[2] = Class.forName("java.awt.Dimension");
        Object[] args = new Object[3];
        args[0] = "uWHnvSvaPl";
        args[1] = null;
        args[2] = term1753;
        callMethod(klass, "scaleImage", argTypes, null, args);
    }

};


