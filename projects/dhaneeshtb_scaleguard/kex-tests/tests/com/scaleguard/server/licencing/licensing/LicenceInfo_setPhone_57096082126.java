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

public class LicenceInfo_setPhone_57096082126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10580;

    public LicenceInfo_setPhone_57096082126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10580 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term10580, term10580.getClass(), "email", "OyYyYYnJuF");
        setField(term10580, term10580.getClass(), "name", "aYLvcxZohT");
        setField(term10580, term10580.getClass(), "address", "mnHyQbMyld");
        setField(term10580, term10580.getClass(), "phone", "KHtaDOIcJZ");
        setField(term10580, term10580.getClass(), "country", "vgdwrCZczl");
        setField(term10580, term10580.getClass(), "zipPostalCode", "gKMNrpKBpu");
        setField(term10580, term10580.getClass(), "deviceId", "ZbHJVEqcoa");
        setField(term10580, term10580.getClass(), "activationKey", "jlraKkBWFA");
        setField(term10580, term10580.getClass(), "activationHash", "mRBtFTxVdE");
        setField(term10580, term10580.getClass(), "dbKey", "IVacFDAZcj");
        setField(term10580, term10580.getClass(), "passcode", "HJwNgUzZZR");
        setLongField(term10580, term10580.getClass(), "timestamp", 1786470042819L);
        setLongField(term10580, term10580.getClass(), "activationTimestamp", -8033714905181142681L);
        setLongField(term10580, term10580.getClass(), "approver", -9040825890007374809L);
        setField(term10580, term10580.getClass(), "licenceId", "EWFbEDAVrE");
        setLongField(term10580, term10580.getClass(), "expiryTimestamp", 1368340889161782793L);
        setField(term10580, term10580.getClass(), "plan", "awDQVEVIKi");
        setBooleanField(term10580, term10580.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FvUCZgTXhq";
        callMethod(klass, "setPhone", argTypes, term10580, args);
    }

};


