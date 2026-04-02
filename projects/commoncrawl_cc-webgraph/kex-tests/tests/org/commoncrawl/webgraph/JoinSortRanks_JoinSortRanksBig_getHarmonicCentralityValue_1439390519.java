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
     Object term5491;
     Object term5583;

    public JoinSortRanks_JoinSortRanksBig_getHarmonicCentralityValue_1439390519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5491 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term5492 = (Object[]) newArray("[F", 2);
        float[] term5493 = (float[]) newFloatArray(1);
        float[] term5495 = (float[]) newFloatArray(0);
        Object[] term5496 = (Object[]) newArray("[D", 2);
        double[] term5497 = (double[]) newDoubleArray(5);
        double[] term5503 = (double[]) newDoubleArray(2);
        Object[] term5506 = (Object[]) newArray("[J", 0);
        Object[] term5507 = (Object[]) newArray("[J", 5);
        long[] term5508 = (long[]) newLongArray(4);
        long[] term5513 = (long[]) newLongArray(3);
        long[] term5517 = (long[]) newLongArray(5);
        long[] term5523 = (long[]) newLongArray(9);
        long[] term5533 = (long[]) newLongArray(3);
        Object[] term5537 = (Object[]) newArray("[J", 5);
        long[] term5538 = (long[]) newLongArray(0);
        long[] term5539 = (long[]) newLongArray(1);
        long[] term5541 = (long[]) newLongArray(0);
        long[] term5542 = (long[]) newLongArray(6);
        long[] term5549 = (long[]) newLongArray(7);
        float[] term5557 = (float[]) newFloatArray(5);
        double[] term5563 = (double[]) newDoubleArray(8);
        int[] term5572 = (int[]) newIntArray(2);
        int[] term5575 = (int[]) newIntArray(4);
        int[] term5580 = (int[]) newIntArray(2);
        setFloatElement(term5493, 0, 0.62323177F);
        setElement(term5492, 0, term5493);
        setElement(term5492, 1, term5495);
        setField(term5491, term5491.getClass(), "harmonicCentralityValues", term5492);
        setDoubleElement(term5497, 0, 0.6428742553484879);
        setDoubleElement(term5497, 1, 0.6584165706677267);
        setDoubleElement(term5497, 2, 0.44268490778872205);
        setDoubleElement(term5497, 3, 0.7507333108648018);
        setDoubleElement(term5497, 4, 0.007493740494434409);
        setElement(term5496, 0, term5497);
        setDoubleElement(term5503, 0, 0.29172553321356776);
        setDoubleElement(term5503, 1, 0.9276995636844321);
        setElement(term5496, 1, term5503);
        setField(term5491, term5491.getClass(), "pageRankValues", term5496);
        setField(term5491, term5491.getClass(), "harmonicCentralityRanks", term5506);
        setLongElement(term5508, 0, 493557348274366095L);
        setLongElement(term5508, 1, 8699742215739444902L);
        setLongElement(term5508, 2, 8261619652909874476L);
        setLongElement(term5508, 3, -3692936312179064102L);
        setElement(term5507, 0, term5508);
        setLongElement(term5513, 0, 5498944509671266637L);
        setLongElement(term5513, 1, -6838909359433858599L);
        setLongElement(term5513, 2, 4947643967691976731L);
        setElement(term5507, 1, term5513);
        setLongElement(term5517, 0, 4548576710115075073L);
        setLongElement(term5517, 1, -1486519351300660432L);
        setLongElement(term5517, 2, 4777103307547199454L);
        setLongElement(term5517, 3, 6462632207326555041L);
        setLongElement(term5517, 4, -3188913050877092148L);
        setElement(term5507, 2, term5517);
        setLongElement(term5523, 0, -6759247883224780481L);
        setLongElement(term5523, 1, -3724162247917461536L);
        setLongElement(term5523, 2, 7893661350133453338L);
        setLongElement(term5523, 3, 9056245012917372169L);
        setLongElement(term5523, 4, 7848004402682338886L);
        setLongElement(term5523, 5, 8931772176819893873L);
        setLongElement(term5523, 6, -4370635295110591519L);
        setLongElement(term5523, 7, -1325109462577461208L);
        setLongElement(term5523, 8, -7181112149072926893L);
        setElement(term5507, 3, term5523);
        setLongElement(term5533, 0, -5850316381591949820L);
        setLongElement(term5533, 1, 5857854340777182167L);
        setLongElement(term5533, 2, 3660520943100987842L);
        setElement(term5507, 4, term5533);
        setField(term5491, term5491.getClass(), "pageRankRanks", term5507);
        setElement(term5537, 0, term5538);
        setLongElement(term5539, 0, -8211240904293846981L);
        setElement(term5537, 1, term5539);
        setElement(term5537, 2, term5541);
        setLongElement(term5542, 0, 3535528164828723056L);
        setLongElement(term5542, 1, 4036794646678680547L);
        setLongElement(term5542, 2, 4006388896509492239L);
        setLongElement(term5542, 3, -6314099457945626605L);
        setLongElement(term5542, 4, -8697239524885136781L);
        setLongElement(term5542, 5, 6465539339431559532L);
        setElement(term5537, 3, term5542);
        setLongElement(term5549, 0, -5304831679802174866L);
        setLongElement(term5549, 1, 1909175111101717943L);
        setLongElement(term5549, 2, 8499930868919012909L);
        setLongElement(term5549, 3, 6252795312796363233L);
        setLongElement(term5549, 4, 3968143267572761057L);
        setLongElement(term5549, 5, 2712394591642260550L);
        setLongElement(term5549, 6, -1211273460223868511L);
        setElement(term5537, 4, term5549);
        setField(term5491, term5491.getClass(), "indirectSortPerm", term5537);
        setFloatElement(term5557, 0, 0.59315026F);
        setFloatElement(term5557, 1, 0.09037483F);
        setFloatElement(term5557, 2, 0.39231926F);
        setFloatElement(term5557, 3, 0.6561919F);
        setFloatElement(term5557, 4, 0.2958501F);
        setField(term5491, term5491.getClass(), "harmonicCentralityValues", term5557);
        setDoubleElement(term5563, 0, 0.7636130748477434);
        setDoubleElement(term5563, 1, 0.07901636960861558);
        setDoubleElement(term5563, 2, 0.18717846301066243);
        setDoubleElement(term5563, 3, 0.5335953039331021);
        setDoubleElement(term5563, 4, 0.5725602309856443);
        setDoubleElement(term5563, 5, 0.5310967137636303);
        setDoubleElement(term5563, 6, 0.6054109236809134);
        setDoubleElement(term5563, 7, 0.9165240441138934);
        setField(term5491, term5491.getClass(), "pageRankValues", term5563);
        setIntElement(term5572, 0, 1358829571);
        setIntElement(term5572, 1, 991356662);
        setField(term5491, term5491.getClass(), "harmonicCentralityRanks", term5572);
        setIntElement(term5575, 0, -506958186);
        setIntElement(term5575, 1, -507387516);
        setIntElement(term5575, 2, -1970452551);
        setIntElement(term5575, 3, -1896376975);
        setField(term5491, term5491.getClass(), "pageRankRanks", term5575);
        setIntElement(term5580, 0, 729658803);
        setIntElement(term5580, 1, 114754804);
        setField(term5491, term5491.getClass(), "indirectSortPerm", term5580);
        term5583 = new Long(-8172564209423941839L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5583;
        callMethod(klass, "getHarmonicCentralityValue", argTypes, term5491, args);
    }

};


