package com.scaleguard.server.licencing.licensing;

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
import static com.scaleguard.server.licencing.licensing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class LicenceInfo_setTimestamp_166476096215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6101;
     Object term6372;

    public LicenceInfo_setTimestamp_166476096215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6101 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term6101, term6101.getClass(), "email", "aanyiAOJCl");
        setField(term6101, term6101.getClass(), "name", "VDokbsCuqq");
        setField(term6101, term6101.getClass(), "address", "xClUIcPECX");
        setField(term6101, term6101.getClass(), "phone", "avhRaGZaBF");
        setField(term6101, term6101.getClass(), "country", "JkgoRtImdE");
        setField(term6101, term6101.getClass(), "zipPostalCode", "qFGKIJjlmV");
        setField(term6101, term6101.getClass(), "deviceId", "IHqvyhMtuM");
        setField(term6101, term6101.getClass(), "activationKey", "RCOqfVsRHt");
        setField(term6101, term6101.getClass(), "activationHash", "TSyCeEZPaT");
        setField(term6101, term6101.getClass(), "dbKey", "JeZFtaqkzW");
        setField(term6101, term6101.getClass(), "passcode", "mLwibAPEsa");
        setLongField(term6101, term6101.getClass(), "timestamp", 1786470042161L);
        setLongField(term6101, term6101.getClass(), "activationTimestamp", 3825396310311739952L);
        setLongField(term6101, term6101.getClass(), "approver", -3838084482494604218L);
        setField(term6101, term6101.getClass(), "licenceId", "fzeqPnzpnt");
        setLongField(term6101, term6101.getClass(), "expiryTimestamp", 3892018155439224435L);
        setField(term6101, term6101.getClass(), "plan", "dAldIGYAXV");
        setBooleanField(term6101, term6101.getClass(), "isEvaluation", false);
        term6372 = new Long(5953383087795962419L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6372;
        callMethod(klass, "setTimestamp", argTypes, term6101, args);
    }

};


