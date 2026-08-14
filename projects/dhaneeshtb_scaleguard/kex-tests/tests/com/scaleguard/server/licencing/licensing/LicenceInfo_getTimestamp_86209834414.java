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

public class LicenceInfo_getTimestamp_86209834414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5700;

    public LicenceInfo_getTimestamp_86209834414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5700 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term5700, term5700.getClass(), "email", "nRvKihUSPj");
        setField(term5700, term5700.getClass(), "name", "BbNeQJpYPr");
        setField(term5700, term5700.getClass(), "address", "riMtzCoxNj");
        setField(term5700, term5700.getClass(), "phone", "YAXkVjQZcV");
        setField(term5700, term5700.getClass(), "country", "pumvwBWvpy");
        setField(term5700, term5700.getClass(), "zipPostalCode", "HwLHeGLyhe");
        setField(term5700, term5700.getClass(), "deviceId", "RDnkgWkcbz");
        setField(term5700, term5700.getClass(), "activationKey", "aQFUvuaYxd");
        setField(term5700, term5700.getClass(), "activationHash", "zNFLXMifnS");
        setField(term5700, term5700.getClass(), "dbKey", "HHQcYMSBVc");
        setField(term5700, term5700.getClass(), "passcode", "hePqROaplw");
        setLongField(term5700, term5700.getClass(), "timestamp", 1786470042099L);
        setLongField(term5700, term5700.getClass(), "activationTimestamp", -2850532706972744550L);
        setLongField(term5700, term5700.getClass(), "approver", -2644215923136513282L);
        setField(term5700, term5700.getClass(), "licenceId", "rIPMBcrNqB");
        setLongField(term5700, term5700.getClass(), "expiryTimestamp", -1468719814009985452L);
        setField(term5700, term5700.getClass(), "plan", "IBpaxltauX");
        setBooleanField(term5700, term5700.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term5700, args);
    }

};


