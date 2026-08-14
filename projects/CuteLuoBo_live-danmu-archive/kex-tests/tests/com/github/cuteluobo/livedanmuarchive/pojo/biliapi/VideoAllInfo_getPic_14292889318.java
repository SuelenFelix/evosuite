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

public class VideoAllInfo_getPic_14292889318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5525;

    public VideoAllInfo_getPic_14292889318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5592 = new ArrayList();
        ((ArrayList) term5592).add("RCOqfVsRHt");
        ((ArrayList) term5592).add("TSyCeEZPaT");
        ((ArrayList) term5592).add("JeZFtaqkzW");
        ((ArrayList) term5592).add("vOVuNSCCLe");
        ((ArrayList) term5592).add("fzeqPnzpnt");
        ((ArrayList) term5592).add("RxbhrFBjkO");
        Object term5684 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term5684, term5684.getClass(), "cid", 7495904023107549024L);
        setIntField(term5684, term5684.getClass(), "page", -1404350380);
        setField(term5684, term5684.getClass(), "from", "");
        setField(term5684, term5684.getClass(), "partName", "");
        setLongField(term5684, term5684.getClass(), "duration", 8802866251294305945L);
        setIntField(term5684, term5684.getClass(), "width", -2013924238);
        setIntField(term5684, term5684.getClass(), "height", 579006268);
        setBooleanField(term5684, term5684.getClass(), "rotate", false);
        Object term5693 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term5693, term5693.getClass(), "cid", 4513004407927379358L);
        setIntField(term5693, term5693.getClass(), "page", -1694747156);
        setField(term5693, term5693.getClass(), "from", "");
        setField(term5693, term5693.getClass(), "partName", "");
        setLongField(term5693, term5693.getClass(), "duration", -7115418542247301000L);
        setIntField(term5693, term5693.getClass(), "width", 1466373988);
        setIntField(term5693, term5693.getClass(), "height", -358526505);
        setBooleanField(term5693, term5693.getClass(), "rotate", true);
        ArrayList term5682 = new ArrayList();
        ((ArrayList) term5682).add(term5684);
        ((ArrayList) term5682).add(term5693);
        ArrayList term5704 = new ArrayList();
        ((ArrayList) term5704).add("qFGKIJjlmV");
        ((ArrayList) term5704).add("IHqvyhMtuM");
        ((ArrayList) term5704).add("dAldIGYAXV");
        ((ArrayList) term5704).add("mLwibAPEsa");
        ((ArrayList) term5704).add("zsWKWiTFuo");
        ((ArrayList) term5704).add("UPUbwyHQKN");
        ((ArrayList) term5704).add("lgQkrXANyI");
        ((ArrayList) term5704).add("MeTmRZXErV");
        term5525 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term5525, term5525.getClass(), "bvId", "jnwVnmKAFv");
        setIntField(term5525, term5525.getClass(), "avId", 339372704);
        setIntField(term5525, term5525.getClass(), "videos", -851097944);
        setIntField(term5525, term5525.getClass(), "tid", 803925431);
        setField(term5525, term5525.getClass(), "tName", "TXyHhqeCjR");
        setIntField(term5525, term5525.getClass(), "copyright", 76929641);
        setField(term5525, term5525.getClass(), "pic", "lZIgPZPgTu");
        setField(term5525, term5525.getClass(), "title", "iuCxnHGMoW");
        setIntField(term5525, term5525.getClass(), "pubDate", -2003192918);
        setIntField(term5525, term5525.getClass(), "ctime", -1362856620);
        setField(term5525, term5525.getClass(), "desc", "GPSEWEDSTo");
        setField(term5525, term5525.getClass(), "descV2", term5592);
        setIntField(term5525, term5525.getClass(), "state", -1835839814);
        setLongField(term5525, term5525.getClass(), "duration", -1616722610139554082L);
        setField(term5525, term5525.getClass(), "creatorUid", "aanyiAOJCl");
        setField(term5525, term5525.getClass(), "pages", term5682);
        setField(term5525, term5525.getClass(), "tagList", term5704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPic", argTypes, term5525, args);
    }

};


