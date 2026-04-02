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
import java.lang.String;

public class AbstractType_toString_10624605311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8390;

    public AbstractType_toString_10624605311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8514 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term8513 = ((Class) term8514).getDeclaredField((String) "LOCAL");
        ((Field) term8513).setAccessible(true);
        Object enum26 = ((Field) term8513).get((Object) null);
        Class<? extends Object> term8761 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term8760 = ((Class) term8761).getDeclaredField((String) "Block");
        ((Field) term8760).setAccessible(true);
        Object enum27 = ((Field) term8760).get((Object) null);
        Class<? extends Object> term9018 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term9017 = ((Class) term9018).getDeclaredField((String) "JuliaBool");
        ((Field) term9017).setAccessible(true);
        Object enum28 = ((Field) term9017).get((Object) null);
        Class<? extends Object> term9287 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term9286 = ((Class) term9287).getDeclaredField((String) "RSQUARE");
        ((Field) term9286).setAccessible(true);
        Object enum29 = ((Field) term9286).get((Object) null);
        term8390 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.AbstractType"));
        Object term8391 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term8436 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term8391, term8391.getClass(), "type", enum26);
        setField(term8391, term8391.getClass(), "nodeType", enum27);
        setIntField(term8391, term8391.getClass(), "start", -1588772968);
        setIntField(term8391, term8391.getClass(), "end", -93135961);
        setField(term8391, term8391.getClass(), "file", "YRHGsAkhxb");
        setField(term8391, term8391.getClass(), "parent", null);
        setField(term8391, term8391.getClass(), "name", "ffYhPOzlUs");
        setField(term8390, term8390.getClass(), "name", term8391);
        setField(term8436, term8436.getClass(), "type", enum26);
        setField(term8436, term8436.getClass(), "nodeType", enum28);
        setIntField(term8436, term8436.getClass(), "start", -112921587);
        setIntField(term8436, term8436.getClass(), "end", 933028652);
        setField(term8436, term8436.getClass(), "file", "MLqYREekMl");
        setField(term8436, term8436.getClass(), "parent", null);
        setField(term8436, term8436.getClass(), "name", "ytSBIKXogI");
        setField(term8390, term8390.getClass(), "base", term8436);
        setField(term8390, term8390.getClass(), "nodeType", enum29);
        setIntField(term8390, term8390.getClass(), "start", 287287233);
        setIntField(term8390, term8390.getClass(), "end", 962840079);
        setField(term8390, term8390.getClass(), "file", "nHXjMycHlU");
        setField(term8390, term8390.getClass(), "parent", null);
        setField(term8390, term8390.getClass(), "name", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.AbstractType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8390, args);
    }

};


