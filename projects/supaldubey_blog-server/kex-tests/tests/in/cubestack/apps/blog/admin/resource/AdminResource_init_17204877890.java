package in.cubestack.apps.blog.admin.resource;

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
import static in.cubestack.apps.blog.admin.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AdminResource_init_17204877890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34715;
     Object term34729;

    public AdminResource_init_17204877890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34715 = newInstance(Class.forName("in.cubestack.apps.blog.admin.service.AdminService"));
        Object term34716 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.TokenAuthenticationService"));
        setField(term34716, term34716.getClass(), "jwtSecret", "PGfCDJTBek");
        setField(term34715, term34715.getClass(), "tokenAuthenticationService", term34716);
        setField(term34715, term34715.getClass(), "personService", null);
        term34729 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.HttpHelper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.AdminResource");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.admin.service.AdminService");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.base.web.HttpHelper");
        argTypes[2] = Class.forName("in.cubestack.apps.blog.post.service.PostService");
        argTypes[3] = Class.forName("in.cubestack.apps.blog.core.service.PersonService");
        argTypes[4] = Class.forName("in.cubestack.apps.blog.post.service.CategoryService");
        argTypes[5] = Class.forName("in.cubestack.apps.blog.core.service.RoleService");
        argTypes[6] = Class.forName("in.cubestack.apps.blog.post.service.TagService");
        argTypes[7] = Class.forName("in.cubestack.apps.blog.event.service.EventService");
        Object[] args = new Object[8];
        args[0] = term34715;
        args[1] = term34729;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


