package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class HostToDomainGraph_getNodeLine_212613035813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;
     Object term1228;

    public HostToDomainGraph_getNodeLine_212613035813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1220 = new Long(1439298019805881866L);
        ArrayList term1218 = new ArrayList();
        ((ArrayList) term1218).add(term1220);
        term1165 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph"));
        int[] term1171 = (int[]) newIntArray(2);
        Object term1191 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        Object term1224 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term1165, term1165.getClass(), "countHosts", true);
        setBooleanField(term1165, term1165.getClass(), "privateDomains", true);
        setBooleanField(term1165, term1165.getClass(), "stripWww", true);
        setBooleanField(term1165, term1165.getClass(), "includeMultiPartSuffixes", false);
        setLongField(term1165, term1165.getClass(), "maxSize", -2850532706972744550L);
        setIntElement(term1171, 0, -1786399638);
        setIntElement(term1171, 1, 2055867847);
        setField(term1165, term1165.getClass(), "ids", term1171);
        setLongField(term1165, term1165.getClass(), "currentId", -1L);
        setLongField(term1165, term1165.getClass(), "lastFromId", -1L);
        setLongField(term1165, term1165.getClass(), "lastToId", -1L);
        setLongField(term1165, term1165.getClass(), "numInputLinesNodes", -2644215923136513282L);
        setLongField(term1165, term1165.getClass(), "numInputLinesEdges", -1468719814009985452L);
        setField(term1165, term1165.getClass(), "lastRevHost", "SbAoxhfrkn");
        setField(term1191, term1191.getClass(), "name", "kuTXqwMtDB");
        setField(term1191, term1191.getClass(), "revName", "Ghbwtircqb");
        setLongField(term1191, term1191.getClass(), "id", -7738503207562305297L);
        setLongField(term1191, term1191.getClass(), "numberOfHosts", 3825396310311739952L);
        setField(term1191, term1191.getClass(), "ids", term1218);
        setField(term1165, term1165.getClass(), "lastDomain", term1191);
        setField(term1224, term1224.getClass(), "comparator", null);
        setField(term1224, term1224.getClass(), "root", null);
        setIntField(term1224, term1224.getClass(), "size", 0);
        setIntField(term1224, term1224.getClass(), "modCount", 0);
        setField(term1224, term1224.getClass(), "entrySet", null);
        setField(term1224, term1224.getClass(), "navigableKeySet", null);
        setField(term1224, term1224.getClass(), "descendingMap", null);
        setField(term1224, term1224.getClass(), "keySet", null);
        setField(term1224, term1224.getClass(), "values", null);
        setField(term1165, term1165.getClass(), "domainQueue", term1224);
        setIntField(term1165, term1165.getClass(), "maxQueueUsed", -1048298087);
        setField(term1165, term1165.getClass(), "reporterInputNodes", null);
        setField(term1165, term1165.getClass(), "reporterInputEdges", null);
        Long term1257 = new Long(-8708192233349544946L);
        Long term1259 = new Long(5907001541142728739L);
        Long term1261 = new Long(4178434741742309755L);
        Long term1263 = new Long(-2068172595987555756L);
        Long term1265 = new Long(-6292278961887936280L);
        Long term1267 = new Long(-6645965768855543712L);
        Long term1269 = new Long(4784595517102746672L);
        Long term1271 = new Long(-7612550318181586304L);
        Long term1273 = new Long(-2170847986967241072L);
        ArrayList term1255 = new ArrayList();
        ((ArrayList) term1255).add(term1257);
        ((ArrayList) term1255).add(term1259);
        ((ArrayList) term1255).add(term1261);
        ((ArrayList) term1255).add(term1263);
        ((ArrayList) term1255).add(term1265);
        ((ArrayList) term1255).add(term1267);
        ((ArrayList) term1255).add(term1269);
        ((ArrayList) term1255).add(term1271);
        ((ArrayList) term1255).add(term1273);
        term1228 = newInstance(Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain"));
        setField(term1228, term1228.getClass(), "name", "xrwlQZdwCp");
        setField(term1228, term1228.getClass(), "revName", "IDCWpPLRkE");
        setLongField(term1228, term1228.getClass(), "id", -3838084482494604218L);
        setLongField(term1228, term1228.getClass(), "numberOfHosts", 3892018155439224435L);
        setField(term1228, term1228.getClass(), "ids", term1255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.commoncrawl.webgraph.HostToDomainGraph$Domain");
        Object[] args = new Object[1];
        args[0] = term1228;
        callMethod(klass, "getNodeLine", argTypes, term1165, args);
    }

};


