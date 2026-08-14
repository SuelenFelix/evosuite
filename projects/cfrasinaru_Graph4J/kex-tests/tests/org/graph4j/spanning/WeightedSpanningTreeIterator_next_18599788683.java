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
import java.lang.Object;
import java.lang.Double;

public class WeightedSpanningTreeIterator_next_18599788683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520;

    public WeightedSpanningTreeIterator_next_18599788683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term528 = new Double(0.7818620200430967);
        Double term530 = new Double(0.04640022995603543);
        Double term537 = new Double(0.9123572866833729);
        Double term539 = new Double(0.40635376375558196);
        Double term541 = new Double(0.4772043271031934);
        Double term543 = new Double(0.2446504549754045);
        Double term545 = new Double(0.6142723998707854);
        Double term547 = new Double(0.4355627280318103);
        Double term549 = new Double(0.841460835734741);
        Double term551 = new Double(0.7859316615744082);
        Double term553 = new Double(0.6428742553484879);
        Double term560 = new Double(0.6584165706677267);
        Double term562 = new Double(0.44268490778872205);
        Double term564 = new Double(0.7507333108648018);
        Double term566 = new Double(0.007493740494434409);
        Double term568 = new Double(0.29172553321356776);
        Double term570 = new Double(0.9276995636844321);
        Double term572 = new Double(0.7636130748477434);
        Double term579 = new Double(0.07901636960861558);
        Double term581 = new Double(0.18717846301066243);
        Double term583 = new Double(0.5335953039331021);
        Double term585 = new Double(0.5725602309856443);
        Double term587 = new Double(0.5310967137636303);
        Double term589 = new Double(0.6054109236809134);
        Double term596 = new Double(0.9165240441138934);
        Double term598 = new Double(0.22227423914231126);
        Double term600 = new Double(0.06480976831423468);
        Double term602 = new Double(0.8490790645379176);
        Double term604 = new Double(0.23129126164078717);
        Double term606 = new Double(0.6047138318674447);
        Double term608 = new Double(0.5597136413549945);
        Double term615 = new Double(0.28292420012823627);
        Double term617 = new Double(0.5407563152320285);
        Double term619 = new Double(0.9485929668765458);
        Double term621 = new Double(0.5179319342588155);
        Double term623 = new Double(0.25025774487844066);
        Double term625 = new Double(0.1858089882752998);
        Double term627 = new Double(0.2440697646709713);
        Double term629 = new Double(0.7977455176064363);
        Double term631 = new Double(0.5329919447422633);
        Double term638 = new Double(0.7046974927834232);
        Double term640 = new Double(0.6896952303224777);
        Double term642 = new Double(0.6693176553622628);
        Double term644 = new Double(0.2962868255626906);
        Double term646 = new Double(0.25474180574060834);
        Double term648 = new Double(0.9957585718901875);
        Double term650 = new Double(0.16755811343784477);
        term520 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        Object[] term522 = (Object[]) newArray("org.graph4j.Edge", 7);
        Object term523 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term527 = (Object[]) newArray("java.lang.Double", 2);
        Object term532 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term536 = (Object[]) newArray("java.lang.Double", 9);
        Object term555 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term559 = (Object[]) newArray("java.lang.Double", 7);
        Object term574 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term578 = (Object[]) newArray("java.lang.Double", 6);
        Object term591 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term595 = (Object[]) newArray("java.lang.Double", 7);
        Object term610 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term614 = (Object[]) newArray("java.lang.Double", 9);
        Object term633 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term637 = (Object[]) newArray("java.lang.Double", 7);
        setField(term520, term520.getClass(), "graph", null);
        setIntField(term520, term520.getClass(), "numVertices", 1386130016);
        setBooleanField(term523, term523.getClass(), "directed", true);
        setIntField(term523, term523.getClass(), "source", 1072005683);
        setIntField(term523, term523.getClass(), "target", 1861318859);
        setElement(term527, 0, term528);
        setElement(term527, 1, term530);
        setField(term523, term523.getClass(), "data", term527);
        setField(term523, term523.getClass(), "label", null);
        setElement(term522, 0, term523);
        setBooleanField(term532, term532.getClass(), "directed", false);
        setIntField(term532, term532.getClass(), "source", 1474524152);
        setIntField(term532, term532.getClass(), "target", 568954359);
        setElement(term536, 0, term537);
        setElement(term536, 1, term539);
        setElement(term536, 2, term541);
        setElement(term536, 3, term543);
        setElement(term536, 4, term545);
        setElement(term536, 5, term547);
        setElement(term536, 6, term549);
        setElement(term536, 7, term551);
        setElement(term536, 8, term553);
        setField(term532, term532.getClass(), "data", term536);
        setField(term532, term532.getClass(), "label", null);
        setElement(term522, 1, term532);
        setBooleanField(term555, term555.getClass(), "directed", true);
        setIntField(term555, term555.getClass(), "source", 53410913);
        setIntField(term555, term555.getClass(), "target", -375014958);
        setElement(term559, 0, term560);
        setElement(term559, 1, term562);
        setElement(term559, 2, term564);
        setElement(term559, 3, term566);
        setElement(term559, 4, term568);
        setElement(term559, 5, term570);
        setElement(term559, 6, term572);
        setField(term555, term555.getClass(), "data", term559);
        setField(term555, term555.getClass(), "label", null);
        setElement(term522, 2, term555);
        setBooleanField(term574, term574.getClass(), "directed", true);
        setIntField(term574, term574.getClass(), "source", 1107176718);
        setIntField(term574, term574.getClass(), "target", 480137250);
        setElement(term578, 0, term579);
        setElement(term578, 1, term581);
        setElement(term578, 2, term583);
        setElement(term578, 3, term585);
        setElement(term578, 4, term587);
        setElement(term578, 5, term589);
        setField(term574, term574.getClass(), "data", term578);
        setField(term574, term574.getClass(), "label", null);
        setElement(term522, 3, term574);
        setBooleanField(term591, term591.getClass(), "directed", true);
        setIntField(term591, term591.getClass(), "source", -341152642);
        setIntField(term591, term591.getClass(), "target", -2015854073);
        setElement(term595, 0, term596);
        setElement(term595, 1, term598);
        setElement(term595, 2, term600);
        setElement(term595, 3, term602);
        setElement(term595, 4, term604);
        setElement(term595, 5, term606);
        setElement(term595, 6, term608);
        setField(term591, term591.getClass(), "data", term595);
        setField(term591, term591.getClass(), "label", null);
        setElement(term522, 4, term591);
        setBooleanField(term610, term610.getClass(), "directed", false);
        setIntField(term610, term610.getClass(), "source", 538259104);
        setIntField(term610, term610.getClass(), "target", 96566506);
        setElement(term614, 0, term615);
        setElement(term614, 1, term617);
        setElement(term614, 2, term619);
        setElement(term614, 3, term621);
        setElement(term614, 4, term623);
        setElement(term614, 5, term625);
        setElement(term614, 6, term627);
        setElement(term614, 7, term629);
        setElement(term614, 8, term631);
        setField(term610, term610.getClass(), "data", term614);
        setField(term610, term610.getClass(), "label", null);
        setElement(term522, 5, term610);
        setBooleanField(term633, term633.getClass(), "directed", true);
        setIntField(term633, term633.getClass(), "source", -343325701);
        setIntField(term633, term633.getClass(), "target", 107945604);
        setElement(term637, 0, term638);
        setElement(term637, 1, term640);
        setElement(term637, 2, term642);
        setElement(term637, 3, term644);
        setElement(term637, 4, term646);
        setElement(term637, 5, term648);
        setElement(term637, 6, term650);
        setField(term633, term633.getClass(), "data", term637);
        setField(term633, term633.getClass(), "label", null);
        setElement(term522, 6, term633);
        setField(term520, term520.getClass(), "edges", term522);
        setField(term520, term520.getClass(), "queue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term520, args);
    }

};


