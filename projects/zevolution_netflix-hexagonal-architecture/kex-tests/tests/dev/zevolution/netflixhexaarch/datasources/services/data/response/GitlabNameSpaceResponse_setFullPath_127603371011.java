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

public class GitlabNameSpaceResponse_setFullPath_127603371011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397;

    public GitlabNameSpaceResponse_setFullPath_127603371011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1398 = new Integer(-6029667);
        Integer term1448 = new Integer(-2068769794);
        term1397 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1397, term1397.getClass(), "id", term1398);
        setField(term1397, term1397.getClass(), "name", "JUmudUmaaV");
        setField(term1397, term1397.getClass(), "path", "KoyGrUJeJW");
        setField(term1397, term1397.getClass(), "kind", "HqBOwkVqjD");
        setField(term1397, term1397.getClass(), "fullPath", "MAcUBcBckh");
        setField(term1397, term1397.getClass(), "parentId", term1448);
        setField(term1397, term1397.getClass(), "avatarUrl", "oVgzLbrsFr");
        setField(term1397, term1397.getClass(), "webUrl", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "setFullPath", argTypes, term1397, args);
    }

};


