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

public class LicenceInfo_getPhone_99462923712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4898;

    public LicenceInfo_getPhone_99462923712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4898 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term4898, term4898.getClass(), "email", "pXdglvyrQe");
        setField(term4898, term4898.getClass(), "name", "OcfNzHYdki");
        setField(term4898, term4898.getClass(), "address", "uPuCVuZYOI");
        setField(term4898, term4898.getClass(), "phone", "TweMFhxNdj");
        setField(term4898, term4898.getClass(), "country", "NBrvVzvQHe");
        setField(term4898, term4898.getClass(), "zipPostalCode", "FjOiNAfBOc");
        setField(term4898, term4898.getClass(), "deviceId", "iCCsaLHohG");
        setField(term4898, term4898.getClass(), "activationKey", "SPtPatHeOm");
        setField(term4898, term4898.getClass(), "activationHash", "ywmcuThdfL");
        setField(term4898, term4898.getClass(), "dbKey", "GBOEuByOfr");
        setField(term4898, term4898.getClass(), "passcode", "MYWYUeLGOp");
        setLongField(term4898, term4898.getClass(), "timestamp", 1786470041990L);
        setLongField(term4898, term4898.getClass(), "activationTimestamp", -7612550318181586304L);
        setLongField(term4898, term4898.getClass(), "approver", -2170847986967241072L);
        setField(term4898, term4898.getClass(), "licenceId", "zaloBqlrSo");
        setLongField(term4898, term4898.getClass(), "expiryTimestamp", 4044358158040652353L);
        setField(term4898, term4898.getClass(), "plan", "NJhGgctbdj");
        setBooleanField(term4898, term4898.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term4898, args);
    }

};


