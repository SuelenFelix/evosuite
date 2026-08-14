package io.github.moacirrf.netbeans.markdown;

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
import static io.github.moacirrf.netbeans.markdown.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class MyConfigurations_ViewMode_values_18380792013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum30;

    public MyConfigurations_ViewMode_values_18380792013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77409 = Class.forName((String) "io.github.moacirrf.netbeans.markdown.MyConfigurations$ViewMode");
        Field term77408 = ((Class) term77409).getDeclaredField((String) "SPLIT_VERTICAL");
        ((Field) term77408).setAccessible(true);
        enum30 = ((Field) term77408).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.MyConfigurations$ViewMode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum30, args);
    }

};


