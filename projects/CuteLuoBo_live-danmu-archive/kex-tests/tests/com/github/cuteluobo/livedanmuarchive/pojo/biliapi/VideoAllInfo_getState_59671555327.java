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

public class VideoAllInfo_getState_59671555327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16378;

    public VideoAllInfo_getState_59671555327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16445 = new ArrayList();
        ((ArrayList) term16445).add("fFhdWuJbdC");
        ((ArrayList) term16445).add("JlgLIHPabR");
        ((ArrayList) term16445).add("LHnkeoNwHq");
        ((ArrayList) term16445).add("gVnDVbSyKa");
        ((ArrayList) term16445).add("kdCYNMSuoD");
        Object term16525 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16525, term16525.getClass(), "cid", -894705411488729365L);
        setIntField(term16525, term16525.getClass(), "page", -255317272);
        setField(term16525, term16525.getClass(), "from", "");
        setField(term16525, term16525.getClass(), "partName", "");
        setLongField(term16525, term16525.getClass(), "duration", -7514437039500876647L);
        setIntField(term16525, term16525.getClass(), "width", -706253892);
        setIntField(term16525, term16525.getClass(), "height", -1341439819);
        setBooleanField(term16525, term16525.getClass(), "rotate", true);
        Object term16534 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16534, term16534.getClass(), "cid", 204473662283899955L);
        setIntField(term16534, term16534.getClass(), "page", -728760750);
        setField(term16534, term16534.getClass(), "from", "");
        setField(term16534, term16534.getClass(), "partName", "");
        setLongField(term16534, term16534.getClass(), "duration", -4029227951294167228L);
        setIntField(term16534, term16534.getClass(), "width", -1617383807);
        setIntField(term16534, term16534.getClass(), "height", -1244386281);
        setBooleanField(term16534, term16534.getClass(), "rotate", false);
        Object term16543 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16543, term16543.getClass(), "cid", 5160033404788124731L);
        setIntField(term16543, term16543.getClass(), "page", -885788574);
        setField(term16543, term16543.getClass(), "from", "");
        setField(term16543, term16543.getClass(), "partName", "");
        setLongField(term16543, term16543.getClass(), "duration", 5071015720043054072L);
        setIntField(term16543, term16543.getClass(), "width", -865722613);
        setIntField(term16543, term16543.getClass(), "height", -1551355284);
        setBooleanField(term16543, term16543.getClass(), "rotate", false);
        ArrayList term16523 = new ArrayList();
        ((ArrayList) term16523).add(term16525);
        ((ArrayList) term16523).add(term16534);
        ((ArrayList) term16523).add(term16543);
        ArrayList term16554 = new ArrayList();
        ((ArrayList) term16554).add("JeyKRznnft");
        ((ArrayList) term16554).add("vQJUCtuYpK");
        term16378 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term16378, term16378.getClass(), "bvId", "drcmjfQUDq");
        setIntField(term16378, term16378.getClass(), "avId", 1091954101);
        setIntField(term16378, term16378.getClass(), "videos", 1895143076);
        setIntField(term16378, term16378.getClass(), "tid", 1981860404);
        setField(term16378, term16378.getClass(), "tName", "GjdWUoUSyA");
        setIntField(term16378, term16378.getClass(), "copyright", 732174235);
        setField(term16378, term16378.getClass(), "pic", "YEkxWsWaUl");
        setField(term16378, term16378.getClass(), "title", "RINhPkhhct");
        setIntField(term16378, term16378.getClass(), "pubDate", 470895808);
        setIntField(term16378, term16378.getClass(), "ctime", 1787325291);
        setField(term16378, term16378.getClass(), "desc", "vjNPcTSqmS");
        setField(term16378, term16378.getClass(), "descV2", term16445);
        setIntField(term16378, term16378.getClass(), "state", 1470349147);
        setLongField(term16378, term16378.getClass(), "duration", -823085399570394644L);
        setField(term16378, term16378.getClass(), "creatorUid", "eRYlSLwtvV");
        setField(term16378, term16378.getClass(), "pages", term16523);
        setField(term16378, term16378.getClass(), "tagList", term16554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term16378, args);
    }

};


