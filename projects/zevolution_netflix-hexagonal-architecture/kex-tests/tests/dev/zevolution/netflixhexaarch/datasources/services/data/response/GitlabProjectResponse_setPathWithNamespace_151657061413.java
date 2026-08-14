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

public class GitlabProjectResponse_setPathWithNamespace_151657061413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25949;

    public GitlabProjectResponse_setPathWithNamespace_151657061413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25950 = new Integer(-2014576105);
        Integer term26094 = new Integer(1296895584);
        Integer term26096 = new Integer(628918458);
        Integer term26109 = new Integer(-1274456137);
        Integer term26159 = new Integer(1041916673);
        term25949 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term26012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26017 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26108 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term25949, term25949.getClass(), "id", term25950);
        setField(term25949, term25949.getClass(), "description", "crkNabVaWs");
        setField(term25949, term25949.getClass(), "name", "qBcAJgrABE");
        setField(term25949, term25949.getClass(), "nameWithNamespace", "JKdZuLFRwC");
        setField(term25949, term25949.getClass(), "path", "hfhLLoWnRU");
        setField(term25949, term25949.getClass(), "pathWithNamespace", "RpofnOPYha");
        setIntField(term26013, term26013.getClass(), "year", 2016);
        setShortField(term26013, term26013.getClass(), "month", (short) 6);
        setShortField(term26013, term26013.getClass(), "day", (short) 15);
        setField(term26012, term26012.getClass(), "date", term26013);
        setByteField(term26017, term26017.getClass(), "hour", (byte) 21);
        setByteField(term26017, term26017.getClass(), "minute", (byte) 23);
        setByteField(term26017, term26017.getClass(), "second", (byte) 23);
        setIntField(term26017, term26017.getClass(), "nano", 433372070);
        setField(term26012, term26012.getClass(), "time", term26017);
        setField(term25949, term25949.getClass(), "createdAt", term26012);
        setField(term25949, term25949.getClass(), "defaultBranch", "CQYmAsjvPU");
        setField(term25949, term25949.getClass(), "sshUrlToRepo", "NNkIIFpxiB");
        setField(term25949, term25949.getClass(), "httpUrlToRepo", "sBmtvFPDso");
        setField(term25949, term25949.getClass(), "webUrl", "qsUIxrLolr");
        setField(term25949, term25949.getClass(), "readmeUrl", "IlQxArYcgB");
        setField(term25949, term25949.getClass(), "avatarUrl", "lIgKCvCuoH");
        setField(term25949, term25949.getClass(), "forksCount", term26094);
        setField(term25949, term25949.getClass(), "starCount", term26096);
        setIntField(term26099, term26099.getClass(), "year", 2012);
        setShortField(term26099, term26099.getClass(), "month", (short) 8);
        setShortField(term26099, term26099.getClass(), "day", (short) 25);
        setField(term26098, term26098.getClass(), "date", term26099);
        setByteField(term26103, term26103.getClass(), "hour", (byte) 19);
        setByteField(term26103, term26103.getClass(), "minute", (byte) 49);
        setByteField(term26103, term26103.getClass(), "second", (byte) 8);
        setIntField(term26103, term26103.getClass(), "nano", 912685024);
        setField(term26098, term26098.getClass(), "time", term26103);
        setField(term25949, term25949.getClass(), "lastActivityAt", term26098);
        setField(term26108, term26108.getClass(), "id", term26109);
        setField(term26108, term26108.getClass(), "name", "dHuWgRwLOm");
        setField(term26108, term26108.getClass(), "path", "PsTQDxNIld");
        setField(term26108, term26108.getClass(), "kind", "uoBijJjvaj");
        setField(term26108, term26108.getClass(), "fullPath", "BdsLFSRWda");
        setField(term26108, term26108.getClass(), "parentId", term26159);
        setField(term26108, term26108.getClass(), "avatarUrl", "tMhhBYonAI");
        setField(term26108, term26108.getClass(), "webUrl", "AaQRshwIQC");
        setField(term25949, term25949.getClass(), "namespace", term26108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rHgKCfgCsg";
        callMethod(klass, "setPathWithNamespace", argTypes, term25949, args);
    }

};


