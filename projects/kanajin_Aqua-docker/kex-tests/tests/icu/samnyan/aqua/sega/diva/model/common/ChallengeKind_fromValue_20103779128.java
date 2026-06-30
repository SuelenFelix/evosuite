package icu.samnyan.aqua.sega.diva.model.common;

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
import static icu.samnyan.aqua.sega.diva.model.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class ChallengeKind_fromValue_20103779128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3146;
     Object term1914524;

    public ChallengeKind_fromValue_20103779128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1914527 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term1914526 = ((Class) term1914527).getDeclaredField((String) "GREAT");
        ((Field) term1914526).setAccessible(true);
        enum3146 = ((Field) term1914526).get((Object) null);
        term1914524 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1914524;
        callMethod(klass, "fromValue", argTypes, enum3146, args);
    }

};


