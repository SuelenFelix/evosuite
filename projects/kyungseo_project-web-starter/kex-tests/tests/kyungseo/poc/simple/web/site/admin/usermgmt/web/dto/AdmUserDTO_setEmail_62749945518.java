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

public class AdmUserDTO_setEmail_62749945518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8583;

    public AdmUserDTO_setEmail_62749945518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8584 = new Long(1950957495500453461L);
        Boolean term8622 = new Boolean(false);
        Integer term8624 = new Integer(-1498296052);
        Boolean term8662 = new Boolean(false);
        ArrayList term8676 = new ArrayList();
        term8583 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term8680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8685 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8695 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8583, term8583.getClass(), "id", term8584);
        setField(term8583, term8583.getClass(), "membername", "XxILklSDwz");
        setField(term8583, term8583.getClass(), "email", "TLjhFZbwKO");
        setField(term8583, term8583.getClass(), "password", "nxEbLIApFc");
        setField(term8583, term8583.getClass(), "enabled", term8622);
        setField(term8583, term8583.getClass(), "age", term8624);
        setField(term8583, term8583.getClass(), "phoneNumber", "zzsdNZhejE");
        setField(term8583, term8583.getClass(), "country", "ILoodMZrgR");
        setField(term8583, term8583.getClass(), "birthdate", "XQiKmsCacK");
        setField(term8583, term8583.getClass(), "isUsing2FA", term8662);
        setField(term8583, term8583.getClass(), "secret", "cTCixEbHYT");
        setField(term8583, term8583.getClass(), "roles", term8676);
        setIntField(term8681, term8681.getClass(), "year", 2025);
        setShortField(term8681, term8681.getClass(), "month", (short) 4);
        setShortField(term8681, term8681.getClass(), "day", (short) 6);
        setField(term8680, term8680.getClass(), "date", term8681);
        setByteField(term8685, term8685.getClass(), "hour", (byte) 23);
        setByteField(term8685, term8685.getClass(), "minute", (byte) 17);
        setByteField(term8685, term8685.getClass(), "second", (byte) 11);
        setIntField(term8685, term8685.getClass(), "nano", 928165672);
        setField(term8680, term8680.getClass(), "time", term8685);
        setField(term8583, term8583.getClass(), "regDate", term8680);
        setIntField(term8691, term8691.getClass(), "year", 2022);
        setShortField(term8691, term8691.getClass(), "month", (short) 3);
        setShortField(term8691, term8691.getClass(), "day", (short) 20);
        setField(term8690, term8690.getClass(), "date", term8691);
        setByteField(term8695, term8695.getClass(), "hour", (byte) 20);
        setByteField(term8695, term8695.getClass(), "minute", (byte) 31);
        setByteField(term8695, term8695.getClass(), "second", (byte) 56);
        setIntField(term8695, term8695.getClass(), "nano", 682853702);
        setField(term8690, term8690.getClass(), "time", term8695);
        setField(term8583, term8583.getClass(), "modDate", term8690);
        setField(term8583, term8583.getClass(), "date", "bqKksqtAdT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jAIAdEmULK";
        callMethod(klass, "setEmail", argTypes, term8583, args);
    }

};


