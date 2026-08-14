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

public class VideoAllInfo_getDescV2_106594463529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9801;

    public VideoAllInfo_getDescV2_106594463529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9868 = new ArrayList();
        ((ArrayList) term9868).add("HJwNgUzZZR");
        ((ArrayList) term9868).add("FvUCZgTXhq");
        ((ArrayList) term9868).add("wWWidPCHzx");
        ((ArrayList) term9868).add("OwPIiBRuKK");
        ((ArrayList) term9868).add("sgfGySMODT");
        Object term9948 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term9948, term9948.getClass(), "cid", 1253549421411622358L);
        setIntField(term9948, term9948.getClass(), "page", 990883365);
        setField(term9948, term9948.getClass(), "from", "");
        setField(term9948, term9948.getClass(), "partName", "");
        setLongField(term9948, term9948.getClass(), "duration", 3666226122807672448L);
        setIntField(term9948, term9948.getClass(), "width", 633598642);
        setIntField(term9948, term9948.getClass(), "height", 1862841859);
        setBooleanField(term9948, term9948.getClass(), "rotate", true);
        ArrayList term9946 = new ArrayList();
        ((ArrayList) term9946).add(term9948);
        ArrayList term9959 = new ArrayList();
        ((ArrayList) term9959).add("btBLMvHzJg");
        ((ArrayList) term9959).add("JdOMfNWgLP");
        ((ArrayList) term9959).add("uWqXrwAsDU");
        ((ArrayList) term9959).add("hgFbWAUtsu");
        term9801 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term9801, term9801.getClass(), "bvId", "KHtaDOIcJZ");
        setIntField(term9801, term9801.getClass(), "avId", 330043745);
        setIntField(term9801, term9801.getClass(), "videos", -509349195);
        setIntField(term9801, term9801.getClass(), "tid", -1639041228);
        setField(term9801, term9801.getClass(), "tName", "vgdwrCZczl");
        setIntField(term9801, term9801.getClass(), "copyright", 2027686272);
        setField(term9801, term9801.getClass(), "pic", "gKMNrpKBpu");
        setField(term9801, term9801.getClass(), "title", "ZbHJVEqcoa");
        setIntField(term9801, term9801.getClass(), "pubDate", -1494356104);
        setIntField(term9801, term9801.getClass(), "ctime", -695279311);
        setField(term9801, term9801.getClass(), "desc", "awDQVEVIKi");
        setField(term9801, term9801.getClass(), "descV2", term9868);
        setIntField(term9801, term9801.getClass(), "state", 114279242);
        setLongField(term9801, term9801.getClass(), "duration", -3277773415369003529L);
        setField(term9801, term9801.getClass(), "creatorUid", "ndAITnOsny");
        setField(term9801, term9801.getClass(), "pages", term9946);
        setField(term9801, term9801.getClass(), "tagList", term9959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescV2", argTypes, term9801, args);
    }

};


