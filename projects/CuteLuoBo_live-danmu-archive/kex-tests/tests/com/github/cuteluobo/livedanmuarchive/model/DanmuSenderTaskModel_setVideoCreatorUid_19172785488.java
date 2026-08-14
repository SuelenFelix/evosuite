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

public class DanmuSenderTaskModel_setVideoCreatorUid_19172785488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615;

    public DanmuSenderTaskModel_setVideoCreatorUid_19172785488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term616 = new Integer(-2038273078);
        Long term654 = new Long(7009926388951271268L);
        Long term656 = new Long(0L);
        Long term658 = new Long(0L);
        Integer term660 = new Integer(0);
        Boolean term662 = new Boolean(false);
        Boolean term664 = new Boolean(false);
        Long term666 = new Long(-7672528020740371001L);
        Long term668 = new Long(-4502405999831680926L);
        Long term670 = new Long(1967728129628047933L);
        term615 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term615, term615.getClass(), "id", term616);
        setField(term615, term615.getClass(), "platform", "xOEqzGAmDU");
        setField(term615, term615.getClass(), "videoCreatorUid", "eZFUvlxvGV");
        setField(term615, term615.getClass(), "videoId", "BYqFIqCKAV");
        setField(term615, term615.getClass(), "videoCreatedTime", term654);
        setField(term615, term615.getClass(), "danmuTotalNum", term656);
        setField(term615, term615.getClass(), "danmuSentNum", term658);
        setField(term615, term615.getClass(), "pageSize", term660);
        setField(term615, term615.getClass(), "skip", term662);
        setField(term615, term615.getClass(), "taskFail", term664);
        setField(term615, term615.getClass(), "createTime", term666);
        setField(term615, term615.getClass(), "updateTime", term668);
        setField(term615, term615.getClass(), "finishTime", term670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setVideoCreatorUid", argTypes, term615, args);
    }

};


