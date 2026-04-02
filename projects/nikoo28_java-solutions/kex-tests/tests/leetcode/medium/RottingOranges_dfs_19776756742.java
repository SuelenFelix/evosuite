package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RottingOranges_dfs_19776756742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3042;
     Object term3043;
     Object term3076;
     Object term3118;
     Object term3120;
     Object term3122;

    public RottingOranges_dfs_19776756742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3042 = newInstance(Class.forName("leetcode.medium.RottingOranges"));
        term3043 = (Object[]) newArray("[I", 5);
        int[] term3044 = (int[]) newIntArray(9);
        int[] term3054 = (int[]) newIntArray(3);
        int[] term3058 = (int[]) newIntArray(9);
        int[] term3068 = (int[]) newIntArray(3);
        int[] term3072 = (int[]) newIntArray(3);
        setIntElement(term3044, 0, 47118909);
        setIntElement(term3044, 1, -2093707412);
        setIntElement(term3044, 2, -680627153);
        setIntElement(term3044, 3, 722519669);
        setIntElement(term3044, 4, -40335961);
        setIntElement(term3044, 5, 175343605);
        setIntElement(term3044, 6, 1050853183);
        setIntElement(term3044, 7, 848428785);
        setIntElement(term3044, 8, -1984436481);
        setElement(term3043, 0, term3044);
        setIntElement(term3054, 0, -407582855);
        setIntElement(term3054, 1, 1190753616);
        setIntElement(term3054, 2, -752378450);
        setElement(term3043, 1, term3054);
        setIntElement(term3058, 0, 848907965);
        setIntElement(term3058, 1, 1865070548);
        setIntElement(term3058, 2, 1904515443);
        setIntElement(term3058, 3, 1361126430);
        setIntElement(term3058, 4, 1728588701);
        setIntElement(term3058, 5, -355769268);
        setIntElement(term3058, 6, -114460662);
        setIntElement(term3058, 7, -355376034);
        setIntElement(term3058, 8, 588390599);
        setElement(term3043, 2, term3058);
        setIntElement(term3068, 0, -95969566);
        setIntElement(term3068, 1, -68615285);
        setIntElement(term3068, 2, -337504086);
        setElement(term3043, 3, term3068);
        setIntElement(term3072, 0, 2074130991);
        setIntElement(term3072, 1, 532588266);
        setIntElement(term3072, 2, -1286686332);
        setElement(term3043, 4, term3072);
        term3076 = (Object[]) newArray("[I", 8);
        int[] term3077 = (int[]) newIntArray(2);
        int[] term3080 = (int[]) newIntArray(3);
        int[] term3084 = (int[]) newIntArray(6);
        int[] term3091 = (int[]) newIntArray(1);
        int[] term3093 = (int[]) newIntArray(7);
        int[] term3101 = (int[]) newIntArray(3);
        int[] term3105 = (int[]) newIntArray(4);
        int[] term3110 = (int[]) newIntArray(7);
        setIntElement(term3077, 0, -284885486);
        setIntElement(term3077, 1, 1791984446);
        setElement(term3076, 0, term3077);
        setIntElement(term3080, 0, 804070622);
        setIntElement(term3080, 1, 1850364894);
        setIntElement(term3080, 2, 915367534);
        setElement(term3076, 1, term3080);
        setIntElement(term3084, 0, 1949983666);
        setIntElement(term3084, 1, 154111854);
        setIntElement(term3084, 2, 710986341);
        setIntElement(term3084, 3, -873958002);
        setIntElement(term3084, 4, -1780848958);
        setIntElement(term3084, 5, 1235045850);
        setElement(term3076, 2, term3084);
        setIntElement(term3091, 0, -75143033);
        setElement(term3076, 3, term3091);
        setIntElement(term3093, 0, 797015478);
        setIntElement(term3093, 1, 717574276);
        setIntElement(term3093, 2, 1795369860);
        setIntElement(term3093, 3, -570164389);
        setIntElement(term3093, 4, 43200329);
        setIntElement(term3093, 5, 998679955);
        setIntElement(term3093, 6, 953741504);
        setElement(term3076, 4, term3093);
        setIntElement(term3101, 0, 1389452261);
        setIntElement(term3101, 1, 1615957955);
        setIntElement(term3101, 2, 1779370220);
        setElement(term3076, 5, term3101);
        setIntElement(term3105, 0, -1716046610);
        setIntElement(term3105, 1, 65264024);
        setIntElement(term3105, 2, -252449812);
        setIntElement(term3105, 3, -1885268968);
        setElement(term3076, 6, term3105);
        setIntElement(term3110, 0, 277855691);
        setIntElement(term3110, 1, 675891483);
        setIntElement(term3110, 2, -317900470);
        setIntElement(term3110, 3, -979568);
        setIntElement(term3110, 4, -1422131197);
        setIntElement(term3110, 5, -20399281);
        setIntElement(term3110, 6, -830170410);
        setElement(term3076, 7, term3110);
        term3118 = new Integer(-1742790308);
        term3120 = new Integer(-1592093430);
        term3122 = new Integer(1178214545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.RottingOranges");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term3043;
        args[1] = term3076;
        args[2] = term3118;
        args[3] = term3120;
        args[4] = term3122;
        callMethod(klass, "dfs", argTypes, term3042, args);
    }

};


