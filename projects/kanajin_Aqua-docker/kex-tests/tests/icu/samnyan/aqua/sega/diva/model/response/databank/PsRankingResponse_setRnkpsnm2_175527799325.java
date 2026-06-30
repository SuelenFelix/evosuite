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
import java.lang.Object;

public class PsRankingResponse_setRnkpsnm2_175527799325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25715;

    public PsRankingResponse_setRnkpsnm2_175527799325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25715 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term25716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25731 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25717, term25717.getClass(), "year", 2011);
        setShortField(term25717, term25717.getClass(), "month", (short) 4);
        setShortField(term25717, term25717.getClass(), "day", (short) 19);
        setField(term25716, term25716.getClass(), "date", term25717);
        setByteField(term25721, term25721.getClass(), "hour", (byte) 12);
        setByteField(term25721, term25721.getClass(), "minute", (byte) 0);
        setByteField(term25721, term25721.getClass(), "second", (byte) 14);
        setIntField(term25721, term25721.getClass(), "nano", 849079063);
        setField(term25716, term25716.getClass(), "time", term25721);
        setField(term25715, term25715.getClass(), "rnk_ps_lut", term25716);
        setIntField(term25727, term25727.getClass(), "year", 2014);
        setShortField(term25727, term25727.getClass(), "month", (short) 8);
        setShortField(term25727, term25727.getClass(), "day", (short) 17);
        setField(term25726, term25726.getClass(), "date", term25727);
        setByteField(term25731, term25731.getClass(), "hour", (byte) 19);
        setByteField(term25731, term25731.getClass(), "minute", (byte) 32);
        setByteField(term25731, term25731.getClass(), "second", (byte) 5);
        setIntField(term25731, term25731.getClass(), "nano", 604713831);
        setField(term25726, term25726.getClass(), "time", term25731);
        setField(term25715, term25715.getClass(), "rnk_ps_ts", term25726);
        setIntField(term25715, term25715.getClass(), "rnk_ps_dffclty", -1530420153);
        setField(term25715, term25715.getClass(), "rnk_ps_pv_id", "XeSDJYKMBf");
        setField(term25715, term25715.getClass(), "rnk_ps_edtn1", "tIsFcOGTUX");
        setField(term25715, term25715.getClass(), "rnk_ps_edtn2", "XUVRcnELFP");
        setField(term25715, term25715.getClass(), "rnk_ps_edtn3", "xIeSbezmkD");
        setField(term25715, term25715.getClass(), "rnk_ps_scr1", "txUWLZRkSv");
        setField(term25715, term25715.getClass(), "rnk_ps_scr2", "gHRMJRsBGm");
        setField(term25715, term25715.getClass(), "rnk_ps_scr3", "rZyrfnMvHa");
        setField(term25715, term25715.getClass(), "rnk_ps_nm1", "GMyMhTZeDC");
        setField(term25715, term25715.getClass(), "rnk_ps_nm2", "KqQOTshBOL");
        setField(term25715, term25715.getClass(), "rnk_ps_nm3", "cuWgFcYkPC");
        setField(term25715, term25715.getClass(), "cmd", "HfbcOKkXBm");
        setField(term25715, term25715.getClass(), "req_id", "pLbTzSMbsN");
        setField(term25715, term25715.getClass(), "stat", "lFSbxerCPP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjaZIyixCm";
        callMethod(klass, "setRnk_ps_nm2", argTypes, term25715, args);
    }

};


