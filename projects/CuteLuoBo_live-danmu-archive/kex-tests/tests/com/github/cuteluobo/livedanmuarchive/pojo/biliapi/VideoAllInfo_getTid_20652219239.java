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

public class VideoAllInfo_getTid_20652219239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8901;

    public VideoAllInfo_getTid_20652219239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8968 = new ArrayList();
        ((ArrayList) term8968).add("GLbyDfbNZI");
        ((ArrayList) term8968).add("oNLcCYDAsO");
        ((ArrayList) term8968).add("CNqMxLvtcJ");
        ((ArrayList) term8968).add("ktbqerIaKW");
        ((ArrayList) term8968).add("VoghngXfsK");
        ((ArrayList) term8968).add("GbahCBMvct");
        ((ArrayList) term8968).add("iiHBhsNFgk");
        Object term9072 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term9072, term9072.getClass(), "cid", 6351887424140565471L);
        setIntField(term9072, term9072.getClass(), "page", 880977281);
        setField(term9072, term9072.getClass(), "from", "");
        setField(term9072, term9072.getClass(), "partName", "");
        setLongField(term9072, term9072.getClass(), "duration", 6273670659288205855L);
        setIntField(term9072, term9072.getClass(), "width", 371943306);
        setIntField(term9072, term9072.getClass(), "height", 982388293);
        setBooleanField(term9072, term9072.getClass(), "rotate", true);
        ArrayList term9070 = new ArrayList();
        ((ArrayList) term9070).add(term9072);
        ArrayList term9083 = new ArrayList();
        ((ArrayList) term9083).add("ceCWHUTQUM");
        ((ArrayList) term9083).add("LrqwfrKKtS");
        ((ArrayList) term9083).add("ZUdnQXfzCI");
        ((ArrayList) term9083).add("EULDrUNQvw");
        ((ArrayList) term9083).add("BtvAvsJSei");
        term8901 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term8901, term8901.getClass(), "bvId", "mNHyqmOAFy");
        setIntField(term8901, term8901.getClass(), "avId", 548228925);
        setIntField(term8901, term8901.getClass(), "videos", -749861210);
        setIntField(term8901, term8901.getClass(), "tid", 1694224101);
        setField(term8901, term8901.getClass(), "tName", "UxgSdhxPCH");
        setIntField(term8901, term8901.getClass(), "copyright", 937859191);
        setField(term8901, term8901.getClass(), "pic", "DAujxZPHJC");
        setField(term8901, term8901.getClass(), "title", "IlBhdrCvHq");
        setIntField(term8901, term8901.getClass(), "pubDate", -916584829);
        setIntField(term8901, term8901.getClass(), "ctime", -2131181468);
        setField(term8901, term8901.getClass(), "desc", "OirVUQhauU");
        setField(term8901, term8901.getClass(), "descV2", term8968);
        setIntField(term8901, term8901.getClass(), "state", 282916351);
        setLongField(term8901, term8901.getClass(), "duration", -7283193381993602128L);
        setField(term8901, term8901.getClass(), "creatorUid", "HknsTajwxJ");
        setField(term8901, term8901.getClass(), "pages", term9070);
        setField(term8901, term8901.getClass(), "tagList", term9083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTid", argTypes, term8901, args);
    }

};


