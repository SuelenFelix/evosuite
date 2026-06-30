package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FestaInfoResponse_setFipvidlst_60604138816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9014;

    public FestaInfoResponse_setFipvidlst_60604138816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9014 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term9014, term9014.getClass(), "fi_id", "QtrylgCLiF");
        setField(term9014, term9014.getClass(), "fi_name", "orEuhCStGM");
        setField(term9014, term9014.getClass(), "fi_kind", "HhEaSXWvrY");
        setField(term9014, term9014.getClass(), "fi_difficulty", "CVRGEomOth");
        setField(term9014, term9014.getClass(), "fi_pv_id_lst", "vSeruUyNWX");
        setField(term9014, term9014.getClass(), "fi_attr", "UkKvaeJfEC");
        setField(term9014, term9014.getClass(), "fi_add_vp", "WPxXsahPRq");
        setField(term9014, term9014.getClass(), "fi_mul_vp", "IENRuqmwUU");
        setField(term9014, term9014.getClass(), "fi_st", "GsWxOwXvSu");
        setField(term9014, term9014.getClass(), "fi_et", "bKBSncrMEZ");
        setField(term9014, term9014.getClass(), "fi_lut", "yeSXGqQExb");
        setField(term9014, term9014.getClass(), "cmd", "uXYcXVYJZM");
        setField(term9014, term9014.getClass(), "req_id", "BJhjdJUhkz");
        setField(term9014, term9014.getClass(), "stat", "cdHYQDgUZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KAORSSPSeV";
        callMethod(klass, "setFi_pv_id_lst", argTypes, term9014, args);
    }

};


