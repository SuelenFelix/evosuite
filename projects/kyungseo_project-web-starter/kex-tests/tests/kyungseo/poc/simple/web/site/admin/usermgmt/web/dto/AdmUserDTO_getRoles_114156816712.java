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

public class AdmUserDTO_getRoles_114156816712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7005;

    public AdmUserDTO_getRoles_114156816712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7006 = new Long(6351887424140565471L);
        Boolean term7044 = new Boolean(false);
        Integer term7046 = new Integer(-375014958);
        Boolean term7084 = new Boolean(false);
        ArrayList term7098 = new ArrayList();
        term7005 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term7102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7117 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7005, term7005.getClass(), "id", term7006);
        setField(term7005, term7005.getClass(), "membername", "rbsXSOJFKW");
        setField(term7005, term7005.getClass(), "email", "sAgGDoUNlf");
        setField(term7005, term7005.getClass(), "password", "TSTZcXdFFi");
        setField(term7005, term7005.getClass(), "enabled", term7044);
        setField(term7005, term7005.getClass(), "age", term7046);
        setField(term7005, term7005.getClass(), "phoneNumber", "RyaaOzWfYO");
        setField(term7005, term7005.getClass(), "country", "HAkxFBZZzz");
        setField(term7005, term7005.getClass(), "birthdate", "yejonZnVuy");
        setField(term7005, term7005.getClass(), "isUsing2FA", term7084);
        setField(term7005, term7005.getClass(), "secret", "ouesGIsvuG");
        setField(term7005, term7005.getClass(), "roles", term7098);
        setIntField(term7103, term7103.getClass(), "year", 2011);
        setShortField(term7103, term7103.getClass(), "month", (short) 9);
        setShortField(term7103, term7103.getClass(), "day", (short) 7);
        setField(term7102, term7102.getClass(), "date", term7103);
        setByteField(term7107, term7107.getClass(), "hour", (byte) 0);
        setByteField(term7107, term7107.getClass(), "minute", (byte) 51);
        setByteField(term7107, term7107.getClass(), "second", (byte) 44);
        setIntField(term7107, term7107.getClass(), "nano", 245610060);
        setField(term7102, term7102.getClass(), "time", term7107);
        setField(term7005, term7005.getClass(), "regDate", term7102);
        setIntField(term7113, term7113.getClass(), "year", 2018);
        setShortField(term7113, term7113.getClass(), "month", (short) 1);
        setShortField(term7113, term7113.getClass(), "day", (short) 29);
        setField(term7112, term7112.getClass(), "date", term7113);
        setByteField(term7117, term7117.getClass(), "hour", (byte) 22);
        setByteField(term7117, term7117.getClass(), "minute", (byte) 20);
        setByteField(term7117, term7117.getClass(), "second", (byte) 36);
        setIntField(term7117, term7117.getClass(), "nano", 74678080);
        setField(term7112, term7112.getClass(), "time", term7117);
        setField(term7005, term7005.getClass(), "modDate", term7112);
        setField(term7005, term7005.getClass(), "date", "pHBHlmLIZQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term7005, args);
    }

};


