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

public class VideoAllInfo_getCopyright_146357540316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4688;

    public VideoAllInfo_getCopyright_146357540316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4755 = new ArrayList();
        ((ArrayList) term4755).add("EKjQdtKxAM");
        ((ArrayList) term4755).add("TXZAIPQJHt");
        ((ArrayList) term4755).add("DIbeDHICho");
        ((ArrayList) term4755).add("dJGPlmSRnz");
        ((ArrayList) term4755).add("DPskuFUobI");
        Object term4835 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term4835, term4835.getClass(), "cid", 3620247240684476031L);
        setIntField(term4835, term4835.getClass(), "page", -249614216);
        setField(term4835, term4835.getClass(), "from", "");
        setField(term4835, term4835.getClass(), "partName", "");
        setLongField(term4835, term4835.getClass(), "duration", 8313800941204938919L);
        setIntField(term4835, term4835.getClass(), "width", 1870727665);
        setIntField(term4835, term4835.getClass(), "height", -519881101);
        setBooleanField(term4835, term4835.getClass(), "rotate", false);
        ArrayList term4833 = new ArrayList();
        ((ArrayList) term4833).add(term4835);
        ArrayList term4846 = new ArrayList();
        term4688 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term4688, term4688.getClass(), "bvId", "GJVkUrCVdD");
        setIntField(term4688, term4688.getClass(), "avId", 1745276158);
        setIntField(term4688, term4688.getClass(), "videos", 2009020256);
        setIntField(term4688, term4688.getClass(), "tid", 2049577015);
        setField(term4688, term4688.getClass(), "tName", "zNdorvdUgu");
        setIntField(term4688, term4688.getClass(), "copyright", 1236004505);
        setField(term4688, term4688.getClass(), "pic", "oPxuZbkYio");
        setField(term4688, term4688.getClass(), "title", "vKitydDVnM");
        setIntField(term4688, term4688.getClass(), "pubDate", 1050765721);
        setIntField(term4688, term4688.getClass(), "ctime", 474518942);
        setField(term4688, term4688.getClass(), "desc", "urCiQnUFBM");
        setField(term4688, term4688.getClass(), "descV2", term4755);
        setIntField(term4688, term4688.getClass(), "state", -1656687479);
        setLongField(term4688, term4688.getClass(), "duration", 6273754186658578034L);
        setField(term4688, term4688.getClass(), "creatorUid", "wBGfLpNNiZ");
        setField(term4688, term4688.getClass(), "pages", term4833);
        setField(term4688, term4688.getClass(), "tagList", term4846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCopyright", argTypes, term4688, args);
    }

};


