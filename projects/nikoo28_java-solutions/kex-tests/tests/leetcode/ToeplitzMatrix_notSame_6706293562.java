package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ToeplitzMatrix_notSame_6706293562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;
     Object term1101;
     Object term1165;
     Object term1167;
     Object term1169;
     Object term1171;
     Object term1173;

    public ToeplitzMatrix_notSame_6706293562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1100 = newInstance(Class.forName("leetcode.ToeplitzMatrix"));
        term1101 = (Object[]) newArray("[I", 9);
        int[] term1102 = (int[]) newIntArray(4);
        int[] term1107 = (int[]) newIntArray(8);
        int[] term1116 = (int[]) newIntArray(6);
        int[] term1123 = (int[]) newIntArray(2);
        int[] term1126 = (int[]) newIntArray(8);
        int[] term1135 = (int[]) newIntArray(3);
        int[] term1139 = (int[]) newIntArray(6);
        int[] term1146 = (int[]) newIntArray(8);
        int[] term1155 = (int[]) newIntArray(9);
        setIntElement(term1102, 0, 1328271830);
        setIntElement(term1102, 1, 1596070772);
        setIntElement(term1102, 2, 97029295);
        setIntElement(term1102, 3, -1371869594);
        setElement(term1101, 0, term1102);
        setIntElement(term1107, 0, -2095575670);
        setIntElement(term1107, 1, 1225272962);
        setIntElement(term1107, 2, 1324040357);
        setIntElement(term1107, 3, -1588772968);
        setIntElement(term1107, 4, -93135961);
        setIntElement(term1107, 5, -112921587);
        setIntElement(term1107, 6, 933028652);
        setIntElement(term1107, 7, 287287233);
        setElement(term1101, 1, term1107);
        setIntElement(term1116, 0, 962840079);
        setIntElement(term1116, 1, 1540719661);
        setIntElement(term1116, 2, 1265463001);
        setIntElement(term1116, 3, 335112684);
        setIntElement(term1116, 4, 1551099402);
        setIntElement(term1116, 5, -2027534003);
        setElement(term1101, 2, term1116);
        setIntElement(term1123, 0, 1063420942);
        setIntElement(term1123, 1, 1375330971);
        setElement(term1101, 3, term1123);
        setIntElement(term1126, 0, -478195677);
        setIntElement(term1126, 1, 972867650);
        setIntElement(term1126, 2, 1655935355);
        setIntElement(term1126, 3, -481533957);
        setIntElement(term1126, 4, 1240914516);
        setIntElement(term1126, 5, -1465035361);
        setIntElement(term1126, 6, 1090617576);
        setIntElement(term1126, 7, -1547384488);
        setElement(term1101, 4, term1126);
        setIntElement(term1135, 0, 1442160736);
        setIntElement(term1135, 1, 1114000454);
        setIntElement(term1135, 2, -556405712);
        setElement(term1101, 5, term1135);
        setIntElement(term1139, 0, -1772434990);
        setIntElement(term1139, 1, -1845499264);
        setIntElement(term1139, 2, -505439934);
        setIntElement(term1139, 3, -344842608);
        setIntElement(term1139, 4, 941650513);
        setIntElement(term1139, 5, 444029505);
        setElement(term1101, 6, term1139);
        setIntElement(term1146, 0, -1034506028);
        setIntElement(term1146, 1, -1263114719);
        setIntElement(term1146, 2, -894662986);
        setIntElement(term1146, 3, 304775596);
        setIntElement(term1146, 4, -1347665717);
        setIntElement(term1146, 5, -1888585309);
        setIntElement(term1146, 6, 683666002);
        setIntElement(term1146, 7, 1596213415);
        setElement(term1101, 7, term1146);
        setIntElement(term1155, 0, -268815336);
        setIntElement(term1155, 1, -1210583429);
        setIntElement(term1155, 2, -663691365);
        setIntElement(term1155, 3, 339854490);
        setIntElement(term1155, 4, -615654495);
        setIntElement(term1155, 5, -1476117762);
        setIntElement(term1155, 6, -341962980);
        setIntElement(term1155, 7, 1532716628);
        setIntElement(term1155, 8, -1801760683);
        setElement(term1101, 8, term1155);
        term1165 = new Integer(1141317871);
        term1167 = new Integer(890669485);
        term1169 = new Integer(691577392);
        term1171 = new Integer(-893623680);
        term1173 = new Integer(-1963434938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ToeplitzMatrix");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term1101;
        args[1] = term1165;
        args[2] = term1167;
        args[3] = term1169;
        args[4] = term1171;
        args[5] = term1173;
        callMethod(klass, "notSame", argTypes, term1100, args);
    }

};


