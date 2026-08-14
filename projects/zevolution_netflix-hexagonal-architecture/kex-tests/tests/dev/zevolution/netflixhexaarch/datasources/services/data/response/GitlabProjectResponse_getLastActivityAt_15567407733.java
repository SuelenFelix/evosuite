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

public class GitlabProjectResponse_getLastActivityAt_15567407733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33832;

    public GitlabProjectResponse_getLastActivityAt_15567407733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33833 = new Integer(-945116798);
        Integer term33977 = new Integer(1593461795);
        Integer term33979 = new Integer(515182546);
        Integer term33992 = new Integer(-936895502);
        Integer term34042 = new Integer(-129547140);
        term33832 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term33895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33991 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term33832, term33832.getClass(), "id", term33833);
        setField(term33832, term33832.getClass(), "description", "lokyclbLEz");
        setField(term33832, term33832.getClass(), "name", "hAPmQGaxkI");
        setField(term33832, term33832.getClass(), "nameWithNamespace", "ojrnLnJZjT");
        setField(term33832, term33832.getClass(), "path", "rtvXSMjOdJ");
        setField(term33832, term33832.getClass(), "pathWithNamespace", "EDkfjuDpNv");
        setIntField(term33896, term33896.getClass(), "year", 2019);
        setShortField(term33896, term33896.getClass(), "month", (short) 7);
        setShortField(term33896, term33896.getClass(), "day", (short) 19);
        setField(term33895, term33895.getClass(), "date", term33896);
        setByteField(term33900, term33900.getClass(), "hour", (byte) 10);
        setByteField(term33900, term33900.getClass(), "minute", (byte) 54);
        setByteField(term33900, term33900.getClass(), "second", (byte) 55);
        setIntField(term33900, term33900.getClass(), "nano", 244650454);
        setField(term33895, term33895.getClass(), "time", term33900);
        setField(term33832, term33832.getClass(), "createdAt", term33895);
        setField(term33832, term33832.getClass(), "defaultBranch", "LNHkTUfuHX");
        setField(term33832, term33832.getClass(), "sshUrlToRepo", "SVWcOAHiTp");
        setField(term33832, term33832.getClass(), "httpUrlToRepo", "oShLCaneoQ");
        setField(term33832, term33832.getClass(), "webUrl", "nwKkzNpzyC");
        setField(term33832, term33832.getClass(), "readmeUrl", "CwrsdYnHpH");
        setField(term33832, term33832.getClass(), "avatarUrl", "jifjXNXluS");
        setField(term33832, term33832.getClass(), "forksCount", term33977);
        setField(term33832, term33832.getClass(), "starCount", term33979);
        setIntField(term33982, term33982.getClass(), "year", 2022);
        setShortField(term33982, term33982.getClass(), "month", (short) 4);
        setShortField(term33982, term33982.getClass(), "day", (short) 15);
        setField(term33981, term33981.getClass(), "date", term33982);
        setByteField(term33986, term33986.getClass(), "hour", (byte) 20);
        setByteField(term33986, term33986.getClass(), "minute", (byte) 58);
        setByteField(term33986, term33986.getClass(), "second", (byte) 46);
        setIntField(term33986, term33986.getClass(), "nano", 435562727);
        setField(term33981, term33981.getClass(), "time", term33986);
        setField(term33832, term33832.getClass(), "lastActivityAt", term33981);
        setField(term33991, term33991.getClass(), "id", term33992);
        setField(term33991, term33991.getClass(), "name", "uDayZDXPOP");
        setField(term33991, term33991.getClass(), "path", "kbjWxMAIhY");
        setField(term33991, term33991.getClass(), "kind", "GmtlSgqKcI");
        setField(term33991, term33991.getClass(), "fullPath", "ssSbvPoMjB");
        setField(term33991, term33991.getClass(), "parentId", term34042);
        setField(term33991, term33991.getClass(), "avatarUrl", "mhRVADhaKm");
        setField(term33991, term33991.getClass(), "webUrl", "rLldJrTAay");
        setField(term33832, term33832.getClass(), "namespace", term33991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastActivityAt", argTypes, term33832, args);
    }

};


