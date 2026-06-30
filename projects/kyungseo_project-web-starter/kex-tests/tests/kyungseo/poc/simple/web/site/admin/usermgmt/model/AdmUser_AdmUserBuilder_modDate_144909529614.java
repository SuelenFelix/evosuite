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

public class AdmUser_AdmUserBuilder_modDate_144909529614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9516;
     Object term9663;

    public AdmUser_AdmUserBuilder_modDate_144909529614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9517 = new Long(-4029227951294167228L);
        Integer term9555 = new Integer(114754804);
        Boolean term9593 = new Boolean(false);
        Long term9598 = new Long(5160033404788124731L);
        ArrayList term9600 = new ArrayList();
        ((ArrayList) term9600).add((Object)null);
        ((ArrayList) term9600).add((Object)null);
        ArrayList term9603 = new ArrayList();
        Object term9597 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9597, term9597.getClass(), "id", term9598);
        setField(term9597, term9597.getClass(), "users", term9600);
        setField(term9597, term9597.getClass(), "privileges", term9603);
        setField(term9597, term9597.getClass(), "name", "");
        Long term9608 = new Long(-8957441653116712448L);
        ArrayList term9610 = new ArrayList();
        ((ArrayList) term9610).add((Object)null);
        ArrayList term9613 = new ArrayList();
        ((ArrayList) term9613).add((Object)null);
        ((ArrayList) term9613).add((Object)null);
        ((ArrayList) term9613).add((Object)null);
        ((ArrayList) term9613).add((Object)null);
        ((ArrayList) term9613).add((Object)null);
        ((ArrayList) term9613).add((Object)null);
        ((ArrayList) term9613).add((Object)null);
        Object term9607 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9607, term9607.getClass(), "id", term9608);
        setField(term9607, term9607.getClass(), "users", term9610);
        setField(term9607, term9607.getClass(), "privileges", term9613);
        setField(term9607, term9607.getClass(), "name", "");
        Long term9618 = new Long(493557348274366095L);
        ArrayList term9620 = new ArrayList();
        ((ArrayList) term9620).add((Object)null);
        ((ArrayList) term9620).add((Object)null);
        ((ArrayList) term9620).add((Object)null);
        ((ArrayList) term9620).add((Object)null);
        ((ArrayList) term9620).add((Object)null);
        ((ArrayList) term9620).add((Object)null);
        ArrayList term9623 = new ArrayList();
        ((ArrayList) term9623).add((Object)null);
        Object term9617 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9617, term9617.getClass(), "id", term9618);
        setField(term9617, term9617.getClass(), "users", term9620);
        setField(term9617, term9617.getClass(), "privileges", term9623);
        setField(term9617, term9617.getClass(), "name", "");
        ArrayList term9595 = new ArrayList();
        ((ArrayList) term9595).add(term9597);
        ((ArrayList) term9595).add(term9607);
        ((ArrayList) term9595).add(term9617);
        Boolean term9629 = new Boolean(true);
        term9516 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term9643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9648 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9658 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9516, term9516.getClass(), "id", term9517);
        setField(term9516, term9516.getClass(), "membername", "IXQQwaXITf");
        setField(term9516, term9516.getClass(), "email", "fNzFTiRCjp");
        setField(term9516, term9516.getClass(), "password", "yaCGGogKro");
        setField(term9516, term9516.getClass(), "age", term9555);
        setField(term9516, term9516.getClass(), "phoneNumber", "qxrRUnjshF");
        setField(term9516, term9516.getClass(), "country", "WmVcapKAeJ");
        setField(term9516, term9516.getClass(), "birthdate", "jevOVdQdpc");
        setField(term9516, term9516.getClass(), "enabled", term9593);
        setField(term9516, term9516.getClass(), "roles", term9595);
        setField(term9516, term9516.getClass(), "isUsing2FA", term9629);
        setField(term9516, term9516.getClass(), "secret", "jwENwZiGlR");
        setIntField(term9644, term9644.getClass(), "year", 2012);
        setShortField(term9644, term9644.getClass(), "month", (short) 10);
        setShortField(term9644, term9644.getClass(), "day", (short) 26);
        setField(term9643, term9643.getClass(), "date", term9644);
        setByteField(term9648, term9648.getClass(), "hour", (byte) 13);
        setByteField(term9648, term9648.getClass(), "minute", (byte) 50);
        setByteField(term9648, term9648.getClass(), "second", (byte) 34);
        setIntField(term9648, term9648.getClass(), "nano", 738625041);
        setField(term9643, term9643.getClass(), "time", term9648);
        setField(term9516, term9516.getClass(), "regDate", term9643);
        setIntField(term9654, term9654.getClass(), "year", 2012);
        setShortField(term9654, term9654.getClass(), "month", (short) 7);
        setShortField(term9654, term9654.getClass(), "day", (short) 6);
        setField(term9653, term9653.getClass(), "date", term9654);
        setByteField(term9658, term9658.getClass(), "hour", (byte) 0);
        setByteField(term9658, term9658.getClass(), "minute", (byte) 48);
        setByteField(term9658, term9658.getClass(), "second", (byte) 16);
        setIntField(term9658, term9658.getClass(), "nano", 235139356);
        setField(term9653, term9653.getClass(), "time", term9658);
        setField(term9516, term9516.getClass(), "modDate", term9653);
        term9663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9668 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9664, term9664.getClass(), "year", 2023);
        setShortField(term9664, term9664.getClass(), "month", (short) 2);
        setShortField(term9664, term9664.getClass(), "day", (short) 6);
        setField(term9663, term9663.getClass(), "date", term9664);
        setByteField(term9668, term9668.getClass(), "hour", (byte) 3);
        setByteField(term9668, term9668.getClass(), "minute", (byte) 1);
        setByteField(term9668, term9668.getClass(), "second", (byte) 52);
        setIntField(term9668, term9668.getClass(), "nano", 345404097);
        setField(term9663, term9663.getClass(), "time", term9668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9663;
        callMethod(klass, "modDate", argTypes, term9516, args);
    }

};


