package in.cubestack.apps.blog.core.service;

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
import static in.cubestack.apps.blog.core.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class User_getName_16998208704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463;

    public User_getName_16998208704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term464 = new Long(5270370404989704783L);
        ArrayList term478 = new ArrayList();
        ((ArrayList) term478).add("eZFUvlxvGV");
        ((ArrayList) term478).add("BYqFIqCKAV");
        ((ArrayList) term478).add("vrQLuWIDJX");
        ((ArrayList) term478).add("flxyYxBRtu");
        ((ArrayList) term478).add("OclPbYPkcH");
        term463 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.User"));
        setField(term463, term463.getClass(), "personId", term464);
        setField(term463, term463.getClass(), "userName", "xOEqzGAmDU");
        setField(term463, term463.getClass(), "roles", term478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term463, args);
    }

};


