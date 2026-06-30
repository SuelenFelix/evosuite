package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ConnectionPair_init_17622827960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917;
     Object term969;

    public ConnectionPair_init_17622827960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1008 = Class.forName((String) "nn.model.Type");
        Field term1007 = ((Class) term1008).getDeclaredField((String) "SENSOR");
        ((Field) term1007).setAccessible(true);
        Object enum2 = ((Field) term1007).get((Object) null);
        Object term932 = newInstance(Class.forName("nn.model.Connection"));
        setField(term932, term932.getClass(), "in", null);
        setField(term932, term932.getClass(), "out", null);
        setFloatField(term932, term932.getClass(), "weight", 0.5602794F);
        setBooleanField(term932, term932.getClass(), "expressed", true);
        setIntField(term932, term932.getClass(), "innovation", 318591690);
        Object term936 = newInstance(Class.forName("nn.model.Connection"));
        setField(term936, term936.getClass(), "in", null);
        setField(term936, term936.getClass(), "out", null);
        setFloatField(term936, term936.getClass(), "weight", 0.791695F);
        setBooleanField(term936, term936.getClass(), "expressed", true);
        setIntField(term936, term936.getClass(), "innovation", -426764678);
        Object term940 = newInstance(Class.forName("nn.model.Connection"));
        setField(term940, term940.getClass(), "in", null);
        setField(term940, term940.getClass(), "out", null);
        setFloatField(term940, term940.getClass(), "weight", 0.0F);
        setBooleanField(term940, term940.getClass(), "expressed", false);
        setIntField(term940, term940.getClass(), "innovation", 0);
        Object term944 = newInstance(Class.forName("nn.model.Connection"));
        setField(term944, term944.getClass(), "in", null);
        setField(term944, term944.getClass(), "out", null);
        setFloatField(term944, term944.getClass(), "weight", 0.0F);
        setBooleanField(term944, term944.getClass(), "expressed", false);
        setIntField(term944, term944.getClass(), "innovation", 0);
        Object term948 = newInstance(Class.forName("nn.model.Connection"));
        setField(term948, term948.getClass(), "in", null);
        setField(term948, term948.getClass(), "out", null);
        setFloatField(term948, term948.getClass(), "weight", 0.0F);
        setBooleanField(term948, term948.getClass(), "expressed", false);
        setIntField(term948, term948.getClass(), "innovation", 0);
        ArrayList term930 = new ArrayList();
        ((ArrayList) term930).add(term932);
        ((ArrayList) term930).add(term936);
        ((ArrayList) term930).add(term932);
        ((ArrayList) term930).add(term940);
        ((ArrayList) term930).add(term944);
        ((ArrayList) term930).add(term948);
        Object term959 = newInstance(Class.forName("nn.model.Connection"));
        setField(term959, term959.getClass(), "in", null);
        setField(term959, term959.getClass(), "out", null);
        setFloatField(term959, term959.getClass(), "weight", 0.0F);
        setBooleanField(term959, term959.getClass(), "expressed", false);
        setIntField(term959, term959.getClass(), "innovation", 0);
        ArrayList term957 = new ArrayList();
        ((ArrayList) term957).add(term959);
        ((ArrayList) term957).add(term932);
        term917 = newInstance(Class.forName("nn.model.Connection"));
        Object term918 = newInstance(Class.forName("nn.model.Node"));
        Object term955 = newInstance(Class.forName("nn.model.Node"));
        setField(term918, term918.getClass(), "type", enum2);
        setIntField(term918, term918.getClass(), "innovation", 389427431);
        setField(term918, term918.getClass(), "connections", term930);
        setDoubleField(term918, term918.getClass(), "bias", 0.12764449157430724);
        setField(term917, term917.getClass(), "in", term918);
        setField(term955, term955.getClass(), "type", enum2);
        setIntField(term955, term955.getClass(), "innovation", -165587447);
        setField(term955, term955.getClass(), "connections", term957);
        setDoubleField(term955, term955.getClass(), "bias", 0.39446728256884744);
        setField(term917, term917.getClass(), "out", term955);
        setFloatField(term917, term917.getClass(), "weight", 0.15917838F);
        setBooleanField(term917, term917.getClass(), "expressed", false);
        setIntField(term917, term917.getClass(), "innovation", -1347358701);
        Object term974 = newInstance(Class.forName("nn.model.Connection"));
        setField(term974, term974.getClass(), "in", null);
        setField(term974, term974.getClass(), "out", null);
        setFloatField(term974, term974.getClass(), "weight", 0.079128504F);
        setBooleanField(term974, term974.getClass(), "expressed", false);
        setIntField(term974, term974.getClass(), "innovation", -1747406163);
        Object term978 = newInstance(Class.forName("nn.model.Connection"));
        setField(term978, term978.getClass(), "in", null);
        setField(term978, term978.getClass(), "out", null);
        setFloatField(term978, term978.getClass(), "weight", 0.0F);
        setBooleanField(term978, term978.getClass(), "expressed", false);
        setIntField(term978, term978.getClass(), "innovation", 0);
        Object term982 = newInstance(Class.forName("nn.model.Connection"));
        setField(term982, term982.getClass(), "in", null);
        setField(term982, term982.getClass(), "out", null);
        setFloatField(term982, term982.getClass(), "weight", 0.71813905F);
        setBooleanField(term982, term982.getClass(), "expressed", true);
        setIntField(term982, term982.getClass(), "innovation", -75206835);
        Object term986 = newInstance(Class.forName("nn.model.Connection"));
        setField(term986, term986.getClass(), "in", null);
        setField(term986, term986.getClass(), "out", null);
        setFloatField(term986, term986.getClass(), "weight", 0.37164736F);
        setBooleanField(term986, term986.getClass(), "expressed", false);
        setIntField(term986, term986.getClass(), "innovation", 880977281);
        Object term990 = newInstance(Class.forName("nn.model.Connection"));
        setField(term990, term990.getClass(), "in", null);
        setField(term990, term990.getClass(), "out", null);
        setFloatField(term990, term990.getClass(), "weight", 0.93741155F);
        setBooleanField(term990, term990.getClass(), "expressed", true);
        setIntField(term990, term990.getClass(), "innovation", -159494544);
        ArrayList term972 = new ArrayList();
        ((ArrayList) term972).add(term974);
        ((ArrayList) term972).add(term978);
        ((ArrayList) term972).add(term982);
        ((ArrayList) term972).add(term986);
        ((ArrayList) term972).add(term986);
        ((ArrayList) term972).add(term974);
        ((ArrayList) term972).add(term990);
        ArrayList term999 = new ArrayList();
        term969 = newInstance(Class.forName("nn.model.Connection"));
        Object term970 = newInstance(Class.forName("nn.model.Node"));
        Object term997 = newInstance(Class.forName("nn.model.Node"));
        setField(term970, term970.getClass(), "type", enum2);
        setIntField(term970, term970.getClass(), "innovation", 806595993);
        setField(term970, term970.getClass(), "connections", term972);
        setDoubleField(term970, term970.getClass(), "bias", 0.7385589312559342);
        setField(term969, term969.getClass(), "in", term970);
        setField(term997, term997.getClass(), "type", enum2);
        setIntField(term997, term997.getClass(), "innovation", -2131181468);
        setField(term997, term997.getClass(), "connections", term999);
        setDoubleField(term997, term997.getClass(), "bias", 0.0865998004187658);
        setField(term969, term969.getClass(), "out", term997);
        setFloatField(term969, term969.getClass(), "weight", 0.85665673F);
        setBooleanField(term969, term969.getClass(), "expressed", true);
        setIntField(term969, term969.getClass(), "innovation", 388157121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.ConnectionPair");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.Connection");
        argTypes[1] = Class.forName("nn.model.Connection");
        Object[] args = new Object[2];
        args[0] = term917;
        args[1] = term969;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


