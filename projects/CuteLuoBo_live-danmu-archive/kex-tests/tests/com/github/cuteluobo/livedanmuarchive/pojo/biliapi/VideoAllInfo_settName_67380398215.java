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

public class VideoAllInfo_settName_67380398215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4266;

    public VideoAllInfo_settName_67380398215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4333 = new ArrayList();
        ((ArrayList) term4333).add("jDmhBrIoDa");
        ((ArrayList) term4333).add("SPtPatHeOm");
        ((ArrayList) term4333).add("ywmcuThdfL");
        ((ArrayList) term4333).add("GBOEuByOfr");
        ((ArrayList) term4333).add("NHbOFFjyVK");
        Object term4413 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term4413, term4413.getClass(), "cid", -5386201758403679145L);
        setIntField(term4413, term4413.getClass(), "page", -945116798);
        setField(term4413, term4413.getClass(), "from", "");
        setField(term4413, term4413.getClass(), "partName", "");
        setLongField(term4413, term4413.getClass(), "duration", -7268507582722666254L);
        setIntField(term4413, term4413.getClass(), "width", 1593461795);
        setIntField(term4413, term4413.getClass(), "height", 515182546);
        setBooleanField(term4413, term4413.getClass(), "rotate", false);
        Object term4422 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term4422, term4422.getClass(), "cid", 5671808784468963649L);
        setIntField(term4422, term4422.getClass(), "page", -936895502);
        setField(term4422, term4422.getClass(), "from", "");
        setField(term4422, term4422.getClass(), "partName", "");
        setLongField(term4422, term4422.getClass(), "duration", 2297097306706899827L);
        setIntField(term4422, term4422.getClass(), "width", -129547140);
        setIntField(term4422, term4422.getClass(), "height", 199287428);
        setBooleanField(term4422, term4422.getClass(), "rotate", true);
        Object term4431 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term4431, term4431.getClass(), "cid", -900457279156388404L);
        setIntField(term4431, term4431.getClass(), "page", -1195339592);
        setField(term4431, term4431.getClass(), "from", "");
        setField(term4431, term4431.getClass(), "partName", "");
        setLongField(term4431, term4431.getClass(), "duration", 1084801489398441516L);
        setIntField(term4431, term4431.getClass(), "width", -376422566);
        setIntField(term4431, term4431.getClass(), "height", 306847454);
        setBooleanField(term4431, term4431.getClass(), "rotate", false);
        ArrayList term4411 = new ArrayList();
        ((ArrayList) term4411).add(term4413);
        ((ArrayList) term4411).add(term4422);
        ((ArrayList) term4411).add(term4431);
        ArrayList term4442 = new ArrayList();
        ((ArrayList) term4442).add("FjOiNAfBOc");
        ((ArrayList) term4442).add("iCCsaLHohG");
        ((ArrayList) term4442).add("NJhGgctbdj");
        ((ArrayList) term4442).add("MYWYUeLGOp");
        ((ArrayList) term4442).add("tsTGdgQYUL");
        term4266 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term4266, term4266.getClass(), "bvId", "uSUvKAyuvd");
        setIntField(term4266, term4266.getClass(), "avId", -1497710478);
        setIntField(term4266, term4266.getClass(), "videos", 49950830);
        setIntField(term4266, term4266.getClass(), "tid", -525257914);
        setField(term4266, term4266.getClass(), "tName", "onQLVONGuf");
        setIntField(term4266, term4266.getClass(), "copyright", 147209682);
        setField(term4266, term4266.getClass(), "pic", "SOrEHbcbmn");
        setField(term4266, term4266.getClass(), "title", "bnsyeQXFdu");
        setIntField(term4266, term4266.getClass(), "pubDate", 34470066);
        setIntField(term4266, term4266.getClass(), "ctime", 2058711405);
        setField(term4266, term4266.getClass(), "desc", "BwtdjiefJn");
        setField(term4266, term4266.getClass(), "descV2", term4333);
        setIntField(term4266, term4266.getClass(), "state", 1743683601);
        setLongField(term4266, term4266.getClass(), "duration", -4822736661741380518L);
        setField(term4266, term4266.getClass(), "creatorUid", "zaloBqlrSo");
        setField(term4266, term4266.getClass(), "pages", term4411);
        setField(term4266, term4266.getClass(), "tagList", term4442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TtGbVmKcnX";
        callMethod(klass, "settName", argTypes, term4266, args);
    }

};


