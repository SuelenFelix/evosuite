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
import java.lang.Boolean;
import java.lang.Integer;

public class Role_equals_7185441263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32342;
     Object term32406;

    public Role_equals_7185441263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32343 = new Long(6004168776796799036L);
        Long term32348 = new Long(-2230737261489182178L);
        Boolean term32353 = new Boolean(true);
        Integer term32355 = new Integer(-574105759);
        ArrayList term32360 = new ArrayList();
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        ((ArrayList) term32360).add((Object)null);
        Object term32347 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term32365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32366 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term32347, term32347.getClass(), "id", term32348);
        setField(term32347, term32347.getClass(), "membername", "");
        setField(term32347, term32347.getClass(), "email", "");
        setField(term32347, term32347.getClass(), "password", "");
        setField(term32347, term32347.getClass(), "enabled", term32353);
        setField(term32347, term32347.getClass(), "age", term32355);
        setField(term32347, term32347.getClass(), "phoneNumber", "");
        setField(term32347, term32347.getClass(), "country", "");
        setField(term32347, term32347.getClass(), "birthdate", "");
        setField(term32347, term32347.getClass(), "roles", term32360);
        setBooleanField(term32347, term32347.getClass(), "isUsing2FA", false);
        setField(term32347, term32347.getClass(), "secret", "");
        setField(term32365, term32365.getClass(), "date", null);
        setField(term32365, term32365.getClass(), "time", null);
        setField(term32347, term32347.getClass(), "regDate", term32365);
        setField(term32366, term32366.getClass(), "date", null);
        setField(term32366, term32366.getClass(), "time", null);
        setField(term32347, term32347.getClass(), "modDate", term32366);
        ArrayList term32345 = new ArrayList();
        ((ArrayList) term32345).add(term32347);
        Long term32372 = new Long(1691040836532636814L);
        ArrayList term32375 = new ArrayList();
        Object term32371 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32371, term32371.getClass(), "id", term32372);
        setField(term32371, term32371.getClass(), "name", "");
        setField(term32371, term32371.getClass(), "roles", term32375);
        Long term32379 = new Long(7590864789026672175L);
        ArrayList term32382 = new ArrayList();
        ((ArrayList) term32382).add((Object)null);
        ((ArrayList) term32382).add((Object)null);
        ((ArrayList) term32382).add((Object)null);
        Object term32378 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32378, term32378.getClass(), "id", term32379);
        setField(term32378, term32378.getClass(), "name", "");
        setField(term32378, term32378.getClass(), "roles", term32382);
        Long term32386 = new Long(3632403742038865944L);
        ArrayList term32389 = new ArrayList();
        ((ArrayList) term32389).add((Object)null);
        ((ArrayList) term32389).add((Object)null);
        ((ArrayList) term32389).add((Object)null);
        Object term32385 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32385, term32385.getClass(), "id", term32386);
        setField(term32385, term32385.getClass(), "name", "");
        setField(term32385, term32385.getClass(), "roles", term32389);
        ArrayList term32369 = new ArrayList();
        ((ArrayList) term32369).add(term32371);
        ((ArrayList) term32369).add(term32378);
        ((ArrayList) term32369).add(term32385);
        term32342 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term32342, term32342.getClass(), "id", term32343);
        setField(term32342, term32342.getClass(), "users", term32345);
        setField(term32342, term32342.getClass(), "privileges", term32369);
        setField(term32342, term32342.getClass(), "name", "TGtWGLIjKE");
        term32406 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32406;
        callMethod(klass, "equals", argTypes, term32342, args);
    }

};


