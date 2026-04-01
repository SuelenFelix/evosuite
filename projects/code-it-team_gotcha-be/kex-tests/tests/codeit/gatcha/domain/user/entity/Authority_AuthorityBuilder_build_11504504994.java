package codeit.gatcha.domain.user.entity;

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
import static codeit.gatcha.domain.user.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Authority_AuthorityBuilder_build_11504504994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1400;

    public Authority_AuthorityBuilder_build_11504504994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1401 = new Integer(1743224434);
        HashMap term1416 = new HashMap();
        Set<Object> term1434 =  ((Map) term1416).keySet();
        HashSet term1415 = new HashSet((Collection<? extends Object>) term1434);
        term1400 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder"));
        setField(term1400, term1400.getClass(), "id", term1401);
        setField(term1400, term1400.getClass(), "role", "TjWpyghUWN");
        setField(term1400, term1400.getClass(), "users", term1415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1400, args);
    }

};


