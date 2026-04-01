package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ParallelFilterKruskal_Partition_getsmallerOrEqualEdges_14499213041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176580;

    public ParallelFilterKruskal_Partition_getsmallerOrEqualEdges_14499213041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term176587 = new Double(0.9179531766325874);
        Double term176594 = new Double(0.597719880115361);
        Double term176601 = new Double(0.005470936246754432);
        Double term176603 = new Double(0.17195982256320275);
        Double term176605 = new Double(0.11126898186308964);
        Double term176607 = new Double(0.681430264554159);
        Double term176609 = new Double(0.46573041503205925);
        Double term176611 = new Double(0.09167150281178893);
        Double term176613 = new Double(0.4115016120459939);
        Double term176615 = new Double(0.19691299303820387);
        Double term176617 = new Double(0.9058223463648696);
        Double term176624 = new Double(0.9690354398363032);
        Double term176631 = new Double(0.5651964678223749);
        Double term176633 = new Double(0.9620063330736417);
        Double term176635 = new Double(0.015429109462961055);
        Double term176637 = new Double(0.7373472920319267);
        Double term176639 = new Double(0.259874837020144);
        Double term176641 = new Double(0.5402483278478812);
        Double term176648 = new Double(0.4910705232425474);
        Double term176650 = new Double(0.8150337968111547);
        Double term176652 = new Double(0.7428395028180956);
        Double term176654 = new Double(0.29518755168530775);
        Double term176656 = new Double(0.21164371972146157);
        Double term176658 = new Double(0.857570969464224);
        Double term176660 = new Double(0.12074825425916902);
        Double term176662 = new Double(0.6914485052452319);
        Double term176664 = new Double(0.015095856576399891);
        Double term176671 = new Double(0.5272292965117786);
        Double term176673 = new Double(0.1682330399882933);
        Double term176675 = new Double(0.2023232534278675);
        Double term176677 = new Double(0.8678854183083208);
        Double term176679 = new Double(0.045203068282183345);
        Double term176681 = new Double(0.1896627817010733);
        Double term176683 = new Double(0.8447942066877434);
        Double term176685 = new Double(0.13783436997284249);
        Double term176687 = new Double(0.27993800818718007);
        Double term176694 = new Double(0.8502175363691024);
        Double term176696 = new Double(0.9302748998234339);
        Double term176698 = new Double(0.7561679605464569);
        term176580 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition"));
        Object[] term176581 = (Object[]) newArray("org.graph4j.Edge", 8);
        Object term176582 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176586 = (Object[]) newArray("java.lang.Double", 1);
        Object term176589 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176593 = (Object[]) newArray("java.lang.Double", 1);
        Object term176596 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176600 = (Object[]) newArray("java.lang.Double", 9);
        Object term176619 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176623 = (Object[]) newArray("java.lang.Double", 1);
        Object term176626 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176630 = (Object[]) newArray("java.lang.Double", 6);
        Object term176643 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176647 = (Object[]) newArray("java.lang.Double", 9);
        Object term176666 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176670 = (Object[]) newArray("java.lang.Double", 9);
        Object term176689 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176693 = (Object[]) newArray("java.lang.Double", 3);
        Object[] term176700 = (Object[]) newArray("org.graph4j.Edge", 0);
        setBooleanField(term176582, term176582.getClass(), "directed", false);
        setIntField(term176582, term176582.getClass(), "source", 1911102460);
        setIntField(term176582, term176582.getClass(), "target", 1085923874);
        setElement(term176586, 0, term176587);
        setField(term176582, term176582.getClass(), "data", term176586);
        setField(term176582, term176582.getClass(), "label", null);
        setElement(term176581, 0, term176582);
        setBooleanField(term176589, term176589.getClass(), "directed", true);
        setIntField(term176589, term176589.getClass(), "source", 1190307242);
        setIntField(term176589, term176589.getClass(), "target", -1670819183);
        setElement(term176593, 0, term176594);
        setField(term176589, term176589.getClass(), "data", term176593);
        setField(term176589, term176589.getClass(), "label", null);
        setElement(term176581, 1, term176589);
        setBooleanField(term176596, term176596.getClass(), "directed", true);
        setIntField(term176596, term176596.getClass(), "source", -1201083699);
        setIntField(term176596, term176596.getClass(), "target", -2020481690);
        setElement(term176600, 0, term176601);
        setElement(term176600, 1, term176603);
        setElement(term176600, 2, term176605);
        setElement(term176600, 3, term176607);
        setElement(term176600, 4, term176609);
        setElement(term176600, 5, term176611);
        setElement(term176600, 6, term176613);
        setElement(term176600, 7, term176615);
        setElement(term176600, 8, term176617);
        setField(term176596, term176596.getClass(), "data", term176600);
        setField(term176596, term176596.getClass(), "label", null);
        setElement(term176581, 2, term176596);
        setBooleanField(term176619, term176619.getClass(), "directed", false);
        setIntField(term176619, term176619.getClass(), "source", 193516268);
        setIntField(term176619, term176619.getClass(), "target", 571417583);
        setElement(term176623, 0, term176624);
        setField(term176619, term176619.getClass(), "data", term176623);
        setField(term176619, term176619.getClass(), "label", null);
        setElement(term176581, 3, term176619);
        setBooleanField(term176626, term176626.getClass(), "directed", true);
        setIntField(term176626, term176626.getClass(), "source", 711409789);
        setIntField(term176626, term176626.getClass(), "target", 1873436293);
        setElement(term176630, 0, term176631);
        setElement(term176630, 1, term176633);
        setElement(term176630, 2, term176635);
        setElement(term176630, 3, term176637);
        setElement(term176630, 4, term176639);
        setElement(term176630, 5, term176641);
        setField(term176626, term176626.getClass(), "data", term176630);
        setField(term176626, term176626.getClass(), "label", null);
        setElement(term176581, 4, term176626);
        setBooleanField(term176643, term176643.getClass(), "directed", false);
        setIntField(term176643, term176643.getClass(), "source", -598476787);
        setIntField(term176643, term176643.getClass(), "target", -1019514375);
        setElement(term176647, 0, term176648);
        setElement(term176647, 1, term176650);
        setElement(term176647, 2, term176652);
        setElement(term176647, 3, term176654);
        setElement(term176647, 4, term176656);
        setElement(term176647, 5, term176658);
        setElement(term176647, 6, term176660);
        setElement(term176647, 7, term176662);
        setElement(term176647, 8, term176664);
        setField(term176643, term176643.getClass(), "data", term176647);
        setField(term176643, term176643.getClass(), "label", null);
        setElement(term176581, 5, term176643);
        setBooleanField(term176666, term176666.getClass(), "directed", false);
        setIntField(term176666, term176666.getClass(), "source", 100511139);
        setIntField(term176666, term176666.getClass(), "target", 342624715);
        setElement(term176670, 0, term176671);
        setElement(term176670, 1, term176673);
        setElement(term176670, 2, term176675);
        setElement(term176670, 3, term176677);
        setElement(term176670, 4, term176679);
        setElement(term176670, 5, term176681);
        setElement(term176670, 6, term176683);
        setElement(term176670, 7, term176685);
        setElement(term176670, 8, term176687);
        setField(term176666, term176666.getClass(), "data", term176670);
        setField(term176666, term176666.getClass(), "label", null);
        setElement(term176581, 6, term176666);
        setBooleanField(term176689, term176689.getClass(), "directed", true);
        setIntField(term176689, term176689.getClass(), "source", 606980555);
        setIntField(term176689, term176689.getClass(), "target", 174058193);
        setElement(term176693, 0, term176694);
        setElement(term176693, 1, term176696);
        setElement(term176693, 2, term176698);
        setField(term176689, term176689.getClass(), "data", term176693);
        setField(term176689, term176689.getClass(), "label", null);
        setElement(term176581, 7, term176689);
        setField(term176580, term176580.getClass(), "smallerOrEqualEdges", term176581);
        setField(term176580, term176580.getClass(), "biggerEdges", term176700);
        setDoubleField(term176580, term176580.getClass(), "exampleOfSmallerWeight", 0.34751446831938626);
        setField(term176580, term176580.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getsmallerOrEqualEdges", argTypes, term176580, args);
    }

};


