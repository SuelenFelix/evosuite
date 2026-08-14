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
     Object term7778;
     Object term7823;

    public HostToDomainGraph_Domain_compareTo_4612727837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7807 = new Long(-8033714905181142681L);
        Long term7809 = new Long(-9040825890007374809L);
        Long term7811 = new Long(1368340889161782793L);
        Long term7813 = new Long(-5786861555969446503L);
        Long term7815 = new Long(2354625302846375590L);
        Long term7817 = new Long(7276637106827860087L);
        Long term7819 = new Long(-3936701866695933852L);
        ArrayList term7805 = new ArrayList();
        ((ArrayList) term7805).add(term7807);
        ((ArrayList) term7805).add(term7809);
        ((ArrayList) term7805).add(term7811);
        ((ArrayList) term7805).add(term7813);
        ((ArrayList) term7805).add(term7815);
        ((ArrayList) term7805).add(term7817);
        ((ArrayList) term7805).add(term7819);
        term7778 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7778, term7778.getClass(), "name", "qxSDVejjiY");
        setField(term7778, term7778.getClass(), "revName", "xBsXSDjXYK");
        setLongField(term7778, term7778.getClass(), "id", 8621736372873134417L);
        setLongField(term7778, term7778.getClass(), "numberOfHosts", 5106927272042726665L);
        setField(term7778, term7778.getClass(), "ids", term7805);
        Long term7852 = new Long(1215116475929634177L);
        Long term7854 = new Long(1597484336218508869L);
        Long term7856 = new Long(-685023850445639859L);
        Long term7858 = new Long(-6950146046121430355L);
        Long term7860 = new Long(1667122142089513324L);
        Long term7862 = new Long(-6342139649364011743L);
        Long term7864 = new Long(-4924950707540628022L);
        Long term7866 = new Long(-4393710401270724527L);
        ArrayList term7850 = new ArrayList();
        ((ArrayList) term7850).add(term7852);
        ((ArrayList) term7850).add(term7854);
        ((ArrayList) term7850).add(term7856);
        ((ArrayList) term7850).add(term7858);
        ((ArrayList) term7850).add(term7860);
        ((ArrayList) term7850).add(term7862);
        ((ArrayList) term7850).add(term7864);
        ((ArrayList) term7850).add(term7866);
        term7823 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term7823, term7823.getClass(), "name", "sEnIVFtZuQ");
        setField(term7823, term7823.getClass(), "revName", "ZVecLZMLHF");
        setLongField(term7823, term7823.getClass(), "id", 6913945762720683253L);
        setLongField(term7823, term7823.getClass(), "numberOfHosts", -7873197993099724563L);
        setField(term7823, term7823.getClass(), "ids", term7850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[1];
        args[0] = term7823;
        callMethod(klass, "compareTo", argTypes, term7778, args);
    }

};


