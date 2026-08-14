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

public class GitlabProjectResponse_setStarCount_48614821032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33424;
     Object term33660;

    public GitlabProjectResponse_setStarCount_48614821032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33425 = new Integer(49950830);
        Integer term33569 = new Integer(-525257914);
        Integer term33571 = new Integer(147209682);
        Integer term33584 = new Integer(34470066);
        Integer term33634 = new Integer(2058711405);
        term33424 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term33487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33492 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33578 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33583 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term33424, term33424.getClass(), "id", term33425);
        setField(term33424, term33424.getClass(), "description", "uYnmxkwLfB");
        setField(term33424, term33424.getClass(), "name", "RVZTQxYOUO");
        setField(term33424, term33424.getClass(), "nameWithNamespace", "tydPpKxAbv");
        setField(term33424, term33424.getClass(), "path", "CJxQpJUfLJ");
        setField(term33424, term33424.getClass(), "pathWithNamespace", "NUUjAyqOva");
        setIntField(term33488, term33488.getClass(), "year", 2025);
        setShortField(term33488, term33488.getClass(), "month", (short) 8);
        setShortField(term33488, term33488.getClass(), "day", (short) 22);
        setField(term33487, term33487.getClass(), "date", term33488);
        setByteField(term33492, term33492.getClass(), "hour", (byte) 6);
        setByteField(term33492, term33492.getClass(), "minute", (byte) 48);
        setByteField(term33492, term33492.getClass(), "second", (byte) 49);
        setIntField(term33492, term33492.getClass(), "nano", 46400229);
        setField(term33487, term33487.getClass(), "time", term33492);
        setField(term33424, term33424.getClass(), "createdAt", term33487);
        setField(term33424, term33424.getClass(), "defaultBranch", "EoAMIIUdDX");
        setField(term33424, term33424.getClass(), "sshUrlToRepo", "OATNwRncsv");
        setField(term33424, term33424.getClass(), "httpUrlToRepo", "rACmzcmIPm");
        setField(term33424, term33424.getClass(), "webUrl", "OCtePrLDhe");
        setField(term33424, term33424.getClass(), "readmeUrl", "yqEphNxUPZ");
        setField(term33424, term33424.getClass(), "avatarUrl", "mJJxTuZuKO");
        setField(term33424, term33424.getClass(), "forksCount", term33569);
        setField(term33424, term33424.getClass(), "starCount", term33571);
        setIntField(term33574, term33574.getClass(), "year", 2028);
        setShortField(term33574, term33574.getClass(), "month", (short) 4);
        setShortField(term33574, term33574.getClass(), "day", (short) 1);
        setField(term33573, term33573.getClass(), "date", term33574);
        setByteField(term33578, term33578.getClass(), "hour", (byte) 16);
        setByteField(term33578, term33578.getClass(), "minute", (byte) 22);
        setByteField(term33578, term33578.getClass(), "second", (byte) 32);
        setIntField(term33578, term33578.getClass(), "nano", 406353763);
        setField(term33573, term33573.getClass(), "time", term33578);
        setField(term33424, term33424.getClass(), "lastActivityAt", term33573);
        setField(term33583, term33583.getClass(), "id", term33584);
        setField(term33583, term33583.getClass(), "name", "anSZCikKpS");
        setField(term33583, term33583.getClass(), "path", "zvMQGbTtsV");
        setField(term33583, term33583.getClass(), "kind", "DyUuIDzZPG");
        setField(term33583, term33583.getClass(), "fullPath", "EGQLusEtRN");
        setField(term33583, term33583.getClass(), "parentId", term33634);
        setField(term33583, term33583.getClass(), "avatarUrl", "GwGUMPdvZq");
        setField(term33583, term33583.getClass(), "webUrl", "iXRAYcFyfS");
        setField(term33424, term33424.getClass(), "namespace", term33583);
        term33660 = new Integer(1743683601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term33660;
        callMethod(klass, "setStarCount", argTypes, term33424, args);
    }

};


