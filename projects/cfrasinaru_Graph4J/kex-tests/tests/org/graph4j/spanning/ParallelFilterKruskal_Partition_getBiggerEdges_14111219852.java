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

public class ParallelFilterKruskal_Partition_getBiggerEdges_14111219852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176702;

    public ParallelFilterKruskal_Partition_getBiggerEdges_14111219852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term176709 = new Double(0.5209802804504644);
        Double term176711 = new Double(0.9207633735590618);
        Double term176713 = new Double(0.09298942016632694);
        Double term176715 = new Double(0.2859849817939646);
        Double term176717 = new Double(0.8894268599576578);
        Double term176719 = new Double(0.565585875185362);
        Double term176721 = new Double(0.03779318824949496);
        Double term176733 = new Double(0.30209589705364337);
        Double term176735 = new Double(0.5440654951055184);
        Double term176742 = new Double(0.14286214124199725);
        Double term176744 = new Double(0.7353708254130928);
        Double term176746 = new Double(0.03111192135586105);
        Double term176748 = new Double(0.45655010517861594);
        Double term176750 = new Double(0.48482045717011024);
        Double term176752 = new Double(0.9851300497323685);
        Double term176754 = new Double(0.9008637272499149);
        Double term176756 = new Double(0.5494656497683192);
        Double term176763 = new Double(0.2778573549458433);
        Double term176765 = new Double(0.364742642638476);
        Double term176767 = new Double(0.5046731202666013);
        Double term176769 = new Double(0.41789372444987694);
        Double term176771 = new Double(0.4724521607999692);
        Double term176784 = new Double(0.5901668631231362);
        Double term176786 = new Double(0.498696785747182);
        Double term176788 = new Double(0.6880984307088692);
        Double term176790 = new Double(0.6185397594448453);
        Double term176792 = new Double(0.22111842163296969);
        Double term176794 = new Double(0.1195064752999121);
        Double term176796 = new Double(0.3062097253248144);
        Double term176798 = new Double(0.6440717276693121);
        Double term176805 = new Double(0.4643397981098296);
        Double term176807 = new Double(0.33426525324029355);
        Double term176809 = new Double(0.6952891754318307);
        Double term176811 = new Double(0.8728173433132734);
        Double term176813 = new Double(0.55065052163711);
        Double term176815 = new Double(0.1173046014260748);
        Double term176822 = new Double(0.7709210090978859);
        Double term176824 = new Double(0.012025593265189927);
        Double term176826 = new Double(0.7916439781053174);
        Double term176828 = new Double(0.984602746848723);
        term176702 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition"));
        Object[] term176703 = (Object[]) newArray("org.graph4j.Edge", 5);
        Object term176704 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176708 = (Object[]) newArray("java.lang.Double", 7);
        Object term176723 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176727 = (Object[]) newArray("java.lang.Double", 0);
        Object term176728 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176732 = (Object[]) newArray("java.lang.Double", 2);
        Object term176737 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176741 = (Object[]) newArray("java.lang.Double", 8);
        Object term176758 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176762 = (Object[]) newArray("java.lang.Double", 5);
        Object[] term176773 = (Object[]) newArray("org.graph4j.Edge", 4);
        Object term176774 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176778 = (Object[]) newArray("java.lang.Double", 0);
        Object term176779 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176783 = (Object[]) newArray("java.lang.Double", 8);
        Object term176800 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176804 = (Object[]) newArray("java.lang.Double", 6);
        Object term176817 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term176821 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term176704, term176704.getClass(), "directed", false);
        setIntField(term176704, term176704.getClass(), "source", 1472875698);
        setIntField(term176704, term176704.getClass(), "target", -922608073);
        setElement(term176708, 0, term176709);
        setElement(term176708, 1, term176711);
        setElement(term176708, 2, term176713);
        setElement(term176708, 3, term176715);
        setElement(term176708, 4, term176717);
        setElement(term176708, 5, term176719);
        setElement(term176708, 6, term176721);
        setField(term176704, term176704.getClass(), "data", term176708);
        setField(term176704, term176704.getClass(), "label", null);
        setElement(term176703, 0, term176704);
        setBooleanField(term176723, term176723.getClass(), "directed", true);
        setIntField(term176723, term176723.getClass(), "source", 1940335911);
        setIntField(term176723, term176723.getClass(), "target", -1172989180);
        setField(term176723, term176723.getClass(), "data", term176727);
        setField(term176723, term176723.getClass(), "label", null);
        setElement(term176703, 1, term176723);
        setBooleanField(term176728, term176728.getClass(), "directed", false);
        setIntField(term176728, term176728.getClass(), "source", 1562933904);
        setIntField(term176728, term176728.getClass(), "target", 1623579777);
        setElement(term176732, 0, term176733);
        setElement(term176732, 1, term176735);
        setField(term176728, term176728.getClass(), "data", term176732);
        setField(term176728, term176728.getClass(), "label", null);
        setElement(term176703, 2, term176728);
        setBooleanField(term176737, term176737.getClass(), "directed", true);
        setIntField(term176737, term176737.getClass(), "source", 1224848400);
        setIntField(term176737, term176737.getClass(), "target", 642825782);
        setElement(term176741, 0, term176742);
        setElement(term176741, 1, term176744);
        setElement(term176741, 2, term176746);
        setElement(term176741, 3, term176748);
        setElement(term176741, 4, term176750);
        setElement(term176741, 5, term176752);
        setElement(term176741, 6, term176754);
        setElement(term176741, 7, term176756);
        setField(term176737, term176737.getClass(), "data", term176741);
        setField(term176737, term176737.getClass(), "label", null);
        setElement(term176703, 3, term176737);
        setBooleanField(term176758, term176758.getClass(), "directed", true);
        setIntField(term176758, term176758.getClass(), "source", -1679555479);
        setIntField(term176758, term176758.getClass(), "target", 1495632478);
        setElement(term176762, 0, term176763);
        setElement(term176762, 1, term176765);
        setElement(term176762, 2, term176767);
        setElement(term176762, 3, term176769);
        setElement(term176762, 4, term176771);
        setField(term176758, term176758.getClass(), "data", term176762);
        setField(term176758, term176758.getClass(), "label", null);
        setElement(term176703, 4, term176758);
        setField(term176702, term176702.getClass(), "smallerOrEqualEdges", term176703);
        setBooleanField(term176774, term176774.getClass(), "directed", true);
        setIntField(term176774, term176774.getClass(), "source", 133673313);
        setIntField(term176774, term176774.getClass(), "target", 1936619005);
        setField(term176774, term176774.getClass(), "data", term176778);
        setField(term176774, term176774.getClass(), "label", null);
        setElement(term176773, 0, term176774);
        setBooleanField(term176779, term176779.getClass(), "directed", false);
        setIntField(term176779, term176779.getClass(), "source", 1603329727);
        setIntField(term176779, term176779.getClass(), "target", 619273729);
        setElement(term176783, 0, term176784);
        setElement(term176783, 1, term176786);
        setElement(term176783, 2, term176788);
        setElement(term176783, 3, term176790);
        setElement(term176783, 4, term176792);
        setElement(term176783, 5, term176794);
        setElement(term176783, 6, term176796);
        setElement(term176783, 7, term176798);
        setField(term176779, term176779.getClass(), "data", term176783);
        setField(term176779, term176779.getClass(), "label", null);
        setElement(term176773, 1, term176779);
        setBooleanField(term176800, term176800.getClass(), "directed", true);
        setIntField(term176800, term176800.getClass(), "source", -2023942130);
        setIntField(term176800, term176800.getClass(), "target", 1210878733);
        setElement(term176804, 0, term176805);
        setElement(term176804, 1, term176807);
        setElement(term176804, 2, term176809);
        setElement(term176804, 3, term176811);
        setElement(term176804, 4, term176813);
        setElement(term176804, 5, term176815);
        setField(term176800, term176800.getClass(), "data", term176804);
        setField(term176800, term176800.getClass(), "label", null);
        setElement(term176773, 2, term176800);
        setBooleanField(term176817, term176817.getClass(), "directed", false);
        setIntField(term176817, term176817.getClass(), "source", 1556003269);
        setIntField(term176817, term176817.getClass(), "target", -1780671003);
        setElement(term176821, 0, term176822);
        setElement(term176821, 1, term176824);
        setElement(term176821, 2, term176826);
        setElement(term176821, 3, term176828);
        setField(term176817, term176817.getClass(), "data", term176821);
        setField(term176817, term176817.getClass(), "label", null);
        setElement(term176773, 3, term176817);
        setField(term176702, term176702.getClass(), "biggerEdges", term176773);
        setDoubleField(term176702, term176702.getClass(), "exampleOfSmallerWeight", 0.20668419086135248);
        setField(term176702, term176702.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBiggerEdges", argTypes, term176702, args);
    }

};


