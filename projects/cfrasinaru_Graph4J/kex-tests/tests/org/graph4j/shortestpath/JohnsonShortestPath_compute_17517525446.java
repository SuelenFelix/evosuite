package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class JohnsonShortestPath_compute_17517525446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878;
     Object term939;

    public JohnsonShortestPath_compute_17517525446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term878 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term879 = (double[]) newDoubleArray(9);
        Object[] term889 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 6);
        Object[] term890 = (Object[]) newArray("[D", 8);
        double[] term891 = (double[]) newDoubleArray(6);
        double[] term898 = (double[]) newDoubleArray(2);
        double[] term901 = (double[]) newDoubleArray(1);
        double[] term903 = (double[]) newDoubleArray(5);
        double[] term909 = (double[]) newDoubleArray(3);
        double[] term913 = (double[]) newDoubleArray(9);
        double[] term923 = (double[]) newDoubleArray(7);
        double[] term931 = (double[]) newDoubleArray(6);
        setField(term878, term878.getClass(), "auxGraph", null);
        setDoubleElement(term879, 0, 0.7856101337088763);
        setDoubleElement(term879, 1, 0.1782857269567425);
        setDoubleElement(term879, 2, 0.17829386444171214);
        setDoubleElement(term879, 3, 0.547995853732519);
        setDoubleElement(term879, 4, 0.3483938514131425);
        setDoubleElement(term879, 5, 0.0100718646868041);
        setDoubleElement(term879, 6, 0.58265008665336);
        setDoubleElement(term879, 7, 0.1163034938203874);
        setDoubleElement(term879, 8, 0.1187814206908886);
        setField(term878, term878.getClass(), "h", term879);
        setField(term878, term878.getClass(), "algs", term889);
        setDoubleElement(term891, 0, 0.04662501176438627);
        setDoubleElement(term891, 1, 0.17512426723256447);
        setDoubleElement(term891, 2, 0.9379214810416256);
        setDoubleElement(term891, 3, 0.10807577760679721);
        setDoubleElement(term891, 4, 0.7808234535616719);
        setDoubleElement(term891, 5, 0.9772425797816359);
        setElement(term890, 0, term891);
        setDoubleElement(term898, 0, 0.32009327814110977);
        setDoubleElement(term898, 1, 0.9013029318694921);
        setElement(term890, 1, term898);
        setDoubleElement(term901, 0, 0.1755673139619638);
        setElement(term890, 2, term901);
        setDoubleElement(term903, 0, 0.9136597256674437);
        setDoubleElement(term903, 1, 0.3741779691002205);
        setDoubleElement(term903, 2, 0.5652495059647745);
        setDoubleElement(term903, 3, 0.021410850431387685);
        setDoubleElement(term903, 4, 0.8397628091272534);
        setElement(term890, 3, term903);
        setDoubleElement(term909, 0, 0.01784667720947175);
        setDoubleElement(term909, 1, 0.4395312828193261);
        setDoubleElement(term909, 2, 0.5715204226647931);
        setElement(term890, 4, term909);
        setDoubleElement(term913, 0, 0.6420798930164424);
        setDoubleElement(term913, 1, 0.0011409626665044303);
        setDoubleElement(term913, 2, 0.5195852993308188);
        setDoubleElement(term913, 3, 0.6533293939565151);
        setDoubleElement(term913, 4, 0.7361083671494018);
        setDoubleElement(term913, 5, 0.056643259984349825);
        setDoubleElement(term913, 6, 0.5984863932443171);
        setDoubleElement(term913, 7, 0.04708163975594959);
        setDoubleElement(term913, 8, 0.8223115496053149);
        setElement(term890, 5, term913);
        setDoubleElement(term923, 0, 0.06795505641704636);
        setDoubleElement(term923, 1, 0.198746516614277);
        setDoubleElement(term923, 2, 0.16852568658760048);
        setDoubleElement(term923, 3, 0.20341461558365515);
        setDoubleElement(term923, 4, 0.10087360265456191);
        setDoubleElement(term923, 5, 0.5957631946929023);
        setDoubleElement(term923, 6, 0.9963416078314885);
        setElement(term890, 6, term923);
        setDoubleElement(term931, 0, 0.3147638130628596);
        setDoubleElement(term931, 1, 0.24810335047389354);
        setDoubleElement(term931, 2, 0.9113409083257852);
        setDoubleElement(term931, 3, 0.7444535250398684);
        setDoubleElement(term931, 4, 0.37439559220953034);
        setDoubleElement(term931, 5, 0.5010337159337968);
        setElement(term890, 7, term931);
        setField(term878, term878.getClass(), "weights", term890);
        setField(term878, term878.getClass(), "graph", null);
        setBooleanField(term878, term878.getClass(), "directed", true);
        term939 = new Integer(71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term939;
        callMethod(klass, "compute", argTypes, term878, args);
    }

};


