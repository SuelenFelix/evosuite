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

public class ConfirmationToken_toString_43580484412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1368;

    public ConfirmationToken_toString_43580484412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1369 = new Integer(729658803);
        Integer term1386 = new Integer(114754804);
        Integer term1389 = new Integer(1687361082);
        HashMap term1404 = new HashMap();
        Set<Object> term1454 =  ((Map) term1404).keySet();
        HashSet term1403 = new HashSet((Collection<? extends Object>) term1454);
        term1368 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term1383 = newInstance(Class.forName("java.util.Date"));
        Object term1385 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1388 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1368, term1368.getClass(), "id", term1369);
        setField(term1368, term1368.getClass(), "confirmationToken", "qnvxzwuGKX");
        setLongField(term1383, term1383.getClass(), "fastTime", 1745462962080L);
        setField(term1383, term1383.getClass(), "cdate", null);
        setField(term1368, term1368.getClass(), "createdDate", term1383);
        setField(term1385, term1385.getClass(), "id", term1386);
        setField(term1388, term1388.getClass(), "id", term1389);
        setField(term1388, term1388.getClass(), "role", "EdPAvpluZg");
        setField(term1388, term1388.getClass(), "users", term1403);
        setField(term1385, term1385.getClass(), "authority", term1388);
        setField(term1385, term1385.getClass(), "email", "HwLHeGLyhe");
        setField(term1385, term1385.getClass(), "password", "RDnkgWkcbz");
        setBooleanField(term1385, term1385.getClass(), "enabled", true);
        setField(term1368, term1368.getClass(), "user", term1385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1368, args);
    }

};


