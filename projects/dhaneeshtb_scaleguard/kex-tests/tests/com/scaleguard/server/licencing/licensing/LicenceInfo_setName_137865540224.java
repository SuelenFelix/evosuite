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

public class LicenceInfo_setName_137865540224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9734;

    public LicenceInfo_setName_137865540224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9734 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term9734, term9734.getClass(), "email", "bEmHScVZaQ");
        setField(term9734, term9734.getClass(), "name", "TcuXODkzBV");
        setField(term9734, term9734.getClass(), "address", "coJPjrBZNe");
        setField(term9734, term9734.getClass(), "phone", "vMsWjuPTnO");
        setField(term9734, term9734.getClass(), "country", "zHvfKaOstO");
        setField(term9734, term9734.getClass(), "zipPostalCode", "tOszriqETr");
        setField(term9734, term9734.getClass(), "deviceId", "ncSPTkhKjO");
        setField(term9734, term9734.getClass(), "activationKey", "PbLgCSAHce");
        setField(term9734, term9734.getClass(), "activationHash", "NWldOLAbqk");
        setField(term9734, term9734.getClass(), "dbKey", "qnYaYSpDwO");
        setField(term9734, term9734.getClass(), "passcode", "nrQjODRMLD");
        setLongField(term9734, term9734.getClass(), "timestamp", 1786470042703L);
        setLongField(term9734, term9734.getClass(), "activationTimestamp", 3133860696238261492L);
        setLongField(term9734, term9734.getClass(), "approver", 7247160664318067468L);
        setField(term9734, term9734.getClass(), "licenceId", "EKpdCBubDE");
        setLongField(term9734, term9734.getClass(), "expiryTimestamp", 2135754395358000892L);
        setField(term9734, term9734.getClass(), "plan", "jcWKHRWhyj");
        setBooleanField(term9734, term9734.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PNoWXrsFic";
        callMethod(klass, "setName", argTypes, term9734, args);
    }

};


