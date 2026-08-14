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

public class HistoryResponse_getHistory_12731749270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5641;

    public HistoryResponse_getHistory_12731749270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5641 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        Object[] term5642 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 5);
        Object term5643 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term5681 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term5719 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term5757 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term5795 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term5643, term5643.getClass(), "alertDate", "SIODFGaQhr");
        setField(term5643, term5643.getClass(), "title", "qYzsiuXOgS");
        setField(term5643, term5643.getClass(), "data", "bxrCBbrrct");
        setIntField(term5643, term5643.getClass(), "category", 1585847225);
        setElement(term5642, 0, term5643);
        setField(term5681, term5681.getClass(), "alertDate", "CKWpJaaaxX");
        setField(term5681, term5681.getClass(), "title", "UBRmXJmfrt");
        setField(term5681, term5681.getClass(), "data", "WZzvmIHhzZ");
        setIntField(term5681, term5681.getClass(), "category", 597278769);
        setElement(term5642, 1, term5681);
        setField(term5719, term5719.getClass(), "alertDate", "doQLHkjpNm");
        setField(term5719, term5719.getClass(), "title", "lCyLIcSuom");
        setField(term5719, term5719.getClass(), "data", "CGOpQSZZwI");
        setIntField(term5719, term5719.getClass(), "category", -1685132342);
        setElement(term5642, 2, term5719);
        setField(term5757, term5757.getClass(), "alertDate", "ypEdrstygY");
        setField(term5757, term5757.getClass(), "title", "sNQFlATEeQ");
        setField(term5757, term5757.getClass(), "data", "ZKMLioamsY");
        setIntField(term5757, term5757.getClass(), "category", -1456670397);
        setElement(term5642, 3, term5757);
        setField(term5795, term5795.getClass(), "alertDate", "WVbxuoDBcn");
        setField(term5795, term5795.getClass(), "title", "pvDEABOxLt");
        setField(term5795, term5795.getClass(), "data", "beAMpkroCQ");
        setIntField(term5795, term5795.getClass(), "category", 1622346318);
        setElement(term5642, 4, term5795);
        setField(term5641, term5641.getClass(), "history", term5642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHistory", argTypes, term5641, args);
    }

};


