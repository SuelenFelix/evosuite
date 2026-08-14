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

public class GitlabProjectResponse_setLastActivityAt_154629803832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29663;
     Object term29899;

    public GitlabProjectResponse_setLastActivityAt_154629803832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29664 = new Integer(1270666529);
        Integer term29808 = new Integer(-1146679443);
        Integer term29810 = new Integer(-860131894);
        Integer term29823 = new Integer(-1022990421);
        Integer term29873 = new Integer(1045547089);
        term29663 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term29726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29822 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term29663, term29663.getClass(), "id", term29664);
        setField(term29663, term29663.getClass(), "description", "HUtbHklGel");
        setField(term29663, term29663.getClass(), "name", "QbfKDAwhSB");
        setField(term29663, term29663.getClass(), "nameWithNamespace", "ckTRHEIcCK");
        setField(term29663, term29663.getClass(), "path", "NYSBqIpNlD");
        setField(term29663, term29663.getClass(), "pathWithNamespace", "OWglDUWQYb");
        setIntField(term29727, term29727.getClass(), "year", 2019);
        setShortField(term29727, term29727.getClass(), "month", (short) 1);
        setShortField(term29727, term29727.getClass(), "day", (short) 6);
        setField(term29726, term29726.getClass(), "date", term29727);
        setByteField(term29731, term29731.getClass(), "hour", (byte) 18);
        setByteField(term29731, term29731.getClass(), "minute", (byte) 8);
        setByteField(term29731, term29731.getClass(), "second", (byte) 46);
        setIntField(term29731, term29731.getClass(), "nano", 934136445);
        setField(term29726, term29726.getClass(), "time", term29731);
        setField(term29663, term29663.getClass(), "createdAt", term29726);
        setField(term29663, term29663.getClass(), "defaultBranch", "FiqETbKjpv");
        setField(term29663, term29663.getClass(), "sshUrlToRepo", "FxXtdhhXyS");
        setField(term29663, term29663.getClass(), "httpUrlToRepo", "HxCEzaCcgj");
        setField(term29663, term29663.getClass(), "webUrl", "PDYPOQncAB");
        setField(term29663, term29663.getClass(), "readmeUrl", "cHqLMqZSmc");
        setField(term29663, term29663.getClass(), "avatarUrl", "hkWmAkXSOW");
        setField(term29663, term29663.getClass(), "forksCount", term29808);
        setField(term29663, term29663.getClass(), "starCount", term29810);
        setIntField(term29813, term29813.getClass(), "year", 2028);
        setShortField(term29813, term29813.getClass(), "month", (short) 1);
        setShortField(term29813, term29813.getClass(), "day", (short) 18);
        setField(term29812, term29812.getClass(), "date", term29813);
        setByteField(term29817, term29817.getClass(), "hour", (byte) 12);
        setByteField(term29817, term29817.getClass(), "minute", (byte) 4);
        setByteField(term29817, term29817.getClass(), "second", (byte) 39);
        setIntField(term29817, term29817.getClass(), "nano", 651287093);
        setField(term29812, term29812.getClass(), "time", term29817);
        setField(term29663, term29663.getClass(), "lastActivityAt", term29812);
        setField(term29822, term29822.getClass(), "id", term29823);
        setField(term29822, term29822.getClass(), "name", "DwQmZEKeOp");
        setField(term29822, term29822.getClass(), "path", "DbxrFiyttv");
        setField(term29822, term29822.getClass(), "kind", "iVIrSxTsaM");
        setField(term29822, term29822.getClass(), "fullPath", "FmJNEfmYgq");
        setField(term29822, term29822.getClass(), "parentId", term29873);
        setField(term29822, term29822.getClass(), "avatarUrl", "NqQofgWsJd");
        setField(term29822, term29822.getClass(), "webUrl", "ZlVRdHsBMO");
        setField(term29663, term29663.getClass(), "namespace", term29822);
        term29899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29904 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29900, term29900.getClass(), "year", 2027);
        setShortField(term29900, term29900.getClass(), "month", (short) 7);
        setShortField(term29900, term29900.getClass(), "day", (short) 23);
        setField(term29899, term29899.getClass(), "date", term29900);
        setByteField(term29904, term29904.getClass(), "hour", (byte) 12);
        setByteField(term29904, term29904.getClass(), "minute", (byte) 6);
        setByteField(term29904, term29904.getClass(), "second", (byte) 19);
        setIntField(term29904, term29904.getClass(), "nano", 8025683);
        setField(term29899, term29899.getClass(), "time", term29904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term29899;
        callMethod(klass, "setLastActivityAt", argTypes, term29663, args);
    }

};


