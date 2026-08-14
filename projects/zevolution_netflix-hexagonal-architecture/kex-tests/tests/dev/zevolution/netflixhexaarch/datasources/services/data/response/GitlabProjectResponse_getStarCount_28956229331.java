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

public class GitlabProjectResponse_getStarCount_28956229331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33018;

    public GitlabProjectResponse_getStarCount_28956229331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33019 = new Integer(-282881827);
        Integer term33163 = new Integer(-1183353915);
        Integer term33165 = new Integer(-420030135);
        Integer term33178 = new Integer(267763294);
        Integer term33228 = new Integer(-1497710478);
        term33018 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term33081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33172 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33177 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term33018, term33018.getClass(), "id", term33019);
        setField(term33018, term33018.getClass(), "description", "VygCEWaefB");
        setField(term33018, term33018.getClass(), "name", "PqhYfEyDDA");
        setField(term33018, term33018.getClass(), "nameWithNamespace", "fSLHLeuNoa");
        setField(term33018, term33018.getClass(), "path", "IwgPFurObw");
        setField(term33018, term33018.getClass(), "pathWithNamespace", "WLaHlrYQyz");
        setIntField(term33082, term33082.getClass(), "year", 2027);
        setShortField(term33082, term33082.getClass(), "month", (short) 7);
        setShortField(term33082, term33082.getClass(), "day", (short) 23);
        setField(term33081, term33081.getClass(), "date", term33082);
        setByteField(term33086, term33086.getClass(), "hour", (byte) 12);
        setByteField(term33086, term33086.getClass(), "minute", (byte) 6);
        setByteField(term33086, term33086.getClass(), "second", (byte) 19);
        setIntField(term33086, term33086.getClass(), "nano", 8025683);
        setField(term33081, term33081.getClass(), "time", term33086);
        setField(term33018, term33018.getClass(), "createdAt", term33081);
        setField(term33018, term33018.getClass(), "defaultBranch", "CaeIUTuUFo");
        setField(term33018, term33018.getClass(), "sshUrlToRepo", "rzoDGjHkzG");
        setField(term33018, term33018.getClass(), "httpUrlToRepo", "NsphHxYiuC");
        setField(term33018, term33018.getClass(), "webUrl", "XYJztkznbY");
        setField(term33018, term33018.getClass(), "readmeUrl", "NeTiWVoyjZ");
        setField(term33018, term33018.getClass(), "avatarUrl", "CGeclMyIOP");
        setField(term33018, term33018.getClass(), "forksCount", term33163);
        setField(term33018, term33018.getClass(), "starCount", term33165);
        setIntField(term33168, term33168.getClass(), "year", 2018);
        setShortField(term33168, term33168.getClass(), "month", (short) 2);
        setShortField(term33168, term33168.getClass(), "day", (short) 14);
        setField(term33167, term33167.getClass(), "date", term33168);
        setByteField(term33172, term33172.getClass(), "hour", (byte) 2);
        setByteField(term33172, term33172.getClass(), "minute", (byte) 40);
        setByteField(term33172, term33172.getClass(), "second", (byte) 48);
        setIntField(term33172, term33172.getClass(), "nano", 371006728);
        setField(term33167, term33167.getClass(), "time", term33172);
        setField(term33018, term33018.getClass(), "lastActivityAt", term33167);
        setField(term33177, term33177.getClass(), "id", term33178);
        setField(term33177, term33177.getClass(), "name", "yyWOYvIBsp");
        setField(term33177, term33177.getClass(), "path", "mmpgARMYFV");
        setField(term33177, term33177.getClass(), "kind", "NUqhsZprdZ");
        setField(term33177, term33177.getClass(), "fullPath", "jkzgCqWJrA");
        setField(term33177, term33177.getClass(), "parentId", term33228);
        setField(term33177, term33177.getClass(), "avatarUrl", "rawiXxuyRn");
        setField(term33177, term33177.getClass(), "webUrl", "ZyAecZGope");
        setField(term33018, term33018.getClass(), "namespace", term33177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarCount", argTypes, term33018, args);
    }

};


