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

public class LowestCommonAncestorOfBinaryTree_lowestCommonAncestor_12769611951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430;
     Object term431;
     Object term449;
     Object term467;

    public LowestCommonAncestorOfBinaryTree_lowestCommonAncestor_12769611951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430 = newInstance(Class.forName("leetcode.medium.LowestCommonAncestorOfBinaryTree"));
        term431 = newInstance(Class.forName("util.TreeNode"));
        Object term433 = newInstance(Class.forName("util.TreeNode"));
        Object term435 = newInstance(Class.forName("util.TreeNode"));
        Object term437 = newInstance(Class.forName("util.TreeNode"));
        Object term439 = newInstance(Class.forName("util.TreeNode"));
        Object term441 = newInstance(Class.forName("util.TreeNode"));
        Object term443 = newInstance(Class.forName("util.TreeNode"));
        Object term445 = newInstance(Class.forName("util.TreeNode"));
        Object term447 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term431, term431.getClass(), "val", -556405712);
        setIntField(term433, term433.getClass(), "val", -1772434990);
        setIntField(term435, term435.getClass(), "val", -1845499264);
        setIntField(term437, term437.getClass(), "val", -505439934);
        setIntField(term439, term439.getClass(), "val", -344842608);
        setField(term439, term439.getClass(), "left", null);
        setField(term439, term439.getClass(), "right", term433);
        setField(term437, term437.getClass(), "left", term439);
        setIntField(term441, term441.getClass(), "val", -894662986);
        setField(term441, term441.getClass(), "left", null);
        setField(term441, term441.getClass(), "right", null);
        setField(term437, term437.getClass(), "right", term441);
        setField(term435, term435.getClass(), "left", term437);
        setIntField(term443, term443.getClass(), "val", -1034506028);
        setIntField(term445, term445.getClass(), "val", -1263114719);
        setField(term445, term445.getClass(), "left", term441);
        setField(term445, term445.getClass(), "right", term431);
        setField(term443, term443.getClass(), "left", term445);
        setIntField(term447, term447.getClass(), "val", 941650513);
        setField(term447, term447.getClass(), "left", null);
        setField(term447, term447.getClass(), "right", term433);
        setField(term443, term443.getClass(), "right", term447);
        setField(term435, term435.getClass(), "right", term443);
        setField(term433, term433.getClass(), "left", term435);
        setField(term433, term433.getClass(), "right", term443);
        setField(term431, term431.getClass(), "left", term433);
        setField(term431, term431.getClass(), "right", term439);
        term449 = newInstance(Class.forName("util.TreeNode"));
        Object term451 = newInstance(Class.forName("util.TreeNode"));
        Object term453 = newInstance(Class.forName("util.TreeNode"));
        Object term455 = newInstance(Class.forName("util.TreeNode"));
        Object term457 = newInstance(Class.forName("util.TreeNode"));
        Object term459 = newInstance(Class.forName("util.TreeNode"));
        Object term461 = newInstance(Class.forName("util.TreeNode"));
        Object term463 = newInstance(Class.forName("util.TreeNode"));
        Object term465 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term449, term449.getClass(), "val", 304775596);
        setIntField(term451, term451.getClass(), "val", -1347665717);
        setIntField(term453, term453.getClass(), "val", -1888585309);
        setIntField(term455, term455.getClass(), "val", 683666002);
        setIntField(term457, term457.getClass(), "val", 1596213415);
        setField(term457, term457.getClass(), "left", null);
        setField(term457, term457.getClass(), "right", term451);
        setField(term455, term455.getClass(), "left", term457);
        setIntField(term459, term459.getClass(), "val", -615654495);
        setField(term459, term459.getClass(), "left", null);
        setField(term459, term459.getClass(), "right", null);
        setField(term455, term455.getClass(), "right", term459);
        setField(term453, term453.getClass(), "left", term455);
        setIntField(term461, term461.getClass(), "val", -663691365);
        setIntField(term463, term463.getClass(), "val", 339854490);
        setField(term463, term463.getClass(), "left", term459);
        setField(term463, term463.getClass(), "right", term449);
        setField(term461, term461.getClass(), "left", term463);
        setIntField(term465, term465.getClass(), "val", -268815336);
        setField(term465, term465.getClass(), "left", null);
        setField(term465, term465.getClass(), "right", term451);
        setField(term461, term461.getClass(), "right", term465);
        setField(term453, term453.getClass(), "right", term461);
        setField(term451, term451.getClass(), "left", term453);
        setField(term451, term451.getClass(), "right", term461);
        setField(term449, term449.getClass(), "left", term451);
        setField(term449, term449.getClass(), "right", term457);
        term467 = newInstance(Class.forName("util.TreeNode"));
        Object term469 = newInstance(Class.forName("util.TreeNode"));
        Object term471 = newInstance(Class.forName("util.TreeNode"));
        Object term473 = newInstance(Class.forName("util.TreeNode"));
        Object term475 = newInstance(Class.forName("util.TreeNode"));
        Object term477 = newInstance(Class.forName("util.TreeNode"));
        Object term479 = newInstance(Class.forName("util.TreeNode"));
        Object term481 = newInstance(Class.forName("util.TreeNode"));
        Object term483 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term467, term467.getClass(), "val", -1476117762);
        setIntField(term469, term469.getClass(), "val", -341962980);
        setIntField(term471, term471.getClass(), "val", 1532716628);
        setIntField(term473, term473.getClass(), "val", -1801760683);
        setIntField(term475, term475.getClass(), "val", 1141317871);
        setField(term475, term475.getClass(), "left", null);
        setField(term475, term475.getClass(), "right", term469);
        setField(term473, term473.getClass(), "left", term475);
        setIntField(term477, term477.getClass(), "val", 906181092);
        setField(term477, term477.getClass(), "left", null);
        setField(term477, term477.getClass(), "right", null);
        setField(term473, term473.getClass(), "right", term477);
        setField(term471, term471.getClass(), "left", term473);
        setIntField(term479, term479.getClass(), "val", -893623680);
        setIntField(term481, term481.getClass(), "val", -1963434938);
        setField(term481, term481.getClass(), "left", term477);
        setField(term481, term481.getClass(), "right", term467);
        setField(term479, term479.getClass(), "left", term481);
        setIntField(term483, term483.getClass(), "val", 890669485);
        setField(term483, term483.getClass(), "left", null);
        setField(term483, term483.getClass(), "right", term469);
        setField(term479, term479.getClass(), "right", term483);
        setField(term471, term471.getClass(), "right", term479);
        setField(term469, term469.getClass(), "left", term471);
        setField(term469, term469.getClass(), "right", term479);
        setField(term467, term467.getClass(), "left", term469);
        setField(term467, term467.getClass(), "right", term475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LowestCommonAncestorOfBinaryTree");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("util.TreeNode");
        argTypes[2] = Class.forName("util.TreeNode");
        Object[] args = new Object[3];
        args[0] = term431;
        args[1] = term449;
        args[2] = term467;
        callMethod(klass, "lowestCommonAncestor", argTypes, term430, args);
    }

};


