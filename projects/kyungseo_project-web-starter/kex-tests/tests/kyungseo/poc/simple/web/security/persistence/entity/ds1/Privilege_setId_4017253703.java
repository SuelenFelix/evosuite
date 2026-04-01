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

public class Privilege_setId_4017253703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7380;
     Object term7449;

    public Privilege_setId_4017253703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7381 = new Long(7711054832353934171L);
        Long term7398 = new Long(185544001230120339L);
        ArrayList term7400 = new ArrayList();
        ((ArrayList) term7400).add((Object)null);
        ((ArrayList) term7400).add((Object)null);
        ((ArrayList) term7400).add((Object)null);
        ((ArrayList) term7400).add((Object)null);
        ((ArrayList) term7400).add((Object)null);
        ArrayList term7403 = new ArrayList();
        ((ArrayList) term7403).add((Object)null);
        ((ArrayList) term7403).add((Object)null);
        ((ArrayList) term7403).add((Object)null);
        Object term7397 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7397, term7397.getClass(), "id", term7398);
        setField(term7397, term7397.getClass(), "users", term7400);
        setField(term7397, term7397.getClass(), "privileges", term7403);
        setField(term7397, term7397.getClass(), "name", "");
        Long term7408 = new Long(-2614906266506360948L);
        ArrayList term7410 = new ArrayList();
        ((ArrayList) term7410).add((Object)null);
        ArrayList term7413 = new ArrayList();
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        ((ArrayList) term7413).add((Object)null);
        Object term7407 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7407, term7407.getClass(), "id", term7408);
        setField(term7407, term7407.getClass(), "users", term7410);
        setField(term7407, term7407.getClass(), "privileges", term7413);
        setField(term7407, term7407.getClass(), "name", "");
        Long term7418 = new Long(-6837989212848250735L);
        ArrayList term7420 = new ArrayList();
        ((ArrayList) term7420).add((Object)null);
        ((ArrayList) term7420).add((Object)null);
        ((ArrayList) term7420).add((Object)null);
        ((ArrayList) term7420).add((Object)null);
        ((ArrayList) term7420).add((Object)null);
        ((ArrayList) term7420).add((Object)null);
        ArrayList term7423 = new ArrayList();
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        ((ArrayList) term7423).add((Object)null);
        Object term7417 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7417, term7417.getClass(), "id", term7418);
        setField(term7417, term7417.getClass(), "users", term7420);
        setField(term7417, term7417.getClass(), "privileges", term7423);
        setField(term7417, term7417.getClass(), "name", "");
        Long term7428 = new Long(1634166935474035772L);
        ArrayList term7430 = new ArrayList();
        ((ArrayList) term7430).add((Object)null);
        ((ArrayList) term7430).add((Object)null);
        ((ArrayList) term7430).add((Object)null);
        ((ArrayList) term7430).add((Object)null);
        ArrayList term7433 = new ArrayList();
        ((ArrayList) term7433).add((Object)null);
        Object term7427 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7427, term7427.getClass(), "id", term7428);
        setField(term7427, term7427.getClass(), "users", term7430);
        setField(term7427, term7427.getClass(), "privileges", term7433);
        setField(term7427, term7427.getClass(), "name", "");
        Long term7438 = new Long(2990264647913003810L);
        ArrayList term7440 = new ArrayList();
        ((ArrayList) term7440).add((Object)null);
        ((ArrayList) term7440).add((Object)null);
        ((ArrayList) term7440).add((Object)null);
        ((ArrayList) term7440).add((Object)null);
        ArrayList term7443 = new ArrayList();
        ((ArrayList) term7443).add((Object)null);
        ((ArrayList) term7443).add((Object)null);
        ((ArrayList) term7443).add((Object)null);
        ((ArrayList) term7443).add((Object)null);
        ((ArrayList) term7443).add((Object)null);
        Object term7437 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7437, term7437.getClass(), "id", term7438);
        setField(term7437, term7437.getClass(), "users", term7440);
        setField(term7437, term7437.getClass(), "privileges", term7443);
        setField(term7437, term7437.getClass(), "name", "");
        ArrayList term7395 = new ArrayList();
        ((ArrayList) term7395).add(term7397);
        ((ArrayList) term7395).add(term7407);
        ((ArrayList) term7395).add(term7417);
        ((ArrayList) term7395).add(term7427);
        ((ArrayList) term7395).add(term7427);
        ((ArrayList) term7395).add(term7437);
        ((ArrayList) term7395).add(term7397);
        term7380 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term7380, term7380.getClass(), "id", term7381);
        setField(term7380, term7380.getClass(), "name", "cGbJSRSpNn");
        setField(term7380, term7380.getClass(), "roles", term7395);
        term7449 = new Long(-2195794659127490022L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7449;
        callMethod(klass, "setId", argTypes, term7380, args);
    }

};


