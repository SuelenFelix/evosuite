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

public class GitlabProjectResponse_getCreatedAt_52083223013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21803;

    public GitlabProjectResponse_getCreatedAt_52083223013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21804 = new Integer(96566506);
        Integer term21948 = new Integer(-343325701);
        Integer term21950 = new Integer(107945604);
        Integer term21963 = new Integer(-1963464809);
        Integer term22013 = new Integer(71190297);
        term21803 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term21866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21871 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21962 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term21803, term21803.getClass(), "id", term21804);
        setField(term21803, term21803.getClass(), "description", "eBcTbweeYp");
        setField(term21803, term21803.getClass(), "name", "drcmjfQUDq");
        setField(term21803, term21803.getClass(), "nameWithNamespace", "GjdWUoUSyA");
        setField(term21803, term21803.getClass(), "path", "YEkxWsWaUl");
        setField(term21803, term21803.getClass(), "pathWithNamespace", "RINhPkhhct");
        setIntField(term21867, term21867.getClass(), "year", 2025);
        setShortField(term21867, term21867.getClass(), "month", (short) 3);
        setShortField(term21867, term21867.getClass(), "day", (short) 9);
        setField(term21866, term21866.getClass(), "date", term21867);
        setByteField(term21871, term21871.getClass(), "hour", (byte) 5);
        setByteField(term21871, term21871.getClass(), "minute", (byte) 49);
        setByteField(term21871, term21871.getClass(), "second", (byte) 12);
        setIntField(term21871, term21871.getClass(), "nano", 791695028);
        setField(term21866, term21866.getClass(), "time", term21871);
        setField(term21803, term21803.getClass(), "createdAt", term21866);
        setField(term21803, term21803.getClass(), "defaultBranch", "vjNPcTSqmS");
        setField(term21803, term21803.getClass(), "sshUrlToRepo", "fFhdWuJbdC");
        setField(term21803, term21803.getClass(), "httpUrlToRepo", "JlgLIHPabR");
        setField(term21803, term21803.getClass(), "webUrl", "LHnkeoNwHq");
        setField(term21803, term21803.getClass(), "readmeUrl", "gVnDVbSyKa");
        setField(term21803, term21803.getClass(), "avatarUrl", "kdCYNMSuoD");
        setField(term21803, term21803.getClass(), "forksCount", term21948);
        setField(term21803, term21803.getClass(), "starCount", term21950);
        setIntField(term21953, term21953.getClass(), "year", 2023);
        setShortField(term21953, term21953.getClass(), "month", (short) 9);
        setShortField(term21953, term21953.getClass(), "day", (short) 23);
        setField(term21952, term21952.getClass(), "date", term21953);
        setByteField(term21957, term21957.getClass(), "hour", (byte) 12);
        setByteField(term21957, term21957.getClass(), "minute", (byte) 55);
        setByteField(term21957, term21957.getClass(), "second", (byte) 58);
        setIntField(term21957, term21957.getClass(), "nano", 159178396);
        setField(term21952, term21952.getClass(), "time", term21957);
        setField(term21803, term21803.getClass(), "lastActivityAt", term21952);
        setField(term21962, term21962.getClass(), "id", term21963);
        setField(term21962, term21962.getClass(), "name", "eRYlSLwtvV");
        setField(term21962, term21962.getClass(), "path", "duOyJsARTD");
        setField(term21962, term21962.getClass(), "kind", "xPnOHsNlyc");
        setField(term21962, term21962.getClass(), "fullPath", "OTSPWPJefj");
        setField(term21962, term21962.getClass(), "parentId", term22013);
        setField(term21962, term21962.getClass(), "avatarUrl", "EOTYMqXRmE");
        setField(term21962, term21962.getClass(), "webUrl", "iTxNduwSjE");
        setField(term21803, term21803.getClass(), "namespace", term21962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term21803, args);
    }

};


