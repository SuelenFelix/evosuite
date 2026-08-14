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

public class DanmuAccountTaskModel_getId_18478721791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3187;

    public DanmuAccountTaskModel_getId_18478721791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3188 = new Integer(-1016503459);
        Integer term3190 = new Integer(-1968847291);
        Integer term3216 = new Integer(579005622);
        Long term3218 = new Long(-1616722610139554082L);
        Integer term3220 = new Integer(0);
        Integer term3222 = new Integer(0);
        Integer term3224 = new Integer(-14890619);
        Boolean term3226 = new Boolean(false);
        Long term3228 = new Long(7495904023107549024L);
        Long term3230 = new Long(8802866251294305945L);
        Long term3232 = new Long(4513004407927379358L);
        term3187 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3187, term3187.getClass(), "id", term3188);
        setField(term3187, term3187.getClass(), "danmuSenderTaskId", term3190);
        setField(term3187, term3187.getClass(), "senderUid", "fztQhjqwdP");
        setField(term3187, term3187.getClass(), "videoId", "eVpkWxjuki");
        setField(term3187, term3187.getClass(), "lastVideoPartIndex", term3216);
        setField(term3187, term3187.getClass(), "lastVideoPartCid", term3218);
        setField(term3187, term3187.getClass(), "pageIndex", term3220);
        setField(term3187, term3187.getClass(), "pageSize", term3222);
        setField(term3187, term3187.getClass(), "lastDanmuIndex", term3224);
        setField(term3187, term3187.getClass(), "stop", term3226);
        setField(term3187, term3187.getClass(), "createTime", term3228);
        setField(term3187, term3187.getClass(), "updateTime", term3230);
        setField(term3187, term3187.getClass(), "finishTime", term3232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3187, args);
    }

};


