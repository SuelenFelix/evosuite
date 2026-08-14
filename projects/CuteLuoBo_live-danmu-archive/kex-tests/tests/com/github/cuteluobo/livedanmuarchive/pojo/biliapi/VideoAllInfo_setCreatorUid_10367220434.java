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

public class VideoAllInfo_setCreatorUid_10367220434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;

    public VideoAllInfo_setCreatorUid_10367220434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term697 = new ArrayList();
        ((ArrayList) term697).add("xrwlQZdwCp");
        ((ArrayList) term697).add("IDCWpPLRkE");
        ((ArrayList) term697).add("nyiiPDVjAc");
        ((ArrayList) term697).add("aKnKipADSo");
        Object term765 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term765, term765.getClass(), "cid", -2813493605142626659L);
        setIntField(term765, term765.getClass(), "page", -817164822);
        setField(term765, term765.getClass(), "from", "");
        setField(term765, term765.getClass(), "partName", "");
        setLongField(term765, term765.getClass(), "duration", -8885298608300233488L);
        setIntField(term765, term765.getClass(), "width", -1016503459);
        setIntField(term765, term765.getClass(), "height", -1968847291);
        setBooleanField(term765, term765.getClass(), "rotate", true);
        ArrayList term763 = new ArrayList();
        ((ArrayList) term763).add(term765);
        ArrayList term776 = new ArrayList();
        ((ArrayList) term776).add("hxCBltsObl");
        ((ArrayList) term776).add("BndsHwAFMv");
        ((ArrayList) term776).add("GzFkzHGYFt");
        ((ArrayList) term776).add("tShwQLRGNe");
        ((ArrayList) term776).add("LvtrsXUliU");
        ((ArrayList) term776).add("xLbjWUgOIL");
        term630 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term630, term630.getClass(), "bvId", "dWRymuLBtr");
        setIntField(term630, term630.getClass(), "avId", -1145578966);
        setIntField(term630, term630.getClass(), "videos", 679763016);
        setIntField(term630, term630.getClass(), "tid", 1962444399);
        setField(term630, term630.getClass(), "tName", "AijpHYOFuy");
        setIntField(term630, term630.getClass(), "copyright", 767834723);
        setField(term630, term630.getClass(), "pic", "SbAoxhfrkn");
        setField(term630, term630.getClass(), "title", "kuTXqwMtDB");
        setIntField(term630, term630.getClass(), "pubDate", -602026508);
        setIntField(term630, term630.getClass(), "ctime", -157887805);
        setField(term630, term630.getClass(), "desc", "Ghbwtircqb");
        setField(term630, term630.getClass(), "descV2", term697);
        setIntField(term630, term630.getClass(), "state", 1876565163);
        setLongField(term630, term630.getClass(), "duration", 6967924379644551255L);
        setField(term630, term630.getClass(), "creatorUid", "wSQxaModmm");
        setField(term630, term630.getClass(), "pages", term763);
        setField(term630, term630.getClass(), "tagList", term776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        callMethod(klass, "setCreatorUid", argTypes, term630, args);
    }

};


