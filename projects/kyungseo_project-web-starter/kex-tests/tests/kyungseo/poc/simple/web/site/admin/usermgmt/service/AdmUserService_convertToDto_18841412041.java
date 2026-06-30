package kyungseo.poc.simple.web.site.admin.usermgmt.service;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserService_convertToDto_18841412041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;

    public AdmUserService_convertToDto_18841412041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term522 = new Long(6855071767938501807L);
        Integer term560 = new Integer(1725571209);
        Boolean term598 = new Boolean(false);
        Long term603 = new Long(-5892135042702373494L);
        ArrayList term605 = new ArrayList();
        ((ArrayList) term605).add((Object)null);
        ((ArrayList) term605).add((Object)null);
        ((ArrayList) term605).add((Object)null);
        ((ArrayList) term605).add((Object)null);
        ArrayList term608 = new ArrayList();
        ((ArrayList) term608).add((Object)null);
        Object term602 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term602, term602.getClass(), "id", term603);
        setField(term602, term602.getClass(), "users", term605);
        setField(term602, term602.getClass(), "privileges", term608);
        setField(term602, term602.getClass(), "name", "");
        Long term613 = new Long(-7612550318181586304L);
        ArrayList term615 = new ArrayList();
        ArrayList term618 = new ArrayList();
        ((ArrayList) term618).add((Object)null);
        ((ArrayList) term618).add((Object)null);
        ((ArrayList) term618).add((Object)null);
        ((ArrayList) term618).add((Object)null);
        ((ArrayList) term618).add((Object)null);
        ((ArrayList) term618).add((Object)null);
        Object term612 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term612, term612.getClass(), "id", term613);
        setField(term612, term612.getClass(), "users", term615);
        setField(term612, term612.getClass(), "privileges", term618);
        setField(term612, term612.getClass(), "name", "");
        Long term623 = new Long(-2068172595987555756L);
        ArrayList term625 = new ArrayList();
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ArrayList term628 = new ArrayList();
        ((ArrayList) term628).add((Object)null);
        ((ArrayList) term628).add((Object)null);
        ((ArrayList) term628).add((Object)null);
        ((ArrayList) term628).add((Object)null);
        ((ArrayList) term628).add((Object)null);
        ((ArrayList) term628).add((Object)null);
        ((ArrayList) term628).add((Object)null);
        Object term622 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term622, term622.getClass(), "id", term623);
        setField(term622, term622.getClass(), "users", term625);
        setField(term622, term622.getClass(), "privileges", term628);
        setField(term622, term622.getClass(), "name", "");
        ArrayList term600 = new ArrayList();
        ((ArrayList) term600).add(term602);
        ((ArrayList) term600).add(term612);
        ((ArrayList) term600).add(term622);
        Boolean term634 = new Boolean(false);
        term521 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term521, term521.getClass(), "id", term522);
        setField(term521, term521.getClass(), "membername", "GVizqqzXpy");
        setField(term521, term521.getClass(), "email", "JqXGgAhZPl");
        setField(term521, term521.getClass(), "password", "jiKYgYHqIS");
        setField(term521, term521.getClass(), "age", term560);
        setField(term521, term521.getClass(), "phoneNumber", "DfISiziTgG");
        setField(term521, term521.getClass(), "country", "XqgfKFvPSD");
        setField(term521, term521.getClass(), "birthdate", "JiVRgTZvKc");
        setField(term521, term521.getClass(), "enabled", term598);
        setField(term521, term521.getClass(), "roles", term600);
        setField(term521, term521.getClass(), "isUsing2FA", term634);
        setField(term521, term521.getClass(), "secret", "pXOkjyeIRb");
        setIntField(term649, term649.getClass(), "year", 2016);
        setShortField(term649, term649.getClass(), "month", (short) 6);
        setShortField(term649, term649.getClass(), "day", (short) 15);
        setField(term648, term648.getClass(), "date", term649);
        setByteField(term653, term653.getClass(), "hour", (byte) 21);
        setByteField(term653, term653.getClass(), "minute", (byte) 23);
        setByteField(term653, term653.getClass(), "second", (byte) 23);
        setIntField(term653, term653.getClass(), "nano", 433372070);
        setField(term648, term648.getClass(), "time", term653);
        setField(term521, term521.getClass(), "regDate", term648);
        setIntField(term659, term659.getClass(), "year", 2012);
        setShortField(term659, term659.getClass(), "month", (short) 8);
        setShortField(term659, term659.getClass(), "day", (short) 25);
        setField(term658, term658.getClass(), "date", term659);
        setByteField(term663, term663.getClass(), "hour", (byte) 19);
        setByteField(term663, term663.getClass(), "minute", (byte) 49);
        setByteField(term663, term663.getClass(), "second", (byte) 8);
        setIntField(term663, term663.getClass(), "nano", 912685024);
        setField(term658, term658.getClass(), "time", term663);
        setField(term521, term521.getClass(), "modDate", term658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.service.AdmUserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Object[] args = new Object[1];
        args[0] = term521;
        callMethod(klass, "convertToDto", argTypes, null, args);
    }

};


