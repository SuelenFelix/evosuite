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

public class GitlabProjectResponse_setHttpUrlToRepo_67676318220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24699;

    public GitlabProjectResponse_setHttpUrlToRepo_67676318220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24700 = new Integer(-1002370457);
        Integer term24844 = new Integer(-2014576105);
        Integer term24846 = new Integer(1296895584);
        Integer term24859 = new Integer(628918458);
        Integer term24909 = new Integer(-1274456137);
        term24699 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term24762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24767 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24858 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term24699, term24699.getClass(), "id", term24700);
        setField(term24699, term24699.getClass(), "description", "WWyLFmYpAy");
        setField(term24699, term24699.getClass(), "name", "vbSWeJWOQh");
        setField(term24699, term24699.getClass(), "nameWithNamespace", "hyvFdAvkOr");
        setField(term24699, term24699.getClass(), "path", "ewbQRtustW");
        setField(term24699, term24699.getClass(), "pathWithNamespace", "cABEHYBnys");
        setIntField(term24763, term24763.getClass(), "year", 2018);
        setShortField(term24763, term24763.getClass(), "month", (short) 7);
        setShortField(term24763, term24763.getClass(), "day", (short) 12);
        setField(term24762, term24762.getClass(), "date", term24763);
        setByteField(term24767, term24767.getClass(), "hour", (byte) 1);
        setByteField(term24767, term24767.getClass(), "minute", (byte) 3);
        setByteField(term24767, term24767.getClass(), "second", (byte) 47);
        setIntField(term24767, term24767.getClass(), "nano", 2729929);
        setField(term24762, term24762.getClass(), "time", term24767);
        setField(term24699, term24699.getClass(), "createdAt", term24762);
        setField(term24699, term24699.getClass(), "defaultBranch", "EhlWSobaco");
        setField(term24699, term24699.getClass(), "sshUrlToRepo", "hEuycunsSe");
        setField(term24699, term24699.getClass(), "httpUrlToRepo", "IMFzXhpNCx");
        setField(term24699, term24699.getClass(), "webUrl", "xAtFmANjwD");
        setField(term24699, term24699.getClass(), "readmeUrl", "ICysuFllEZ");
        setField(term24699, term24699.getClass(), "avatarUrl", "cGQJTTxcXr");
        setField(term24699, term24699.getClass(), "forksCount", term24844);
        setField(term24699, term24699.getClass(), "starCount", term24846);
        setIntField(term24849, term24849.getClass(), "year", 2015);
        setShortField(term24849, term24849.getClass(), "month", (short) 12);
        setShortField(term24849, term24849.getClass(), "day", (short) 23);
        setField(term24848, term24848.getClass(), "date", term24849);
        setByteField(term24853, term24853.getClass(), "hour", (byte) 14);
        setByteField(term24853, term24853.getClass(), "minute", (byte) 17);
        setByteField(term24853, term24853.getClass(), "second", (byte) 50);
        setIntField(term24853, term24853.getClass(), "nano", 325544804);
        setField(term24848, term24848.getClass(), "time", term24853);
        setField(term24699, term24699.getClass(), "lastActivityAt", term24848);
        setField(term24858, term24858.getClass(), "id", term24859);
        setField(term24858, term24858.getClass(), "name", "aKaqvssiby");
        setField(term24858, term24858.getClass(), "path", "tTVbtBVAfo");
        setField(term24858, term24858.getClass(), "kind", "cjaaJUnNCR");
        setField(term24858, term24858.getClass(), "fullPath", "ETbxNuJLii");
        setField(term24858, term24858.getClass(), "parentId", term24909);
        setField(term24858, term24858.getClass(), "avatarUrl", "YJhnPtWtJR");
        setField(term24858, term24858.getClass(), "webUrl", "xzGnrvbExX");
        setField(term24699, term24699.getClass(), "namespace", term24858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LFZNDELxUZ";
        callMethod(klass, "setHttpUrlToRepo", argTypes, term24699, args);
    }

};


