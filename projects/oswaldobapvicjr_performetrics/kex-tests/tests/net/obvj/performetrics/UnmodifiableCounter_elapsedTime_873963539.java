package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class UnmodifiableCounter_elapsedTime_873963539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212719;
     Object enum767;

    public UnmodifiableCounter_elapsedTime_873963539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212792 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term212791 = ((Class) term212792).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term212791).setAccessible(true);
        Object enum765 = ((Field) term212791).get((Object) null);
        Class<? extends Object> term213007 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term213006 = ((Class) term213007).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term213006).setAccessible(true);
        Object enum766 = ((Field) term213006).get((Object) null);
        term212719 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term212720 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term212720, term212720.getClass(), "type", enum765);
        setField(term212720, term212720.getClass(), "conversionMode", enum766);
        setLongField(term212720, term212720.getClass(), "unitsBefore", -1505191021111100819L);
        setLongField(term212720, term212720.getClass(), "unitsAfter", -1000830646340880796L);
        setBooleanField(term212720, term212720.getClass(), "unitsAfterSet", false);
        setField(term212719, term212719.getClass(), "counter", term212720);
        setField(term212719, term212719.getClass(), "type", enum765);
        setField(term212719, term212719.getClass(), "conversionMode", enum766);
        setLongField(term212719, term212719.getClass(), "unitsBefore", 5973526439563541711L);
        setLongField(term212719, term212719.getClass(), "unitsAfter", 5246058710498845622L);
        setBooleanField(term212719, term212719.getClass(), "unitsAfterSet", false);
        Class<? extends Object> term213247 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term213246 = ((Class) term213247).getDeclaredField((String) "DAYS");
        ((Field) term213246).setAccessible(true);
        enum767 = ((Field) term213246).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[1];
        args[0] = enum767;
        callMethod(klass, "elapsedTime", argTypes, term212719, args);
    }

};


