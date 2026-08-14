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

public class GitlabNameSpaceResponse_getKind_16895563377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;

    public GitlabNameSpaceResponse_getKind_16895563377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term870 = new Integer(-883034806);
        Integer term920 = new Integer(1585847225);
        term869 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term869, term869.getClass(), "id", term870);
        setField(term869, term869.getClass(), "name", "nyiiPDVjAc");
        setField(term869, term869.getClass(), "path", "aKnKipADSo");
        setField(term869, term869.getClass(), "kind", "wSQxaModmm");
        setField(term869, term869.getClass(), "fullPath", "UlajhuVLaP");
        setField(term869, term869.getClass(), "parentId", term920);
        setField(term869, term869.getClass(), "avatarUrl", "gGSMzuGICf");
        setField(term869, term869.getClass(), "webUrl", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term869, args);
    }

};


