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

public class HostToDomainGraph_Domain_compareTo_4612727837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7382;
     Object term7427;

    public HostToDomainGraph_Domain_compareTo_4612727837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7411 = new Long(-8033714905181142681L);
        Long term7413 = new Long(-9040825890007374809L);
        Long term7415 = new Long(1368340889161782793L);
        Long term7417 = new Long(-5786861555969446503L);
        Long term7419 = new Long(2354625302846375590L);
        Long term7421 = new Long(7276637106827860087L);
        Long term7423 = new Long(-3936701866695933852L);
        ArrayList term7409 = new ArrayList();
        ((ArrayList) term7409).add(term7411);
        ((ArrayList) term7409).add(term7413);
        ((ArrayList) term7409).add(term7415);
        ((ArrayList) term7409).add(term7417);
        ((ArrayList) term7409).add(term7419);
        ((ArrayList) term7409).add(term7421);
        ((ArrayList) term7409).add(term7423);
        term7382 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7382, term7382.getClass(), "name", "TimdotUuNC");
        setField(term7382, term7382.getClass(), "revName", "PkWMRdJcBb");
        setLongField(term7382, term7382.getClass(), "id", 8621736372873134417L);
        setLongField(term7382, term7382.getClass(), "numberOfHosts", 5106927272042726665L);
        setField(term7382, term7382.getClass(), "ids", term7409);
        Long term7456 = new Long(1215116475929634177L);
        Long term7458 = new Long(1597484336218508869L);
        Long term7460 = new Long(-685023850445639859L);
        Long term7462 = new Long(-6950146046121430355L);
        Long term7464 = new Long(1667122142089513324L);
        Long term7466 = new Long(-6342139649364011743L);
        Long term7468 = new Long(-4924950707540628022L);
        Long term7470 = new Long(-4393710401270724527L);
        ArrayList term7454 = new ArrayList();
        ((ArrayList) term7454).add(term7456);
        ((ArrayList) term7454).add(term7458);
        ((ArrayList) term7454).add(term7460);
        ((ArrayList) term7454).add(term7462);
        ((ArrayList) term7454).add(term7464);
        ((ArrayList) term7454).add(term7466);
        ((ArrayList) term7454).add(term7468);
        ((ArrayList) term7454).add(term7470);
        term7427 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7427, term7427.getClass(), "name", "jSpAteRute");
        setField(term7427, term7427.getClass(), "revName", "swZVeJAxjt");
        setLongField(term7427, term7427.getClass(), "id", 6913945762720683253L);
        setLongField(term7427, term7427.getClass(), "numberOfHosts", -7873197993099724563L);
        setField(term7427, term7427.getClass(), "ids", term7454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[1];
        args[0] = term7427;
        callMethod(klass, "compareTo", argTypes, term7382, args);
    }

};


