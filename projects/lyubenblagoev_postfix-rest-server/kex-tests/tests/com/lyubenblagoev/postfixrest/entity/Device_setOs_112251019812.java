package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Device_setOs_112251019812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2579;

    public Device_setOs_112251019812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2610 = new Long(4199886998224701110L);
        Object term2609 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2609, term2609.getClass(), "name", null);
        setField(term2609, term2609.getClass(), "users", null);
        setField(term2609, term2609.getClass(), "id", term2610);
        setBooleanField(term2609, term2609.getClass(), "enabled", false);
        setField(term2609, term2609.getClass(), "created", null);
        setField(term2609, term2609.getClass(), "updated", null);
        Object term2613 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2613, term2613.getClass(), "name", null);
        setField(term2613, term2613.getClass(), "users", null);
        setField(term2613, term2613.getClass(), "id", null);
        setBooleanField(term2613, term2613.getClass(), "enabled", false);
        setField(term2613, term2613.getClass(), "created", null);
        setField(term2613, term2613.getClass(), "updated", null);
        Long term2616 = new Long(8863790908271299748L);
        Object term2615 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2615, term2615.getClass(), "name", null);
        setField(term2615, term2615.getClass(), "users", null);
        setField(term2615, term2615.getClass(), "id", term2616);
        setBooleanField(term2615, term2615.getClass(), "enabled", false);
        setField(term2615, term2615.getClass(), "created", null);
        setField(term2615, term2615.getClass(), "updated", null);
        ArrayList term2607 = new ArrayList();
        ((ArrayList) term2607).add(term2609);
        ((ArrayList) term2607).add(term2613);
        ((ArrayList) term2607).add(term2615);
        Long term2621 = new Long(8540994973773607992L);
        Long term2678 = new Long(-2338103433822116635L);
        term2579 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term2580 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term2605 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term2624 = newInstance(Class.forName("java.util.Date"));
        Object term2626 = newInstance(Class.forName("java.util.Date"));
        Object term2640 = newInstance(Class.forName("java.util.Date"));
        Object term2681 = newInstance(Class.forName("java.util.Date"));
        Object term2683 = newInstance(Class.forName("java.util.Date"));
        setField(term2580, term2580.getClass(), "email", "RCOqfVsRHt");
        setField(term2580, term2580.getClass(), "password", "TSyCeEZPaT");
        setIntField(term2605, term2605.getClass(), "modCount", 0);
        setField(term2580, term2580.getClass(), "devices", term2605);
        setField(term2580, term2580.getClass(), "roles", term2607);
        setField(term2580, term2580.getClass(), "id", term2621);
        setBooleanField(term2580, term2580.getClass(), "enabled", true);
        setLongField(term2624, term2624.getClass(), "fastTime", 1518509835152L);
        setField(term2624, term2624.getClass(), "cdate", null);
        setField(term2580, term2580.getClass(), "created", term2624);
        setLongField(term2626, term2626.getClass(), "fastTime", 1502165750304L);
        setField(term2626, term2626.getClass(), "cdate", null);
        setField(term2580, term2580.getClass(), "updated", term2626);
        setField(term2579, term2579.getClass(), "user", term2580);
        setField(term2579, term2579.getClass(), "refreshToken", "ITRRYiuDwH");
        setLongField(term2640, term2640.getClass(), "fastTime", 1661785330901L);
        setField(term2640, term2640.getClass(), "cdate", null);
        setField(term2579, term2579.getClass(), "refreshTokenExpirationDate", term2640);
        setField(term2579, term2579.getClass(), "remoteAddress", "llRfwANcVF");
        setField(term2579, term2579.getClass(), "type", "sUEeHQTWkA");
        setField(term2579, term2579.getClass(), "os", "BDIRCxAWLA");
        setField(term2579, term2579.getClass(), "id", term2678);
        setBooleanField(term2579, term2579.getClass(), "enabled", true);
        setLongField(term2681, term2681.getClass(), "fastTime", 1306045012871L);
        setField(term2681, term2681.getClass(), "cdate", null);
        setField(term2579, term2579.getClass(), "created", term2681);
        setLongField(term2683, term2683.getClass(), "fastTime", 1368529552688L);
        setField(term2683, term2683.getClass(), "cdate", null);
        setField(term2579, term2579.getClass(), "updated", term2683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eOJfbiZLnb";
        callMethod(klass, "setOs", argTypes, term2579, args);
    }

};


