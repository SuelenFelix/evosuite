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

public class GitlabProjectResponse_setAvatarUrl_32150046428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31776;

    public GitlabProjectResponse_setAvatarUrl_32150046428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31777 = new Integer(-1692331299);
        Integer term31921 = new Integer(479531250);
        Integer term31923 = new Integer(1320570890);
        Integer term31936 = new Integer(-130649791);
        Integer term31986 = new Integer(534834644);
        term31776 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term31839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31935 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term31776, term31776.getClass(), "id", term31777);
        setField(term31776, term31776.getClass(), "description", "iasolXlEEn");
        setField(term31776, term31776.getClass(), "name", "cAObIvLmLo");
        setField(term31776, term31776.getClass(), "nameWithNamespace", "xwiCqRSWSe");
        setField(term31776, term31776.getClass(), "path", "IbUFkzIgzq");
        setField(term31776, term31776.getClass(), "pathWithNamespace", "dTOUSTDdbw");
        setIntField(term31840, term31840.getClass(), "year", 2024);
        setShortField(term31840, term31840.getClass(), "month", (short) 2);
        setShortField(term31840, term31840.getClass(), "day", (short) 29);
        setField(term31839, term31839.getClass(), "date", term31840);
        setByteField(term31844, term31844.getClass(), "hour", (byte) 17);
        setByteField(term31844, term31844.getClass(), "minute", (byte) 54);
        setByteField(term31844, term31844.getClass(), "second", (byte) 21);
        setIntField(term31844, term31844.getClass(), "nano", 605973408);
        setField(term31839, term31839.getClass(), "time", term31844);
        setField(term31776, term31776.getClass(), "createdAt", term31839);
        setField(term31776, term31776.getClass(), "defaultBranch", "PECfBejlfo");
        setField(term31776, term31776.getClass(), "sshUrlToRepo", "SDbDgydVpg");
        setField(term31776, term31776.getClass(), "httpUrlToRepo", "EEMaiNkiOH");
        setField(term31776, term31776.getClass(), "webUrl", "sFdmTylvqh");
        setField(term31776, term31776.getClass(), "readmeUrl", "rgniLaOaiz");
        setField(term31776, term31776.getClass(), "avatarUrl", "fzQzzdIOMC");
        setField(term31776, term31776.getClass(), "forksCount", term31921);
        setField(term31776, term31776.getClass(), "starCount", term31923);
        setIntField(term31926, term31926.getClass(), "year", 2016);
        setShortField(term31926, term31926.getClass(), "month", (short) 2);
        setShortField(term31926, term31926.getClass(), "day", (short) 25);
        setField(term31925, term31925.getClass(), "date", term31926);
        setByteField(term31930, term31930.getClass(), "hour", (byte) 8);
        setByteField(term31930, term31930.getClass(), "minute", (byte) 54);
        setByteField(term31930, term31930.getClass(), "second", (byte) 40);
        setIntField(term31930, term31930.getClass(), "nano", 124525896);
        setField(term31925, term31925.getClass(), "time", term31930);
        setField(term31776, term31776.getClass(), "lastActivityAt", term31925);
        setField(term31935, term31935.getClass(), "id", term31936);
        setField(term31935, term31935.getClass(), "name", "hLVDOhfCKX");
        setField(term31935, term31935.getClass(), "path", "yXLTfzOgfX");
        setField(term31935, term31935.getClass(), "kind", "MANlfBKTPY");
        setField(term31935, term31935.getClass(), "fullPath", "mRoEmuCJhW");
        setField(term31935, term31935.getClass(), "parentId", term31986);
        setField(term31935, term31935.getClass(), "avatarUrl", "JJUWbMXpyM");
        setField(term31935, term31935.getClass(), "webUrl", "KDrRQWVXok");
        setField(term31776, term31776.getClass(), "namespace", term31935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oOOwvWgxtf";
        callMethod(klass, "setAvatarUrl", argTypes, term31776, args);
    }

};


