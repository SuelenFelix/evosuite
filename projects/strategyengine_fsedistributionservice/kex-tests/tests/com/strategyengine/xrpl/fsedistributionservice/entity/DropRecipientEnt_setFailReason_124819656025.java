package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class DropRecipientEnt_setFailReason_124819656025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36150;

    public DropRecipientEnt_setFailReason_124819656025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36151 = new Long(3288941170644426558L);
        Class<? extends Object> term36268 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term36267 = ((Class) term36268).getDeclaredField((String) "VERIFIED");
        ((Field) term36267).setAccessible(true);
        Object enum70 = ((Field) term36267).get((Object) null);
        Integer term36205 = new Integer(-117576464);
        Long term36207 = new Long(-8338004844694486146L);
        term36150 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term36165 = newInstance(Class.forName("java.util.Date"));
        Object term36167 = newInstance(Class.forName("java.util.Date"));
        setField(term36150, term36150.getClass(), "id", term36151);
        setField(term36150, term36150.getClass(), "address", "doQLHkjpNm");
        setLongField(term36165, term36165.getClass(), "fastTime", 1755788577674L);
        setField(term36165, term36165.getClass(), "cdate", null);
        setField(term36150, term36150.getClass(), "createDate", term36165);
        setLongField(term36167, term36167.getClass(), "fastTime", 1291600397937L);
        setField(term36167, term36167.getClass(), "cdate", null);
        setField(term36150, term36150.getClass(), "updateDate", term36167);
        setField(term36150, term36150.getClass(), "status", enum70);
        setField(term36150, term36150.getClass(), "failReason", "lCyLIcSuom");
        setField(term36150, term36150.getClass(), "code", "CGOpQSZZwI");
        setField(term36150, term36150.getClass(), "retryAttempt", term36205);
        setField(term36150, term36150.getClass(), "dropRequestId", term36207);
        setField(term36150, term36150.getClass(), "snapshotBalance", "ypEdrstygY");
        setField(term36150, term36150.getClass(), "payAmount", "sNQFlATEeQ");
        setField(term36150, term36150.getClass(), "ownedNftId", "ZKMLioamsY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVbxuoDBcn";
        callMethod(klass, "setFailReason", argTypes, term36150, args);
    }

};


