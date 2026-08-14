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

public class GitlabProjectResponse_setReadmeUrl_210859612326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30942;

    public GitlabProjectResponse_setReadmeUrl_210859612326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30943 = new Integer(-1476644457);
        Integer term31087 = new Integer(1270666529);
        Integer term31089 = new Integer(-1146679443);
        Integer term31102 = new Integer(-860131894);
        Integer term31152 = new Integer(-1022990421);
        term30942 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term31005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31101 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term30942, term30942.getClass(), "id", term30943);
        setField(term30942, term30942.getClass(), "description", "zUXaSvayQe");
        setField(term30942, term30942.getClass(), "name", "bPVcnnQPSC");
        setField(term30942, term30942.getClass(), "nameWithNamespace", "PQLyoEKWSa");
        setField(term30942, term30942.getClass(), "path", "HOgkhttJZS");
        setField(term30942, term30942.getClass(), "pathWithNamespace", "goqNSmXSSS");
        setIntField(term31006, term31006.getClass(), "year", 2011);
        setShortField(term31006, term31006.getClass(), "month", (short) 9);
        setShortField(term31006, term31006.getClass(), "day", (short) 25);
        setField(term31005, term31005.getClass(), "date", term31006);
        setByteField(term31010, term31010.getClass(), "hour", (byte) 16);
        setByteField(term31010, term31010.getClass(), "minute", (byte) 45);
        setByteField(term31010, term31010.getClass(), "second", (byte) 19);
        setIntField(term31010, term31010.getClass(), "nano", 962864785);
        setField(term31005, term31005.getClass(), "time", term31010);
        setField(term30942, term30942.getClass(), "createdAt", term31005);
        setField(term30942, term30942.getClass(), "defaultBranch", "AkViBLdqXM");
        setField(term30942, term30942.getClass(), "sshUrlToRepo", "UlxGFzEifL");
        setField(term30942, term30942.getClass(), "httpUrlToRepo", "HilHTbDKDF");
        setField(term30942, term30942.getClass(), "webUrl", "IaEqlVwmNS");
        setField(term30942, term30942.getClass(), "readmeUrl", "ljNOgdPWrL");
        setField(term30942, term30942.getClass(), "avatarUrl", "oBlIZiyRMS");
        setField(term30942, term30942.getClass(), "forksCount", term31087);
        setField(term30942, term30942.getClass(), "starCount", term31089);
        setIntField(term31092, term31092.getClass(), "year", 2022);
        setShortField(term31092, term31092.getClass(), "month", (short) 6);
        setShortField(term31092, term31092.getClass(), "day", (short) 20);
        setField(term31091, term31091.getClass(), "date", term31092);
        setByteField(term31096, term31096.getClass(), "hour", (byte) 7);
        setByteField(term31096, term31096.getClass(), "minute", (byte) 57);
        setByteField(term31096, term31096.getClass(), "second", (byte) 37);
        setIntField(term31096, term31096.getClass(), "nano", 90374877);
        setField(term31091, term31091.getClass(), "time", term31096);
        setField(term30942, term30942.getClass(), "lastActivityAt", term31091);
        setField(term31101, term31101.getClass(), "id", term31102);
        setField(term31101, term31101.getClass(), "name", "QUYAkhtCNh");
        setField(term31101, term31101.getClass(), "path", "kOaAQOLyqd");
        setField(term31101, term31101.getClass(), "kind", "ICBWiKaeHC");
        setField(term31101, term31101.getClass(), "fullPath", "WAljagiCzu");
        setField(term31101, term31101.getClass(), "parentId", term31152);
        setField(term31101, term31101.getClass(), "avatarUrl", "XKMXfDZajw");
        setField(term31101, term31101.getClass(), "webUrl", "avZoBQSrBy");
        setField(term30942, term30942.getClass(), "namespace", term31101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KIXGeHXdwi";
        callMethod(klass, "setReadmeUrl", argTypes, term30942, args);
    }

};


