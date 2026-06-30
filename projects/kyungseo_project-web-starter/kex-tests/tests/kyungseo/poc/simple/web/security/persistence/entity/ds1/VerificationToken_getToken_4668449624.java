package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class VerificationToken_getToken_4668449624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17174;

    public VerificationToken_getToken_4668449624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17175 = new Long(736282298030442495L);
        Long term17190 = new Long(-8385042448755891761L);
        Boolean term17228 = new Boolean(true);
        Integer term17230 = new Integer(-941356098);
        Long term17271 = new Long(3776640840397782177L);
        Object term17270 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17270, term17270.getClass(), "id", term17271);
        setField(term17270, term17270.getClass(), "users", null);
        setField(term17270, term17270.getClass(), "privileges", null);
        setField(term17270, term17270.getClass(), "name", null);
        Object term17273 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17273, term17273.getClass(), "id", null);
        setField(term17273, term17273.getClass(), "users", null);
        setField(term17273, term17273.getClass(), "privileges", null);
        setField(term17273, term17273.getClass(), "name", null);
        Object term17274 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17274, term17274.getClass(), "id", null);
        setField(term17274, term17274.getClass(), "users", null);
        setField(term17274, term17274.getClass(), "privileges", null);
        setField(term17274, term17274.getClass(), "name", null);
        ArrayList term17268 = new ArrayList();
        ((ArrayList) term17268).add(term17270);
        ((ArrayList) term17268).add(term17273);
        ((ArrayList) term17268).add(term17274);
        term17174 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term17189 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term17290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17295 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17305 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17310 = newInstance(Class.forName("java.util.Date"));
        setField(term17174, term17174.getClass(), "id", term17175);
        setField(term17174, term17174.getClass(), "token", "oUsLXfeBhj");
        setField(term17189, term17189.getClass(), "id", term17190);
        setField(term17189, term17189.getClass(), "membername", "dNmDNoDsCT");
        setField(term17189, term17189.getClass(), "email", "FKYroLkXZi");
        setField(term17189, term17189.getClass(), "password", "qnoyvZRqBI");
        setField(term17189, term17189.getClass(), "enabled", term17228);
        setField(term17189, term17189.getClass(), "age", term17230);
        setField(term17189, term17189.getClass(), "phoneNumber", "iBRFyvlgRW");
        setField(term17189, term17189.getClass(), "country", "UjtHbgdpKi");
        setField(term17189, term17189.getClass(), "birthdate", "QZUqVBZaTe");
        setField(term17189, term17189.getClass(), "roles", term17268);
        setBooleanField(term17189, term17189.getClass(), "isUsing2FA", true);
        setField(term17189, term17189.getClass(), "secret", "TbgzoLhCKy");
        setIntField(term17291, term17291.getClass(), "year", 2017);
        setShortField(term17291, term17291.getClass(), "month", (short) 4);
        setShortField(term17291, term17291.getClass(), "day", (short) 16);
        setField(term17290, term17290.getClass(), "date", term17291);
        setByteField(term17295, term17295.getClass(), "hour", (byte) 4);
        setByteField(term17295, term17295.getClass(), "minute", (byte) 46);
        setByteField(term17295, term17295.getClass(), "second", (byte) 10);
        setIntField(term17295, term17295.getClass(), "nano", 543909144);
        setField(term17290, term17290.getClass(), "time", term17295);
        setField(term17189, term17189.getClass(), "regDate", term17290);
        setIntField(term17301, term17301.getClass(), "year", 2025);
        setShortField(term17301, term17301.getClass(), "month", (short) 1);
        setShortField(term17301, term17301.getClass(), "day", (short) 18);
        setField(term17300, term17300.getClass(), "date", term17301);
        setByteField(term17305, term17305.getClass(), "hour", (byte) 6);
        setByteField(term17305, term17305.getClass(), "minute", (byte) 53);
        setByteField(term17305, term17305.getClass(), "second", (byte) 54);
        setIntField(term17305, term17305.getClass(), "nano", 781716212);
        setField(term17300, term17300.getClass(), "time", term17305);
        setField(term17189, term17189.getClass(), "modDate", term17300);
        setField(term17174, term17174.getClass(), "user", term17189);
        setLongField(term17310, term17310.getClass(), "fastTime", 1329640267573L);
        setField(term17310, term17310.getClass(), "cdate", null);
        setField(term17174, term17174.getClass(), "expiryDate", term17310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term17174, args);
    }

};


