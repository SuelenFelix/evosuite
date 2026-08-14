package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Try_toString_20599275241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27108;

    public Try_toString_20599275241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27110 = new ArrayList();
        Class<? extends Object> term27253 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term27252 = ((Class) term27253).getDeclaredField((String) "Nothing");
        ((Field) term27252).setAccessible(true);
        Object enum89 = ((Field) term27252).get((Object) null);
        ArrayList term27154 = new ArrayList();
        ((ArrayList) term27154).add((Object)null);
        ((ArrayList) term27154).add((Object)null);
        ((ArrayList) term27154).add((Object)null);
        ((ArrayList) term27154).add((Object)null);
        ((ArrayList) term27154).add((Object)null);
        Class<? extends Object> term27516 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term27515 = ((Class) term27516).getDeclaredField((String) "Comma");
        ((Field) term27515).setAccessible(true);
        Object enum90 = ((Field) term27515).get((Object) null);
        Object term27153 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch"));
        Object term27157 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term27153, term27153.getClass(), "binders", term27154);
        setField(term27157, term27157.getClass(), "args", null);
        setField(term27157, term27157.getClass(), "nodeType", null);
        setIntField(term27157, term27157.getClass(), "start", 497269071);
        setIntField(term27157, term27157.getClass(), "end", -1899301124);
        setField(term27157, term27157.getClass(), "file", null);
        setField(term27157, term27157.getClass(), "parent", null);
        setField(term27157, term27157.getClass(), "name", null);
        setField(term27153, term27153.getClass(), "body", term27157);
        setField(term27153, term27153.getClass(), "nodeType", enum90);
        setIntField(term27153, term27153.getClass(), "start", -1882480155);
        setIntField(term27153, term27153.getClass(), "end", -1410220680);
        setField(term27153, term27153.getClass(), "file", "");
        setField(term27153, term27153.getClass(), "parent", null);
        setField(term27153, term27153.getClass(), "name", "");
        ArrayList term27151 = new ArrayList();
        ((ArrayList) term27151).add(term27153);
        ArrayList term27169 = new ArrayList();
        ((ArrayList) term27169).add((Object)null);
        ((ArrayList) term27169).add((Object)null);
        ((ArrayList) term27169).add((Object)null);
        ((ArrayList) term27169).add((Object)null);
        Class<? extends Object> term27753 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term27752 = ((Class) term27753).getDeclaredField((String) "JuliaFloat");
        ((Field) term27752).setAccessible(true);
        Object enum91 = ((Field) term27752).get((Object) null);
        Class<? extends Object> term28025 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term28024 = ((Class) term28025).getDeclaredField((String) "JuliaBool");
        ((Field) term28024).setAccessible(true);
        Object enum92 = ((Field) term28024).get((Object) null);
        term27108 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Try"));
        Object term27109 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        Object term27168 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term27109, term27109.getClass(), "args", term27110);
        setField(term27109, term27109.getClass(), "nodeType", enum89);
        setIntField(term27109, term27109.getClass(), "start", 1687361082);
        setIntField(term27109, term27109.getClass(), "end", 584893196);
        setField(term27109, term27109.getClass(), "file", "smnHEqRFRx");
        setField(term27109, term27109.getClass(), "parent", null);
        setField(term27109, term27109.getClass(), "name", "XYtryyobou");
        setField(term27108, term27108.getClass(), "body", term27109);
        setField(term27108, term27108.getClass(), "catches", term27151);
        setField(term27168, term27168.getClass(), "args", term27169);
        setField(term27168, term27168.getClass(), "nodeType", enum91);
        setIntField(term27168, term27168.getClass(), "start", 389427431);
        setIntField(term27168, term27168.getClass(), "end", -1945706126);
        setField(term27168, term27168.getClass(), "file", "zUlRdimJtU");
        setField(term27168, term27168.getClass(), "parent", null);
        setField(term27168, term27168.getClass(), "name", "vwbEQQNQrx");
        setField(term27108, term27108.getClass(), "finallyBody", term27168);
        setField(term27108, term27108.getClass(), "nodeType", enum92);
        setIntField(term27108, term27108.getClass(), "start", 1152356969);
        setIntField(term27108, term27108.getClass(), "end", -1667990367);
        setField(term27108, term27108.getClass(), "file", "xtftXXMbem");
        setField(term27108, term27108.getClass(), "parent", null);
        setField(term27108, term27108.getClass(), "name", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Try");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27108, args);
    }

};


