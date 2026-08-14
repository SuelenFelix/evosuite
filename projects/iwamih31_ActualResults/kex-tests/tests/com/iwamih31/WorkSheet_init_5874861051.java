package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WorkSheet_init_5874861051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35579;
     Object term35580;

    public WorkSheet_init_5874861051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35579 = (int[]) newIntArray(0);
        term35580 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 5);
        Object[] term35581 = (Object[]) newArray("java.lang.String", 3);
        Object[] term35618 = (Object[]) newArray("java.lang.String", 8);
        Object[] term35715 = (Object[]) newArray("java.lang.String", 6);
        Object[] term35788 = (Object[]) newArray("java.lang.String", 3);
        Object[] term35825 = (Object[]) newArray("java.lang.String", 2);
        setElement(term35581, 0, "IoefPqGtaj");
        setElement(term35581, 1, "YMmtjELJuB");
        setElement(term35581, 2, "FzyIShiOmb");
        setElement(term35580, 0, term35581);
        setElement(term35618, 0, "PEUfeJaZTk");
        setElement(term35618, 1, "AIvyeIdskz");
        setElement(term35618, 2, "iSQqMWMRlU");
        setElement(term35618, 3, "djWEnlbOXu");
        setElement(term35618, 4, "MvDMzQBWME");
        setElement(term35618, 5, "sZyAwmdGVS");
        setElement(term35618, 6, "VoKhXiLAaW");
        setElement(term35618, 7, "CaalXzRXQI");
        setElement(term35580, 1, term35618);
        setElement(term35715, 0, "eRBnKPjyVg");
        setElement(term35715, 1, "svPqsHBvrm");
        setElement(term35715, 2, "sRzUJLYMmB");
        setElement(term35715, 3, "XxILklSDwz");
        setElement(term35715, 4, "TLjhFZbwKO");
        setElement(term35715, 5, "nxEbLIApFc");
        setElement(term35580, 2, term35715);
        setElement(term35788, 0, "zzsdNZhejE");
        setElement(term35788, 1, "ILoodMZrgR");
        setElement(term35788, 2, "XQiKmsCacK");
        setElement(term35580, 3, term35788);
        setElement(term35825, 0, "cTCixEbHYT");
        setElement(term35825, 1, "bqKksqtAdT");
        setElement(term35580, 4, term35825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "WzGudiEARD";
        args[1] = term35579;
        args[2] = term35580;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


