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
import java.lang.Integer;

public class VideoAllInfo_setVideos_8870490688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8451;
     Object term8709;

    public VideoAllInfo_setVideos_8870490688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8518 = new ArrayList();
        ((ArrayList) term8518).add("goAoCMhKBu");
        ((ArrayList) term8518).add("BWxJSgKHRT");
        ((ArrayList) term8518).add("AGXoIndFnm");
        ((ArrayList) term8518).add("mwmFMNEzkK");
        ((ArrayList) term8518).add("kVAmKknVln");
        ((ArrayList) term8518).add("MRFLbEGYKG");
        Object term8610 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term8610, term8610.getClass(), "cid", -8993073054427011802L);
        setIntField(term8610, term8610.getClass(), "page", 318591690);
        setField(term8610, term8610.getClass(), "from", "");
        setField(term8610, term8610.getClass(), "partName", "");
        setLongField(term8610, term8610.getClass(), "duration", 2287785643837657068L);
        setIntField(term8610, term8610.getClass(), "width", -165587447);
        setIntField(term8610, term8610.getClass(), "height", -1347358701);
        setBooleanField(term8610, term8610.getClass(), "rotate", true);
        ArrayList term8608 = new ArrayList();
        ((ArrayList) term8608).add(term8610);
        ArrayList term8621 = new ArrayList();
        ((ArrayList) term8621).add("YgQvdcBQKw");
        ((ArrayList) term8621).add("FiYYLuailz");
        ((ArrayList) term8621).add("XebAeSnCKZ");
        ((ArrayList) term8621).add("GeddnXjHGy");
        ((ArrayList) term8621).add("vLTbaoAxBm");
        ((ArrayList) term8621).add("BXTjEyEZxD");
        ((ArrayList) term8621).add("oKhVzOKUFW");
        term8451 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term8451, term8451.getClass(), "bvId", "ckQLZGFjMX");
        setIntField(term8451, term8451.getClass(), "avId", 1102721075);
        setIntField(term8451, term8451.getClass(), "videos", -426764678);
        setIntField(term8451, term8451.getClass(), "tid", -1222614956);
        setField(term8451, term8451.getClass(), "tName", "qphdrqUtNx");
        setIntField(term8451, term8451.getClass(), "copyright", -1870495012);
        setField(term8451, term8451.getClass(), "pic", "bwlLFAfNWx");
        setField(term8451, term8451.getClass(), "title", "JWodNQzjjV");
        setIntField(term8451, term8451.getClass(), "pubDate", -1310015129);
        setIntField(term8451, term8451.getClass(), "ctime", -2104981311);
        setField(term8451, term8451.getClass(), "desc", "CAgxWjhxNf");
        setField(term8451, term8451.getClass(), "descV2", term8518);
        setIntField(term8451, term8451.getClass(), "state", -571169753);
        setLongField(term8451, term8451.getClass(), "duration", -7400951017937830861L);
        setField(term8451, term8451.getClass(), "creatorUid", "BYrGukTyof");
        setField(term8451, term8451.getClass(), "pages", term8608);
        setField(term8451, term8451.getClass(), "tagList", term8621);
        term8709 = new Integer(806595993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8709;
        callMethod(klass, "setVideos", argTypes, term8451, args);
    }

};


