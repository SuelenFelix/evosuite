package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Country_getName_7737672863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5580;

    public Country_getName_7737672863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5608 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5611 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5608, term5608.getClass(), "id", 794568325);
        setField(term5608, term5608.getClass(), "name", "");
        setIntField(term5611, term5611.getClass(), "id", -434468428);
        setField(term5611, term5611.getClass(), "code", null);
        setField(term5611, term5611.getClass(), "name", null);
        setField(term5611, term5611.getClass(), "states", null);
        setField(term5608, term5608.getClass(), "country", term5611);
        Object term5613 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5616 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5613, term5613.getClass(), "id", -1148142995);
        setField(term5613, term5613.getClass(), "name", "");
        setIntField(term5616, term5616.getClass(), "id", 0);
        setField(term5616, term5616.getClass(), "code", null);
        setField(term5616, term5616.getClass(), "name", null);
        setField(term5616, term5616.getClass(), "states", null);
        setField(term5613, term5613.getClass(), "country", term5616);
        Object term5618 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5621 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5618, term5618.getClass(), "id", -1938881385);
        setField(term5618, term5618.getClass(), "name", "");
        setIntField(term5621, term5621.getClass(), "id", -1629418973);
        setField(term5621, term5621.getClass(), "code", null);
        setField(term5621, term5621.getClass(), "name", null);
        setField(term5621, term5621.getClass(), "states", null);
        setField(term5618, term5618.getClass(), "country", term5621);
        Object term5623 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5626 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5623, term5623.getClass(), "id", -350454594);
        setField(term5623, term5623.getClass(), "name", "");
        setIntField(term5626, term5626.getClass(), "id", 0);
        setField(term5626, term5626.getClass(), "code", null);
        setField(term5626, term5626.getClass(), "name", null);
        setField(term5626, term5626.getClass(), "states", null);
        setField(term5623, term5623.getClass(), "country", term5626);
        ArrayList term5606 = new ArrayList();
        ((ArrayList) term5606).add(term5608);
        ((ArrayList) term5606).add(term5613);
        ((ArrayList) term5606).add(term5618);
        ((ArrayList) term5606).add(term5623);
        term5580 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5580, term5580.getClass(), "id", 1303442927);
        setField(term5580, term5580.getClass(), "code", "FKDqHRpMcc");
        setField(term5580, term5580.getClass(), "name", "mIRMQIxHUD");
        setField(term5580, term5580.getClass(), "states", term5606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5580, args);
    }

};


