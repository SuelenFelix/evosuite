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

public class VideoAllInfo_setCtime_3573956022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14310;
     Object term14598;

    public VideoAllInfo_setCtime_3573956022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14377 = new ArrayList();
        ((ArrayList) term14377).add("jDFNSuvZqm");
        ((ArrayList) term14377).add("pLvkKHqNYX");
        ((ArrayList) term14377).add("PwqnuJJwjR");
        ((ArrayList) term14377).add("NFkbBiPeiw");
        ((ArrayList) term14377).add("tlRvilQyjJ");
        ((ArrayList) term14377).add("gwTUlYNpjM");
        ((ArrayList) term14377).add("uXYojRmxrM");
        Object term14481 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term14481, term14481.getClass(), "cid", 2551047634163864862L);
        setIntField(term14481, term14481.getClass(), "page", -516303035);
        setField(term14481, term14481.getClass(), "from", "");
        setField(term14481, term14481.getClass(), "partName", "");
        setLongField(term14481, term14481.getClass(), "duration", -6656996002079682356L);
        setIntField(term14481, term14481.getClass(), "width", -2143043890);
        setIntField(term14481, term14481.getClass(), "height", -2138825831);
        setBooleanField(term14481, term14481.getClass(), "rotate", false);
        Object term14490 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term14490, term14490.getClass(), "cid", 2166921473521388808L);
        setIntField(term14490, term14490.getClass(), "page", 1454781562);
        setField(term14490, term14490.getClass(), "from", "");
        setField(term14490, term14490.getClass(), "partName", "");
        setLongField(term14490, term14490.getClass(), "duration", 1964822153944985001L);
        setIntField(term14490, term14490.getClass(), "width", -27944011);
        setIntField(term14490, term14490.getClass(), "height", -20614472);
        setBooleanField(term14490, term14490.getClass(), "rotate", true);
        Object term14499 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term14499, term14499.getClass(), "cid", -955253666696787757L);
        setIntField(term14499, term14499.getClass(), "page", 1126618861);
        setField(term14499, term14499.getClass(), "from", "");
        setField(term14499, term14499.getClass(), "partName", "");
        setLongField(term14499, term14499.getClass(), "duration", -99017747847004910L);
        setIntField(term14499, term14499.getClass(), "width", 947449400);
        setIntField(term14499, term14499.getClass(), "height", -763799087);
        setBooleanField(term14499, term14499.getClass(), "rotate", true);
        ArrayList term14479 = new ArrayList();
        ((ArrayList) term14479).add(term14481);
        ((ArrayList) term14479).add(term14490);
        ((ArrayList) term14479).add(term14499);
        ArrayList term14510 = new ArrayList();
        ((ArrayList) term14510).add("FLQJOzEXff");
        ((ArrayList) term14510).add("qlaIVJBSfQ");
        ((ArrayList) term14510).add("lYvIWBFFsq");
        ((ArrayList) term14510).add("tThwsqWKcE");
        ((ArrayList) term14510).add("bkSgsDrkCN");
        ((ArrayList) term14510).add("hwjlcimgJH");
        ((ArrayList) term14510).add("TLxQzxvizR");
        term14310 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term14310, term14310.getClass(), "bvId", "jlcBpLoWfd");
        setIntField(term14310, term14310.getClass(), "avId", 1065595802);
        setIntField(term14310, term14310.getClass(), "videos", 21031843);
        setIntField(term14310, term14310.getClass(), "tid", -380787857);
        setField(term14310, term14310.getClass(), "tName", "oYymmLqbfJ");
        setIntField(term14310, term14310.getClass(), "copyright", 319853052);
        setField(term14310, term14310.getClass(), "pic", "YaDWphDOSz");
        setField(term14310, term14310.getClass(), "title", "nnnmCgFBLw");
        setIntField(term14310, term14310.getClass(), "pubDate", -1097563716);
        setIntField(term14310, term14310.getClass(), "ctime", 1572907769);
        setField(term14310, term14310.getClass(), "desc", "hSSCyNEhyH");
        setField(term14310, term14310.getClass(), "descV2", term14377);
        setIntField(term14310, term14310.getClass(), "state", 1608016787);
        setLongField(term14310, term14310.getClass(), "duration", 678465732474023847L);
        setField(term14310, term14310.getClass(), "creatorUid", "cxRwRcodud");
        setField(term14310, term14310.getClass(), "pages", term14479);
        setField(term14310, term14310.getClass(), "tagList", term14510);
        term14598 = new Integer(1207142014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14598;
        callMethod(klass, "setCtime", argTypes, term14310, args);
    }

};


