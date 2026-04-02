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

public class Response_setStatus_13570337164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;

    public Response_setStatus_13570337164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term127 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term129 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term127, term127.getClass(), "formattedAddress", "");
        setField(term129, term129.getClass(), "location", null);
        setField(term127, term127.getClass(), "geometry", term129);
        Object term130 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term132 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term130, term130.getClass(), "formattedAddress", "");
        setField(term132, term132.getClass(), "location", null);
        setField(term130, term130.getClass(), "geometry", term132);
        Object term133 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term135 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term133, term133.getClass(), "formattedAddress", "");
        setField(term135, term135.getClass(), "location", null);
        setField(term133, term133.getClass(), "geometry", term135);
        Object term136 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term138 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term136, term136.getClass(), "formattedAddress", "");
        setField(term138, term138.getClass(), "location", null);
        setField(term136, term136.getClass(), "geometry", term138);
        Object term139 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term141 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term139, term139.getClass(), "formattedAddress", "");
        setField(term141, term141.getClass(), "location", null);
        setField(term139, term139.getClass(), "geometry", term141);
        ArrayList term125 = new ArrayList();
        ((ArrayList) term125).add(term127);
        ((ArrayList) term125).add(term130);
        ((ArrayList) term125).add(term133);
        ((ArrayList) term125).add(term136);
        ((ArrayList) term125).add(term139);
        term124 = newInstance(Class.forName("com.oreilly.quest.json.Response"));
        setField(term124, term124.getClass(), "results", term125);
        setField(term124, term124.getClass(), "status", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Response");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setStatus", argTypes, term124, args);
    }

};


