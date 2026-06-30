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

public class AdmUserDTO_getBirthdate_12712569449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6268;

    public AdmUserDTO_getBirthdate_12712569449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6269 = new Long(3472971833455746664L);
        Boolean term6307 = new Boolean(false);
        Integer term6309 = new Integer(691577392);
        Boolean term6347 = new Boolean(true);
        ArrayList term6361 = new ArrayList();
        term6268 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term6365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6380 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6268, term6268.getClass(), "id", term6269);
        setField(term6268, term6268.getClass(), "membername", "dPHtrzKWgf");
        setField(term6268, term6268.getClass(), "email", "olmFxfIVeh");
        setField(term6268, term6268.getClass(), "password", "iSPirUEhXs");
        setField(term6268, term6268.getClass(), "enabled", term6307);
        setField(term6268, term6268.getClass(), "age", term6309);
        setField(term6268, term6268.getClass(), "phoneNumber", "WWyLFmYpAy");
        setField(term6268, term6268.getClass(), "country", "vbSWeJWOQh");
        setField(term6268, term6268.getClass(), "birthdate", "hyvFdAvkOr");
        setField(term6268, term6268.getClass(), "isUsing2FA", term6347);
        setField(term6268, term6268.getClass(), "secret", "ewbQRtustW");
        setField(term6268, term6268.getClass(), "roles", term6361);
        setIntField(term6366, term6366.getClass(), "year", 2020);
        setShortField(term6366, term6366.getClass(), "month", (short) 1);
        setShortField(term6366, term6366.getClass(), "day", (short) 23);
        setField(term6365, term6365.getClass(), "date", term6366);
        setByteField(term6370, term6370.getClass(), "hour", (byte) 17);
        setByteField(term6370, term6370.getClass(), "minute", (byte) 24);
        setByteField(term6370, term6370.getClass(), "second", (byte) 54);
        setIntField(term6370, term6370.getClass(), "nano", 261767355);
        setField(term6365, term6365.getClass(), "time", term6370);
        setField(term6268, term6268.getClass(), "regDate", term6365);
        setIntField(term6376, term6376.getClass(), "year", 2011);
        setShortField(term6376, term6376.getClass(), "month", (short) 1);
        setShortField(term6376, term6376.getClass(), "day", (short) 20);
        setField(term6375, term6375.getClass(), "date", term6376);
        setByteField(term6380, term6380.getClass(), "hour", (byte) 5);
        setByteField(term6380, term6380.getClass(), "minute", (byte) 23);
        setByteField(term6380, term6380.getClass(), "second", (byte) 54);
        setIntField(term6380, term6380.getClass(), "nano", 4207750);
        setField(term6375, term6375.getClass(), "time", term6380);
        setField(term6268, term6268.getClass(), "modDate", term6375);
        setField(term6268, term6268.getClass(), "date", "cABEHYBnys");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthdate", argTypes, term6268, args);
    }

};


