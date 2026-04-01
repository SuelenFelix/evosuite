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

public class AdmUser_getPassword_14491982765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;

    public AdmUser_getPassword_14491982765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term693 = new Long(-2170847986967241072L);
        Integer term731 = new Integer(-1685132342);
        Boolean term769 = new Boolean(false);
        Long term774 = new Long(4044358158040652353L);
        ArrayList term776 = new ArrayList();
        ((ArrayList) term776).add((Object)null);
        ((ArrayList) term776).add((Object)null);
        ((ArrayList) term776).add((Object)null);
        ((ArrayList) term776).add((Object)null);
        ((ArrayList) term776).add((Object)null);
        ((ArrayList) term776).add((Object)null);
        ArrayList term779 = new ArrayList();
        ((ArrayList) term779).add((Object)null);
        ((ArrayList) term779).add((Object)null);
        ((ArrayList) term779).add((Object)null);
        ((ArrayList) term779).add((Object)null);
        Object term773 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term773, term773.getClass(), "id", term774);
        setField(term773, term773.getClass(), "users", term776);
        setField(term773, term773.getClass(), "privileges", term779);
        setField(term773, term773.getClass(), "name", "");
        ArrayList term771 = new ArrayList();
        ((ArrayList) term771).add(term773);
        Boolean term785 = new Boolean(true);
        term692 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term814 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term692, term692.getClass(), "id", term693);
        setField(term692, term692.getClass(), "membername", "mvrkADEgpp");
        setField(term692, term692.getClass(), "email", "pXOkjyeIRb");
        setField(term692, term692.getClass(), "password", "GgZWSjxjyE");
        setField(term692, term692.getClass(), "age", term731);
        setField(term692, term692.getClass(), "phoneNumber", "EeBVbzjcCI");
        setField(term692, term692.getClass(), "country", "UfQtPRyWRC");
        setField(term692, term692.getClass(), "birthdate", "FPvxVzzSvD");
        setField(term692, term692.getClass(), "enabled", term769);
        setField(term692, term692.getClass(), "roles", term771);
        setField(term692, term692.getClass(), "isUsing2FA", term785);
        setField(term692, term692.getClass(), "secret", "DyiXbeYIaN");
        setIntField(term800, term800.getClass(), "year", 2023);
        setShortField(term800, term800.getClass(), "month", (short) 7);
        setShortField(term800, term800.getClass(), "day", (short) 16);
        setField(term799, term799.getClass(), "date", term800);
        setByteField(term804, term804.getClass(), "hour", (byte) 3);
        setByteField(term804, term804.getClass(), "minute", (byte) 1);
        setByteField(term804, term804.getClass(), "second", (byte) 19);
        setIntField(term804, term804.getClass(), "nano", 488629554);
        setField(term799, term799.getClass(), "time", term804);
        setField(term692, term692.getClass(), "regDate", term799);
        setIntField(term810, term810.getClass(), "year", 2018);
        setShortField(term810, term810.getClass(), "month", (short) 7);
        setShortField(term810, term810.getClass(), "day", (short) 12);
        setField(term809, term809.getClass(), "date", term810);
        setByteField(term814, term814.getClass(), "hour", (byte) 1);
        setByteField(term814, term814.getClass(), "minute", (byte) 3);
        setByteField(term814, term814.getClass(), "second", (byte) 47);
        setIntField(term814, term814.getClass(), "nano", 2729929);
        setField(term809, term809.getClass(), "time", term814);
        setField(term692, term692.getClass(), "modDate", term809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term692, args);
    }

};


