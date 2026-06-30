package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PrintUser_hashCode_131110639019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15491;

    public PrintUser_hashCode_131110639019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15637 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term15636 = ((Class) term15637).getDeclaredField((String) "USER");
        ((Field) term15636).setAccessible(true);
        Object enum57 = ((Field) term15636).get((Object) null);
        ArrayList term15572 = new ArrayList();
        term15491 = newInstance(Class.forName("ozi.app.printer.data.models.PrintUser"));
        setField(term15491, term15491.getClass(), "id", "UDaboHZHhz");
        setField(term15491, term15491.getClass(), "firstName", "nRvKihUSPj");
        setField(term15491, term15491.getClass(), "lastName", "BbNeQJpYPr");
        setField(term15491, term15491.getClass(), "password", "riMtzCoxNj");
        setField(term15491, term15491.getClass(), "phoneNumber", "YAXkVjQZcV");
        setField(term15491, term15491.getClass(), "email", "pumvwBWvpy");
        setField(term15491, term15491.getClass(), "role", enum57);
        setField(term15491, term15491.getClass(), "orders", term15572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15491, args);
    }

};


