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

public class Publication_getGatchaUser_14770242764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;

    public Publication_getGatchaUser_14770242764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1076 = new Integer(96566506);
        Integer term1079 = new Integer(-343325701);
        Integer term1082 = new Integer(107945604);
        HashMap term1097 = new HashMap();
        Set<Object> term1152 =  ((Map) term1097).keySet();
        HashSet term1096 = new HashSet((Collection<? extends Object>) term1152);
        term1075 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication"));
        Object term1078 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1081 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term1127 = newInstance(Class.forName("java.util.Date"));
        setField(term1075, term1075.getClass(), "id", term1076);
        setField(term1078, term1078.getClass(), "id", term1079);
        setField(term1081, term1081.getClass(), "id", term1082);
        setField(term1081, term1081.getClass(), "role", "izPpKDErnQ");
        setField(term1081, term1081.getClass(), "users", term1096);
        setField(term1078, term1078.getClass(), "authority", term1081);
        setField(term1078, term1078.getClass(), "email", "OcJCIDNIXA");
        setField(term1078, term1078.getClass(), "password", "XfRABIFVEp");
        setBooleanField(term1078, term1078.getClass(), "enabled", true);
        setField(term1075, term1075.getClass(), "gatchaUser", term1078);
        setLongField(term1127, term1127.getClass(), "fastTime", 1797203628025L);
        setField(term1127, term1127.getClass(), "cdate", null);
        setField(term1075, term1075.getClass(), "publicationDate", term1127);
        setBooleanField(term1075, term1075.getClass(), "published", false);
        setField(term1075, term1075.getClass(), "linkUniqueString", "MHGKyEnwKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGatchaUser", argTypes, term1075, args);
    }

};


