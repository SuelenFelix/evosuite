package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LowestCommonAncestorOfBinarySearchTree_lowestCommonAncestor_16109314401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term673;
     Object term691;
     Object term709;

    public LowestCommonAncestorOfBinarySearchTree_lowestCommonAncestor_16109314401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("leetcode.easy.LowestCommonAncestorOfBinarySearchTree"));
        term673 = newInstance(Class.forName("util.TreeNode"));
        Object term675 = newInstance(Class.forName("util.TreeNode"));
        Object term677 = newInstance(Class.forName("util.TreeNode"));
        Object term679 = newInstance(Class.forName("util.TreeNode"));
        Object term681 = newInstance(Class.forName("util.TreeNode"));
        Object term683 = newInstance(Class.forName("util.TreeNode"));
        Object term685 = newInstance(Class.forName("util.TreeNode"));
        Object term687 = newInstance(Class.forName("util.TreeNode"));
        Object term689 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term673, term673.getClass(), "val", 1107176718);
        setIntField(term675, term675.getClass(), "val", 480137250);
        setIntField(term677, term677.getClass(), "val", -341152642);
        setIntField(term679, term679.getClass(), "val", -2015854073);
        setIntField(term681, term681.getClass(), "val", 538259104);
        setField(term681, term681.getClass(), "left", null);
        setField(term681, term681.getClass(), "right", term675);
        setField(term679, term679.getClass(), "left", term681);
        setIntField(term683, term683.getClass(), "val", 71190297);
        setField(term683, term683.getClass(), "left", null);
        setField(term683, term683.getClass(), "right", null);
        setField(term679, term679.getClass(), "right", term683);
        setField(term677, term677.getClass(), "left", term679);
        setIntField(term685, term685.getClass(), "val", 107945604);
        setIntField(term687, term687.getClass(), "val", -1963464809);
        setField(term687, term687.getClass(), "left", term683);
        setField(term687, term687.getClass(), "right", term673);
        setField(term685, term685.getClass(), "left", term687);
        setIntField(term689, term689.getClass(), "val", 96566506);
        setField(term689, term689.getClass(), "left", null);
        setField(term689, term689.getClass(), "right", term675);
        setField(term685, term685.getClass(), "right", term689);
        setField(term677, term677.getClass(), "right", term685);
        setField(term675, term675.getClass(), "left", term677);
        setField(term675, term675.getClass(), "right", term685);
        setField(term673, term673.getClass(), "left", term675);
        setField(term673, term673.getClass(), "right", term681);
        term691 = newInstance(Class.forName("util.TreeNode"));
        Object term693 = newInstance(Class.forName("util.TreeNode"));
        Object term695 = newInstance(Class.forName("util.TreeNode"));
        Object term697 = newInstance(Class.forName("util.TreeNode"));
        Object term699 = newInstance(Class.forName("util.TreeNode"));
        Object term701 = newInstance(Class.forName("util.TreeNode"));
        Object term703 = newInstance(Class.forName("util.TreeNode"));
        Object term705 = newInstance(Class.forName("util.TreeNode"));
        Object term707 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term691, term691.getClass(), "val", 1202361360);
        setIntField(term693, term693.getClass(), "val", -2015048153);
        setIntField(term695, term695.getClass(), "val", -2063457669);
        setIntField(term697, term697.getClass(), "val", -1222006000);
        setIntField(term699, term699.getClass(), "val", 2095798786);
        setField(term699, term699.getClass(), "left", null);
        setField(term699, term699.getClass(), "right", term693);
        setField(term697, term697.getClass(), "left", term699);
        setIntField(term701, term701.getClass(), "val", 1555897383);
        setField(term701, term701.getClass(), "left", null);
        setField(term701, term701.getClass(), "right", null);
        setField(term697, term697.getClass(), "right", term701);
        setField(term695, term695.getClass(), "left", term697);
        setIntField(term703, term703.getClass(), "val", 9726679);
        setIntField(term705, term705.getClass(), "val", -25637976);
        setField(term705, term705.getClass(), "left", term701);
        setField(term705, term705.getClass(), "right", term691);
        setField(term703, term703.getClass(), "left", term705);
        setIntField(term707, term707.getClass(), "val", -1565502840);
        setField(term707, term707.getClass(), "left", null);
        setField(term707, term707.getClass(), "right", term693);
        setField(term703, term703.getClass(), "right", term707);
        setField(term695, term695.getClass(), "right", term703);
        setField(term693, term693.getClass(), "left", term695);
        setField(term693, term693.getClass(), "right", term703);
        setField(term691, term691.getClass(), "left", term693);
        setField(term691, term691.getClass(), "right", term699);
        term709 = newInstance(Class.forName("util.TreeNode"));
        Object term711 = newInstance(Class.forName("util.TreeNode"));
        Object term713 = newInstance(Class.forName("util.TreeNode"));
        Object term715 = newInstance(Class.forName("util.TreeNode"));
        Object term717 = newInstance(Class.forName("util.TreeNode"));
        Object term719 = newInstance(Class.forName("util.TreeNode"));
        Object term721 = newInstance(Class.forName("util.TreeNode"));
        Object term723 = newInstance(Class.forName("util.TreeNode"));
        Object term725 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term709, term709.getClass(), "val", 202001407);
        setIntField(term711, term711.getClass(), "val", 158873461);
        setIntField(term713, term713.getClass(), "val", -430151637);
        setIntField(term715, term715.getClass(), "val", -1697741339);
        setIntField(term717, term717.getClass(), "val", 98922530);
        setField(term717, term717.getClass(), "left", null);
        setField(term717, term717.getClass(), "right", term711);
        setField(term715, term715.getClass(), "left", term717);
        setIntField(term719, term719.getClass(), "val", 1830648570);
        setField(term719, term719.getClass(), "left", null);
        setField(term719, term719.getClass(), "right", null);
        setField(term715, term715.getClass(), "right", term719);
        setField(term713, term713.getClass(), "left", term715);
        setIntField(term721, term721.getClass(), "val", 2098647989);
        setIntField(term723, term723.getClass(), "val", 1598895173);
        setField(term723, term723.getClass(), "left", term719);
        setField(term723, term723.getClass(), "right", term709);
        setField(term721, term721.getClass(), "left", term723);
        setIntField(term725, term725.getClass(), "val", -1388471422);
        setField(term725, term725.getClass(), "left", null);
        setField(term725, term725.getClass(), "right", term711);
        setField(term721, term721.getClass(), "right", term725);
        setField(term713, term713.getClass(), "right", term721);
        setField(term711, term711.getClass(), "left", term713);
        setField(term711, term711.getClass(), "right", term721);
        setField(term709, term709.getClass(), "left", term711);
        setField(term709, term709.getClass(), "right", term717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.LowestCommonAncestorOfBinarySearchTree");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("util.TreeNode");
        argTypes[2] = Class.forName("util.TreeNode");
        Object[] args = new Object[3];
        args[0] = term673;
        args[1] = term691;
        args[2] = term709;
        callMethod(klass, "lowestCommonAncestor", argTypes, term672, args);
    }

};


