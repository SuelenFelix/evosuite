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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class User_setSecret_141974080229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7013;

    public User_setSecret_141974080229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7014 = new Long(-1750555031444556464L);
        Boolean term7052 = new Boolean(true);
        Integer term7054 = new Integer(-375014958);
        ArrayList term7092 = new ArrayList();
        term7013 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term7109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7114 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7124 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7013, term7013.getClass(), "id", term7014);
        setField(term7013, term7013.getClass(), "membername", "YYwIEARNxi");
        setField(term7013, term7013.getClass(), "email", "rblXBUdTFc");
        setField(term7013, term7013.getClass(), "password", "rbsXSOJFKW");
        setField(term7013, term7013.getClass(), "enabled", term7052);
        setField(term7013, term7013.getClass(), "age", term7054);
        setField(term7013, term7013.getClass(), "phoneNumber", "sAgGDoUNlf");
        setField(term7013, term7013.getClass(), "country", "TSTZcXdFFi");
        setField(term7013, term7013.getClass(), "birthdate", "RyaaOzWfYO");
        setField(term7013, term7013.getClass(), "roles", term7092);
        setBooleanField(term7013, term7013.getClass(), "isUsing2FA", true);
        setField(term7013, term7013.getClass(), "secret", "HAkxFBZZzz");
        setIntField(term7110, term7110.getClass(), "year", 2025);
        setShortField(term7110, term7110.getClass(), "month", (short) 2);
        setShortField(term7110, term7110.getClass(), "day", (short) 23);
        setField(term7109, term7109.getClass(), "date", term7110);
        setByteField(term7114, term7114.getClass(), "hour", (byte) 16);
        setByteField(term7114, term7114.getClass(), "minute", (byte) 39);
        setByteField(term7114, term7114.getClass(), "second", (byte) 42);
        setIntField(term7114, term7114.getClass(), "nano", 342777686);
        setField(term7109, term7109.getClass(), "time", term7114);
        setField(term7013, term7013.getClass(), "regDate", term7109);
        setIntField(term7120, term7120.getClass(), "year", 2029);
        setShortField(term7120, term7120.getClass(), "month", (short) 8);
        setShortField(term7120, term7120.getClass(), "day", (short) 14);
        setField(term7119, term7119.getClass(), "date", term7120);
        setByteField(term7124, term7124.getClass(), "hour", (byte) 10);
        setByteField(term7124, term7124.getClass(), "minute", (byte) 28);
        setByteField(term7124, term7124.getClass(), "second", (byte) 23);
        setIntField(term7124, term7124.getClass(), "nano", 676524979);
        setField(term7119, term7119.getClass(), "time", term7124);
        setField(term7013, term7013.getClass(), "modDate", term7119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yejonZnVuy";
        callMethod(klass, "setSecret", argTypes, term7013, args);
    }

};


