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

public class BiliVideoUpdateTask_matchAndSave_3499475057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1289;

    public BiliVideoUpdateTask_matchAndSave_3499475057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1291 = new Integer(391863371);
        Long term1329 = new Long(-4325723315152823407L);
        Long term1331 = new Long(0L);
        Long term1333 = new Long(0L);
        Integer term1335 = new Integer(0);
        Boolean term1337 = new Boolean(false);
        Boolean term1339 = new Boolean(false);
        Long term1341 = new Long(2535595959091595249L);
        Long term1343 = new Long(-5476826692763582090L);
        Long term1345 = new Long(-872011222785455006L);
        term1289 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term1290 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term1359 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term1289, term1289.getClass(), "logger", null);
        setField(term1290, term1290.getClass(), "id", term1291);
        setField(term1290, term1290.getClass(), "platform", "YRHGsAkhxb");
        setField(term1290, term1290.getClass(), "videoCreatorUid", "ffYhPOzlUs");
        setField(term1290, term1290.getClass(), "videoId", "MLqYREekMl");
        setField(term1290, term1290.getClass(), "videoCreatedTime", term1329);
        setField(term1290, term1290.getClass(), "danmuTotalNum", term1331);
        setField(term1290, term1290.getClass(), "danmuSentNum", term1333);
        setField(term1290, term1290.getClass(), "pageSize", term1335);
        setField(term1290, term1290.getClass(), "skip", term1337);
        setField(term1290, term1290.getClass(), "taskFail", term1339);
        setField(term1290, term1290.getClass(), "createTime", term1341);
        setField(term1290, term1290.getClass(), "updateTime", term1343);
        setField(term1290, term1290.getClass(), "finishTime", term1345);
        setField(term1289, term1289.getClass(), "latest", term1290);
        setField(term1289, term1289.getClass(), "cookie", "ytSBIKXogI");
        setLongField(term1359, term1359.getClass(), "uid", -8400487765614892086L);
        setBooleanField(term1359, term1359.getClass(), "login", false);
        setIntField(term1359, term1359.getClass(), "level", 391863371);
        setField(term1359, term1359.getClass(), "nickName", "nHXjMycHlU");
        setField(term1359, term1359.getClass(), "imgKey", "ieCtQFdkii");
        setField(term1359, term1359.getClass(), "subKey", "dEnhdmILtU");
        setField(term1359, term1359.getClass(), "cookie", "hoicvmsovO");
        setField(term1359, term1359.getClass(), "accessKey", "eqJfYWRaEL");
        setField(term1289, term1289.getClass(), "baseUserInfo", term1359);
        setField(term1289, term1289.getClass(), "uid", "fhkbdRViHi");
        setField(term1289, term1289.getClass(), "tagMatch", "uWHnvSvaPl");
        setField(term1289, term1289.getClass(), "titleMatch", "kBdSllIBVz");
        setField(term1289, term1289.getClass(), "videoPartTimeRegular", "TJmVBGfTML");
        setField(term1289, term1289.getClass(), "videoPartTimeFormat", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matchAndSave", argTypes, term1289, args);
    }

};


