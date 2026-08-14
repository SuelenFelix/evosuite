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

public class GitlabNameSpaceResponse_getWebUrl_181997360816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2128;

    public GitlabNameSpaceResponse_getWebUrl_181997360816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2129 = new Integer(-73683645);
        Integer term2179 = new Integer(-226514366);
        term2128 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term2128, term2128.getClass(), "id", term2129);
        setField(term2128, term2128.getClass(), "name", "QXzGXbEXMu");
        setField(term2128, term2128.getClass(), "path", "qxSDVejjiY");
        setField(term2128, term2128.getClass(), "kind", "xBsXSDjXYK");
        setField(term2128, term2128.getClass(), "fullPath", "sEnIVFtZuQ");
        setField(term2128, term2128.getClass(), "parentId", term2179);
        setField(term2128, term2128.getClass(), "avatarUrl", "ZVecLZMLHF");
        setField(term2128, term2128.getClass(), "webUrl", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebUrl", argTypes, term2128, args);
    }

};


