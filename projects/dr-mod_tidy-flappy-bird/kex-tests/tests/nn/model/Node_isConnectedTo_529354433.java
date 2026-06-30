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
     Object term11689;
     Object term11744;

    public Node_isConnectedTo_529354433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11789 = Class.forName((String) "nn.model.Type");
        Field term11788 = ((Class) term11789).getDeclaredField((String) "HIDDEN");
        ((Field) term11788).setAccessible(true);
        Object enum76 = ((Field) term11788).get((Object) null);
        Object term11703 = newInstance(Class.forName("nn.model.Connection"));
        Object term11704 = newInstance(Class.forName("nn.model.Node"));
        setField(term11704, term11704.getClass(), "type", enum76);
        setIntField(term11704, term11704.getClass(), "innovation", 1627938506);
        setField(term11704, term11704.getClass(), "connections", null);
        setDoubleField(term11704, term11704.getClass(), "bias", 0.4084300846738409);
        setField(term11703, term11703.getClass(), "in", term11704);
        setField(term11703, term11703.getClass(), "out", term11704);
        setFloatField(term11703, term11703.getClass(), "weight", 0.23252326F);
        setBooleanField(term11703, term11703.getClass(), "expressed", false);
        setIntField(term11703, term11703.getClass(), "innovation", -1242133071);
        Object term11710 = newInstance(Class.forName("nn.model.Connection"));
        Object term11711 = newInstance(Class.forName("nn.model.Node"));
        Object term11714 = newInstance(Class.forName("nn.model.Node"));
        setField(term11711, term11711.getClass(), "type", null);
        setIntField(term11711, term11711.getClass(), "innovation", 0);
        setField(term11711, term11711.getClass(), "connections", null);
        setDoubleField(term11711, term11711.getClass(), "bias", 0.0);
        setField(term11710, term11710.getClass(), "in", term11711);
        setField(term11714, term11714.getClass(), "type", null);
        setIntField(term11714, term11714.getClass(), "innovation", 0);
        setField(term11714, term11714.getClass(), "connections", null);
        setDoubleField(term11714, term11714.getClass(), "bias", 0.0);
        setField(term11710, term11710.getClass(), "out", term11714);
        setFloatField(term11710, term11710.getClass(), "weight", 0.28755647F);
        setBooleanField(term11710, term11710.getClass(), "expressed", true);
        setIntField(term11710, term11710.getClass(), "innovation", 346714653);
        Object term11720 = newInstance(Class.forName("nn.model.Connection"));
        Object term11721 = newInstance(Class.forName("nn.model.Node"));
        Object term11724 = newInstance(Class.forName("nn.model.Node"));
        setField(term11721, term11721.getClass(), "type", null);
        setIntField(term11721, term11721.getClass(), "innovation", 0);
        setField(term11721, term11721.getClass(), "connections", null);
        setDoubleField(term11721, term11721.getClass(), "bias", 0.0);
        setField(term11720, term11720.getClass(), "in", term11721);
        setField(term11724, term11724.getClass(), "type", null);
        setIntField(term11724, term11724.getClass(), "innovation", 906856023);
        setField(term11724, term11724.getClass(), "connections", null);
        setDoubleField(term11724, term11724.getClass(), "bias", 0.06523961946138956);
        setField(term11720, term11720.getClass(), "out", term11724);
        setFloatField(term11720, term11720.getClass(), "weight", 0.18556958F);
        setBooleanField(term11720, term11720.getClass(), "expressed", true);
        setIntField(term11720, term11720.getClass(), "innovation", -1741056571);
        Object term11730 = newInstance(Class.forName("nn.model.Connection"));
        setField(term11730, term11730.getClass(), "in", term11704);
        setField(term11730, term11730.getClass(), "out", term11711);
        setFloatField(term11730, term11730.getClass(), "weight", 0.4180171F);
        setBooleanField(term11730, term11730.getClass(), "expressed", true);
        setIntField(term11730, term11730.getClass(), "innovation", 125432890);
        Object term11734 = newInstance(Class.forName("nn.model.Connection"));
        Object term11735 = newInstance(Class.forName("nn.model.Node"));
        setField(term11734, term11734.getClass(), "in", term11724);
        setField(term11735, term11735.getClass(), "type", enum76);
        setIntField(term11735, term11735.getClass(), "innovation", 198857801);
        setField(term11735, term11735.getClass(), "connections", null);
        setDoubleField(term11735, term11735.getClass(), "bias", 0.6198565030073423);
        setField(term11734, term11734.getClass(), "out", term11735);
        setFloatField(term11734, term11734.getClass(), "weight", 0.86724824F);
        setBooleanField(term11734, term11734.getClass(), "expressed", false);
        setIntField(term11734, term11734.getClass(), "innovation", -197740561);
        ArrayList term11701 = new ArrayList();
        ((ArrayList) term11701).add(term11703);
        ((ArrayList) term11701).add(term11710);
        ((ArrayList) term11701).add(term11710);
        ((ArrayList) term11701).add(term11720);
        ((ArrayList) term11701).add(term11730);
        ((ArrayList) term11701).add(term11734);
        ((ArrayList) term11701).add(term11710);
        term11689 = newInstance(Class.forName("nn.model.Node"));
        setField(term11689, term11689.getClass(), "type", enum76);
        setIntField(term11689, term11689.getClass(), "innovation", 276336694);
        setField(term11689, term11689.getClass(), "connections", term11701);
        setDoubleField(term11689, term11689.getClass(), "bias", 0.7788960836558265);
        Class<? extends Object> term11879 = Class.forName((String) "nn.model.Type");
        Field term11878 = ((Class) term11879).getDeclaredField((String) "OUTPUT");
        ((Field) term11878).setAccessible(true);
        Object enum77 = ((Field) term11878).get((Object) null);
        Object term11758 = newInstance(Class.forName("nn.model.Connection"));
        Object term11759 = newInstance(Class.forName("nn.model.Node"));
        Object term11762 = newInstance(Class.forName("nn.model.Node"));
        setField(term11759, term11759.getClass(), "type", enum77);
        setIntField(term11759, term11759.getClass(), "innovation", -1322797287);
        setField(term11759, term11759.getClass(), "connections", null);
        setDoubleField(term11759, term11759.getClass(), "bias", 0.21145399417290445);
        setField(term11758, term11758.getClass(), "in", term11759);
        setField(term11762, term11762.getClass(), "type", null);
        setIntField(term11762, term11762.getClass(), "innovation", 0);
        setField(term11762, term11762.getClass(), "connections", null);
        setDoubleField(term11762, term11762.getClass(), "bias", 0.0);
        setField(term11758, term11758.getClass(), "out", term11762);
        setFloatField(term11758, term11758.getClass(), "weight", 0.15736824F);
        setBooleanField(term11758, term11758.getClass(), "expressed", true);
        setIntField(term11758, term11758.getClass(), "innovation", -139927812);
        Object term11768 = newInstance(Class.forName("nn.model.Connection"));
        Object term11769 = newInstance(Class.forName("nn.model.Node"));
        Object term11772 = newInstance(Class.forName("nn.model.Node"));
        setField(term11769, term11769.getClass(), "type", null);
        setIntField(term11769, term11769.getClass(), "innovation", -491132382);
        setField(term11769, term11769.getClass(), "connections", null);
        setDoubleField(term11769, term11769.getClass(), "bias", 0.44216771474321837);
        setField(term11768, term11768.getClass(), "in", term11769);
        setField(term11772, term11772.getClass(), "type", enum77);
        setIntField(term11772, term11772.getClass(), "innovation", -615198242);
        setField(term11772, term11772.getClass(), "connections", null);
        setDoubleField(term11772, term11772.getClass(), "bias", 0.9809266777296007);
        setField(term11768, term11768.getClass(), "out", term11772);
        setFloatField(term11768, term11768.getClass(), "weight", 0.5610516F);
        setBooleanField(term11768, term11768.getClass(), "expressed", false);
        setIntField(term11768, term11768.getClass(), "innovation", 1427248961);
        Object term11778 = newInstance(Class.forName("nn.model.Connection"));
        Object term11779 = newInstance(Class.forName("nn.model.Node"));
        setField(term11778, term11778.getClass(), "in", term11762);
        setField(term11779, term11779.getClass(), "type", null);
        setIntField(term11779, term11779.getClass(), "innovation", 0);
        setField(term11779, term11779.getClass(), "connections", null);
        setDoubleField(term11779, term11779.getClass(), "bias", 0.0);
        setField(term11778, term11778.getClass(), "out", term11779);
        setFloatField(term11778, term11778.getClass(), "weight", 0.3762445F);
        setBooleanField(term11778, term11778.getClass(), "expressed", false);
        setIntField(term11778, term11778.getClass(), "innovation", -410564443);
        ArrayList term11756 = new ArrayList();
        ((ArrayList) term11756).add(term11758);
        ((ArrayList) term11756).add(term11768);
        ((ArrayList) term11756).add(term11778);
        term11744 = newInstance(Class.forName("nn.model.Node"));
        setField(term11744, term11744.getClass(), "type", enum77);
        setIntField(term11744, term11744.getClass(), "innovation", -455052015);
        setField(term11744, term11744.getClass(), "connections", term11756);
        setDoubleField(term11744, term11744.getClass(), "bias", 0.3206424582885071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Node");
        Object[] args = new Object[1];
        args[0] = term11744;
        callMethod(klass, "isConnectedTo", argTypes, term11689, args);
    }

};


