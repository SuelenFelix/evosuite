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

public class Person_deactivate_458687999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7072;

    public Person_deactivate_458687999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7278 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term7277 = ((Class) term7278).getDeclaredField((String) "ACTIVE");
        ((Field) term7277).setAccessible(true);
        Object enum16 = ((Field) term7277).get((Object) null);
        ArrayList term7191 = new ArrayList();
        Long term7195 = new Long(5127676408959197577L);
        term7072 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term7197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7212 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7072, term7072.getClass(), "firstName", "vjxIhXHxGR");
        setField(term7072, term7072.getClass(), "lastName", "QXzGXbEXMu");
        setField(term7072, term7072.getClass(), "email", "qxSDVejjiY");
        setField(term7072, term7072.getClass(), "username", "xBsXSDjXYK");
        setField(term7072, term7072.getClass(), "password", "sEnIVFtZuQ");
        setField(term7072, term7072.getClass(), "profileImage", "ZVecLZMLHF");
        setField(term7072, term7072.getClass(), "status", enum16);
        setField(term7072, term7072.getClass(), "phone", "fztQhjqwdP");
        setField(term7072, term7072.getClass(), "countryCode", "eVpkWxjuki");
        setField(term7072, term7072.getClass(), "salt", "SJiQaLvSKv");
        setField(term7072, term7072.getClass(), "personRoles", term7191);
        setField(term7072, term7072.getClass(), "id", term7195);
        setIntField(term7198, term7198.getClass(), "year", 2010);
        setShortField(term7198, term7198.getClass(), "month", (short) 5);
        setShortField(term7198, term7198.getClass(), "day", (short) 2);
        setField(term7197, term7197.getClass(), "date", term7198);
        setByteField(term7202, term7202.getClass(), "hour", (byte) 2);
        setByteField(term7202, term7202.getClass(), "minute", (byte) 22);
        setByteField(term7202, term7202.getClass(), "second", (byte) 33);
        setIntField(term7202, term7202.getClass(), "nano", 530835039);
        setField(term7197, term7197.getClass(), "time", term7202);
        setField(term7072, term7072.getClass(), "createdAt", term7197);
        setIntField(term7208, term7208.getClass(), "year", 2024);
        setShortField(term7208, term7208.getClass(), "month", (short) 4);
        setShortField(term7208, term7208.getClass(), "day", (short) 24);
        setField(term7207, term7207.getClass(), "date", term7208);
        setByteField(term7212, term7212.getClass(), "hour", (byte) 7);
        setByteField(term7212, term7212.getClass(), "minute", (byte) 2);
        setByteField(term7212, term7212.getClass(), "second", (byte) 51);
        setIntField(term7212, term7212.getClass(), "nano", 635502964);
        setField(term7207, term7207.getClass(), "time", term7212);
        setField(term7072, term7072.getClass(), "updatedAt", term7207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deactivate", argTypes, term7072, args);
    }

};


