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

public class StageResultResponse_setSkindescary_148744540773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52381;

    public StageResultResponse_setSkindescary_148744540773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52381 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term52576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52581 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52381, term52381.getClass(), "chllng_kind", 1047346538);
        setIntField(term52381, term52381.getClass(), "lv_num_old", 728436340);
        setIntField(term52381, term52381.getClass(), "lv_pnt_old", 1841731593);
        setIntField(term52381, term52381.getClass(), "lv_num", -1854929057);
        setIntField(term52381, term52381.getClass(), "lv_pnt", 1703814701);
        setField(term52381, term52381.getClass(), "lv_str", "GdjCkRsIrS");
        setIntField(term52381, term52381.getClass(), "lv_efct_id", 1370246522);
        setIntField(term52381, term52381.getClass(), "lv_plt_id", -574611924);
        setIntField(term52381, term52381.getClass(), "vcld_pts", 512521742);
        setIntField(term52381, term52381.getClass(), "prsnt_vcld_pts", 1291000976);
        setIntField(term52381, term52381.getClass(), "cnp_cid", 1143522832);
        setIntField(term52381, term52381.getClass(), "cnp_val", 40965975);
        setField(term52381, term52381.getClass(), "cnp_sp", "MJNyYzLhkh");
        setField(term52381, term52381.getClass(), "crwd_kind", "DEugGJIaYt");
        setField(term52381, term52381.getClass(), "crwd_value", "lzZIObOJmC");
        setField(term52381, term52381.getClass(), "crwd_str_0", "RFmGKwvSgz");
        setField(term52381, term52381.getClass(), "crwd_str_1", "EUEUhZglna");
        setIntField(term52381, term52381.getClass(), "cerwd_kind", -194718582);
        setIntField(term52381, term52381.getClass(), "cerwd_value", 42982854);
        setField(term52381, term52381.getClass(), "cerwd_str_0", "znDPtjpZrG");
        setField(term52381, term52381.getClass(), "cerwd_str_1", "uodLjxczjr");
        setField(term52381, term52381.getClass(), "ttl_str_ary", "HJLVBQAtGs");
        setField(term52381, term52381.getClass(), "ttl_plt_id_ary", "dxAxECMYEm");
        setField(term52381, term52381.getClass(), "ttl_desc_ary", "ylGHeywyhx");
        setField(term52381, term52381.getClass(), "skin_id_ary", "SqMpUczXhg");
        setField(term52381, term52381.getClass(), "skin_name_ary", "voDQuoTpgt");
        setField(term52381, term52381.getClass(), "skin_illust_ary", "wgwSIKAsrj");
        setField(term52381, term52381.getClass(), "skin_desc_ary", "aGJCHRHyCe");
        setIntField(term52381, term52381.getClass(), "pdddt_flg", -1129506480);
        setIntField(term52577, term52577.getClass(), "year", 2022);
        setShortField(term52577, term52577.getClass(), "month", (short) 11);
        setShortField(term52577, term52577.getClass(), "day", (short) 10);
        setField(term52576, term52576.getClass(), "date", term52577);
        setByteField(term52581, term52581.getClass(), "hour", (byte) 20);
        setByteField(term52581, term52581.getClass(), "minute", (byte) 8);
        setByteField(term52581, term52581.getClass(), "second", (byte) 35);
        setIntField(term52581, term52581.getClass(), "nano", 658416570);
        setField(term52576, term52576.getClass(), "time", term52581);
        setField(term52381, term52381.getClass(), "pdddt_tm", term52576);
        setIntField(term52381, term52381.getClass(), "nblss_ltt_stts", 301438568);
        setIntField(term52381, term52381.getClass(), "nblss_ltt_tckt", -1667908453);
        setIntField(term52381, term52381.getClass(), "nblss_ltt_is_opn", 315910438);
        setIntField(term52381, term52381.getClass(), "nblss_ltt_prz", -1673157821);
        setIntField(term52381, term52381.getClass(), "nblss_ltt_nxt_stts", 1217804703);
        setIntField(term52381, term52381.getClass(), "nblss_ltt_nxt_tckt", -1981494102);
        setField(term52381, term52381.getClass(), "my_qst_id", "WingwhSgfc");
        setField(term52381, term52381.getClass(), "my_qst_r_qid", "YEcmxINfnL");
        setField(term52381, term52381.getClass(), "my_qst_r_knd", "EGytMwlDVe");
        setField(term52381, term52381.getClass(), "my_qst_r_vl", "GFQCmYZmcg");
        setField(term52381, term52381.getClass(), "my_qst_r_nflg", "qPgbFtsgtk");
        setField(term52381, term52381.getClass(), "my_ccd_r_qid", "nkmiePLZgp");
        setField(term52381, term52381.getClass(), "my_ccd_r_hnd", "VoCvDpwwFr");
        setField(term52381, term52381.getClass(), "my_ccd_r_vp", "zYOmoQqDOd");
        setField(term52381, term52381.getClass(), "cmd", "kmgEVEqTGa");
        setField(term52381, term52381.getClass(), "req_id", "qakIqInzyM");
        setField(term52381, term52381.getClass(), "stat", "EOsBgwlmva");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qcSJruZuJy";
        callMethod(klass, "setSkin_desc_ary", argTypes, term52381, args);
    }

};


