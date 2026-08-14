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

public class DanmuAccountTaskModel_setCreateTime_63941315522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4654;
     Object term4701;

    public DanmuAccountTaskModel_setCreateTime_63941315522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4655 = new Integer(71190297);
        Integer term4657 = new Integer(1202361360);
        Integer term4683 = new Integer(-2015048153);
        Long term4685 = new Long(5904678961906211249L);
        Integer term4687 = new Integer(0);
        Integer term4689 = new Integer(0);
        Integer term4691 = new Integer(-2063457669);
        Boolean term4693 = new Boolean(false);
        Long term4695 = new Long(-1820639665251914495L);
        Long term4697 = new Long(3238645206498300107L);
        Long term4699 = new Long(-1592696983130738594L);
        term4654 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4654, term4654.getClass(), "id", term4655);
        setField(term4654, term4654.getClass(), "danmuSenderTaskId", term4657);
        setField(term4654, term4654.getClass(), "senderUid", "VYkqXKVlAJ");
        setField(term4654, term4654.getClass(), "videoId", "XkIoWJRNwN");
        setField(term4654, term4654.getClass(), "lastVideoPartIndex", term4683);
        setField(term4654, term4654.getClass(), "lastVideoPartCid", term4685);
        setField(term4654, term4654.getClass(), "pageIndex", term4687);
        setField(term4654, term4654.getClass(), "pageSize", term4689);
        setField(term4654, term4654.getClass(), "lastDanmuIndex", term4691);
        setField(term4654, term4654.getClass(), "stop", term4693);
        setField(term4654, term4654.getClass(), "createTime", term4695);
        setField(term4654, term4654.getClass(), "updateTime", term4697);
        setField(term4654, term4654.getClass(), "finishTime", term4699);
        term4701 = new Long(6902365338255307910L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4701;
        callMethod(klass, "setCreateTime", argTypes, term4654, args);
    }

};


