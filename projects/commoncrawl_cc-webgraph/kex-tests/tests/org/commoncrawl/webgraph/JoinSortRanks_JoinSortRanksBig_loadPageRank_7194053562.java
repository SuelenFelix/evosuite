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
     Object term3973;

    public JoinSortRanks_JoinSortRanksBig_loadPageRank_7194053562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3973 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term3974 = (Object[]) newArray("[F", 6);
        float[] term3975 = (float[]) newFloatArray(7);
        float[] term3983 = (float[]) newFloatArray(0);
        float[] term3984 = (float[]) newFloatArray(9);
        float[] term3994 = (float[]) newFloatArray(6);
        float[] term4001 = (float[]) newFloatArray(8);
        float[] term4010 = (float[]) newFloatArray(6);
        Object[] term4017 = (Object[]) newArray("[D", 2);
        double[] term4018 = (double[]) newDoubleArray(1);
        double[] term4020 = (double[]) newDoubleArray(5);
        Object[] term4026 = (Object[]) newArray("[J", 3);
        long[] term4027 = (long[]) newLongArray(9);
        long[] term4037 = (long[]) newLongArray(7);
        long[] term4045 = (long[]) newLongArray(6);
        Object[] term4052 = (Object[]) newArray("[J", 5);
        long[] term4053 = (long[]) newLongArray(3);
        long[] term4057 = (long[]) newLongArray(4);
        long[] term4062 = (long[]) newLongArray(8);
        long[] term4071 = (long[]) newLongArray(0);
        long[] term4072 = (long[]) newLongArray(4);
        Object[] term4077 = (Object[]) newArray("[J", 1);
        long[] term4078 = (long[]) newLongArray(0);
        float[] term4079 = (float[]) newFloatArray(1);
        double[] term4081 = (double[]) newDoubleArray(5);
        int[] term4087 = (int[]) newIntArray(3);
        int[] term4091 = (int[]) newIntArray(2);
        int[] term4094 = (int[]) newIntArray(2);
        setFloatElement(term3975, 0, 0.8598297F);
        setFloatElement(term3975, 1, 0.96323884F);
        setFloatElement(term3975, 2, 0.43692183F);
        setFloatElement(term3975, 3, 0.80973893F);
        setFloatElement(term3975, 4, 0.7633268F);
        setFloatElement(term3975, 5, 0.541592F);
        setFloatElement(term3975, 6, 0.13481021F);
        setElement(term3974, 0, term3975);
        setElement(term3974, 1, term3983);
        setFloatElement(term3984, 0, 0.996533F);
        setFloatElement(term3984, 1, 0.38000882F);
        setFloatElement(term3984, 2, 0.10577053F);
        setFloatElement(term3984, 3, 0.5840714F);
        setFloatElement(term3984, 4, 0.478669F);
        setFloatElement(term3984, 5, 0.75592405F);
        setFloatElement(term3984, 6, 0.068145275F);
        setFloatElement(term3984, 7, 0.10667074F);
        setFloatElement(term3984, 8, 0.9571234F);
        setElement(term3974, 2, term3984);
        setFloatElement(term3994, 0, 0.114929974F);
        setFloatElement(term3994, 1, 0.30926234F);
        setFloatElement(term3994, 2, 0.37161416F);
        setFloatElement(term3994, 3, 0.022591352F);
        setFloatElement(term3994, 4, 0.6805867F);
        setFloatElement(term3994, 5, 0.51208574F);
        setElement(term3974, 3, term3994);
        setFloatElement(term4001, 0, 0.28528106F);
        setFloatElement(term4001, 1, 0.30827713F);
        setFloatElement(term4001, 2, 0.63008493F);
        setFloatElement(term4001, 3, 0.97831506F);
        setFloatElement(term4001, 4, 0.9737084F);
        setFloatElement(term4001, 5, 0.21723765F);
        setFloatElement(term4001, 6, 0.06688923F);
        setFloatElement(term4001, 7, 0.22417867F);
        setElement(term3974, 4, term4001);
        setFloatElement(term4010, 0, 0.35872674F);
        setFloatElement(term4010, 1, 0.2946385F);
        setFloatElement(term4010, 2, 0.07802445F);
        setFloatElement(term4010, 3, 0.36114347F);
        setFloatElement(term4010, 4, 0.52792794F);
        setFloatElement(term4010, 5, 0.24759698F);
        setElement(term3974, 5, term4010);
        setField(term3973, term3973.getClass(), "harmonicCentralityValues", term3974);
        setDoubleElement(term4018, 0, 0.10667076642995188);
        setElement(term4017, 0, term4018);
        setDoubleElement(term4020, 0, 0.11493000848982304);
        setDoubleElement(term4020, 1, 0.37161417339133307);
        setDoubleElement(term4020, 2, 0.6805867182029153);
        setDoubleElement(term4020, 3, 0.2852810965221698);
        setDoubleElement(term4020, 4, 0.6300849762307866);
        setElement(term4017, 1, term4020);
        setField(term3973, term3973.getClass(), "pageRankValues", term4017);
        setLongElement(term4027, 0, -2783999800714825789L);
        setLongElement(term4027, 1, 4266570509071948633L);
        setLongElement(term4027, 2, -7291742736502427077L);
        setLongElement(term4027, 3, -8121849829073967555L);
        setLongElement(term4027, 4, 5219030281405653303L);
        setLongElement(term4027, 5, -8471550651709805183L);
        setLongElement(term4027, 6, -948292411727204525L);
        setLongElement(term4027, 7, -8892586408602479513L);
        setLongElement(term4027, 8, 4616440478358528406L);
        setElement(term4026, 0, term4027);
        setLongElement(term4037, 0, 3427570961451840069L);
        setLongElement(term4037, 1, 4502292577098212311L);
        setLongElement(term4037, 2, -3730936709704460408L);
        setLongElement(term4037, 3, -8614778293741404325L);
        setLongElement(term4037, 4, -5447369594017685765L);
        setLongElement(term4037, 5, -5724112525188606013L);
        setLongElement(term4037, 6, -6100012593724108983L);
        setElement(term4026, 1, term4037);
        setLongElement(term4045, 0, 5465527210299101732L);
        setLongElement(term4045, 1, 4699157009689333952L);
        setLongElement(term4045, 2, -78240609295693193L);
        setLongElement(term4045, 3, 3090901538358721367L);
        setLongElement(term4045, 4, -1677189124507026637L);
        setLongElement(term4045, 5, 4795660804170399986L);
        setElement(term4026, 2, term4045);
        setField(term3973, term3973.getClass(), "harmonicCentralityRanks", term4026);
        setLongElement(term4053, 0, -4030863184426321096L);
        setLongElement(term4053, 1, -8010214112439224349L);
        setLongElement(term4053, 2, -6673920710396545553L);
        setElement(term4052, 0, term4053);
        setLongElement(term4057, 0, 3412644969878030772L);
        setLongElement(term4057, 1, 6698455537431331246L);
        setLongElement(term4057, 2, -8327432141027603933L);
        setLongElement(term4057, 3, -433040798405298080L);
        setElement(term4052, 1, term4057);
        setLongElement(term4062, 0, -1505191021111100819L);
        setLongElement(term4062, 1, -1000830646340880796L);
        setLongElement(term4062, 2, 5973526439563541711L);
        setLongElement(term4062, 3, 5246058710498845622L);
        setLongElement(term4062, 4, 4394651392080968777L);
        setLongElement(term4062, 5, -7310273014364148916L);
        setLongElement(term4062, 6, 8863790908271299748L);
        setLongElement(term4062, 7, 9205327385733285058L);
        setElement(term4052, 2, term4062);
        setElement(term4052, 3, term4071);
        setLongElement(term4072, 0, 4199886998224701110L);
        setLongElement(term4072, 1, 8540994973773607992L);
        setLongElement(term4072, 2, -2338103433822116635L);
        setLongElement(term4072, 3, -1885698929232124806L);
        setElement(term4052, 4, term4072);
        setField(term3973, term3973.getClass(), "pageRankRanks", term4052);
        setElement(term4077, 0, term4078);
        setField(term3973, term3973.getClass(), "indirectSortPerm", term4077);
        setFloatElement(term4079, 0, 0.32021916F);
        setField(term3973, term3973.getClass(), "harmonicCentralityValues", term4079);
        setDoubleElement(term4081, 0, 0.9737083944266686);
        setDoubleElement(term4081, 1, 0.0668892744806211);
        setDoubleElement(term4081, 2, 0.3587267442738795);
        setDoubleElement(term4081, 3, 0.07802449704920456);
        setDoubleElement(term4081, 4, 0.5279279537140873);
        setField(term3973, term3973.getClass(), "pageRankValues", term4081);
        setIntElement(term4087, 0, -894662986);
        setIntElement(term4087, 1, 304775596);
        setIntElement(term4087, 2, -1347665717);
        setField(term3973, term3973.getClass(), "harmonicCentralityRanks", term4087);
        setIntElement(term4091, 0, -1888585309);
        setIntElement(term4091, 1, 683666002);
        setField(term3973, term3973.getClass(), "pageRankRanks", term4091);
        setIntElement(term4094, 0, 1596213415);
        setIntElement(term4094, 1, -268815336);
        setField(term3973, term3973.getClass(), "indirectSortPerm", term4094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "loadPageRank", argTypes, term3973, args);
    }

};


