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

public class Role_toString_16779904914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32417;

    public Role_toString_16779904914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32418 = new Long(-1737271237161382461L);
        ArrayList term32420 = new ArrayList();
        Long term32427 = new Long(-571195326224126202L);
        ArrayList term32430 = new ArrayList();
        ((ArrayList) term32430).add((Object)null);
        ((ArrayList) term32430).add((Object)null);
        ((ArrayList) term32430).add((Object)null);
        ((ArrayList) term32430).add((Object)null);
        Object term32426 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32426, term32426.getClass(), "id", term32427);
        setField(term32426, term32426.getClass(), "name", "");
        setField(term32426, term32426.getClass(), "roles", term32430);
        Long term32434 = new Long(-5691770586987635129L);
        ArrayList term32437 = new ArrayList();
        ((ArrayList) term32437).add((Object)null);
        ((ArrayList) term32437).add((Object)null);
        ((ArrayList) term32437).add((Object)null);
        ((ArrayList) term32437).add((Object)null);
        ((ArrayList) term32437).add((Object)null);
        Object term32433 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32433, term32433.getClass(), "id", term32434);
        setField(term32433, term32433.getClass(), "name", "");
        setField(term32433, term32433.getClass(), "roles", term32437);
        Long term32441 = new Long(-8721079966012575280L);
        ArrayList term32444 = new ArrayList();
        ((ArrayList) term32444).add((Object)null);
        ((ArrayList) term32444).add((Object)null);
        ((ArrayList) term32444).add((Object)null);
        ((ArrayList) term32444).add((Object)null);
        Object term32440 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32440, term32440.getClass(), "id", term32441);
        setField(term32440, term32440.getClass(), "name", "");
        setField(term32440, term32440.getClass(), "roles", term32444);
        Long term32448 = new Long(278469276073195090L);
        ArrayList term32451 = new ArrayList();
        Object term32447 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32447, term32447.getClass(), "id", term32448);
        setField(term32447, term32447.getClass(), "name", "");
        setField(term32447, term32447.getClass(), "roles", term32451);
        Long term32455 = new Long(-2627351923440470903L);
        ArrayList term32458 = new ArrayList();
        ((ArrayList) term32458).add((Object)null);
        ((ArrayList) term32458).add((Object)null);
        ((ArrayList) term32458).add((Object)null);
        Object term32454 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32454, term32454.getClass(), "id", term32455);
        setField(term32454, term32454.getClass(), "name", "");
        setField(term32454, term32454.getClass(), "roles", term32458);
        ArrayList term32424 = new ArrayList();
        ((ArrayList) term32424).add(term32426);
        ((ArrayList) term32424).add(term32433);
        ((ArrayList) term32424).add(term32440);
        ((ArrayList) term32424).add(term32447);
        ((ArrayList) term32424).add(term32454);
        ((ArrayList) term32424).add(term32440);
        term32417 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term32417, term32417.getClass(), "id", term32418);
        setField(term32417, term32417.getClass(), "users", term32420);
        setField(term32417, term32417.getClass(), "privileges", term32424);
        setField(term32417, term32417.getClass(), "name", "jrZmqbTcJl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term32417, args);
    }

};


