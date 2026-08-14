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
     Object term7179;
     Object term7227;

    public Genome_addConnection_20051980592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7272 = Class.forName((String) "nn.model.Type");
        Field term7271 = ((Class) term7272).getDeclaredField((String) "HIDDEN");
        ((Field) term7271).setAccessible(true);
        Object enum36 = ((Field) term7271).get((Object) null);
        ArrayList term7186 = new ArrayList();
        ((ArrayList) term7186).add((Object)null);
        ((ArrayList) term7186).add((Object)null);
        Object term7182 = newInstance(Class.forName("nn.model.Node"));
        setField(term7182, term7182.getClass(), "type", enum36);
        setIntField(term7182, term7182.getClass(), "innovation", -2126539433);
        setField(term7182, term7182.getClass(), "connections", term7186);
        setDoubleField(term7182, term7182.getClass(), "bias", 0.16960229618566558);
        ArrayList term7180 = new ArrayList();
        ((ArrayList) term7180).add(term7182);
        Object term7194 = newInstance(Class.forName("nn.model.Connection"));
        Object term7195 = newInstance(Class.forName("nn.model.Node"));
        Object term7198 = newInstance(Class.forName("nn.model.Node"));
        setField(term7195, term7195.getClass(), "type", null);
        setIntField(term7195, term7195.getClass(), "innovation", -1514240086);
        setField(term7195, term7195.getClass(), "connections", null);
        setDoubleField(term7195, term7195.getClass(), "bias", 0.22217511003992507);
        setField(term7194, term7194.getClass(), "in", term7195);
        setField(term7198, term7198.getClass(), "type", null);
        setIntField(term7198, term7198.getClass(), "innovation", -1763480506);
        setField(term7198, term7198.getClass(), "connections", null);
        setDoubleField(term7198, term7198.getClass(), "bias", 0.41495700567487526);
        setField(term7194, term7194.getClass(), "out", term7198);
        setFloatField(term7194, term7194.getClass(), "weight", 0.1987465F);
        setBooleanField(term7194, term7194.getClass(), "expressed", true);
        setIntField(term7194, term7194.getClass(), "innovation", 355911655);
        Object term7204 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7204, term7204.getClass(), "in", null);
        setField(term7204, term7204.getClass(), "out", null);
        setFloatField(term7204, term7204.getClass(), "weight", 0.0F);
        setBooleanField(term7204, term7204.getClass(), "expressed", false);
        setIntField(term7204, term7204.getClass(), "innovation", 0);
        Object term7208 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7208, term7208.getClass(), "in", null);
        setField(term7208, term7208.getClass(), "out", null);
        setFloatField(term7208, term7208.getClass(), "weight", 0.0F);
        setBooleanField(term7208, term7208.getClass(), "expressed", false);
        setIntField(term7208, term7208.getClass(), "innovation", 0);
        Object term7212 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7212, term7212.getClass(), "in", null);
        setField(term7212, term7212.getClass(), "out", null);
        setFloatField(term7212, term7212.getClass(), "weight", 0.0F);
        setBooleanField(term7212, term7212.getClass(), "expressed", false);
        setIntField(term7212, term7212.getClass(), "innovation", 0);
        ArrayList term7192 = new ArrayList();
        ((ArrayList) term7192).add(term7194);
        ((ArrayList) term7192).add(term7204);
        ((ArrayList) term7192).add(term7208);
        ((ArrayList) term7192).add(term7208);
        ((ArrayList) term7192).add(term7212);
        term7179 = newInstance(Class.forName("nn.model.Genome"));
        Object term7218 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7220 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7222 = newInstance(Class.forName("java.util.Random"));
        Object term7223 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7179, term7179.getClass(), "nodes", term7180);
        setField(term7179, term7179.getClass(), "connections", term7192);
        setIntField(term7218, term7218.getClass(), "counter", 100);
        setField(term7179, term7179.getClass(), "nodeInnovator", term7218);
        setIntField(term7220, term7220.getClass(), "counter", 100);
        setField(term7179, term7179.getClass(), "connectionInnovator", term7220);
        setLongField(term7223, term7223.getClass(), "value", 46320335523819L);
        setField(term7222, term7222.getClass(), "seed", term7223);
        setDoubleField(term7222, term7222.getClass(), "nextNextGaussian", 0.5681156724199693);
        setBooleanField(term7222, term7222.getClass(), "haveNextNextGaussian", true);
        setField(term7179, term7179.getClass(), "random", term7222);
        Object term7232 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7232, term7232.getClass(), "in", null);
        setField(term7232, term7232.getClass(), "out", null);
        setFloatField(term7232, term7232.getClass(), "weight", 0.20341456F);
        setBooleanField(term7232, term7232.getClass(), "expressed", true);
        setIntField(term7232, term7232.getClass(), "innovation", 498473526);
        Object term7236 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7236, term7236.getClass(), "in", null);
        setField(term7236, term7236.getClass(), "out", null);
        setFloatField(term7236, term7236.getClass(), "weight", 0.0F);
        setBooleanField(term7236, term7236.getClass(), "expressed", false);
        setIntField(term7236, term7236.getClass(), "innovation", 0);
        ArrayList term7230 = new ArrayList();
        ((ArrayList) term7230).add(term7232);
        ((ArrayList) term7230).add(term7232);
        ((ArrayList) term7230).add(term7236);
        Class<? extends Object> term7362 = Class.forName((String) "nn.model.Type");
        Field term7361 = ((Class) term7362).getDeclaredField((String) "SENSOR");
        ((Field) term7361).setAccessible(true);
        Object enum37 = ((Field) term7361).get((Object) null);
        Object term7257 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7257, term7257.getClass(), "in", null);
        setField(term7257, term7257.getClass(), "out", null);
        setFloatField(term7257, term7257.getClass(), "weight", 0.0F);
        setBooleanField(term7257, term7257.getClass(), "expressed", false);
        setIntField(term7257, term7257.getClass(), "innovation", 0);
        Object term7261 = newInstance(Class.forName("nn.model.Connection"));
        setField(term7261, term7261.getClass(), "in", null);
        setField(term7261, term7261.getClass(), "out", null);
        setFloatField(term7261, term7261.getClass(), "weight", 0.0F);
        setBooleanField(term7261, term7261.getClass(), "expressed", false);
        setIntField(term7261, term7261.getClass(), "innovation", 0);
        ArrayList term7255 = new ArrayList();
        ((ArrayList) term7255).add(term7236);
        ((ArrayList) term7255).add(term7257);
        ((ArrayList) term7255).add(term7261);
        term7227 = newInstance(Class.forName("nn.model.Connection"));
        Object term7228 = newInstance(Class.forName("nn.model.Node"));
        Object term7243 = newInstance(Class.forName("nn.model.Node"));
        setField(term7228, term7228.getClass(), "type", enum36);
        setIntField(term7228, term7228.getClass(), "innovation", 1811833766);
        setField(term7228, term7228.getClass(), "connections", term7230);
        setDoubleField(term7228, term7228.getClass(), "bias", 0.1151115055344808);
        setField(term7227, term7227.getClass(), "in", term7228);
        setField(term7243, term7243.getClass(), "type", enum37);
        setIntField(term7243, term7243.getClass(), "innovation", 1186917020);
        setField(term7243, term7243.getClass(), "connections", term7255);
        setDoubleField(term7243, term7243.getClass(), "bias", 0.3906217058116741);
        setField(term7227, term7227.getClass(), "out", term7243);
        setFloatField(term7227, term7227.getClass(), "weight", 0.77281576F);
        setBooleanField(term7227, term7227.getClass(), "expressed", true);
        setIntField(term7227, term7227.getClass(), "innovation", 1670041824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Connection");
        Object[] args = new Object[1];
        args[0] = term7227;
        callMethod(klass, "addConnection", argTypes, term7179, args);
    }

};


