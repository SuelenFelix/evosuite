package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_getId_8104892181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public ConfirmationToken_getId_8104892181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term83 = new Integer(1134449235);
        Integer term100 = new Integer(-883034806);
        Integer term103 = new Integer(1585847225);
        HashMap term118 = new HashMap();
        Set<Object> term168 =  ((Map) term118).keySet();
        HashSet term117 = new HashSet((Collection<? extends Object>) term168);
        term82 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term97 = newInstance(Class.forName("java.util.Date"));
        Object term99 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term102 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term82, term82.getClass(), "id", term83);
        setField(term82, term82.getClass(), "confirmationToken", "HyxfbSQYBe");
        setLongField(term97, term97.getClass(), "fastTime", 1345871412244L);
        setField(term97, term97.getClass(), "cdate", null);
        setField(term82, term82.getClass(), "createdDate", term97);
        setField(term99, term99.getClass(), "id", term100);
        setField(term102, term102.getClass(), "id", term103);
        setField(term102, term102.getClass(), "role", "pCTimMblYc");
        setField(term102, term102.getClass(), "users", term117);
        setField(term99, term99.getClass(), "authority", term102);
        setField(term99, term99.getClass(), "email", "gGSMzuGICf");
        setField(term99, term99.getClass(), "password", "hxCBltsObl");
        setBooleanField(term99, term99.getClass(), "enabled", true);
        setField(term82, term82.getClass(), "user", term99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term82, args);
    }

};


