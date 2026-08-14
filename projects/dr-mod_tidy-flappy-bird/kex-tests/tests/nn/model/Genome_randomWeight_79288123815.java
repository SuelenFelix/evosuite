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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Genome_randomWeight_79288123815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10267;

    public Genome_randomWeight_79288123815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10358 = Class.forName((String) "nn.model.Type");
        Field term10357 = ((Class) term10358).getDeclaredField((String) "HIDDEN");
        ((Field) term10357).setAccessible(true);
        Object enum60 = ((Field) term10357).get((Object) null);
        ArrayList term10274 = new ArrayList();
        ((ArrayList) term10274).add((Object)null);
        ((ArrayList) term10274).add((Object)null);
        ((ArrayList) term10274).add((Object)null);
        ((ArrayList) term10274).add((Object)null);
        ((ArrayList) term10274).add((Object)null);
        ((ArrayList) term10274).add((Object)null);
        Object term10270 = newInstance(Class.forName("nn.model.Node"));
        setField(term10270, term10270.getClass(), "type", enum60);
        setIntField(term10270, term10270.getClass(), "innovation", -1235127374);
        setField(term10270, term10270.getClass(), "connections", term10274);
        setDoubleField(term10270, term10270.getClass(), "bias", 0.7412534377270371);
        Class<? extends Object> term10448 = Class.forName((String) "nn.model.Type");
        Field term10447 = ((Class) term10448).getDeclaredField((String) "OUTPUT");
        ((Field) term10447).setAccessible(true);
        Object enum61 = ((Field) term10447).get((Object) null);
        ArrayList term10282 = new ArrayList();
        Object term10278 = newInstance(Class.forName("nn.model.Node"));
        setField(term10278, term10278.getClass(), "type", enum61);
        setIntField(term10278, term10278.getClass(), "innovation", 961252909);
        setField(term10278, term10278.getClass(), "connections", term10282);
        setDoubleField(term10278, term10278.getClass(), "bias", 0.33650824379057453);
        Class<? extends Object> term10538 = Class.forName((String) "nn.model.Type");
        Field term10537 = ((Class) term10538).getDeclaredField((String) "HIDDEN");
        ((Field) term10537).setAccessible(true);
        Object enum62 = ((Field) term10537).get((Object) null);
        ArrayList term10290 = new ArrayList();
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        ((ArrayList) term10290).add((Object)null);
        Object term10286 = newInstance(Class.forName("nn.model.Node"));
        setField(term10286, term10286.getClass(), "type", enum62);
        setIntField(term10286, term10286.getClass(), "innovation", -2077814162);
        setField(term10286, term10286.getClass(), "connections", term10290);
        setDoubleField(term10286, term10286.getClass(), "bias", 0.2170446731874749);
        ArrayList term10296 = new ArrayList();
        ((ArrayList) term10296).add((Object)null);
        ((ArrayList) term10296).add((Object)null);
        ((ArrayList) term10296).add((Object)null);
        Object term10294 = newInstance(Class.forName("nn.model.Node"));
        setField(term10294, term10294.getClass(), "type", enum60);
        setIntField(term10294, term10294.getClass(), "innovation", 923905351);
        setField(term10294, term10294.getClass(), "connections", term10296);
        setDoubleField(term10294, term10294.getClass(), "bias", 0.49591925980210916);
        ArrayList term10302 = new ArrayList();
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        ((ArrayList) term10302).add((Object)null);
        Object term10300 = newInstance(Class.forName("nn.model.Node"));
        setField(term10300, term10300.getClass(), "type", enum60);
        setIntField(term10300, term10300.getClass(), "innovation", 631528579);
        setField(term10300, term10300.getClass(), "connections", term10302);
        setDoubleField(term10300, term10300.getClass(), "bias", 0.9306262668515027);
        ArrayList term10268 = new ArrayList();
        ((ArrayList) term10268).add(term10270);
        ((ArrayList) term10268).add(term10278);
        ((ArrayList) term10268).add(term10286);
        ((ArrayList) term10268).add(term10294);
        ((ArrayList) term10268).add(term10300);
        Object term10310 = newInstance(Class.forName("nn.model.Connection"));
        Object term10311 = newInstance(Class.forName("nn.model.Node"));
        setField(term10311, term10311.getClass(), "type", enum61);
        setIntField(term10311, term10311.getClass(), "innovation", -147055177);
        setField(term10311, term10311.getClass(), "connections", null);
        setDoubleField(term10311, term10311.getClass(), "bias", 0.7120592018058269);
        setField(term10310, term10310.getClass(), "in", term10311);
        setField(term10310, term10310.getClass(), "out", term10300);
        setFloatField(term10310, term10310.getClass(), "weight", 0.51753795F);
        setBooleanField(term10310, term10310.getClass(), "expressed", true);
        setIntField(term10310, term10310.getClass(), "innovation", -1652091834);
        Object term10317 = newInstance(Class.forName("nn.model.Connection"));
        Object term10318 = newInstance(Class.forName("nn.model.Node"));
        Object term10321 = newInstance(Class.forName("nn.model.Node"));
        setField(term10318, term10318.getClass(), "type", enum62);
        setIntField(term10318, term10318.getClass(), "innovation", 444514470);
        setField(term10318, term10318.getClass(), "connections", null);
        setDoubleField(term10318, term10318.getClass(), "bias", 0.3897971128913206);
        setField(term10317, term10317.getClass(), "in", term10318);
        setField(term10321, term10321.getClass(), "type", enum62);
        setIntField(term10321, term10321.getClass(), "innovation", -282021579);
        setField(term10321, term10321.getClass(), "connections", null);
        setDoubleField(term10321, term10321.getClass(), "bias", 0.697625539365438);
        setField(term10317, term10317.getClass(), "out", term10321);
        setFloatField(term10317, term10317.getClass(), "weight", 0.9172358F);
        setBooleanField(term10317, term10317.getClass(), "expressed", false);
        setIntField(term10317, term10317.getClass(), "innovation", -1652588127);
        Object term10327 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10327, term10327.getClass(), "in", null);
        setField(term10327, term10327.getClass(), "out", null);
        setFloatField(term10327, term10327.getClass(), "weight", 0.0F);
        setBooleanField(term10327, term10327.getClass(), "expressed", false);
        setIntField(term10327, term10327.getClass(), "innovation", 0);
        Object term10331 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10331, term10331.getClass(), "in", null);
        setField(term10331, term10331.getClass(), "out", null);
        setFloatField(term10331, term10331.getClass(), "weight", 0.0F);
        setBooleanField(term10331, term10331.getClass(), "expressed", false);
        setIntField(term10331, term10331.getClass(), "innovation", 0);
        Object term10335 = newInstance(Class.forName("nn.model.Connection"));
        Object term10336 = newInstance(Class.forName("nn.model.Node"));
        setField(term10335, term10335.getClass(), "in", term10286);
        setField(term10336, term10336.getClass(), "type", enum61);
        setIntField(term10336, term10336.getClass(), "innovation", 1349806561);
        setField(term10336, term10336.getClass(), "connections", null);
        setDoubleField(term10336, term10336.getClass(), "bias", 0.5191680850819778);
        setField(term10335, term10335.getClass(), "out", term10336);
        setFloatField(term10335, term10335.getClass(), "weight", 0.34114075F);
        setBooleanField(term10335, term10335.getClass(), "expressed", false);
        setIntField(term10335, term10335.getClass(), "innovation", -1902823385);
        Object term10342 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10342, term10342.getClass(), "in", null);
        setField(term10342, term10342.getClass(), "out", null);
        setFloatField(term10342, term10342.getClass(), "weight", 0.0F);
        setBooleanField(term10342, term10342.getClass(), "expressed", false);
        setIntField(term10342, term10342.getClass(), "innovation", 0);
        ArrayList term10308 = new ArrayList();
        ((ArrayList) term10308).add(term10310);
        ((ArrayList) term10308).add(term10317);
        ((ArrayList) term10308).add(term10327);
        ((ArrayList) term10308).add(term10331);
        ((ArrayList) term10308).add(term10335);
        ((ArrayList) term10308).add(term10342);
        term10267 = newInstance(Class.forName("nn.model.Genome"));
        Object term10348 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10350 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10352 = newInstance(Class.forName("java.util.Random"));
        Object term10353 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10267, term10267.getClass(), "nodes", term10268);
        setField(term10267, term10267.getClass(), "connections", term10308);
        setIntField(term10348, term10348.getClass(), "counter", 100);
        setField(term10267, term10267.getClass(), "nodeInnovator", term10348);
        setIntField(term10350, term10350.getClass(), "counter", 100);
        setField(term10267, term10267.getClass(), "connectionInnovator", term10350);
        setLongField(term10353, term10353.getClass(), "value", 217849686711744L);
        setField(term10352, term10352.getClass(), "seed", term10353);
        setDoubleField(term10352, term10352.getClass(), "nextNextGaussian", 0.2610608910723019);
        setBooleanField(term10352, term10352.getClass(), "haveNextNextGaussian", true);
        setField(term10267, term10267.getClass(), "random", term10352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randomWeight", argTypes, term10267, args);
    }

};


