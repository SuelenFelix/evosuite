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

public class AdmUser_setEmail_82648552118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3797;

    public AdmUser_setEmail_82648552118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3798 = new Long(-4867941246533901410L);
        Integer term3836 = new Integer(335112684);
        Boolean term3874 = new Boolean(true);
        Long term3879 = new Long(1044883697493326351L);
        ArrayList term3881 = new ArrayList();
        ((ArrayList) term3881).add((Object)null);
        ArrayList term3884 = new ArrayList();
        ((ArrayList) term3884).add((Object)null);
        ((ArrayList) term3884).add((Object)null);
        ((ArrayList) term3884).add((Object)null);
        ((ArrayList) term3884).add((Object)null);
        ((ArrayList) term3884).add((Object)null);
        Object term3878 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3878, term3878.getClass(), "id", term3879);
        setField(term3878, term3878.getClass(), "users", term3881);
        setField(term3878, term3878.getClass(), "privileges", term3884);
        setField(term3878, term3878.getClass(), "name", "");
        Long term3889 = new Long(1860789353508856614L);
        ArrayList term3891 = new ArrayList();
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ((ArrayList) term3891).add((Object)null);
        ArrayList term3894 = new ArrayList();
        ((ArrayList) term3894).add((Object)null);
        ((ArrayList) term3894).add((Object)null);
        ((ArrayList) term3894).add((Object)null);
        Object term3888 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3888, term3888.getClass(), "id", term3889);
        setField(term3888, term3888.getClass(), "users", term3891);
        setField(term3888, term3888.getClass(), "privileges", term3894);
        setField(term3888, term3888.getClass(), "name", "");
        ArrayList term3876 = new ArrayList();
        ((ArrayList) term3876).add(term3878);
        ((ArrayList) term3876).add(term3888);
        Boolean term3900 = new Boolean(false);
        term3797 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term3914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3929 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3797, term3797.getClass(), "id", term3798);
        setField(term3797, term3797.getClass(), "membername", "POPYycoDBy");
        setField(term3797, term3797.getClass(), "email", "LuWMOXdAPA");
        setField(term3797, term3797.getClass(), "password", "blSffTnsOv");
        setField(term3797, term3797.getClass(), "age", term3836);
        setField(term3797, term3797.getClass(), "phoneNumber", "qbUMcIvEXH");
        setField(term3797, term3797.getClass(), "country", "TVxGTjeDcu");
        setField(term3797, term3797.getClass(), "birthdate", "ABPtcyCzkR");
        setField(term3797, term3797.getClass(), "enabled", term3874);
        setField(term3797, term3797.getClass(), "roles", term3876);
        setField(term3797, term3797.getClass(), "isUsing2FA", term3900);
        setField(term3797, term3797.getClass(), "secret", "pqFUMTCKJd");
        setIntField(term3915, term3915.getClass(), "year", 2023);
        setShortField(term3915, term3915.getClass(), "month", (short) 7);
        setShortField(term3915, term3915.getClass(), "day", (short) 27);
        setField(term3914, term3914.getClass(), "date", term3915);
        setByteField(term3919, term3919.getClass(), "hour", (byte) 4);
        setByteField(term3919, term3919.getClass(), "minute", (byte) 25);
        setByteField(term3919, term3919.getClass(), "second", (byte) 46);
        setIntField(term3919, term3919.getClass(), "nano", 646465452);
        setField(term3914, term3914.getClass(), "time", term3919);
        setField(term3797, term3797.getClass(), "regDate", term3914);
        setIntField(term3925, term3925.getClass(), "year", 2022);
        setShortField(term3925, term3925.getClass(), "month", (short) 11);
        setShortField(term3925, term3925.getClass(), "day", (short) 2);
        setField(term3924, term3924.getClass(), "date", term3925);
        setByteField(term3929, term3929.getClass(), "hour", (byte) 4);
        setByteField(term3929, term3929.getClass(), "minute", (byte) 14);
        setByteField(term3929, term3929.getClass(), "second", (byte) 5);
        setIntField(term3929, term3929.getClass(), "nano", 604465127);
        setField(term3924, term3924.getClass(), "time", term3929);
        setField(term3797, term3797.getClass(), "modDate", term3924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PTEndmPMzk";
        callMethod(klass, "setEmail", argTypes, term3797, args);
    }

};


