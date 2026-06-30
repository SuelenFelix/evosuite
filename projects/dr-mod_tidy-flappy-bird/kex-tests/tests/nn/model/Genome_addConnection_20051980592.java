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

public class Genome_addConnection_20051980592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7177;
     Object term7225;

    public Genome_addConnection_20051980592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7270 = Class.forName((String) "nn.model.Type");
        Field term7269 = ((Class) term7270).getDeclaredField((String) "HIDDEN");
        ((Field) term7269).setAccessible(true);
        Object enum36 = ((Field) term7269).get((Object) null);
        ArrayList term7184 = new ArrayList();
        ((ArrayList) term7184).add((Object)null);
        ((ArrayList) term7184).add((Object)null);
        Object term7180 = newInstance(Class.forName("nn.model.Node"));
        setField(term7180, term7180.getClass(), "type", enum36);
        setIntField(term7180, term7180.getClass(), "innovation", -2126539433);
        setField(term7180, term7180.getClass(), "connections", term7184);
        setDoubleField(term7180, term7180.getClass(), "bias", 0.16960229618566558);
        ArrayList term7178 = new ArrayList();
        ((ArrayList) term7178).add(term7180);
        Object term7192 = newInstance(Class.forName("nn.model.Connection"));
        Object term7193 = newInstance(Class.forName("nn.model.Node"));
        Object term7196 = newInstance(Class.forName("nn.model.Node"));
        setField(term7193, term7193.getClass(), "type", null);
        setIntField(term7193, term7193.getClass(), "innovation", -1514240086);
        setField(term7193, term7193.getClass(), "connections", null);
        setDoubleField(term7193, term7193.getClass(), "bias", 0.22217511003992507);
        setField(term7192, term7192.getClass(), "in", term7193);
        setField(term7196, term7196.getClass(), "type", null);
        setIntField(term7196, term7196.getClass(), "innovation", -1763480506);
        setField(term7196, term7196.getClass(), "connections", null);
        setDoubleField(term7196, term7196.getClass(), "bias", 0.41495700567487526);
        setField(term7192, term7192.getClass(), "out", term7196);
        setFloatField(term7192, term7192.getClass(), "weight", 0.1987465F);
        setBooleanField(term7192, term7192.getClass(), "expressed", true);
        setIntField(term7192, term7192.getClass(), "innovation", 355911655);
        Object term7202 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7202, term7202.getClass(), "in", null);
        setField(term7202, term7202.getClass(), "out", null);
        setFloatField(term7202, term7202.getClass(), "weight", 0.0F);
        setBooleanField(term7202, term7202.getClass(), "expressed", false);
        setIntField(term7202, term7202.getClass(), "innovation", 0);
        Object term7206 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7206, term7206.getClass(), "in", null);
        setField(term7206, term7206.getClass(), "out", null);
        setFloatField(term7206, term7206.getClass(), "weight", 0.0F);
        setBooleanField(term7206, term7206.getClass(), "expressed", false);
        setIntField(term7206, term7206.getClass(), "innovation", 0);
        Object term7210 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7210, term7210.getClass(), "in", null);
        setField(term7210, term7210.getClass(), "out", null);
        setFloatField(term7210, term7210.getClass(), "weight", 0.0F);
        setBooleanField(term7210, term7210.getClass(), "expressed", false);
        setIntField(term7210, term7210.getClass(), "innovation", 0);
        ArrayList term7190 = new ArrayList();
        ((ArrayList) term7190).add(term7192);
        ((ArrayList) term7190).add(term7202);
        ((ArrayList) term7190).add(term7206);
        ((ArrayList) term7190).add(term7206);
        ((ArrayList) term7190).add(term7210);
        term7177 = newInstance(Class.forName("nn.model.Genome"));
        Object term7216 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7218 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7220 = newInstance(Class.forName("java.util.Random"));
        Object term7221 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7177, term7177.getClass(), "nodes", term7178);
        setField(term7177, term7177.getClass(), "connections", term7190);
        setIntField(term7216, term7216.getClass(), "counter", 100);
        setField(term7177, term7177.getClass(), "nodeInnovator", term7216);
        setIntField(term7218, term7218.getClass(), "counter", 100);
        setField(term7177, term7177.getClass(), "connectionInnovator", term7218);
        setLongField(term7221, term7221.getClass(), "value", 141905448667697L);
        setField(term7220, term7220.getClass(), "seed", term7221);
        setDoubleField(term7220, term7220.getClass(), "nextNextGaussian", 0.5681156724199693);
        setBooleanField(term7220, term7220.getClass(), "haveNextNextGaussian", true);
        setField(term7177, term7177.getClass(), "random", term7220);
        Object term7230 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7230, term7230.getClass(), "in", null);
        setField(term7230, term7230.getClass(), "out", null);
        setFloatField(term7230, term7230.getClass(), "weight", 0.20341456F);
        setBooleanField(term7230, term7230.getClass(), "expressed", true);
        setIntField(term7230, term7230.getClass(), "innovation", 498473526);
        Object term7234 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7234, term7234.getClass(), "in", null);
        setField(term7234, term7234.getClass(), "out", null);
        setFloatField(term7234, term7234.getClass(), "weight", 0.0F);
        setBooleanField(term7234, term7234.getClass(), "expressed", false);
        setIntField(term7234, term7234.getClass(), "innovation", 0);
        ArrayList term7228 = new ArrayList();
        ((ArrayList) term7228).add(term7230);
        ((ArrayList) term7228).add(term7230);
        ((ArrayList) term7228).add(term7234);
        Class<? extends Object> term7360 = Class.forName((String) "nn.model.Type");
        Field term7359 = ((Class) term7360).getDeclaredField((String) "SENSOR");
        ((Field) term7359).setAccessible(true);
        Object enum37 = ((Field) term7359).get((Object) null);
        Object term7255 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7255, term7255.getClass(), "in", null);
        setField(term7255, term7255.getClass(), "out", null);
        setFloatField(term7255, term7255.getClass(), "weight", 0.0F);
        setBooleanField(term7255, term7255.getClass(), "expressed", false);
        setIntField(term7255, term7255.getClass(), "innovation", 0);
        Object term7259 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7259, term7259.getClass(), "in", null);
        setField(term7259, term7259.getClass(), "out", null);
        setFloatField(term7259, term7259.getClass(), "weight", 0.0F);
        setBooleanField(term7259, term7259.getClass(), "expressed", false);
        setIntField(term7259, term7259.getClass(), "innovation", 0);
        ArrayList term7253 = new ArrayList();
        ((ArrayList) term7253).add(term7234);
        ((ArrayList) term7253).add(term7255);
        ((ArrayList) term7253).add(term7259);
        term7225 = newInstance(Class.forName("nn.model.Connection"));
        Object term7226 = newInstance(Class.forName("nn.model.Node"));
        Object term7241 = newInstance(Class.forName("nn.model.Node"));
        setField(term7226, term7226.getClass(), "type", enum36);
        setIntField(term7226, term7226.getClass(), "innovation", 1811833766);
        setField(term7226, term7226.getClass(), "connections", term7228);
        setDoubleField(term7226, term7226.getClass(), "bias", 0.1151115055344808);
        setField(term7225, term7225.getClass(), "in", term7226);
        setField(term7241, term7241.getClass(), "type", enum37);
        setIntField(term7241, term7241.getClass(), "innovation", 1186917020);
        setField(term7241, term7241.getClass(), "connections", term7253);
        setDoubleField(term7241, term7241.getClass(), "bias", 0.3906217058116741);
        setField(term7225, term7225.getClass(), "out", term7241);
        setFloatField(term7225, term7225.getClass(), "weight", 0.77281576F);
        setBooleanField(term7225, term7225.getClass(), "expressed", true);
        setIntField(term7225, term7225.getClass(), "innovation", 1670041824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Connection");
        Object[] args = new Object[1];
        args[0] = term7225;
        callMethod(klass, "addConnection", argTypes, term7177, args);
    }

};


