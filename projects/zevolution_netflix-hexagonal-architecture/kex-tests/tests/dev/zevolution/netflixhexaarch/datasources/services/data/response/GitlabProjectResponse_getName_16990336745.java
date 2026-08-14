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

public class GitlabProjectResponse_getName_16990336745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18467;

    public GitlabProjectResponse_getName_16990336745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18468 = new Integer(-505439934);
        Integer term18612 = new Integer(-344842608);
        Integer term18614 = new Integer(941650513);
        Integer term18627 = new Integer(444029505);
        Integer term18677 = new Integer(-1034506028);
        term18467 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term18530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18535 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18626 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term18467, term18467.getClass(), "id", term18468);
        setField(term18467, term18467.getClass(), "description", "yQUDyOroXU");
        setField(term18467, term18467.getClass(), "name", "xweqkPdyJH");
        setField(term18467, term18467.getClass(), "nameWithNamespace", "kwteHWzwcc");
        setField(term18467, term18467.getClass(), "path", "uMsWXqNhln");
        setField(term18467, term18467.getClass(), "pathWithNamespace", "MAnhIPOtHL");
        setIntField(term18531, term18531.getClass(), "year", 2029);
        setShortField(term18531, term18531.getClass(), "month", (short) 8);
        setShortField(term18531, term18531.getClass(), "day", (short) 29);
        setField(term18530, term18530.getClass(), "date", term18531);
        setByteField(term18535, term18535.getClass(), "hour", (byte) 15);
        setByteField(term18535, term18535.getClass(), "minute", (byte) 50);
        setByteField(term18535, term18535.getClass(), "second", (byte) 1);
        setIntField(term18535, term18535.getClass(), "nano", 277971904);
        setField(term18530, term18530.getClass(), "time", term18535);
        setField(term18467, term18467.getClass(), "createdAt", term18530);
        setField(term18467, term18467.getClass(), "defaultBranch", "dikKjYjmRO");
        setField(term18467, term18467.getClass(), "sshUrlToRepo", "GJnnMDVnEP");
        setField(term18467, term18467.getClass(), "httpUrlToRepo", "zSMVllDpfk");
        setField(term18467, term18467.getClass(), "webUrl", "iptRXVDoYE");
        setField(term18467, term18467.getClass(), "readmeUrl", "kucsxnvbES");
        setField(term18467, term18467.getClass(), "avatarUrl", "IdGzDFfcZf");
        setField(term18467, term18467.getClass(), "forksCount", term18612);
        setField(term18467, term18467.getClass(), "starCount", term18614);
        setIntField(term18617, term18617.getClass(), "year", 2022);
        setShortField(term18617, term18617.getClass(), "month", (short) 11);
        setShortField(term18617, term18617.getClass(), "day", (short) 16);
        setField(term18616, term18616.getClass(), "date", term18617);
        setByteField(term18621, term18621.getClass(), "hour", (byte) 15);
        setByteField(term18621, term18621.getClass(), "minute", (byte) 54);
        setByteField(term18621, term18621.getClass(), "second", (byte) 2);
        setIntField(term18621, term18621.getClass(), "nano", 733274103);
        setField(term18616, term18616.getClass(), "time", term18621);
        setField(term18467, term18467.getClass(), "lastActivityAt", term18616);
        setField(term18626, term18626.getClass(), "id", term18627);
        setField(term18626, term18626.getClass(), "name", "KDdRNhZmnU");
        setField(term18626, term18626.getClass(), "path", "iMsqJaKlDC");
        setField(term18626, term18626.getClass(), "kind", "aPkGHbZyjj");
        setField(term18626, term18626.getClass(), "fullPath", "nSWdsVyJRI");
        setField(term18626, term18626.getClass(), "parentId", term18677);
        setField(term18626, term18626.getClass(), "avatarUrl", "JBOPGgGKnc");
        setField(term18626, term18626.getClass(), "webUrl", "GlPTiCMCGP");
        setField(term18467, term18467.getClass(), "namespace", term18626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term18467, args);
    }

};


