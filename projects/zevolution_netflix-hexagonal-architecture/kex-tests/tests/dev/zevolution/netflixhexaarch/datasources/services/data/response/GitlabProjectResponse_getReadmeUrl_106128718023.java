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

public class GitlabProjectResponse_getReadmeUrl_106128718023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25961;

    public GitlabProjectResponse_getReadmeUrl_106128718023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25962 = new Integer(1358829571);
        Integer term26106 = new Integer(991356662);
        Integer term26108 = new Integer(-506958186);
        Integer term26121 = new Integer(-507387516);
        Integer term26171 = new Integer(-1970452551);
        term25961 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term26024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26120 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term25961, term25961.getClass(), "id", term25962);
        setField(term25961, term25961.getClass(), "description", "pLbTzSMbsN");
        setField(term25961, term25961.getClass(), "name", "lFSbxerCPP");
        setField(term25961, term25961.getClass(), "nameWithNamespace", "vjaZIyixCm");
        setField(term25961, term25961.getClass(), "path", "gAAPyftlIR");
        setField(term25961, term25961.getClass(), "pathWithNamespace", "kevWstoxwq");
        setIntField(term26025, term26025.getClass(), "year", 2017);
        setShortField(term26025, term26025.getClass(), "month", (short) 4);
        setShortField(term26025, term26025.getClass(), "day", (short) 3);
        setField(term26024, term26024.getClass(), "date", term26025);
        setByteField(term26029, term26029.getClass(), "hour", (byte) 6);
        setByteField(term26029, term26029.getClass(), "minute", (byte) 51);
        setByteField(term26029, term26029.getClass(), "second", (byte) 10);
        setIntField(term26029, term26029.getClass(), "nano", 316377166);
        setField(term26024, term26024.getClass(), "time", term26029);
        setField(term25961, term25961.getClass(), "createdAt", term26024);
        setField(term25961, term25961.getClass(), "defaultBranch", "aSYOhFwzSm");
        setField(term25961, term25961.getClass(), "sshUrlToRepo", "pVZlzrBeDB");
        setField(term25961, term25961.getClass(), "httpUrlToRepo", "EfSUvjuZAA");
        setField(term25961, term25961.getClass(), "webUrl", "PrHWfHydsG");
        setField(term25961, term25961.getClass(), "readmeUrl", "igruEzTbBE");
        setField(term25961, term25961.getClass(), "avatarUrl", "LFjgROsRUV");
        setField(term25961, term25961.getClass(), "forksCount", term26106);
        setField(term25961, term25961.getClass(), "starCount", term26108);
        setIntField(term26111, term26111.getClass(), "year", 2027);
        setShortField(term26111, term26111.getClass(), "month", (short) 8);
        setShortField(term26111, term26111.getClass(), "day", (short) 23);
        setField(term26110, term26110.getClass(), "date", term26111);
        setByteField(term26115, term26115.getClass(), "hour", (byte) 15);
        setByteField(term26115, term26115.getClass(), "minute", (byte) 12);
        setByteField(term26115, term26115.getClass(), "second", (byte) 6);
        setIntField(term26115, term26115.getClass(), "nano", 541218258);
        setField(term26110, term26110.getClass(), "time", term26115);
        setField(term25961, term25961.getClass(), "lastActivityAt", term26110);
        setField(term26120, term26120.getClass(), "id", term26121);
        setField(term26120, term26120.getClass(), "name", "kHxujKiCsr");
        setField(term26120, term26120.getClass(), "path", "cseZveWowm");
        setField(term26120, term26120.getClass(), "kind", "idfslIPhgx");
        setField(term26120, term26120.getClass(), "fullPath", "HyFLOXeoDX");
        setField(term26120, term26120.getClass(), "parentId", term26171);
        setField(term26120, term26120.getClass(), "avatarUrl", "crkNabVaWs");
        setField(term26120, term26120.getClass(), "webUrl", "qBcAJgrABE");
        setField(term25961, term25961.getClass(), "namespace", term26120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReadmeUrl", argTypes, term25961, args);
    }

};


