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

public class GitlabProjectResponse_setNameWithNamespace_8207423729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24281;

    public GitlabProjectResponse_setNameWithNamespace_8207423729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24282 = new Integer(158873461);
        Integer term24426 = new Integer(-430151637);
        Integer term24428 = new Integer(-1697741339);
        Integer term24441 = new Integer(98922530);
        Integer term24491 = new Integer(-1388471422);
        term24281 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term24344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24440 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term24281, term24281.getClass(), "id", term24282);
        setField(term24281, term24281.getClass(), "description", "olmFxfIVeh");
        setField(term24281, term24281.getClass(), "name", "iSPirUEhXs");
        setField(term24281, term24281.getClass(), "nameWithNamespace", "WWyLFmYpAy");
        setField(term24281, term24281.getClass(), "path", "vbSWeJWOQh");
        setField(term24281, term24281.getClass(), "pathWithNamespace", "hyvFdAvkOr");
        setIntField(term24345, term24345.getClass(), "year", 2015);
        setShortField(term24345, term24345.getClass(), "month", (short) 3);
        setShortField(term24345, term24345.getClass(), "day", (short) 10);
        setField(term24344, term24344.getClass(), "date", term24345);
        setByteField(term24349, term24349.getClass(), "hour", (byte) 23);
        setByteField(term24349, term24349.getClass(), "minute", (byte) 34);
        setByteField(term24349, term24349.getClass(), "second", (byte) 44);
        setIntField(term24349, term24349.getClass(), "nano", 587322824);
        setField(term24344, term24344.getClass(), "time", term24349);
        setField(term24281, term24281.getClass(), "createdAt", term24344);
        setField(term24281, term24281.getClass(), "defaultBranch", "ewbQRtustW");
        setField(term24281, term24281.getClass(), "sshUrlToRepo", "cABEHYBnys");
        setField(term24281, term24281.getClass(), "httpUrlToRepo", "EhlWSobaco");
        setField(term24281, term24281.getClass(), "webUrl", "hEuycunsSe");
        setField(term24281, term24281.getClass(), "readmeUrl", "IMFzXhpNCx");
        setField(term24281, term24281.getClass(), "avatarUrl", "xAtFmANjwD");
        setField(term24281, term24281.getClass(), "forksCount", term24426);
        setField(term24281, term24281.getClass(), "starCount", term24428);
        setIntField(term24431, term24431.getClass(), "year", 2027);
        setShortField(term24431, term24431.getClass(), "month", (short) 8);
        setShortField(term24431, term24431.getClass(), "day", (short) 26);
        setField(term24430, term24430.getClass(), "date", term24431);
        setByteField(term24435, term24435.getClass(), "hour", (byte) 5);
        setByteField(term24435, term24435.getClass(), "minute", (byte) 11);
        setByteField(term24435, term24435.getClass(), "second", (byte) 9);
        setIntField(term24435, term24435.getClass(), "nano", 219245092);
        setField(term24430, term24430.getClass(), "time", term24435);
        setField(term24281, term24281.getClass(), "lastActivityAt", term24430);
        setField(term24440, term24440.getClass(), "id", term24441);
        setField(term24440, term24440.getClass(), "name", "ICysuFllEZ");
        setField(term24440, term24440.getClass(), "path", "cGQJTTxcXr");
        setField(term24440, term24440.getClass(), "kind", "aKaqvssiby");
        setField(term24440, term24440.getClass(), "fullPath", "tTVbtBVAfo");
        setField(term24440, term24440.getClass(), "parentId", term24491);
        setField(term24440, term24440.getClass(), "avatarUrl", "cjaaJUnNCR");
        setField(term24440, term24440.getClass(), "webUrl", "ETbxNuJLii");
        setField(term24281, term24281.getClass(), "namespace", term24440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YJhnPtWtJR";
        callMethod(klass, "setNameWithNamespace", argTypes, term24281, args);
    }

};


