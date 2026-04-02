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

public class DropRecipientEnt_DropRecipientEntBuilder_code_2214145837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43849;

    public DropRecipientEnt_DropRecipientEntBuilder_code_2214145837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43850 = new Long(-4867941246533901410L);
        Class<? extends Object> term43965 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term43964 = ((Class) term43965).getDeclaredField((String) "FAILED");
        ((Field) term43964).setAccessible(true);
        Object enum83 = ((Field) term43964).get((Object) null);
        Integer term43902 = new Integer(-469968304);
        Long term43904 = new Long(1044883697493326351L);
        term43849 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term43864 = newInstance(Class.forName("java.util.Date"));
        Object term43866 = newInstance(Class.forName("java.util.Date"));
        setField(term43849, term43849.getClass(), "id", term43850);
        setField(term43849, term43849.getClass(), "address", "fzeqPnzpnt");
        setLongField(term43864, term43864.getClass(), "fastTime", 1408294742367L);
        setField(term43864, term43864.getClass(), "cdate", null);
        setField(term43849, term43849.getClass(), "createDate", term43864);
        setLongField(term43866, term43866.getClass(), "fastTime", 1643981144410L);
        setField(term43866, term43866.getClass(), "cdate", null);
        setField(term43849, term43849.getClass(), "updateDate", term43866);
        setField(term43849, term43849.getClass(), "status", enum83);
        setField(term43849, term43849.getClass(), "failReason", "RxbhrFBjkO");
        setField(term43849, term43849.getClass(), "code", "aanyiAOJCl");
        setField(term43849, term43849.getClass(), "retryAttempt", term43902);
        setField(term43849, term43849.getClass(), "dropRequestId", term43904);
        setField(term43849, term43849.getClass(), "snapshotBalance", "VDokbsCuqq");
        setField(term43849, term43849.getClass(), "payAmount", "xClUIcPECX");
        setField(term43849, term43849.getClass(), "ownedNftId", "avhRaGZaBF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JkgoRtImdE";
        callMethod(klass, "code", argTypes, term43849, args);
    }

};


