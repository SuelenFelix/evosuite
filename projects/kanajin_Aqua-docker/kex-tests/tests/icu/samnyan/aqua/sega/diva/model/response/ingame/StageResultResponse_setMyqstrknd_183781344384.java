package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_setMyqstrknd_183781344384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59104;

    public StageResultResponse_setMyqstrknd_183781344384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59104 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term59299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59304 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term59104, term59104.getClass(), "chllng_kind", 2111611214);
        setIntField(term59104, term59104.getClass(), "lv_num_old", -2031129784);
        setIntField(term59104, term59104.getClass(), "lv_pnt_old", 251039122);
        setIntField(term59104, term59104.getClass(), "lv_num", 459471826);
        setIntField(term59104, term59104.getClass(), "lv_pnt", -1054011286);
        setField(term59104, term59104.getClass(), "lv_str", "ADhJCRgHaS");
        setIntField(term59104, term59104.getClass(), "lv_efct_id", -1640361091);
        setIntField(term59104, term59104.getClass(), "lv_plt_id", -1908164516);
        setIntField(term59104, term59104.getClass(), "vcld_pts", -1343269854);
        setIntField(term59104, term59104.getClass(), "prsnt_vcld_pts", -731459309);
        setIntField(term59104, term59104.getClass(), "cnp_cid", -913468095);
        setIntField(term59104, term59104.getClass(), "cnp_val", 38489871);
        setField(term59104, term59104.getClass(), "cnp_sp", "qociGUMzem");
        setField(term59104, term59104.getClass(), "crwd_kind", "HHAfSjIdNi");
        setField(term59104, term59104.getClass(), "crwd_value", "oTqQEKklHi");
        setField(term59104, term59104.getClass(), "crwd_str_0", "riyKkxMvWm");
        setField(term59104, term59104.getClass(), "crwd_str_1", "WENnGcBSTd");
        setIntField(term59104, term59104.getClass(), "cerwd_kind", -1667787735);
        setIntField(term59104, term59104.getClass(), "cerwd_value", 1841765799);
        setField(term59104, term59104.getClass(), "cerwd_str_0", "juEYcOCxLW");
        setField(term59104, term59104.getClass(), "cerwd_str_1", "YsWgGEhEmC");
        setField(term59104, term59104.getClass(), "ttl_str_ary", "PBcepqkBBV");
        setField(term59104, term59104.getClass(), "ttl_plt_id_ary", "mukHRKZmND");
        setField(term59104, term59104.getClass(), "ttl_desc_ary", "WVPSokrFPV");
        setField(term59104, term59104.getClass(), "skin_id_ary", "jELmrpQCNf");
        setField(term59104, term59104.getClass(), "skin_name_ary", "NkjAcBXmmT");
        setField(term59104, term59104.getClass(), "skin_illust_ary", "KgtGJGInhu");
        setField(term59104, term59104.getClass(), "skin_desc_ary", "mVHDjrsMAV");
        setIntField(term59104, term59104.getClass(), "pdddt_flg", 72160200);
        setIntField(term59300, term59300.getClass(), "year", 2020);
        setShortField(term59300, term59300.getClass(), "month", (short) 5);
        setShortField(term59300, term59300.getClass(), "day", (short) 12);
        setField(term59299, term59299.getClass(), "date", term59300);
        setByteField(term59304, term59304.getClass(), "hour", (byte) 0);
        setByteField(term59304, term59304.getClass(), "minute", (byte) 15);
        setByteField(term59304, term59304.getClass(), "second", (byte) 24);
        setIntField(term59304, term59304.getClass(), "nano", 250257744);
        setField(term59299, term59299.getClass(), "time", term59304);
        setField(term59104, term59104.getClass(), "pdddt_tm", term59299);
        setIntField(term59104, term59104.getClass(), "nblss_ltt_stts", -1870567623);
        setIntField(term59104, term59104.getClass(), "nblss_ltt_tckt", -1442923471);
        setIntField(term59104, term59104.getClass(), "nblss_ltt_is_opn", -434247549);
        setIntField(term59104, term59104.getClass(), "nblss_ltt_prz", 1246505552);
        setIntField(term59104, term59104.getClass(), "nblss_ltt_nxt_stts", -1456497810);
        setIntField(term59104, term59104.getClass(), "nblss_ltt_nxt_tckt", 61954667);
        setField(term59104, term59104.getClass(), "my_qst_id", "rjWnqcjYuU");
        setField(term59104, term59104.getClass(), "my_qst_r_qid", "JhszTkUWCg");
        setField(term59104, term59104.getClass(), "my_qst_r_knd", "gfNPCeiULY");
        setField(term59104, term59104.getClass(), "my_qst_r_vl", "aUJLXfcWME");
        setField(term59104, term59104.getClass(), "my_qst_r_nflg", "ixeIpUaVug");
        setField(term59104, term59104.getClass(), "my_ccd_r_qid", "TELyWFMBJv");
        setField(term59104, term59104.getClass(), "my_ccd_r_hnd", "bIqbgRdzpB");
        setField(term59104, term59104.getClass(), "my_ccd_r_vp", "FIUbHJmAEj");
        setField(term59104, term59104.getClass(), "cmd", "mJrFDaDdyY");
        setField(term59104, term59104.getClass(), "req_id", "HqyBQNuLnz");
        setField(term59104, term59104.getClass(), "stat", "xWkZKbrvmX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PTEWoxLNqQ";
        callMethod(klass, "setMy_qst_r_knd", argTypes, term59104, args);
    }

};


