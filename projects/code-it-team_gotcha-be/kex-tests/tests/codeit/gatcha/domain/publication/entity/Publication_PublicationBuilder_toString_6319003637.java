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

public class Publication_PublicationBuilder_toString_6319003637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;

    public Publication_PublicationBuilder_toString_6319003637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term759 = new Integer(-1263114719);
        Integer term762 = new Integer(-894662986);
        Integer term765 = new Integer(304775596);
        HashMap term780 = new HashMap();
        Set<Object> term835 =  ((Map) term780).keySet();
        HashSet term779 = new HashSet((Collection<? extends Object>) term835);
        term758 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term761 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term764 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term810 = newInstance(Class.forName("java.util.Date"));
        setField(term758, term758.getClass(), "id", term759);
        setField(term761, term761.getClass(), "id", term762);
        setField(term764, term764.getClass(), "id", term765);
        setField(term764, term764.getClass(), "role", "aNWLJdrZMq");
        setField(term764, term764.getClass(), "users", term779);
        setField(term761, term761.getClass(), "authority", term764);
        setField(term761, term761.getClass(), "email", "jXzmYyrnnT");
        setField(term761, term761.getClass(), "password", "igCAtimmYB");
        setBooleanField(term761, term761.getClass(), "enabled", true);
        setField(term758, term758.getClass(), "gatchaUser", term761);
        setLongField(term810, term810.getClass(), "fastTime", 1495357463288L);
        setField(term810, term810.getClass(), "cdate", null);
        setField(term758, term758.getClass(), "publicationDate", term810);
        setBooleanField(term758, term758.getClass(), "published", true);
        setField(term758, term758.getClass(), "linkUniqueString", "DyiXbeYIaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term758, args);
    }

};


