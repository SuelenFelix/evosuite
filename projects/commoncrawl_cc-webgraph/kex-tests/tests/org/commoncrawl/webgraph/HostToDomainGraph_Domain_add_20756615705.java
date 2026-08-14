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
     Object term7648;
     Object term7689;

    public HostToDomainGraph_Domain_add_20756615705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7677 = new Long(846579494941632714L);
        Long term7679 = new Long(6689117472719450333L);
        Long term7681 = new Long(5836128569274066678L);
        Long term7683 = new Long(-2177368829816872572L);
        Long term7685 = new Long(-8463029266761149071L);
        ArrayList term7675 = new ArrayList();
        ((ArrayList) term7675).add(term7677);
        ((ArrayList) term7675).add(term7679);
        ((ArrayList) term7675).add(term7681);
        ((ArrayList) term7675).add(term7683);
        ((ArrayList) term7675).add(term7685);
        term7648 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7648, term7648.getClass(), "name", "sEccwbJKYE");
        setField(term7648, term7648.getClass(), "revName", "AWRooQKkdW");
        setLongField(term7648, term7648.getClass(), "id", 7190487627244901799L);
        setLongField(term7648, term7648.getClass(), "numberOfHosts", -5577824208081701355L);
        setField(term7648, term7648.getClass(), "ids", term7675);
        term7689 = new Long(4003767587571884508L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7689;
        callMethod(klass, "add", argTypes, term7648, args);
    }

};


