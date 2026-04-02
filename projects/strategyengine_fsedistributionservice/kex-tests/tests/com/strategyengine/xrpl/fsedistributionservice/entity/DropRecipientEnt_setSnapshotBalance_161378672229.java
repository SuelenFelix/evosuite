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

public class DropRecipientEnt_setSnapshotBalance_161378672229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38502;

    public DropRecipientEnt_setSnapshotBalance_161378672229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38503 = new Long(-1145146470850585022L);
        Class<? extends Object> term38618 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term38617 = ((Class) term38618).getDeclaredField((String) "FAILED");
        ((Field) term38617).setAccessible(true);
        Object enum74 = ((Field) term38617).get((Object) null);
        Integer term38555 = new Integer(-1275173084);
        Long term38557 = new Long(1993646237353405740L);
        term38502 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term38517 = newInstance(Class.forName("java.util.Date"));
        Object term38519 = newInstance(Class.forName("java.util.Date"));
        setField(term38502, term38502.getClass(), "id", term38503);
        setField(term38502, term38502.getClass(), "address", "FjOiNAfBOc");
        setLongField(term38517, term38517.getClass(), "fastTime", 1793404489395L);
        setField(term38517, term38517.getClass(), "cdate", null);
        setField(term38502, term38502.getClass(), "createDate", term38517);
        setLongField(term38519, term38519.getClass(), "fastTime", 1758357140066L);
        setField(term38519, term38519.getClass(), "cdate", null);
        setField(term38502, term38502.getClass(), "updateDate", term38519);
        setField(term38502, term38502.getClass(), "status", enum74);
        setField(term38502, term38502.getClass(), "failReason", "iCCsaLHohG");
        setField(term38502, term38502.getClass(), "code", "NJhGgctbdj");
        setField(term38502, term38502.getClass(), "retryAttempt", term38555);
        setField(term38502, term38502.getClass(), "dropRequestId", term38557);
        setField(term38502, term38502.getClass(), "snapshotBalance", "MYWYUeLGOp");
        setField(term38502, term38502.getClass(), "payAmount", "tsTGdgQYUL");
        setField(term38502, term38502.getClass(), "ownedNftId", "TtGbVmKcnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GJVkUrCVdD";
        callMethod(klass, "setSnapshotBalance", argTypes, term38502, args);
    }

};


