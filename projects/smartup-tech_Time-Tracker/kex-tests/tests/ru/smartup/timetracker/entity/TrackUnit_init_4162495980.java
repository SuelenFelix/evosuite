package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class TrackUnit_init_4162495980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63569;
     Object term63571;
     Object term63597;
     Object term63611;
     Object term63613;
     Object enum145;
     Object term63626;

    public TrackUnit_init_4162495980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63569 = new Long(2120084523938730454L);
        term63571 = new Integer(-2119545015);
        term63597 = new Long(6855071767938501807L);
        term63611 = newInstance(Class.forName("java.util.Date"));
        setLongField(term63611, term63611.getClass(), "fastTime", 1345871412244L);
        setField(term63611, term63611.getClass(), "cdate", null);
        term63613 = new Float(0.13238746F);
        Class<? extends Object> term63671 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term63670 = ((Class) term63671).getDeclaredField((String) "CREATED");
        ((Field) term63670).setAccessible(true);
        enum145 = ((Field) term63670).get((Object) null);
        term63626 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.Date");
        argTypes[7] = float.class;
        argTypes[8] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        argTypes[9] = boolean.class;
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term63569;
        args[1] = term63571;
        args[2] = "RxbhrFBjkO";
        args[3] = "aanyiAOJCl";
        args[4] = term63597;
        args[5] = "VDokbsCuqq";
        args[6] = term63611;
        args[7] = term63613;
        args[8] = enum145;
        args[9] = term63626;
        args[10] = "xClUIcPECX";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


