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

public class BiliVideoUpdateTask_updateLatestVideoId_12940048015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public BiliVideoUpdateTask_updateLatestVideoId_12940048015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term623 = new Integer(1162663216);
        Long term661 = new Long(5270370404989704783L);
        Long term663 = new Long(0L);
        Long term665 = new Long(0L);
        Integer term667 = new Integer(0);
        Boolean term669 = new Boolean(false);
        Boolean term671 = new Boolean(false);
        Long term673 = new Long(7411271909051562686L);
        Long term675 = new Long(4872422362414183754L);
        Long term677 = new Long(6811161968424632369L);
        term621 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        Object term622 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        Object term691 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setField(term621, term621.getClass(), "logger", null);
        setField(term622, term622.getClass(), "id", term623);
        setField(term622, term622.getClass(), "platform", "OclPbYPkcH");
        setField(term622, term622.getClass(), "videoCreatorUid", "IoAlmYsBwc");
        setField(term622, term622.getClass(), "videoId", "TEParAifyi");
        setField(term622, term622.getClass(), "videoCreatedTime", term661);
        setField(term622, term622.getClass(), "danmuTotalNum", term663);
        setField(term622, term622.getClass(), "danmuSentNum", term665);
        setField(term622, term622.getClass(), "pageSize", term667);
        setField(term622, term622.getClass(), "skip", term669);
        setField(term622, term622.getClass(), "taskFail", term671);
        setField(term622, term622.getClass(), "createTime", term673);
        setField(term622, term622.getClass(), "updateTime", term675);
        setField(term622, term622.getClass(), "finishTime", term677);
        setField(term621, term621.getClass(), "latest", term622);
        setField(term621, term621.getClass(), "cookie", "OWDIEULEFu");
        setLongField(term691, term691.getClass(), "uid", 6375119433582206027L);
        setBooleanField(term691, term691.getClass(), "login", false);
        setIntField(term691, term691.getClass(), "level", 1162663216);
        setField(term691, term691.getClass(), "nickName", "dWRymuLBtr");
        setField(term691, term691.getClass(), "imgKey", "AijpHYOFuy");
        setField(term691, term691.getClass(), "subKey", "SbAoxhfrkn");
        setField(term691, term691.getClass(), "cookie", "kuTXqwMtDB");
        setField(term691, term691.getClass(), "accessKey", "Ghbwtircqb");
        setField(term621, term621.getClass(), "baseUserInfo", term691);
        setField(term621, term621.getClass(), "uid", "xrwlQZdwCp");
        setField(term621, term621.getClass(), "tagMatch", "IDCWpPLRkE");
        setField(term621, term621.getClass(), "titleMatch", "nyiiPDVjAc");
        setField(term621, term621.getClass(), "videoPartTimeRegular", "aKnKipADSo");
        setField(term621, term621.getClass(), "videoPartTimeFormat", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateLatestVideoId", argTypes, term621, args);
    }

};


