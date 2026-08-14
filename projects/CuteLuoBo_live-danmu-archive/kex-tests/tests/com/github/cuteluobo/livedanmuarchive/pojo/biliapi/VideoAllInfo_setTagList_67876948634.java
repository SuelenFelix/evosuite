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
import java.util.LinkedList;

public class VideoAllInfo_setTagList_67876948634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19201;
     Object term19504;

    public VideoAllInfo_setTagList_67876948634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19268 = new ArrayList();
        ((ArrayList) term19268).add("pLbTzSMbsN");
        ((ArrayList) term19268).add("lFSbxerCPP");
        ((ArrayList) term19268).add("vjaZIyixCm");
        ((ArrayList) term19268).add("gAAPyftlIR");
        ((ArrayList) term19268).add("kevWstoxwq");
        ((ArrayList) term19268).add("aSYOhFwzSm");
        ((ArrayList) term19268).add("pVZlzrBeDB");
        ((ArrayList) term19268).add("EfSUvjuZAA");
        ((ArrayList) term19268).add("PrHWfHydsG");
        Object term19396 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term19396, term19396.getClass(), "cid", -6481933642917183045L);
        setIntField(term19396, term19396.getClass(), "page", -341287775);
        setField(term19396, term19396.getClass(), "from", "");
        setField(term19396, term19396.getClass(), "partName", "");
        setLongField(term19396, term19396.getClass(), "duration", 2054808971423494757L);
        setIntField(term19396, term19396.getClass(), "width", -1651110911);
        setIntField(term19396, term19396.getClass(), "height", -1934033808);
        setBooleanField(term19396, term19396.getClass(), "rotate", false);
        Object term19405 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term19405, term19405.getClass(), "cid", 8734518435788772658L);
        setIntField(term19405, term19405.getClass(), "page", 950322609);
        setField(term19405, term19405.getClass(), "from", "");
        setField(term19405, term19405.getClass(), "partName", "");
        setLongField(term19405, term19405.getClass(), "duration", 2289954139848415685L);
        setIntField(term19405, term19405.getClass(), "width", -2023791789);
        setIntField(term19405, term19405.getClass(), "height", 353974456);
        setBooleanField(term19405, term19405.getClass(), "rotate", true);
        ArrayList term19394 = new ArrayList();
        ((ArrayList) term19394).add(term19396);
        ((ArrayList) term19394).add(term19405);
        ArrayList term19416 = new ArrayList();
        ((ArrayList) term19416).add("HyFLOXeoDX");
        ((ArrayList) term19416).add("crkNabVaWs");
        ((ArrayList) term19416).add("qBcAJgrABE");
        ((ArrayList) term19416).add("JKdZuLFRwC");
        ((ArrayList) term19416).add("hfhLLoWnRU");
        ((ArrayList) term19416).add("RpofnOPYha");
        ((ArrayList) term19416).add("CQYmAsjvPU");
        term19201 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19201, term19201.getClass(), "bvId", "rZyrfnMvHa");
        setIntField(term19201, term19201.getClass(), "avId", -1893236300);
        setIntField(term19201, term19201.getClass(), "videos", -1858909368);
        setIntField(term19201, term19201.getClass(), "tid", -280113263);
        setField(term19201, term19201.getClass(), "tName", "GMyMhTZeDC");
        setIntField(term19201, term19201.getClass(), "copyright", 529625347);
        setField(term19201, term19201.getClass(), "pic", "KqQOTshBOL");
        setField(term19201, term19201.getClass(), "title", "cuWgFcYkPC");
        setIntField(term19201, term19201.getClass(), "pubDate", 1409095253);
        setIntField(term19201, term19201.getClass(), "ctime", 315179039);
        setField(term19201, term19201.getClass(), "desc", "HfbcOKkXBm");
        setField(term19201, term19201.getClass(), "descV2", term19268);
        setIntField(term19201, term19201.getClass(), "state", -1835923897);
        setLongField(term19201, term19201.getClass(), "duration", 675601558105654203L);
        setField(term19201, term19201.getClass(), "creatorUid", "igruEzTbBE");
        setField(term19201, term19201.getClass(), "pages", term19394);
        setField(term19201, term19201.getClass(), "tagList", term19416);
        term19504 = new LinkedList();
        ((LinkedList) term19504).add("NNkIIFpxiB");
        ((LinkedList) term19504).add("sBmtvFPDso");
        ((LinkedList) term19504).add("");
        ((LinkedList) term19504).add((Object)null);
        ((LinkedList) term19504).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19504;
        callMethod(klass, "setTagList", argTypes, term19201, args);
    }

};


