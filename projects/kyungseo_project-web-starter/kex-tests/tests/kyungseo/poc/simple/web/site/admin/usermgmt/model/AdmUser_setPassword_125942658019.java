package kyungseo.poc.simple.web.site.admin.usermgmt.model;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUser_setPassword_125942658019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4026;

    public AdmUser_setPassword_125942658019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4027 = new Long(-4714000263923324167L);
        Integer term4065 = new Integer(1375330971);
        Boolean term4103 = new Boolean(false);
        ArrayList term4105 = new ArrayList();
        Boolean term4109 = new Boolean(true);
        term4026 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term4123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4138 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4026, term4026.getClass(), "id", term4027);
        setField(term4026, term4026.getClass(), "membername", "aJQuCOCvZs");
        setField(term4026, term4026.getClass(), "email", "lHYNCJRiOv");
        setField(term4026, term4026.getClass(), "password", "QVLresHoaP");
        setField(term4026, term4026.getClass(), "age", term4065);
        setField(term4026, term4026.getClass(), "phoneNumber", "IbxeAMwLVt");
        setField(term4026, term4026.getClass(), "country", "bShlAqoTmZ");
        setField(term4026, term4026.getClass(), "birthdate", "nOKlKlNhtU");
        setField(term4026, term4026.getClass(), "enabled", term4103);
        setField(term4026, term4026.getClass(), "roles", term4105);
        setField(term4026, term4026.getClass(), "isUsing2FA", term4109);
        setField(term4026, term4026.getClass(), "secret", "gXFNBHJSey");
        setIntField(term4124, term4124.getClass(), "year", 2020);
        setShortField(term4124, term4124.getClass(), "month", (short) 5);
        setShortField(term4124, term4124.getClass(), "day", (short) 12);
        setField(term4123, term4123.getClass(), "date", term4124);
        setByteField(term4128, term4128.getClass(), "hour", (byte) 22);
        setByteField(term4128, term4128.getClass(), "minute", (byte) 7);
        setByteField(term4128, term4128.getClass(), "second", (byte) 49);
        setIntField(term4128, term4128.getClass(), "nano", 677355362);
        setField(term4123, term4123.getClass(), "time", term4128);
        setField(term4026, term4026.getClass(), "regDate", term4123);
        setIntField(term4134, term4134.getClass(), "year", 2010);
        setShortField(term4134, term4134.getClass(), "month", (short) 11);
        setShortField(term4134, term4134.getClass(), "day", (short) 1);
        setField(term4133, term4133.getClass(), "date", term4134);
        setByteField(term4138, term4138.getClass(), "hour", (byte) 5);
        setByteField(term4138, term4138.getClass(), "minute", (byte) 32);
        setByteField(term4138, term4138.getClass(), "second", (byte) 8);
        setIntField(term4138, term4138.getClass(), "nano", 918832231);
        setField(term4133, term4133.getClass(), "time", term4138);
        setField(term4026, term4026.getClass(), "modDate", term4133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wUcSfItZgv";
        callMethod(klass, "setPassword", argTypes, term4026, args);
    }

};


