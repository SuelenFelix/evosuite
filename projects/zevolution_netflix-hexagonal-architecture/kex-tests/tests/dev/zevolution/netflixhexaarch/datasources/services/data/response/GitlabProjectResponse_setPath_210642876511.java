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

public class GitlabProjectResponse_setPath_210642876511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25115;

    public GitlabProjectResponse_setPath_210642876511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25116 = new Integer(11724947);
        Integer term25260 = new Integer(1953277050);
        Integer term25262 = new Integer(1283079251);
        Integer term25275 = new Integer(-523949691);
        Integer term25325 = new Integer(1398204340);
        term25115 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term25178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25183 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25274 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term25115, term25115.getClass(), "id", term25116);
        setField(term25115, term25115.getClass(), "description", "zjfMxUERFZ");
        setField(term25115, term25115.getClass(), "name", "ooVlhmiOff");
        setField(term25115, term25115.getClass(), "nameWithNamespace", "dUNzDLXJcj");
        setField(term25115, term25115.getClass(), "path", "OrVSjRJVwa");
        setField(term25115, term25115.getClass(), "pathWithNamespace", "cdZEcINJAM");
        setIntField(term25179, term25179.getClass(), "year", 2028);
        setShortField(term25179, term25179.getClass(), "month", (short) 10);
        setShortField(term25179, term25179.getClass(), "day", (short) 1);
        setField(term25178, term25178.getClass(), "date", term25179);
        setByteField(term25183, term25183.getClass(), "hour", (byte) 17);
        setByteField(term25183, term25183.getClass(), "minute", (byte) 29);
        setByteField(term25183, term25183.getClass(), "second", (byte) 30);
        setIntField(term25183, term25183.getClass(), "nano", 845472306);
        setField(term25178, term25178.getClass(), "time", term25183);
        setField(term25115, term25115.getClass(), "createdAt", term25178);
        setField(term25115, term25115.getClass(), "defaultBranch", "qumYSwcWHz");
        setField(term25115, term25115.getClass(), "sshUrlToRepo", "raNzcEorkV");
        setField(term25115, term25115.getClass(), "httpUrlToRepo", "nEgozCeoUr");
        setField(term25115, term25115.getClass(), "webUrl", "EWGMzlcOnW");
        setField(term25115, term25115.getClass(), "readmeUrl", "XeSDJYKMBf");
        setField(term25115, term25115.getClass(), "avatarUrl", "tIsFcOGTUX");
        setField(term25115, term25115.getClass(), "forksCount", term25260);
        setField(term25115, term25115.getClass(), "starCount", term25262);
        setIntField(term25265, term25265.getClass(), "year", 2027);
        setShortField(term25265, term25265.getClass(), "month", (short) 2);
        setShortField(term25265, term25265.getClass(), "day", (short) 19);
        setField(term25264, term25264.getClass(), "date", term25265);
        setByteField(term25269, term25269.getClass(), "hour", (byte) 17);
        setByteField(term25269, term25269.getClass(), "minute", (byte) 37);
        setByteField(term25269, term25269.getClass(), "second", (byte) 27);
        setIntField(term25269, term25269.getClass(), "nano", 920380537);
        setField(term25264, term25264.getClass(), "time", term25269);
        setField(term25115, term25115.getClass(), "lastActivityAt", term25264);
        setField(term25274, term25274.getClass(), "id", term25275);
        setField(term25274, term25274.getClass(), "name", "XUVRcnELFP");
        setField(term25274, term25274.getClass(), "path", "xIeSbezmkD");
        setField(term25274, term25274.getClass(), "kind", "txUWLZRkSv");
        setField(term25274, term25274.getClass(), "fullPath", "gHRMJRsBGm");
        setField(term25274, term25274.getClass(), "parentId", term25325);
        setField(term25274, term25274.getClass(), "avatarUrl", "rZyrfnMvHa");
        setField(term25274, term25274.getClass(), "webUrl", "GMyMhTZeDC");
        setField(term25115, term25115.getClass(), "namespace", term25274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KqQOTshBOL";
        callMethod(klass, "setPath", argTypes, term25115, args);
    }

};


