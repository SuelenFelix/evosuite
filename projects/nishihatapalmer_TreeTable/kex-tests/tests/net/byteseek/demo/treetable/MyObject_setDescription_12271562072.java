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

public class MyObject_setDescription_12271562072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;

    public MyObject_setDescription_12271562072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term196 = new ArrayList();
        Object term195 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term195, term195.getClass(), "children", term196);
        setField(term195, term195.getClass(), "description", "");
        setLongField(term195, term195.getClass(), "size", -8885298608300233488L);
        setBooleanField(term195, term195.getClass(), "enabled", true);
        ArrayList term193 = new ArrayList();
        ((ArrayList) term193).add(term195);
        term192 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term192, term192.getClass(), "children", term193);
        setField(term192, term192.getClass(), "description", "aJlieCFVtF");
        setLongField(term192, term192.getClass(), "size", -4325723315152823407L);
        setBooleanField(term192, term192.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setDescription", argTypes, term192, args);
    }

};


