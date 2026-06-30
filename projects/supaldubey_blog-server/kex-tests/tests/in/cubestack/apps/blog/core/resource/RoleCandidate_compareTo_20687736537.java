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

public class RoleCandidate_compareTo_20687736537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;
     Object term204;

    public RoleCandidate_compareTo_20687736537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term190 = new Long(7411271909051562686L);
        term189 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate"));
        setField(term189, term189.getClass(), "roleId", term190);
        setField(term189, term189.getClass(), "roleName", "MjGYSRKTNF");
        Long term205 = new Long(4872422362414183754L);
        term204 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate"));
        setField(term204, term204.getClass(), "roleId", term205);
        setField(term204, term204.getClass(), "roleName", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.resource.RoleCandidate");
        Object[] args = new Object[1];
        args[0] = term204;
        callMethod(klass, "compareTo", argTypes, term189, args);
    }

};


