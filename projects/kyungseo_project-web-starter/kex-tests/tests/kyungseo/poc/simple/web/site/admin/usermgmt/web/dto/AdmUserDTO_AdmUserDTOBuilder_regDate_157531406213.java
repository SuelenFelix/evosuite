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

public class AdmUserDTO_AdmUserDTOBuilder_regDate_157531406213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023;
     Object term3152;

    public AdmUserDTO_AdmUserDTOBuilder_regDate_157531406213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3024 = new Long(-1505191021111100819L);
        Boolean term3062 = new Boolean(false);
        Integer term3064 = new Integer(97029295);
        Boolean term3102 = new Boolean(false);
        ArrayList term3116 = new ArrayList();
        term3023 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        Object term3120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3135 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3023, term3023.getClass(), "id", term3024);
        setField(term3023, term3023.getClass(), "membername", "FftYCNbnks");
        setField(term3023, term3023.getClass(), "email", "lJoltmsadS");
        setField(term3023, term3023.getClass(), "password", "mvfDtZNEHr");
        setField(term3023, term3023.getClass(), "enabled", term3062);
        setField(term3023, term3023.getClass(), "age", term3064);
        setField(term3023, term3023.getClass(), "phoneNumber", "bvSgmFUDOU");
        setField(term3023, term3023.getClass(), "country", "XMHwbfiHRl");
        setField(term3023, term3023.getClass(), "birthdate", "bucTnYicnp");
        setField(term3023, term3023.getClass(), "isUsing2FA", term3102);
        setField(term3023, term3023.getClass(), "secret", "EkgprvqZlM");
        setField(term3023, term3023.getClass(), "roles", term3116);
        setIntField(term3121, term3121.getClass(), "year", 2026);
        setShortField(term3121, term3121.getClass(), "month", (short) 6);
        setShortField(term3121, term3121.getClass(), "day", (short) 13);
        setField(term3120, term3120.getClass(), "date", term3121);
        setByteField(term3125, term3125.getClass(), "hour", (byte) 19);
        setByteField(term3125, term3125.getClass(), "minute", (byte) 23);
        setByteField(term3125, term3125.getClass(), "second", (byte) 46);
        setIntField(term3125, term3125.getClass(), "nano", 67955056);
        setField(term3120, term3120.getClass(), "time", term3125);
        setField(term3023, term3023.getClass(), "regDate", term3120);
        setIntField(term3131, term3131.getClass(), "year", 2013);
        setShortField(term3131, term3131.getClass(), "month", (short) 12);
        setShortField(term3131, term3131.getClass(), "day", (short) 23);
        setField(term3130, term3130.getClass(), "date", term3131);
        setByteField(term3135, term3135.getClass(), "hour", (byte) 1);
        setByteField(term3135, term3135.getClass(), "minute", (byte) 0);
        setByteField(term3135, term3135.getClass(), "second", (byte) 32);
        setIntField(term3135, term3135.getClass(), "nano", 168525686);
        setField(term3130, term3130.getClass(), "time", term3135);
        setField(term3023, term3023.getClass(), "modDate", term3130);
        setField(term3023, term3023.getClass(), "date", "fbnKvthhOz");
        term3152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3157 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3153, term3153.getClass(), "year", 2014);
        setShortField(term3153, term3153.getClass(), "month", (short) 1);
        setShortField(term3153, term3153.getClass(), "day", (short) 26);
        setField(term3152, term3152.getClass(), "date", term3153);
        setByteField(term3157, term3157.getClass(), "hour", (byte) 3);
        setByteField(term3157, term3157.getClass(), "minute", (byte) 31);
        setByteField(term3157, term3157.getClass(), "second", (byte) 56);
        setIntField(term3157, term3157.getClass(), "nano", 100873602);
        setField(term3152, term3152.getClass(), "time", term3157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3152;
        callMethod(klass, "regDate", argTypes, term3023, args);
    }

};


