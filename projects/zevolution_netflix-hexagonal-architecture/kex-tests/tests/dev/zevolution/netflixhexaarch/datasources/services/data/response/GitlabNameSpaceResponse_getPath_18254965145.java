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

public class GitlabNameSpaceResponse_getPath_18254965145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573;

    public GitlabNameSpaceResponse_getPath_18254965145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term574 = new Integer(-1339778481);
        Integer term624 = new Integer(1725571209);
        term573 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term573, term573.getClass(), "id", term574);
        setField(term573, term573.getClass(), "name", "vrQLuWIDJX");
        setField(term573, term573.getClass(), "path", "flxyYxBRtu");
        setField(term573, term573.getClass(), "kind", "OclPbYPkcH");
        setField(term573, term573.getClass(), "fullPath", "IoAlmYsBwc");
        setField(term573, term573.getClass(), "parentId", term624);
        setField(term573, term573.getClass(), "avatarUrl", "TEParAifyi");
        setField(term573, term573.getClass(), "webUrl", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term573, args);
    }

};


