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

public class LicenceInfo_setEmail_47157084523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9311;

    public LicenceInfo_setEmail_47157084523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9311 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term9311, term9311.getClass(), "email", "EULDrUNQvw");
        setField(term9311, term9311.getClass(), "name", "BtvAvsJSei");
        setField(term9311, term9311.getClass(), "address", "vqnBkkxoIa");
        setField(term9311, term9311.getClass(), "phone", "bycpZjxXFn");
        setField(term9311, term9311.getClass(), "country", "jQWttOAiwL");
        setField(term9311, term9311.getClass(), "zipPostalCode", "DzKFxEuEEC");
        setField(term9311, term9311.getClass(), "deviceId", "CAMnvfDLJL");
        setField(term9311, term9311.getClass(), "activationKey", "HknsTajwxJ");
        setField(term9311, term9311.getClass(), "activationHash", "XtiurrVYKw");
        setField(term9311, term9311.getClass(), "dbKey", "rsumfoDNHa");
        setField(term9311, term9311.getClass(), "passcode", "cmuaUiHMVL");
        setLongField(term9311, term9311.getClass(), "timestamp", 1786470042647L);
        setLongField(term9311, term9311.getClass(), "activationTimestamp", 6689117472719450333L);
        setLongField(term9311, term9311.getClass(), "approver", 5836128569274066678L);
        setField(term9311, term9311.getClass(), "licenceId", "LrqwfrKKtS");
        setLongField(term9311, term9311.getClass(), "expiryTimestamp", -2177368829816872572L);
        setField(term9311, term9311.getClass(), "plan", "mfHtgSbdjD");
        setBooleanField(term9311, term9311.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xjoSGPWUgu";
        callMethod(klass, "setEmail", argTypes, term9311, args);
    }

};


