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

public class AdmUser_AdmUserBuilder_build_128373874115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9743;

    public AdmUser_AdmUserBuilder_build_128373874115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9744 = new Long(4947643967691976731L);
        Integer term9782 = new Integer(-1899301124);
        Boolean term9820 = new Boolean(true);
        Long term9825 = new Long(4548576710115075073L);
        ArrayList term9827 = new ArrayList();
        ((ArrayList) term9827).add((Object)null);
        ((ArrayList) term9827).add((Object)null);
        ((ArrayList) term9827).add((Object)null);
        ((ArrayList) term9827).add((Object)null);
        ((ArrayList) term9827).add((Object)null);
        ArrayList term9830 = new ArrayList();
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        ((ArrayList) term9830).add((Object)null);
        Object term9824 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9824, term9824.getClass(), "id", term9825);
        setField(term9824, term9824.getClass(), "users", term9827);
        setField(term9824, term9824.getClass(), "privileges", term9830);
        setField(term9824, term9824.getClass(), "name", "");
        ArrayList term9822 = new ArrayList();
        ((ArrayList) term9822).add(term9824);
        Boolean term9836 = new Boolean(false);
        term9743 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        Object term9850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9855 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9865 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9743, term9743.getClass(), "id", term9744);
        setField(term9743, term9743.getClass(), "membername", "rfFHGPcfpz");
        setField(term9743, term9743.getClass(), "email", "fViQeyMrrL");
        setField(term9743, term9743.getClass(), "password", "zzeaToyLmI");
        setField(term9743, term9743.getClass(), "age", term9782);
        setField(term9743, term9743.getClass(), "phoneNumber", "sKYWhmRMLx");
        setField(term9743, term9743.getClass(), "country", "SOJpgWUZCf");
        setField(term9743, term9743.getClass(), "birthdate", "jgywFOzBDw");
        setField(term9743, term9743.getClass(), "enabled", term9820);
        setField(term9743, term9743.getClass(), "roles", term9822);
        setField(term9743, term9743.getClass(), "isUsing2FA", term9836);
        setField(term9743, term9743.getClass(), "secret", "BKiHMTzLoY");
        setIntField(term9851, term9851.getClass(), "year", 2025);
        setShortField(term9851, term9851.getClass(), "month", (short) 9);
        setShortField(term9851, term9851.getClass(), "day", (short) 5);
        setField(term9850, term9850.getClass(), "date", term9851);
        setByteField(term9855, term9855.getClass(), "hour", (byte) 11);
        setByteField(term9855, term9855.getClass(), "minute", (byte) 59);
        setByteField(term9855, term9855.getClass(), "second", (byte) 37);
        setIntField(term9855, term9855.getClass(), "nano", 93740487);
        setField(term9850, term9850.getClass(), "time", term9855);
        setField(term9743, term9743.getClass(), "regDate", term9850);
        setIntField(term9861, term9861.getClass(), "year", 2028);
        setShortField(term9861, term9861.getClass(), "month", (short) 12);
        setShortField(term9861, term9861.getClass(), "day", (short) 28);
        setField(term9860, term9860.getClass(), "date", term9861);
        setByteField(term9865, term9865.getClass(), "hour", (byte) 11);
        setByteField(term9865, term9865.getClass(), "minute", (byte) 37);
        setByteField(term9865, term9865.getClass(), "second", (byte) 0);
        setIntField(term9865, term9865.getClass(), "nano", 315383282);
        setField(term9860, term9860.getClass(), "time", term9865);
        setField(term9743, term9743.getClass(), "modDate", term9860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term9743, args);
    }

};


