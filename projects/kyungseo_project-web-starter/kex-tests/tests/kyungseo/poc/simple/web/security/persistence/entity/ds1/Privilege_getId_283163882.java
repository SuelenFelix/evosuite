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

public class Privilege_getId_283163882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7301;

    public Privilege_getId_283163882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7302 = new Long(-3231440836116263235L);
        Long term7319 = new Long(8010417010297313651L);
        ArrayList term7321 = new ArrayList();
        ((ArrayList) term7321).add((Object)null);
        ((ArrayList) term7321).add((Object)null);
        ArrayList term7324 = new ArrayList();
        ((ArrayList) term7324).add((Object)null);
        ((ArrayList) term7324).add((Object)null);
        ((ArrayList) term7324).add((Object)null);
        ((ArrayList) term7324).add((Object)null);
        Object term7318 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7318, term7318.getClass(), "id", term7319);
        setField(term7318, term7318.getClass(), "users", term7321);
        setField(term7318, term7318.getClass(), "privileges", term7324);
        setField(term7318, term7318.getClass(), "name", "");
        Long term7329 = new Long(-3753621038448351550L);
        ArrayList term7331 = new ArrayList();
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ((ArrayList) term7331).add((Object)null);
        ArrayList term7334 = new ArrayList();
        ((ArrayList) term7334).add((Object)null);
        ((ArrayList) term7334).add((Object)null);
        ((ArrayList) term7334).add((Object)null);
        ((ArrayList) term7334).add((Object)null);
        ((ArrayList) term7334).add((Object)null);
        ((ArrayList) term7334).add((Object)null);
        Object term7328 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7328, term7328.getClass(), "id", term7329);
        setField(term7328, term7328.getClass(), "users", term7331);
        setField(term7328, term7328.getClass(), "privileges", term7334);
        setField(term7328, term7328.getClass(), "name", "");
        Long term7339 = new Long(3423155413133381764L);
        ArrayList term7341 = new ArrayList();
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ((ArrayList) term7341).add((Object)null);
        ArrayList term7344 = new ArrayList();
        ((ArrayList) term7344).add((Object)null);
        Object term7338 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7338, term7338.getClass(), "id", term7339);
        setField(term7338, term7338.getClass(), "users", term7341);
        setField(term7338, term7338.getClass(), "privileges", term7344);
        setField(term7338, term7338.getClass(), "name", "");
        Long term7349 = new Long(5304481534735378567L);
        ArrayList term7351 = new ArrayList();
        ArrayList term7354 = new ArrayList();
        ((ArrayList) term7354).add((Object)null);
        ((ArrayList) term7354).add((Object)null);
        Object term7348 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7348, term7348.getClass(), "id", term7349);
        setField(term7348, term7348.getClass(), "users", term7351);
        setField(term7348, term7348.getClass(), "privileges", term7354);
        setField(term7348, term7348.getClass(), "name", "");
        Long term7359 = new Long(3453457027014743006L);
        ArrayList term7361 = new ArrayList();
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        ArrayList term7364 = new ArrayList();
        ((ArrayList) term7364).add((Object)null);
        ((ArrayList) term7364).add((Object)null);
        ((ArrayList) term7364).add((Object)null);
        ((ArrayList) term7364).add((Object)null);
        ((ArrayList) term7364).add((Object)null);
        Object term7358 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7358, term7358.getClass(), "id", term7359);
        setField(term7358, term7358.getClass(), "users", term7361);
        setField(term7358, term7358.getClass(), "privileges", term7364);
        setField(term7358, term7358.getClass(), "name", "");
        ArrayList term7316 = new ArrayList();
        ((ArrayList) term7316).add(term7318);
        ((ArrayList) term7316).add(term7328);
        ((ArrayList) term7316).add(term7338);
        ((ArrayList) term7316).add(term7348);
        ((ArrayList) term7316).add(term7328);
        ((ArrayList) term7316).add(term7348);
        ((ArrayList) term7316).add(term7358);
        ((ArrayList) term7316).add(term7348);
        ((ArrayList) term7316).add(term7328);
        term7301 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term7301, term7301.getClass(), "id", term7302);
        setField(term7301, term7301.getClass(), "name", "pHBHlmLIZQ");
        setField(term7301, term7301.getClass(), "roles", term7316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7301, args);
    }

};


