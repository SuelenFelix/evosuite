package com.coreoz.windmill.imports;

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
import static com.coreoz.windmill.imports.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class FileSchema_columnExists_20175402201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785;

    public FileSchema_columnExists_20175402201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term786 = new ArrayList();
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        ((ArrayList) term786).add((Object)null);
        HashMap term790 = new HashMap();
        term785 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term785, term785.getClass(), "firstRowCells", term786);
        setField(term785, term785.getClass(), "columnNameToColumnIndex", term790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.FileSchema");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "columnExists", argTypes, term785, args);
    }

};


