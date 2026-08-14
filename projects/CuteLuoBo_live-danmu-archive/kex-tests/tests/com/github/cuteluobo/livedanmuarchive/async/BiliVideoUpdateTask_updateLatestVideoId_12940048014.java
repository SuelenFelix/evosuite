package com.github.cuteluobo.livedanmuarchive.async;

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
import static com.github.cuteluobo.livedanmuarchive.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class BiliVideoUpdateTask_updateLatestVideoId_12940048014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22372;

    public BiliVideoUpdateTask_updateLatestVideoId_12940048014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22374 = new Integer(-1275173084);
        Long term22412 = new Long(7994303628307559416L);
        Long term22414 = new Long(0L);
        Long term22416 = new Long(0L);
        Integer term22418 = new Integer(0);
        Boolean term22420 = new Boolean(false);
        Boolean term22422 = new Boolean(false);
        Long term22424 = new Long(2443640364875054177L);
        Long term22426 = new Long(-1610676979013636850L);
        Long term22428 = new Long(2062173786000223358L);
        term22372 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term22373 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term22442 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term22372, term22372.getClass(), "logger", null);
        setField(term22373, term22373.getClass(), "id", term22374);
        setField(term22373, term22373.getClass(), "platform", "TKlccZUpjz");
        setField(term22373, term22373.getClass(), "videoCreatorUid", "GGzwMoHZXC");
        setField(term22373, term22373.getClass(), "videoId", "IpmgwHTgnG");
        setField(term22373, term22373.getClass(), "videoCreatedTime", term22412);
        setField(term22373, term22373.getClass(), "danmuTotalNum", term22414);
        setField(term22373, term22373.getClass(), "danmuSentNum", term22416);
        setField(term22373, term22373.getClass(), "pageSize", term22418);
        setField(term22373, term22373.getClass(), "skip", term22420);
        setField(term22373, term22373.getClass(), "taskFail", term22422);
        setField(term22373, term22373.getClass(), "createTime", term22424);
        setField(term22373, term22373.getClass(), "updateTime", term22426);
        setField(term22373, term22373.getClass(), "finishTime", term22428);
        setField(term22372, term22372.getClass(), "latest", term22373);
        setField(term22372, term22372.getClass(), "cookie", "tIpkeYIezR");
        setLongField(term22442, term22442.getClass(), "uid", 6895382576300001141L);
        setBooleanField(term22442, term22442.getClass(), "login", true);
        setIntField(term22442, term22442.getClass(), "level", 458147407);
        setField(term22442, term22442.getClass(), "nickName", "YkZtEtthvz");
        setField(term22442, term22442.getClass(), "imgKey", "dwlZSxlXOo");
        setField(term22442, term22442.getClass(), "subKey", "lKrEAkypza");
        setField(term22442, term22442.getClass(), "cookie", "KtuuNAqGCQ");
        setField(term22442, term22442.getClass(), "accessKey", "OGQsfjmReM");
        setField(term22372, term22372.getClass(), "baseUserInfo", term22442);
        setField(term22372, term22372.getClass(), "uid", "YsUtbngnRO");
        setField(term22372, term22372.getClass(), "tagMatch", "JisaWUxcNb");
        setField(term22372, term22372.getClass(), "titleMatch", "NxgmYPzWCI");
        setField(term22372, term22372.getClass(), "videoPartTimeRegular", "SqjyKmayBx");
        setField(term22372, term22372.getClass(), "videoPartTimeFormat", "XjDhvToxJy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateLatestVideoId", argTypes, term22372, args);
    }

};


