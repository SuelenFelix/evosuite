package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HistoryResponse_setHistory_10006668471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5983;
     Object term6099;

    public HistoryResponse_setHistory_10006668471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5983 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        Object[] term5984 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 3);
        Object term5985 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6023 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6061 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term5985, term5985.getClass(), "alertDate", "uSUvKAyuvd");
        setField(term5985, term5985.getClass(), "title", "onQLVONGuf");
        setField(term5985, term5985.getClass(), "data", "SOrEHbcbmn");
        setIntField(term5985, term5985.getClass(), "category", 1048535127);
        setElement(term5984, 0, term5985);
        setField(term6023, term6023.getClass(), "alertDate", "bnsyeQXFdu");
        setField(term6023, term6023.getClass(), "title", "BwtdjiefJn");
        setField(term6023, term6023.getClass(), "data", "jDmhBrIoDa");
        setIntField(term6023, term6023.getClass(), "category", -655067527);
        setElement(term5984, 1, term6023);
        setField(term6061, term6061.getClass(), "alertDate", "SPtPatHeOm");
        setField(term6061, term6061.getClass(), "title", "ywmcuThdfL");
        setField(term6061, term6061.getClass(), "data", "GBOEuByOfr");
        setIntField(term6061, term6061.getClass(), "category", -6029667);
        setElement(term5984, 2, term6061);
        setField(term5983, term5983.getClass(), "history", term5984);
        term6099 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 7);
        Object term6100 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6138 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6176 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6214 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6252 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6290 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6328 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term6100, term6100.getClass(), "alertDate", "NHbOFFjyVK");
        setField(term6100, term6100.getClass(), "title", "zaloBqlrSo");
        setField(term6100, term6100.getClass(), "data", "vvoLrMGCoN");
        setIntField(term6100, term6100.getClass(), "category", -2068769794);
        setElement(term6099, 0, term6100);
        setField(term6138, term6138.getClass(), "alertDate", "pXdglvyrQe");
        setField(term6138, term6138.getClass(), "title", "OcfNzHYdki");
        setField(term6138, term6138.getClass(), "data", "uPuCVuZYOI");
        setIntField(term6138, term6138.getClass(), "category", -117576464);
        setElement(term6099, 1, term6138);
        setField(term6176, term6176.getClass(), "alertDate", "TweMFhxNdj");
        setField(term6176, term6176.getClass(), "title", "NBrvVzvQHe");
        setField(term6176, term6176.getClass(), "data", "FjOiNAfBOc");
        setIntField(term6176, term6176.getClass(), "category", -1007160944);
        setElement(term6099, 2, term6176);
        setField(term6214, term6214.getClass(), "alertDate", "iCCsaLHohG");
        setField(term6214, term6214.getClass(), "title", "NJhGgctbdj");
        setField(term6214, term6214.getClass(), "data", "MYWYUeLGOp");
        setIntField(term6214, term6214.getClass(), "category", 1135664017);
        setElement(term6099, 3, term6214);
        setField(term6252, term6252.getClass(), "alertDate", "tsTGdgQYUL");
        setField(term6252, term6252.getClass(), "title", "TtGbVmKcnX");
        setField(term6252, term6252.getClass(), "data", "GJVkUrCVdD");
        setIntField(term6252, term6252.getClass(), "category", 590364439);
        setElement(term6099, 4, term6252);
        setField(term6290, term6290.getClass(), "alertDate", "zNdorvdUgu");
        setField(term6290, term6290.getClass(), "title", "oPxuZbkYio");
        setField(term6290, term6290.getClass(), "data", "vKitydDVnM");
        setIntField(term6290, term6290.getClass(), "category", 865208305);
        setElement(term6099, 5, term6290);
        setField(term6328, term6328.getClass(), "alertDate", "urCiQnUFBM");
        setField(term6328, term6328.getClass(), "title", "EKjQdtKxAM");
        setField(term6328, term6328.getClass(), "data", "TXZAIPQJHt");
        setIntField(term6328, term6328.getClass(), "category", -1275173084);
        setElement(term6099, 6, term6328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6099;
        callMethod(klass, "setHistory", argTypes, term5983, args);
    }

};


