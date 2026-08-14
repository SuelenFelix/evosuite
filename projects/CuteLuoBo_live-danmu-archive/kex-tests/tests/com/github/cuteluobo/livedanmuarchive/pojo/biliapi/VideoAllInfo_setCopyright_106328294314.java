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

public class VideoAllInfo_setCopyright_106328294314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10878;
     Object term11013;

    public VideoAllInfo_setCopyright_106328294314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10945 = new ArrayList();
        Object term10965 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term10965, term10965.getClass(), "cid", -1084263688306617320L);
        setIntField(term10965, term10965.getClass(), "page", -310648604);
        setField(term10965, term10965.getClass(), "from", "");
        setField(term10965, term10965.getClass(), "partName", "");
        setLongField(term10965, term10965.getClass(), "duration", 1193381106528373019L);
        setIntField(term10965, term10965.getClass(), "width", -648200466);
        setIntField(term10965, term10965.getClass(), "height", 2007134147);
        setBooleanField(term10965, term10965.getClass(), "rotate", false);
        Object term10974 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term10974, term10974.getClass(), "cid", -1365372122034008688L);
        setIntField(term10974, term10974.getClass(), "page", 993388358);
        setField(term10974, term10974.getClass(), "from", "");
        setField(term10974, term10974.getClass(), "partName", "");
        setLongField(term10974, term10974.getClass(), "duration", -6108006981756732593L);
        setIntField(term10974, term10974.getClass(), "width", -765191335);
        setIntField(term10974, term10974.getClass(), "height", -1697741155);
        setBooleanField(term10974, term10974.getClass(), "rotate", true);
        ArrayList term10963 = new ArrayList();
        ((ArrayList) term10963).add(term10965);
        ((ArrayList) term10963).add(term10974);
        ArrayList term10985 = new ArrayList();
        ((ArrayList) term10985).add("mNgDshwZNc");
        ((ArrayList) term10985).add("pDqgDbJoFw");
        term10878 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term10878, term10878.getClass(), "bvId", "JmnWRJUxGr");
        setIntField(term10878, term10878.getClass(), "avId", -1694747156);
        setIntField(term10878, term10878.getClass(), "videos", 1466373988);
        setIntField(term10878, term10878.getClass(), "tid", -358526505);
        setField(term10878, term10878.getClass(), "tName", "wgRGBNrTGP");
        setIntField(term10878, term10878.getClass(), "copyright", 1843268026);
        setField(term10878, term10878.getClass(), "pic", "FIdNVptZpW");
        setField(term10878, term10878.getClass(), "title", "rQjxAhisjm");
        setIntField(term10878, term10878.getClass(), "pubDate", 954660603);
        setIntField(term10878, term10878.getClass(), "ctime", -1351605385);
        setField(term10878, term10878.getClass(), "desc", "ZDhASPHjDG");
        setField(term10878, term10878.getClass(), "descV2", term10945);
        setIntField(term10878, term10878.getClass(), "state", 278355793);
        setLongField(term10878, term10878.getClass(), "duration", -7370364068296402536L);
        setField(term10878, term10878.getClass(), "creatorUid", "HNVOAXYNEZ");
        setField(term10878, term10878.getClass(), "pages", term10963);
        setField(term10878, term10878.getClass(), "tagList", term10985);
        term11013 = new Integer(1295839803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11013;
        callMethod(klass, "setCopyright", argTypes, term10878, args);
    }

};


