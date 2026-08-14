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

public class VideoAllInfo_getPages_36712580831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17735;

    public VideoAllInfo_getPages_36712580831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17802 = new ArrayList();
        ((ArrayList) term17802).add("ojLrjltndD");
        ((ArrayList) term17802).add("VJtFSexKat");
        ((ArrayList) term17802).add("xPVddlPSQR");
        ((ArrayList) term17802).add("MxrhCLTMTH");
        ((ArrayList) term17802).add("kEehLMZcOU");
        ((ArrayList) term17802).add("RhLliqMiOF");
        Object term17894 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17894, term17894.getClass(), "cid", -3188913050877092148L);
        setIntField(term17894, term17894.getClass(), "page", 27043781);
        setField(term17894, term17894.getClass(), "from", "");
        setField(term17894, term17894.getClass(), "partName", "");
        setLongField(term17894, term17894.getClass(), "duration", -6759247883224780481L);
        setIntField(term17894, term17894.getClass(), "width", -1367122405);
        setIntField(term17894, term17894.getClass(), "height", -1703625118);
        setBooleanField(term17894, term17894.getClass(), "rotate", true);
        Object term17903 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17903, term17903.getClass(), "cid", -3724162247917461536L);
        setIntField(term17903, term17903.getClass(), "page", 1104108112);
        setField(term17903, term17903.getClass(), "from", "");
        setField(term17903, term17903.getClass(), "partName", "");
        setLongField(term17903, term17903.getClass(), "duration", 7893661350133453338L);
        setIntField(term17903, term17903.getClass(), "width", 1648665618);
        setIntField(term17903, term17903.getClass(), "height", 633765954);
        setBooleanField(term17903, term17903.getClass(), "rotate", false);
        Object term17912 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17912, term17912.getClass(), "cid", 9056245012917372169L);
        setIntField(term17912, term17912.getClass(), "page", 269110087);
        setField(term17912, term17912.getClass(), "from", "");
        setField(term17912, term17912.getClass(), "partName", "");
        setLongField(term17912, term17912.getClass(), "duration", 7848004402682338886L);
        setIntField(term17912, term17912.getClass(), "width", 1545119095);
        setIntField(term17912, term17912.getClass(), "height", 1671229683);
        setBooleanField(term17912, term17912.getClass(), "rotate", false);
        ArrayList term17892 = new ArrayList();
        ((ArrayList) term17892).add(term17894);
        ((ArrayList) term17892).add(term17903);
        ((ArrayList) term17892).add(term17912);
        ArrayList term17923 = new ArrayList();
        ((ArrayList) term17923).add("ZiMAmqpbzk");
        ((ArrayList) term17923).add("UwJtBPAtSU");
        ((ArrayList) term17923).add("nBaMiSdFmS");
        ((ArrayList) term17923).add("ezwGsjqTai");
        term17735 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term17735, term17735.getClass(), "bvId", "VOHPpErtan");
        setIntField(term17735, term17735.getClass(), "avId", -31751777);
        setIntField(term17735, term17735.getClass(), "videos", -246967963);
        setIntField(term17735, term17735.getClass(), "tid", -1777140369);
        setField(term17735, term17735.getClass(), "tName", "GDMUlolTNs");
        setIntField(term17735, term17735.getClass(), "copyright", 993627098);
        setField(term17735, term17735.getClass(), "pic", "xpLvWisjzN");
        setField(term17735, term17735.getClass(), "title", "IKfozyyKEj");
        setIntField(term17735, term17735.getClass(), "pubDate", 872295704);
        setIntField(term17735, term17735.getClass(), "ctime", 86041387);
        setField(term17735, term17735.getClass(), "desc", "thCjwQjRBL");
        setField(term17735, term17735.getClass(), "descV2", term17802);
        setIntField(term17735, term17735.getClass(), "state", 1010721666);
        setLongField(term17735, term17735.getClass(), "duration", 6462632207326555041L);
        setField(term17735, term17735.getClass(), "creatorUid", "jlhonEGrJH");
        setField(term17735, term17735.getClass(), "pages", term17892);
        setField(term17735, term17735.getClass(), "tagList", term17923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPages", argTypes, term17735, args);
    }

};


