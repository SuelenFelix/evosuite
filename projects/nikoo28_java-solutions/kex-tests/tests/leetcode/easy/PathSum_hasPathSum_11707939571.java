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
import java.lang.Integer;

public class PathSum_hasPathSum_11707939571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240;
     Object term241;
     Object term259;

    public PathSum_hasPathSum_11707939571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240 = newInstance(Class.forName("leetcode.easy.PathSum"));
        term241 = newInstance(Class.forName("util.TreeNode"));
        Object term243 = newInstance(Class.forName("util.TreeNode"));
        Object term245 = newInstance(Class.forName("util.TreeNode"));
        Object term247 = newInstance(Class.forName("util.TreeNode"));
        Object term249 = newInstance(Class.forName("util.TreeNode"));
        Object term251 = newInstance(Class.forName("util.TreeNode"));
        Object term253 = newInstance(Class.forName("util.TreeNode"));
        Object term255 = newInstance(Class.forName("util.TreeNode"));
        Object term257 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term241, term241.getClass(), "val", 292681826);
        setIntField(term243, term243.getClass(), "val", 458147407);
        setIntField(term245, term245.getClass(), "val", -184153539);
        setIntField(term247, term247.getClass(), "val", 493620644);
        setIntField(term249, term249.getClass(), "val", 1328271830);
        setField(term249, term249.getClass(), "left", null);
        setField(term249, term249.getClass(), "right", term243);
        setField(term247, term247.getClass(), "left", term249);
        setIntField(term251, term251.getClass(), "val", 1225272962);
        setField(term251, term251.getClass(), "left", null);
        setField(term251, term251.getClass(), "right", null);
        setField(term247, term247.getClass(), "right", term251);
        setField(term245, term245.getClass(), "left", term247);
        setIntField(term253, term253.getClass(), "val", -1371869594);
        setIntField(term255, term255.getClass(), "val", -2095575670);
        setField(term255, term255.getClass(), "left", term251);
        setField(term255, term255.getClass(), "right", term241);
        setField(term253, term253.getClass(), "left", term255);
        setIntField(term257, term257.getClass(), "val", 1596070772);
        setField(term257, term257.getClass(), "left", null);
        setField(term257, term257.getClass(), "right", term243);
        setField(term253, term253.getClass(), "right", term257);
        setField(term245, term245.getClass(), "right", term253);
        setField(term243, term243.getClass(), "left", term245);
        setField(term243, term243.getClass(), "right", term253);
        setField(term241, term241.getClass(), "left", term243);
        setField(term241, term241.getClass(), "right", term249);
        term259 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.PathSum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term241;
        args[1] = term259;
        callMethod(klass, "hasPathSum", argTypes, term240, args);
    }

};


