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

public class PstdHCtrlResponse_getPstdhcstr_18885280112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15702;

    public PstdHCtrlResponse_getPstdhcstr_18885280112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15702 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdHCtrlResponse"));
        setField(term15702, term15702.getClass(), "p_std_hc_lut", "ujxmmZZcbT");
        setField(term15702, term15702.getClass(), "p_std_hc_str", "BOvgwHfoHQ");
        setField(term15702, term15702.getClass(), "cmd", "hPpFNeDBIb");
        setField(term15702, term15702.getClass(), "req_id", "DNOtiLPAIY");
        setField(term15702, term15702.getClass(), "stat", "FnEkAHBfyV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PstdHCtrlResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_hc_str", argTypes, term15702, args);
    }

};


