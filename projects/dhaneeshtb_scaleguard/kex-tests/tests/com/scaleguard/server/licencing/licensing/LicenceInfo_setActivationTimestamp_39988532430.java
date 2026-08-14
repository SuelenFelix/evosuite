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
import java.lang.Long;

public class LicenceInfo_setActivationTimestamp_39988532430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12272;
     Object term12543;

    public LicenceInfo_setActivationTimestamp_39988532430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12272 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term12272, term12272.getClass(), "email", "BcENaQFYSd");
        setField(term12272, term12272.getClass(), "name", "POPYycoDBy");
        setField(term12272, term12272.getClass(), "address", "LuWMOXdAPA");
        setField(term12272, term12272.getClass(), "phone", "blSffTnsOv");
        setField(term12272, term12272.getClass(), "country", "qbUMcIvEXH");
        setField(term12272, term12272.getClass(), "zipPostalCode", "TVxGTjeDcu");
        setField(term12272, term12272.getClass(), "deviceId", "ABPtcyCzkR");
        setField(term12272, term12272.getClass(), "activationKey", "TGiJfagfky");
        setField(term12272, term12272.getClass(), "activationHash", "BJklinBmhN");
        setField(term12272, term12272.getClass(), "dbKey", "IOddzvEWcl");
        setField(term12272, term12272.getClass(), "passcode", "VGiXZZTWRO");
        setLongField(term12272, term12272.getClass(), "timestamp", 1786470043044L);
        setLongField(term12272, term12272.getClass(), "activationTimestamp", -5386201758403679145L);
        setLongField(term12272, term12272.getClass(), "approver", -7268507582722666254L);
        setField(term12272, term12272.getClass(), "licenceId", "VuLLXpvPpZ");
        setLongField(term12272, term12272.getClass(), "expiryTimestamp", 5671808784468963649L);
        setField(term12272, term12272.getClass(), "plan", "QgHhxMyKvr");
        setBooleanField(term12272, term12272.getClass(), "isEvaluation", true);
        term12543 = new Long(2297097306706899827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term12543;
        callMethod(klass, "setActivationTimestamp", argTypes, term12272, args);
    }

};


