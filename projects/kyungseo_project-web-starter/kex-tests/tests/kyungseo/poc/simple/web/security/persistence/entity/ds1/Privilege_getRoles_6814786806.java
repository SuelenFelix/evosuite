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

public class Privilege_getRoles_6814786806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7681;

    public Privilege_getRoles_6814786806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7682 = new Long(4354242424632479389L);
        Long term7699 = new Long(-4146453776626172590L);
        ArrayList term7701 = new ArrayList();
        ArrayList term7704 = new ArrayList();
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        Object term7698 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7698, term7698.getClass(), "id", term7699);
        setField(term7698, term7698.getClass(), "users", term7701);
        setField(term7698, term7698.getClass(), "privileges", term7704);
        setField(term7698, term7698.getClass(), "name", "");
        Long term7709 = new Long(2018084438165711668L);
        ArrayList term7711 = new ArrayList();
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ((ArrayList) term7711).add((Object)null);
        ArrayList term7714 = new ArrayList();
        ((ArrayList) term7714).add((Object)null);
        ((ArrayList) term7714).add((Object)null);
        ((ArrayList) term7714).add((Object)null);
        ((ArrayList) term7714).add((Object)null);
        Object term7708 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7708, term7708.getClass(), "id", term7709);
        setField(term7708, term7708.getClass(), "users", term7711);
        setField(term7708, term7708.getClass(), "privileges", term7714);
        setField(term7708, term7708.getClass(), "name", "");
        Long term7719 = new Long(1350676497718116574L);
        ArrayList term7721 = new ArrayList();
        ((ArrayList) term7721).add((Object)null);
        ((ArrayList) term7721).add((Object)null);
        ((ArrayList) term7721).add((Object)null);
        ArrayList term7724 = new ArrayList();
        ((ArrayList) term7724).add((Object)null);
        ((ArrayList) term7724).add((Object)null);
        ((ArrayList) term7724).add((Object)null);
        ((ArrayList) term7724).add((Object)null);
        Object term7718 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7718, term7718.getClass(), "id", term7719);
        setField(term7718, term7718.getClass(), "users", term7721);
        setField(term7718, term7718.getClass(), "privileges", term7724);
        setField(term7718, term7718.getClass(), "name", "");
        Long term7729 = new Long(8847748922379375307L);
        ArrayList term7731 = new ArrayList();
        ((ArrayList) term7731).add((Object)null);
        ((ArrayList) term7731).add((Object)null);
        ((ArrayList) term7731).add((Object)null);
        ((ArrayList) term7731).add((Object)null);
        ((ArrayList) term7731).add((Object)null);
        ((ArrayList) term7731).add((Object)null);
        ArrayList term7734 = new ArrayList();
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        ((ArrayList) term7734).add((Object)null);
        Object term7728 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term7728, term7728.getClass(), "id", term7729);
        setField(term7728, term7728.getClass(), "users", term7731);
        setField(term7728, term7728.getClass(), "privileges", term7734);
        setField(term7728, term7728.getClass(), "name", "");
        ArrayList term7696 = new ArrayList();
        ((ArrayList) term7696).add(term7698);
        ((ArrayList) term7696).add(term7708);
        ((ArrayList) term7696).add(term7718);
        ((ArrayList) term7696).add(term7708);
        ((ArrayList) term7696).add(term7728);
        ((ArrayList) term7696).add(term7728);
        term7681 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term7681, term7681.getClass(), "id", term7682);
        setField(term7681, term7681.getClass(), "name", "zUXaSvayQe");
        setField(term7681, term7681.getClass(), "roles", term7696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term7681, args);
    }

};


