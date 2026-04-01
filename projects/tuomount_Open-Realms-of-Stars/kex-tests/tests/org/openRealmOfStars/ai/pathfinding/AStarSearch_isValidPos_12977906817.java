package org.openRealmOfStars.ai.pathfinding;

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
import static org.openRealmOfStars.ai.pathfinding.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class AStarSearch_isValidPos_12977906817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16961;
     Object term17057;
     Object term17059;

    public AStarSearch_isValidPos_12977906817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17015 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17015, term17015.getClass(), "x", 1979044375);
        setIntField(term17015, term17015.getClass(), "y", 961252909);
        setDoubleField(term17015, term17015.getClass(), "distance", 0.10667076642995188);
        Object term17019 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17019, term17019.getClass(), "x", 1455842357);
        setIntField(term17019, term17019.getClass(), "y", 1349806561);
        setDoubleField(term17019, term17019.getClass(), "distance", 0.11493000848982304);
        Object term17023 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17023, term17023.getClass(), "x", 923905351);
        setIntField(term17023, term17023.getClass(), "y", 428360161);
        setDoubleField(term17023, term17023.getClass(), "distance", 0.37161417339133307);
        Object term17027 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17027, term17027.getClass(), "x", 631528579);
        setIntField(term17027, term17027.getClass(), "y", -1652091834);
        setDoubleField(term17027, term17027.getClass(), "distance", 0.6805867182029153);
        Object term17031 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17031, term17031.getClass(), "x", -282021579);
        setIntField(term17031, term17031.getClass(), "y", -1652588127);
        setDoubleField(term17031, term17031.getClass(), "distance", 0.2852810965221698);
        Object term17035 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17035, term17035.getClass(), "x", -1902823385);
        setIntField(term17035, term17035.getClass(), "y", -784924879);
        setDoubleField(term17035, term17035.getClass(), "distance", 0.6300849762307866);
        Object term17039 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17039, term17039.getClass(), "x", -1062027102);
        setIntField(term17039, term17039.getClass(), "y", 1763217806);
        setDoubleField(term17039, term17039.getClass(), "distance", 0.9737083944266686);
        Object term17043 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17043, term17043.getClass(), "x", 1644949396);
        setIntField(term17043, term17043.getClass(), "y", -2017073245);
        setDoubleField(term17043, term17043.getClass(), "distance", 0.0668892744806211);
        ArrayList term17013 = new ArrayList();
        ((ArrayList) term17013).add(term17015);
        ((ArrayList) term17013).add(term17019);
        ((ArrayList) term17013).add(term17023);
        ((ArrayList) term17013).add(term17027);
        ((ArrayList) term17013).add(term17031);
        ((ArrayList) term17013).add(term17035);
        ((ArrayList) term17013).add(term17039);
        ((ArrayList) term17013).add(term17043);
        term16961 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term16964 = (Object[]) newArray("[I", 9);
        int[] term16965 = (int[]) newIntArray(7);
        int[] term16973 = (int[]) newIntArray(0);
        int[] term16974 = (int[]) newIntArray(0);
        int[] term16975 = (int[]) newIntArray(7);
        int[] term16983 = (int[]) newIntArray(3);
        int[] term16987 = (int[]) newIntArray(6);
        int[] term16994 = (int[]) newIntArray(6);
        int[] term17001 = (int[]) newIntArray(2);
        int[] term17004 = (int[]) newIntArray(8);
        Object term17052 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term16961, term16961.getClass(), "maxX", -1147965121);
        setIntField(term16961, term16961.getClass(), "maxY", -867099093);
        setIntElement(term16965, 0, -1091199008);
        setIntElement(term16965, 1, 1837886253);
        setIntElement(term16965, 2, -269528550);
        setIntElement(term16965, 3, 2108571355);
        setIntElement(term16965, 4, 1909966089);
        setIntElement(term16965, 5, 1827255916);
        setIntElement(term16965, 6, 2039815750);
        setElement(term16964, 0, term16965);
        setElement(term16964, 1, term16973);
        setElement(term16964, 2, term16974);
        setIntElement(term16975, 0, 2079590265);
        setIntElement(term16975, 1, -435079567);
        setIntElement(term16975, 2, -1017617829);
        setIntElement(term16975, 3, 270928865);
        setIntElement(term16975, 4, -308526089);
        setIntElement(term16975, 5, -359675864);
        setIntElement(term16975, 6, -1671982964);
        setElement(term16964, 3, term16975);
        setIntElement(term16983, 0, 776218451);
        setIntElement(term16983, 1, -1362132929);
        setIntElement(term16983, 2, 1267740164);
        setElement(term16964, 4, term16983);
        setIntElement(term16987, 0, 1363887997);
        setIntElement(term16987, 1, -1744763945);
        setIntElement(term16987, 2, 852281447);
        setIntElement(term16987, 3, 1248430530);
        setIntElement(term16987, 4, -1911828505);
        setIntElement(term16987, 5, 241725499);
        setElement(term16964, 5, term16987);
        setIntElement(term16994, 0, 823179298);
        setIntElement(term16994, 1, 1174484848);
        setIntElement(term16994, 2, 939889496);
        setIntElement(term16994, 3, -495242269);
        setIntElement(term16994, 4, 932810106);
        setIntElement(term16994, 5, -2138801137);
        setElement(term16964, 6, term16994);
        setIntElement(term17001, 0, -1470115841);
        setIntElement(term17001, 1, 480909331);
        setElement(term16964, 7, term17001);
        setIntElement(term17004, 0, -2024983877);
        setIntElement(term17004, 1, 1757149811);
        setIntElement(term17004, 2, 1505375686);
        setIntElement(term17004, 3, -132005524);
        setIntElement(term17004, 4, -1235127374);
        setIntElement(term17004, 5, -2077814162);
        setIntElement(term17004, 6, 444514470);
        setIntElement(term17004, 7, -147055177);
        setElement(term16964, 8, term17004);
        setField(term16961, term16961.getClass(), "blockMap", term16964);
        setField(term16961, term16961.getClass(), "points", term17013);
        setIntField(term16961, term16961.getClass(), "tx", 522440332);
        setIntField(term16961, term16961.getClass(), "ty", 1516598327);
        setIntField(term16961, term16961.getClass(), "targetDistance", 82353584);
        setIntField(term17052, term17052.getClass(), "x", -758778797);
        setIntField(term17052, term17052.getClass(), "y", 765680355);
        setDoubleField(term17052, term17052.getClass(), "distance", 0.3587267442738795);
        setField(term16961, term16961.getClass(), "targetPoint", term17052);
        setIntField(term16961, term16961.getClass(), "routeIndex", -1012090049);
        term17057 = new Integer(-2025214553);
        term17059 = new Integer(-154750730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term17057;
        args[1] = term17059;
        callMethod(klass, "isValidPos", argTypes, term16961, args);
    }

};


