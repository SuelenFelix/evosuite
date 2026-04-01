package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class OrderedDigraph_getEdge_8652181726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1084;
     Object term1196;
     Object term1198;

    public OrderedDigraph_getEdge_8652181726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1183 = new HashMap();
        term1084 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        Object[] term1086 = (Object[]) newArray("[I", 8);
        int[] term1087 = (int[]) newIntArray(0);
        int[] term1088 = (int[]) newIntArray(5);
        int[] term1094 = (int[]) newIntArray(4);
        int[] term1099 = (int[]) newIntArray(1);
        int[] term1101 = (int[]) newIntArray(0);
        int[] term1102 = (int[]) newIntArray(6);
        int[] term1109 = (int[]) newIntArray(3);
        int[] term1113 = (int[]) newIntArray(4);
        Object[] term1118 = (Object[]) newArray("[I", 5);
        int[] term1119 = (int[]) newIntArray(8);
        int[] term1128 = (int[]) newIntArray(8);
        int[] term1137 = (int[]) newIntArray(5);
        int[] term1143 = (int[]) newIntArray(6);
        int[] term1150 = (int[]) newIntArray(3);
        Object[] term1154 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass(), 0);
        Object[] term1155 = (Object[]) newArray("[B", 5);
        byte[] term1156 = (byte[]) newByteArray(6);
        byte[] term1163 = (byte[]) newByteArray(0);
        byte[] term1164 = (byte[]) newByteArray(3);
        byte[] term1168 = (byte[]) newByteArray(1);
        byte[] term1170 = (byte[]) newByteArray(9);
        int[] term1180 = (int[]) newIntArray(2);
        setField(term1084, term1084.getClass(), "dg", null);
        setIntField(term1084, term1084.getClass(), "n", 1008080511);
        setElement(term1086, 0, term1087);
        setIntElement(term1088, 0, 1935707624);
        setIntElement(term1088, 1, 1507074215);
        setIntElement(term1088, 2, -282881827);
        setIntElement(term1088, 3, -1183353915);
        setIntElement(term1088, 4, -420030135);
        setElement(term1086, 1, term1088);
        setIntElement(term1094, 0, 267763294);
        setIntElement(term1094, 1, -1497710478);
        setIntElement(term1094, 2, 49950830);
        setIntElement(term1094, 3, -525257914);
        setElement(term1086, 2, term1094);
        setIntElement(term1099, 0, 147209682);
        setElement(term1086, 3, term1099);
        setElement(term1086, 4, term1101);
        setIntElement(term1102, 0, 34470066);
        setIntElement(term1102, 1, 2058711405);
        setIntElement(term1102, 2, 1743683601);
        setIntElement(term1102, 3, -945116798);
        setIntElement(term1102, 4, 1593461795);
        setIntElement(term1102, 5, 515182546);
        setElement(term1086, 5, term1102);
        setIntElement(term1109, 0, -936895502);
        setIntElement(term1109, 1, -129547140);
        setIntElement(term1109, 2, 199287428);
        setElement(term1086, 6, term1109);
        setIntElement(term1113, 0, -1195339592);
        setIntElement(term1113, 1, -376422566);
        setIntElement(term1113, 2, 306847454);
        setIntElement(term1113, 3, 1745276158);
        setElement(term1086, 7, term1113);
        setField(term1084, term1084.getClass(), "predecessors", term1086);
        setIntElement(term1119, 0, 2009020256);
        setIntElement(term1119, 1, 2049577015);
        setIntElement(term1119, 2, 1236004505);
        setIntElement(term1119, 3, 1050765721);
        setIntElement(term1119, 4, 474518942);
        setIntElement(term1119, 5, -1656687479);
        setIntElement(term1119, 6, -249614216);
        setIntElement(term1119, 7, 1870727665);
        setElement(term1118, 0, term1119);
        setIntElement(term1128, 0, -519881101);
        setIntElement(term1128, 1, -680920524);
        setIntElement(term1128, 2, -916335264);
        setIntElement(term1128, 3, -919416536);
        setIntElement(term1128, 4, -43417861);
        setIntElement(term1128, 5, -1533843432);
        setIntElement(term1128, 6, -123338791);
        setIntElement(term1128, 7, -1467089634);
        setElement(term1118, 1, term1128);
        setIntElement(term1137, 0, 413548937);
        setIntElement(term1137, 1, 1901317214);
        setIntElement(term1137, 2, 1166710220);
        setIntElement(term1137, 3, -1070592289);
        setIntElement(term1137, 4, -1464172784);
        setElement(term1118, 2, term1137);
        setIntElement(term1143, 0, 32185364);
        setIntElement(term1143, 1, 1768204942);
        setIntElement(term1143, 2, 1252951645);
        setIntElement(term1143, 3, 574481092);
        setIntElement(term1143, 4, -310528004);
        setIntElement(term1143, 5, -634976996);
        setElement(term1118, 3, term1143);
        setIntElement(term1150, 0, -1015274146);
        setIntElement(term1150, 1, -49052672);
        setIntElement(term1150, 2, 339372704);
        setElement(term1118, 4, term1150);
        setField(term1084, term1084.getClass(), "successors", term1118);
        setField(term1084, term1084.getClass(), "edges", term1154);
        setByteElement(term1156, 0, (byte) -101);
        setByteElement(term1156, 1, (byte) 35);
        setByteElement(term1156, 2, (byte) 66);
        setByteElement(term1156, 3, (byte) 123);
        setByteElement(term1156, 4, (byte) -5);
        setByteElement(term1156, 5, (byte) 84);
        setElement(term1155, 0, term1156);
        setElement(term1155, 1, term1163);
        setByteElement(term1164, 0, (byte) -97);
        setByteElement(term1164, 1, (byte) -24);
        setByteElement(term1164, 2, (byte) 88);
        setElement(term1155, 2, term1164);
        setByteElement(term1168, 0, (byte) 96);
        setElement(term1155, 3, term1168);
        setByteElement(term1170, 0, (byte) 70);
        setByteElement(term1170, 1, (byte) 48);
        setByteElement(term1170, 2, (byte) -46);
        setByteElement(term1170, 3, (byte) -128);
        setByteElement(term1170, 4, (byte) 66);
        setByteElement(term1170, 5, (byte) -112);
        setByteElement(term1170, 6, (byte) 81);
        setByteElement(term1170, 7, (byte) 65);
        setByteElement(term1170, 8, (byte) -44);
        setElement(term1155, 4, term1170);
        setField(term1084, term1084.getClass(), "adjMatrix", term1155);
        setIntElement(term1180, 0, -851097944);
        setIntElement(term1180, 1, 803925431);
        setField(term1084, term1084.getClass(), "orderToVertex", term1180);
        setField(term1084, term1084.getClass(), "vertexToOrder", term1183);
        setBooleanField(term1084, term1084.getClass(), "cache", false);
        term1196 = new Integer(76929641);
        term1198 = new Integer(-2003192918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1196;
        args[1] = term1198;
        callMethod(klass, "getEdge", argTypes, term1084, args);
    }

};


