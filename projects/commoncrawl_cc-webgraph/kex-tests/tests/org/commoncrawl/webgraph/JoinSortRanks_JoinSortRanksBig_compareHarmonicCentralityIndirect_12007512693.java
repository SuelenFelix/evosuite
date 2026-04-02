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

public class JoinSortRanks_JoinSortRanksBig_compareHarmonicCentralityIndirect_12007512693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3863;
     Object term3986;
     Object term3988;

    public JoinSortRanks_JoinSortRanksBig_compareHarmonicCentralityIndirect_12007512693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3863 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term3864 = (Object[]) newArray("[F", 5);
        float[] term3865 = (float[]) newFloatArray(4);
        float[] term3870 = (float[]) newFloatArray(8);
        float[] term3879 = (float[]) newFloatArray(0);
        float[] term3880 = (float[]) newFloatArray(5);
        float[] term3886 = (float[]) newFloatArray(4);
        Object[] term3891 = (Object[]) newArray("[D", 1);
        double[] term3892 = (double[]) newDoubleArray(0);
        Object[] term3893 = (Object[]) newArray("[J", 6);
        long[] term3894 = (long[]) newLongArray(3);
        long[] term3898 = (long[]) newLongArray(4);
        long[] term3903 = (long[]) newLongArray(5);
        long[] term3909 = (long[]) newLongArray(8);
        long[] term3918 = (long[]) newLongArray(8);
        long[] term3927 = (long[]) newLongArray(5);
        Object[] term3933 = (Object[]) newArray("[J", 6);
        long[] term3934 = (long[]) newLongArray(3);
        long[] term3938 = (long[]) newLongArray(0);
        long[] term3939 = (long[]) newLongArray(5);
        long[] term3945 = (long[]) newLongArray(6);
        long[] term3952 = (long[]) newLongArray(0);
        long[] term3953 = (long[]) newLongArray(3);
        Object[] term3957 = (Object[]) newArray("[J", 1);
        long[] term3958 = (long[]) newLongArray(9);
        float[] term3968 = (float[]) newFloatArray(2);
        double[] term3971 = (double[]) newDoubleArray(3);
        int[] term3975 = (int[]) newIntArray(2);
        int[] term3978 = (int[]) newIntArray(5);
        int[] term3984 = (int[]) newIntArray(1);
        setFloatElement(term3865, 0, 0.8886614F);
        setFloatElement(term3865, 1, 0.22651339F);
        setFloatElement(term3865, 2, 0.38555247F);
        setFloatElement(term3865, 3, 0.8878841F);
        setElement(term3864, 0, term3865);
        setFloatElement(term3870, 0, 0.2889229F);
        setFloatElement(term3870, 1, 0.65889484F);
        setFloatElement(term3870, 2, 0.25392914F);
        setFloatElement(term3870, 3, 0.63972145F);
        setFloatElement(term3870, 4, 0.3357792F);
        setFloatElement(term3870, 5, 0.25937343F);
        setFloatElement(term3870, 6, 0.8704517F);
        setFloatElement(term3870, 7, 0.5873228F);
        setElement(term3864, 1, term3870);
        setElement(term3864, 2, term3879);
        setFloatElement(term3880, 0, 0.5703112F);
        setFloatElement(term3880, 1, 0.8823181F);
        setFloatElement(term3880, 2, 0.91971004F);
        setFloatElement(term3880, 3, 0.21924508F);
        setFloatElement(term3880, 4, 0.10338366F);
        setElement(term3864, 3, term3880);
        setFloatElement(term3886, 0, 0.75913525F);
        setFloatElement(term3886, 1, 0.7059082F);
        setFloatElement(term3886, 2, 0.791695F);
        setFloatElement(term3886, 3, 0.07096106F);
        setElement(term3864, 4, term3886);
        setField(term3863, term3863.getClass(), "harmonicCentralityValues", term3864);
        setElement(term3891, 0, term3892);
        setField(term3863, term3863.getClass(), "pageRankValues", term3891);
        setLongElement(term3894, 0, 5731563613239387113L);
        setLongElement(term3894, 1, 3381333711768010594L);
        setLongElement(term3894, 2, 3580984732036213717L);
        setElement(term3893, 0, term3894);
        setLongElement(term3898, 0, 5330761990446327930L);
        setLongElement(term3898, 1, -3954795081650780841L);
        setLongElement(term3898, 2, 3288791194263207397L);
        setLongElement(term3898, 3, 3288941170644426558L);
        setElement(term3893, 1, term3898);
        setLongElement(term3903, 0, -8338004844694486146L);
        setLongElement(term3903, 1, 6426732259596412988L);
        setLongElement(term3903, 2, 185793058502220865L);
        setLongElement(term3903, 3, -7698746988132548371L);
        setLongElement(term3903, 4, 2145420811068634601L);
        setElement(term3893, 2, term3903);
        setLongElement(term3909, 0, 2191130532479601175L);
        setLongElement(term3909, 1, 860079646007397083L);
        setLongElement(term3909, 2, 3230472384687362867L);
        setLongElement(term3909, 3, -1145146470850585022L);
        setLongElement(term3909, 4, 1993646237353405740L);
        setLongElement(term3909, 5, -4043093655001688454L);
        setLongElement(term3909, 6, -419800263764810394L);
        setLongElement(term3909, 7, 5904678961906211249L);
        setElement(term3893, 3, term3909);
        setLongElement(term3918, 0, -1820639665251914495L);
        setLongElement(term3918, 1, 3238645206498300107L);
        setLongElement(term3918, 2, -1592696983130738594L);
        setLongElement(term3918, 3, 6902365338255307910L);
        setLongElement(term3918, 4, -8019730974733786399L);
        setLongElement(term3918, 5, 394960377236392159L);
        setLongElement(term3918, 6, -2955854401507097864L);
        setLongElement(term3918, 7, 329213208496958131L);
        setElement(term3893, 4, term3918);
        setLongElement(term3927, 0, 8107921244631636572L);
        setLongElement(term3927, 1, -7904053112604879960L);
        setLongElement(term3927, 2, -6602460430714339690L);
        setLongElement(term3927, 3, 21047099434645581L);
        setLongElement(term3927, 4, -8862087040734407227L);
        setElement(term3893, 5, term3927);
        setField(term3863, term3863.getClass(), "harmonicCentralityRanks", term3893);
        setLongElement(term3934, 0, -6394943900800506753L);
        setLongElement(term3934, 1, -4867941246533901410L);
        setLongElement(term3934, 2, 1044883697493326351L);
        setElement(term3933, 0, term3934);
        setElement(term3933, 1, term3938);
        setLongElement(term3939, 0, -7406618974062419277L);
        setLongElement(term3939, 1, 868503089567085985L);
        setLongElement(term3939, 2, -3277773415369003529L);
        setLongElement(term3939, 3, 1253549421411622358L);
        setLongElement(term3939, 4, 3666226122807672448L);
        setElement(term3933, 2, term3939);
        setLongElement(term3945, 0, 3108750145697087661L);
        setLongElement(term3945, 1, 3752337209837437327L);
        setLongElement(term3945, 2, 1860789353508856614L);
        setLongElement(term3945, 3, -7456852906235966771L);
        setLongElement(term3945, 4, -67485388932970712L);
        setLongElement(term3945, 5, 5806367330808555223L);
        setElement(term3933, 3, term3945);
        setElement(term3933, 4, term3952);
        setLongElement(term3953, 0, 4576699120365923235L);
        setLongElement(term3953, 1, -1635471392209071620L);
        setLongElement(term3953, 2, -4714000263923324167L);
        setElement(term3933, 5, term3953);
        setField(term3863, term3863.getClass(), "pageRankRanks", term3933);
        setLongElement(term3958, 0, 6906379511067694917L);
        setLongElement(term3958, 1, -9204303423581447271L);
        setLongElement(term3958, 2, 6248239231585852341L);
        setLongElement(term3958, 3, -88538481937688851L);
        setLongElement(term3958, 4, 4069264186851023313L);
        setLongElement(term3958, 5, 5184635470881147510L);
        setLongElement(term3958, 6, 918397384129253729L);
        setLongElement(term3958, 7, -2187638136407967948L);
        setLongElement(term3958, 8, 8708846223293804408L);
        setElement(term3957, 0, term3958);
        setField(term3863, term3863.getClass(), "indirectSortPerm", term3957);
        setFloatElement(term3968, 0, 0.6862221F);
        setFloatElement(term3968, 1, 0.5602794F);
        setField(term3863, term3863.getClass(), "harmonicCentralityValues", term3968);
        setDoubleElement(term3971, 0, 0.3202192021706908);
        setDoubleElement(term3971, 1, 0.22651340641904605);
        setDoubleElement(term3971, 2, 0.8878841294187743);
        setField(term3863, term3863.getClass(), "pageRankValues", term3971);
        setIntElement(term3975, 0, -1210583429);
        setIntElement(term3975, 1, -663691365);
        setField(term3863, term3863.getClass(), "harmonicCentralityRanks", term3975);
        setIntElement(term3978, 0, 339854490);
        setIntElement(term3978, 1, -615654495);
        setIntElement(term3978, 2, -1476117762);
        setIntElement(term3978, 3, -341962980);
        setIntElement(term3978, 4, 1532716628);
        setField(term3863, term3863.getClass(), "pageRankRanks", term3978);
        setIntElement(term3984, 0, -1801760683);
        setField(term3863, term3863.getClass(), "indirectSortPerm", term3984);
        term3986 = new Long(-2986201902216133814L);
        term3988 = new Long(4255811647459029682L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term3986;
        args[1] = term3988;
        callMethod(klass, "compareHarmonicCentralityIndirect", argTypes, term3863, args);
    }

};


