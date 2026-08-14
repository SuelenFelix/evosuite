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
     Object term5688;

    public JoinSortRanks_JoinSortRanksBig_assignPageRankRank_9397005648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5688 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term5689 = (Object[]) newArray("[F", 3);
        float[] term5690 = (float[]) newFloatArray(6);
        float[] term5697 = (float[]) newFloatArray(8);
        float[] term5706 = (float[]) newFloatArray(3);
        Object[] term5710 = (Object[]) newArray("[D", 1);
        double[] term5711 = (double[]) newDoubleArray(1);
        Object[] term5713 = (Object[]) newArray("[J", 0);
        Object[] term5714 = (Object[]) newArray("[J", 5);
        long[] term5715 = (long[]) newLongArray(3);
        long[] term5719 = (long[]) newLongArray(8);
        long[] term5728 = (long[]) newLongArray(6);
        long[] term5735 = (long[]) newLongArray(3);
        long[] term5739 = (long[]) newLongArray(2);
        Object[] term5742 = (Object[]) newArray("[J", 3);
        long[] term5743 = (long[]) newLongArray(0);
        long[] term5744 = (long[]) newLongArray(2);
        long[] term5747 = (long[]) newLongArray(5);
        float[] term5753 = (float[]) newFloatArray(0);
        double[] term5754 = (double[]) newDoubleArray(6);
        int[] term5761 = (int[]) newIntArray(2);
        int[] term5764 = (int[]) newIntArray(7);
        int[] term5772 = (int[]) newIntArray(4);
        setFloatElement(term5690, 0, 0.86701417F);
        setFloatElement(term5690, 1, 0.07417786F);
        setFloatElement(term5690, 2, 0.96144617F);
        setFloatElement(term5690, 3, 0.6862936F);
        setFloatElement(term5690, 4, 0.18780023F);
        setFloatElement(term5690, 5, 0.12764448F);
        setElement(term5689, 0, term5690);
        setFloatElement(term5697, 0, 0.8254093F);
        setFloatElement(term5697, 1, 0.39446723F);
        setFloatElement(term5697, 2, 0.21836233F);
        setFloatElement(term5697, 3, 0.78659093F);
        setFloatElement(term5697, 4, 0.5037956F);
        setFloatElement(term5697, 5, 0.06587154F);
        setFloatElement(term5697, 6, 0.20511848F);
        setFloatElement(term5697, 7, 0.08659977F);
        setElement(term5689, 1, term5697);
        setFloatElement(term5706, 0, 0.22873008F);
        setFloatElement(term5706, 1, 0.96286476F);
        setFloatElement(term5706, 2, 0.9824895F);
        setElement(term5689, 2, term5706);
        setField(term5688, term5688.getClass(), "harmonicCentralityValues", term5689);
        setDoubleElement(term5711, 0, 0.40635376375558196);
        setElement(term5710, 0, term5711);
        setField(term5688, term5688.getClass(), "pageRankValues", term5710);
        setField(term5688, term5688.getClass(), "harmonicCentralityRanks", term5713);
        setLongElement(term5715, 0, 6848008460134431064L);
        setLongElement(term5715, 1, -5338413783740215067L);
        setLongElement(term5715, 2, -814922776357887557L);
        setElement(term5714, 0, term5715);
        setLongElement(term5719, 0, 800893933628130392L);
        setLongElement(term5719, 1, -6983938899150831997L);
        setLongElement(term5719, 2, -2720964670491002091L);
        setLongElement(term5719, 3, -723697646775816649L);
        setLongElement(term5719, 4, -5671086125367688052L);
        setLongElement(term5719, 5, 7875739215674729968L);
        setLongElement(term5719, 6, -8605430501912680279L);
        setLongElement(term5719, 7, 2985226914509512766L);
        setElement(term5714, 1, term5719);
        setLongElement(term5728, 0, 4041117732464806744L);
        setLongElement(term5728, 1, 7199459243454109261L);
        setLongElement(term5728, 2, -1009485425289165749L);
        setLongElement(term5728, 3, -5044181804110715069L);
        setLongElement(term5728, 4, -2413135395771470086L);
        setLongElement(term5728, 5, -823085399570394644L);
        setElement(term5714, 2, term5728);
        setLongElement(term5735, 0, -894705411488729365L);
        setLongElement(term5735, 1, -7514437039500876647L);
        setLongElement(term5735, 2, 204473662283899955L);
        setElement(term5714, 3, term5735);
        setLongElement(term5739, 0, -4029227951294167228L);
        setLongElement(term5739, 1, 5160033404788124731L);
        setElement(term5714, 4, term5739);
        setField(term5688, term5688.getClass(), "pageRankRanks", term5714);
        setElement(term5742, 0, term5743);
        setLongElement(term5744, 0, 5071015720043054072L);
        setLongElement(term5744, 1, -7006877527579112761L);
        setElement(term5742, 1, term5744);
        setLongElement(term5747, 0, -8699693633047465617L);
        setLongElement(term5747, 1, -590890905395927244L);
        setLongElement(term5747, 2, 6978548804004471804L);
        setLongElement(term5747, 3, -8957441653116712448L);
        setLongElement(term5747, 4, -5761087225966065493L);
        setElement(term5742, 2, term5747);
        setField(term5688, term5688.getClass(), "indirectSortPerm", term5742);
        setField(term5688, term5688.getClass(), "harmonicCentralityValues", term5753);
        setDoubleElement(term5754, 0, 0.4772043271031934);
        setDoubleElement(term5754, 1, 0.2446504549754045);
        setDoubleElement(term5754, 2, 0.6142723998707854);
        setDoubleElement(term5754, 3, 0.4355627280318103);
        setDoubleElement(term5754, 4, 0.841460835734741);
        setDoubleElement(term5754, 5, 0.7859316615744082);
        setField(term5688, term5688.getClass(), "pageRankValues", term5754);
        setIntElement(term5761, 0, 1296895584);
        setIntElement(term5761, 1, 628918458);
        setField(term5688, term5688.getClass(), "harmonicCentralityRanks", term5761);
        setIntElement(term5764, 0, -1274456137);
        setIntElement(term5764, 1, 1041916673);
        setIntElement(term5764, 2, -601863069);
        setIntElement(term5764, 3, 663292551);
        setIntElement(term5764, 4, -1885090354);
        setIntElement(term5764, 5, -2066804303);
        setIntElement(term5764, 6, -1731761810);
        setField(term5688, term5688.getClass(), "pageRankRanks", term5764);
        setIntElement(term5772, 0, 197109649);
        setIntElement(term5772, 1, -1239406390);
        setIntElement(term5772, 2, 1557431527);
        setIntElement(term5772, 3, -1504890659);
        setField(term5688, term5688.getClass(), "indirectSortPerm", term5772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignPageRankRank", argTypes, term5688, args);
    }

};


