package com.oreilly.quest.json;

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
import static com.oreilly.quest.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Response_setResults_18067327092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term72;

    public Response_setResults_18067327092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term48 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term46, term46.getClass(), "formattedAddress", "");
        setField(term48, term48.getClass(), "location", null);
        setField(term46, term46.getClass(), "geometry", term48);
        Object term49 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term51 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term49, term49.getClass(), "formattedAddress", "");
        setField(term51, term51.getClass(), "location", null);
        setField(term49, term49.getClass(), "geometry", term51);
        Object term52 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term54 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term52, term52.getClass(), "formattedAddress", "");
        setField(term54, term54.getClass(), "location", null);
        setField(term52, term52.getClass(), "geometry", term54);
        Object term55 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term57 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term55, term55.getClass(), "formattedAddress", "");
        setField(term57, term57.getClass(), "location", null);
        setField(term55, term55.getClass(), "geometry", term57);
        ArrayList term44 = new ArrayList();
        ((ArrayList) term44).add(term46);
        ((ArrayList) term44).add(term49);
        ((ArrayList) term44).add(term52);
        ((ArrayList) term44).add(term55);
        term43 = newInstance(Class.forName("com.oreilly.quest.json.Response"));
        setField(term43, term43.getClass(), "results", term44);
        setField(term43, term43.getClass(), "status", "NRdvgJlhkX");
        term72 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Response");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term72;
        callMethod(klass, "setResults", argTypes, term43, args);
    }

};


