package icu.samnyan.aqua.sega.diva.handler.ingame;

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
import static icu.samnyan.aqua.sega.diva.handler.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StageResultHandler_slice_21467236412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7062;
     Object term7069;
     Object term7071;

    public StageResultHandler_slice_21467236412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7062 = (int[]) newIntArray(6);
        setIntElement(term7062, 0, 296568835);
        setIntElement(term7062, 1, 1431951992);
        setIntElement(term7062, 2, -1608123016);
        setIntElement(term7062, 3, -896473214);
        setIntElement(term7062, 4, 401203924);
        setIntElement(term7062, 5, -1212399479);
        term7069 = new Integer(2107679041);
        term7071 = new Integer(2040965507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.StageResultHandler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term7062;
        args[1] = term7069;
        args[2] = term7071;
        callMethod(klass, "slice", argTypes, null, args);
    }

};


