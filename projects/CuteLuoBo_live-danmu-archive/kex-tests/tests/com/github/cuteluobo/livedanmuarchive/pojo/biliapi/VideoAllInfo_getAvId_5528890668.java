package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class VideoAllInfo_getAvId_5528890668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809;

    public VideoAllInfo_getAvId_5528890668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1876 = new ArrayList();
        ((ArrayList) term1876).add("sEnIVFtZuQ");
        ((ArrayList) term1876).add("ZVecLZMLHF");
        ((ArrayList) term1876).add("fztQhjqwdP");
        ((ArrayList) term1876).add("eVpkWxjuki");
        ((ArrayList) term1876).add("SJiQaLvSKv");
        Object term1956 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term1956, term1956.getClass(), "cid", 5907001541142728739L);
        setIntField(term1956, term1956.getClass(), "page", -1210583429);
        setField(term1956, term1956.getClass(), "from", "");
        setField(term1956, term1956.getClass(), "partName", "");
        setLongField(term1956, term1956.getClass(), "duration", 4178434741742309755L);
        setIntField(term1956, term1956.getClass(), "width", -663691365);
        setIntField(term1956, term1956.getClass(), "height", 339854490);
        setBooleanField(term1956, term1956.getClass(), "rotate", true);
        Object term1965 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term1965, term1965.getClass(), "cid", -2068172595987555756L);
        setIntField(term1965, term1965.getClass(), "page", -615654495);
        setField(term1965, term1965.getClass(), "from", "");
        setField(term1965, term1965.getClass(), "partName", "");
        setLongField(term1965, term1965.getClass(), "duration", -6292278961887936280L);
        setIntField(term1965, term1965.getClass(), "width", -1476117762);
        setIntField(term1965, term1965.getClass(), "height", -341962980);
        setBooleanField(term1965, term1965.getClass(), "rotate", false);
        ArrayList term1954 = new ArrayList();
        ((ArrayList) term1954).add(term1956);
        ((ArrayList) term1954).add(term1965);
        ArrayList term1976 = new ArrayList();
        ((ArrayList) term1976).add("XylxrMBraH");
        ((ArrayList) term1976).add("pORebkoRdD");
        ((ArrayList) term1976).add("mXGCWJDOqA");
        term1809 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term1809, term1809.getClass(), "bvId", "AWRooQKkdW");
        setIntField(term1809, term1809.getClass(), "avId", -894662986);
        setIntField(term1809, term1809.getClass(), "videos", 304775596);
        setIntField(term1809, term1809.getClass(), "tid", -1347665717);
        setField(term1809, term1809.getClass(), "tName", "vjxIhXHxGR");
        setIntField(term1809, term1809.getClass(), "copyright", -1888585309);
        setField(term1809, term1809.getClass(), "pic", "QXzGXbEXMu");
        setField(term1809, term1809.getClass(), "title", "qxSDVejjiY");
        setIntField(term1809, term1809.getClass(), "pubDate", 683666002);
        setIntField(term1809, term1809.getClass(), "ctime", 1596213415);
        setField(term1809, term1809.getClass(), "desc", "xBsXSDjXYK");
        setField(term1809, term1809.getClass(), "descV2", term1876);
        setIntField(term1809, term1809.getClass(), "state", -268815336);
        setLongField(term1809, term1809.getClass(), "duration", -8708192233349544946L);
        setField(term1809, term1809.getClass(), "creatorUid", "OEXDRUKcFl");
        setField(term1809, term1809.getClass(), "pages", term1954);
        setField(term1809, term1809.getClass(), "tagList", term1976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvId", argTypes, term1809, args);
    }

};


