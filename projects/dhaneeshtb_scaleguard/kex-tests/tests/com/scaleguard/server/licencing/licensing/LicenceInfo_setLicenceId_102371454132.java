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

public class LicenceInfo_setLicenceId_102371454132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13078;

    public LicenceInfo_setLicenceId_102371454132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13078 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term13078, term13078.getClass(), "email", "IbxeAMwLVt");
        setField(term13078, term13078.getClass(), "name", "bShlAqoTmZ");
        setField(term13078, term13078.getClass(), "address", "nOKlKlNhtU");
        setField(term13078, term13078.getClass(), "phone", "gXFNBHJSey");
        setField(term13078, term13078.getClass(), "country", "wUcSfItZgv");
        setField(term13078, term13078.getClass(), "zipPostalCode", "rOfPCPHmtJ");
        setField(term13078, term13078.getClass(), "deviceId", "EnmiAvfpJv");
        setField(term13078, term13078.getClass(), "activationKey", "asMqnMNrZp");
        setField(term13078, term13078.getClass(), "activationHash", "pqFUMTCKJd");
        setField(term13078, term13078.getClass(), "dbKey", "PTEndmPMzk");
        setField(term13078, term13078.getClass(), "passcode", "FrTZLybkKk");
        setLongField(term13078, term13078.getClass(), "timestamp", 1786470043158L);
        setLongField(term13078, term13078.getClass(), "activationTimestamp", -1804015692891701666L);
        setLongField(term13078, term13078.getClass(), "approver", -6432617521836576658L);
        setField(term13078, term13078.getClass(), "licenceId", "lHYNCJRiOv");
        setLongField(term13078, term13078.getClass(), "expiryTimestamp", -2255965562447970862L);
        setField(term13078, term13078.getClass(), "plan", "AdYzLPMcwe");
        setBooleanField(term13078, term13078.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FlxVmiMYKP";
        callMethod(klass, "setLicenceId", argTypes, term13078, args);
    }

};


