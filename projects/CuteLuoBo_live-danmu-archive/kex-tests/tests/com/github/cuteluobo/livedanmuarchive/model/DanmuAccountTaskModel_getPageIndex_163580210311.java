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

public class DanmuAccountTaskModel_getPageIndex_163580210311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3907;

    public DanmuAccountTaskModel_getPageIndex_163580210311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3908 = new Integer(-556405712);
        Integer term3910 = new Integer(-1772434990);
        Integer term3936 = new Integer(-1845499264);
        Long term3938 = new Long(-6100012593724108983L);
        Integer term3940 = new Integer(0);
        Integer term3942 = new Integer(0);
        Integer term3944 = new Integer(-505439934);
        Boolean term3946 = new Boolean(false);
        Long term3948 = new Long(5465527210299101732L);
        Long term3950 = new Long(4699157009689333952L);
        Long term3952 = new Long(-78240609295693193L);
        term3907 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3907, term3907.getClass(), "id", term3908);
        setField(term3907, term3907.getClass(), "danmuSenderTaskId", term3910);
        setField(term3907, term3907.getClass(), "senderUid", "AKNapTAfmD");
        setField(term3907, term3907.getClass(), "videoId", "xJgPlLxpgC");
        setField(term3907, term3907.getClass(), "lastVideoPartIndex", term3936);
        setField(term3907, term3907.getClass(), "lastVideoPartCid", term3938);
        setField(term3907, term3907.getClass(), "pageIndex", term3940);
        setField(term3907, term3907.getClass(), "pageSize", term3942);
        setField(term3907, term3907.getClass(), "lastDanmuIndex", term3944);
        setField(term3907, term3907.getClass(), "stop", term3946);
        setField(term3907, term3907.getClass(), "createTime", term3948);
        setField(term3907, term3907.getClass(), "updateTime", term3950);
        setField(term3907, term3907.getClass(), "finishTime", term3952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageIndex", argTypes, term3907, args);
    }

};


