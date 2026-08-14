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
import java.lang.Integer;

public class VodResult_setCode_2487712483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;
     Object term3805;

    public VodResult_setCode_2487712483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3750 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3750, term3750.getClass(), "vodId", "");
        setField(term3750, term3750.getClass(), "vodName", "");
        setField(term3750, term3750.getClass(), "vodActor", "");
        setField(term3750, term3750.getClass(), "vodPlayFrom", "");
        setField(term3750, term3750.getClass(), "vodPic", "");
        setField(term3750, term3750.getClass(), "vodPlayUrl", "");
        Object term3757 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3757, term3757.getClass(), "vodId", "");
        setField(term3757, term3757.getClass(), "vodName", "");
        setField(term3757, term3757.getClass(), "vodActor", "");
        setField(term3757, term3757.getClass(), "vodPlayFrom", "");
        setField(term3757, term3757.getClass(), "vodPic", "");
        setField(term3757, term3757.getClass(), "vodPlayUrl", "");
        Object term3764 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3764, term3764.getClass(), "vodId", "");
        setField(term3764, term3764.getClass(), "vodName", "");
        setField(term3764, term3764.getClass(), "vodActor", "");
        setField(term3764, term3764.getClass(), "vodPlayFrom", "");
        setField(term3764, term3764.getClass(), "vodPic", "");
        setField(term3764, term3764.getClass(), "vodPlayUrl", "");
        Object term3771 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3771, term3771.getClass(), "vodId", "");
        setField(term3771, term3771.getClass(), "vodName", "");
        setField(term3771, term3771.getClass(), "vodActor", "");
        setField(term3771, term3771.getClass(), "vodPlayFrom", "");
        setField(term3771, term3771.getClass(), "vodPic", "");
        setField(term3771, term3771.getClass(), "vodPlayUrl", "");
        Object term3778 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3778, term3778.getClass(), "vodId", "");
        setField(term3778, term3778.getClass(), "vodName", "");
        setField(term3778, term3778.getClass(), "vodActor", "");
        setField(term3778, term3778.getClass(), "vodPlayFrom", "");
        setField(term3778, term3778.getClass(), "vodPic", "");
        setField(term3778, term3778.getClass(), "vodPlayUrl", "");
        Object term3785 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3785, term3785.getClass(), "vodId", "");
        setField(term3785, term3785.getClass(), "vodName", "");
        setField(term3785, term3785.getClass(), "vodActor", "");
        setField(term3785, term3785.getClass(), "vodPlayFrom", "");
        setField(term3785, term3785.getClass(), "vodPic", "");
        setField(term3785, term3785.getClass(), "vodPlayUrl", "");
        Object term3792 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term3792, term3792.getClass(), "vodId", "");
        setField(term3792, term3792.getClass(), "vodName", "");
        setField(term3792, term3792.getClass(), "vodActor", "");
        setField(term3792, term3792.getClass(), "vodPlayFrom", "");
        setField(term3792, term3792.getClass(), "vodPic", "");
        setField(term3792, term3792.getClass(), "vodPlayUrl", "");
        ArrayList term3748 = new ArrayList();
        ((ArrayList) term3748).add(term3750);
        ((ArrayList) term3748).add(term3757);
        ((ArrayList) term3748).add(term3764);
        ((ArrayList) term3748).add(term3771);
        ((ArrayList) term3748).add(term3778);
        ((ArrayList) term3748).add(term3785);
        ((ArrayList) term3748).add(term3792);
        ArrayList term3801 = new ArrayList();
        term3742 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term3742, term3742.getClass(), "code", 1725571209);
        setIntField(term3742, term3742.getClass(), "page", -522618178);
        setIntField(term3742, term3742.getClass(), "pagecount", 1134449235);
        setIntField(term3742, term3742.getClass(), "limit", -883034806);
        setIntField(term3742, term3742.getClass(), "total", 1585847225);
        setField(term3742, term3742.getClass(), "list", term3748);
        setField(term3742, term3742.getClass(), "vodClassList", term3801);
        term3805 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3805;
        callMethod(klass, "setCode", argTypes, term3742, args);
    }

};


