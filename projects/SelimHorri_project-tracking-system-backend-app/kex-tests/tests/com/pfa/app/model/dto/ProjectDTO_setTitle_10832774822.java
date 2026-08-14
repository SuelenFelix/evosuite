package com.pfa.app.model.dto;

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
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ProjectDTO_setTitle_10832774822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885;

    public ProjectDTO_setTitle_10832774822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term934 = new ArrayList();
        ((ArrayList) term934).add("UlajhuVLaP");
        ((ArrayList) term934).add("gGSMzuGICf");
        ((ArrayList) term934).add("hxCBltsObl");
        ((ArrayList) term934).add("BndsHwAFMv");
        ((ArrayList) term934).add("GzFkzHGYFt");
        ((ArrayList) term934).add("tShwQLRGNe");
        ((ArrayList) term934).add("LvtrsXUliU");
        term885 = newInstance(Class.forName("com.pfa.app.model.dto.ProjectDTO"));
        setField(term885, term885.getClass(), "title", "IDCWpPLRkE");
        setField(term885, term885.getClass(), "startDate", "nyiiPDVjAc");
        setField(term885, term885.getClass(), "endDate", "aKnKipADSo");
        setField(term885, term885.getClass(), "status", "wSQxaModmm");
        setField(term885, term885.getClass(), "assignedEmployees", term934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.ProjectDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setTitle", argTypes, term885, args);
    }

};


