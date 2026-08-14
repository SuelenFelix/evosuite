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

public class VideoAllInfo_getDuration_119732030229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17044;

    public VideoAllInfo_getDuration_119732030229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17111 = new ArrayList();
        ((ArrayList) term17111).add("lMUBBGRjfY");
        ((ArrayList) term17111).add("olYpqbolWL");
        ((ArrayList) term17111).add("MCMCjxXzjw");
        ((ArrayList) term17111).add("pZbbwCURge");
        ((ArrayList) term17111).add("RsOfgdMCMv");
        ((ArrayList) term17111).add("nsofCJqJOR");
        ((ArrayList) term17111).add("CitJiZwsjF");
        ((ArrayList) term17111).add("ZiyMvLArWJ");
        ArrayList term17225 = new ArrayList();
        ArrayList term17229 = new ArrayList();
        ((ArrayList) term17229).add("ocZcumnXEz");
        ((ArrayList) term17229).add("rNNwyactDR");
        ((ArrayList) term17229).add("QJrTMTdxyh");
        ((ArrayList) term17229).add("rgZSPplPSs");
        ((ArrayList) term17229).add("NPUSTXlEKx");
        term17044 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term17044, term17044.getClass(), "bvId", "MrUPJzBTEn");
        setIntField(term17044, term17044.getClass(), "avId", 255145822);
        setIntField(term17044, term17044.getClass(), "videos", -573608449);
        setIntField(term17044, term17044.getClass(), "tid", -1660057757);
        setField(term17044, term17044.getClass(), "tName", "IaSymdfFGa");
        setIntField(term17044, term17044.getClass(), "copyright", 1816273440);
        setField(term17044, term17044.getClass(), "pic", "FxSvJCIpul");
        setField(term17044, term17044.getClass(), "title", "HCjKwpexJj");
        setIntField(term17044, term17044.getClass(), "pubDate", -96541009);
        setIntField(term17044, term17044.getClass(), "ctime", -43719302);
        setField(term17044, term17044.getClass(), "desc", "sCpIHVPdfl");
        setField(term17044, term17044.getClass(), "descV2", term17111);
        setIntField(term17044, term17044.getClass(), "state", 1024134939);
        setLongField(term17044, term17044.getClass(), "duration", -6838909359433858599L);
        setField(term17044, term17044.getClass(), "creatorUid", "MaeokjEfWD");
        setField(term17044, term17044.getClass(), "pages", term17225);
        setField(term17044, term17044.getClass(), "tagList", term17229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term17044, args);
    }

};


