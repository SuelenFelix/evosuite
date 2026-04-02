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

public class JoinSortRanks_JoinSortRanksBig_loadPageRank_7194053562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3621;

    public JoinSortRanks_JoinSortRanksBig_loadPageRank_7194053562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3621 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term3622 = (Object[]) newArray("[F", 6);
        float[] term3623 = (float[]) newFloatArray(7);
        float[] term3631 = (float[]) newFloatArray(0);
        float[] term3632 = (float[]) newFloatArray(9);
        float[] term3642 = (float[]) newFloatArray(6);
        float[] term3649 = (float[]) newFloatArray(8);
        float[] term3658 = (float[]) newFloatArray(6);
        Object[] term3665 = (Object[]) newArray("[D", 2);
        double[] term3666 = (double[]) newDoubleArray(1);
        double[] term3668 = (double[]) newDoubleArray(5);
        Object[] term3674 = (Object[]) newArray("[J", 3);
        long[] term3675 = (long[]) newLongArray(9);
        long[] term3685 = (long[]) newLongArray(7);
        long[] term3693 = (long[]) newLongArray(6);
        Object[] term3700 = (Object[]) newArray("[J", 5);
        long[] term3701 = (long[]) newLongArray(3);
        long[] term3705 = (long[]) newLongArray(4);
        long[] term3710 = (long[]) newLongArray(8);
        long[] term3719 = (long[]) newLongArray(0);
        long[] term3720 = (long[]) newLongArray(4);
        Object[] term3725 = (Object[]) newArray("[J", 1);
        long[] term3726 = (long[]) newLongArray(0);
        float[] term3727 = (float[]) newFloatArray(1);
        double[] term3729 = (double[]) newDoubleArray(5);
        int[] term3735 = (int[]) newIntArray(3);
        int[] term3739 = (int[]) newIntArray(2);
        int[] term3742 = (int[]) newIntArray(2);
        setFloatElement(term3623, 0, 0.8598297F);
        setFloatElement(term3623, 1, 0.96323884F);
        setFloatElement(term3623, 2, 0.43692183F);
        setFloatElement(term3623, 3, 0.80973893F);
        setFloatElement(term3623, 4, 0.7633268F);
        setFloatElement(term3623, 5, 0.541592F);
        setFloatElement(term3623, 6, 0.13481021F);
        setElement(term3622, 0, term3623);
        setElement(term3622, 1, term3631);
        setFloatElement(term3632, 0, 0.996533F);
        setFloatElement(term3632, 1, 0.38000882F);
        setFloatElement(term3632, 2, 0.10577053F);
        setFloatElement(term3632, 3, 0.5840714F);
        setFloatElement(term3632, 4, 0.478669F);
        setFloatElement(term3632, 5, 0.75592405F);
        setFloatElement(term3632, 6, 0.068145275F);
        setFloatElement(term3632, 7, 0.10667074F);
        setFloatElement(term3632, 8, 0.9571234F);
        setElement(term3622, 2, term3632);
        setFloatElement(term3642, 0, 0.114929974F);
        setFloatElement(term3642, 1, 0.30926234F);
        setFloatElement(term3642, 2, 0.37161416F);
        setFloatElement(term3642, 3, 0.022591352F);
        setFloatElement(term3642, 4, 0.6805867F);
        setFloatElement(term3642, 5, 0.51208574F);
        setElement(term3622, 3, term3642);
        setFloatElement(term3649, 0, 0.28528106F);
        setFloatElement(term3649, 1, 0.30827713F);
        setFloatElement(term3649, 2, 0.63008493F);
        setFloatElement(term3649, 3, 0.97831506F);
        setFloatElement(term3649, 4, 0.9737084F);
        setFloatElement(term3649, 5, 0.21723765F);
        setFloatElement(term3649, 6, 0.06688923F);
        setFloatElement(term3649, 7, 0.22417867F);
        setElement(term3622, 4, term3649);
        setFloatElement(term3658, 0, 0.35872674F);
        setFloatElement(term3658, 1, 0.2946385F);
        setFloatElement(term3658, 2, 0.07802445F);
        setFloatElement(term3658, 3, 0.36114347F);
        setFloatElement(term3658, 4, 0.52792794F);
        setFloatElement(term3658, 5, 0.24759698F);
        setElement(term3622, 5, term3658);
        setField(term3621, term3621.getClass(), "harmonicCentralityValues", term3622);
        setDoubleElement(term3666, 0, 0.10667076642995188);
        setElement(term3665, 0, term3666);
        setDoubleElement(term3668, 0, 0.11493000848982304);
        setDoubleElement(term3668, 1, 0.37161417339133307);
        setDoubleElement(term3668, 2, 0.6805867182029153);
        setDoubleElement(term3668, 3, 0.2852810965221698);
        setDoubleElement(term3668, 4, 0.6300849762307866);
        setElement(term3665, 1, term3668);
        setField(term3621, term3621.getClass(), "pageRankValues", term3665);
        setLongElement(term3675, 0, -2783999800714825789L);
        setLongElement(term3675, 1, 4266570509071948633L);
        setLongElement(term3675, 2, -7291742736502427077L);
        setLongElement(term3675, 3, -8121849829073967555L);
        setLongElement(term3675, 4, 5219030281405653303L);
        setLongElement(term3675, 5, -8471550651709805183L);
        setLongElement(term3675, 6, -948292411727204525L);
        setLongElement(term3675, 7, -8892586408602479513L);
        setLongElement(term3675, 8, 4616440478358528406L);
        setElement(term3674, 0, term3675);
        setLongElement(term3685, 0, 3427570961451840069L);
        setLongElement(term3685, 1, 4502292577098212311L);
        setLongElement(term3685, 2, -3730936709704460408L);
        setLongElement(term3685, 3, -8614778293741404325L);
        setLongElement(term3685, 4, -5447369594017685765L);
        setLongElement(term3685, 5, -5724112525188606013L);
        setLongElement(term3685, 6, -6100012593724108983L);
        setElement(term3674, 1, term3685);
        setLongElement(term3693, 0, 5465527210299101732L);
        setLongElement(term3693, 1, 4699157009689333952L);
        setLongElement(term3693, 2, -78240609295693193L);
        setLongElement(term3693, 3, 3090901538358721367L);
        setLongElement(term3693, 4, -1677189124507026637L);
        setLongElement(term3693, 5, 4795660804170399986L);
        setElement(term3674, 2, term3693);
        setField(term3621, term3621.getClass(), "harmonicCentralityRanks", term3674);
        setLongElement(term3701, 0, -4030863184426321096L);
        setLongElement(term3701, 1, -8010214112439224349L);
        setLongElement(term3701, 2, -6673920710396545553L);
        setElement(term3700, 0, term3701);
        setLongElement(term3705, 0, 3412644969878030772L);
        setLongElement(term3705, 1, 6698455537431331246L);
        setLongElement(term3705, 2, -8327432141027603933L);
        setLongElement(term3705, 3, -433040798405298080L);
        setElement(term3700, 1, term3705);
        setLongElement(term3710, 0, -1505191021111100819L);
        setLongElement(term3710, 1, -1000830646340880796L);
        setLongElement(term3710, 2, 5973526439563541711L);
        setLongElement(term3710, 3, 5246058710498845622L);
        setLongElement(term3710, 4, 4394651392080968777L);
        setLongElement(term3710, 5, -7310273014364148916L);
        setLongElement(term3710, 6, 8863790908271299748L);
        setLongElement(term3710, 7, 9205327385733285058L);
        setElement(term3700, 2, term3710);
        setElement(term3700, 3, term3719);
        setLongElement(term3720, 0, 4199886998224701110L);
        setLongElement(term3720, 1, 8540994973773607992L);
        setLongElement(term3720, 2, -2338103433822116635L);
        setLongElement(term3720, 3, -1885698929232124806L);
        setElement(term3700, 4, term3720);
        setField(term3621, term3621.getClass(), "pageRankRanks", term3700);
        setElement(term3725, 0, term3726);
        setField(term3621, term3621.getClass(), "indirectSortPerm", term3725);
        setFloatElement(term3727, 0, 0.32021916F);
        setField(term3621, term3621.getClass(), "harmonicCentralityValues", term3727);
        setDoubleElement(term3729, 0, 0.9737083944266686);
        setDoubleElement(term3729, 1, 0.0668892744806211);
        setDoubleElement(term3729, 2, 0.3587267442738795);
        setDoubleElement(term3729, 3, 0.07802449704920456);
        setDoubleElement(term3729, 4, 0.5279279537140873);
        setField(term3621, term3621.getClass(), "pageRankValues", term3729);
        setIntElement(term3735, 0, -894662986);
        setIntElement(term3735, 1, 304775596);
        setIntElement(term3735, 2, -1347665717);
        setField(term3621, term3621.getClass(), "harmonicCentralityRanks", term3735);
        setIntElement(term3739, 0, -1888585309);
        setIntElement(term3739, 1, 683666002);
        setField(term3621, term3621.getClass(), "pageRankRanks", term3739);
        setIntElement(term3742, 0, 1596213415);
        setIntElement(term3742, 1, -268815336);
        setField(term3621, term3621.getClass(), "indirectSortPerm", term3742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "loadPageRank", argTypes, term3621, args);
    }

};


