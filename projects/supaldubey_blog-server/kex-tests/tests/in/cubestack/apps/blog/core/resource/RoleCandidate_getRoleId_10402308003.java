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

public class RoleCandidate_getRoleId_10402308003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public RoleCandidate_getRoleId_10402308003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68 = new Long(2442117782898005296L);
        term67 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate"));
        setField(term67, term67.getClass(), "roleId", term68);
        setField(term67, term67.getClass(), "roleName", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoleId", argTypes, term67, args);
    }

};


