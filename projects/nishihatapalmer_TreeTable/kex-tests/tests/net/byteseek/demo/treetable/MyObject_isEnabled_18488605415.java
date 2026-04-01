package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class MyObject_isEnabled_18488605415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;

    public MyObject_isEnabled_18488605415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term349 = new ArrayList();
        Object term348 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term348, term348.getClass(), "children", term349);
        setField(term348, term348.getClass(), "description", "");
        setLongField(term348, term348.getClass(), "size", -484994522244390100L);
        setBooleanField(term348, term348.getClass(), "enabled", true);
        ArrayList term346 = new ArrayList();
        ((ArrayList) term346).add(term348);
        term345 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term345, term345.getClass(), "children", term346);
        setField(term345, term345.getClass(), "description", "nyiiPDVjAc");
        setLongField(term345, term345.getClass(), "size", 1233889271256172047L);
        setBooleanField(term345, term345.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term345, args);
    }

};


