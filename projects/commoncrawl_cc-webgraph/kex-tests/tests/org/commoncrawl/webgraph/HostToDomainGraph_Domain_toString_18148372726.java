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

public class HostToDomainGraph_Domain_toString_18148372726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7315;

    public HostToDomainGraph_Domain_toString_18148372726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7344 = new Long(3133860696238261492L);
        Long term7346 = new Long(7247160664318067468L);
        Long term7348 = new Long(2135754395358000892L);
        Long term7350 = new Long(-8085190702504231560L);
        Long term7352 = new Long(1672578078364590450L);
        Long term7354 = new Long(4949335493504695457L);
        Long term7356 = new Long(-5216789073301458893L);
        Long term7358 = new Long(-1832940336320585644L);
        ArrayList term7342 = new ArrayList();
        ((ArrayList) term7342).add(term7344);
        ((ArrayList) term7342).add(term7346);
        ((ArrayList) term7342).add(term7348);
        ((ArrayList) term7342).add(term7350);
        ((ArrayList) term7342).add(term7352);
        ((ArrayList) term7342).add(term7354);
        ((ArrayList) term7342).add(term7356);
        ((ArrayList) term7342).add(term7358);
        term7315 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7315, term7315.getClass(), "name", "LvJFtLBaxj");
        setField(term7315, term7315.getClass(), "revName", "PHvxnGHptP");
        setLongField(term7315, term7315.getClass(), "id", -4773031420684190217L);
        setLongField(term7315, term7315.getClass(), "numberOfHosts", 4815723481405472054L);
        setField(term7315, term7315.getClass(), "ids", term7342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7315, args);
    }

};


