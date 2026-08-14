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

public class LicenceInfo_setActivationHash_391575834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624;

    public LicenceInfo_setActivationHash_391575834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1624 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term1624, term1624.getClass(), "email", "JiVRgTZvKc");
        setField(term1624, term1624.getClass(), "name", "XPKmummaqg");
        setField(term1624, term1624.getClass(), "address", "BKLfkLiZTH");
        setField(term1624, term1624.getClass(), "phone", "SPpkrGcPRr");
        setField(term1624, term1624.getClass(), "country", "sEccwbJKYE");
        setField(term1624, term1624.getClass(), "zipPostalCode", "AWRooQKkdW");
        setField(term1624, term1624.getClass(), "deviceId", "vjxIhXHxGR");
        setField(term1624, term1624.getClass(), "activationKey", "xOcJIiQQDu");
        setField(term1624, term1624.getClass(), "activationHash", "GVizqqzXpy");
        setField(term1624, term1624.getClass(), "dbKey", "JqXGgAhZPl");
        setField(term1624, term1624.getClass(), "passcode", "qxSDVejjiY");
        setLongField(term1624, term1624.getClass(), "timestamp", 1786470041588L);
        setLongField(term1624, term1624.getClass(), "activationTimestamp", 2535595959091595249L);
        setLongField(term1624, term1624.getClass(), "approver", -5476826692763582090L);
        setField(term1624, term1624.getClass(), "licenceId", "DfISiziTgG");
        setLongField(term1624, term1624.getClass(), "expiryTimestamp", -872011222785455006L);
        setField(term1624, term1624.getClass(), "plan", "QXzGXbEXMu");
        setBooleanField(term1624, term1624.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "setActivationHash", argTypes, term1624, args);
    }

};


