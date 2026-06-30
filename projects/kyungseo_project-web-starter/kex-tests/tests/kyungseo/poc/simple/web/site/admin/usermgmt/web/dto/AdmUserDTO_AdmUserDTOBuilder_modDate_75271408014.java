package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class AdmUserDTO_AdmUserDTOBuilder_modDate_75271408014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;
     Object term3381;

    public AdmUserDTO_AdmUserDTOBuilder_modDate_75271408014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3243 = new Long(-1000830646340880796L);
        Boolean term3281 = new Boolean(true);
        Integer term3283 = new Integer(-1371869594);
        Boolean term3321 = new Boolean(false);
        Long term3338 = new Long(5973526439563541711L);
        ArrayList term3340 = new ArrayList();
        ArrayList term3343 = new ArrayList();
        ((ArrayList) term3343).add((Object)null);
        ((ArrayList) term3343).add((Object)null);
        ((ArrayList) term3343).add((Object)null);
        ((ArrayList) term3343).add((Object)null);
        ((ArrayList) term3343).add((Object)null);
        ((ArrayList) term3343).add((Object)null);
        Object term3337 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3337, term3337.getClass(), "id", term3338);
        setField(term3337, term3337.getClass(), "users", term3340);
        setField(term3337, term3337.getClass(), "privileges", term3343);
        setField(term3337, term3337.getClass(), "name", "");
        ArrayList term3335 = new ArrayList();
        ((ArrayList) term3335).add(term3337);
        term3242 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        Object term3349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3354 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3364 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3242, term3242.getClass(), "id", term3243);
        setField(term3242, term3242.getClass(), "membername", "PGfCDJTBek");
        setField(term3242, term3242.getClass(), "email", "ZwjARhAtHC");
        setField(term3242, term3242.getClass(), "password", "XXvscsYBWv");
        setField(term3242, term3242.getClass(), "enabled", term3281);
        setField(term3242, term3242.getClass(), "age", term3283);
        setField(term3242, term3242.getClass(), "phoneNumber", "uePedtiAfL");
        setField(term3242, term3242.getClass(), "country", "AdSHvysxQB");
        setField(term3242, term3242.getClass(), "birthdate", "jlraKkBWFA");
        setField(term3242, term3242.getClass(), "isUsing2FA", term3321);
        setField(term3242, term3242.getClass(), "secret", "mRBtFTxVdE");
        setField(term3242, term3242.getClass(), "roles", term3335);
        setIntField(term3350, term3350.getClass(), "year", 2010);
        setShortField(term3350, term3350.getClass(), "month", (short) 12);
        setShortField(term3350, term3350.getClass(), "day", (short) 30);
        setField(term3349, term3349.getClass(), "date", term3350);
        setByteField(term3354, term3354.getClass(), "hour", (byte) 17);
        setByteField(term3354, term3354.getClass(), "minute", (byte) 44);
        setByteField(term3354, term3354.getClass(), "second", (byte) 59);
        setIntField(term3354, term3354.getClass(), "nano", 881407895);
        setField(term3349, term3349.getClass(), "time", term3354);
        setField(term3242, term3242.getClass(), "regDate", term3349);
        setIntField(term3360, term3360.getClass(), "year", 2019);
        setShortField(term3360, term3360.getClass(), "month", (short) 6);
        setShortField(term3360, term3360.getClass(), "day", (short) 12);
        setField(term3359, term3359.getClass(), "date", term3360);
        setByteField(term3364, term3364.getClass(), "hour", (byte) 5);
        setByteField(term3364, term3364.getClass(), "minute", (byte) 13);
        setByteField(term3364, term3364.getClass(), "second", (byte) 8);
        setIntField(term3364, term3364.getClass(), "nano", 838117658);
        setField(term3359, term3359.getClass(), "time", term3364);
        setField(term3242, term3242.getClass(), "modDate", term3359);
        setField(term3242, term3242.getClass(), "date", "xmzSoVgiED");
        term3381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3386 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3382, term3382.getClass(), "year", 2014);
        setShortField(term3382, term3382.getClass(), "month", (short) 8);
        setShortField(term3382, term3382.getClass(), "day", (short) 13);
        setField(term3381, term3381.getClass(), "date", term3382);
        setByteField(term3386, term3386.getClass(), "hour", (byte) 13);
        setByteField(term3386, term3386.getClass(), "minute", (byte) 15);
        setByteField(term3386, term3386.getClass(), "second", (byte) 51);
        setIntField(term3386, term3386.getClass(), "nano", 433726678);
        setField(term3381, term3381.getClass(), "time", term3386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3381;
        callMethod(klass, "modDate", argTypes, term3242, args);
    }

};


