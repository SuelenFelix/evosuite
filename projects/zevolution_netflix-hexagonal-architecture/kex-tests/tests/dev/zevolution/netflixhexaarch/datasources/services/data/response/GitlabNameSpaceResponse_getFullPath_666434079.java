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

public class GitlabNameSpaceResponse_getFullPath_666434079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;

    public GitlabNameSpaceResponse_getFullPath_666434079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1166 = new Integer(-1456670397);
        Integer term1216 = new Integer(1622346318);
        term1165 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1165, term1165.getClass(), "id", term1166);
        setField(term1165, term1165.getClass(), "name", "UiUYnPrcCi");
        setField(term1165, term1165.getClass(), "path", "UoYtihxVaS");
        setField(term1165, term1165.getClass(), "kind", "JDswTTCZHV");
        setField(term1165, term1165.getClass(), "fullPath", "onpbIeEKoi");
        setField(term1165, term1165.getClass(), "parentId", term1216);
        setField(term1165, term1165.getClass(), "avatarUrl", "YRHGsAkhxb");
        setField(term1165, term1165.getClass(), "webUrl", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullPath", argTypes, term1165, args);
    }

};


