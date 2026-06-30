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

public class PsRankingResponse_setRnkpsscr2_38216460222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24725;

    public PsRankingResponse_setRnkpsscr2_38216460222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24725 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term24726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24741 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24727, term24727.getClass(), "year", 2010);
        setShortField(term24727, term24727.getClass(), "month", (short) 2);
        setShortField(term24727, term24727.getClass(), "day", (short) 24);
        setField(term24726, term24726.getClass(), "date", term24727);
        setByteField(term24731, term24731.getClass(), "hour", (byte) 17);
        setByteField(term24731, term24731.getClass(), "minute", (byte) 58);
        setByteField(term24731, term24731.getClass(), "second", (byte) 56);
        setIntField(term24731, term24731.getClass(), "nano", 291725532);
        setField(term24726, term24726.getClass(), "time", term24731);
        setField(term24725, term24725.getClass(), "rnk_ps_lut", term24726);
        setIntField(term24737, term24737.getClass(), "year", 2028);
        setShortField(term24737, term24737.getClass(), "month", (short) 7);
        setShortField(term24737, term24737.getClass(), "day", (short) 22);
        setField(term24736, term24736.getClass(), "date", term24737);
        setByteField(term24741, term24741.getClass(), "hour", (byte) 18);
        setByteField(term24741, term24741.getClass(), "minute", (byte) 33);
        setByteField(term24741, term24741.getClass(), "second", (byte) 7);
        setIntField(term24741, term24741.getClass(), "nano", 763613074);
        setField(term24736, term24736.getClass(), "time", term24741);
        setField(term24725, term24725.getClass(), "rnk_ps_ts", term24736);
        setIntField(term24725, term24725.getClass(), "rnk_ps_dffclty", -226514366);
        setField(term24725, term24725.getClass(), "rnk_ps_pv_id", "WWyLFmYpAy");
        setField(term24725, term24725.getClass(), "rnk_ps_edtn1", "vbSWeJWOQh");
        setField(term24725, term24725.getClass(), "rnk_ps_edtn2", "hyvFdAvkOr");
        setField(term24725, term24725.getClass(), "rnk_ps_edtn3", "ewbQRtustW");
        setField(term24725, term24725.getClass(), "rnk_ps_scr1", "cABEHYBnys");
        setField(term24725, term24725.getClass(), "rnk_ps_scr2", "EhlWSobaco");
        setField(term24725, term24725.getClass(), "rnk_ps_scr3", "hEuycunsSe");
        setField(term24725, term24725.getClass(), "rnk_ps_nm1", "IMFzXhpNCx");
        setField(term24725, term24725.getClass(), "rnk_ps_nm2", "xAtFmANjwD");
        setField(term24725, term24725.getClass(), "rnk_ps_nm3", "ICysuFllEZ");
        setField(term24725, term24725.getClass(), "cmd", "cGQJTTxcXr");
        setField(term24725, term24725.getClass(), "req_id", "aKaqvssiby");
        setField(term24725, term24725.getClass(), "stat", "tTVbtBVAfo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cjaaJUnNCR";
        callMethod(klass, "setRnk_ps_scr2", argTypes, term24725, args);
    }

};


