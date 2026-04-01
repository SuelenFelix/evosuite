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

public class FloydWarshallShortestPath_initBefore_16636307894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146;

    public FloydWarshallShortestPath_initBefore_16636307894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1146 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1147 = (Object[]) newArray("[D", 6);
        double[] term1148 = (double[]) newDoubleArray(3);
        double[] term1152 = (double[]) newDoubleArray(4);
        double[] term1157 = (double[]) newDoubleArray(5);
        double[] term1163 = (double[]) newDoubleArray(8);
        double[] term1172 = (double[]) newDoubleArray(8);
        double[] term1181 = (double[]) newDoubleArray(5);
        Object[] term1187 = (Object[]) newArray("[I", 6);
        int[] term1188 = (int[]) newIntArray(3);
        int[] term1192 = (int[]) newIntArray(0);
        int[] term1193 = (int[]) newIntArray(5);
        int[] term1199 = (int[]) newIntArray(6);
        int[] term1206 = (int[]) newIntArray(0);
        int[] term1207 = (int[]) newIntArray(3);
        setDoubleElement(term1148, 0, 0.07932996853888874);
        setDoubleElement(term1148, 1, 0.4335752168808029);
        setDoubleElement(term1148, 2, 0.9196949182738653);
        setElement(term1147, 0, term1148);
        setDoubleElement(term1152, 0, 0.5820770579753712);
        setDoubleElement(term1152, 1, 0.8935041663395363);
        setDoubleElement(term1152, 2, 0.2542403704113868);
        setDoubleElement(term1152, 3, 0.4614378239284842);
        setElement(term1147, 1, term1152);
        setDoubleElement(term1157, 0, 0.10963898027157926);
        setDoubleElement(term1157, 1, 0.34234234602085223);
        setDoubleElement(term1157, 2, 0.8355624480198577);
        setDoubleElement(term1157, 3, 0.8303221706066055);
        setDoubleElement(term1157, 4, 0.7102687477135848);
        setElement(term1147, 2, term1157);
        setDoubleElement(term1163, 0, 0.7984332537471793);
        setDoubleElement(term1163, 1, 0.6782349539183316);
        setDoubleElement(term1163, 2, 0.6464654528667407);
        setDoubleElement(term1163, 3, 0.6416885379658445);
        setDoubleElement(term1163, 4, 0.604465128384297);
        setDoubleElement(term1163, 5, 0.5180566811475131);
        setDoubleElement(term1163, 6, 0.6773553630262286);
        setDoubleElement(term1163, 7, 0.0416412064984476);
        setElement(term1147, 3, term1163);
        setDoubleElement(term1172, 0, 0.9188322321077216);
        setDoubleElement(term1172, 1, 0.8046904246652031);
        setDoubleElement(term1172, 2, 0.16734523112870836);
        setDoubleElement(term1172, 3, 0.9711083796772954);
        setDoubleElement(term1172, 4, 0.329228491476264);
        setDoubleElement(term1172, 5, 0.8664463700873805);
        setDoubleElement(term1172, 6, 0.4228841212022646);
        setDoubleElement(term1172, 7, 0.9898207968242465);
        setElement(term1147, 4, term1172);
        setDoubleElement(term1181, 0, 0.025396748287270232);
        setDoubleElement(term1181, 1, 0.22437750947699786);
        setDoubleElement(term1181, 2, 0.3142783864669928);
        setDoubleElement(term1181, 3, 0.28838369056651414);
        setDoubleElement(term1181, 4, 0.3505219043338702);
        setElement(term1147, 5, term1181);
        setField(term1146, term1146.getClass(), "cost", term1147);
        setIntElement(term1188, 0, -1697741339);
        setIntElement(term1188, 1, 98922530);
        setIntElement(term1188, 2, -1388471422);
        setElement(term1187, 0, term1188);
        setElement(term1187, 1, term1192);
        setIntElement(term1193, 0, -1498296052);
        setIntElement(term1193, 1, 2098647989);
        setIntElement(term1193, 2, 1598895173);
        setIntElement(term1193, 3, 1830648570);
        setIntElement(term1193, 4, -227365013);
        setElement(term1187, 2, term1193);
        setIntElement(term1199, 0, 11724947);
        setIntElement(term1199, 1, 1953277050);
        setIntElement(term1199, 2, 1283079251);
        setIntElement(term1199, 3, -523949691);
        setIntElement(term1199, 4, 1398204340);
        setIntElement(term1199, 5, 229204365);
        setElement(term1187, 3, term1199);
        setElement(term1187, 4, term1206);
        setIntElement(term1207, 0, -461771056);
        setIntElement(term1207, 1, -243422082);
        setIntElement(term1207, 2, 1384592638);
        setElement(term1187, 5, term1207);
        setField(term1146, term1146.getClass(), "before", term1187);
        setField(term1146, term1146.getClass(), "graph", null);
        setBooleanField(term1146, term1146.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initBefore", argTypes, term1146, args);
    }

};


