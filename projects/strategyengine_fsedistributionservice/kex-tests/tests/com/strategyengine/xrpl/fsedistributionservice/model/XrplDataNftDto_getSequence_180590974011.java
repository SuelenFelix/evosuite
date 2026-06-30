package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class XrplDataNftDto_getSequence_180590974011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334858;

    public XrplDataNftDto_getSequence_180590974011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334895 = new Long(9219442829218784847L);
        Long term334897 = new Long(5153056225441125523L);
        Long term334899 = new Long(8082286259336326914L);
        Long term334901 = new Long(1093716108786896379L);
        term334858 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334858, term334858.getClass(), "nfTokenID", "ZXcuwiDFkz");
        setField(term334858, term334858.getClass(), "issuer", "OdQhbRFMKu");
        setField(term334858, term334858.getClass(), "owner", "pwniyUkqxT");
        setField(term334858, term334858.getClass(), "taxon", term334895);
        setField(term334858, term334858.getClass(), "transferFee", term334897);
        setField(term334858, term334858.getClass(), "flags", term334899);
        setField(term334858, term334858.getClass(), "sequence", term334901);
        setField(term334858, term334858.getClass(), "uri", "gtChMrVhZn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSequence", argTypes, term334858, args);
    }

};


