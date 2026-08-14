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

public class VideoAllInfo_setTitle_178135348318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12437;

    public VideoAllInfo_setTitle_178135348318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12504 = new ArrayList();
        ((ArrayList) term12504).add("PTEndmPMzk");
        ((ArrayList) term12504).add("aJQuCOCvZs");
        ((ArrayList) term12504).add("lHYNCJRiOv");
        ((ArrayList) term12504).add("QVLresHoaP");
        ((ArrayList) term12504).add("IbxeAMwLVt");
        ((ArrayList) term12504).add("bShlAqoTmZ");
        ((ArrayList) term12504).add("nOKlKlNhtU");
        ((ArrayList) term12504).add("gXFNBHJSey");
        Object term12620 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term12620, term12620.getClass(), "cid", -2286229228641472715L);
        setIntField(term12620, term12620.getClass(), "page", -1830198043);
        setField(term12620, term12620.getClass(), "from", "");
        setField(term12620, term12620.getClass(), "partName", "");
        setLongField(term12620, term12620.getClass(), "duration", 7464122056779140588L);
        setIntField(term12620, term12620.getClass(), "width", -439048495);
        setIntField(term12620, term12620.getClass(), "height", -1849105286);
        setBooleanField(term12620, term12620.getClass(), "rotate", false);
        ArrayList term12618 = new ArrayList();
        ((ArrayList) term12618).add(term12620);
        ArrayList term12631 = new ArrayList();
        ((ArrayList) term12631).add("AdYzLPMcwe");
        ((ArrayList) term12631).add("FrTZLybkKk");
        term12437 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term12437, term12437.getClass(), "bvId", "HvxahUfZcJ");
        setIntField(term12437, term12437.getClass(), "avId", 2143282300);
        setIntField(term12437, term12437.getClass(), "videos", 1137624258);
        setIntField(term12437, term12437.getClass(), "tid", 977862393);
        setField(term12437, term12437.getClass(), "tName", "WkLpmqoQxy");
        setIntField(term12437, term12437.getClass(), "copyright", 301401782);
        setField(term12437, term12437.getClass(), "pic", "XiNoscmYhd");
        setField(term12437, term12437.getClass(), "title", "asMqnMNrZp");
        setIntField(term12437, term12437.getClass(), "pubDate", 1988605357);
        setIntField(term12437, term12437.getClass(), "ctime", 808203320);
        setField(term12437, term12437.getClass(), "desc", "pqFUMTCKJd");
        setField(term12437, term12437.getClass(), "descV2", term12504);
        setIntField(term12437, term12437.getClass(), "state", -544382127);
        setLongField(term12437, term12437.getClass(), "duration", -6237686742902369498L);
        setField(term12437, term12437.getClass(), "creatorUid", "wUcSfItZgv");
        setField(term12437, term12437.getClass(), "pages", term12618);
        setField(term12437, term12437.getClass(), "tagList", term12631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FlxVmiMYKP";
        callMethod(klass, "setTitle", argTypes, term12437, args);
    }

};


