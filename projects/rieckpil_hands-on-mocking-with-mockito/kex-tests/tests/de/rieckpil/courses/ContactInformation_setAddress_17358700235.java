package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ContactInformation_setAddress_17358700235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875;
     Object term915;

    public ContactInformation_setAddress_17358700235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term913 = new Integer(597278769);
        term875 = newInstance(Class.forName("de.rieckpil.courses.ContactInformation"));
        Object term888 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term875, term875.getClass(), "email", "IDCWpPLRkE");
        setField(term888, term888.getClass(), "country", "nyiiPDVjAc");
        setField(term888, term888.getClass(), "city", "aKnKipADSo");
        setField(term888, term888.getClass(), "postalCode", term913);
        setField(term875, term875.getClass(), "address", term888);
        Integer term940 = new Integer(-1685132342);
        term915 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term915, term915.getClass(), "country", "wSQxaModmm");
        setField(term915, term915.getClass(), "city", "UlajhuVLaP");
        setField(term915, term915.getClass(), "postalCode", term940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.ContactInformation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.rieckpil.courses.Address");
        Object[] args = new Object[1];
        args[0] = term915;
        callMethod(klass, "setAddress", argTypes, term875, args);
    }

};


