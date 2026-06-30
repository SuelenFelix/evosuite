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

public class ConfirmationToken_setId_2108166205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510;
     Object term576;

    public ConfirmationToken_setId_2108166205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term511 = new Integer(1375330971);
        Integer term528 = new Integer(-478195677);
        Integer term531 = new Integer(972867650);
        HashMap term546 = new HashMap();
        Set<Object> term598 =  ((Map) term546).keySet();
        HashSet term545 = new HashSet((Collection<? extends Object>) term598);
        term510 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term525 = newInstance(Class.forName("java.util.Date"));
        Object term527 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term530 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term510, term510.getClass(), "id", term511);
        setField(term510, term510.getClass(), "confirmationToken", "AdxvLJhNLe");
        setLongField(term525, term525.getClass(), "fastTime", 1442639565302L);
        setField(term525, term525.getClass(), "cdate", null);
        setField(term510, term510.getClass(), "createdDate", term525);
        setField(term527, term527.getClass(), "id", term528);
        setField(term530, term530.getClass(), "id", term531);
        setField(term530, term530.getClass(), "role", "lHfTrWKMPk");
        setField(term530, term530.getClass(), "users", term545);
        setField(term527, term527.getClass(), "authority", term530);
        setField(term527, term527.getClass(), "email", "FPvxVzzSvD");
        setField(term527, term527.getClass(), "password", "WHcwFgsGFC");
        setBooleanField(term527, term527.getClass(), "enabled", true);
        setField(term510, term510.getClass(), "user", term527);
        term576 = new Integer(-344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term576;
        callMethod(klass, "setId", argTypes, term510, args);
    }

};


