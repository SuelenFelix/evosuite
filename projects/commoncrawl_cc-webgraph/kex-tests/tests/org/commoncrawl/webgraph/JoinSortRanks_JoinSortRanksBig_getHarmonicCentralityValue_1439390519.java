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
import java.lang.Object;
import java.lang.Long;

public class JoinSortRanks_JoinSortRanksBig_getHarmonicCentralityValue_1439390519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5843;
     Object term5935;

    public JoinSortRanks_JoinSortRanksBig_getHarmonicCentralityValue_1439390519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5843 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term5844 = (Object[]) newArray("[F", 2);
        float[] term5845 = (float[]) newFloatArray(1);
        float[] term5847 = (float[]) newFloatArray(0);
        Object[] term5848 = (Object[]) newArray("[D", 2);
        double[] term5849 = (double[]) newDoubleArray(5);
        double[] term5855 = (double[]) newDoubleArray(2);
        Object[] term5858 = (Object[]) newArray("[J", 0);
        Object[] term5859 = (Object[]) newArray("[J", 5);
        long[] term5860 = (long[]) newLongArray(4);
        long[] term5865 = (long[]) newLongArray(3);
        long[] term5869 = (long[]) newLongArray(5);
        long[] term5875 = (long[]) newLongArray(9);
        long[] term5885 = (long[]) newLongArray(3);
        Object[] term5889 = (Object[]) newArray("[J", 5);
        long[] term5890 = (long[]) newLongArray(0);
        long[] term5891 = (long[]) newLongArray(1);
        long[] term5893 = (long[]) newLongArray(0);
        long[] term5894 = (long[]) newLongArray(6);
        long[] term5901 = (long[]) newLongArray(7);
        float[] term5909 = (float[]) newFloatArray(5);
        double[] term5915 = (double[]) newDoubleArray(8);
        int[] term5924 = (int[]) newIntArray(2);
        int[] term5927 = (int[]) newIntArray(4);
        int[] term5932 = (int[]) newIntArray(2);
        setFloatElement(term5845, 0, 0.62323177F);
        setElement(term5844, 0, term5845);
        setElement(term5844, 1, term5847);
        setField(term5843, term5843.getClass(), "harmonicCentralityValues", term5844);
        setDoubleElement(term5849, 0, 0.6428742553484879);
        setDoubleElement(term5849, 1, 0.6584165706677267);
        setDoubleElement(term5849, 2, 0.44268490778872205);
        setDoubleElement(term5849, 3, 0.7507333108648018);
        setDoubleElement(term5849, 4, 0.007493740494434409);
        setElement(term5848, 0, term5849);
        setDoubleElement(term5855, 0, 0.29172553321356776);
        setDoubleElement(term5855, 1, 0.9276995636844321);
        setElement(term5848, 1, term5855);
        setField(term5843, term5843.getClass(), "pageRankValues", term5848);
        setField(term5843, term5843.getClass(), "harmonicCentralityRanks", term5858);
        setLongElement(term5860, 0, 493557348274366095L);
        setLongElement(term5860, 1, 8699742215739444902L);
        setLongElement(term5860, 2, 8261619652909874476L);
        setLongElement(term5860, 3, -3692936312179064102L);
        setElement(term5859, 0, term5860);
        setLongElement(term5865, 0, 5498944509671266637L);
        setLongElement(term5865, 1, -6838909359433858599L);
        setLongElement(term5865, 2, 4947643967691976731L);
        setElement(term5859, 1, term5865);
        setLongElement(term5869, 0, 4548576710115075073L);
        setLongElement(term5869, 1, -1486519351300660432L);
        setLongElement(term5869, 2, 4777103307547199454L);
        setLongElement(term5869, 3, 6462632207326555041L);
        setLongElement(term5869, 4, -3188913050877092148L);
        setElement(term5859, 2, term5869);
        setLongElement(term5875, 0, -6759247883224780481L);
        setLongElement(term5875, 1, -3724162247917461536L);
        setLongElement(term5875, 2, 7893661350133453338L);
        setLongElement(term5875, 3, 9056245012917372169L);
        setLongElement(term5875, 4, 7848004402682338886L);
        setLongElement(term5875, 5, 8931772176819893873L);
        setLongElement(term5875, 6, -4370635295110591519L);
        setLongElement(term5875, 7, -1325109462577461208L);
        setLongElement(term5875, 8, -7181112149072926893L);
        setElement(term5859, 3, term5875);
        setLongElement(term5885, 0, -5850316381591949820L);
        setLongElement(term5885, 1, 5857854340777182167L);
        setLongElement(term5885, 2, 3660520943100987842L);
        setElement(term5859, 4, term5885);
        setField(term5843, term5843.getClass(), "pageRankRanks", term5859);
        setElement(term5889, 0, term5890);
        setLongElement(term5891, 0, -8211240904293846981L);
        setElement(term5889, 1, term5891);
        setElement(term5889, 2, term5893);
        setLongElement(term5894, 0, 3535528164828723056L);
        setLongElement(term5894, 1, 4036794646678680547L);
        setLongElement(term5894, 2, 4006388896509492239L);
        setLongElement(term5894, 3, -6314099457945626605L);
        setLongElement(term5894, 4, -8697239524885136781L);
        setLongElement(term5894, 5, 6465539339431559532L);
        setElement(term5889, 3, term5894);
        setLongElement(term5901, 0, -5304831679802174866L);
        setLongElement(term5901, 1, 1909175111101717943L);
        setLongElement(term5901, 2, 8499930868919012909L);
        setLongElement(term5901, 3, 6252795312796363233L);
        setLongElement(term5901, 4, 3968143267572761057L);
        setLongElement(term5901, 5, 2712394591642260550L);
        setLongElement(term5901, 6, -1211273460223868511L);
        setElement(term5889, 4, term5901);
        setField(term5843, term5843.getClass(), "indirectSortPerm", term5889);
        setFloatElement(term5909, 0, 0.59315026F);
        setFloatElement(term5909, 1, 0.09037483F);
        setFloatElement(term5909, 2, 0.39231926F);
        setFloatElement(term5909, 3, 0.6561919F);
        setFloatElement(term5909, 4, 0.2958501F);
        setField(term5843, term5843.getClass(), "harmonicCentralityValues", term5909);
        setDoubleElement(term5915, 0, 0.7636130748477434);
        setDoubleElement(term5915, 1, 0.07901636960861558);
        setDoubleElement(term5915, 2, 0.18717846301066243);
        setDoubleElement(term5915, 3, 0.5335953039331021);
        setDoubleElement(term5915, 4, 0.5725602309856443);
        setDoubleElement(term5915, 5, 0.5310967137636303);
        setDoubleElement(term5915, 6, 0.6054109236809134);
        setDoubleElement(term5915, 7, 0.9165240441138934);
        setField(term5843, term5843.getClass(), "pageRankValues", term5915);
        setIntElement(term5924, 0, 1358829571);
        setIntElement(term5924, 1, 991356662);
        setField(term5843, term5843.getClass(), "harmonicCentralityRanks", term5924);
        setIntElement(term5927, 0, -506958186);
        setIntElement(term5927, 1, -507387516);
        setIntElement(term5927, 2, -1970452551);
        setIntElement(term5927, 3, -1896376975);
        setField(term5843, term5843.getClass(), "pageRankRanks", term5927);
        setIntElement(term5932, 0, 729658803);
        setIntElement(term5932, 1, 114754804);
        setField(term5843, term5843.getClass(), "indirectSortPerm", term5932);
        term5935 = new Long(-8172564209423941839L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5935;
        callMethod(klass, "getHarmonicCentralityValue", argTypes, term5843, args);
    }

};


