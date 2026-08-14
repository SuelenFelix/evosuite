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

public class BiliVideoUpdateTask_switchCookie_518276466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955;

    public BiliVideoUpdateTask_switchCookie_518276466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term957 = new Integer(1484323161);
        Long term995 = new Long(-7237588299778557629L);
        Long term997 = new Long(0L);
        Long term999 = new Long(0L);
        Integer term1001 = new Integer(0);
        Boolean term1003 = new Boolean(false);
        Boolean term1005 = new Boolean(false);
        Long term1007 = new Long(6967924379644551255L);
        Long term1009 = new Long(-2813493605142626659L);
        Long term1011 = new Long(-8885298608300233488L);
        term955 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term956 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term1025 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term955, term955.getClass(), "logger", null);
        setField(term956, term956.getClass(), "id", term957);
        setField(term956, term956.getClass(), "platform", "UlajhuVLaP");
        setField(term956, term956.getClass(), "videoCreatorUid", "gGSMzuGICf");
        setField(term956, term956.getClass(), "videoId", "hxCBltsObl");
        setField(term956, term956.getClass(), "videoCreatedTime", term995);
        setField(term956, term956.getClass(), "danmuTotalNum", term997);
        setField(term956, term956.getClass(), "danmuSentNum", term999);
        setField(term956, term956.getClass(), "pageSize", term1001);
        setField(term956, term956.getClass(), "skip", term1003);
        setField(term956, term956.getClass(), "taskFail", term1005);
        setField(term956, term956.getClass(), "createTime", term1007);
        setField(term956, term956.getClass(), "updateTime", term1009);
        setField(term956, term956.getClass(), "finishTime", term1011);
        setField(term955, term955.getClass(), "latest", term956);
        setField(term955, term955.getClass(), "cookie", "BndsHwAFMv");
        setLongField(term1025, term1025.getClass(), "uid", -8257434502486459194L);
        setBooleanField(term1025, term1025.getClass(), "login", false);
        setIntField(term1025, term1025.getClass(), "level", 1484323161);
        setField(term1025, term1025.getClass(), "nickName", "GzFkzHGYFt");
        setField(term1025, term1025.getClass(), "imgKey", "tShwQLRGNe");
        setField(term1025, term1025.getClass(), "subKey", "LvtrsXUliU");
        setField(term1025, term1025.getClass(), "cookie", "xLbjWUgOIL");
        setField(term1025, term1025.getClass(), "accessKey", "jDtqGUpnZN");
        setField(term955, term955.getClass(), "baseUserInfo", term1025);
        setField(term955, term955.getClass(), "uid", "nGKItKLYNC");
        setField(term955, term955.getClass(), "tagMatch", "UiUYnPrcCi");
        setField(term955, term955.getClass(), "titleMatch", "UoYtihxVaS");
        setField(term955, term955.getClass(), "videoPartTimeRegular", "JDswTTCZHV");
        setField(term955, term955.getClass(), "videoPartTimeFormat", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "switchCookie", argTypes, term955, args);
    }

};


