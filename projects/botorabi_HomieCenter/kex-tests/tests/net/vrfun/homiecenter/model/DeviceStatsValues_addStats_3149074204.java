package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class DeviceStatsValues_addStats_3149074204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9985;
     Object term9990;
     Object term9992;

    public DeviceStatsValues_addStats_3149074204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9986 = new ArrayList();
        term9985 = newInstance(Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues"));
        setField(term9985, term9985.getClass(), "stats", term9986);
        term9990 = new Integer(1358829571);
        Integer term9995 = new Integer(1585847225);
        Integer term9998 = new Integer(597278769);
        Integer term10001 = new Integer(-1685132342);
        Integer term10004 = new Integer(-1456670397);
        term9992 = new LinkedList();
        ((LinkedList) term9992).add(term9995);
        ((LinkedList) term9992).add(term9998);
        ((LinkedList) term9992).add(term10001);
        ((LinkedList) term9992).add(term10004);
        ((LinkedList) term9992).add((Object)null);
        ((LinkedList) term9992).add((Object)null);
        ((LinkedList) term9992).add((Object)null);
        ((LinkedList) term9992).add((Object)null);
        ((LinkedList) term9992).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.DeviceStatsValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term9990;
        args[1] = term9992;
        callMethod(klass, "addStats", argTypes, term9985, args);
    }

};


