package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_PostBOBuilder_createdAt_9124963957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23296;
     Object term23362;

    public PostBO_PostBOBuilder_createdAt_9124963957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23297 = new Long(-4663904610228258188L);
        Long term23299 = new Long(3824691451696451167L);
        Class<? extends Object> term23373 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term23372 = ((Class) term23373).getDeclaredField((String) "VIDEO");
        ((Field) term23372).setAccessible(true);
        Object enum66 = ((Field) term23372).get((Object) null);
        Long term23324 = new Long(-6237686742902369498L);
        Long term23326 = new Long(-2286229228641472715L);
        Long term23328 = new Long(7464122056779140588L);
        Long term23330 = new Long(6542357174275680335L);
        Long term23332 = new Long(206360660645917003L);
        Long term23334 = new Long(8680715663951713735L);
        Long term23336 = new Long(-4905558793519537969L);
        ArrayList term23322 = new ArrayList();
        ((ArrayList) term23322).add(term23324);
        ((ArrayList) term23322).add(term23326);
        ((ArrayList) term23322).add(term23328);
        ((ArrayList) term23322).add(term23330);
        ((ArrayList) term23322).add(term23332);
        ((ArrayList) term23322).add(term23334);
        ((ArrayList) term23322).add(term23336);
        Long term23340 = new Long(4354242424632479389L);
        term23296 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term23342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23347 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23352 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23353 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23357 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23296, term23296.getClass(), "id", term23297);
        setField(term23296, term23296.getClass(), "userId", term23299);
        setField(term23296, term23296.getClass(), "type", enum66);
        setField(term23296, term23296.getClass(), "text", "AZdLeSugwv");
        setField(term23296, term23296.getClass(), "imageIds", term23322);
        setField(term23296, term23296.getClass(), "videoId", term23340);
        setIntField(term23343, term23343.getClass(), "year", 2018);
        setShortField(term23343, term23343.getClass(), "month", (short) 5);
        setShortField(term23343, term23343.getClass(), "day", (short) 13);
        setField(term23342, term23342.getClass(), "date", term23343);
        setByteField(term23347, term23347.getClass(), "hour", (byte) 0);
        setByteField(term23347, term23347.getClass(), "minute", (byte) 47);
        setByteField(term23347, term23347.getClass(), "second", (byte) 45);
        setIntField(term23347, term23347.getClass(), "nano", 10058361);
        setField(term23342, term23342.getClass(), "time", term23347);
        setField(term23296, term23296.getClass(), "createdAt", term23342);
        setIntField(term23353, term23353.getClass(), "year", 2014);
        setShortField(term23353, term23353.getClass(), "month", (short) 6);
        setShortField(term23353, term23353.getClass(), "day", (short) 11);
        setField(term23352, term23352.getClass(), "date", term23353);
        setByteField(term23357, term23357.getClass(), "hour", (byte) 8);
        setByteField(term23357, term23357.getClass(), "minute", (byte) 55);
        setByteField(term23357, term23357.getClass(), "second", (byte) 58);
        setIntField(term23357, term23357.getClass(), "nano", 376244535);
        setField(term23352, term23352.getClass(), "time", term23357);
        setField(term23296, term23296.getClass(), "updatedAt", term23352);
        term23362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23367 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23363, term23363.getClass(), "year", 2022);
        setShortField(term23363, term23363.getClass(), "month", (short) 1);
        setShortField(term23363, term23363.getClass(), "day", (short) 4);
        setField(term23362, term23362.getClass(), "date", term23363);
        setByteField(term23367, term23367.getClass(), "hour", (byte) 21);
        setByteField(term23367, term23367.getClass(), "minute", (byte) 36);
        setByteField(term23367, term23367.getClass(), "second", (byte) 43);
        setIntField(term23367, term23367.getClass(), "nano", 941221944);
        setField(term23362, term23362.getClass(), "time", term23367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23362;
        callMethod(klass, "createdAt", argTypes, term23296, args);
    }

};


