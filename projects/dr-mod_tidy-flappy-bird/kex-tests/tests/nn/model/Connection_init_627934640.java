package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;

public class Connection_init_627934640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term62;
     Object term96;
     Object term98;
     Object term100;

    public Connection_init_627934640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133 = Class.forName((String) "nn.model.Type");
        Field term132 = ((Class) term133).getDeclaredField((String) "OUTPUT");
        ((Field) term132).setAccessible(true);
        Object enum0 = ((Field) term132).get((Object) null);
        Object term19 = newInstance(Class.forName("nn.model.Connection"));
        Object term20 = newInstance(Class.forName("nn.model.Node"));
        Object term23 = newInstance(Class.forName("nn.model.Node"));
        setField(term20, term20.getClass(), "type", null);
        setIntField(term20, term20.getClass(), "innovation", 1484323161);
        setField(term20, term20.getClass(), "connections", null);
        setDoubleField(term20, term20.getClass(), "bias", 0.28570734989730284);
        setField(term19, term19.getClass(), "in", term20);
        setField(term23, term23.getClass(), "type", null);
        setIntField(term23, term23.getClass(), "innovation", -1922583790);
        setField(term23, term23.getClass(), "connections", null);
        setDoubleField(term23, term23.getClass(), "bias", 0.5523635872663106);
        setField(term19, term19.getClass(), "out", term23);
        setFloatField(term19, term19.getClass(), "weight", 0.6880585F);
        setBooleanField(term19, term19.getClass(), "expressed", true);
        setIntField(term19, term19.getClass(), "innovation", -1685132342);
        Object term29 = newInstance(Class.forName("nn.model.Connection"));
        Object term30 = newInstance(Class.forName("nn.model.Node"));
        Object term33 = newInstance(Class.forName("nn.model.Node"));
        setField(term30, term30.getClass(), "type", null);
        setIntField(term30, term30.getClass(), "innovation", 0);
        setField(term30, term30.getClass(), "connections", null);
        setDoubleField(term30, term30.getClass(), "bias", 0.0);
        setField(term29, term29.getClass(), "in", term30);
        setField(term33, term33.getClass(), "type", null);
        setIntField(term33, term33.getClass(), "innovation", 0);
        setField(term33, term33.getClass(), "connections", null);
        setDoubleField(term33, term33.getClass(), "bias", 0.0);
        setField(term29, term29.getClass(), "out", term33);
        setFloatField(term29, term29.getClass(), "weight", 0.13238746F);
        setBooleanField(term29, term29.getClass(), "expressed", false);
        setIntField(term29, term29.getClass(), "innovation", -1955890973);
        Object term39 = newInstance(Class.forName("nn.model.Connection"));
        Object term40 = newInstance(Class.forName("nn.model.Node"));
        Object term43 = newInstance(Class.forName("nn.model.Node"));
        setField(term40, term40.getClass(), "type", enum0);
        setIntField(term40, term40.getClass(), "innovation", 391863371);
        setField(term40, term40.getClass(), "connections", null);
        setDoubleField(term40, term40.getClass(), "bias", 0.544608645520025);
        setField(term39, term39.getClass(), "in", term40);
        setField(term43, term43.getClass(), "type", null);
        setIntField(term43, term43.getClass(), "innovation", -616727354);
        setField(term43, term43.getClass(), "connections", null);
        setDoubleField(term43, term43.getClass(), "bias", 0.13238746331190498);
        setField(term39, term39.getClass(), "out", term43);
        setFloatField(term39, term39.getClass(), "weight", 0.2857073F);
        setBooleanField(term39, term39.getClass(), "expressed", false);
        setIntField(term39, term39.getClass(), "innovation", 597278769);
        Object term49 = newInstance(Class.forName("nn.model.Connection"));
        Object term50 = newInstance(Class.forName("nn.model.Node"));
        Object term53 = newInstance(Class.forName("nn.model.Node"));
        setField(term50, term50.getClass(), "type", enum0);
        setIntField(term50, term50.getClass(), "innovation", -2038273078);
        setField(term50, term50.getClass(), "connections", null);
        setDoubleField(term50, term50.getClass(), "bias", 0.3455959125047594);
        setField(term49, term49.getClass(), "in", term50);
        setField(term53, term53.getClass(), "type", null);
        setIntField(term53, term53.getClass(), "innovation", 0);
        setField(term53, term53.getClass(), "connections", null);
        setDoubleField(term53, term53.getClass(), "bias", 0.0);
        setField(term49, term49.getClass(), "out", term53);
        setFloatField(term49, term49.getClass(), "weight", 0.3455959F);
        setBooleanField(term49, term49.getClass(), "expressed", false);
        setIntField(term49, term49.getClass(), "innovation", -1339778481);
        ArrayList term17 = new ArrayList();
        ((ArrayList) term17).add(term19);
        ((ArrayList) term17).add(term29);
        ((ArrayList) term17).add(term29);
        ((ArrayList) term17).add(term39);
        ((ArrayList) term17).add(term49);
        term5 = newInstance(Class.forName("nn.model.Node"));
        setField(term5, term5.getClass(), "type", enum0);
        setIntField(term5, term5.getClass(), "innovation", 1162663216);
        setField(term5, term5.getClass(), "connections", term17);
        setDoubleField(term5, term5.getClass(), "bias", 0.40176586625454525);
        Class<? extends Object> term223 = Class.forName((String) "nn.model.Type");
        Field term222 = ((Class) term223).getDeclaredField((String) "HIDDEN");
        ((Field) term222).setAccessible(true);
        Object enum1 = ((Field) term222).get((Object) null);
        Object term76 = newInstance(Class.forName("nn.model.Connection"));
        Object term77 = newInstance(Class.forName("nn.model.Node"));
        Object term80 = newInstance(Class.forName("nn.model.Node"));
        setField(term77, term77.getClass(), "type", null);
        setIntField(term77, term77.getClass(), "innovation", 1622346318);
        setField(term77, term77.getClass(), "connections", null);
        setDoubleField(term77, term77.getClass(), "bias", 0.37773193782763337);
        setField(term76, term76.getClass(), "in", term77);
        setField(term80, term80.getClass(), "type", enum0);
        setIntField(term80, term80.getClass(), "innovation", -6029667);
        setField(term80, term80.getClass(), "connections", null);
        setDoubleField(term80, term80.getClass(), "bias", 0.2641345529914265);
        setField(term76, term76.getClass(), "out", term80);
        setFloatField(term76, term76.getClass(), "weight", 0.24413109F);
        setBooleanField(term76, term76.getClass(), "expressed", false);
        setIntField(term76, term76.getClass(), "innovation", -1179120542);
        Object term86 = newInstance(Class.forName("nn.model.Connection"));
        Object term87 = newInstance(Class.forName("nn.model.Node"));
        setField(term87, term87.getClass(), "type", null);
        setIntField(term87, term87.getClass(), "innovation", 1048535127);
        setField(term87, term87.getClass(), "connections", null);
        setDoubleField(term87, term87.getClass(), "bias", 0.6076495596892013);
        setField(term86, term86.getClass(), "in", term87);
        setField(term86, term86.getClass(), "out", term80);
        setFloatField(term86, term86.getClass(), "weight", 0.37773192F);
        setBooleanField(term86, term86.getClass(), "expressed", false);
        setIntField(term86, term86.getClass(), "innovation", -203030934);
        ArrayList term74 = new ArrayList();
        ((ArrayList) term74).add(term76);
        ((ArrayList) term74).add(term86);
        term62 = newInstance(Class.forName("nn.model.Node"));
        setField(term62, term62.getClass(), "type", enum1);
        setIntField(term62, term62.getClass(), "innovation", -1456670397);
        setField(term62, term62.getClass(), "connections", term74);
        setDoubleField(term62, term62.getClass(), "bias", 0.8474802076607362);
        term96 = new Integer(-73683645);
        term98 = new Boolean(true);
        term100 = new Float(0.8474802F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("nn.model.Node");
        argTypes[1] = Class.forName("nn.model.Node");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = float.class;
        Object[] args = new Object[5];
        args[0] = term5;
        args[1] = term62;
        args[2] = term96;
        args[3] = term98;
        args[4] = term100;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


