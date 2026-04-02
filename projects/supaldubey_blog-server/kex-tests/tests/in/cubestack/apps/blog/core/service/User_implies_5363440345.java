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
import java.lang.Object;
import java.util.LinkedList;

public class User_implies_5363440345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602;
     Object term621;

    public User_implies_5363440345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term603 = new Long(7411271909051562686L);
        ArrayList term617 = new ArrayList();
        term602 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.User"));
        setField(term602, term602.getClass(), "personId", term603);
        setField(term602, term602.getClass(), "userName", "IoAlmYsBwc");
        setField(term602, term602.getClass(), "roles", term617);
        LinkedList term624 = new LinkedList();
        LinkedList term630 = new LinkedList();
        LinkedList term636 = new LinkedList();
        term621 = newInstance(Class.forName("javax.security.auth.Subject"));
        Object term622 = newInstance(Class.forName("java.util.Collections$SynchronizedSet"));
        Object term623 = newInstance(Class.forName("javax.security.auth.Subject$SecureSet"));
        Object term628 = newInstance(Class.forName("java.util.Collections$SynchronizedSet"));
        Object term629 = newInstance(Class.forName("javax.security.auth.Subject$SecureSet"));
        Object term634 = newInstance(Class.forName("java.util.Collections$SynchronizedSet"));
        Object term635 = newInstance(Class.forName("javax.security.auth.Subject$SecureSet"));
        setField(term623, term623.getClass(), "subject", term621);
        setField(term623, term623.getClass(), "elements", term624);
        setIntField(term623, term623.getClass(), "which", 1);
        setField(term622, term622.getClass(), "c", term623);
        setField(term622, term622.getClass(), "mutex", term622);
        setField(term621, term621.getClass(), "principals", term622);
        setField(term629, term629.getClass(), "subject", term621);
        setField(term629, term629.getClass(), "elements", term630);
        setIntField(term629, term629.getClass(), "which", 2);
        setField(term628, term628.getClass(), "c", term629);
        setField(term628, term628.getClass(), "mutex", term628);
        setField(term621, term621.getClass(), "pubCredentials", term628);
        setField(term635, term635.getClass(), "subject", term621);
        setField(term635, term635.getClass(), "elements", term636);
        setIntField(term635, term635.getClass(), "which", 3);
        setField(term634, term634.getClass(), "c", term635);
        setField(term634, term634.getClass(), "mutex", term634);
        setField(term621, term621.getClass(), "privCredentials", term634);
        setBooleanField(term621, term621.getClass(), "readOnly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.security.auth.Subject");
        Object[] args = new Object[1];
        args[0] = term621;
        callMethod(klass, "implies", argTypes, term602, args);
    }

};


