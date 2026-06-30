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

public class Response_getStatus_4888801003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public Response_getStatus_4888801003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term90 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term88, term88.getClass(), "formattedAddress", "");
        setField(term90, term90.getClass(), "location", null);
        setField(term88, term88.getClass(), "geometry", term90);
        Object term91 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term93 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term91, term91.getClass(), "formattedAddress", "");
        setField(term93, term93.getClass(), "location", null);
        setField(term91, term91.getClass(), "geometry", term93);
        Object term94 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term96 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term94, term94.getClass(), "formattedAddress", "");
        setField(term96, term96.getClass(), "location", null);
        setField(term94, term94.getClass(), "geometry", term96);
        Object term97 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term99 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term97, term97.getClass(), "formattedAddress", "");
        setField(term99, term99.getClass(), "location", null);
        setField(term97, term97.getClass(), "geometry", term99);
        ArrayList term86 = new ArrayList();
        ((ArrayList) term86).add(term88);
        ((ArrayList) term86).add(term91);
        ((ArrayList) term86).add(term94);
        ((ArrayList) term86).add(term97);
        term85 = newInstance(Class.forName("com.oreilly.quest.json.Response"));
        setField(term85, term85.getClass(), "results", term86);
        setField(term85, term85.getClass(), "status", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Response");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term85, args);
    }

};


