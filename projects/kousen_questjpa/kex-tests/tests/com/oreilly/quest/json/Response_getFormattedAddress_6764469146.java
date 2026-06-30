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

public class Response_getFormattedAddress_6764469146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;

    public Response_getFormattedAddress_6764469146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term218 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term220 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term218, term218.getClass(), "formattedAddress", "");
        setField(term220, term220.getClass(), "location", null);
        setField(term218, term218.getClass(), "geometry", term220);
        Object term221 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term223 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term221, term221.getClass(), "formattedAddress", "");
        setField(term223, term223.getClass(), "location", null);
        setField(term221, term221.getClass(), "geometry", term223);
        Object term224 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term226 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term224, term224.getClass(), "formattedAddress", "");
        setField(term226, term226.getClass(), "location", null);
        setField(term224, term224.getClass(), "geometry", term226);
        Object term227 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term229 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term227, term227.getClass(), "formattedAddress", "");
        setField(term229, term229.getClass(), "location", null);
        setField(term227, term227.getClass(), "geometry", term229);
        Object term230 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term232 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term230, term230.getClass(), "formattedAddress", "");
        setField(term232, term232.getClass(), "location", null);
        setField(term230, term230.getClass(), "geometry", term232);
        Object term233 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term235 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term233, term233.getClass(), "formattedAddress", "");
        setField(term235, term235.getClass(), "location", null);
        setField(term233, term233.getClass(), "geometry", term235);
        Object term236 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term238 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term236, term236.getClass(), "formattedAddress", "");
        setField(term238, term238.getClass(), "location", null);
        setField(term236, term236.getClass(), "geometry", term238);
        Object term239 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term241 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term239, term239.getClass(), "formattedAddress", "");
        setField(term241, term241.getClass(), "location", null);
        setField(term239, term239.getClass(), "geometry", term241);
        Object term242 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term244 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term242, term242.getClass(), "formattedAddress", "");
        setField(term244, term244.getClass(), "location", null);
        setField(term242, term242.getClass(), "geometry", term244);
        ArrayList term216 = new ArrayList();
        ((ArrayList) term216).add(term218);
        ((ArrayList) term216).add(term221);
        ((ArrayList) term216).add(term224);
        ((ArrayList) term216).add(term227);
        ((ArrayList) term216).add(term230);
        ((ArrayList) term216).add(term233);
        ((ArrayList) term216).add(term236);
        ((ArrayList) term216).add(term239);
        ((ArrayList) term216).add(term242);
        term215 = newInstance(Class.forName("com.oreilly.quest.json.Response"));
        setField(term215, term215.getClass(), "results", term216);
        setField(term215, term215.getClass(), "status", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Response");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormattedAddress", argTypes, term215, args);
    }

};


