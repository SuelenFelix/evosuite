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

public class VideoAllInfo_setTitle_178135348322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6964;

    public VideoAllInfo_setTitle_178135348322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7031 = new ArrayList();
        ((ArrayList) term7031).add("MnovcqFhCl");
        ((ArrayList) term7031).add("qYtAeLzOhW");
        ((ArrayList) term7031).add("tJzmOfcUnY");
        ((ArrayList) term7031).add("TKlccZUpjz");
        Object term7099 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7099, term7099.getClass(), "cid", 3427570961451840069L);
        setIntField(term7099, term7099.getClass(), "page", -1629418973);
        setField(term7099, term7099.getClass(), "from", "");
        setField(term7099, term7099.getClass(), "partName", "");
        setLongField(term7099, term7099.getClass(), "duration", 4502292577098212311L);
        setIntField(term7099, term7099.getClass(), "width", -100825168);
        setIntField(term7099, term7099.getClass(), "height", 768407648);
        setBooleanField(term7099, term7099.getClass(), "rotate", true);
        Object term7108 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7108, term7108.getClass(), "cid", -3730936709704460408L);
        setIntField(term7108, term7108.getClass(), "page", -350454594);
        setField(term7108, term7108.getClass(), "from", "");
        setField(term7108, term7108.getClass(), "partName", "");
        setLongField(term7108, term7108.getClass(), "duration", -8614778293741404325L);
        setIntField(term7108, term7108.getClass(), "width", -1148142995);
        setIntField(term7108, term7108.getClass(), "height", -233024044);
        setBooleanField(term7108, term7108.getClass(), "rotate", false);
        ArrayList term7097 = new ArrayList();
        ((ArrayList) term7097).add(term7099);
        ((ArrayList) term7097).add(term7108);
        ArrayList term7119 = new ArrayList();
        ((ArrayList) term7119).add("lKrEAkypza");
        ((ArrayList) term7119).add("KtuuNAqGCQ");
        ((ArrayList) term7119).add("OGQsfjmReM");
        ((ArrayList) term7119).add("YsUtbngnRO");
        ((ArrayList) term7119).add("JisaWUxcNb");
        term6964 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term6964, term6964.getClass(), "bvId", "huVIXUWLtI");
        setIntField(term6964, term6964.getClass(), "avId", -1553893255);
        setIntField(term6964, term6964.getClass(), "videos", 1303442927);
        setIntField(term6964, term6964.getClass(), "tid", 794568325);
        setField(term6964, term6964.getClass(), "tName", "vhKzFyKPOT");
        setIntField(term6964, term6964.getClass(), "copyright", -434468428);
        setField(term6964, term6964.getClass(), "pic", "nQhIgWXdRc");
        setField(term6964, term6964.getClass(), "title", "EusenEbIoF");
        setIntField(term6964, term6964.getClass(), "pubDate", 1559605714);
        setIntField(term6964, term6964.getClass(), "ctime", 1146601902);
        setField(term6964, term6964.getClass(), "desc", "SScVQYSvWH");
        setField(term6964, term6964.getClass(), "descV2", term7031);
        setIntField(term6964, term6964.getClass(), "state", -1938881385);
        setLongField(term6964, term6964.getClass(), "duration", 4616440478358528406L);
        setField(term6964, term6964.getClass(), "creatorUid", "GGzwMoHZXC");
        setField(term6964, term6964.getClass(), "pages", term7097);
        setField(term6964, term6964.getClass(), "tagList", term7119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NxgmYPzWCI";
        callMethod(klass, "setTitle", argTypes, term6964, args);
    }

};


