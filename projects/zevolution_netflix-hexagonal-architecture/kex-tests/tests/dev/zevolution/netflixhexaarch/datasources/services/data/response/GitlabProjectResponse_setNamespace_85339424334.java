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

public class GitlabProjectResponse_setNamespace_85339424334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30485;
     Object term30721;

    public GitlabProjectResponse_setNamespace_85339424334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30486 = new Integer(479531250);
        Integer term30630 = new Integer(1320570890);
        Integer term30632 = new Integer(-130649791);
        Integer term30645 = new Integer(534834644);
        Integer term30695 = new Integer(1959097203);
        term30485 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term30548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30639 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30644 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term30485, term30485.getClass(), "id", term30486);
        setField(term30485, term30485.getClass(), "description", "wiYGATEfmw");
        setField(term30485, term30485.getClass(), "name", "FiALSqneIg");
        setField(term30485, term30485.getClass(), "nameWithNamespace", "lGVACSQceQ");
        setField(term30485, term30485.getClass(), "path", "jpgWRbSvyQ");
        setField(term30485, term30485.getClass(), "pathWithNamespace", "tFMlYmPEBX");
        setIntField(term30549, term30549.getClass(), "year", 2028);
        setShortField(term30549, term30549.getClass(), "month", (short) 4);
        setShortField(term30549, term30549.getClass(), "day", (short) 1);
        setField(term30548, term30548.getClass(), "date", term30549);
        setByteField(term30553, term30553.getClass(), "hour", (byte) 16);
        setByteField(term30553, term30553.getClass(), "minute", (byte) 22);
        setByteField(term30553, term30553.getClass(), "second", (byte) 32);
        setIntField(term30553, term30553.getClass(), "nano", 406353763);
        setField(term30548, term30548.getClass(), "time", term30553);
        setField(term30485, term30485.getClass(), "createdAt", term30548);
        setField(term30485, term30485.getClass(), "defaultBranch", "ljkZxGNgjZ");
        setField(term30485, term30485.getClass(), "sshUrlToRepo", "hrFtgdcZKS");
        setField(term30485, term30485.getClass(), "httpUrlToRepo", "ZhZJvpPaTU");
        setField(term30485, term30485.getClass(), "webUrl", "NZwUsJxDLI");
        setField(term30485, term30485.getClass(), "readmeUrl", "wlusYBOfXW");
        setField(term30485, term30485.getClass(), "avatarUrl", "HEWWLhfKIa");
        setField(term30485, term30485.getClass(), "forksCount", term30630);
        setField(term30485, term30485.getClass(), "starCount", term30632);
        setIntField(term30635, term30635.getClass(), "year", 2019);
        setShortField(term30635, term30635.getClass(), "month", (short) 7);
        setShortField(term30635, term30635.getClass(), "day", (short) 19);
        setField(term30634, term30634.getClass(), "date", term30635);
        setByteField(term30639, term30639.getClass(), "hour", (byte) 10);
        setByteField(term30639, term30639.getClass(), "minute", (byte) 54);
        setByteField(term30639, term30639.getClass(), "second", (byte) 55);
        setIntField(term30639, term30639.getClass(), "nano", 244650454);
        setField(term30634, term30634.getClass(), "time", term30639);
        setField(term30485, term30485.getClass(), "lastActivityAt", term30634);
        setField(term30644, term30644.getClass(), "id", term30645);
        setField(term30644, term30644.getClass(), "name", "mJJkYzNPob");
        setField(term30644, term30644.getClass(), "path", "mRDwekkZQg");
        setField(term30644, term30644.getClass(), "kind", "RIGChgqpTI");
        setField(term30644, term30644.getClass(), "fullPath", "YCrgXnhgoK");
        setField(term30644, term30644.getClass(), "parentId", term30695);
        setField(term30644, term30644.getClass(), "avatarUrl", "nQodIeQekM");
        setField(term30644, term30644.getClass(), "webUrl", "YXORpHCDcd");
        setField(term30485, term30485.getClass(), "namespace", term30644);
        Integer term30722 = new Integer(-209654048);
        Integer term30772 = new Integer(477625804);
        term30721 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term30721, term30721.getClass(), "id", term30722);
        setField(term30721, term30721.getClass(), "name", "XzZbAcRADD");
        setField(term30721, term30721.getClass(), "path", "UqSNWSoTRy");
        setField(term30721, term30721.getClass(), "kind", "VesRqDfjMa");
        setField(term30721, term30721.getClass(), "fullPath", "AQTTebOiZR");
        setField(term30721, term30721.getClass(), "parentId", term30772);
        setField(term30721, term30721.getClass(), "avatarUrl", "mgeIhswNtk");
        setField(term30721, term30721.getClass(), "webUrl", "QwKYpiVQlL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Object[] args = new Object[1];
        args[0] = term30721;
        callMethod(klass, "setNamespace", argTypes, term30485, args);
    }

};


