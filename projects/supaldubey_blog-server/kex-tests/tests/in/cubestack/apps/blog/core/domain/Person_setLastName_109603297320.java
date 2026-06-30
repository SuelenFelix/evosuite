package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Person_setLastName_109603297320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12650;

    public Person_setLastName_109603297320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12868 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term12867 = ((Class) term12868).getDeclaredField((String) "ACTIVE");
        ((Field) term12867).setAccessible(true);
        Object enum27 = ((Field) term12867).get((Object) null);
        ArrayList term12769 = new ArrayList();
        Long term12773 = new Long(2120084523938730454L);
        term12650 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term12775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12780 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12790 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12650, term12650.getClass(), "firstName", "AZdLeSugwv");
        setField(term12650, term12650.getClass(), "lastName", "RMsXuyzKJV");
        setField(term12650, term12650.getClass(), "email", "FwPbDZcHmB");
        setField(term12650, term12650.getClass(), "username", "hOncybyCAH");
        setField(term12650, term12650.getClass(), "password", "QduALnDSVo");
        setField(term12650, term12650.getClass(), "profileImage", "izPpKDErnQ");
        setField(term12650, term12650.getClass(), "status", enum27);
        setField(term12650, term12650.getClass(), "phone", "NnpwZBUTvx");
        setField(term12650, term12650.getClass(), "countryCode", "tlQSNgTkQX");
        setField(term12650, term12650.getClass(), "salt", "PCipZnmBOF");
        setField(term12650, term12650.getClass(), "personRoles", term12769);
        setField(term12650, term12650.getClass(), "id", term12773);
        setIntField(term12776, term12776.getClass(), "year", 2025);
        setShortField(term12776, term12776.getClass(), "month", (short) 3);
        setShortField(term12776, term12776.getClass(), "day", (short) 28);
        setField(term12775, term12775.getClass(), "date", term12776);
        setByteField(term12780, term12780.getClass(), "hour", (byte) 19);
        setByteField(term12780, term12780.getClass(), "minute", (byte) 56);
        setByteField(term12780, term12780.getClass(), "second", (byte) 52);
        setIntField(term12780, term12780.getClass(), "nano", 738558930);
        setField(term12775, term12775.getClass(), "time", term12780);
        setField(term12650, term12650.getClass(), "createdAt", term12775);
        setIntField(term12786, term12786.getClass(), "year", 2024);
        setShortField(term12786, term12786.getClass(), "month", (short) 2);
        setShortField(term12786, term12786.getClass(), "day", (short) 29);
        setField(term12785, term12785.getClass(), "date", term12786);
        setByteField(term12790, term12790.getClass(), "hour", (byte) 17);
        setByteField(term12790, term12790.getClass(), "minute", (byte) 54);
        setByteField(term12790, term12790.getClass(), "second", (byte) 21);
        setIntField(term12790, term12790.getClass(), "nano", 605973408);
        setField(term12785, term12785.getClass(), "time", term12790);
        setField(term12650, term12650.getClass(), "updatedAt", term12785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zcorEihhLK";
        callMethod(klass, "setLastName", argTypes, term12650, args);
    }

};


