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

public class AdmUser_AdmUserBuilder_toString_7503996916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9940;

    public AdmUser_AdmUserBuilder_toString_7503996916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9941 = new Long(-5850316381591949820L);
        Integer term9979 = new Integer(1152356969);
        Boolean term10017 = new Boolean(true);
        Long term10022 = new Long(5857854340777182167L);
        ArrayList term10024 = new ArrayList();
        ((ArrayList) term10024).add((Object)null);
        ((ArrayList) term10024).add((Object)null);
        ((ArrayList) term10024).add((Object)null);
        ((ArrayList) term10024).add((Object)null);
        ((ArrayList) term10024).add((Object)null);
        ((ArrayList) term10024).add((Object)null);
        ArrayList term10027 = new ArrayList();
        ((ArrayList) term10027).add((Object)null);
        ((ArrayList) term10027).add((Object)null);
        ((ArrayList) term10027).add((Object)null);
        ((ArrayList) term10027).add((Object)null);
        ((ArrayList) term10027).add((Object)null);
        ((ArrayList) term10027).add((Object)null);
        Object term10021 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10021, term10021.getClass(), "id", term10022);
        setField(term10021, term10021.getClass(), "users", term10024);
        setField(term10021, term10021.getClass(), "privileges", term10027);
        setField(term10021, term10021.getClass(), "name", "");
        Long term10032 = new Long(1909175111101717943L);
        ArrayList term10034 = new ArrayList();
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ((ArrayList) term10034).add((Object)null);
        ArrayList term10037 = new ArrayList();
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        Object term10031 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10031, term10031.getClass(), "id", term10032);
        setField(term10031, term10031.getClass(), "users", term10034);
        setField(term10031, term10031.getClass(), "privileges", term10037);
        setField(term10031, term10031.getClass(), "name", "");
        Long term10042 = new Long(-8211240904293846981L);
        ArrayList term10044 = new ArrayList();
        ((ArrayList) term10044).add((Object)null);
        ((ArrayList) term10044).add((Object)null);
        ((ArrayList) term10044).add((Object)null);
        ((ArrayList) term10044).add((Object)null);
        ((ArrayList) term10044).add((Object)null);
        ((ArrayList) term10044).add((Object)null);
        ((ArrayList) term10044).add((Object)null);
        ArrayList term10047 = new ArrayList();
        ((ArrayList) term10047).add((Object)null);
        ((ArrayList) term10047).add((Object)null);
        ((ArrayList) term10047).add((Object)null);
        ((ArrayList) term10047).add((Object)null);
        ((ArrayList) term10047).add((Object)null);
        ((ArrayList) term10047).add((Object)null);
        ((ArrayList) term10047).add((Object)null);
        Object term10041 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10041, term10041.getClass(), "id", term10042);
        setField(term10041, term10041.getClass(), "users", term10044);
        setField(term10041, term10041.getClass(), "privileges", term10047);
        setField(term10041, term10041.getClass(), "name", "");
        ArrayList term10019 = new ArrayList();
        ((ArrayList) term10019).add(term10021);
        ((ArrayList) term10019).add(term10031);
        ((ArrayList) term10019).add(term10041);
        Boolean term10053 = new Boolean(false);
        term9940 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term10067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10072 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10082 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9940, term9940.getClass(), "id", term9941);
        setField(term9940, term9940.getClass(), "membername", "arrHHpXCBD");
        setField(term9940, term9940.getClass(), "email", "zzfzxQYlis");
        setField(term9940, term9940.getClass(), "password", "TJJQwVEzxz");
        setField(term9940, term9940.getClass(), "age", term9979);
        setField(term9940, term9940.getClass(), "phoneNumber", "kHtEHBrsFo");
        setField(term9940, term9940.getClass(), "country", "EmAvkhGlPV");
        setField(term9940, term9940.getClass(), "birthdate", "mBrbyQVzve");
        setField(term9940, term9940.getClass(), "enabled", term10017);
        setField(term9940, term9940.getClass(), "roles", term10019);
        setField(term9940, term9940.getClass(), "isUsing2FA", term10053);
        setField(term9940, term9940.getClass(), "secret", "aftnGRjhKN");
        setIntField(term10068, term10068.getClass(), "year", 2026);
        setShortField(term10068, term10068.getClass(), "month", (short) 9);
        setShortField(term10068, term10068.getClass(), "day", (short) 22);
        setField(term10067, term10067.getClass(), "date", term10068);
        setByteField(term10072, term10072.getClass(), "hour", (byte) 22);
        setByteField(term10072, term10072.getClass(), "minute", (byte) 25);
        setByteField(term10072, term10072.getClass(), "second", (byte) 25);
        setIntField(term10072, term10072.getClass(), "nano", 526433618);
        setField(term10067, term10067.getClass(), "time", term10072);
        setField(term9940, term9940.getClass(), "regDate", term10067);
        setIntField(term10078, term10078.getClass(), "year", 2017);
        setShortField(term10078, term10078.getClass(), "month", (short) 8);
        setShortField(term10078, term10078.getClass(), "day", (short) 11);
        setField(term10077, term10077.getClass(), "date", term10078);
        setByteField(term10082, term10082.getClass(), "hour", (byte) 0);
        setByteField(term10082, term10082.getClass(), "minute", (byte) 12);
        setByteField(term10082, term10082.getClass(), "second", (byte) 8);
        setIntField(term10082, term10082.getClass(), "nano", 421599135);
        setField(term10077, term10077.getClass(), "time", term10082);
        setField(term9940, term9940.getClass(), "modDate", term10077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9940, args);
    }

};


