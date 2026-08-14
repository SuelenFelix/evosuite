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

public class GitlabProjectResponse_setWebUrl_133089434324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30108;

    public GitlabProjectResponse_setWebUrl_133089434324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30109 = new Integer(282916351);
        Integer term30253 = new Integer(880977281);
        Integer term30255 = new Integer(371943306);
        Integer term30268 = new Integer(982388293);
        Integer term30318 = new Integer(-159494544);
        term30108 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term30171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30267 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term30108, term30108.getClass(), "id", term30109);
        setField(term30108, term30108.getClass(), "description", "wiYGATEfmw");
        setField(term30108, term30108.getClass(), "name", "FiALSqneIg");
        setField(term30108, term30108.getClass(), "nameWithNamespace", "lGVACSQceQ");
        setField(term30108, term30108.getClass(), "path", "jpgWRbSvyQ");
        setField(term30108, term30108.getClass(), "pathWithNamespace", "tFMlYmPEBX");
        setIntField(term30172, term30172.getClass(), "year", 2021);
        setShortField(term30172, term30172.getClass(), "month", (short) 4);
        setShortField(term30172, term30172.getClass(), "day", (short) 17);
        setField(term30171, term30171.getClass(), "date", term30172);
        setByteField(term30176, term30176.getClass(), "hour", (byte) 4);
        setByteField(term30176, term30176.getClass(), "minute", (byte) 11);
        setByteField(term30176, term30176.getClass(), "second", (byte) 16);
        setIntField(term30176, term30176.getClass(), "nano", 509895858);
        setField(term30171, term30171.getClass(), "time", term30176);
        setField(term30108, term30108.getClass(), "createdAt", term30171);
        setField(term30108, term30108.getClass(), "defaultBranch", "ljkZxGNgjZ");
        setField(term30108, term30108.getClass(), "sshUrlToRepo", "hrFtgdcZKS");
        setField(term30108, term30108.getClass(), "httpUrlToRepo", "ZhZJvpPaTU");
        setField(term30108, term30108.getClass(), "webUrl", "NZwUsJxDLI");
        setField(term30108, term30108.getClass(), "readmeUrl", "wlusYBOfXW");
        setField(term30108, term30108.getClass(), "avatarUrl", "HEWWLhfKIa");
        setField(term30108, term30108.getClass(), "forksCount", term30253);
        setField(term30108, term30108.getClass(), "starCount", term30255);
        setIntField(term30258, term30258.getClass(), "year", 2011);
        setShortField(term30258, term30258.getClass(), "month", (short) 6);
        setShortField(term30258, term30258.getClass(), "day", (short) 26);
        setField(term30257, term30257.getClass(), "date", term30258);
        setByteField(term30262, term30262.getClass(), "hour", (byte) 22);
        setByteField(term30262, term30262.getClass(), "minute", (byte) 39);
        setByteField(term30262, term30262.getClass(), "second", (byte) 11);
        setIntField(term30262, term30262.getClass(), "nano", 686293604);
        setField(term30257, term30257.getClass(), "time", term30262);
        setField(term30108, term30108.getClass(), "lastActivityAt", term30257);
        setField(term30267, term30267.getClass(), "id", term30268);
        setField(term30267, term30267.getClass(), "name", "mJJkYzNPob");
        setField(term30267, term30267.getClass(), "path", "mRDwekkZQg");
        setField(term30267, term30267.getClass(), "kind", "RIGChgqpTI");
        setField(term30267, term30267.getClass(), "fullPath", "YCrgXnhgoK");
        setField(term30267, term30267.getClass(), "parentId", term30318);
        setField(term30267, term30267.getClass(), "avatarUrl", "nQodIeQekM");
        setField(term30267, term30267.getClass(), "webUrl", "YXORpHCDcd");
        setField(term30108, term30108.getClass(), "namespace", term30267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XzZbAcRADD";
        callMethod(klass, "setWebUrl", argTypes, term30108, args);
    }

};


