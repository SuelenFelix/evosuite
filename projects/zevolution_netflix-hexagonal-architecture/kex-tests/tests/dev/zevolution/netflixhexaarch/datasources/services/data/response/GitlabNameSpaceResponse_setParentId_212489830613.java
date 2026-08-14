package dev.zevolution.netflixhexaarch.datasources.services.data.response;

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
import static dev.zevolution.netflixhexaarch.datasources.services.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GitlabNameSpaceResponse_setParentId_212489830613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1693;
     Object term1770;

    public GitlabNameSpaceResponse_setParentId_212489830613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1694 = new Integer(1135664017);
        Integer term1744 = new Integer(590364439);
        term1693 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1693, term1693.getClass(), "id", term1694);
        setField(term1693, term1693.getClass(), "name", "LvJFtLBaxj");
        setField(term1693, term1693.getClass(), "path", "PHvxnGHptP");
        setField(term1693, term1693.getClass(), "kind", "TimdotUuNC");
        setField(term1693, term1693.getClass(), "fullPath", "PkWMRdJcBb");
        setField(term1693, term1693.getClass(), "parentId", term1744);
        setField(term1693, term1693.getClass(), "avatarUrl", "jSpAteRute");
        setField(term1693, term1693.getClass(), "webUrl", "swZVeJAxjt");
        term1770 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1770;
        callMethod(klass, "setParentId", argTypes, term1693, args);
    }

};


