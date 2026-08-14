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

public class BiliVideoUpdateTask_switchCookie_518276465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22706;

    public BiliVideoUpdateTask_switchCookie_518276465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22708 = new Integer(-244121226);
        Long term22746 = new Long(-8658027316505137504L);
        Long term22748 = new Long(0L);
        Long term22750 = new Long(0L);
        Integer term22752 = new Integer(0);
        Boolean term22754 = new Boolean(false);
        Boolean term22756 = new Boolean(false);
        Long term22758 = new Long(414749984815662075L);
        Long term22760 = new Long(463622836963501975L);
        Long term22762 = new Long(305759998609888272L);
        term22706 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term22707 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term22776 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term22706, term22706.getClass(), "logger", null);
        setField(term22707, term22707.getClass(), "id", term22708);
        setField(term22707, term22707.getClass(), "platform", "nxSTJflLQy");
        setField(term22707, term22707.getClass(), "videoCreatorUid", "FlHzxEfFzI");
        setField(term22707, term22707.getClass(), "videoId", "aSATgQUpoe");
        setField(term22707, term22707.getClass(), "videoCreatedTime", term22746);
        setField(term22707, term22707.getClass(), "danmuTotalNum", term22748);
        setField(term22707, term22707.getClass(), "danmuSentNum", term22750);
        setField(term22707, term22707.getClass(), "pageSize", term22752);
        setField(term22707, term22707.getClass(), "skip", term22754);
        setField(term22707, term22707.getClass(), "taskFail", term22756);
        setField(term22707, term22707.getClass(), "createTime", term22758);
        setField(term22707, term22707.getClass(), "updateTime", term22760);
        setField(term22707, term22707.getClass(), "finishTime", term22762);
        setField(term22706, term22706.getClass(), "latest", term22707);
        setField(term22706, term22706.getClass(), "cookie", "VkPSXewZfB");
        setLongField(term22776, term22776.getClass(), "uid", 9062006526792682783L);
        setBooleanField(term22776, term22776.getClass(), "login", false);
        setIntField(term22776, term22776.getClass(), "level", -184153539);
        setField(term22776, term22776.getClass(), "nickName", "ubodzJoMGW");
        setField(term22776, term22776.getClass(), "imgKey", "weddIktxOA");
        setField(term22776, term22776.getClass(), "subKey", "uSlMeISsDD");
        setField(term22776, term22776.getClass(), "cookie", "WdCiTDUKqn");
        setField(term22776, term22776.getClass(), "accessKey", "PSizQDoxxe");
        setField(term22706, term22706.getClass(), "baseUserInfo", term22776);
        setField(term22706, term22706.getClass(), "uid", "mKaHyMybrK");
        setField(term22706, term22706.getClass(), "tagMatch", "AyrEXuGrEj");
        setField(term22706, term22706.getClass(), "titleMatch", "yevIIoVYHq");
        setField(term22706, term22706.getClass(), "videoPartTimeRegular", "UuYWMTqWTV");
        setField(term22706, term22706.getClass(), "videoPartTimeFormat", "DSFGlcaXUb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "switchCookie", argTypes, term22706, args);
    }

};


