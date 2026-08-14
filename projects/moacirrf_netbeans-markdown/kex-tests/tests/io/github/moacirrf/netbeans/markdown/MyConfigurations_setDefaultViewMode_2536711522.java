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

public class MyConfigurations_setDefaultViewMode_2536711522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum57;

    public MyConfigurations_setDefaultViewMode_2536711522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92835 = Class.forName((String) "io.github.moacirrf.netbeans.markdown.MyConfigurations$ViewMode");
        Field term92834 = ((Class) term92835).getDeclaredField((String) "SPLIT_VERTICAL");
        ((Field) term92834).setAccessible(true);
        enum57 = ((Field) term92834).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.MyConfigurations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.moacirrf.netbeans.markdown.MyConfigurations$ViewMode");
        Object[] args = new Object[1];
        args[0] = enum57;
        callMethod(klass, "setDefaultViewMode", argTypes, null, args);
    }

};


