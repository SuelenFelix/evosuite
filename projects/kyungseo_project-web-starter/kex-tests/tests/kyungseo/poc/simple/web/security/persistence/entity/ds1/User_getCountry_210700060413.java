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

public class User_getCountry_210700060413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;

    public User_getCountry_210700060413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3602 = new Long(-1145146470850585022L);
        Boolean term3640 = new Boolean(false);
        Integer term3642 = new Integer(1596070772);
        ArrayList term3680 = new ArrayList();
        term3601 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term3697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3702 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3712 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3601, term3601.getClass(), "id", term3602);
        setField(term3601, term3601.getClass(), "membername", "ZwjARhAtHC");
        setField(term3601, term3601.getClass(), "email", "XXvscsYBWv");
        setField(term3601, term3601.getClass(), "password", "uePedtiAfL");
        setField(term3601, term3601.getClass(), "enabled", term3640);
        setField(term3601, term3601.getClass(), "age", term3642);
        setField(term3601, term3601.getClass(), "phoneNumber", "AdSHvysxQB");
        setField(term3601, term3601.getClass(), "country", "jlraKkBWFA");
        setField(term3601, term3601.getClass(), "birthdate", "mRBtFTxVdE");
        setField(term3601, term3601.getClass(), "roles", term3680);
        setBooleanField(term3601, term3601.getClass(), "isUsing2FA", false);
        setField(term3601, term3601.getClass(), "secret", "IVacFDAZcj");
        setIntField(term3698, term3698.getClass(), "year", 2026);
        setShortField(term3698, term3698.getClass(), "month", (short) 6);
        setShortField(term3698, term3698.getClass(), "day", (short) 13);
        setField(term3697, term3697.getClass(), "date", term3698);
        setByteField(term3702, term3702.getClass(), "hour", (byte) 19);
        setByteField(term3702, term3702.getClass(), "minute", (byte) 23);
        setByteField(term3702, term3702.getClass(), "second", (byte) 46);
        setIntField(term3702, term3702.getClass(), "nano", 67955056);
        setField(term3697, term3697.getClass(), "time", term3702);
        setField(term3601, term3601.getClass(), "regDate", term3697);
        setIntField(term3708, term3708.getClass(), "year", 2013);
        setShortField(term3708, term3708.getClass(), "month", (short) 12);
        setShortField(term3708, term3708.getClass(), "day", (short) 23);
        setField(term3707, term3707.getClass(), "date", term3708);
        setByteField(term3712, term3712.getClass(), "hour", (byte) 1);
        setByteField(term3712, term3712.getClass(), "minute", (byte) 0);
        setByteField(term3712, term3712.getClass(), "second", (byte) 32);
        setIntField(term3712, term3712.getClass(), "nano", 168525686);
        setField(term3707, term3707.getClass(), "time", term3712);
        setField(term3601, term3601.getClass(), "modDate", term3707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term3601, args);
    }

};


