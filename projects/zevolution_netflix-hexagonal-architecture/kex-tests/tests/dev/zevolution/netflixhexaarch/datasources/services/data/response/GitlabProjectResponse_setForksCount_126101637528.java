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
import java.lang.Object;

public class GitlabProjectResponse_setForksCount_126101637528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28035;
     Object term28271;

    public GitlabProjectResponse_setForksCount_126101637528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28036 = new Integer(-571169753);
        Integer term28180 = new Integer(318591690);
        Integer term28182 = new Integer(-165587447);
        Integer term28195 = new Integer(-1347358701);
        Integer term28245 = new Integer(806595993);
        term28035 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term28098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28194 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term28035, term28035.getClass(), "id", term28036);
        setField(term28035, term28035.getClass(), "description", "JCWSoxnBJs");
        setField(term28035, term28035.getClass(), "name", "vAxcpvjEEa");
        setField(term28035, term28035.getClass(), "nameWithNamespace", "FCkOgIBqXE");
        setField(term28035, term28035.getClass(), "path", "kadRHthQRD");
        setField(term28035, term28035.getClass(), "pathWithNamespace", "cGbJSRSpNn");
        setIntField(term28099, term28099.getClass(), "year", 2011);
        setShortField(term28099, term28099.getClass(), "month", (short) 9);
        setShortField(term28099, term28099.getClass(), "day", (short) 25);
        setField(term28098, term28098.getClass(), "date", term28099);
        setByteField(term28103, term28103.getClass(), "hour", (byte) 16);
        setByteField(term28103, term28103.getClass(), "minute", (byte) 45);
        setByteField(term28103, term28103.getClass(), "second", (byte) 19);
        setIntField(term28103, term28103.getClass(), "nano", 962864785);
        setField(term28098, term28098.getClass(), "time", term28103);
        setField(term28035, term28035.getClass(), "createdAt", term28098);
        setField(term28035, term28035.getClass(), "defaultBranch", "MzXzaqaiHW");
        setField(term28035, term28035.getClass(), "sshUrlToRepo", "jWOWtrhVkA");
        setField(term28035, term28035.getClass(), "httpUrlToRepo", "IyOhWYyaDV");
        setField(term28035, term28035.getClass(), "webUrl", "omWrkCSFzy");
        setField(term28035, term28035.getClass(), "readmeUrl", "VFYvUTgYFB");
        setField(term28035, term28035.getClass(), "avatarUrl", "BrWqhEIUUj");
        setField(term28035, term28035.getClass(), "forksCount", term28180);
        setField(term28035, term28035.getClass(), "starCount", term28182);
        setIntField(term28185, term28185.getClass(), "year", 2022);
        setShortField(term28185, term28185.getClass(), "month", (short) 6);
        setShortField(term28185, term28185.getClass(), "day", (short) 20);
        setField(term28184, term28184.getClass(), "date", term28185);
        setByteField(term28189, term28189.getClass(), "hour", (byte) 7);
        setByteField(term28189, term28189.getClass(), "minute", (byte) 57);
        setByteField(term28189, term28189.getClass(), "second", (byte) 37);
        setIntField(term28189, term28189.getClass(), "nano", 90374877);
        setField(term28184, term28184.getClass(), "time", term28189);
        setField(term28035, term28035.getClass(), "lastActivityAt", term28184);
        setField(term28194, term28194.getClass(), "id", term28195);
        setField(term28194, term28194.getClass(), "name", "WfUmxdiHcU");
        setField(term28194, term28194.getClass(), "path", "BRrftvRvmF");
        setField(term28194, term28194.getClass(), "kind", "fvoyRbZTsm");
        setField(term28194, term28194.getClass(), "fullPath", "iOCnOQXWTl");
        setField(term28194, term28194.getClass(), "parentId", term28245);
        setField(term28194, term28194.getClass(), "avatarUrl", "ARnOWpgtAg");
        setField(term28194, term28194.getClass(), "webUrl", "MRrYxZoJBW");
        setField(term28035, term28035.getClass(), "namespace", term28194);
        term28271 = new Integer(548228925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term28271;
        callMethod(klass, "setForksCount", argTypes, term28035, args);
    }

};


