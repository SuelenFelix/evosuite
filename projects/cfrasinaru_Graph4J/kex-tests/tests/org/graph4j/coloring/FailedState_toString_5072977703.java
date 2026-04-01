package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class FailedState_toString_5072977703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4704;

    public FailedState_toString_5072977703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4708 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4710 = (int[]) newIntArray(4);
        int[] term4715 = (int[]) newIntArray(9);
        setIntField(term4708, term4708.getClass(), "vertex", 317372051);
        setIntElement(term4710, 0, 892170444);
        setIntElement(term4710, 1, -82417507);
        setIntElement(term4710, 2, -511400358);
        setIntElement(term4710, 3, -742178468);
        setField(term4708, term4708.getClass(), "values", term4710);
        setIntElement(term4715, 0, 694989162);
        setIntElement(term4715, 1, -65504209);
        setIntElement(term4715, 2, 1745199030);
        setIntElement(term4715, 3, -1440013173);
        setIntElement(term4715, 4, -288126597);
        setIntElement(term4715, 5, -218831961);
        setIntElement(term4715, 6, 826765055);
        setIntElement(term4715, 7, 1358117317);
        setIntElement(term4715, 8, 229989439);
        setField(term4708, term4708.getClass(), "positions", term4715);
        setIntField(term4708, term4708.getClass(), "size", -1620126913);
        Object term4726 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4728 = (int[]) newIntArray(6);
        int[] term4735 = (int[]) newIntArray(3);
        setIntField(term4726, term4726.getClass(), "vertex", -1095121979);
        setIntElement(term4728, 0, -1674851914);
        setIntElement(term4728, 1, -1891353352);
        setIntElement(term4728, 2, 113007640);
        setIntElement(term4728, 3, 1782226794);
        setIntElement(term4728, 4, 1115327577);
        setIntElement(term4728, 5, 840704993);
        setField(term4726, term4726.getClass(), "values", term4728);
        setIntElement(term4735, 0, 1297035285);
        setIntElement(term4735, 1, -826239685);
        setIntElement(term4735, 2, -845551243);
        setField(term4726, term4726.getClass(), "positions", term4735);
        setIntField(term4726, term4726.getClass(), "size", 370671198);
        Object term4740 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4742 = (int[]) newIntArray(3);
        int[] term4746 = (int[]) newIntArray(4);
        setIntField(term4740, term4740.getClass(), "vertex", 1426800646);
        setIntElement(term4742, 0, 954234820);
        setIntElement(term4742, 1, 1047346538);
        setIntElement(term4742, 2, 728436340);
        setField(term4740, term4740.getClass(), "values", term4742);
        setIntElement(term4746, 0, 1841731593);
        setIntElement(term4746, 1, -1854929057);
        setIntElement(term4746, 2, 1703814701);
        setIntElement(term4746, 3, 1370246522);
        setField(term4740, term4740.getClass(), "positions", term4746);
        setIntField(term4740, term4740.getClass(), "size", -574611924);
        Object term4752 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4754 = (int[]) newIntArray(2);
        int[] term4757 = (int[]) newIntArray(4);
        setIntField(term4752, term4752.getClass(), "vertex", 512521742);
        setIntElement(term4754, 0, 1291000976);
        setIntElement(term4754, 1, 1143522832);
        setField(term4752, term4752.getClass(), "values", term4754);
        setIntElement(term4757, 0, 40965975);
        setIntElement(term4757, 1, -194718582);
        setIntElement(term4757, 2, 42982854);
        setIntElement(term4757, 3, -1129506480);
        setField(term4752, term4752.getClass(), "positions", term4757);
        setIntField(term4752, term4752.getClass(), "size", 301438568);
        Object term4763 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4765 = (int[]) newIntArray(1);
        int[] term4767 = (int[]) newIntArray(6);
        setIntField(term4763, term4763.getClass(), "vertex", -1667908453);
        setIntElement(term4765, 0, 315910438);
        setField(term4763, term4763.getClass(), "values", term4765);
        setIntElement(term4767, 0, -1673157821);
        setIntElement(term4767, 1, 1217804703);
        setIntElement(term4767, 2, -1981494102);
        setIntElement(term4767, 3, -2064148945);
        setIntElement(term4767, 4, 494400151);
        setIntElement(term4767, 5, 1588058685);
        setField(term4763, term4763.getClass(), "positions", term4767);
        setIntField(term4763, term4763.getClass(), "size", 1677707412);
        Object term4775 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4777 = (int[]) newIntArray(8);
        int[] term4786 = (int[]) newIntArray(6);
        setIntField(term4775, term4775.getClass(), "vertex", -297367861);
        setIntElement(term4777, 0, -1133541490);
        setIntElement(term4777, 1, 942412391);
        setIntElement(term4777, 2, 751596480);
        setIntElement(term4777, 3, 1971485144);
        setIntElement(term4777, 4, 2059603512);
        setIntElement(term4777, 5, -1308902065);
        setIntElement(term4777, 6, 605255795);
        setIntElement(term4777, 7, 1743438307);
        setField(term4775, term4775.getClass(), "values", term4777);
        setIntElement(term4786, 0, -1122596893);
        setIntElement(term4786, 1, -2147297900);
        setIntElement(term4786, 2, 539095138);
        setIntElement(term4786, 3, 1462297654);
        setIntElement(term4786, 4, 1009915858);
        setIntElement(term4786, 5, 500127209);
        setField(term4775, term4775.getClass(), "positions", term4786);
        setIntField(term4775, term4775.getClass(), "size", -1482530168);
        Object term4794 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4796 = (int[]) newIntArray(8);
        int[] term4805 = (int[]) newIntArray(6);
        setIntField(term4794, term4794.getClass(), "vertex", -432987116);
        setIntElement(term4796, 0, 1483499310);
        setIntElement(term4796, 1, -1516568587);
        setIntElement(term4796, 2, 1537690170);
        setIntElement(term4796, 3, 1133116994);
        setIntElement(term4796, 4, -1195191239);
        setIntElement(term4796, 5, -470798982);
        setIntElement(term4796, 6, 1844345719);
        setIntElement(term4796, 7, 1704024265);
        setField(term4794, term4794.getClass(), "values", term4796);
        setIntElement(term4805, 0, 501801161);
        setIntElement(term4805, 1, 2103971768);
        setIntElement(term4805, 2, -939132796);
        setIntElement(term4805, 3, 159279866);
        setIntElement(term4805, 4, 138122227);
        setIntElement(term4805, 5, 1795358995);
        setField(term4794, term4794.getClass(), "positions", term4805);
        setIntField(term4794, term4794.getClass(), "size", -781185864);
        Object term4813 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4815 = (int[]) newIntArray(3);
        int[] term4819 = (int[]) newIntArray(9);
        setIntField(term4813, term4813.getClass(), "vertex", 340500914);
        setIntElement(term4815, 0, -2061712635);
        setIntElement(term4815, 1, 1182911731);
        setIntElement(term4815, 2, 644726932);
        setField(term4813, term4813.getClass(), "values", term4815);
        setIntElement(term4819, 0, -1515977761);
        setIntElement(term4819, 1, -1476037190);
        setIntElement(term4819, 2, -718204437);
        setIntElement(term4819, 3, 468974358);
        setIntElement(term4819, 4, 346282818);
        setIntElement(term4819, 5, -857876056);
        setIntElement(term4819, 6, 1392910876);
        setIntElement(term4819, 7, 1086383182);
        setIntElement(term4819, 8, 1425319286);
        setField(term4813, term4813.getClass(), "positions", term4819);
        setIntField(term4813, term4813.getClass(), "size", 1729919228);
        ArrayList term4706 = new ArrayList();
        ((ArrayList) term4706).add(term4708);
        ((ArrayList) term4706).add(term4726);
        ((ArrayList) term4706).add(term4740);
        ((ArrayList) term4706).add(term4752);
        ((ArrayList) term4706).add(term4763);
        ((ArrayList) term4706).add(term4775);
        ((ArrayList) term4706).add(term4794);
        ((ArrayList) term4706).add(term4813);
        term4704 = newInstance(Class.forName("org.graph4j.coloring.FailedState"));
        setIntField(term4704, term4704.getClass(), "vertex", -1042022818);
        setField(term4704, term4704.getClass(), "domains", term4706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.FailedState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4704, args);
    }

};


