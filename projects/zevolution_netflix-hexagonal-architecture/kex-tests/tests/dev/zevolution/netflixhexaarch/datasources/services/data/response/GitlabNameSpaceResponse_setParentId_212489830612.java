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

public class GitlabNameSpaceResponse_setParentId_212489830612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;
     Object term1675;

    public GitlabNameSpaceResponse_setParentId_212489830612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1599 = new Integer(-117576464);
        Integer term1649 = new Integer(-1007160944);
        term1598 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1598, term1598.getClass(), "id", term1599);
        setField(term1598, term1598.getClass(), "name", "whBvTVIIlC");
        setField(term1598, term1598.getClass(), "path", "IgRJUzaCwW");
        setField(term1598, term1598.getClass(), "kind", "JUmudUmaaV");
        setField(term1598, term1598.getClass(), "fullPath", "KoyGrUJeJW");
        setField(term1598, term1598.getClass(), "parentId", term1649);
        setField(term1598, term1598.getClass(), "avatarUrl", "HqBOwkVqjD");
        setField(term1598, term1598.getClass(), "webUrl", "MAcUBcBckh");
        term1675 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1675;
        callMethod(klass, "setParentId", argTypes, term1598, args);
    }

};


