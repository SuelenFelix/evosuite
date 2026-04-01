package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Object;

public class MinimumSpanningTreeIterator_hasNext_9222613591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;

    public MinimumSpanningTreeIterator_hasNext_9222613591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term298 = new Double(0.3202192021706908);
        Double term307 = new Double(0.22651340641904605);
        Double term309 = new Double(0.8878841294187743);
        Double term311 = new Double(0.6588948704887806);
        Double term318 = new Double(0.6397214730945112);
        Double term320 = new Double(0.25937345430928016);
        Double term322 = new Double(0.5873228247510078);
        Double term324 = new Double(0.8823181080774973);
        Double term326 = new Double(0.2192450926212024);
        Double term328 = new Double(0.7591353014991907);
        Double term330 = new Double(0.791695029600875);
        Double term337 = new Double(0.6862221294683138);
        Double term339 = new Double(0.15917839663695388);
        Double term346 = new Double(0.9374115574082594);
        Double term348 = new Double(0.8454723071922143);
        Double term350 = new Double(0.8566567697571895);
        Double term352 = new Double(0.9203805380592256);
        Double term354 = new Double(0.5804948995371725);
        Double term356 = new Double(0.20737514139742264);
        Double term363 = new Double(0.7919370314903882);
        Double term365 = new Double(0.2109867221632754);
        Double term367 = new Double(0.3227335400819148);
        Double term369 = new Double(0.43337207054070237);
        Double term371 = new Double(0.13246999699526574);
        Double term373 = new Double(0.9126850255993704);
        term297 = newInstance(Class.forName("org.graph4j.spanning.MinimumSpanningTreeIterator"));
        Object[] term301 = (Object[]) newArray("org.graph4j.Edge", 5);
        Object term302 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term306 = (Object[]) newArray("java.lang.Double", 3);
        Object term313 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term317 = (Object[]) newArray("java.lang.Double", 7);
        Object term332 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term336 = (Object[]) newArray("java.lang.Double", 2);
        Object term341 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term345 = (Object[]) newArray("java.lang.Double", 6);
        Object term358 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term362 = (Object[]) newArray("java.lang.Double", 6);
        setField(term297, term297.getClass(), "minWeight", term298);
        setField(term297, term297.getClass(), "graph", null);
        setIntField(term297, term297.getClass(), "numVertices", 1375330971);
        setBooleanField(term302, term302.getClass(), "directed", true);
        setIntField(term302, term302.getClass(), "source", -478195677);
        setIntField(term302, term302.getClass(), "target", 972867650);
        setElement(term306, 0, term307);
        setElement(term306, 1, term309);
        setElement(term306, 2, term311);
        setField(term302, term302.getClass(), "data", term306);
        setField(term302, term302.getClass(), "label", null);
        setElement(term301, 0, term302);
        setBooleanField(term313, term313.getClass(), "directed", true);
        setIntField(term313, term313.getClass(), "source", 1655935355);
        setIntField(term313, term313.getClass(), "target", -481533957);
        setElement(term317, 0, term318);
        setElement(term317, 1, term320);
        setElement(term317, 2, term322);
        setElement(term317, 3, term324);
        setElement(term317, 4, term326);
        setElement(term317, 5, term328);
        setElement(term317, 6, term330);
        setField(term313, term313.getClass(), "data", term317);
        setField(term313, term313.getClass(), "label", null);
        setElement(term301, 1, term313);
        setBooleanField(term332, term332.getClass(), "directed", true);
        setIntField(term332, term332.getClass(), "source", 1240914516);
        setIntField(term332, term332.getClass(), "target", -1465035361);
        setElement(term336, 0, term337);
        setElement(term336, 1, term339);
        setField(term332, term332.getClass(), "data", term336);
        setField(term332, term332.getClass(), "label", null);
        setElement(term301, 2, term332);
        setBooleanField(term341, term341.getClass(), "directed", false);
        setIntField(term341, term341.getClass(), "source", 1090617576);
        setIntField(term341, term341.getClass(), "target", -1547384488);
        setElement(term345, 0, term346);
        setElement(term345, 1, term348);
        setElement(term345, 2, term350);
        setElement(term345, 3, term352);
        setElement(term345, 4, term354);
        setElement(term345, 5, term356);
        setField(term341, term341.getClass(), "data", term345);
        setField(term341, term341.getClass(), "label", null);
        setElement(term301, 3, term341);
        setBooleanField(term358, term358.getClass(), "directed", false);
        setIntField(term358, term358.getClass(), "source", 1442160736);
        setIntField(term358, term358.getClass(), "target", 1114000454);
        setElement(term362, 0, term363);
        setElement(term362, 1, term365);
        setElement(term362, 2, term367);
        setElement(term362, 3, term369);
        setElement(term362, 4, term371);
        setElement(term362, 5, term373);
        setField(term358, term358.getClass(), "data", term362);
        setField(term358, term358.getClass(), "label", null);
        setElement(term301, 4, term358);
        setField(term297, term297.getClass(), "edges", term301);
        setField(term297, term297.getClass(), "queue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.MinimumSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term297, args);
    }

};


