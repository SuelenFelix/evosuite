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

public class Country_getCode_10760267722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5495;

    public Country_getCode_10760267722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5523 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5526 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5523, term5523.getClass(), "id", 1094107751);
        setField(term5523, term5523.getClass(), "name", "");
        setIntField(term5526, term5526.getClass(), "id", 844222656);
        setField(term5526, term5526.getClass(), "code", null);
        setField(term5526, term5526.getClass(), "name", null);
        setField(term5526, term5526.getClass(), "states", null);
        setField(term5523, term5523.getClass(), "country", term5526);
        Object term5528 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5531 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5528, term5528.getClass(), "id", -18216811);
        setField(term5528, term5528.getClass(), "name", "");
        setIntField(term5531, term5531.getClass(), "id", -1813280137);
        setField(term5531, term5531.getClass(), "code", null);
        setField(term5531, term5531.getClass(), "name", null);
        setField(term5531, term5531.getClass(), "states", null);
        setField(term5528, term5528.getClass(), "country", term5531);
        Object term5533 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5536 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5533, term5533.getClass(), "id", 719656595);
        setField(term5533, term5533.getClass(), "name", "");
        setIntField(term5536, term5536.getClass(), "id", -1516995753);
        setField(term5536, term5536.getClass(), "code", null);
        setField(term5536, term5536.getClass(), "name", null);
        setField(term5536, term5536.getClass(), "states", null);
        setField(term5533, term5533.getClass(), "country", term5536);
        Object term5538 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5541 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5538, term5538.getClass(), "id", 1116576792);
        setField(term5538, term5538.getClass(), "name", "");
        setIntField(term5541, term5541.getClass(), "id", -942194446);
        setField(term5541, term5541.getClass(), "code", null);
        setField(term5541, term5541.getClass(), "name", null);
        setField(term5541, term5541.getClass(), "states", null);
        setField(term5538, term5538.getClass(), "country", term5541);
        Object term5543 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5546 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5543, term5543.getClass(), "id", -1865023308);
        setField(term5543, term5543.getClass(), "name", "");
        setIntField(term5546, term5546.getClass(), "id", 0);
        setField(term5546, term5546.getClass(), "code", null);
        setField(term5546, term5546.getClass(), "name", null);
        setField(term5546, term5546.getClass(), "states", null);
        setField(term5543, term5543.getClass(), "country", term5546);
        Object term5548 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5551 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5548, term5548.getClass(), "id", -1553893255);
        setField(term5548, term5548.getClass(), "name", "");
        setIntField(term5551, term5551.getClass(), "id", 0);
        setField(term5551, term5551.getClass(), "code", null);
        setField(term5551, term5551.getClass(), "name", null);
        setField(term5551, term5551.getClass(), "states", null);
        setField(term5548, term5548.getClass(), "country", term5551);
        Object term5553 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5556 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5553, term5553.getClass(), "id", -390501023);
        setField(term5553, term5553.getClass(), "name", "");
        setIntField(term5556, term5556.getClass(), "id", -1667482829);
        setField(term5556, term5556.getClass(), "code", null);
        setField(term5556, term5556.getClass(), "name", null);
        setField(term5556, term5556.getClass(), "states", null);
        setField(term5553, term5553.getClass(), "country", term5556);
        ArrayList term5521 = new ArrayList();
        ((ArrayList) term5521).add(term5523);
        ((ArrayList) term5521).add(term5528);
        ((ArrayList) term5521).add(term5533);
        ((ArrayList) term5521).add(term5538);
        ((ArrayList) term5521).add(term5543);
        ((ArrayList) term5521).add(term5548);
        ((ArrayList) term5521).add(term5548);
        ((ArrayList) term5521).add(term5553);
        ((ArrayList) term5521).add(term5538);
        term5495 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5495, term5495.getClass(), "id", 1209799204);
        setField(term5495, term5495.getClass(), "code", "omWrkCSFzy");
        setField(term5495, term5495.getClass(), "name", "VFYvUTgYFB");
        setField(term5495, term5495.getClass(), "states", term5521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term5495, args);
    }

};


