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
import java.lang.Long;

public class VideoAllInfo_setDuration_197507972830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17483;
     Object term17633;

    public VideoAllInfo_setDuration_197507972830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17550 = new ArrayList();
        ((ArrayList) term17550).add("wkqPmmFDAa");
        ((ArrayList) term17550).add("rLTDtNqLyW");
        ((ArrayList) term17550).add("CLsbWobdgS");
        ((ArrayList) term17550).add("TbYrjEyFPc");
        Object term17618 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17618, term17618.getClass(), "cid", 4548576710115075073L);
        setIntField(term17618, term17618.getClass(), "page", -558146961);
        setField(term17618, term17618.getClass(), "from", "");
        setField(term17618, term17618.getClass(), "partName", "");
        setLongField(term17618, term17618.getClass(), "duration", -1486519351300660432L);
        setIntField(term17618, term17618.getClass(), "width", 1505480070);
        setIntField(term17618, term17618.getClass(), "height", -829088844);
        setBooleanField(term17618, term17618.getClass(), "rotate", false);
        ArrayList term17616 = new ArrayList();
        ((ArrayList) term17616).add(term17618);
        ArrayList term17629 = new ArrayList();
        term17483 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term17483, term17483.getClass(), "bvId", "KKFprGoNpl");
        setIntField(term17483, term17483.getClass(), "avId", 109078154);
        setIntField(term17483, term17483.getClass(), "videos", -314165467);
        setIntField(term17483, term17483.getClass(), "tid", 963694071);
        setField(term17483, term17483.getClass(), "tName", "tWVISJlxKZ");
        setIntField(term17483, term17483.getClass(), "copyright", -995785731);
        setField(term17483, term17483.getClass(), "pic", "rOZkUKEoaf");
        setField(term17483, term17483.getClass(), "title", "yLnzGqyHGL");
        setIntField(term17483, term17483.getClass(), "pubDate", 1349815364);
        setIntField(term17483, term17483.getClass(), "ctime", 2128383340);
        setField(term17483, term17483.getClass(), "desc", "IjprPXBDuY");
        setField(term17483, term17483.getClass(), "descV2", term17550);
        setIntField(term17483, term17483.getClass(), "state", 1238598518);
        setLongField(term17483, term17483.getClass(), "duration", 4947643967691976731L);
        setField(term17483, term17483.getClass(), "creatorUid", "muefchpJiZ");
        setField(term17483, term17483.getClass(), "pages", term17616);
        setField(term17483, term17483.getClass(), "tagList", term17629);
        term17633 = new Long(4777103307547199454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17633;
        callMethod(klass, "setDuration", argTypes, term17483, args);
    }

};


