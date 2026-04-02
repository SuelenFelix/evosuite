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

public class JoinSortRanks_JoinSortRanksBig_assignPageRankRank_9397005648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5336;

    public JoinSortRanks_JoinSortRanksBig_assignPageRankRank_9397005648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5336 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term5337 = (Object[]) newArray("[F", 3);
        float[] term5338 = (float[]) newFloatArray(6);
        float[] term5345 = (float[]) newFloatArray(8);
        float[] term5354 = (float[]) newFloatArray(3);
        Object[] term5358 = (Object[]) newArray("[D", 1);
        double[] term5359 = (double[]) newDoubleArray(1);
        Object[] term5361 = (Object[]) newArray("[J", 0);
        Object[] term5362 = (Object[]) newArray("[J", 5);
        long[] term5363 = (long[]) newLongArray(3);
        long[] term5367 = (long[]) newLongArray(8);
        long[] term5376 = (long[]) newLongArray(6);
        long[] term5383 = (long[]) newLongArray(3);
        long[] term5387 = (long[]) newLongArray(2);
        Object[] term5390 = (Object[]) newArray("[J", 3);
        long[] term5391 = (long[]) newLongArray(0);
        long[] term5392 = (long[]) newLongArray(2);
        long[] term5395 = (long[]) newLongArray(5);
        float[] term5401 = (float[]) newFloatArray(0);
        double[] term5402 = (double[]) newDoubleArray(6);
        int[] term5409 = (int[]) newIntArray(2);
        int[] term5412 = (int[]) newIntArray(7);
        int[] term5420 = (int[]) newIntArray(4);
        setFloatElement(term5338, 0, 0.86701417F);
        setFloatElement(term5338, 1, 0.07417786F);
        setFloatElement(term5338, 2, 0.96144617F);
        setFloatElement(term5338, 3, 0.6862936F);
        setFloatElement(term5338, 4, 0.18780023F);
        setFloatElement(term5338, 5, 0.12764448F);
        setElement(term5337, 0, term5338);
        setFloatElement(term5345, 0, 0.8254093F);
        setFloatElement(term5345, 1, 0.39446723F);
        setFloatElement(term5345, 2, 0.21836233F);
        setFloatElement(term5345, 3, 0.78659093F);
        setFloatElement(term5345, 4, 0.5037956F);
        setFloatElement(term5345, 5, 0.06587154F);
        setFloatElement(term5345, 6, 0.20511848F);
        setFloatElement(term5345, 7, 0.08659977F);
        setElement(term5337, 1, term5345);
        setFloatElement(term5354, 0, 0.22873008F);
        setFloatElement(term5354, 1, 0.96286476F);
        setFloatElement(term5354, 2, 0.9824895F);
        setElement(term5337, 2, term5354);
        setField(term5336, term5336.getClass(), "harmonicCentralityValues", term5337);
        setDoubleElement(term5359, 0, 0.40635376375558196);
        setElement(term5358, 0, term5359);
        setField(term5336, term5336.getClass(), "pageRankValues", term5358);
        setField(term5336, term5336.getClass(), "harmonicCentralityRanks", term5361);
        setLongElement(term5363, 0, 6848008460134431064L);
        setLongElement(term5363, 1, -5338413783740215067L);
        setLongElement(term5363, 2, -814922776357887557L);
        setElement(term5362, 0, term5363);
        setLongElement(term5367, 0, 800893933628130392L);
        setLongElement(term5367, 1, -6983938899150831997L);
        setLongElement(term5367, 2, -2720964670491002091L);
        setLongElement(term5367, 3, -723697646775816649L);
        setLongElement(term5367, 4, -5671086125367688052L);
        setLongElement(term5367, 5, 7875739215674729968L);
        setLongElement(term5367, 6, -8605430501912680279L);
        setLongElement(term5367, 7, 2985226914509512766L);
        setElement(term5362, 1, term5367);
        setLongElement(term5376, 0, 4041117732464806744L);
        setLongElement(term5376, 1, 7199459243454109261L);
        setLongElement(term5376, 2, -1009485425289165749L);
        setLongElement(term5376, 3, -5044181804110715069L);
        setLongElement(term5376, 4, -2413135395771470086L);
        setLongElement(term5376, 5, -823085399570394644L);
        setElement(term5362, 2, term5376);
        setLongElement(term5383, 0, -894705411488729365L);
        setLongElement(term5383, 1, -7514437039500876647L);
        setLongElement(term5383, 2, 204473662283899955L);
        setElement(term5362, 3, term5383);
        setLongElement(term5387, 0, -4029227951294167228L);
        setLongElement(term5387, 1, 5160033404788124731L);
        setElement(term5362, 4, term5387);
        setField(term5336, term5336.getClass(), "pageRankRanks", term5362);
        setElement(term5390, 0, term5391);
        setLongElement(term5392, 0, 5071015720043054072L);
        setLongElement(term5392, 1, -7006877527579112761L);
        setElement(term5390, 1, term5392);
        setLongElement(term5395, 0, -8699693633047465617L);
        setLongElement(term5395, 1, -590890905395927244L);
        setLongElement(term5395, 2, 6978548804004471804L);
        setLongElement(term5395, 3, -8957441653116712448L);
        setLongElement(term5395, 4, -5761087225966065493L);
        setElement(term5390, 2, term5395);
        setField(term5336, term5336.getClass(), "indirectSortPerm", term5390);
        setField(term5336, term5336.getClass(), "harmonicCentralityValues", term5401);
        setDoubleElement(term5402, 0, 0.4772043271031934);
        setDoubleElement(term5402, 1, 0.2446504549754045);
        setDoubleElement(term5402, 2, 0.6142723998707854);
        setDoubleElement(term5402, 3, 0.4355627280318103);
        setDoubleElement(term5402, 4, 0.841460835734741);
        setDoubleElement(term5402, 5, 0.7859316615744082);
        setField(term5336, term5336.getClass(), "pageRankValues", term5402);
        setIntElement(term5409, 0, 1296895584);
        setIntElement(term5409, 1, 628918458);
        setField(term5336, term5336.getClass(), "harmonicCentralityRanks", term5409);
        setIntElement(term5412, 0, -1274456137);
        setIntElement(term5412, 1, 1041916673);
        setIntElement(term5412, 2, -601863069);
        setIntElement(term5412, 3, 663292551);
        setIntElement(term5412, 4, -1885090354);
        setIntElement(term5412, 5, -2066804303);
        setIntElement(term5412, 6, -1731761810);
        setField(term5336, term5336.getClass(), "pageRankRanks", term5412);
        setIntElement(term5420, 0, 197109649);
        setIntElement(term5420, 1, -1239406390);
        setIntElement(term5420, 2, 1557431527);
        setIntElement(term5420, 3, -1504890659);
        setField(term5336, term5336.getClass(), "indirectSortPerm", term5420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignPageRankRank", argTypes, term5336, args);
    }

};


