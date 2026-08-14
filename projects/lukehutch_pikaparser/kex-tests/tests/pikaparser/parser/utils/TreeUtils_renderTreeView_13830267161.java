package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class TreeUtils_renderTreeView_13830267161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1687;
     Object term1765;
     Object term1767;

    public TreeUtils_renderTreeView_13830267161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1721 = new ArrayList();
        ((ArrayList) term1721).add((Object)null);
        ((ArrayList) term1721).add((Object)null);
        ((ArrayList) term1721).add((Object)null);
        ((ArrayList) term1721).add((Object)null);
        ((ArrayList) term1721).add((Object)null);
        Object term1716 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term1716, term1716.getClass(), "label", "");
        setField(term1716, term1716.getClass(), "nodeType", null);
        setIntField(term1716, term1716.getClass(), "startPos", -203030934);
        setIntField(term1716, term1716.getClass(), "len", -1179120542);
        setField(term1716, term1716.getClass(), "input", "");
        setField(term1716, term1716.getClass(), "children", term1721);
        Object term1724 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term1724, term1724.getClass(), "label", "");
        setField(term1724, term1724.getClass(), "nodeType", null);
        setIntField(term1724, term1724.getClass(), "startPos", 0);
        setIntField(term1724, term1724.getClass(), "len", 0);
        setField(term1724, term1724.getClass(), "input", null);
        setField(term1724, term1724.getClass(), "children", null);
        Object term1728 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term1728, term1728.getClass(), "label", null);
        setField(term1728, term1728.getClass(), "nodeType", null);
        setIntField(term1728, term1728.getClass(), "startPos", 0);
        setIntField(term1728, term1728.getClass(), "len", 0);
        setField(term1728, term1728.getClass(), "input", null);
        setField(term1728, term1728.getClass(), "children", null);
        ArrayList term1736 = new ArrayList();
        ((ArrayList) term1736).add((Object)null);
        ((ArrayList) term1736).add((Object)null);
        ((ArrayList) term1736).add((Object)null);
        Object term1731 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term1731, term1731.getClass(), "label", "");
        setField(term1731, term1731.getClass(), "nodeType", null);
        setIntField(term1731, term1731.getClass(), "startPos", -1530420153);
        setIntField(term1731, term1731.getClass(), "len", -469968304);
        setField(term1731, term1731.getClass(), "input", "");
        setField(term1731, term1731.getClass(), "children", term1736);
        ArrayList term1714 = new ArrayList();
        ((ArrayList) term1714).add(term1716);
        ((ArrayList) term1714).add(term1724);
        ((ArrayList) term1714).add(term1728);
        ((ArrayList) term1714).add(term1728);
        ((ArrayList) term1714).add(term1731);
        ((ArrayList) term1714).add(term1724);
        term1687 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term1687, term1687.getClass(), "label", "xOcJIiQQDu");
        setField(term1687, term1687.getClass(), "nodeType", null);
        setIntField(term1687, term1687.getClass(), "startPos", -1275173084);
        setIntField(term1687, term1687.getClass(), "len", -244121226);
        setField(term1687, term1687.getClass(), "input", "GVizqqzXpy");
        setField(term1687, term1687.getClass(), "children", term1714);
        term1765 = new Boolean(false);
        term1767 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1768 = (byte[]) newByteArray(16);
        setField(term1767, term1767.getClass(), "value", term1768);
        setByteField(term1767, term1767.getClass(), "coder", (byte) 48);
        setIntField(term1767, term1767.getClass(), "count", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.TreeUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("pikaparser.ast.ASTNode");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[5];
        args[0] = term1687;
        args[1] = "vjxIhXHxGR";
        args[2] = "QXzGXbEXMu";
        args[3] = term1765;
        args[4] = term1767;
        callMethod(klass, "renderTreeView", argTypes, null, args);
    }

};


