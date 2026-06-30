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

public class Publication_getLinkUniqueString_21401906907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1399;

    public Publication_getLinkUniqueString_21401906907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1400 = new Integer(-1239406390);
        Integer term1403 = new Integer(1557431527);
        Integer term1406 = new Integer(-1504890659);
        HashMap term1421 = new HashMap();
        Set<Object> term1476 =  ((Map) term1421).keySet();
        HashSet term1420 = new HashSet((Collection<? extends Object>) term1476);
        term1399 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication"));
        Object term1402 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1405 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term1451 = newInstance(Class.forName("java.util.Date"));
        setField(term1399, term1399.getClass(), "id", term1400);
        setField(term1402, term1402.getClass(), "id", term1403);
        setField(term1405, term1405.getClass(), "id", term1406);
        setField(term1405, term1405.getClass(), "role", "oPxuZbkYio");
        setField(term1405, term1405.getClass(), "users", term1420);
        setField(term1402, term1402.getClass(), "authority", term1405);
        setField(term1402, term1402.getClass(), "email", "OeQLvhVERT");
        setField(term1402, term1402.getClass(), "password", "IlvgFINwIa");
        setBooleanField(term1402, term1402.getClass(), "enabled", true);
        setField(term1399, term1399.getClass(), "gatchaUser", term1402);
        setLongField(term1451, term1451.getClass(), "fastTime", 1349069753960L);
        setField(term1451, term1451.getClass(), "cdate", null);
        setField(term1399, term1399.getClass(), "publicationDate", term1451);
        setBooleanField(term1399, term1399.getClass(), "published", true);
        setField(term1399, term1399.getClass(), "linkUniqueString", "GEJABPlHSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinkUniqueString", argTypes, term1399, args);
    }

};


