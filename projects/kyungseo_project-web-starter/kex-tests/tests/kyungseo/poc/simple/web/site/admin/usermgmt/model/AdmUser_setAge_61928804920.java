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

public class AdmUser_setAge_61928804920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4235;
     Object term4372;

    public AdmUser_setAge_61928804920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4236 = new Long(6906379511067694917L);
        Integer term4274 = new Integer(-478195677);
        Boolean term4312 = new Boolean(true);
        Long term4317 = new Long(-9204303423581447271L);
        ArrayList term4319 = new ArrayList();
        ((ArrayList) term4319).add((Object)null);
        ((ArrayList) term4319).add((Object)null);
        ((ArrayList) term4319).add((Object)null);
        ((ArrayList) term4319).add((Object)null);
        ((ArrayList) term4319).add((Object)null);
        ((ArrayList) term4319).add((Object)null);
        ArrayList term4322 = new ArrayList();
        Object term4316 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4316, term4316.getClass(), "id", term4317);
        setField(term4316, term4316.getClass(), "users", term4319);
        setField(term4316, term4316.getClass(), "privileges", term4322);
        setField(term4316, term4316.getClass(), "name", "");
        Long term4327 = new Long(-2986201902216133814L);
        ArrayList term4329 = new ArrayList();
        ((ArrayList) term4329).add((Object)null);
        ((ArrayList) term4329).add((Object)null);
        ((ArrayList) term4329).add((Object)null);
        ((ArrayList) term4329).add((Object)null);
        ((ArrayList) term4329).add((Object)null);
        ((ArrayList) term4329).add((Object)null);
        ArrayList term4332 = new ArrayList();
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        ((ArrayList) term4332).add((Object)null);
        Object term4326 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4326, term4326.getClass(), "id", term4327);
        setField(term4326, term4326.getClass(), "users", term4329);
        setField(term4326, term4326.getClass(), "privileges", term4332);
        setField(term4326, term4326.getClass(), "name", "");
        ArrayList term4314 = new ArrayList();
        ((ArrayList) term4314).add(term4316);
        ((ArrayList) term4314).add(term4326);
        Boolean term4338 = new Boolean(false);
        term4235 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term4352 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4353 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4357 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4367 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4235, term4235.getClass(), "id", term4236);
        setField(term4235, term4235.getClass(), "membername", "rOfPCPHmtJ");
        setField(term4235, term4235.getClass(), "email", "EnmiAvfpJv");
        setField(term4235, term4235.getClass(), "password", "AdYzLPMcwe");
        setField(term4235, term4235.getClass(), "age", term4274);
        setField(term4235, term4235.getClass(), "phoneNumber", "FrTZLybkKk");
        setField(term4235, term4235.getClass(), "country", "FlxVmiMYKP");
        setField(term4235, term4235.getClass(), "birthdate", "fgOpAWlGYN");
        setField(term4235, term4235.getClass(), "enabled", term4312);
        setField(term4235, term4235.getClass(), "roles", term4314);
        setField(term4235, term4235.getClass(), "isUsing2FA", term4338);
        setField(term4235, term4235.getClass(), "secret", "gFUWMydGCU");
        setIntField(term4353, term4353.getClass(), "year", 2023);
        setShortField(term4353, term4353.getClass(), "month", (short) 8);
        setShortField(term4353, term4353.getClass(), "day", (short) 21);
        setField(term4352, term4352.getClass(), "date", term4353);
        setByteField(term4357, term4357.getClass(), "hour", (byte) 10);
        setByteField(term4357, term4357.getClass(), "minute", (byte) 36);
        setByteField(term4357, term4357.getClass(), "second", (byte) 15);
        setIntField(term4357, term4357.getClass(), "nano", 257070204);
        setField(term4352, term4352.getClass(), "time", term4357);
        setField(term4235, term4235.getClass(), "regDate", term4352);
        setIntField(term4363, term4363.getClass(), "year", 2012);
        setShortField(term4363, term4363.getClass(), "month", (short) 12);
        setShortField(term4363, term4363.getClass(), "day", (short) 14);
        setField(term4362, term4362.getClass(), "date", term4363);
        setByteField(term4367, term4367.getClass(), "hour", (byte) 1);
        setByteField(term4367, term4367.getClass(), "minute", (byte) 47);
        setByteField(term4367, term4367.getClass(), "second", (byte) 3);
        setIntField(term4367, term4367.getClass(), "nano", 359751066);
        setField(term4362, term4362.getClass(), "time", term4367);
        setField(term4235, term4235.getClass(), "modDate", term4362);
        term4372 = new Integer(-1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4372;
        callMethod(klass, "setAge", argTypes, term4235, args);
    }

};


