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

public class LicenceInfo_getDbKey_12707509041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;

    public LicenceInfo_getDbKey_12707509041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term399, term399.getClass(), "email", "OWDIEULEFu");
        setField(term399, term399.getClass(), "name", "dWRymuLBtr");
        setField(term399, term399.getClass(), "address", "AijpHYOFuy");
        setField(term399, term399.getClass(), "phone", "SbAoxhfrkn");
        setField(term399, term399.getClass(), "country", "kuTXqwMtDB");
        setField(term399, term399.getClass(), "zipPostalCode", "Ghbwtircqb");
        setField(term399, term399.getClass(), "deviceId", "xrwlQZdwCp");
        setField(term399, term399.getClass(), "activationKey", "BYqFIqCKAV");
        setField(term399, term399.getClass(), "activationHash", "vrQLuWIDJX");
        setField(term399, term399.getClass(), "dbKey", "flxyYxBRtu");
        setField(term399, term399.getClass(), "passcode", "nyiiPDVjAc");
        setLongField(term399, term399.getClass(), "timestamp", 1786470041418L);
        setLongField(term399, term399.getClass(), "activationTimestamp", 6375119433582206027L);
        setLongField(term399, term399.getClass(), "approver", -8257434502486459194L);
        setField(term399, term399.getClass(), "licenceId", "IoAlmYsBwc");
        setLongField(term399, term399.getClass(), "expiryTimestamp", -8400487765614892086L);
        setField(term399, term399.getClass(), "plan", "IDCWpPLRkE");
        setBooleanField(term399, term399.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDbKey", argTypes, term399, args);
    }

};


