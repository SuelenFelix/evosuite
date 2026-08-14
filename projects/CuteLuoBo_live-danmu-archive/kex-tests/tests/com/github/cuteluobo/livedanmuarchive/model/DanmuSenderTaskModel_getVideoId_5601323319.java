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

public class DanmuSenderTaskModel_getVideoId_5601323319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public DanmuSenderTaskModel_getVideoId_5601323319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term725 = new Integer(1227103734);
        Long term763 = new Long(2120084523938730454L);
        Long term765 = new Long(0L);
        Long term767 = new Long(0L);
        Integer term769 = new Integer(0);
        Boolean term771 = new Boolean(false);
        Boolean term773 = new Boolean(false);
        Long term775 = new Long(6855071767938501807L);
        Long term777 = new Long(-5892135042702373494L);
        Long term779 = new Long(5262507301787091109L);
        term724 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term724, term724.getClass(), "id", term725);
        setField(term724, term724.getClass(), "platform", "flxyYxBRtu");
        setField(term724, term724.getClass(), "videoCreatorUid", "OclPbYPkcH");
        setField(term724, term724.getClass(), "videoId", "IoAlmYsBwc");
        setField(term724, term724.getClass(), "videoCreatedTime", term763);
        setField(term724, term724.getClass(), "danmuTotalNum", term765);
        setField(term724, term724.getClass(), "danmuSentNum", term767);
        setField(term724, term724.getClass(), "pageSize", term769);
        setField(term724, term724.getClass(), "skip", term771);
        setField(term724, term724.getClass(), "taskFail", term773);
        setField(term724, term724.getClass(), "createTime", term775);
        setField(term724, term724.getClass(), "updateTime", term777);
        setField(term724, term724.getClass(), "finishTime", term779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoId", argTypes, term724, args);
    }

};


