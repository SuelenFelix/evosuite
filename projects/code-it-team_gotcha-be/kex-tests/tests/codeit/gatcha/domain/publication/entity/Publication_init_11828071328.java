package codeit.gatcha.domain.publication.entity;

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
import static codeit.gatcha.domain.publication.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class Publication_init_11828071328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1507;
     Object term1509;
     Object term1559;
     Object term1561;

    public Publication_init_11828071328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1507 = new Integer(-1882480155);
        Integer term1510 = new Integer(-1410220680);
        Integer term1513 = new Integer(389427431);
        HashMap term1528 = new HashMap();
        Set<Object> term1585 =  ((Map) term1528).keySet();
        HashSet term1527 = new HashSet((Collection<? extends Object>) term1585);
        term1509 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1512 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1509, term1509.getClass(), "id", term1510);
        setField(term1512, term1512.getClass(), "id", term1513);
        setField(term1512, term1512.getClass(), "role", "aQFUvuaYxd");
        setField(term1512, term1512.getClass(), "users", term1527);
        setField(term1509, term1509.getClass(), "authority", term1512);
        setField(term1509, term1509.getClass(), "email", "IBpaxltauX");
        setField(term1509, term1509.getClass(), "password", "hePqROaplw");
        setBooleanField(term1509, term1509.getClass(), "enabled", true);
        term1559 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1559, term1559.getClass(), "fastTime", 1706078172457L);
        setField(term1559, term1559.getClass(), "cdate", null);
        term1561 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term1507;
        args[1] = term1509;
        args[2] = term1559;
        args[3] = term1561;
        args[4] = "PJcSNDruWd";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


