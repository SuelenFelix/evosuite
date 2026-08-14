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

public class VideoAllInfo_setAvId_3418992446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7825;
     Object term8002;

    public VideoAllInfo_setAvId_3418992446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7892 = new ArrayList();
        ((ArrayList) term7892).add("mKaHyMybrK");
        ((ArrayList) term7892).add("AyrEXuGrEj");
        ((ArrayList) term7892).add("yevIIoVYHq");
        ((ArrayList) term7892).add("UuYWMTqWTV");
        Object term7960 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7960, term7960.getClass(), "cid", -1465819833800717311L);
        setIntField(term7960, term7960.getClass(), "page", -1885090354);
        setField(term7960, term7960.getClass(), "from", "");
        setField(term7960, term7960.getClass(), "partName", "");
        setLongField(term7960, term7960.getClass(), "duration", -8306611953768020559L);
        setIntField(term7960, term7960.getClass(), "width", -2066804303);
        setIntField(term7960, term7960.getClass(), "height", -1731761810);
        setBooleanField(term7960, term7960.getClass(), "rotate", true);
        Object term7969 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7969, term7969.getClass(), "cid", -8692119547314358088L);
        setIntField(term7969, term7969.getClass(), "page", 197109649);
        setField(term7969, term7969.getClass(), "from", "");
        setField(term7969, term7969.getClass(), "partName", "");
        setLongField(term7969, term7969.getClass(), "duration", -2083524977884307536L);
        setIntField(term7969, term7969.getClass(), "width", -1239406390);
        setIntField(term7969, term7969.getClass(), "height", 1557431527);
        setBooleanField(term7969, term7969.getClass(), "rotate", false);
        Object term7978 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7978, term7978.getClass(), "cid", -2691996476200751382L);
        setIntField(term7978, term7978.getClass(), "page", -1504890659);
        setField(term7978, term7978.getClass(), "from", "");
        setField(term7978, term7978.getClass(), "partName", "");
        setLongField(term7978, term7978.getClass(), "duration", -3806202176947356197L);
        setIntField(term7978, term7978.getClass(), "width", 1358829571);
        setIntField(term7978, term7978.getClass(), "height", 991356662);
        setBooleanField(term7978, term7978.getClass(), "rotate", false);
        Object term7987 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7987, term7987.getClass(), "cid", -5534222035915952617L);
        setIntField(term7987, term7987.getClass(), "page", -506958186);
        setField(term7987, term7987.getClass(), "from", "");
        setField(term7987, term7987.getClass(), "partName", "");
        setLongField(term7987, term7987.getClass(), "duration", 8073378116544724166L);
        setIntField(term7987, term7987.getClass(), "width", -507387516);
        setIntField(term7987, term7987.getClass(), "height", -1970452551);
        setBooleanField(term7987, term7987.getClass(), "rotate", false);
        ArrayList term7958 = new ArrayList();
        ((ArrayList) term7958).add(term7960);
        ((ArrayList) term7958).add(term7969);
        ((ArrayList) term7958).add(term7978);
        ((ArrayList) term7958).add(term7987);
        ArrayList term7998 = new ArrayList();
        term7825 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term7825, term7825.getClass(), "bvId", "ubodzJoMGW");
        setIntField(term7825, term7825.getClass(), "avId", -2014576105);
        setIntField(term7825, term7825.getClass(), "videos", 1296895584);
        setIntField(term7825, term7825.getClass(), "tid", 628918458);
        setField(term7825, term7825.getClass(), "tName", "weddIktxOA");
        setIntField(term7825, term7825.getClass(), "copyright", -1274456137);
        setField(term7825, term7825.getClass(), "pic", "uSlMeISsDD");
        setField(term7825, term7825.getClass(), "title", "WdCiTDUKqn");
        setIntField(term7825, term7825.getClass(), "pubDate", 1041916673);
        setIntField(term7825, term7825.getClass(), "ctime", -601863069);
        setField(term7825, term7825.getClass(), "desc", "PSizQDoxxe");
        setField(term7825, term7825.getClass(), "descV2", term7892);
        setIntField(term7825, term7825.getClass(), "state", 663292551);
        setLongField(term7825, term7825.getClass(), "duration", 1353683663053784647L);
        setField(term7825, term7825.getClass(), "creatorUid", "DSFGlcaXUb");
        setField(term7825, term7825.getClass(), "pages", term7958);
        setField(term7825, term7825.getClass(), "tagList", term7998);
        term8002 = new Integer(-1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8002;
        callMethod(klass, "setAvId", argTypes, term7825, args);
    }

};


