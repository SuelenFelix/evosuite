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

public class LicenceInfo_getDeviceId_103634598817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6905;

    public LicenceInfo_getDeviceId_103634598817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6905 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term6905, term6905.getClass(), "email", "zgKiINdgNu");
        setField(term6905, term6905.getClass(), "name", "zLMTXDQHYH");
        setField(term6905, term6905.getClass(), "address", "PqywFWJlpE");
        setField(term6905, term6905.getClass(), "phone", "OzXRsFGTIp");
        setField(term6905, term6905.getClass(), "country", "TjWpyghUWN");
        setField(term6905, term6905.getClass(), "zipPostalCode", "dkZFDZxcde");
        setField(term6905, term6905.getClass(), "deviceId", "WXcZEtUKlI");
        setField(term6905, term6905.getClass(), "activationKey", "qUtkFGMNUV");
        setField(term6905, term6905.getClass(), "activationHash", "mGRiYhnMcR");
        setField(term6905, term6905.getClass(), "dbKey", "NFlvfJCVPO");
        setField(term6905, term6905.getClass(), "passcode", "boSSpezHeU");
        setLongField(term6905, term6905.getClass(), "timestamp", 1786470042290L);
        setLongField(term6905, term6905.getClass(), "activationTimestamp", 414749984815662075L);
        setLongField(term6905, term6905.getClass(), "approver", 463622836963501975L);
        setField(term6905, term6905.getClass(), "licenceId", "jiUSjqwSIQ");
        setLongField(term6905, term6905.getClass(), "expiryTimestamp", 305759998609888272L);
        setField(term6905, term6905.getClass(), "plan", "IkpjUOuWQU");
        setBooleanField(term6905, term6905.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeviceId", argTypes, term6905, args);
    }

};


