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

public class BiliVideoUpdateTask_loginCk_177427964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;

    public BiliVideoUpdateTask_loginCk_177427964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term267 = new Integer(568599855);
        Long term305 = new Long(2442117782898005296L);
        Long term307 = new Long(0L);
        Long term309 = new Long(0L);
        Integer term311 = new Integer(0);
        Boolean term313 = new Boolean(false);
        Boolean term315 = new Boolean(false);
        Long term317 = new Long(6375119433582206027L);
        Long term319 = new Long(-8257434502486459194L);
        Long term321 = new Long(-8400487765614892086L);
        term265 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term266 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term335 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term265, term265.getClass(), "logger", null);
        setField(term266, term266.getClass(), "id", term267);
        setField(term266, term266.getClass(), "platform", "MxlszYVzRf");
        setField(term266, term266.getClass(), "videoCreatorUid", "LQFpaHEwXR");
        setField(term266, term266.getClass(), "videoId", "oVcInYnLWB");
        setField(term266, term266.getClass(), "videoCreatedTime", term305);
        setField(term266, term266.getClass(), "danmuTotalNum", term307);
        setField(term266, term266.getClass(), "danmuSentNum", term309);
        setField(term266, term266.getClass(), "pageSize", term311);
        setField(term266, term266.getClass(), "skip", term313);
        setField(term266, term266.getClass(), "taskFail", term315);
        setField(term266, term266.getClass(), "createTime", term317);
        setField(term266, term266.getClass(), "updateTime", term319);
        setField(term266, term266.getClass(), "finishTime", term321);
        setField(term265, term265.getClass(), "latest", term266);
        setField(term265, term265.getClass(), "cookie", "aJlieCFVtF");
        setLongField(term335, term335.getClass(), "uid", 2442117782898005296L);
        setBooleanField(term335, term335.getClass(), "login", false);
        setIntField(term335, term335.getClass(), "level", 568599855);
        setField(term335, term335.getClass(), "nickName", "ZiaGIbnzTs");
        setField(term335, term335.getClass(), "imgKey", "tbcdzjIfER");
        setField(term335, term335.getClass(), "subKey", "HyxfbSQYBe");
        setField(term335, term335.getClass(), "cookie", "pCTimMblYc");
        setField(term335, term335.getClass(), "accessKey", "hNxWaHcfhY");
        setField(term265, term265.getClass(), "baseUserInfo", term335);
        setField(term265, term265.getClass(), "uid", "RkybSrpybU");
        setField(term265, term265.getClass(), "tagMatch", "xOEqzGAmDU");
        setField(term265, term265.getClass(), "titleMatch", "eZFUvlxvGV");
        setField(term265, term265.getClass(), "videoPartTimeRegular", "BYqFIqCKAV");
        setField(term265, term265.getClass(), "videoPartTimeFormat", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "loginCk", argTypes, term265, args);
    }

};


