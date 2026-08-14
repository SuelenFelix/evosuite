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
     Object term4215;
     Object term4338;
     Object term4340;

    public JoinSortRanks_JoinSortRanksBig_compareHarmonicCentralityIndirect_12007512693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig"));
        Object[] term4216 = (Object[]) newArray("[F", 5);
        float[] term4217 = (float[]) newFloatArray(4);
        float[] term4222 = (float[]) newFloatArray(8);
        float[] term4231 = (float[]) newFloatArray(0);
        float[] term4232 = (float[]) newFloatArray(5);
        float[] term4238 = (float[]) newFloatArray(4);
        Object[] term4243 = (Object[]) newArray("[D", 1);
        double[] term4244 = (double[]) newDoubleArray(0);
        Object[] term4245 = (Object[]) newArray("[J", 6);
        long[] term4246 = (long[]) newLongArray(3);
        long[] term4250 = (long[]) newLongArray(4);
        long[] term4255 = (long[]) newLongArray(5);
        long[] term4261 = (long[]) newLongArray(8);
        long[] term4270 = (long[]) newLongArray(8);
        long[] term4279 = (long[]) newLongArray(5);
        Object[] term4285 = (Object[]) newArray("[J", 6);
        long[] term4286 = (long[]) newLongArray(3);
        long[] term4290 = (long[]) newLongArray(0);
        long[] term4291 = (long[]) newLongArray(5);
        long[] term4297 = (long[]) newLongArray(6);
        long[] term4304 = (long[]) newLongArray(0);
        long[] term4305 = (long[]) newLongArray(3);
        Object[] term4309 = (Object[]) newArray("[J", 1);
        long[] term4310 = (long[]) newLongArray(9);
        float[] term4320 = (float[]) newFloatArray(2);
        double[] term4323 = (double[]) newDoubleArray(3);
        int[] term4327 = (int[]) newIntArray(2);
        int[] term4330 = (int[]) newIntArray(5);
        int[] term4336 = (int[]) newIntArray(1);
        setFloatElement(term4217, 0, 0.8886614F);
        setFloatElement(term4217, 1, 0.22651339F);
        setFloatElement(term4217, 2, 0.38555247F);
        setFloatElement(term4217, 3, 0.8878841F);
        setElement(term4216, 0, term4217);
        setFloatElement(term4222, 0, 0.2889229F);
        setFloatElement(term4222, 1, 0.65889484F);
        setFloatElement(term4222, 2, 0.25392914F);
        setFloatElement(term4222, 3, 0.63972145F);
        setFloatElement(term4222, 4, 0.3357792F);
        setFloatElement(term4222, 5, 0.25937343F);
        setFloatElement(term4222, 6, 0.8704517F);
        setFloatElement(term4222, 7, 0.5873228F);
        setElement(term4216, 1, term4222);
        setElement(term4216, 2, term4231);
        setFloatElement(term4232, 0, 0.5703112F);
        setFloatElement(term4232, 1, 0.8823181F);
        setFloatElement(term4232, 2, 0.91971004F);
        setFloatElement(term4232, 3, 0.21924508F);
        setFloatElement(term4232, 4, 0.10338366F);
        setElement(term4216, 3, term4232);
        setFloatElement(term4238, 0, 0.75913525F);
        setFloatElement(term4238, 1, 0.7059082F);
        setFloatElement(term4238, 2, 0.791695F);
        setFloatElement(term4238, 3, 0.07096106F);
        setElement(term4216, 4, term4238);
        setField(term4215, term4215.getClass(), "harmonicCentralityValues", term4216);
        setElement(term4243, 0, term4244);
        setField(term4215, term4215.getClass(), "pageRankValues", term4243);
        setLongElement(term4246, 0, 5731563613239387113L);
        setLongElement(term4246, 1, 3381333711768010594L);
        setLongElement(term4246, 2, 3580984732036213717L);
        setElement(term4245, 0, term4246);
        setLongElement(term4250, 0, 5330761990446327930L);
        setLongElement(term4250, 1, -3954795081650780841L);
        setLongElement(term4250, 2, 3288791194263207397L);
        setLongElement(term4250, 3, 3288941170644426558L);
        setElement(term4245, 1, term4250);
        setLongElement(term4255, 0, -8338004844694486146L);
        setLongElement(term4255, 1, 6426732259596412988L);
        setLongElement(term4255, 2, 185793058502220865L);
        setLongElement(term4255, 3, -7698746988132548371L);
        setLongElement(term4255, 4, 2145420811068634601L);
        setElement(term4245, 2, term4255);
        setLongElement(term4261, 0, 2191130532479601175L);
        setLongElement(term4261, 1, 860079646007397083L);
        setLongElement(term4261, 2, 3230472384687362867L);
        setLongElement(term4261, 3, -1145146470850585022L);
        setLongElement(term4261, 4, 1993646237353405740L);
        setLongElement(term4261, 5, -4043093655001688454L);
        setLongElement(term4261, 6, -419800263764810394L);
        setLongElement(term4261, 7, 5904678961906211249L);
        setElement(term4245, 3, term4261);
        setLongElement(term4270, 0, -1820639665251914495L);
        setLongElement(term4270, 1, 3238645206498300107L);
        setLongElement(term4270, 2, -1592696983130738594L);
        setLongElement(term4270, 3, 6902365338255307910L);
        setLongElement(term4270, 4, -8019730974733786399L);
        setLongElement(term4270, 5, 394960377236392159L);
        setLongElement(term4270, 6, -2955854401507097864L);
        setLongElement(term4270, 7, 329213208496958131L);
        setElement(term4245, 4, term4270);
        setLongElement(term4279, 0, 8107921244631636572L);
        setLongElement(term4279, 1, -7904053112604879960L);
        setLongElement(term4279, 2, -6602460430714339690L);
        setLongElement(term4279, 3, 21047099434645581L);
        setLongElement(term4279, 4, -8862087040734407227L);
        setElement(term4245, 5, term4279);
        setField(term4215, term4215.getClass(), "harmonicCentralityRanks", term4245);
        setLongElement(term4286, 0, -6394943900800506753L);
        setLongElement(term4286, 1, -4867941246533901410L);
        setLongElement(term4286, 2, 1044883697493326351L);
        setElement(term4285, 0, term4286);
        setElement(term4285, 1, term4290);
        setLongElement(term4291, 0, -7406618974062419277L);
        setLongElement(term4291, 1, 868503089567085985L);
        setLongElement(term4291, 2, -3277773415369003529L);
        setLongElement(term4291, 3, 1253549421411622358L);
        setLongElement(term4291, 4, 3666226122807672448L);
        setElement(term4285, 2, term4291);
        setLongElement(term4297, 0, 3108750145697087661L);
        setLongElement(term4297, 1, 3752337209837437327L);
        setLongElement(term4297, 2, 1860789353508856614L);
        setLongElement(term4297, 3, -7456852906235966771L);
        setLongElement(term4297, 4, -67485388932970712L);
        setLongElement(term4297, 5, 5806367330808555223L);
        setElement(term4285, 3, term4297);
        setElement(term4285, 4, term4304);
        setLongElement(term4305, 0, 4576699120365923235L);
        setLongElement(term4305, 1, -1635471392209071620L);
        setLongElement(term4305, 2, -4714000263923324167L);
        setElement(term4285, 5, term4305);
        setField(term4215, term4215.getClass(), "pageRankRanks", term4285);
        setLongElement(term4310, 0, 6906379511067694917L);
        setLongElement(term4310, 1, -9204303423581447271L);
        setLongElement(term4310, 2, 6248239231585852341L);
        setLongElement(term4310, 3, -88538481937688851L);
        setLongElement(term4310, 4, 4069264186851023313L);
        setLongElement(term4310, 5, 5184635470881147510L);
        setLongElement(term4310, 6, 918397384129253729L);
        setLongElement(term4310, 7, -2187638136407967948L);
        setLongElement(term4310, 8, 8708846223293804408L);
        setElement(term4309, 0, term4310);
        setField(term4215, term4215.getClass(), "indirectSortPerm", term4309);
        setFloatElement(term4320, 0, 0.6862221F);
        setFloatElement(term4320, 1, 0.5602794F);
        setField(term4215, term4215.getClass(), "harmonicCentralityValues", term4320);
        setDoubleElement(term4323, 0, 0.3202192021706908);
        setDoubleElement(term4323, 1, 0.22651340641904605);
        setDoubleElement(term4323, 2, 0.8878841294187743);
        setField(term4215, term4215.getClass(), "pageRankValues", term4323);
        setIntElement(term4327, 0, -1210583429);
        setIntElement(term4327, 1, -663691365);
        setField(term4215, term4215.getClass(), "harmonicCentralityRanks", term4327);
        setIntElement(term4330, 0, 339854490);
        setIntElement(term4330, 1, -615654495);
        setIntElement(term4330, 2, -1476117762);
        setIntElement(term4330, 3, -341962980);
        setIntElement(term4330, 4, 1532716628);
        setField(term4215, term4215.getClass(), "pageRankRanks", term4330);
        setIntElement(term4336, 0, -1801760683);
        setField(term4215, term4215.getClass(), "indirectSortPerm", term4336);
        term4338 = new Long(-2986201902216133814L);
        term4340 = new Long(4255811647459029682L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks$JoinSortRanksBig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term4338;
        args[1] = term4340;
        callMethod(klass, "compareHarmonicCentralityIndirect", argTypes, term4215, args);
    }

};


