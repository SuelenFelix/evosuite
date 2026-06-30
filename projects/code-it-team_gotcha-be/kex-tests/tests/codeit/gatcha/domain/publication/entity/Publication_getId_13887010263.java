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

public class Publication_getId_13887010263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967;

    public Publication_getId_13887010263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term968 = new Integer(-1963434938);
        Integer term971 = new Integer(906181092);
        Integer term974 = new Integer(1045657203);
        HashMap term989 = new HashMap();
        Set<Object> term1044 =  ((Map) term989).keySet();
        HashSet term988 = new HashSet((Collection<? extends Object>) term1044);
        term967 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication"));
        Object term970 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term973 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term1019 = newInstance(Class.forName("java.util.Date"));
        setField(term967, term967.getClass(), "id", term968);
        setField(term970, term970.getClass(), "id", term971);
        setField(term973, term973.getClass(), "id", term974);
        setField(term973, term973.getClass(), "role", "iljANwuEjk");
        setField(term973, term973.getClass(), "users", term988);
        setField(term970, term970.getClass(), "authority", term973);
        setField(term970, term970.getClass(), "email", "FwPbDZcHmB");
        setField(term970, term970.getClass(), "password", "hOncybyCAH");
        setBooleanField(term970, term970.getClass(), "enabled", true);
        setField(term967, term967.getClass(), "gatchaUser", term970);
        setLongField(term1019, term1019.getClass(), "fastTime", 1500721068023L);
        setField(term1019, term1019.getClass(), "cdate", null);
        setField(term967, term967.getClass(), "publicationDate", term1019);
        setBooleanField(term967, term967.getClass(), "published", true);
        setField(term967, term967.getClass(), "linkUniqueString", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term967, args);
    }

};


