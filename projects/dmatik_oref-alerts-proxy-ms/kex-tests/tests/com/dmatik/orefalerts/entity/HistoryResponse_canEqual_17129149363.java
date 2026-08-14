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

public class HistoryResponse_canEqual_17129149363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6805;
     Object term7035;

    public HistoryResponse_canEqual_17129149363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6805 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        Object[] term6806 = (Object[]) newArray("com.dmatik.orefalerts.entity.HistoryItem", 6);
        Object term6807 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6845 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6883 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6921 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6959 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        Object term6997 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term6807, term6807.getClass(), "alertDate", "vLerpqavFM");
        setField(term6807, term6807.getClass(), "title", "qnvxzwuGKX");
        setField(term6807, term6807.getClass(), "data", "EdPAvpluZg");
        setIntField(term6807, term6807.getClass(), "category", -1179120542);
        setElement(term6806, 0, term6807);
        setField(term6845, term6845.getClass(), "alertDate", "DzHVBMqWtE");
        setField(term6845, term6845.getClass(), "title", "THZSpzBRYP");
        setField(term6845, term6845.getClass(), "data", "ZfBIVGBQOE");
        setIntField(term6845, term6845.getClass(), "category", -73683645);
        setElement(term6806, 1, term6845);
        setField(term6883, term6883.getClass(), "alertDate", "QSrDQfEsTR");
        setField(term6883, term6883.getClass(), "title", "PsqusYmejD");
        setField(term6883, term6883.getClass(), "data", "NTWMiBEaDF");
        setIntField(term6883, term6883.getClass(), "category", -226514366);
        setElement(term6806, 2, term6883);
        setField(term6921, term6921.getClass(), "alertDate", "SPBstwKFVr");
        setField(term6921, term6921.getClass(), "title", "WxYUTuqmIq");
        setField(term6921, term6921.getClass(), "data", "OeQLvhVERT");
        setIntField(term6921, term6921.getClass(), "category", 1193880199);
        setElement(term6806, 3, term6921);
        setField(term6959, term6959.getClass(), "alertDate", "IlvgFINwIa");
        setField(term6959, term6959.getClass(), "title", "GEJABPlHSI");
        setField(term6959, term6959.getClass(), "data", "aQFUvuaYxd");
        setIntField(term6959, term6959.getClass(), "category", -1087774327);
        setElement(term6806, 4, term6959);
        setField(term6997, term6997.getClass(), "alertDate", "zNFLXMifnS");
        setField(term6997, term6997.getClass(), "title", "HHQcYMSBVc");
        setField(term6997, term6997.getClass(), "data", "wdoqITnaAP");
        setIntField(term6997, term6997.getClass(), "category", -1530420153);
        setElement(term6806, 5, term6997);
        setField(term6805, term6805.getClass(), "history", term6806);
        term7035 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7035;
        callMethod(klass, "canEqual", argTypes, term6805, args);
    }

};


