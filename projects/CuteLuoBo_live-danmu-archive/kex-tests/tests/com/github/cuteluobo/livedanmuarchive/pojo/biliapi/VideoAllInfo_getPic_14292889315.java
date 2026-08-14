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

public class VideoAllInfo_getPic_14292889315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11095;

    public VideoAllInfo_getPic_14292889315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11162 = new ArrayList();
        ((ArrayList) term11162).add("PsMKIIEwdR");
        ((ArrayList) term11162).add("RbQmXqfXAT");
        ((ArrayList) term11162).add("fcCAsvfBbe");
        ((ArrayList) term11162).add("mUNcKUxghj");
        ((ArrayList) term11162).add("lnvLKbtveE");
        ((ArrayList) term11162).add("FfrrEhTHzQ");
        ((ArrayList) term11162).add("LXnDNrMsqT");
        ((ArrayList) term11162).add("ZLQamJFBmu");
        ((ArrayList) term11162).add("ZWcOCwKNvd");
        Object term11290 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term11290, term11290.getClass(), "cid", -6837989212848250735L);
        setIntField(term11290, term11290.getClass(), "page", 1741500243);
        setField(term11290, term11290.getClass(), "from", "");
        setField(term11290, term11290.getClass(), "partName", "");
        setLongField(term11290, term11290.getClass(), "duration", -4231979631084175364L);
        setIntField(term11290, term11290.getClass(), "width", -2070466617);
        setIntField(term11290, term11290.getClass(), "height", -1127721881);
        setBooleanField(term11290, term11290.getClass(), "rotate", false);
        Object term11299 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term11299, term11299.getClass(), "cid", 1634166935474035772L);
        setIntField(term11299, term11299.getClass(), "page", 1074848808);
        setField(term11299, term11299.getClass(), "from", "");
        setField(term11299, term11299.getClass(), "partName", "");
        setLongField(term11299, term11299.getClass(), "duration", -2614906266506360948L);
        setIntField(term11299, term11299.getClass(), "width", -146054762);
        setIntField(term11299, term11299.getClass(), "height", 798043553);
        setBooleanField(term11299, term11299.getClass(), "rotate", false);
        Object term11308 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term11308, term11308.getClass(), "cid", 1133267598258375793L);
        setIntField(term11308, term11308.getClass(), "page", 533197381);
        setField(term11308, term11308.getClass(), "from", "");
        setField(term11308, term11308.getClass(), "partName", "");
        setLongField(term11308, term11308.getClass(), "duration", 2990264647913003810L);
        setIntField(term11308, term11308.getClass(), "width", 1048271679);
        setIntField(term11308, term11308.getClass(), "height", -1529797673);
        setBooleanField(term11308, term11308.getClass(), "rotate", true);
        ArrayList term11288 = new ArrayList();
        ((ArrayList) term11288).add(term11290);
        ((ArrayList) term11288).add(term11299);
        ((ArrayList) term11288).add(term11308);
        ArrayList term11319 = new ArrayList();
        ((ArrayList) term11319).add("dDHcmzPAmP");
        ((ArrayList) term11319).add("HEaTkWYBgv");
        ((ArrayList) term11319).add("MpJsPKLTIU");
        ((ArrayList) term11319).add("IiNCZfdouL");
        ((ArrayList) term11319).add("AhOHzCsHKW");
        ((ArrayList) term11319).add("UqgLPaaAHi");
        ((ArrayList) term11319).add("xypryEkUPF");
        term11095 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term11095, term11095.getClass(), "bvId", "iVOvTzOxwt");
        setIntField(term11095, term11095.getClass(), "avId", -1891015523);
        setIntField(term11095, term11095.getClass(), "videos", -1560631747);
        setIntField(term11095, term11095.getClass(), "tid", 1215150180);
        setField(term11095, term11095.getClass(), "tName", "BjZQdecXvB");
        setIntField(term11095, term11095.getClass(), "copyright", -1422859977);
        setField(term11095, term11095.getClass(), "pic", "iUkOOQhEkw");
        setField(term11095, term11095.getClass(), "title", "wmVoFoUVmU");
        setIntField(term11095, term11095.getClass(), "pubDate", -1972436591);
        setIntField(term11095, term11095.getClass(), "ctime", 68922753);
        setField(term11095, term11095.getClass(), "desc", "lLiSiPCciB");
        setField(term11095, term11095.getClass(), "descV2", term11162);
        setIntField(term11095, term11095.getClass(), "state", -220791533);
        setLongField(term11095, term11095.getClass(), "duration", -3565554762799701668L);
        setField(term11095, term11095.getClass(), "creatorUid", "GTmoNrziyc");
        setField(term11095, term11095.getClass(), "pages", term11288);
        setField(term11095, term11095.getClass(), "tagList", term11319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPic", argTypes, term11095, args);
    }

};


