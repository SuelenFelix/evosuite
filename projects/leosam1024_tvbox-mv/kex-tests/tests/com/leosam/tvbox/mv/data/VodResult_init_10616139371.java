package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class VodResult_init_10616139371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3615;

    public VodResult_init_10616139371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3621 = new ArrayList();
        Object term3627 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3627, term3627.getClass(), "typeId", "");
        setField(term3627, term3627.getClass(), "typeName", "");
        Object term3630 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3630, term3630.getClass(), "typeId", "");
        setField(term3630, term3630.getClass(), "typeName", "");
        Object term3633 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3633, term3633.getClass(), "typeId", "");
        setField(term3633, term3633.getClass(), "typeName", "");
        Object term3636 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3636, term3636.getClass(), "typeId", "");
        setField(term3636, term3636.getClass(), "typeName", "");
        Object term3639 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3639, term3639.getClass(), "typeId", "");
        setField(term3639, term3639.getClass(), "typeName", "");
        Object term3642 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3642, term3642.getClass(), "typeId", "");
        setField(term3642, term3642.getClass(), "typeName", "");
        Object term3645 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3645, term3645.getClass(), "typeId", "");
        setField(term3645, term3645.getClass(), "typeName", "");
        Object term3648 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3648, term3648.getClass(), "typeId", "");
        setField(term3648, term3648.getClass(), "typeName", "");
        Object term3651 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodClass"));
        setField(term3651, term3651.getClass(), "typeId", "");
        setField(term3651, term3651.getClass(), "typeName", "");
        ArrayList term3625 = new ArrayList();
        ((ArrayList) term3625).add(term3627);
        ((ArrayList) term3625).add(term3630);
        ((ArrayList) term3625).add(term3633);
        ((ArrayList) term3625).add(term3636);
        ((ArrayList) term3625).add(term3639);
        ((ArrayList) term3625).add(term3642);
        ((ArrayList) term3625).add(term3645);
        ((ArrayList) term3625).add(term3648);
        ((ArrayList) term3625).add(term3651);
        term3615 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3615, term3615.getClass(), "code", 568599855);
        setIntField(term3615, term3615.getClass(), "page", 1162663216);
        setIntField(term3615, term3615.getClass(), "pagecount", 1484323161);
        setIntField(term3615, term3615.getClass(), "limit", 391863371);
        setIntField(term3615, term3615.getClass(), "total", -1922583790);
        setField(term3615, term3615.getClass(), "list", term3621);
        setField(term3615, term3615.getClass(), "vodClassList", term3625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term3615, args);
    }

};


