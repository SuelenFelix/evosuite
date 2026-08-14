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

public class GitlabProjectResponse_setCreatedAt_213946453515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26783;
     Object term27019;

    public GitlabProjectResponse_setCreatedAt_213946453515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26784 = new Integer(197109649);
        Integer term26928 = new Integer(-1239406390);
        Integer term26930 = new Integer(1557431527);
        Integer term26943 = new Integer(-1504890659);
        Integer term26993 = new Integer(1358829571);
        term26783 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term26846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26942 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term26783, term26783.getClass(), "id", term26784);
        setField(term26783, term26783.getClass(), "description", "yejonZnVuy");
        setField(term26783, term26783.getClass(), "name", "ouesGIsvuG");
        setField(term26783, term26783.getClass(), "nameWithNamespace", "pHBHlmLIZQ");
        setField(term26783, term26783.getClass(), "path", "ZWRAbOuktl");
        setField(term26783, term26783.getClass(), "pathWithNamespace", "iqFRvFmVID");
        setIntField(term26847, term26847.getClass(), "year", 2010);
        setShortField(term26847, term26847.getClass(), "month", (short) 5);
        setShortField(term26847, term26847.getClass(), "day", (short) 2);
        setField(term26846, term26846.getClass(), "date", term26847);
        setByteField(term26851, term26851.getClass(), "hour", (byte) 2);
        setByteField(term26851, term26851.getClass(), "minute", (byte) 22);
        setByteField(term26851, term26851.getClass(), "second", (byte) 33);
        setIntField(term26851, term26851.getClass(), "nano", 530835039);
        setField(term26846, term26846.getClass(), "time", term26851);
        setField(term26783, term26783.getClass(), "createdAt", term26846);
        setField(term26783, term26783.getClass(), "defaultBranch", "pNAEtppZdv");
        setField(term26783, term26783.getClass(), "sshUrlToRepo", "VsFWNMdyRt");
        setField(term26783, term26783.getClass(), "httpUrlToRepo", "QaoYFZhScg");
        setField(term26783, term26783.getClass(), "webUrl", "UTvXIenLCR");
        setField(term26783, term26783.getClass(), "readmeUrl", "PLeKpWaxhQ");
        setField(term26783, term26783.getClass(), "avatarUrl", "EBSKhqDdUW");
        setField(term26783, term26783.getClass(), "forksCount", term26928);
        setField(term26783, term26783.getClass(), "starCount", term26930);
        setIntField(term26933, term26933.getClass(), "year", 2024);
        setShortField(term26933, term26933.getClass(), "month", (short) 4);
        setShortField(term26933, term26933.getClass(), "day", (short) 24);
        setField(term26932, term26932.getClass(), "date", term26933);
        setByteField(term26937, term26937.getClass(), "hour", (byte) 7);
        setByteField(term26937, term26937.getClass(), "minute", (byte) 2);
        setByteField(term26937, term26937.getClass(), "second", (byte) 51);
        setIntField(term26937, term26937.getClass(), "nano", 635502964);
        setField(term26932, term26932.getClass(), "time", term26937);
        setField(term26783, term26783.getClass(), "lastActivityAt", term26932);
        setField(term26942, term26942.getClass(), "id", term26943);
        setField(term26942, term26942.getClass(), "name", "LvLbdICdfA");
        setField(term26942, term26942.getClass(), "path", "rtifrlITwl");
        setField(term26942, term26942.getClass(), "kind", "yGWXZDjnPS");
        setField(term26942, term26942.getClass(), "fullPath", "vZucxbGVyo");
        setField(term26942, term26942.getClass(), "parentId", term26993);
        setField(term26942, term26942.getClass(), "avatarUrl", "ZZoLNbeORl");
        setField(term26942, term26942.getClass(), "webUrl", "XjIOUIzJUP");
        setField(term26783, term26783.getClass(), "namespace", term26942);
        term27019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27024 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27020, term27020.getClass(), "year", 2010);
        setShortField(term27020, term27020.getClass(), "month", (short) 1);
        setShortField(term27020, term27020.getClass(), "day", (short) 17);
        setField(term27019, term27019.getClass(), "date", term27020);
        setByteField(term27024, term27024.getClass(), "hour", (byte) 13);
        setByteField(term27024, term27024.getClass(), "minute", (byte) 5);
        setByteField(term27024, term27024.getClass(), "second", (byte) 51);
        setIntField(term27024, term27024.getClass(), "nano", 362260580);
        setField(term27019, term27019.getClass(), "time", term27024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27019;
        callMethod(klass, "setCreatedAt", argTypes, term26783, args);
    }

};


