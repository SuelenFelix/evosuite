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

public class AdmUser_getModDate_156885943915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3072;

    public AdmUser_getModDate_156885943915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3073 = new Long(-1505191021111100819L);
        Integer term3111 = new Integer(97029295);
        Boolean term3149 = new Boolean(false);
        Long term3154 = new Long(-1000830646340880796L);
        ArrayList term3156 = new ArrayList();
        ArrayList term3159 = new ArrayList();
        ((ArrayList) term3159).add((Object)null);
        ((ArrayList) term3159).add((Object)null);
        ((ArrayList) term3159).add((Object)null);
        ((ArrayList) term3159).add((Object)null);
        ((ArrayList) term3159).add((Object)null);
        ((ArrayList) term3159).add((Object)null);
        Object term3153 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3153, term3153.getClass(), "id", term3154);
        setField(term3153, term3153.getClass(), "users", term3156);
        setField(term3153, term3153.getClass(), "privileges", term3159);
        setField(term3153, term3153.getClass(), "name", "");
        ArrayList term3151 = new ArrayList();
        ((ArrayList) term3151).add(term3153);
        Boolean term3165 = new Boolean(false);
        term3072 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        Object term3179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3194 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3072, term3072.getClass(), "id", term3073);
        setField(term3072, term3072.getClass(), "membername", "lbmSGBwIiV");
        setField(term3072, term3072.getClass(), "email", "DAxyHoTLzZ");
        setField(term3072, term3072.getClass(), "password", "fhZgTouhCC");
        setField(term3072, term3072.getClass(), "age", term3111);
        setField(term3072, term3072.getClass(), "phoneNumber", "wrikqJwXvL");
        setField(term3072, term3072.getClass(), "country", "UiWhvbypdr");
        setField(term3072, term3072.getClass(), "birthdate", "CgleElJNje");
        setField(term3072, term3072.getClass(), "enabled", term3149);
        setField(term3072, term3072.getClass(), "roles", term3151);
        setField(term3072, term3072.getClass(), "isUsing2FA", term3165);
        setField(term3072, term3072.getClass(), "secret", "awDQVEVIKi");
        setIntField(term3180, term3180.getClass(), "year", 2014);
        setShortField(term3180, term3180.getClass(), "month", (short) 5);
        setShortField(term3180, term3180.getClass(), "day", (short) 31);
        setField(term3179, term3179.getClass(), "date", term3180);
        setByteField(term3184, term3184.getClass(), "hour", (byte) 16);
        setByteField(term3184, term3184.getClass(), "minute", (byte) 3);
        setByteField(term3184, term3184.getClass(), "second", (byte) 14);
        setIntField(term3184, term3184.getClass(), "nano", 281059649);
        setField(term3179, term3179.getClass(), "time", term3184);
        setField(term3072, term3072.getClass(), "regDate", term3179);
        setIntField(term3190, term3190.getClass(), "year", 2010);
        setShortField(term3190, term3190.getClass(), "month", (short) 12);
        setShortField(term3190, term3190.getClass(), "day", (short) 30);
        setField(term3189, term3189.getClass(), "date", term3190);
        setByteField(term3194, term3194.getClass(), "hour", (byte) 17);
        setByteField(term3194, term3194.getClass(), "minute", (byte) 44);
        setByteField(term3194, term3194.getClass(), "second", (byte) 59);
        setIntField(term3194, term3194.getClass(), "nano", 881407895);
        setField(term3189, term3189.getClass(), "time", term3194);
        setField(term3072, term3072.getClass(), "modDate", term3189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModDate", argTypes, term3072, args);
    }

};


