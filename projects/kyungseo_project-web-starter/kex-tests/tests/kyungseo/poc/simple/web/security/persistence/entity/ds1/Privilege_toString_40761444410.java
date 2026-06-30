package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Privilege_toString_40761444410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7930;

    public Privilege_toString_40761444410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7931 = new Long(-6656996002079682356L);
        Long term7948 = new Long(2166921473521388808L);
        ArrayList term7950 = new ArrayList();
        ((ArrayList) term7950).add((Object)null);
        ((ArrayList) term7950).add((Object)null);
        ((ArrayList) term7950).add((Object)null);
        ((ArrayList) term7950).add((Object)null);
        ((ArrayList) term7950).add((Object)null);
        ArrayList term7953 = new ArrayList();
        ((ArrayList) term7953).add((Object)null);
        Object term7947 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7947, term7947.getClass(), "id", term7948);
        setField(term7947, term7947.getClass(), "users", term7950);
        setField(term7947, term7947.getClass(), "privileges", term7953);
        setField(term7947, term7947.getClass(), "name", "");
        Long term7958 = new Long(6437032166810658671L);
        ArrayList term7960 = new ArrayList();
        ((ArrayList) term7960).add((Object)null);
        ((ArrayList) term7960).add((Object)null);
        ArrayList term7963 = new ArrayList();
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        ((ArrayList) term7963).add((Object)null);
        Object term7957 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7957, term7957.getClass(), "id", term7958);
        setField(term7957, term7957.getClass(), "users", term7960);
        setField(term7957, term7957.getClass(), "privileges", term7963);
        setField(term7957, term7957.getClass(), "name", "");
        ArrayList term7945 = new ArrayList();
        ((ArrayList) term7945).add(term7947);
        ((ArrayList) term7945).add(term7957);
        ((ArrayList) term7945).add(term7957);
        term7930 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term7930, term7930.getClass(), "id", term7931);
        setField(term7930, term7930.getClass(), "name", "anSZCikKpS");
        setField(term7930, term7930.getClass(), "roles", term7945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7930, args);
    }

};


