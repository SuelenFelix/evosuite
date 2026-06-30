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

public class AdmUser_AdmUserBuilder_secret_200421431612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9090;

    public AdmUser_AdmUserBuilder_secret_200421431612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9091 = new Long(3951346165629352117L);
        Integer term9129 = new Integer(-1239406390);
        Boolean term9167 = new Boolean(false);
        Long term9172 = new Long(-4187265590402169996L);
        ArrayList term9174 = new ArrayList();
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ArrayList term9177 = new ArrayList();
        ((ArrayList) term9177).add((Object)null);
        ((ArrayList) term9177).add((Object)null);
        ((ArrayList) term9177).add((Object)null);
        ((ArrayList) term9177).add((Object)null);
        ((ArrayList) term9177).add((Object)null);
        ((ArrayList) term9177).add((Object)null);
        Object term9171 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9171, term9171.getClass(), "id", term9172);
        setField(term9171, term9171.getClass(), "users", term9174);
        setField(term9171, term9171.getClass(), "privileges", term9177);
        setField(term9171, term9171.getClass(), "name", "");
        ArrayList term9169 = new ArrayList();
        ((ArrayList) term9169).add(term9171);
        Boolean term9183 = new Boolean(false);
        term9090 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term9197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9212 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9090, term9090.getClass(), "id", term9091);
        setField(term9090, term9090.getClass(), "membername", "XMhUDGKSWO");
        setField(term9090, term9090.getClass(), "email", "jLgzxtuvVo");
        setField(term9090, term9090.getClass(), "password", "wmmxjOkPnH");
        setField(term9090, term9090.getClass(), "age", term9129);
        setField(term9090, term9090.getClass(), "phoneNumber", "jgRohUQWxJ");
        setField(term9090, term9090.getClass(), "country", "CJlAiZDIQO");
        setField(term9090, term9090.getClass(), "birthdate", "osgWaTBVoE");
        setField(term9090, term9090.getClass(), "enabled", term9167);
        setField(term9090, term9090.getClass(), "roles", term9169);
        setField(term9090, term9090.getClass(), "isUsing2FA", term9183);
        setField(term9090, term9090.getClass(), "secret", "vsqwOLpDjj");
        setIntField(term9198, term9198.getClass(), "year", 2024);
        setShortField(term9198, term9198.getClass(), "month", (short) 11);
        setShortField(term9198, term9198.getClass(), "day", (short) 16);
        setField(term9197, term9197.getClass(), "date", term9198);
        setByteField(term9202, term9202.getClass(), "hour", (byte) 23);
        setByteField(term9202, term9202.getClass(), "minute", (byte) 40);
        setByteField(term9202, term9202.getClass(), "second", (byte) 40);
        setIntField(term9202, term9202.getClass(), "nano", 810133212);
        setField(term9197, term9197.getClass(), "time", term9202);
        setField(term9090, term9090.getClass(), "regDate", term9197);
        setIntField(term9208, term9208.getClass(), "year", 2018);
        setShortField(term9208, term9208.getClass(), "month", (short) 5);
        setShortField(term9208, term9208.getClass(), "day", (short) 15);
        setField(term9207, term9207.getClass(), "date", term9208);
        setByteField(term9212, term9212.getClass(), "hour", (byte) 17);
        setByteField(term9212, term9212.getClass(), "minute", (byte) 19);
        setByteField(term9212, term9212.getClass(), "second", (byte) 28);
        setIntField(term9212, term9212.getClass(), "nano", 153049369);
        setField(term9207, term9207.getClass(), "time", term9212);
        setField(term9090, term9090.getClass(), "modDate", term9207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rJgXQRsPCl";
        callMethod(klass, "secret", argTypes, term9090, args);
    }

};


