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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class TimingSession_start_14999444393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194773;

    public TimingSession_start_14999444393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term194774 = new ArrayList();
        HashMap term194778 = new HashMap();
        Class<? extends Object> term194802 = Class.forName((String) "net.obvj.performetrics.TimingSession$State");
        Field term194801 = ((Class) term194802).getDeclaredField((String) "READY");
        ((Field) term194801).setAccessible(true);
        Object enum689 = ((Field) term194801).get((Object) null);
        term194773 = newInstance(Class.forName("net.obvj.performetrics.TimingSession"));
        setField(term194773, term194773.getClass(), "types", term194774);
        setField(term194773, term194773.getClass(), "counters", term194778);
        setField(term194773, term194773.getClass(), "state", enum689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term194773, args);
    }

};


