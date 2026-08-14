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

public class BiliVideoUpdateTask_matchAndSave_3499475056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23040;

    public BiliVideoUpdateTask_matchAndSave_3499475056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23042 = new Integer(-203030934);
        Long term23080 = new Long(-8654565919063661957L);
        Long term23082 = new Long(0L);
        Long term23084 = new Long(0L);
        Integer term23086 = new Integer(0);
        Boolean term23088 = new Boolean(false);
        Boolean term23090 = new Boolean(false);
        Long term23092 = new Long(-5248475803419977214L);
        Long term23094 = new Long(-6723783499250797216L);
        Long term23096 = new Long(41775768178052008L);
        term23040 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term23041 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term23110 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term23040, term23040.getClass(), "logger", null);
        setField(term23041, term23041.getClass(), "id", term23042);
        setField(term23041, term23041.getClass(), "platform", "sHMXNUzNeM");
        setField(term23041, term23041.getClass(), "videoCreatorUid", "gPzGDOEPPw");
        setField(term23041, term23041.getClass(), "videoId", "rwKoAngzCu");
        setField(term23041, term23041.getClass(), "videoCreatedTime", term23080);
        setField(term23041, term23041.getClass(), "danmuTotalNum", term23082);
        setField(term23041, term23041.getClass(), "danmuSentNum", term23084);
        setField(term23041, term23041.getClass(), "pageSize", term23086);
        setField(term23041, term23041.getClass(), "skip", term23088);
        setField(term23041, term23041.getClass(), "taskFail", term23090);
        setField(term23041, term23041.getClass(), "createTime", term23092);
        setField(term23041, term23041.getClass(), "updateTime", term23094);
        setField(term23041, term23041.getClass(), "finishTime", term23096);
        setField(term23040, term23040.getClass(), "latest", term23041);
        setField(term23040, term23040.getClass(), "cookie", "VUkRVwROTl");
        setLongField(term23110, term23110.getClass(), "uid", -7400951017937830861L);
        setBooleanField(term23110, term23110.getClass(), "login", true);
        setIntField(term23110, term23110.getClass(), "level", 493620644);
        setField(term23110, term23110.getClass(), "nickName", "UDlkdccCRn");
        setField(term23110, term23110.getClass(), "imgKey", "McpzErOcYb");
        setField(term23110, term23110.getClass(), "subKey", "jqrVEUvYEz");
        setField(term23110, term23110.getClass(), "cookie", "QITgiBrmfj");
        setField(term23110, term23110.getClass(), "accessKey", "pXxkiXgQnq");
        setField(term23040, term23040.getClass(), "baseUserInfo", term23110);
        setField(term23040, term23040.getClass(), "uid", "tKmrUDURku");
        setField(term23040, term23040.getClass(), "tagMatch", "JeZbrwZmsP");
        setField(term23040, term23040.getClass(), "titleMatch", "bxyfeicqrK");
        setField(term23040, term23040.getClass(), "videoPartTimeRegular", "vBnWPlsZMk");
        setField(term23040, term23040.getClass(), "videoPartTimeFormat", "fIZsWucfXz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matchAndSave", argTypes, term23040, args);
    }

};


