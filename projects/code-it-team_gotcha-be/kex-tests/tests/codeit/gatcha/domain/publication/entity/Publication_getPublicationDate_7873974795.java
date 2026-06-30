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

public class Publication_getPublicationDate_7873974795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;

    public Publication_getPublicationDate_7873974795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1184 = new Integer(202001407);
        Integer term1187 = new Integer(158873461);
        Integer term1190 = new Integer(-430151637);
        HashMap term1205 = new HashMap();
        Set<Object> term1260 =  ((Map) term1205).keySet();
        HashSet term1204 = new HashSet((Collection<? extends Object>) term1260);
        term1183 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication"));
        Object term1186 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1189 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term1235 = newInstance(Class.forName("java.util.Date"));
        setField(term1183, term1183.getClass(), "id", term1184);
        setField(term1186, term1186.getClass(), "id", term1187);
        setField(term1189, term1189.getClass(), "id", term1190);
        setField(term1189, term1189.getClass(), "role", "ShIELyuULw");
        setField(term1189, term1189.getClass(), "users", term1204);
        setField(term1186, term1186.getClass(), "authority", term1189);
        setField(term1186, term1186.getClass(), "email", "ZKMLioamsY");
        setField(term1186, term1186.getClass(), "password", "WVbxuoDBcn");
        setBooleanField(term1186, term1186.getClass(), "enabled", true);
        setField(term1183, term1183.getClass(), "gatchaUser", term1186);
        setLongField(term1235, term1235.getClass(), "fastTime", 1589457921030L);
        setField(term1235, term1235.getClass(), "cdate", null);
        setField(term1183, term1183.getClass(), "publicationDate", term1235);
        setBooleanField(term1183, term1183.getClass(), "published", true);
        setField(term1183, term1183.getClass(), "linkUniqueString", "pvDEABOxLt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublicationDate", argTypes, term1183, args);
    }

};


