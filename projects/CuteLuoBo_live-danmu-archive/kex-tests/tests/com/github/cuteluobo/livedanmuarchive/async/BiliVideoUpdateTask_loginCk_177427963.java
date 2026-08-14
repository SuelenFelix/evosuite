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

public class BiliVideoUpdateTask_loginCk_177427963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22016;

    public BiliVideoUpdateTask_loginCk_177427963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22018 = new Integer(865208305);
        Long term22056 = new Long(3825396310311739952L);
        Long term22058 = new Long(0L);
        Long term22060 = new Long(0L);
        Integer term22062 = new Integer(0);
        Boolean term22064 = new Boolean(false);
        Boolean term22066 = new Boolean(false);
        Long term22068 = new Long(-3838084482494604218L);
        Long term22070 = new Long(3892018155439224435L);
        Long term22072 = new Long(5953383087795962419L);
        term22016 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term22017 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term22086 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term22016, term22016.getClass(), "logger", null);
        setField(term22017, term22017.getClass(), "id", term22018);
        setField(term22017, term22017.getClass(), "platform", "bKBSncrMEZ");
        setField(term22017, term22017.getClass(), "videoCreatorUid", "yeSXGqQExb");
        setField(term22017, term22017.getClass(), "videoId", "uXYcXVYJZM");
        setField(term22017, term22017.getClass(), "videoCreatedTime", term22056);
        setField(term22017, term22017.getClass(), "danmuTotalNum", term22058);
        setField(term22017, term22017.getClass(), "danmuSentNum", term22060);
        setField(term22017, term22017.getClass(), "pageSize", term22062);
        setField(term22017, term22017.getClass(), "skip", term22064);
        setField(term22017, term22017.getClass(), "taskFail", term22066);
        setField(term22017, term22017.getClass(), "createTime", term22068);
        setField(term22017, term22017.getClass(), "updateTime", term22070);
        setField(term22017, term22017.getClass(), "finishTime", term22072);
        setField(term22016, term22016.getClass(), "latest", term22017);
        setField(term22016, term22016.getClass(), "cookie", "BJhjdJUhkz");
        setLongField(term22086, term22086.getClass(), "uid", 1442167273909860961L);
        setBooleanField(term22086, term22086.getClass(), "login", true);
        setIntField(term22086, term22086.getClass(), "level", 292681826);
        setField(term22086, term22086.getClass(), "nickName", "cdHYQDgUZR");
        setField(term22086, term22086.getClass(), "imgKey", "KAORSSPSeV");
        setField(term22086, term22086.getClass(), "subKey", "UimMMORkzd");
        setField(term22086, term22086.getClass(), "cookie", "huVIXUWLtI");
        setField(term22086, term22086.getClass(), "accessKey", "vhKzFyKPOT");
        setField(term22016, term22016.getClass(), "baseUserInfo", term22086);
        setField(term22016, term22016.getClass(), "uid", "nQhIgWXdRc");
        setField(term22016, term22016.getClass(), "tagMatch", "EusenEbIoF");
        setField(term22016, term22016.getClass(), "titleMatch", "SScVQYSvWH");
        setField(term22016, term22016.getClass(), "videoPartTimeRegular", "MnovcqFhCl");
        setField(term22016, term22016.getClass(), "videoPartTimeFormat", "qYtAeLzOhW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tJzmOfcUnY";
        callMethod(klass, "loginCk", argTypes, term22016, args);
    }

};


