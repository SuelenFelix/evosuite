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

public class Publication_PublicationBuilder_build_3030453666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650;

    public Publication_PublicationBuilder_build_3030453666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term651 = new Integer(-481533957);
        Integer term654 = new Integer(1240914516);
        Integer term657 = new Integer(-1465035361);
        HashMap term672 = new HashMap();
        Set<Object> term727 =  ((Map) term672).keySet();
        HashSet term671 = new HashSet((Collection<? extends Object>) term727);
        term650 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term653 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term656 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term702 = newInstance(Class.forName("java.util.Date"));
        setField(term650, term650.getClass(), "id", term651);
        setField(term653, term653.getClass(), "id", term654);
        setField(term656, term656.getClass(), "id", term657);
        setField(term656, term656.getClass(), "role", "OJJtVNPyKZ");
        setField(term656, term656.getClass(), "users", term671);
        setField(term653, term653.getClass(), "authority", term656);
        setField(term653, term653.getClass(), "email", "MwwjNtdOFT");
        setField(term653, term653.getClass(), "password", "VYkqXKVlAJ");
        setBooleanField(term653, term653.getClass(), "enabled", true);
        setField(term650, term650.getClass(), "gatchaUser", term653);
        setLongField(term702, term702.getClass(), "fastTime", 1429023851389L);
        setField(term702, term702.getClass(), "cdate", null);
        setField(term650, term650.getClass(), "publicationDate", term702);
        setBooleanField(term650, term650.getClass(), "published", true);
        setField(term650, term650.getClass(), "linkUniqueString", "XkIoWJRNwN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term650, args);
    }

};


