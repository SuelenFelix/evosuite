package pikaparser.ast;

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
import static pikaparser.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ASTNode_getOnlyChild_4403081033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;

    public ASTNode_getOnlyChild_4403081033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term460 = new ArrayList();
        ((ArrayList) term460).add((Object)null);
        ((ArrayList) term460).add((Object)null);
        ((ArrayList) term460).add((Object)null);
        ((ArrayList) term460).add((Object)null);
        ((ArrayList) term460).add((Object)null);
        ((ArrayList) term460).add((Object)null);
        Object term455 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term455, term455.getClass(), "label", "");
        setField(term455, term455.getClass(), "nodeType", null);
        setIntField(term455, term455.getClass(), "startPos", 1375330971);
        setIntField(term455, term455.getClass(), "len", -478195677);
        setField(term455, term455.getClass(), "input", "");
        setField(term455, term455.getClass(), "children", term460);
        Object term463 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term463, term463.getClass(), "label", null);
        setField(term463, term463.getClass(), "nodeType", null);
        setIntField(term463, term463.getClass(), "startPos", 0);
        setIntField(term463, term463.getClass(), "len", 0);
        setField(term463, term463.getClass(), "input", null);
        setField(term463, term463.getClass(), "children", null);
        ArrayList term453 = new ArrayList();
        ((ArrayList) term453).add(term455);
        ((ArrayList) term453).add(term463);
        term426 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term426, term426.getClass(), "label", "hNxWaHcfhY");
        setField(term426, term426.getClass(), "nodeType", null);
        setIntField(term426, term426.getClass(), "startPos", -2027534003);
        setIntField(term426, term426.getClass(), "len", 1063420942);
        setField(term426, term426.getClass(), "input", "RkybSrpybU");
        setField(term426, term426.getClass(), "children", term453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOnlyChild", argTypes, term426, args);
    }

};


