package codeit.gatcha.api.security.service;

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
import static codeit.gatcha.api.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RefreshTokenService_saveNewRefreshToken_15659470941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;

    public RefreshTokenService_saveNewRefreshToken_15659470941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59 = new Integer(568599855);
        Integer term62 = new Integer(1162663216);
        HashMap term77 = new HashMap();
        Set<Object> term128 =  ((Map) term77).keySet();
        HashSet term76 = new HashSet((Collection<? extends Object>) term128);
        term58 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term61 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term58, term58.getClass(), "id", term59);
        setField(term61, term61.getClass(), "id", term62);
        setField(term61, term61.getClass(), "role", "xxtlPwDYFs");
        setField(term61, term61.getClass(), "users", term76);
        setField(term58, term58.getClass(), "authority", term61);
        setField(term58, term58.getClass(), "email", "pCTimMblYc");
        setField(term58, term58.getClass(), "password", "hNxWaHcfhY");
        setBooleanField(term58, term58.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.service.RefreshTokenService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term58;
        callMethod(klass, "saveNewRefreshToken", argTypes, null, args);
    }

};


