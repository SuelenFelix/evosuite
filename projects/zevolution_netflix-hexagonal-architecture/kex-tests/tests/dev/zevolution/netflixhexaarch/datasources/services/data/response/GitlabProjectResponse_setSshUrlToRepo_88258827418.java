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

public class GitlabProjectResponse_setSshUrlToRepo_88258827418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23865;

    public GitlabProjectResponse_setSshUrlToRepo_88258827418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23866 = new Integer(-227365013);
        Integer term24010 = new Integer(11724947);
        Integer term24012 = new Integer(1953277050);
        Integer term24025 = new Integer(1283079251);
        Integer term24075 = new Integer(-523949691);
        term23865 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term23928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24019 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24024 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term23865, term23865.getClass(), "id", term23866);
        setField(term23865, term23865.getClass(), "description", "acPRDlpsid");
        setField(term23865, term23865.getClass(), "name", "YyojIzvxLZ");
        setField(term23865, term23865.getClass(), "nameWithNamespace", "fxapaYlZea");
        setField(term23865, term23865.getClass(), "path", "VJgREHwfRM");
        setField(term23865, term23865.getClass(), "pathWithNamespace", "kXnpLIZTAr");
        setIntField(term23929, term23929.getClass(), "year", 2024);
        setShortField(term23929, term23929.getClass(), "month", (short) 4);
        setShortField(term23929, term23929.getClass(), "day", (short) 24);
        setField(term23928, term23928.getClass(), "date", term23929);
        setByteField(term23933, term23933.getClass(), "hour", (byte) 7);
        setByteField(term23933, term23933.getClass(), "minute", (byte) 2);
        setByteField(term23933, term23933.getClass(), "second", (byte) 51);
        setIntField(term23933, term23933.getClass(), "nano", 635502964);
        setField(term23928, term23928.getClass(), "time", term23933);
        setField(term23865, term23865.getClass(), "createdAt", term23928);
        setField(term23865, term23865.getClass(), "defaultBranch", "ZiMAmqpbzk");
        setField(term23865, term23865.getClass(), "sshUrlToRepo", "UwJtBPAtSU");
        setField(term23865, term23865.getClass(), "httpUrlToRepo", "nBaMiSdFmS");
        setField(term23865, term23865.getClass(), "webUrl", "ezwGsjqTai");
        setField(term23865, term23865.getClass(), "readmeUrl", "ngeHWMRjnn");
        setField(term23865, term23865.getClass(), "avatarUrl", "FOKfDXQxMM");
        setField(term23865, term23865.getClass(), "forksCount", term24010);
        setField(term23865, term23865.getClass(), "starCount", term24012);
        setIntField(term24015, term24015.getClass(), "year", 2010);
        setShortField(term24015, term24015.getClass(), "month", (short) 1);
        setShortField(term24015, term24015.getClass(), "day", (short) 17);
        setField(term24014, term24014.getClass(), "date", term24015);
        setByteField(term24019, term24019.getClass(), "hour", (byte) 13);
        setByteField(term24019, term24019.getClass(), "minute", (byte) 5);
        setByteField(term24019, term24019.getClass(), "second", (byte) 51);
        setIntField(term24019, term24019.getClass(), "nano", 362260580);
        setField(term24014, term24014.getClass(), "time", term24019);
        setField(term23865, term23865.getClass(), "lastActivityAt", term24014);
        setField(term24024, term24024.getClass(), "id", term24025);
        setField(term24024, term24024.getClass(), "name", "gbxMvhrWpA");
        setField(term24024, term24024.getClass(), "path", "huNTIobUHx");
        setField(term24024, term24024.getClass(), "kind", "MrVeCmRVzF");
        setField(term24024, term24024.getClass(), "fullPath", "CPVnQYACKw");
        setField(term24024, term24024.getClass(), "parentId", term24075);
        setField(term24024, term24024.getClass(), "avatarUrl", "sbdLhVCRsw");
        setField(term24024, term24024.getClass(), "webUrl", "soJHvZwbtF");
        setField(term23865, term23865.getClass(), "namespace", term24024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dTGwgkfDVj";
        callMethod(klass, "setSshUrlToRepo", argTypes, term23865, args);
    }

};


