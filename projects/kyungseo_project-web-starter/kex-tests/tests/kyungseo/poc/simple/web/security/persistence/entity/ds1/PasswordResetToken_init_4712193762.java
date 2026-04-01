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

public class PasswordResetToken_init_4712193762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13541;

    public PasswordResetToken_init_4712193762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13542 = new Long(-2937192447508714837L);
        Boolean term13580 = new Boolean(false);
        Integer term13582 = new Integer(1901317214);
        Long term13623 = new Long(3804352102719959988L);
        ArrayList term13625 = new ArrayList();
        ((ArrayList) term13625).add((Object)null);
        ((ArrayList) term13625).add((Object)null);
        ((ArrayList) term13625).add((Object)null);
        ((ArrayList) term13625).add((Object)null);
        ((ArrayList) term13625).add((Object)null);
        ((ArrayList) term13625).add((Object)null);
        ArrayList term13628 = new ArrayList();
        ((ArrayList) term13628).add((Object)null);
        ((ArrayList) term13628).add((Object)null);
        ((ArrayList) term13628).add((Object)null);
        Object term13622 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term13622, term13622.getClass(), "id", term13623);
        setField(term13622, term13622.getClass(), "users", term13625);
        setField(term13622, term13622.getClass(), "privileges", term13628);
        setField(term13622, term13622.getClass(), "name", "");
        ArrayList term13620 = new ArrayList();
        ((ArrayList) term13620).add(term13622);
        term13541 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term13647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13652 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13662 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13541, term13541.getClass(), "id", term13542);
        setField(term13541, term13541.getClass(), "membername", "eUhEGNLBOk");
        setField(term13541, term13541.getClass(), "email", "UrLisdyvVs");
        setField(term13541, term13541.getClass(), "password", "VckRXyiShh");
        setField(term13541, term13541.getClass(), "enabled", term13580);
        setField(term13541, term13541.getClass(), "age", term13582);
        setField(term13541, term13541.getClass(), "phoneNumber", "ZKwDTklKHb");
        setField(term13541, term13541.getClass(), "country", "tQMlnMStsQ");
        setField(term13541, term13541.getClass(), "birthdate", "OYJvKAMFEk");
        setField(term13541, term13541.getClass(), "roles", term13620);
        setBooleanField(term13541, term13541.getClass(), "isUsing2FA", true);
        setField(term13541, term13541.getClass(), "secret", "JraVClZLWB");
        setIntField(term13648, term13648.getClass(), "year", 2024);
        setShortField(term13648, term13648.getClass(), "month", (short) 1);
        setShortField(term13648, term13648.getClass(), "day", (short) 9);
        setField(term13647, term13647.getClass(), "date", term13648);
        setByteField(term13652, term13652.getClass(), "hour", (byte) 16);
        setByteField(term13652, term13652.getClass(), "minute", (byte) 51);
        setByteField(term13652, term13652.getClass(), "second", (byte) 43);
        setIntField(term13652, term13652.getClass(), "nano", 661225347);
        setField(term13647, term13647.getClass(), "time", term13652);
        setField(term13541, term13541.getClass(), "regDate", term13647);
        setIntField(term13658, term13658.getClass(), "year", 2014);
        setShortField(term13658, term13658.getClass(), "month", (short) 6);
        setShortField(term13658, term13658.getClass(), "day", (short) 7);
        setField(term13657, term13657.getClass(), "date", term13658);
        setByteField(term13662, term13662.getClass(), "hour", (byte) 23);
        setByteField(term13662, term13662.getClass(), "minute", (byte) 34);
        setByteField(term13662, term13662.getClass(), "second", (byte) 36);
        setIntField(term13662, term13662.getClass(), "nano", 967981946);
        setField(term13657, term13657.getClass(), "time", term13662);
        setField(term13541, term13541.getClass(), "modDate", term13657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Object[] args = new Object[2];
        args[0] = "TUBgEnrcjn";
        args[1] = term13541;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


