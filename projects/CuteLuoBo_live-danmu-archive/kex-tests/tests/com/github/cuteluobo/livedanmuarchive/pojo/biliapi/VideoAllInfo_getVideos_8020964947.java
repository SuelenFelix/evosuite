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

public class VideoAllInfo_getVideos_8020964947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8104;

    public VideoAllInfo_getVideos_8020964947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8171 = new ArrayList();
        ((ArrayList) term8171).add("fIZsWucfXz");
        ((ArrayList) term8171).add("IApvtmfhnq");
        ((ArrayList) term8171).add("VSaNnhMpRc");
        ((ArrayList) term8171).add("QNjNTLlUaV");
        ((ArrayList) term8171).add("hIYsRyOZxk");
        ((ArrayList) term8171).add("RjNoEywJbC");
        ((ArrayList) term8171).add("RTTvrwwhou");
        Object term8275 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term8275, term8275.getClass(), "cid", 6853972830905120647L);
        setIntField(term8275, term8275.getClass(), "page", -1410220680);
        setField(term8275, term8275.getClass(), "from", "");
        setField(term8275, term8275.getClass(), "partName", "");
        setLongField(term8275, term8275.getClass(), "duration", 1442167273909860961L);
        setIntField(term8275, term8275.getClass(), "width", 389427431);
        setIntField(term8275, term8275.getClass(), "height", -1945706126);
        setBooleanField(term8275, term8275.getClass(), "rotate", true);
        Object term8284 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term8284, term8284.getClass(), "cid", 6895382576300001141L);
        setIntField(term8284, term8284.getClass(), "page", 1152356969);
        setField(term8284, term8284.getClass(), "from", "");
        setField(term8284, term8284.getClass(), "partName", "");
        setLongField(term8284, term8284.getClass(), "duration", 9062006526792682783L);
        setIntField(term8284, term8284.getClass(), "width", -1667990367);
        setIntField(term8284, term8284.getClass(), "height", -1214628358);
        setBooleanField(term8284, term8284.getClass(), "rotate", true);
        ArrayList term8273 = new ArrayList();
        ((ArrayList) term8273).add(term8275);
        ((ArrayList) term8273).add(term8284);
        ArrayList term8295 = new ArrayList();
        ((ArrayList) term8295).add("wsysQLGFnl");
        term8104 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term8104, term8104.getClass(), "bvId", "pXxkiXgQnq");
        setIntField(term8104, term8104.getClass(), "avId", 729658803);
        setIntField(term8104, term8104.getClass(), "videos", 114754804);
        setIntField(term8104, term8104.getClass(), "tid", 1687361082);
        setField(term8104, term8104.getClass(), "tName", "tKmrUDURku");
        setIntField(term8104, term8104.getClass(), "copyright", 584893196);
        setField(term8104, term8104.getClass(), "pic", "JeZbrwZmsP");
        setField(term8104, term8104.getClass(), "title", "bxyfeicqrK");
        setIntField(term8104, term8104.getClass(), "pubDate", 497269071);
        setIntField(term8104, term8104.getClass(), "ctime", -1899301124);
        setField(term8104, term8104.getClass(), "desc", "vBnWPlsZMk");
        setField(term8104, term8104.getClass(), "descV2", term8171);
        setIntField(term8104, term8104.getClass(), "state", -1882480155);
        setLongField(term8104, term8104.getClass(), "duration", -8303973304709662279L);
        setField(term8104, term8104.getClass(), "creatorUid", "lRORwXipuk");
        setField(term8104, term8104.getClass(), "pages", term8273);
        setField(term8104, term8104.getClass(), "tagList", term8295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideos", argTypes, term8104, args);
    }

};


