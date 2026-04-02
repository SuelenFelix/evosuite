package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class HostToDomainGraph_Domain_add_20756615705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7252;
     Object term7293;

    public HostToDomainGraph_Domain_add_20756615705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7281 = new Long(846579494941632714L);
        Long term7283 = new Long(6689117472719450333L);
        Long term7285 = new Long(5836128569274066678L);
        Long term7287 = new Long(-2177368829816872572L);
        Long term7289 = new Long(-8463029266761149071L);
        ArrayList term7279 = new ArrayList();
        ((ArrayList) term7279).add(term7281);
        ((ArrayList) term7279).add(term7283);
        ((ArrayList) term7279).add(term7285);
        ((ArrayList) term7279).add(term7287);
        ((ArrayList) term7279).add(term7289);
        term7252 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7252, term7252.getClass(), "name", "bWWfajKbEX");
        setField(term7252, term7252.getClass(), "revName", "cAPeiZHKGJ");
        setLongField(term7252, term7252.getClass(), "id", 7190487627244901799L);
        setLongField(term7252, term7252.getClass(), "numberOfHosts", -5577824208081701355L);
        setField(term7252, term7252.getClass(), "ids", term7279);
        term7293 = new Long(4003767587571884508L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7293;
        callMethod(klass, "add", argTypes, term7252, args);
    }

};


