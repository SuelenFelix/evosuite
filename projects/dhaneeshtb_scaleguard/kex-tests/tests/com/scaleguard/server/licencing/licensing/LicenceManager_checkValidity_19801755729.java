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

public class LicenceManager_checkValidity_19801755729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14661;

    public LicenceManager_checkValidity_19801755729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14661 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14661, term14661.getClass(), "email", "jXKxUGTuEF");
        setField(term14661, term14661.getClass(), "name", "nDCcyhiTnS");
        setField(term14661, term14661.getClass(), "address", "Bcivwcjece");
        setField(term14661, term14661.getClass(), "phone", "QTefjRuiez");
        setField(term14661, term14661.getClass(), "country", "SQZVNkAVBB");
        setField(term14661, term14661.getClass(), "zipPostalCode", "mrSAYJlddZ");
        setField(term14661, term14661.getClass(), "deviceId", "KbwxawvYsw");
        setField(term14661, term14661.getClass(), "activationKey", "AjoFvDFyCY");
        setField(term14661, term14661.getClass(), "activationHash", "OFTJwdPiTG");
        setField(term14661, term14661.getClass(), "dbKey", "QiUprSEluR");
        setField(term14661, term14661.getClass(), "passcode", "HqitWglYWX");
        setLongField(term14661, term14661.getClass(), "timestamp", 1786470045388L);
        setLongField(term14661, term14661.getClass(), "activationTimestamp", 8034714140377562739L);
        setLongField(term14661, term14661.getClass(), "approver", -2924531382671518368L);
        setField(term14661, term14661.getClass(), "licenceId", "rfqJDkDppz");
        setLongField(term14661, term14661.getClass(), "expiryTimestamp", -3948863953565024517L);
        setField(term14661, term14661.getClass(), "plan", "gvjdfHNzOa");
        setBooleanField(term14661, term14661.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Object[] args = new Object[1];
        args[0] = term14661;
        callMethod(klass, "checkValidity", argTypes, null, args);
    }

};


