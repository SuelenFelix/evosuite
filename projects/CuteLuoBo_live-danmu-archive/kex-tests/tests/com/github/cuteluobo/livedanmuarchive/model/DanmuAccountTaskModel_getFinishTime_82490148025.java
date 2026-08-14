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

public class DanmuAccountTaskModel_getFinishTime_82490148025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4859;

    public DanmuAccountTaskModel_getFinishTime_82490148025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4860 = new Integer(158873461);
        Integer term4862 = new Integer(-430151637);
        Integer term4888 = new Integer(-1697741339);
        Long term4890 = new Long(-6394943900800506753L);
        Integer term4892 = new Integer(0);
        Integer term4894 = new Integer(0);
        Integer term4896 = new Integer(98922530);
        Boolean term4898 = new Boolean(false);
        Long term4900 = new Long(-4867941246533901410L);
        Long term4902 = new Long(1044883697493326351L);
        Long term4904 = new Long(-7406618974062419277L);
        term4859 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4859, term4859.getClass(), "id", term4860);
        setField(term4859, term4859.getClass(), "danmuSenderTaskId", term4862);
        setField(term4859, term4859.getClass(), "senderUid", "hMmaoREuCK");
        setField(term4859, term4859.getClass(), "videoId", "VeDtgDzGAN");
        setField(term4859, term4859.getClass(), "lastVideoPartIndex", term4888);
        setField(term4859, term4859.getClass(), "lastVideoPartCid", term4890);
        setField(term4859, term4859.getClass(), "pageIndex", term4892);
        setField(term4859, term4859.getClass(), "pageSize", term4894);
        setField(term4859, term4859.getClass(), "lastDanmuIndex", term4896);
        setField(term4859, term4859.getClass(), "stop", term4898);
        setField(term4859, term4859.getClass(), "createTime", term4900);
        setField(term4859, term4859.getClass(), "updateTime", term4902);
        setField(term4859, term4859.getClass(), "finishTime", term4904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinishTime", argTypes, term4859, args);
    }

};


