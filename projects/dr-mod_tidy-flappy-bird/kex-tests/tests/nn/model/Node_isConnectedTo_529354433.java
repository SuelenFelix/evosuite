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
     Object term11686;
     Object term11741;

    public Node_isConnectedTo_529354433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11786 = Class.forName((String) "nn.model.Type");
        Field term11785 = ((Class) term11786).getDeclaredField((String) "HIDDEN");
        ((Field) term11785).setAccessible(true);
        Object enum76 = ((Field) term11785).get((Object) null);
        Object term11700 = newInstance(Class.forName("nn.model.Connection"));
        Object term11701 = newInstance(Class.forName("nn.model.Node"));
        setField(term11701, term11701.getClass(), "type", enum76);
        setIntField(term11701, term11701.getClass(), "innovation", 1627938506);
        setField(term11701, term11701.getClass(), "connections", null);
        setDoubleField(term11701, term11701.getClass(), "bias", 0.4084300846738409);
        setField(term11700, term11700.getClass(), "in", term11701);
        setField(term11700, term11700.getClass(), "out", term11701);
        setFloatField(term11700, term11700.getClass(), "weight", 0.23252326F);
        setBooleanField(term11700, term11700.getClass(), "expressed", false);
        setIntField(term11700, term11700.getClass(), "innovation", -1242133071);
        Object term11707 = newInstance(Class.forName("nn.model.Connection"));
        Object term11708 = newInstance(Class.forName("nn.model.Node"));
        Object term11711 = newInstance(Class.forName("nn.model.Node"));
        setField(term11708, term11708.getClass(), "type", null);
        setIntField(term11708, term11708.getClass(), "innovation", 0);
        setField(term11708, term11708.getClass(), "connections", null);
        setDoubleField(term11708, term11708.getClass(), "bias", 0.0);
        setField(term11707, term11707.getClass(), "in", term11708);
        setField(term11711, term11711.getClass(), "type", null);
        setIntField(term11711, term11711.getClass(), "innovation", 0);
        setField(term11711, term11711.getClass(), "connections", null);
        setDoubleField(term11711, term11711.getClass(), "bias", 0.0);
        setField(term11707, term11707.getClass(), "out", term11711);
        setFloatField(term11707, term11707.getClass(), "weight", 0.28755647F);
        setBooleanField(term11707, term11707.getClass(), "expressed", true);
        setIntField(term11707, term11707.getClass(), "innovation", 346714653);
        Object term11717 = newInstance(Class.forName("nn.model.Connection"));
        Object term11718 = newInstance(Class.forName("nn.model.Node"));
        Object term11721 = newInstance(Class.forName("nn.model.Node"));
        setField(term11718, term11718.getClass(), "type", null);
        setIntField(term11718, term11718.getClass(), "innovation", 0);
        setField(term11718, term11718.getClass(), "connections", null);
        setDoubleField(term11718, term11718.getClass(), "bias", 0.0);
        setField(term11717, term11717.getClass(), "in", term11718);
        setField(term11721, term11721.getClass(), "type", null);
        setIntField(term11721, term11721.getClass(), "innovation", 906856023);
        setField(term11721, term11721.getClass(), "connections", null);
        setDoubleField(term11721, term11721.getClass(), "bias", 0.06523961946138956);
        setField(term11717, term11717.getClass(), "out", term11721);
        setFloatField(term11717, term11717.getClass(), "weight", 0.18556958F);
        setBooleanField(term11717, term11717.getClass(), "expressed", true);
        setIntField(term11717, term11717.getClass(), "innovation", -1741056571);
        Object term11727 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11727, term11727.getClass(), "in", term11701);
        setField(term11727, term11727.getClass(), "out", term11708);
        setFloatField(term11727, term11727.getClass(), "weight", 0.4180171F);
        setBooleanField(term11727, term11727.getClass(), "expressed", true);
        setIntField(term11727, term11727.getClass(), "innovation", 125432890);
        Object term11731 = newInstance(Class.forName("nn.model.Connection"));
        Object term11732 = newInstance(Class.forName("nn.model.Node"));
        setField(term11731, term11731.getClass(), "in", term11721);
        setField(term11732, term11732.getClass(), "type", enum76);
        setIntField(term11732, term11732.getClass(), "innovation", 198857801);
        setField(term11732, term11732.getClass(), "connections", null);
        setDoubleField(term11732, term11732.getClass(), "bias", 0.6198565030073423);
        setField(term11731, term11731.getClass(), "out", term11732);
        setFloatField(term11731, term11731.getClass(), "weight", 0.86724824F);
        setBooleanField(term11731, term11731.getClass(), "expressed", false);
        setIntField(term11731, term11731.getClass(), "innovation", -197740561);
        ArrayList term11698 = new ArrayList();
        ((ArrayList) term11698).add(term11700);
        ((ArrayList) term11698).add(term11707);
        ((ArrayList) term11698).add(term11707);
        ((ArrayList) term11698).add(term11717);
        ((ArrayList) term11698).add(term11727);
        ((ArrayList) term11698).add(term11731);
        ((ArrayList) term11698).add(term11707);
        term11686 = newInstance(Class.forName("nn.model.Node"));
        setField(term11686, term11686.getClass(), "type", enum76);
        setIntField(term11686, term11686.getClass(), "innovation", 276336694);
        setField(term11686, term11686.getClass(), "connections", term11698);
        setDoubleField(term11686, term11686.getClass(), "bias", 0.7788960836558265);
        Class<? extends Object> term11876 = Class.forName((String) "nn.model.Type");
        Field term11875 = ((Class) term11876).getDeclaredField((String) "OUTPUT");
        ((Field) term11875).setAccessible(true);
        Object enum77 = ((Field) term11875).get((Object) null);
        Object term11755 = newInstance(Class.forName("nn.model.Connection"));
        Object term11756 = newInstance(Class.forName("nn.model.Node"));
        Object term11759 = newInstance(Class.forName("nn.model.Node"));
        setField(term11756, term11756.getClass(), "type", enum77);
        setIntField(term11756, term11756.getClass(), "innovation", -1322797287);
        setField(term11756, term11756.getClass(), "connections", null);
        setDoubleField(term11756, term11756.getClass(), "bias", 0.21145399417290445);
        setField(term11755, term11755.getClass(), "in", term11756);
        setField(term11759, term11759.getClass(), "type", null);
        setIntField(term11759, term11759.getClass(), "innovation", 0);
        setField(term11759, term11759.getClass(), "connections", null);
        setDoubleField(term11759, term11759.getClass(), "bias", 0.0);
        setField(term11755, term11755.getClass(), "out", term11759);
        setFloatField(term11755, term11755.getClass(), "weight", 0.15736824F);
        setBooleanField(term11755, term11755.getClass(), "expressed", true);
        setIntField(term11755, term11755.getClass(), "innovation", -139927812);
        Object term11765 = newInstance(Class.forName("nn.model.Connection"));
        Object term11766 = newInstance(Class.forName("nn.model.Node"));
        Object term11769 = newInstance(Class.forName("nn.model.Node"));
        setField(term11766, term11766.getClass(), "type", null);
        setIntField(term11766, term11766.getClass(), "innovation", -491132382);
        setField(term11766, term11766.getClass(), "connections", null);
        setDoubleField(term11766, term11766.getClass(), "bias", 0.44216771474321837);
        setField(term11765, term11765.getClass(), "in", term11766);
        setField(term11769, term11769.getClass(), "type", enum77);
        setIntField(term11769, term11769.getClass(), "innovation", -615198242);
        setField(term11769, term11769.getClass(), "connections", null);
        setDoubleField(term11769, term11769.getClass(), "bias", 0.9809266777296007);
        setField(term11765, term11765.getClass(), "out", term11769);
        setFloatField(term11765, term11765.getClass(), "weight", 0.5610516F);
        setBooleanField(term11765, term11765.getClass(), "expressed", false);
        setIntField(term11765, term11765.getClass(), "innovation", 1427248961);
        Object term11775 = newInstance(Class.forName("nn.model.Connection"));
        Object term11776 = newInstance(Class.forName("nn.model.Node"));
        setField(term11775, term11775.getClass(), "in", term11759);
        setField(term11776, term11776.getClass(), "type", null);
        setIntField(term11776, term11776.getClass(), "innovation", 0);
        setField(term11776, term11776.getClass(), "connections", null);
        setDoubleField(term11776, term11776.getClass(), "bias", 0.0);
        setField(term11775, term11775.getClass(), "out", term11776);
        setFloatField(term11775, term11775.getClass(), "weight", 0.3762445F);
        setBooleanField(term11775, term11775.getClass(), "expressed", false);
        setIntField(term11775, term11775.getClass(), "innovation", -410564443);
        ArrayList term11753 = new ArrayList();
        ((ArrayList) term11753).add(term11755);
        ((ArrayList) term11753).add(term11765);
        ((ArrayList) term11753).add(term11775);
        term11741 = newInstance(Class.forName("nn.model.Node"));
        setField(term11741, term11741.getClass(), "type", enum77);
        setIntField(term11741, term11741.getClass(), "innovation", -455052015);
        setField(term11741, term11741.getClass(), "connections", term11753);
        setDoubleField(term11741, term11741.getClass(), "bias", 0.3206424582885071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Node");
        Object[] args = new Object[1];
        args[0] = term11741;
        callMethod(klass, "isConnectedTo", argTypes, term11686, args);
    }

};


