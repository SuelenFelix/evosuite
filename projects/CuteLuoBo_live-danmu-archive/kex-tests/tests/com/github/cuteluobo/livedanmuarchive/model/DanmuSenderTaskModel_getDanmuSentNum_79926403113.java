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

public class DanmuSenderTaskModel_getDanmuSentNum_79926403113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1096;

    public DanmuSenderTaskModel_getDanmuSentNum_79926403113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1097 = new Integer(1134449235);
        Long term1135 = new Long(-2170847986967241072L);
        Long term1137 = new Long(0L);
        Long term1139 = new Long(0L);
        Integer term1141 = new Integer(0);
        Boolean term1143 = new Boolean(false);
        Boolean term1145 = new Boolean(false);
        Long term1147 = new Long(4044358158040652353L);
        Long term1149 = new Long(-4443169559037975007L);
        Long term1151 = new Long(-3842548265506930260L);
        term1096 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1096, term1096.getClass(), "id", term1097);
        setField(term1096, term1096.getClass(), "platform", "aKnKipADSo");
        setField(term1096, term1096.getClass(), "videoCreatorUid", "wSQxaModmm");
        setField(term1096, term1096.getClass(), "videoId", "UlajhuVLaP");
        setField(term1096, term1096.getClass(), "videoCreatedTime", term1135);
        setField(term1096, term1096.getClass(), "danmuTotalNum", term1137);
        setField(term1096, term1096.getClass(), "danmuSentNum", term1139);
        setField(term1096, term1096.getClass(), "pageSize", term1141);
        setField(term1096, term1096.getClass(), "skip", term1143);
        setField(term1096, term1096.getClass(), "taskFail", term1145);
        setField(term1096, term1096.getClass(), "createTime", term1147);
        setField(term1096, term1096.getClass(), "updateTime", term1149);
        setField(term1096, term1096.getClass(), "finishTime", term1151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanmuSentNum", argTypes, term1096, args);
    }

};


