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

public class VideoAllInfo_getCreatorUid_18085241252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;

    public VideoAllInfo_getCreatorUid_18085241252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term323 = new ArrayList();
        ((ArrayList) term323).add("oVcInYnLWB");
        ((ArrayList) term323).add("aJlieCFVtF");
        ((ArrayList) term323).add("ZiaGIbnzTs");
        ((ArrayList) term323).add("tbcdzjIfER");
        ((ArrayList) term323).add("HyxfbSQYBe");
        Object term403 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term403, term403.getClass(), "cid", 6375119433582206027L);
        setIntField(term403, term403.getClass(), "page", 590364439);
        setField(term403, term403.getClass(), "from", "");
        setField(term403, term403.getClass(), "partName", "");
        setLongField(term403, term403.getClass(), "duration", -8257434502486459194L);
        setIntField(term403, term403.getClass(), "width", 865208305);
        setIntField(term403, term403.getClass(), "height", -1275173084);
        setBooleanField(term403, term403.getClass(), "rotate", false);
        Object term412 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term412, term412.getClass(), "cid", -8400487765614892086L);
        setIntField(term412, term412.getClass(), "page", -244121226);
        setField(term412, term412.getClass(), "from", "");
        setField(term412, term412.getClass(), "partName", "");
        setLongField(term412, term412.getClass(), "duration", 5270370404989704783L);
        setIntField(term412, term412.getClass(), "width", -203030934);
        setIntField(term412, term412.getClass(), "height", -1179120542);
        setBooleanField(term412, term412.getClass(), "rotate", false);
        Object term421 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term421, term421.getClass(), "cid", 7411271909051562686L);
        setIntField(term421, term421.getClass(), "page", -73683645);
        setField(term421, term421.getClass(), "from", "");
        setField(term421, term421.getClass(), "partName", "");
        setLongField(term421, term421.getClass(), "duration", 4872422362414183754L);
        setIntField(term421, term421.getClass(), "width", -226514366);
        setIntField(term421, term421.getClass(), "height", 1193880199);
        setBooleanField(term421, term421.getClass(), "rotate", false);
        Object term430 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term430, term430.getClass(), "cid", 6811161968424632369L);
        setIntField(term430, term430.getClass(), "page", -1087774327);
        setField(term430, term430.getClass(), "from", "");
        setField(term430, term430.getClass(), "partName", "");
        setLongField(term430, term430.getClass(), "duration", -7237588299778557629L);
        setIntField(term430, term430.getClass(), "width", -1530420153);
        setIntField(term430, term430.getClass(), "height", -469968304);
        setBooleanField(term430, term430.getClass(), "rotate", false);
        ArrayList term401 = new ArrayList();
        ((ArrayList) term401).add(term403);
        ((ArrayList) term401).add(term412);
        ((ArrayList) term401).add(term421);
        ((ArrayList) term401).add(term430);
        ArrayList term441 = new ArrayList();
        ((ArrayList) term441).add("IoAlmYsBwc");
        ((ArrayList) term441).add("TEParAifyi");
        ((ArrayList) term441).add("OWDIEULEFu");
        term256 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term256, term256.getClass(), "bvId", "RMFIsYGgne");
        setIntField(term256, term256.getClass(), "avId", 1048535127);
        setIntField(term256, term256.getClass(), "videos", -655067527);
        setIntField(term256, term256.getClass(), "tid", -6029667);
        setField(term256, term256.getClass(), "tName", "NRdvgJlhkX");
        setIntField(term256, term256.getClass(), "copyright", -2068769794);
        setField(term256, term256.getClass(), "pic", "uuaPigETmJ");
        setField(term256, term256.getClass(), "title", "MxlszYVzRf");
        setIntField(term256, term256.getClass(), "pubDate", -117576464);
        setIntField(term256, term256.getClass(), "ctime", -1007160944);
        setField(term256, term256.getClass(), "desc", "LQFpaHEwXR");
        setField(term256, term256.getClass(), "descV2", term323);
        setIntField(term256, term256.getClass(), "state", 1135664017);
        setLongField(term256, term256.getClass(), "duration", 2442117782898005296L);
        setField(term256, term256.getClass(), "creatorUid", "pCTimMblYc");
        setField(term256, term256.getClass(), "pages", term401);
        setField(term256, term256.getClass(), "tagList", term441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatorUid", argTypes, term256, args);
    }

};


