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

public class AdmUserDTO_toString_86770393134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12451;

    public AdmUserDTO_toString_86770393134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12452 = new Long(-6903160242975707710L);
        Boolean term12490 = new Boolean(false);
        Integer term12492 = new Integer(-1146679443);
        Boolean term12530 = new Boolean(true);
        ArrayList term12544 = new ArrayList();
        term12451 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        Object term12548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12563 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12451, term12451.getClass(), "id", term12452);
        setField(term12451, term12451.getClass(), "membername", "qxBdFhLbAN");
        setField(term12451, term12451.getClass(), "email", "KyUmXHRrED");
        setField(term12451, term12451.getClass(), "password", "eOMBFVrNcf");
        setField(term12451, term12451.getClass(), "enabled", term12490);
        setField(term12451, term12451.getClass(), "age", term12492);
        setField(term12451, term12451.getClass(), "phoneNumber", "gOwOIsocMB");
        setField(term12451, term12451.getClass(), "country", "GqTBOhQBgV");
        setField(term12451, term12451.getClass(), "birthdate", "DQhxOWqEyi");
        setField(term12451, term12451.getClass(), "isUsing2FA", term12530);
        setField(term12451, term12451.getClass(), "secret", "dSszYGDwAk");
        setField(term12451, term12451.getClass(), "roles", term12544);
        setIntField(term12549, term12549.getClass(), "year", 2023);
        setShortField(term12549, term12549.getClass(), "month", (short) 1);
        setShortField(term12549, term12549.getClass(), "day", (short) 10);
        setField(term12548, term12548.getClass(), "date", term12549);
        setByteField(term12553, term12553.getClass(), "hour", (byte) 2);
        setByteField(term12553, term12553.getClass(), "minute", (byte) 12);
        setByteField(term12553, term12553.getClass(), "second", (byte) 45);
        setIntField(term12553, term12553.getClass(), "nano", 793047168);
        setField(term12548, term12548.getClass(), "time", term12553);
        setField(term12451, term12451.getClass(), "regDate", term12548);
        setIntField(term12559, term12559.getClass(), "year", 2028);
        setShortField(term12559, term12559.getClass(), "month", (short) 6);
        setShortField(term12559, term12559.getClass(), "day", (short) 12);
        setField(term12558, term12558.getClass(), "date", term12559);
        setByteField(term12563, term12563.getClass(), "hour", (byte) 9);
        setByteField(term12563, term12563.getClass(), "minute", (byte) 39);
        setByteField(term12563, term12563.getClass(), "second", (byte) 7);
        setIntField(term12563, term12563.getClass(), "nano", 950068890);
        setField(term12558, term12558.getClass(), "time", term12563);
        setField(term12451, term12451.getClass(), "modDate", term12558);
        setField(term12451, term12451.getClass(), "date", "gNeMyGSVIG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12451, args);
    }

};


