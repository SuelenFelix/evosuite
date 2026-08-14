package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeSet1_init_4800806473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10481;

    public EdgeSet1_init_4800806473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term10487 = new Double(0.1882701721081318);
        Double term10489 = new Double(0.20230843747579808);
        Double term10491 = new Double(0.4995447078885714);
        Double term10498 = new Double(0.19855958465701706);
        Double term10500 = new Double(0.6202418999768349);
        Double term10502 = new Double(0.9848907582209794);
        Double term10504 = new Double(0.9658751931880928);
        Double term10511 = new Double(0.6990187833274262);
        Double term10513 = new Double(0.6970994777067232);
        Double term10515 = new Double(0.4309992370378436);
        Double term10522 = new Double(0.4228091725302011);
        Double term10524 = new Double(0.9148340457558121);
        Double term10526 = new Double(0.5671889474210299);
        Double term10528 = new Double(0.12331301462770328);
        Double term10540 = new Double(0.07338333983034873);
        Double term10542 = new Double(0.9205377491648612);
        term10481 = (Object[]) newArray("org.graph4j.Edge", 7);
        Object term10482 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10486 = (Object[]) newArray("java.lang.Double", 3);
        Object term10493 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10497 = (Object[]) newArray("java.lang.Double", 4);
        Object term10506 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10510 = (Object[]) newArray("java.lang.Double", 3);
        Object term10517 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10521 = (Object[]) newArray("java.lang.Double", 4);
        Object term10530 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10534 = (Object[]) newArray("java.lang.Double", 0);
        Object term10535 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10539 = (Object[]) newArray("java.lang.Double", 2);
        Object term10544 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term10548 = (Object[]) newArray("java.lang.Double", 0);
        setBooleanField(term10482, term10482.getClass(), "directed", true);
        setIntField(term10482, term10482.getClass(), "source", -86860026);
        setIntField(term10482, term10482.getClass(), "target", -444451515);
        setElement(term10486, 0, term10487);
        setElement(term10486, 1, term10489);
        setElement(term10486, 2, term10491);
        setField(term10482, term10482.getClass(), "data", term10486);
        setField(term10482, term10482.getClass(), "label", null);
        setElement(term10481, 0, term10482);
        setBooleanField(term10493, term10493.getClass(), "directed", true);
        setIntField(term10493, term10493.getClass(), "source", -545419660);
        setIntField(term10493, term10493.getClass(), "target", -1917689550);
        setElement(term10497, 0, term10498);
        setElement(term10497, 1, term10500);
        setElement(term10497, 2, term10502);
        setElement(term10497, 3, term10504);
        setField(term10493, term10493.getClass(), "data", term10497);
        setField(term10493, term10493.getClass(), "label", null);
        setElement(term10481, 1, term10493);
        setBooleanField(term10506, term10506.getClass(), "directed", true);
        setIntField(term10506, term10506.getClass(), "source", 1829428325);
        setIntField(term10506, term10506.getClass(), "target", -1881843694);
        setElement(term10510, 0, term10511);
        setElement(term10510, 1, term10513);
        setElement(term10510, 2, term10515);
        setField(term10506, term10506.getClass(), "data", term10510);
        setField(term10506, term10506.getClass(), "label", null);
        setElement(term10481, 2, term10506);
        setBooleanField(term10517, term10517.getClass(), "directed", true);
        setIntField(term10517, term10517.getClass(), "source", -1134250665);
        setIntField(term10517, term10517.getClass(), "target", -1607263638);
        setElement(term10521, 0, term10522);
        setElement(term10521, 1, term10524);
        setElement(term10521, 2, term10526);
        setElement(term10521, 3, term10528);
        setField(term10517, term10517.getClass(), "data", term10521);
        setField(term10517, term10517.getClass(), "label", null);
        setElement(term10481, 3, term10517);
        setBooleanField(term10530, term10530.getClass(), "directed", false);
        setIntField(term10530, term10530.getClass(), "source", 691469974);
        setIntField(term10530, term10530.getClass(), "target", -2080503799);
        setField(term10530, term10530.getClass(), "data", term10534);
        setField(term10530, term10530.getClass(), "label", null);
        setElement(term10481, 4, term10530);
        setBooleanField(term10535, term10535.getClass(), "directed", false);
        setIntField(term10535, term10535.getClass(), "source", 13757525);
        setIntField(term10535, term10535.getClass(), "target", 77853966);
        setElement(term10539, 0, term10540);
        setElement(term10539, 1, term10542);
        setField(term10535, term10535.getClass(), "data", term10539);
        setField(term10535, term10535.getClass(), "label", null);
        setElement(term10481, 5, term10535);
        setBooleanField(term10544, term10544.getClass(), "directed", true);
        setIntField(term10544, term10544.getClass(), "source", 1451393741);
        setIntField(term10544, term10544.getClass(), "target", -1115815564);
        setField(term10544, term10544.getClass(), "data", term10548);
        setField(term10544, term10544.getClass(), "label", null);
        setElement(term10481, 6, term10544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeSet1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10481;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


