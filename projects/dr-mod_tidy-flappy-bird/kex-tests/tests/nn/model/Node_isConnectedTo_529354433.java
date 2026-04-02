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

public class Node_isConnectedTo_529354433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11674;
     Object term11729;

    public Node_isConnectedTo_529354433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11774 = Class.forName((String) "nn.model.Type");
        Field term11773 = ((Class) term11774).getDeclaredField((String) "HIDDEN");
        ((Field) term11773).setAccessible(true);
        Object enum76 = ((Field) term11773).get((Object) null);
        Object term11688 = newInstance(Class.forName("nn.model.Connection"));
        Object term11689 = newInstance(Class.forName("nn.model.Node"));
        setField(term11689, term11689.getClass(), "type", enum76);
        setIntField(term11689, term11689.getClass(), "innovation", 1627938506);
        setField(term11689, term11689.getClass(), "connections", null);
        setDoubleField(term11689, term11689.getClass(), "bias", 0.4084300846738409);
        setField(term11688, term11688.getClass(), "in", term11689);
        setField(term11688, term11688.getClass(), "out", term11689);
        setFloatField(term11688, term11688.getClass(), "weight", 0.23252326F);
        setBooleanField(term11688, term11688.getClass(), "expressed", false);
        setIntField(term11688, term11688.getClass(), "innovation", -1242133071);
        Object term11695 = newInstance(Class.forName("nn.model.Connection"));
        Object term11696 = newInstance(Class.forName("nn.model.Node"));
        Object term11699 = newInstance(Class.forName("nn.model.Node"));
        setField(term11696, term11696.getClass(), "type", null);
        setIntField(term11696, term11696.getClass(), "innovation", 0);
        setField(term11696, term11696.getClass(), "connections", null);
        setDoubleField(term11696, term11696.getClass(), "bias", 0.0);
        setField(term11695, term11695.getClass(), "in", term11696);
        setField(term11699, term11699.getClass(), "type", null);
        setIntField(term11699, term11699.getClass(), "innovation", 0);
        setField(term11699, term11699.getClass(), "connections", null);
        setDoubleField(term11699, term11699.getClass(), "bias", 0.0);
        setField(term11695, term11695.getClass(), "out", term11699);
        setFloatField(term11695, term11695.getClass(), "weight", 0.28755647F);
        setBooleanField(term11695, term11695.getClass(), "expressed", true);
        setIntField(term11695, term11695.getClass(), "innovation", 346714653);
        Object term11705 = newInstance(Class.forName("nn.model.Connection"));
        Object term11706 = newInstance(Class.forName("nn.model.Node"));
        Object term11709 = newInstance(Class.forName("nn.model.Node"));
        setField(term11706, term11706.getClass(), "type", null);
        setIntField(term11706, term11706.getClass(), "innovation", 0);
        setField(term11706, term11706.getClass(), "connections", null);
        setDoubleField(term11706, term11706.getClass(), "bias", 0.0);
        setField(term11705, term11705.getClass(), "in", term11706);
        setField(term11709, term11709.getClass(), "type", null);
        setIntField(term11709, term11709.getClass(), "innovation", 906856023);
        setField(term11709, term11709.getClass(), "connections", null);
        setDoubleField(term11709, term11709.getClass(), "bias", 0.06523961946138956);
        setField(term11705, term11705.getClass(), "out", term11709);
        setFloatField(term11705, term11705.getClass(), "weight", 0.18556958F);
        setBooleanField(term11705, term11705.getClass(), "expressed", true);
        setIntField(term11705, term11705.getClass(), "innovation", -1741056571);
        Object term11715 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11715, term11715.getClass(), "in", term11689);
        setField(term11715, term11715.getClass(), "out", term11696);
        setFloatField(term11715, term11715.getClass(), "weight", 0.4180171F);
        setBooleanField(term11715, term11715.getClass(), "expressed", true);
        setIntField(term11715, term11715.getClass(), "innovation", 125432890);
        Object term11719 = newInstance(Class.forName("nn.model.Connection"));
        Object term11720 = newInstance(Class.forName("nn.model.Node"));
        setField(term11719, term11719.getClass(), "in", term11709);
        setField(term11720, term11720.getClass(), "type", enum76);
        setIntField(term11720, term11720.getClass(), "innovation", 198857801);
        setField(term11720, term11720.getClass(), "connections", null);
        setDoubleField(term11720, term11720.getClass(), "bias", 0.6198565030073423);
        setField(term11719, term11719.getClass(), "out", term11720);
        setFloatField(term11719, term11719.getClass(), "weight", 0.86724824F);
        setBooleanField(term11719, term11719.getClass(), "expressed", false);
        setIntField(term11719, term11719.getClass(), "innovation", -197740561);
        ArrayList term11686 = new ArrayList();
        ((ArrayList) term11686).add(term11688);
        ((ArrayList) term11686).add(term11695);
        ((ArrayList) term11686).add(term11695);
        ((ArrayList) term11686).add(term11705);
        ((ArrayList) term11686).add(term11715);
        ((ArrayList) term11686).add(term11719);
        ((ArrayList) term11686).add(term11695);
        term11674 = newInstance(Class.forName("nn.model.Node"));
        setField(term11674, term11674.getClass(), "type", enum76);
        setIntField(term11674, term11674.getClass(), "innovation", 276336694);
        setField(term11674, term11674.getClass(), "connections", term11686);
        setDoubleField(term11674, term11674.getClass(), "bias", 0.7788960836558265);
        Class<? extends Object> term11864 = Class.forName((String) "nn.model.Type");
        Field term11863 = ((Class) term11864).getDeclaredField((String) "OUTPUT");
        ((Field) term11863).setAccessible(true);
        Object enum77 = ((Field) term11863).get((Object) null);
        Object term11743 = newInstance(Class.forName("nn.model.Connection"));
        Object term11744 = newInstance(Class.forName("nn.model.Node"));
        Object term11747 = newInstance(Class.forName("nn.model.Node"));
        setField(term11744, term11744.getClass(), "type", enum77);
        setIntField(term11744, term11744.getClass(), "innovation", -1322797287);
        setField(term11744, term11744.getClass(), "connections", null);
        setDoubleField(term11744, term11744.getClass(), "bias", 0.21145399417290445);
        setField(term11743, term11743.getClass(), "in", term11744);
        setField(term11747, term11747.getClass(), "type", null);
        setIntField(term11747, term11747.getClass(), "innovation", 0);
        setField(term11747, term11747.getClass(), "connections", null);
        setDoubleField(term11747, term11747.getClass(), "bias", 0.0);
        setField(term11743, term11743.getClass(), "out", term11747);
        setFloatField(term11743, term11743.getClass(), "weight", 0.15736824F);
        setBooleanField(term11743, term11743.getClass(), "expressed", true);
        setIntField(term11743, term11743.getClass(), "innovation", -139927812);
        Object term11753 = newInstance(Class.forName("nn.model.Connection"));
        Object term11754 = newInstance(Class.forName("nn.model.Node"));
        Object term11757 = newInstance(Class.forName("nn.model.Node"));
        setField(term11754, term11754.getClass(), "type", null);
        setIntField(term11754, term11754.getClass(), "innovation", -491132382);
        setField(term11754, term11754.getClass(), "connections", null);
        setDoubleField(term11754, term11754.getClass(), "bias", 0.44216771474321837);
        setField(term11753, term11753.getClass(), "in", term11754);
        setField(term11757, term11757.getClass(), "type", enum77);
        setIntField(term11757, term11757.getClass(), "innovation", -615198242);
        setField(term11757, term11757.getClass(), "connections", null);
        setDoubleField(term11757, term11757.getClass(), "bias", 0.9809266777296007);
        setField(term11753, term11753.getClass(), "out", term11757);
        setFloatField(term11753, term11753.getClass(), "weight", 0.5610516F);
        setBooleanField(term11753, term11753.getClass(), "expressed", false);
        setIntField(term11753, term11753.getClass(), "innovation", 1427248961);
        Object term11763 = newInstance(Class.forName("nn.model.Connection"));
        Object term11764 = newInstance(Class.forName("nn.model.Node"));
        setField(term11763, term11763.getClass(), "in", term11747);
        setField(term11764, term11764.getClass(), "type", null);
        setIntField(term11764, term11764.getClass(), "innovation", 0);
        setField(term11764, term11764.getClass(), "connections", null);
        setDoubleField(term11764, term11764.getClass(), "bias", 0.0);
        setField(term11763, term11763.getClass(), "out", term11764);
        setFloatField(term11763, term11763.getClass(), "weight", 0.3762445F);
        setBooleanField(term11763, term11763.getClass(), "expressed", false);
        setIntField(term11763, term11763.getClass(), "innovation", -410564443);
        ArrayList term11741 = new ArrayList();
        ((ArrayList) term11741).add(term11743);
        ((ArrayList) term11741).add(term11753);
        ((ArrayList) term11741).add(term11763);
        term11729 = newInstance(Class.forName("nn.model.Node"));
        setField(term11729, term11729.getClass(), "type", enum77);
        setIntField(term11729, term11729.getClass(), "innovation", -455052015);
        setField(term11729, term11729.getClass(), "connections", term11741);
        setDoubleField(term11729, term11729.getClass(), "bias", 0.3206424582885071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Node");
        Object[] args = new Object[1];
        args[0] = term11729;
        callMethod(klass, "isConnectedTo", argTypes, term11674, args);
    }

};


