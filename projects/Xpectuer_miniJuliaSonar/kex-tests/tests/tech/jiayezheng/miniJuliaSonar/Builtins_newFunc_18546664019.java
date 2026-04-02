package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.String;

public class Builtins_newFunc_18546664019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11703;

    public Builtins_newFunc_18546664019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11704 = new HashMap();
        ArrayList term11715 = new ArrayList();
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        ((ArrayList) term11715).add((Object)null);
        HashSet term11720 = new HashSet();
        HashMap term11721 = new HashMap();
        ArrayList term11728 = new ArrayList();
        ((ArrayList) term11728).add((Object)null);
        ((ArrayList) term11728).add((Object)null);
        ((ArrayList) term11728).add((Object)null);
        ((ArrayList) term11728).add((Object)null);
        ((ArrayList) term11728).add((Object)null);
        ((ArrayList) term11728).add((Object)null);
        ((ArrayList) term11728).add((Object)null);
        HashSet term11731 = new HashSet();
        Class<? extends Object> term11812 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term11811 = ((Class) term11812).getDeclaredField((String) "INSTANCE");
        ((Field) term11811).setAccessible(true);
        Object enum34 = ((Field) term11811).get((Object) null);
        ArrayList term11758 = new ArrayList();
        ((ArrayList) term11758).add((Object)null);
        ((ArrayList) term11758).add((Object)null);
        ((ArrayList) term11758).add((Object)null);
        ((ArrayList) term11758).add((Object)null);
        ((ArrayList) term11758).add((Object)null);
        ArrayList term11789 = new ArrayList();
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        ((ArrayList) term11789).add((Object)null);
        term11703 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        Object term11713 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11714 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term11719 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11726 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11727 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11762 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11775 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11776 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term11793 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11806 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term11807 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11808 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11809 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11810 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        setField(term11703, term11703.getClass(), "modules", term11704);
        setField(term11714, term11714.getClass(), "ctype", null);
        setField(term11714, term11714.getClass(), "params", term11715);
        setField(term11719, term11719.getClass(), "globalNames", term11720);
        setField(term11719, term11719.getClass(), "table", term11721);
        setField(term11726, term11726.getClass(), "globalNames", null);
        setField(term11726, term11726.getClass(), "table", null);
        setField(term11726, term11726.getClass(), "parent", null);
        setField(term11726, term11726.getClass(), "forwarding", null);
        setField(term11726, term11726.getClass(), "supers", null);
        setField(term11726, term11726.getClass(), "globalSymbols", null);
        setField(term11726, term11726.getClass(), "stateType", null);
        setField(term11726, term11726.getClass(), "type", null);
        setField(term11726, term11726.getClass(), "path", null);
        setField(term11719, term11719.getClass(), "parent", term11726);
        setField(term11727, term11727.getClass(), "globalNames", null);
        setField(term11727, term11727.getClass(), "table", null);
        setField(term11727, term11727.getClass(), "parent", null);
        setField(term11727, term11727.getClass(), "forwarding", null);
        setField(term11727, term11727.getClass(), "supers", null);
        setField(term11727, term11727.getClass(), "globalSymbols", null);
        setField(term11727, term11727.getClass(), "stateType", null);
        setField(term11727, term11727.getClass(), "type", null);
        setField(term11727, term11727.getClass(), "path", null);
        setField(term11719, term11719.getClass(), "forwarding", term11727);
        setField(term11719, term11719.getClass(), "supers", term11728);
        setField(term11719, term11719.getClass(), "globalSymbols", term11731);
        setField(term11719, term11719.getClass(), "stateType", enum34);
        setField(term11719, term11719.getClass(), "type", null);
        setField(term11719, term11719.getClass(), "path", null);
        setField(term11714, term11714.getClass(), "table", term11719);
        setField(term11714, term11714.getClass(), "file", "PNzNzzjSXM");
        setField(term11713, term11713.getClass(), "instance", term11714);
        setField(term11713, term11713.getClass(), "name", "ktKcSZiuGM");
        setField(term11713, term11713.getClass(), "baseType", term11758);
        setField(term11762, term11762.getClass(), "globalNames", null);
        setField(term11762, term11762.getClass(), "table", null);
        setField(term11762, term11762.getClass(), "parent", null);
        setField(term11762, term11762.getClass(), "forwarding", null);
        setField(term11762, term11762.getClass(), "supers", null);
        setField(term11762, term11762.getClass(), "globalSymbols", null);
        setField(term11762, term11762.getClass(), "stateType", null);
        setField(term11762, term11762.getClass(), "type", null);
        setField(term11762, term11762.getClass(), "path", null);
        setField(term11713, term11713.getClass(), "table", term11762);
        setField(term11713, term11713.getClass(), "file", "PSOttyUeqv");
        setField(term11703, term11703.getClass(), "BaseModule", term11713);
        setField(term11776, term11776.getClass(), "ctype", null);
        setField(term11776, term11776.getClass(), "params", null);
        setField(term11776, term11776.getClass(), "table", null);
        setField(term11776, term11776.getClass(), "file", null);
        setField(term11775, term11775.getClass(), "instance", term11776);
        setField(term11775, term11775.getClass(), "name", "HmEvTlmzXo");
        setField(term11775, term11775.getClass(), "baseType", term11789);
        setField(term11793, term11793.getClass(), "globalNames", null);
        setField(term11793, term11793.getClass(), "table", null);
        setField(term11793, term11793.getClass(), "parent", null);
        setField(term11793, term11793.getClass(), "forwarding", null);
        setField(term11793, term11793.getClass(), "supers", null);
        setField(term11793, term11793.getClass(), "globalSymbols", null);
        setField(term11793, term11793.getClass(), "stateType", null);
        setField(term11793, term11793.getClass(), "type", null);
        setField(term11793, term11793.getClass(), "path", null);
        setField(term11775, term11775.getClass(), "table", term11793);
        setField(term11775, term11775.getClass(), "file", "BMMonTIZgJ");
        setField(term11703, term11703.getClass(), "BaseVector", term11775);
        setField(term11806, term11806.getClass(), "ctype", null);
        setField(term11806, term11806.getClass(), "params", null);
        setField(term11806, term11806.getClass(), "table", null);
        setField(term11806, term11806.getClass(), "file", null);
        setField(term11703, term11703.getClass(), "BaseVectorInst", term11806);
        setField(term11807, term11807.getClass(), "instance", null);
        setField(term11807, term11807.getClass(), "name", null);
        setField(term11807, term11807.getClass(), "baseType", null);
        setField(term11807, term11807.getClass(), "table", null);
        setField(term11807, term11807.getClass(), "file", null);
        setField(term11703, term11703.getClass(), "BaseDict", term11807);
        setField(term11808, term11808.getClass(), "instance", null);
        setField(term11808, term11808.getClass(), "name", null);
        setField(term11808, term11808.getClass(), "baseType", null);
        setField(term11808, term11808.getClass(), "table", null);
        setField(term11808, term11808.getClass(), "file", null);
        setField(term11703, term11703.getClass(), "BaseTuple", term11808);
        setField(term11809, term11809.getClass(), "instance", null);
        setField(term11809, term11809.getClass(), "name", null);
        setField(term11809, term11809.getClass(), "baseType", null);
        setField(term11809, term11809.getClass(), "table", null);
        setField(term11809, term11809.getClass(), "file", null);
        setField(term11703, term11703.getClass(), "BaseStruct", term11809);
        setField(term11810, term11810.getClass(), "instance", null);
        setField(term11810, term11810.getClass(), "name", null);
        setField(term11810, term11810.getClass(), "baseType", null);
        setField(term11810, term11810.getClass(), "table", null);
        setField(term11810, term11810.getClass(), "file", null);
        setField(term11703, term11703.getClass(), "BaseFunction", term11810);
        setField(term11703, term11703.getClass(), "BasePair", null);
        setField(term11703, term11703.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newFunc", argTypes, term11703, args);
    }

};


