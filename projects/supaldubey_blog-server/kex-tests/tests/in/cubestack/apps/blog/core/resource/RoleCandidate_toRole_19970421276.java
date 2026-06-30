package in.cubestack.apps.blog.core.resource;

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
import static in.cubestack.apps.blog.core.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class RoleCandidate_toRole_19970421276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public RoleCandidate_toRole_19970421276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165 = new Long(5270370404989704783L);
        term164 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate"));
        setField(term164, term164.getClass(), "roleId", term165);
        setField(term164, term164.getClass(), "roleName", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toRole", argTypes, term164, args);
    }

};


