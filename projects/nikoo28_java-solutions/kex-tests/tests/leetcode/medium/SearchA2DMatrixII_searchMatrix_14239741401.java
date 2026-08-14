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

public class SearchA2DMatrixII_searchMatrix_14239741401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term774;
     Object term775;
     Object term816;

    public SearchA2DMatrixII_searchMatrix_14239741401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term774 = newInstance(Class.forName("leetcode.medium.SearchA2DMatrixII"));
        term775 = (Object[]) newArray("[I", 8);
        int[] term776 = (int[]) newIntArray(9);
        int[] term786 = (int[]) newIntArray(7);
        int[] term794 = (int[]) newIntArray(3);
        int[] term798 = (int[]) newIntArray(4);
        int[] term803 = (int[]) newIntArray(2);
        int[] term806 = (int[]) newIntArray(5);
        int[] term812 = (int[]) newIntArray(0);
        int[] term813 = (int[]) newIntArray(2);
        setIntElement(term776, 0, -2104981311);
        setIntElement(term776, 1, -571169753);
        setIntElement(term776, 2, 318591690);
        setIntElement(term776, 3, -165587447);
        setIntElement(term776, 4, -1347358701);
        setIntElement(term776, 5, 806595993);
        setIntElement(term776, 6, 548228925);
        setIntElement(term776, 7, -749861210);
        setIntElement(term776, 8, 1694224101);
        setElement(term775, 0, term776);
        setIntElement(term786, 0, 937859191);
        setIntElement(term786, 1, -916584829);
        setIntElement(term786, 2, -2131181468);
        setIntElement(term786, 3, 282916351);
        setIntElement(term786, 4, 880977281);
        setIntElement(term786, 5, 371943306);
        setIntElement(term786, 6, 982388293);
        setElement(term775, 1, term786);
        setIntElement(term794, 0, -159494544);
        setIntElement(term794, 1, -75206835);
        setIntElement(term794, 2, -1618206977);
        setElement(term775, 2, term794);
        setIntElement(term798, 0, -1747406163);
        setIntElement(term798, 1, 388157121);
        setIntElement(term798, 2, 1684998508);
        setIntElement(term798, 3, -1476644457);
        setElement(term775, 3, term798);
        setIntElement(term803, 0, 1270666529);
        setIntElement(term803, 1, -1146679443);
        setElement(term775, 4, term803);
        setIntElement(term806, 0, -860131894);
        setIntElement(term806, 1, -1022990421);
        setIntElement(term806, 2, 1045547089);
        setIntElement(term806, 3, -1122880881);
        setIntElement(term806, 4, -542712742);
        setElement(term775, 5, term806);
        setElement(term775, 6, term812);
        setIntElement(term813, 0, -1254072822);
        setIntElement(term813, 1, -1111249833);
        setElement(term775, 7, term813);
        term816 = new Integer(-1692331299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchA2DMatrixII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term775;
        args[1] = term816;
        callMethod(klass, "searchMatrix", argTypes, term774, args);
    }

};


