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

public class AdmUser_getRegDate_39807971514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2885;

    public AdmUser_getRegDate_39807971514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2886 = new Long(-433040798405298080L);
        Integer term2924 = new Integer(1596070772);
        Boolean term2962 = new Boolean(false);
        ArrayList term2964 = new ArrayList();
        Boolean term2968 = new Boolean(false);
        term2885 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term2982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2997 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2885, term2885.getClass(), "id", term2886);
        setField(term2885, term2885.getClass(), "membername", "nrQjODRMLD");
        setField(term2885, term2885.getClass(), "email", "PNoWXrsFic");
        setField(term2885, term2885.getClass(), "password", "QZBHZqZope");
        setField(term2885, term2885.getClass(), "age", term2924);
        setField(term2885, term2885.getClass(), "phoneNumber", "VBUahCvyxC");
        setField(term2885, term2885.getClass(), "country", "MlzTkzKMCX");
        setField(term2885, term2885.getClass(), "birthdate", "UqKUbMyPMJ");
        setField(term2885, term2885.getClass(), "enabled", term2962);
        setField(term2885, term2885.getClass(), "roles", term2964);
        setField(term2885, term2885.getClass(), "isUsing2FA", term2968);
        setField(term2885, term2885.getClass(), "secret", "QpYltHAdyY");
        setIntField(term2983, term2983.getClass(), "year", 2026);
        setShortField(term2983, term2983.getClass(), "month", (short) 6);
        setShortField(term2983, term2983.getClass(), "day", (short) 13);
        setField(term2982, term2982.getClass(), "date", term2983);
        setByteField(term2987, term2987.getClass(), "hour", (byte) 19);
        setByteField(term2987, term2987.getClass(), "minute", (byte) 23);
        setByteField(term2987, term2987.getClass(), "second", (byte) 46);
        setIntField(term2987, term2987.getClass(), "nano", 67955056);
        setField(term2982, term2982.getClass(), "time", term2987);
        setField(term2885, term2885.getClass(), "regDate", term2982);
        setIntField(term2993, term2993.getClass(), "year", 2013);
        setShortField(term2993, term2993.getClass(), "month", (short) 12);
        setShortField(term2993, term2993.getClass(), "day", (short) 23);
        setField(term2992, term2992.getClass(), "date", term2993);
        setByteField(term2997, term2997.getClass(), "hour", (byte) 1);
        setByteField(term2997, term2997.getClass(), "minute", (byte) 0);
        setByteField(term2997, term2997.getClass(), "second", (byte) 32);
        setIntField(term2997, term2997.getClass(), "nano", 168525686);
        setField(term2992, term2992.getClass(), "time", term2997);
        setField(term2885, term2885.getClass(), "modDate", term2992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegDate", argTypes, term2885, args);
    }

};


