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

public class VideoAllInfo_getBvId_15016032183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7069;

    public VideoAllInfo_getBvId_15016032183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7136 = new ArrayList();
        ((ArrayList) term7136).add("oKwCDqywym");
        ((ArrayList) term7136).add("zjZYTddemL");
        Object term7180 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7180, term7180.getClass(), "cid", 3077284143733577490L);
        setIntField(term7180, term7180.getClass(), "page", 1072005683);
        setField(term7180, term7180.getClass(), "from", "");
        setField(term7180, term7180.getClass(), "partName", "");
        setLongField(term7180, term7180.getClass(), "duration", 4458302820344896046L);
        setIntField(term7180, term7180.getClass(), "width", 1861318859);
        setIntField(term7180, term7180.getClass(), "height", 1474524152);
        setBooleanField(term7180, term7180.getClass(), "rotate", true);
        Object term7189 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7189, term7189.getClass(), "cid", -432424084523104253L);
        setIntField(term7189, term7189.getClass(), "page", 568954359);
        setField(term7189, term7189.getClass(), "from", "");
        setField(term7189, term7189.getClass(), "partName", "");
        setLongField(term7189, term7189.getClass(), "duration", 6150186973473930616L);
        setIntField(term7189, term7189.getClass(), "width", 53410913);
        setIntField(term7189, term7189.getClass(), "height", -375014958);
        setBooleanField(term7189, term7189.getClass(), "rotate", false);
        ArrayList term7178 = new ArrayList();
        ((ArrayList) term7178).add(term7180);
        ((ArrayList) term7178).add(term7189);
        ArrayList term7200 = new ArrayList();
        ((ArrayList) term7200).add("UkKvaeJfEC");
        term7069 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term7069, term7069.getClass(), "bvId", "boSSpezHeU");
        setIntField(term7069, term7069.getClass(), "avId", 890669485);
        setIntField(term7069, term7069.getClass(), "videos", 691577392);
        setIntField(term7069, term7069.getClass(), "tid", -893623680);
        setField(term7069, term7069.getClass(), "tName", "OUeBWNTQDh");
        setIntField(term7069, term7069.getClass(), "copyright", -1963434938);
        setField(term7069, term7069.getClass(), "pic", "gltJarNuUk");
        setField(term7069, term7069.getClass(), "title", "ZwZIDwYcSW");
        setIntField(term7069, term7069.getClass(), "pubDate", 906181092);
        setIntField(term7069, term7069.getClass(), "ctime", 1045657203);
        setField(term7069, term7069.getClass(), "desc", "sOdkipUKRu");
        setField(term7069, term7069.getClass(), "descV2", term7136);
        setIntField(term7069, term7069.getClass(), "state", 1386130016);
        setLongField(term7069, term7069.getClass(), "duration", -7001094993638840490L);
        setField(term7069, term7069.getClass(), "creatorUid", "QtrylgCLiF");
        setField(term7069, term7069.getClass(), "pages", term7178);
        setField(term7069, term7069.getClass(), "tagList", term7200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBvId", argTypes, term7069, args);
    }

};


