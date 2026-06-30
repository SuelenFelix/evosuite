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

public class AdmUser_AdmUserBuilder_regDate_87893284613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9309;
     Object term9436;

    public AdmUser_AdmUserBuilder_regDate_87893284613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9310 = new Long(-6983938899150831997L);
        Integer term9348 = new Integer(-506958186);
        Boolean term9386 = new Boolean(false);
        Long term9391 = new Long(-2720964670491002091L);
        ArrayList term9393 = new ArrayList();
        ((ArrayList) term9393).add((Object)null);
        ((ArrayList) term9393).add((Object)null);
        ((ArrayList) term9393).add((Object)null);
        ((ArrayList) term9393).add((Object)null);
        ArrayList term9396 = new ArrayList();
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        Object term9390 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9390, term9390.getClass(), "id", term9391);
        setField(term9390, term9390.getClass(), "users", term9393);
        setField(term9390, term9390.getClass(), "privileges", term9396);
        setField(term9390, term9390.getClass(), "name", "");
        ArrayList term9388 = new ArrayList();
        ((ArrayList) term9388).add(term9390);
        Boolean term9402 = new Boolean(true);
        term9309 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term9416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9431 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9309, term9309.getClass(), "id", term9310);
        setField(term9309, term9309.getClass(), "membername", "RgqpoBknjN");
        setField(term9309, term9309.getClass(), "email", "nUDhadopHE");
        setField(term9309, term9309.getClass(), "password", "vLrTnQTIPg");
        setField(term9309, term9309.getClass(), "age", term9348);
        setField(term9309, term9309.getClass(), "phoneNumber", "GsXvLZCFtf");
        setField(term9309, term9309.getClass(), "country", "JqSCTBGSUs");
        setField(term9309, term9309.getClass(), "birthdate", "bZrrPiMnsr");
        setField(term9309, term9309.getClass(), "enabled", term9386);
        setField(term9309, term9309.getClass(), "roles", term9388);
        setField(term9309, term9309.getClass(), "isUsing2FA", term9402);
        setField(term9309, term9309.getClass(), "secret", "vpuKZSMmKQ");
        setIntField(term9417, term9417.getClass(), "year", 2026);
        setShortField(term9417, term9417.getClass(), "month", (short) 2);
        setShortField(term9417, term9417.getClass(), "day", (short) 26);
        setField(term9416, term9416.getClass(), "date", term9417);
        setByteField(term9421, term9421.getClass(), "hour", (byte) 12);
        setByteField(term9421, term9421.getClass(), "minute", (byte) 23);
        setByteField(term9421, term9421.getClass(), "second", (byte) 14);
        setIntField(term9421, term9421.getClass(), "nano", 86303611);
        setField(term9416, term9416.getClass(), "time", term9421);
        setField(term9309, term9309.getClass(), "regDate", term9416);
        setIntField(term9427, term9427.getClass(), "year", 2014);
        setShortField(term9427, term9427.getClass(), "month", (short) 6);
        setShortField(term9427, term9427.getClass(), "day", (short) 12);
        setField(term9426, term9426.getClass(), "date", term9427);
        setByteField(term9431, term9431.getClass(), "hour", (byte) 5);
        setByteField(term9431, term9431.getClass(), "minute", (byte) 4);
        setByteField(term9431, term9431.getClass(), "second", (byte) 20);
        setIntField(term9431, term9431.getClass(), "nano", 169602296);
        setField(term9426, term9426.getClass(), "time", term9431);
        setField(term9309, term9309.getClass(), "modDate", term9426);
        term9436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9441 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9437, term9437.getClass(), "year", 2021);
        setShortField(term9437, term9437.getClass(), "month", (short) 5);
        setShortField(term9437, term9437.getClass(), "day", (short) 13);
        setField(term9436, term9436.getClass(), "date", term9437);
        setByteField(term9441, term9441.getClass(), "hour", (byte) 15);
        setByteField(term9441, term9441.getClass(), "minute", (byte) 40);
        setByteField(term9441, term9441.getClass(), "second", (byte) 27);
        setIntField(term9441, term9441.getClass(), "nano", 319035378);
        setField(term9436, term9436.getClass(), "time", term9441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9436;
        callMethod(klass, "regDate", argTypes, term9309, args);
    }

};


