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

public class AdmUser_getEmail_12501539374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;

    public AdmUser_getEmail_12501539374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term476 = new Long(6855071767938501807L);
        Integer term514 = new Integer(1725571209);
        Boolean term552 = new Boolean(false);
        Long term557 = new Long(-5892135042702373494L);
        ArrayList term559 = new ArrayList();
        ((ArrayList) term559).add((Object)null);
        ((ArrayList) term559).add((Object)null);
        ((ArrayList) term559).add((Object)null);
        ((ArrayList) term559).add((Object)null);
        ArrayList term562 = new ArrayList();
        ((ArrayList) term562).add((Object)null);
        Object term556 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term556, term556.getClass(), "id", term557);
        setField(term556, term556.getClass(), "users", term559);
        setField(term556, term556.getClass(), "privileges", term562);
        setField(term556, term556.getClass(), "name", "");
        Long term567 = new Long(-7612550318181586304L);
        ArrayList term569 = new ArrayList();
        ArrayList term572 = new ArrayList();
        ((ArrayList) term572).add((Object)null);
        ((ArrayList) term572).add((Object)null);
        ((ArrayList) term572).add((Object)null);
        ((ArrayList) term572).add((Object)null);
        ((ArrayList) term572).add((Object)null);
        ((ArrayList) term572).add((Object)null);
        Object term566 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term566, term566.getClass(), "id", term567);
        setField(term566, term566.getClass(), "users", term569);
        setField(term566, term566.getClass(), "privileges", term572);
        setField(term566, term566.getClass(), "name", "");
        Long term577 = new Long(-2068172595987555756L);
        ArrayList term579 = new ArrayList();
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ((ArrayList) term579).add((Object)null);
        ArrayList term582 = new ArrayList();
        ((ArrayList) term582).add((Object)null);
        ((ArrayList) term582).add((Object)null);
        ((ArrayList) term582).add((Object)null);
        ((ArrayList) term582).add((Object)null);
        ((ArrayList) term582).add((Object)null);
        ((ArrayList) term582).add((Object)null);
        ((ArrayList) term582).add((Object)null);
        Object term576 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term576, term576.getClass(), "id", term577);
        setField(term576, term576.getClass(), "users", term579);
        setField(term576, term576.getClass(), "privileges", term582);
        setField(term576, term576.getClass(), "name", "");
        ArrayList term554 = new ArrayList();
        ((ArrayList) term554).add(term556);
        ((ArrayList) term554).add(term566);
        ((ArrayList) term554).add(term576);
        Boolean term588 = new Boolean(false);
        term475 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term607 = newInstance(Class.forName("java.time.LocalTime"));
        Object term612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term617 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term475, term475.getClass(), "id", term476);
        setField(term475, term475.getClass(), "membername", "swZVeJAxjt");
        setField(term475, term475.getClass(), "email", "xOcJIiQQDu");
        setField(term475, term475.getClass(), "password", "GVizqqzXpy");
        setField(term475, term475.getClass(), "age", term514);
        setField(term475, term475.getClass(), "phoneNumber", "JqXGgAhZPl");
        setField(term475, term475.getClass(), "country", "jiKYgYHqIS");
        setField(term475, term475.getClass(), "birthdate", "DfISiziTgG");
        setField(term475, term475.getClass(), "enabled", term552);
        setField(term475, term475.getClass(), "roles", term554);
        setField(term475, term475.getClass(), "isUsing2FA", term588);
        setField(term475, term475.getClass(), "secret", "yVMkkQhvmN");
        setIntField(term603, term603.getClass(), "year", 2016);
        setShortField(term603, term603.getClass(), "month", (short) 6);
        setShortField(term603, term603.getClass(), "day", (short) 15);
        setField(term602, term602.getClass(), "date", term603);
        setByteField(term607, term607.getClass(), "hour", (byte) 21);
        setByteField(term607, term607.getClass(), "minute", (byte) 23);
        setByteField(term607, term607.getClass(), "second", (byte) 23);
        setIntField(term607, term607.getClass(), "nano", 433372070);
        setField(term602, term602.getClass(), "time", term607);
        setField(term475, term475.getClass(), "regDate", term602);
        setIntField(term613, term613.getClass(), "year", 2012);
        setShortField(term613, term613.getClass(), "month", (short) 8);
        setShortField(term613, term613.getClass(), "day", (short) 25);
        setField(term612, term612.getClass(), "date", term613);
        setByteField(term617, term617.getClass(), "hour", (byte) 19);
        setByteField(term617, term617.getClass(), "minute", (byte) 49);
        setByteField(term617, term617.getClass(), "second", (byte) 8);
        setIntField(term617, term617.getClass(), "nano", 912685024);
        setField(term612, term612.getClass(), "time", term617);
        setField(term475, term475.getClass(), "modDate", term612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term475, args);
    }

};


