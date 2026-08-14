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
import java.lang.String;
import java.lang.Object;

public class KeyWord_toString_17087247221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33156;

    public KeyWord_toString_17087247221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33222 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term33221 = ((Class) term33222).getDeclaredField((String) "AbstractType");
        ((Field) term33221).setAccessible(true);
        Object enum109 = ((Field) term33221).get((Object) null);
        term33156 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.KeyWord"));
        setField(term33156, term33156.getClass(), "name", "FwPbDZcHmB");
        setField(term33156, term33156.getClass(), "nodeType", enum109);
        setIntField(term33156, term33156.getClass(), "start", -1122880881);
        setIntField(term33156, term33156.getClass(), "end", -542712742);
        setField(term33156, term33156.getClass(), "file", "RMsXuyzKJV");
        setField(term33156, term33156.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.KeyWord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33156, args);
    }

};


