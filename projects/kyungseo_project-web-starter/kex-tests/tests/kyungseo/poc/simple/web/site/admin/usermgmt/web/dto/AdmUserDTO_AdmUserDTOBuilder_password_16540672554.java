package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserDTO_AdmUserDTOBuilder_password_16540672554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804;

    public AdmUserDTO_AdmUserDTOBuilder_password_16540672554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term805 = new Long(4044358158040652353L);
        Boolean term843 = new Boolean(false);
        Integer term845 = new Integer(-1685132342);
        Boolean term883 = new Boolean(true);
        Long term900 = new Long(-4443169559037975007L);
        ArrayList term902 = new ArrayList();
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ArrayList term905 = new ArrayList();
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        Object term899 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term899, term899.getClass(), "id", term900);
        setField(term899, term899.getClass(), "users", term902);
        setField(term899, term899.getClass(), "privileges", term905);
        setField(term899, term899.getClass(), "name", "");
        ArrayList term897 = new ArrayList();
        ((ArrayList) term897).add(term899);
        term804 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        Object term911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term916 = newInstance(Class.forName("java.time.LocalTime"));
        Object term921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term926 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term804, term804.getClass(), "id", term805);
        setField(term804, term804.getClass(), "membername", "FPvxVzzSvD");
        setField(term804, term804.getClass(), "email", "WHcwFgsGFC");
        setField(term804, term804.getClass(), "password", "HzqpegHiRq");
        setField(term804, term804.getClass(), "enabled", term843);
        setField(term804, term804.getClass(), "age", term845);
        setField(term804, term804.getClass(), "phoneNumber", "jwsfVjMoJT");
        setField(term804, term804.getClass(), "country", "ZfdXfCCFDf");
        setField(term804, term804.getClass(), "birthdate", "MwwjNtdOFT");
        setField(term804, term804.getClass(), "isUsing2FA", term883);
        setField(term804, term804.getClass(), "secret", "VYkqXKVlAJ");
        setField(term804, term804.getClass(), "roles", term897);
        setIntField(term912, term912.getClass(), "year", 2023);
        setShortField(term912, term912.getClass(), "month", (short) 7);
        setShortField(term912, term912.getClass(), "day", (short) 16);
        setField(term911, term911.getClass(), "date", term912);
        setByteField(term916, term916.getClass(), "hour", (byte) 3);
        setByteField(term916, term916.getClass(), "minute", (byte) 1);
        setByteField(term916, term916.getClass(), "second", (byte) 19);
        setIntField(term916, term916.getClass(), "nano", 488629554);
        setField(term911, term911.getClass(), "time", term916);
        setField(term804, term804.getClass(), "regDate", term911);
        setIntField(term922, term922.getClass(), "year", 2018);
        setShortField(term922, term922.getClass(), "month", (short) 7);
        setShortField(term922, term922.getClass(), "day", (short) 12);
        setField(term921, term921.getClass(), "date", term922);
        setByteField(term926, term926.getClass(), "hour", (byte) 1);
        setByteField(term926, term926.getClass(), "minute", (byte) 3);
        setByteField(term926, term926.getClass(), "second", (byte) 47);
        setIntField(term926, term926.getClass(), "nano", 2729929);
        setField(term921, term921.getClass(), "time", term926);
        setField(term804, term804.getClass(), "modDate", term921);
        setField(term804, term804.getClass(), "date", "JppkknKVOw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iljANwuEjk";
        callMethod(klass, "password", argTypes, term804, args);
    }

};


