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

public class GitlabProjectResponse_setPathWithNamespace_151657061412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21375;

    public GitlabProjectResponse_setPathWithNamespace_151657061412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21376 = new Integer(1107176718);
        Integer term21520 = new Integer(480137250);
        Integer term21522 = new Integer(-341152642);
        Integer term21535 = new Integer(-2015854073);
        Integer term21585 = new Integer(538259104);
        term21375 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term21438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21443 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21534 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term21375, term21375.getClass(), "id", term21376);
        setField(term21375, term21375.getClass(), "description", "plWlgdgIhn");
        setField(term21375, term21375.getClass(), "name", "RZaKVKWtND");
        setField(term21375, term21375.getClass(), "nameWithNamespace", "vXiaNiquft");
        setField(term21375, term21375.getClass(), "path", "lucCeiVnYe");
        setField(term21375, term21375.getClass(), "pathWithNamespace", "iYwkCLMsbJ");
        setIntField(term21439, term21439.getClass(), "year", 2015);
        setShortField(term21439, term21439.getClass(), "month", (short) 3);
        setShortField(term21439, term21439.getClass(), "day", (short) 10);
        setField(term21438, term21438.getClass(), "date", term21439);
        setByteField(term21443, term21443.getClass(), "hour", (byte) 23);
        setByteField(term21443, term21443.getClass(), "minute", (byte) 34);
        setByteField(term21443, term21443.getClass(), "second", (byte) 44);
        setIntField(term21443, term21443.getClass(), "nano", 587322824);
        setField(term21438, term21438.getClass(), "time", term21443);
        setField(term21375, term21375.getClass(), "createdAt", term21438);
        setField(term21375, term21375.getClass(), "defaultBranch", "MXLsVQWrwc");
        setField(term21375, term21375.getClass(), "sshUrlToRepo", "lRaSlqzqNY");
        setField(term21375, term21375.getClass(), "httpUrlToRepo", "TiEyxWXsra");
        setField(term21375, term21375.getClass(), "webUrl", "TuLgwTZsPP");
        setField(term21375, term21375.getClass(), "readmeUrl", "KoasxTJGpx");
        setField(term21375, term21375.getClass(), "avatarUrl", "ceGeARYMoa");
        setField(term21375, term21375.getClass(), "forksCount", term21520);
        setField(term21375, term21375.getClass(), "starCount", term21522);
        setIntField(term21525, term21525.getClass(), "year", 2027);
        setShortField(term21525, term21525.getClass(), "month", (short) 8);
        setShortField(term21525, term21525.getClass(), "day", (short) 26);
        setField(term21524, term21524.getClass(), "date", term21525);
        setByteField(term21529, term21529.getClass(), "hour", (byte) 5);
        setByteField(term21529, term21529.getClass(), "minute", (byte) 11);
        setByteField(term21529, term21529.getClass(), "second", (byte) 9);
        setIntField(term21529, term21529.getClass(), "nano", 219245092);
        setField(term21524, term21524.getClass(), "time", term21529);
        setField(term21375, term21375.getClass(), "lastActivityAt", term21524);
        setField(term21534, term21534.getClass(), "id", term21535);
        setField(term21534, term21534.getClass(), "name", "fFWllaiFvh");
        setField(term21534, term21534.getClass(), "path", "PFTdEDSbvZ");
        setField(term21534, term21534.getClass(), "kind", "TbiwoiebNe");
        setField(term21534, term21534.getClass(), "fullPath", "laTITSWZuc");
        setField(term21534, term21534.getClass(), "parentId", term21585);
        setField(term21534, term21534.getClass(), "avatarUrl", "fkzRpxlAqS");
        setField(term21534, term21534.getClass(), "webUrl", "VYvbTGKslj");
        setField(term21375, term21375.getClass(), "namespace", term21534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "owLqDDnwZA";
        callMethod(klass, "setPathWithNamespace", argTypes, term21375, args);
    }

};


