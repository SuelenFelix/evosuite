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

public class HostToDomainGraph_Domain_isSafeToOutput_9937229998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7910;

    public HostToDomainGraph_Domain_isSafeToOutput_9937229998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7939 = new Long(-4822736661741380518L);
        Long term7941 = new Long(-5386201758403679145L);
        ArrayList term7937 = new ArrayList();
        ((ArrayList) term7937).add(term7939);
        ((ArrayList) term7937).add(term7941);
        term7910 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7910, term7910.getClass(), "name", "fztQhjqwdP");
        setField(term7910, term7910.getClass(), "revName", "eVpkWxjuki");
        setLongField(term7910, term7910.getClass(), "id", -4539648422466320845L);
        setLongField(term7910, term7910.getClass(), "numberOfHosts", 369988508829037253L);
        setField(term7910, term7910.getClass(), "ids", term7937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        callMethod(klass, "isSafeToOutput", argTypes, term7910, args);
    }

};


