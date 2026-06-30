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

public class ConfirmationToken_init_1015611830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ConfirmationToken_init_1015611830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term5 = new Integer(1162663216);
        HashMap term20 = new HashMap();
        Set<Object> term61 =  ((Map) term20).keySet();
        HashSet term19 = new HashSet((Collection<? extends Object>) term61);
        term1 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term4 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term4, term4.getClass(), "id", term5);
        setField(term4, term4.getClass(), "role", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "users", term19);
        setField(term1, term1.getClass(), "authority", term4);
        setField(term1, term1.getClass(), "email", "ZiaGIbnzTs");
        setField(term1, term1.getClass(), "password", "tbcdzjIfER");
        setBooleanField(term1, term1.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


