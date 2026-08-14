package com.usantatecla.ustumlserver.domain.services.reverseEngineering;

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
import static com.usantatecla.ustumlserver.domain.services.reverseEngineering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class RepositoryParser_parseDirectoryRelations_17863166493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term583;

    public RepositoryParser_parseDirectoryRelations_17863166493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term572 = new HashMap();
        term571 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser"));
        setField(term571, term571.getClass(), "memberPersistence", null);
        setField(term571, term571.getClass(), "classMap", term572);
        ArrayList term584 = new ArrayList();
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ((ArrayList) term584).add((Object)null);
        ArrayList term612 = new ArrayList();
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        ((ArrayList) term612).add((Object)null);
        term583 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term583, term583.getClass(), "members", term584);
        setField(term583, term583.getClass(), "id", "VGizxZnyHX");
        setField(term583, term583.getClass(), "name", "kVEZMHmRtR");
        setField(term583, term583.getClass(), "relations", term612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Object[] args = new Object[1];
        args[0] = term583;
        callMethod(klass, "parseDirectoryRelations", argTypes, term571, args);
    }

};


