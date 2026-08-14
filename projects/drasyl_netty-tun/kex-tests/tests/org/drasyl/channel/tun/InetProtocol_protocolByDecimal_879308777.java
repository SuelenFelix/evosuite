package org.drasyl.channel.tun;

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
import static org.drasyl.channel.tun.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class InetProtocol_protocolByDecimal_879308777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;
     Object term3446;

    public InetProtocol_protocolByDecimal_879308777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3449 = Class.forName((String) "org.drasyl.channel.tun.InetProtocol");
        Field term3448 = ((Class) term3449).getDeclaredField((String) "CBT");
        ((Field) term3448).setAccessible(true);
        enum2 = ((Field) term3448).get((Object) null);
        term3446 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.drasyl.channel.tun.InetProtocol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3446;
        callMethod(klass, "protocolByDecimal", argTypes, enum2, args);
    }

};


