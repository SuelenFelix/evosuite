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

public class GitlabProjectResponse_getId_18388602571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16819;

    public GitlabProjectResponse_getId_18388602571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16820 = new Integer(962840079);
        Integer term16964 = new Integer(1540719661);
        Integer term16966 = new Integer(1265463001);
        Integer term16979 = new Integer(335112684);
        Integer term17029 = new Integer(1551099402);
        term16819 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term16882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16978 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term16819, term16819.getClass(), "id", term16820);
        setField(term16819, term16819.getClass(), "description", "TiUqHrjoEU");
        setField(term16819, term16819.getClass(), "name", "eoEvZbdLjL");
        setField(term16819, term16819.getClass(), "nameWithNamespace", "BkIxsyPkGy");
        setField(term16819, term16819.getClass(), "path", "mrMGwoRgVY");
        setField(term16819, term16819.getClass(), "pathWithNamespace", "mxVLTgCwki");
        setIntField(term16883, term16883.getClass(), "year", 2012);
        setShortField(term16883, term16883.getClass(), "month", (short) 8);
        setShortField(term16883, term16883.getClass(), "day", (short) 25);
        setField(term16882, term16882.getClass(), "date", term16883);
        setByteField(term16887, term16887.getClass(), "hour", (byte) 5);
        setByteField(term16887, term16887.getClass(), "minute", (byte) 20);
        setByteField(term16887, term16887.getClass(), "second", (byte) 50);
        setIntField(term16887, term16887.getClass(), "nano", 345595912);
        setField(term16882, term16882.getClass(), "time", term16887);
        setField(term16819, term16819.getClass(), "createdAt", term16882);
        setField(term16819, term16819.getClass(), "defaultBranch", "wCurppnDSA");
        setField(term16819, term16819.getClass(), "sshUrlToRepo", "JydxSNTMYt");
        setField(term16819, term16819.getClass(), "httpUrlToRepo", "KpurAcrHYT");
        setField(term16819, term16819.getClass(), "webUrl", "QjvDwgKJGz");
        setField(term16819, term16819.getClass(), "readmeUrl", "ngYxiXTZrk");
        setField(term16819, term16819.getClass(), "avatarUrl", "YTxBqWRAlo");
        setField(term16819, term16819.getClass(), "forksCount", term16964);
        setField(term16819, term16819.getClass(), "starCount", term16966);
        setIntField(term16969, term16969.getClass(), "year", 2021);
        setShortField(term16969, term16969.getClass(), "month", (short) 1);
        setShortField(term16969, term16969.getClass(), "day", (short) 18);
        setField(term16968, term16968.getClass(), "date", term16969);
        setByteField(term16973, term16973.getClass(), "hour", (byte) 13);
        setByteField(term16973, term16973.getClass(), "minute", (byte) 38);
        setByteField(term16973, term16973.getClass(), "second", (byte) 26);
        setIntField(term16973, term16973.getClass(), "nano", 544608644);
        setField(term16968, term16968.getClass(), "time", term16973);
        setField(term16819, term16819.getClass(), "lastActivityAt", term16968);
        setField(term16978, term16978.getClass(), "id", term16979);
        setField(term16978, term16978.getClass(), "name", "ReruUQRXwl");
        setField(term16978, term16978.getClass(), "path", "DWEsVQwuaE");
        setField(term16978, term16978.getClass(), "kind", "qGkNzZAeDN");
        setField(term16978, term16978.getClass(), "fullPath", "wdtiuPgTVJ");
        setField(term16978, term16978.getClass(), "parentId", term17029);
        setField(term16978, term16978.getClass(), "avatarUrl", "HUgzMgrpsK");
        setField(term16978, term16978.getClass(), "webUrl", "ubaBUfLolu");
        setField(term16819, term16819.getClass(), "namespace", term16978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term16819, args);
    }

};


