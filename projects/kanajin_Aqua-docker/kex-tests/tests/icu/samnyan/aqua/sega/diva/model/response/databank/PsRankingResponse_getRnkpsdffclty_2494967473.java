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

public class PsRankingResponse_getRnkpsdffclty_2494967473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18741;

    public PsRankingResponse_getRnkpsdffclty_2494967473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18741 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term18742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18747 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18757 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18743, term18743.getClass(), "year", 2010);
        setShortField(term18743, term18743.getClass(), "month", (short) 5);
        setShortField(term18743, term18743.getClass(), "day", (short) 2);
        setField(term18742, term18742.getClass(), "date", term18743);
        setByteField(term18747, term18747.getClass(), "hour", (byte) 2);
        setByteField(term18747, term18747.getClass(), "minute", (byte) 22);
        setByteField(term18747, term18747.getClass(), "second", (byte) 33);
        setIntField(term18747, term18747.getClass(), "nano", 530835039);
        setField(term18742, term18742.getClass(), "time", term18747);
        setField(term18741, term18741.getClass(), "rnk_ps_lut", term18742);
        setIntField(term18753, term18753.getClass(), "year", 2024);
        setShortField(term18753, term18753.getClass(), "month", (short) 4);
        setShortField(term18753, term18753.getClass(), "day", (short) 24);
        setField(term18752, term18752.getClass(), "date", term18753);
        setByteField(term18757, term18757.getClass(), "hour", (byte) 7);
        setByteField(term18757, term18757.getClass(), "minute", (byte) 2);
        setByteField(term18757, term18757.getClass(), "second", (byte) 51);
        setIntField(term18757, term18757.getClass(), "nano", 635502964);
        setField(term18752, term18752.getClass(), "time", term18757);
        setField(term18741, term18741.getClass(), "rnk_ps_ts", term18752);
        setIntField(term18741, term18741.getClass(), "rnk_ps_dffclty", -883034806);
        setField(term18741, term18741.getClass(), "rnk_ps_pv_id", "kucsxnvbES");
        setField(term18741, term18741.getClass(), "rnk_ps_edtn1", "IdGzDFfcZf");
        setField(term18741, term18741.getClass(), "rnk_ps_edtn2", "KDdRNhZmnU");
        setField(term18741, term18741.getClass(), "rnk_ps_edtn3", "iMsqJaKlDC");
        setField(term18741, term18741.getClass(), "rnk_ps_scr1", "aPkGHbZyjj");
        setField(term18741, term18741.getClass(), "rnk_ps_scr2", "nSWdsVyJRI");
        setField(term18741, term18741.getClass(), "rnk_ps_scr3", "JBOPGgGKnc");
        setField(term18741, term18741.getClass(), "rnk_ps_nm1", "GlPTiCMCGP");
        setField(term18741, term18741.getClass(), "rnk_ps_nm2", "jlcBpLoWfd");
        setField(term18741, term18741.getClass(), "rnk_ps_nm3", "oYymmLqbfJ");
        setField(term18741, term18741.getClass(), "cmd", "YaDWphDOSz");
        setField(term18741, term18741.getClass(), "req_id", "nnnmCgFBLw");
        setField(term18741, term18741.getClass(), "stat", "hSSCyNEhyH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_dffclty", argTypes, term18741, args);
    }

};


