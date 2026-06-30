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

public class PsRankingResponse_getRnkpsnm1_108996913611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21205;

    public PsRankingResponse_getRnkpsnm1_108996913611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21205 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse"));
        Object term21206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21221 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21207, term21207.getClass(), "year", 2024);
        setShortField(term21207, term21207.getClass(), "month", (short) 5);
        setShortField(term21207, term21207.getClass(), "day", (short) 6);
        setField(term21206, term21206.getClass(), "date", term21207);
        setByteField(term21211, term21211.getClass(), "hour", (byte) 20);
        setByteField(term21211, term21211.getClass(), "minute", (byte) 14);
        setByteField(term21211, term21211.getClass(), "second", (byte) 27);
        setIntField(term21211, term21211.getClass(), "nano", 900636101);
        setField(term21206, term21206.getClass(), "time", term21211);
        setField(term21205, term21205.getClass(), "rnk_ps_lut", term21206);
        setIntField(term21217, term21217.getClass(), "year", 2021);
        setShortField(term21217, term21217.getClass(), "month", (short) 4);
        setShortField(term21217, term21217.getClass(), "day", (short) 17);
        setField(term21216, term21216.getClass(), "date", term21217);
        setByteField(term21221, term21221.getClass(), "hour", (byte) 4);
        setByteField(term21221, term21221.getClass(), "minute", (byte) 11);
        setByteField(term21221, term21221.getClass(), "second", (byte) 16);
        setIntField(term21221, term21221.getClass(), "nano", 509895858);
        setField(term21216, term21216.getClass(), "time", term21221);
        setField(term21205, term21205.getClass(), "rnk_ps_ts", term21216);
        setIntField(term21205, term21205.getClass(), "rnk_ps_dffclty", -6029667);
        setField(term21205, term21205.getClass(), "rnk_ps_pv_id", "IHsXSAFYKi");
        setField(term21205, term21205.getClass(), "rnk_ps_edtn1", "KyGbLglqbW");
        setField(term21205, term21205.getClass(), "rnk_ps_edtn2", "ZKVeStsSNT");
        setField(term21205, term21205.getClass(), "rnk_ps_edtn3", "cqCXYaAnFB");
        setField(term21205, term21205.getClass(), "rnk_ps_scr1", "UPLNFZHXjw");
        setField(term21205, term21205.getClass(), "rnk_ps_scr2", "CwrrJlrGmg");
        setField(term21205, term21205.getClass(), "rnk_ps_scr3", "HejzvyejjG");
        setField(term21205, term21205.getClass(), "rnk_ps_nm1", "pbqJjeooBM");
        setField(term21205, term21205.getClass(), "rnk_ps_nm2", "ccnotFfPXt");
        setField(term21205, term21205.getClass(), "rnk_ps_nm3", "plWlgdgIhn");
        setField(term21205, term21205.getClass(), "cmd", "RZaKVKWtND");
        setField(term21205, term21205.getClass(), "req_id", "vXiaNiquft");
        setField(term21205, term21205.getClass(), "stat", "lucCeiVnYe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PsRankingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_nm1", argTypes, term21205, args);
    }

};


