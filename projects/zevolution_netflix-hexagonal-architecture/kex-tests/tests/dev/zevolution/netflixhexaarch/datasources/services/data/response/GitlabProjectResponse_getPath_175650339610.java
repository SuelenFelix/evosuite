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

public class GitlabProjectResponse_getPath_175650339610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24709;

    public GitlabProjectResponse_getPath_175650339610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24710 = new Integer(-1498296052);
        Integer term24854 = new Integer(2098647989);
        Integer term24856 = new Integer(1598895173);
        Integer term24869 = new Integer(1830648570);
        Integer term24919 = new Integer(-227365013);
        term24709 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term24772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24777 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24868 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term24709, term24709.getClass(), "id", term24710);
        setField(term24709, term24709.getClass(), "description", "xzGnrvbExX");
        setField(term24709, term24709.getClass(), "name", "LFZNDELxUZ");
        setField(term24709, term24709.getClass(), "nameWithNamespace", "GNIVsSTglt");
        setField(term24709, term24709.getClass(), "path", "mzPebFiUSP");
        setField(term24709, term24709.getClass(), "pathWithNamespace", "HvbkjsQyDy");
        setIntField(term24773, term24773.getClass(), "year", 2025);
        setShortField(term24773, term24773.getClass(), "month", (short) 3);
        setShortField(term24773, term24773.getClass(), "day", (short) 9);
        setField(term24772, term24772.getClass(), "date", term24773);
        setByteField(term24777, term24777.getClass(), "hour", (byte) 5);
        setByteField(term24777, term24777.getClass(), "minute", (byte) 49);
        setByteField(term24777, term24777.getClass(), "second", (byte) 12);
        setIntField(term24777, term24777.getClass(), "nano", 791695028);
        setField(term24772, term24772.getClass(), "time", term24777);
        setField(term24709, term24709.getClass(), "createdAt", term24772);
        setField(term24709, term24709.getClass(), "defaultBranch", "wzSukELQFL");
        setField(term24709, term24709.getClass(), "sshUrlToRepo", "VZyeaOWYEj");
        setField(term24709, term24709.getClass(), "httpUrlToRepo", "PErxMBQSUv");
        setField(term24709, term24709.getClass(), "webUrl", "KZQwbvujui");
        setField(term24709, term24709.getClass(), "readmeUrl", "JPUZuGxKlI");
        setField(term24709, term24709.getClass(), "avatarUrl", "xqIbVsUspl");
        setField(term24709, term24709.getClass(), "forksCount", term24854);
        setField(term24709, term24709.getClass(), "starCount", term24856);
        setIntField(term24859, term24859.getClass(), "year", 2023);
        setShortField(term24859, term24859.getClass(), "month", (short) 9);
        setShortField(term24859, term24859.getClass(), "day", (short) 23);
        setField(term24858, term24858.getClass(), "date", term24859);
        setByteField(term24863, term24863.getClass(), "hour", (byte) 12);
        setByteField(term24863, term24863.getClass(), "minute", (byte) 55);
        setByteField(term24863, term24863.getClass(), "second", (byte) 58);
        setIntField(term24863, term24863.getClass(), "nano", 159178396);
        setField(term24858, term24858.getClass(), "time", term24863);
        setField(term24709, term24709.getClass(), "lastActivityAt", term24858);
        setField(term24868, term24868.getClass(), "id", term24869);
        setField(term24868, term24868.getClass(), "name", "GnjLRtJywq");
        setField(term24868, term24868.getClass(), "path", "TDaodpHTRK");
        setField(term24868, term24868.getClass(), "kind", "JayazbYDLK");
        setField(term24868, term24868.getClass(), "fullPath", "ORDuSTrpNA");
        setField(term24868, term24868.getClass(), "parentId", term24919);
        setField(term24868, term24868.getClass(), "avatarUrl", "hysThIPoEJ");
        setField(term24868, term24868.getClass(), "webUrl", "dfZepHfGwh");
        setField(term24709, term24709.getClass(), "namespace", term24868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term24709, args);
    }

};


