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

public class AdmUser_setSecret_186883727127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5680;

    public AdmUser_setSecret_186883727127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5681 = new Long(3472971833455746664L);
        Integer term5719 = new Integer(691577392);
        Boolean term5757 = new Boolean(false);
        ArrayList term5759 = new ArrayList();
        Boolean term5763 = new Boolean(true);
        term5680 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term5777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5792 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5680, term5680.getClass(), "id", term5681);
        setField(term5680, term5680.getClass(), "membername", "ZiMAmqpbzk");
        setField(term5680, term5680.getClass(), "email", "UwJtBPAtSU");
        setField(term5680, term5680.getClass(), "password", "nBaMiSdFmS");
        setField(term5680, term5680.getClass(), "age", term5719);
        setField(term5680, term5680.getClass(), "phoneNumber", "ezwGsjqTai");
        setField(term5680, term5680.getClass(), "country", "ngeHWMRjnn");
        setField(term5680, term5680.getClass(), "birthdate", "FOKfDXQxMM");
        setField(term5680, term5680.getClass(), "enabled", term5757);
        setField(term5680, term5680.getClass(), "roles", term5759);
        setField(term5680, term5680.getClass(), "isUsing2FA", term5763);
        setField(term5680, term5680.getClass(), "secret", "gbxMvhrWpA");
        setIntField(term5778, term5778.getClass(), "year", 2028);
        setShortField(term5778, term5778.getClass(), "month", (short) 12);
        setShortField(term5778, term5778.getClass(), "day", (short) 2);
        setField(term5777, term5777.getClass(), "date", term5778);
        setByteField(term5782, term5782.getClass(), "hour", (byte) 18);
        setByteField(term5782, term5782.getClass(), "minute", (byte) 6);
        setByteField(term5782, term5782.getClass(), "second", (byte) 45);
        setIntField(term5782, term5782.getClass(), "nano", 967474945);
        setField(term5777, term5777.getClass(), "time", term5782);
        setField(term5680, term5680.getClass(), "regDate", term5777);
        setIntField(term5788, term5788.getClass(), "year", 2018);
        setShortField(term5788, term5788.getClass(), "month", (short) 11);
        setShortField(term5788, term5788.getClass(), "day", (short) 11);
        setField(term5787, term5787.getClass(), "date", term5788);
        setByteField(term5792, term5792.getClass(), "hour", (byte) 11);
        setByteField(term5792, term5792.getClass(), "minute", (byte) 30);
        setByteField(term5792, term5792.getClass(), "second", (byte) 33);
        setIntField(term5792, term5792.getClass(), "nano", 101261443);
        setField(term5787, term5787.getClass(), "time", term5792);
        setField(term5680, term5680.getClass(), "modDate", term5787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "huNTIobUHx";
        callMethod(klass, "setSecret", argTypes, term5680, args);
    }

};


