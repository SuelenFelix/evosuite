package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class UserLocation_getUser_3967597876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9110;

    public UserLocation_getUser_3967597876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9111 = new Long(3535528164828723056L);
        Long term9127 = new Long(4036794646678680547L);
        Boolean term9165 = new Boolean(true);
        Integer term9167 = new Integer(-1970452551);
        ArrayList term9205 = new ArrayList();
        term9110 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term9126 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term9222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9237 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9110, term9110.getClass(), "id", term9111);
        setField(term9110, term9110.getClass(), "country", "JpFIuyNEKW");
        setBooleanField(term9110, term9110.getClass(), "enabled", false);
        setField(term9126, term9126.getClass(), "id", term9127);
        setField(term9126, term9126.getClass(), "membername", "NksHsgcqDx");
        setField(term9126, term9126.getClass(), "email", "RjSNvOEvcT");
        setField(term9126, term9126.getClass(), "password", "HLzuMxigqS");
        setField(term9126, term9126.getClass(), "enabled", term9165);
        setField(term9126, term9126.getClass(), "age", term9167);
        setField(term9126, term9126.getClass(), "phoneNumber", "wiBOoDCyzd");
        setField(term9126, term9126.getClass(), "country", "TIaFKUJELS");
        setField(term9126, term9126.getClass(), "birthdate", "IPmndzGjtG");
        setField(term9126, term9126.getClass(), "roles", term9205);
        setBooleanField(term9126, term9126.getClass(), "isUsing2FA", false);
        setField(term9126, term9126.getClass(), "secret", "pkQiBgYrkQ");
        setIntField(term9223, term9223.getClass(), "year", 2024);
        setShortField(term9223, term9223.getClass(), "month", (short) 11);
        setShortField(term9223, term9223.getClass(), "day", (short) 26);
        setField(term9222, term9222.getClass(), "date", term9223);
        setByteField(term9227, term9227.getClass(), "hour", (byte) 3);
        setByteField(term9227, term9227.getClass(), "minute", (byte) 8);
        setByteField(term9227, term9227.getClass(), "second", (byte) 47);
        setIntField(term9227, term9227.getClass(), "nano", 559634968);
        setField(term9222, term9222.getClass(), "time", term9227);
        setField(term9126, term9126.getClass(), "regDate", term9222);
        setIntField(term9233, term9233.getClass(), "year", 2018);
        setShortField(term9233, term9233.getClass(), "month", (short) 4);
        setShortField(term9233, term9233.getClass(), "day", (short) 20);
        setField(term9232, term9232.getClass(), "date", term9233);
        setByteField(term9237, term9237.getClass(), "hour", (byte) 16);
        setByteField(term9237, term9237.getClass(), "minute", (byte) 13);
        setByteField(term9237, term9237.getClass(), "second", (byte) 15);
        setIntField(term9237, term9237.getClass(), "nano", 195741881);
        setField(term9232, term9232.getClass(), "time", term9237);
        setField(term9126, term9126.getClass(), "modDate", term9232);
        setField(term9110, term9110.getClass(), "user", term9126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term9110, args);
    }

};


