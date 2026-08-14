package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class DanmuAccountTaskModel_getLastVideoPartIndex_3975380609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3771;

    public DanmuAccountTaskModel_getLastVideoPartIndex_3975380609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3772 = new Integer(972867650);
        Integer term3774 = new Integer(1655935355);
        Integer term3800 = new Integer(-481533957);
        Long term3802 = new Long(-8892586408602479513L);
        Integer term3804 = new Integer(0);
        Integer term3806 = new Integer(0);
        Integer term3808 = new Integer(1240914516);
        Boolean term3810 = new Boolean(false);
        Long term3812 = new Long(4616440478358528406L);
        Long term3814 = new Long(3427570961451840069L);
        Long term3816 = new Long(4502292577098212311L);
        term3771 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3771, term3771.getClass(), "id", term3772);
        setField(term3771, term3771.getClass(), "danmuSenderTaskId", term3774);
        setField(term3771, term3771.getClass(), "senderUid", "mLUZFTfjle");
        setField(term3771, term3771.getClass(), "videoId", "xIeFjkHkOe");
        setField(term3771, term3771.getClass(), "lastVideoPartIndex", term3800);
        setField(term3771, term3771.getClass(), "lastVideoPartCid", term3802);
        setField(term3771, term3771.getClass(), "pageIndex", term3804);
        setField(term3771, term3771.getClass(), "pageSize", term3806);
        setField(term3771, term3771.getClass(), "lastDanmuIndex", term3808);
        setField(term3771, term3771.getClass(), "stop", term3810);
        setField(term3771, term3771.getClass(), "createTime", term3812);
        setField(term3771, term3771.getClass(), "updateTime", term3814);
        setField(term3771, term3771.getClass(), "finishTime", term3816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastVideoPartIndex", argTypes, term3771, args);
    }

};


