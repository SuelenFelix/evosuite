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

public class StageResultResponse_getLvpnt_3302815816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11646;

    public StageResultResponse_getLvpnt_3302815816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11646 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term11841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11846 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11646, term11646.getClass(), "chllng_kind", -1222006000);
        setIntField(term11646, term11646.getClass(), "lv_num_old", 2095798786);
        setIntField(term11646, term11646.getClass(), "lv_pnt_old", -1565502840);
        setIntField(term11646, term11646.getClass(), "lv_num", 344323424);
        setIntField(term11646, term11646.getClass(), "lv_pnt", 9726679);
        setField(term11646, term11646.getClass(), "lv_str", "WXMWFDGcLB");
        setIntField(term11646, term11646.getClass(), "lv_efct_id", -25637976);
        setIntField(term11646, term11646.getClass(), "lv_plt_id", 1555897383);
        setIntField(term11646, term11646.getClass(), "vcld_pts", 202001407);
        setIntField(term11646, term11646.getClass(), "prsnt_vcld_pts", 158873461);
        setIntField(term11646, term11646.getClass(), "cnp_cid", -430151637);
        setIntField(term11646, term11646.getClass(), "cnp_val", -1697741339);
        setField(term11646, term11646.getClass(), "cnp_sp", "wKWbJssZuG");
        setField(term11646, term11646.getClass(), "crwd_kind", "NzBMMhkhpT");
        setField(term11646, term11646.getClass(), "crwd_value", "qCpEbQDHdF");
        setField(term11646, term11646.getClass(), "crwd_str_0", "AHbZyFOmlo");
        setField(term11646, term11646.getClass(), "crwd_str_1", "TwfWVQGiIj");
        setIntField(term11646, term11646.getClass(), "cerwd_kind", 98922530);
        setIntField(term11646, term11646.getClass(), "cerwd_value", -1388471422);
        setField(term11646, term11646.getClass(), "cerwd_str_0", "gUvcueTURF");
        setField(term11646, term11646.getClass(), "cerwd_str_1", "EwQBhZjCIT");
        setField(term11646, term11646.getClass(), "ttl_str_ary", "aSkmSwTnEw");
        setField(term11646, term11646.getClass(), "ttl_plt_id_ary", "xvkbvaEGYd");
        setField(term11646, term11646.getClass(), "ttl_desc_ary", "HBGNxdNURv");
        setField(term11646, term11646.getClass(), "skin_id_ary", "mfCpTPPQQm");
        setField(term11646, term11646.getClass(), "skin_name_ary", "OcJCIDNIXA");
        setField(term11646, term11646.getClass(), "skin_illust_ary", "XfRABIFVEp");
        setField(term11646, term11646.getClass(), "skin_desc_ary", "MHGKyEnwKc");
        setIntField(term11646, term11646.getClass(), "pdddt_flg", -1498296052);
        setIntField(term11842, term11842.getClass(), "year", 2026);
        setShortField(term11842, term11842.getClass(), "month", (short) 12);
        setShortField(term11842, term11842.getClass(), "day", (short) 14);
        setField(term11841, term11841.getClass(), "date", term11842);
        setByteField(term11846, term11846.getClass(), "hour", (byte) 16);
        setByteField(term11846, term11846.getClass(), "minute", (byte) 34);
        setByteField(term11846, term11846.getClass(), "second", (byte) 9);
        setIntField(term11846, term11846.getClass(), "nano", 518326996);
        setField(term11841, term11841.getClass(), "time", term11846);
        setField(term11646, term11646.getClass(), "pdddt_tm", term11841);
        setIntField(term11646, term11646.getClass(), "nblss_ltt_stts", 2098647989);
        setIntField(term11646, term11646.getClass(), "nblss_ltt_tckt", 1598895173);
        setIntField(term11646, term11646.getClass(), "nblss_ltt_is_opn", 1830648570);
        setIntField(term11646, term11646.getClass(), "nblss_ltt_prz", -227365013);
        setIntField(term11646, term11646.getClass(), "nblss_ltt_nxt_stts", 11724947);
        setIntField(term11646, term11646.getClass(), "nblss_ltt_nxt_tckt", 1953277050);
        setField(term11646, term11646.getClass(), "my_qst_id", "ShIELyuULw");
        setField(term11646, term11646.getClass(), "my_qst_r_qid", "IpQuOGMgmj");
        setField(term11646, term11646.getClass(), "my_qst_r_knd", "pJbnHTYrxn");
        setField(term11646, term11646.getClass(), "my_qst_r_vl", "iIRsCSYqXH");
        setField(term11646, term11646.getClass(), "my_qst_r_nflg", "nghfqDXyCG");
        setField(term11646, term11646.getClass(), "my_ccd_r_qid", "WBAOTqErtm");
        setField(term11646, term11646.getClass(), "my_ccd_r_hnd", "PqtVXXZMqK");
        setField(term11646, term11646.getClass(), "my_ccd_r_vp", "rYbtIDVdnd");
        setField(term11646, term11646.getClass(), "cmd", "UKAReurpHG");
        setField(term11646, term11646.getClass(), "req_id", "WVRMUmrljA");
        setField(term11646, term11646.getClass(), "stat", "NTlKJDDWlk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_pnt", argTypes, term11646, args);
    }

};


