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

public class UserLocation_getCountry_14362993454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8664;

    public UserLocation_getCountry_14362993454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8665 = new Long(-5850316381591949820L);
        Long term8681 = new Long(5857854340777182167L);
        Boolean term8719 = new Boolean(true);
        Integer term8721 = new Integer(-506958186);
        ArrayList term8759 = new ArrayList();
        term8664 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term8680 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term8776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8781 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8791 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8664, term8664.getClass(), "id", term8665);
        setField(term8664, term8664.getClass(), "country", "yaCGGogKro");
        setBooleanField(term8664, term8664.getClass(), "enabled", true);
        setField(term8680, term8680.getClass(), "id", term8681);
        setField(term8680, term8680.getClass(), "membername", "qxrRUnjshF");
        setField(term8680, term8680.getClass(), "email", "WmVcapKAeJ");
        setField(term8680, term8680.getClass(), "password", "jevOVdQdpc");
        setField(term8680, term8680.getClass(), "enabled", term8719);
        setField(term8680, term8680.getClass(), "age", term8721);
        setField(term8680, term8680.getClass(), "phoneNumber", "TLLVSGTNsz");
        setField(term8680, term8680.getClass(), "country", "mbBWfaHCrP");
        setField(term8680, term8680.getClass(), "birthdate", "wFyiZloCxg");
        setField(term8680, term8680.getClass(), "roles", term8759);
        setBooleanField(term8680, term8680.getClass(), "isUsing2FA", true);
        setField(term8680, term8680.getClass(), "secret", "xYztJEIPWy");
        setIntField(term8777, term8777.getClass(), "year", 2025);
        setShortField(term8777, term8777.getClass(), "month", (short) 2);
        setShortField(term8777, term8777.getClass(), "day", (short) 24);
        setField(term8776, term8776.getClass(), "date", term8777);
        setByteField(term8781, term8781.getClass(), "hour", (byte) 10);
        setByteField(term8781, term8781.getClass(), "minute", (byte) 56);
        setByteField(term8781, term8781.getClass(), "second", (byte) 29);
        setIntField(term8781, term8781.getClass(), "nano", 207724630);
        setField(term8776, term8776.getClass(), "time", term8781);
        setField(term8680, term8680.getClass(), "regDate", term8776);
        setIntField(term8787, term8787.getClass(), "year", 2027);
        setShortField(term8787, term8787.getClass(), "month", (short) 8);
        setShortField(term8787, term8787.getClass(), "day", (short) 16);
        setField(term8786, term8786.getClass(), "date", term8787);
        setByteField(term8791, term8791.getClass(), "hour", (byte) 1);
        setByteField(term8791, term8791.getClass(), "minute", (byte) 50);
        setByteField(term8791, term8791.getClass(), "second", (byte) 52);
        setIntField(term8791, term8791.getClass(), "nano", 161814778);
        setField(term8786, term8786.getClass(), "time", term8791);
        setField(term8680, term8680.getClass(), "modDate", term8786);
        setField(term8664, term8664.getClass(), "user", term8680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term8664, args);
    }

};


