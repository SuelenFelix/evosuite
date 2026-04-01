package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Country_setDataSet_88163423016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2686;
     Object term2753;

    public Country_setDataSet_88163423016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2687 = new Long(-6573104506744284592L);
        ArrayList term2749 = new ArrayList();
        term2686 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2686, term2686.getClass(), "id", term2687);
        setField(term2686, term2686.getClass(), "name", "eVpkWxjuki");
        setField(term2686, term2686.getClass(), "RName", "SJiQaLvSKv");
        setField(term2686, term2686.getClass(), "Region", "OEXDRUKcFl");
        setField(term2686, term2686.getClass(), "Lat", "RYdKCNNMBR");
        setField(term2686, term2686.getClass(), "Long", "yGtHPyvYiQ");
        setField(term2686, term2686.getClass(), "DataSet", term2749);
        Object term2755 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2756 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2756, term2756.getClass(), "year", 2019);
        setShortField(term2756, term2756.getClass(), "month", (short) 2);
        setShortField(term2756, term2756.getClass(), "day", (short) 20);
        setField(term2755, term2755.getClass(), "date", term2756);
        setIntField(term2755, term2755.getClass(), "stat", -616727354);
        setField(term2755, term2755.getClass(), "NameRef", "");
        setField(term2755, term2755.getClass(), "Region", "");
        Object term2765 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2766 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2766, term2766.getClass(), "year", 2027);
        setShortField(term2766, term2766.getClass(), "month", (short) 3);
        setShortField(term2766, term2766.getClass(), "day", (short) 14);
        setField(term2765, term2765.getClass(), "date", term2766);
        setIntField(term2765, term2765.getClass(), "stat", -1955890973);
        setField(term2765, term2765.getClass(), "NameRef", "");
        setField(term2765, term2765.getClass(), "Region", "");
        Object term2775 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2776 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2776, term2776.getClass(), "year", 2018);
        setShortField(term2776, term2776.getClass(), "month", (short) 9);
        setShortField(term2776, term2776.getClass(), "day", (short) 27);
        setField(term2775, term2775.getClass(), "date", term2776);
        setIntField(term2775, term2775.getClass(), "stat", -2038273078);
        setField(term2775, term2775.getClass(), "NameRef", "");
        setField(term2775, term2775.getClass(), "Region", "");
        Object term2785 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2786 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2786, term2786.getClass(), "year", 2025);
        setShortField(term2786, term2786.getClass(), "month", (short) 4);
        setShortField(term2786, term2786.getClass(), "day", (short) 8);
        setField(term2785, term2785.getClass(), "date", term2786);
        setIntField(term2785, term2785.getClass(), "stat", 1227103734);
        setField(term2785, term2785.getClass(), "NameRef", "");
        setField(term2785, term2785.getClass(), "Region", "");
        Object term2795 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2796 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2796, term2796.getClass(), "year", 2012);
        setShortField(term2796, term2796.getClass(), "month", (short) 9);
        setShortField(term2796, term2796.getClass(), "day", (short) 11);
        setField(term2795, term2795.getClass(), "date", term2796);
        setIntField(term2795, term2795.getClass(), "stat", -1339778481);
        setField(term2795, term2795.getClass(), "NameRef", "");
        setField(term2795, term2795.getClass(), "Region", "");
        Object term2805 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2806 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2806, term2806.getClass(), "year", 2017);
        setShortField(term2806, term2806.getClass(), "month", (short) 8);
        setShortField(term2806, term2806.getClass(), "day", (short) 7);
        setField(term2805, term2805.getClass(), "date", term2806);
        setIntField(term2805, term2805.getClass(), "stat", 1725571209);
        setField(term2805, term2805.getClass(), "NameRef", "");
        setField(term2805, term2805.getClass(), "Region", "");
        term2753 = new ArrayList();
        ((ArrayList) term2753).add(term2755);
        ((ArrayList) term2753).add(term2765);
        ((ArrayList) term2753).add(term2775);
        ((ArrayList) term2753).add(term2785);
        ((ArrayList) term2753).add(term2795);
        ((ArrayList) term2753).add(term2805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = term2753;
        callMethod(klass, "setDataSet", argTypes, term2686, args);
    }

};


