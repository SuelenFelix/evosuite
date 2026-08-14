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

public class LicenceInfo_getLicenceId_118647198120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8108;

    public LicenceInfo_getLicenceId_118647198120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8108 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term8108, term8108.getClass(), "email", "DSFGlcaXUb");
        setField(term8108, term8108.getClass(), "name", "sHMXNUzNeM");
        setField(term8108, term8108.getClass(), "address", "gPzGDOEPPw");
        setField(term8108, term8108.getClass(), "phone", "rwKoAngzCu");
        setField(term8108, term8108.getClass(), "country", "VUkRVwROTl");
        setField(term8108, term8108.getClass(), "zipPostalCode", "UDlkdccCRn");
        setField(term8108, term8108.getClass(), "deviceId", "McpzErOcYb");
        setField(term8108, term8108.getClass(), "activationKey", "WdCiTDUKqn");
        setField(term8108, term8108.getClass(), "activationHash", "PSizQDoxxe");
        setField(term8108, term8108.getClass(), "dbKey", "mKaHyMybrK");
        setField(term8108, term8108.getClass(), "passcode", "QITgiBrmfj");
        setLongField(term8108, term8108.getClass(), "timestamp", 1786470042477L);
        setLongField(term8108, term8108.getClass(), "activationTimestamp", 7862575738391801707L);
        setLongField(term8108, term8108.getClass(), "approver", 50358265865610362L);
        setField(term8108, term8108.getClass(), "licenceId", "yevIIoVYHq");
        setLongField(term8108, term8108.getClass(), "expiryTimestamp", 5510783420697225605L);
        setField(term8108, term8108.getClass(), "plan", "jqrVEUvYEz");
        setBooleanField(term8108, term8108.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLicenceId", argTypes, term8108, args);
    }

};


