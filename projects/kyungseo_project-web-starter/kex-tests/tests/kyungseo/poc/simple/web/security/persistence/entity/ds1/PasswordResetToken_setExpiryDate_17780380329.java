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

public class PasswordResetToken_setExpiryDate_17780380329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15300;
     Object term15443;

    public PasswordResetToken_setExpiryDate_17780380329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15301 = new Long(1203458433789323993L);
        Long term15316 = new Long(-8021019578361035942L);
        Boolean term15354 = new Boolean(true);
        Integer term15356 = new Integer(-390501023);
        Long term15397 = new Long(7534205281044116098L);
        Object term15396 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15396, term15396.getClass(), "id", term15397);
        setField(term15396, term15396.getClass(), "users", null);
        setField(term15396, term15396.getClass(), "privileges", null);
        setField(term15396, term15396.getClass(), "name", null);
        Long term15400 = new Long(-2505751043723962819L);
        Object term15399 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15399, term15399.getClass(), "id", term15400);
        setField(term15399, term15399.getClass(), "users", null);
        setField(term15399, term15399.getClass(), "privileges", null);
        setField(term15399, term15399.getClass(), "name", null);
        Object term15402 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15402, term15402.getClass(), "id", null);
        setField(term15402, term15402.getClass(), "users", null);
        setField(term15402, term15402.getClass(), "privileges", null);
        setField(term15402, term15402.getClass(), "name", null);
        Object term15403 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15403, term15403.getClass(), "id", null);
        setField(term15403, term15403.getClass(), "users", null);
        setField(term15403, term15403.getClass(), "privileges", null);
        setField(term15403, term15403.getClass(), "name", null);
        Object term15404 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15404, term15404.getClass(), "id", null);
        setField(term15404, term15404.getClass(), "users", null);
        setField(term15404, term15404.getClass(), "privileges", null);
        setField(term15404, term15404.getClass(), "name", null);
        Object term15405 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15405, term15405.getClass(), "id", null);
        setField(term15405, term15405.getClass(), "users", null);
        setField(term15405, term15405.getClass(), "privileges", null);
        setField(term15405, term15405.getClass(), "name", null);
        ArrayList term15394 = new ArrayList();
        ((ArrayList) term15394).add(term15396);
        ((ArrayList) term15394).add(term15399);
        ((ArrayList) term15394).add(term15402);
        ((ArrayList) term15394).add(term15403);
        ((ArrayList) term15394).add(term15404);
        ((ArrayList) term15394).add(term15403);
        ((ArrayList) term15394).add(term15405);
        ((ArrayList) term15394).add(term15405);
        term15300 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term15315 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term15421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15441 = newInstance(Class.forName("java.util.Date"));
        setField(term15300, term15300.getClass(), "id", term15301);
        setField(term15300, term15300.getClass(), "token", "VWFNUuzpse");
        setField(term15315, term15315.getClass(), "id", term15316);
        setField(term15315, term15315.getClass(), "membername", "XdnUnODLtI");
        setField(term15315, term15315.getClass(), "email", "blbqUBWvWn");
        setField(term15315, term15315.getClass(), "password", "GqITHNYwXE");
        setField(term15315, term15315.getClass(), "enabled", term15354);
        setField(term15315, term15315.getClass(), "age", term15356);
        setField(term15315, term15315.getClass(), "phoneNumber", "UZgYyXlvna");
        setField(term15315, term15315.getClass(), "country", "VGFyNxXSkc");
        setField(term15315, term15315.getClass(), "birthdate", "qkZsBlbGpw");
        setField(term15315, term15315.getClass(), "roles", term15394);
        setBooleanField(term15315, term15315.getClass(), "isUsing2FA", false);
        setField(term15315, term15315.getClass(), "secret", "uPuFIjvpsv");
        setIntField(term15422, term15422.getClass(), "year", 2016);
        setShortField(term15422, term15422.getClass(), "month", (short) 12);
        setShortField(term15422, term15422.getClass(), "day", (short) 21);
        setField(term15421, term15421.getClass(), "date", term15422);
        setByteField(term15426, term15426.getClass(), "hour", (byte) 14);
        setByteField(term15426, term15426.getClass(), "minute", (byte) 3);
        setByteField(term15426, term15426.getClass(), "second", (byte) 9);
        setIntField(term15426, term15426.getClass(), "nano", 805869273);
        setField(term15421, term15421.getClass(), "time", term15426);
        setField(term15315, term15315.getClass(), "regDate", term15421);
        setIntField(term15432, term15432.getClass(), "year", 2011);
        setShortField(term15432, term15432.getClass(), "month", (short) 12);
        setShortField(term15432, term15432.getClass(), "day", (short) 31);
        setField(term15431, term15431.getClass(), "date", term15432);
        setByteField(term15436, term15436.getClass(), "hour", (byte) 6);
        setByteField(term15436, term15436.getClass(), "minute", (byte) 27);
        setByteField(term15436, term15436.getClass(), "second", (byte) 8);
        setIntField(term15436, term15436.getClass(), "nano", 782094318);
        setField(term15431, term15431.getClass(), "time", term15436);
        setField(term15315, term15315.getClass(), "modDate", term15431);
        setField(term15300, term15300.getClass(), "user", term15315);
        setLongField(term15441, term15441.getClass(), "fastTime", 1550698994689L);
        setField(term15441, term15441.getClass(), "cdate", null);
        setField(term15300, term15300.getClass(), "expiryDate", term15441);
        term15443 = newInstance(Class.forName("java.util.Date"));
        setLongField(term15443, term15443.getClass(), "fastTime", 1804998087131L);
        setField(term15443, term15443.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term15443;
        callMethod(klass, "setExpiryDate", argTypes, term15300, args);
    }

};


