package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class PostService_persistPost_179043599414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16996;

    public PostService_persistPost_179043599414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16997 = new Long(-8649738738252714180L);
        ArrayList term17011 = new ArrayList();
        ((ArrayList) term17011).add("jBgJZpHifl");
        term16996 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.User"));
        setField(term16996, term16996.getClass(), "personId", term16997);
        setField(term16996, term16996.getClass(), "userName", "AWtIUOuutt");
        setField(term16996, term16996.getClass(), "roles", term17011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostService");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.service.User");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term16996;
        args[1] = "azMTTmEXnh";
        args[2] = "BjJtxwsIpt";
        args[3] = "gUQhOyGfzF";
        args[4] = "IqDObvPBZX";
        callMethod(klass, "persistPost", argTypes, null, args);
    }

};


