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

public class StageResultResponse_getPrsntvcldpts_61004210311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14661;

    public StageResultResponse_getPrsntvcldpts_61004210311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14661 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term14856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14861 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14661, term14661.getClass(), "chllng_kind", 1320570890);
        setIntField(term14661, term14661.getClass(), "lv_num_old", -130649791);
        setIntField(term14661, term14661.getClass(), "lv_pnt_old", 534834644);
        setIntField(term14661, term14661.getClass(), "lv_num", 1959097203);
        setIntField(term14661, term14661.getClass(), "lv_pnt", -209654048);
        setField(term14661, term14661.getClass(), "lv_str", "UPUbwyHQKN");
        setIntField(term14661, term14661.getClass(), "lv_efct_id", 477625804);
        setIntField(term14661, term14661.getClass(), "lv_plt_id", 252575029);
        setIntField(term14661, term14661.getClass(), "vcld_pts", 57189932);
        setIntField(term14661, term14661.getClass(), "prsnt_vcld_pts", 1460722225);
        setIntField(term14661, term14661.getClass(), "cnp_cid", 1743224434);
        setIntField(term14661, term14661.getClass(), "cnp_val", 842904495);
        setField(term14661, term14661.getClass(), "cnp_sp", "lgQkrXANyI");
        setField(term14661, term14661.getClass(), "crwd_kind", "MeTmRZXErV");
        setField(term14661, term14661.getClass(), "crwd_value", "jNxbVmoZgq");
        setField(term14661, term14661.getClass(), "crwd_str_0", "PvmBHIXaMY");
        setField(term14661, term14661.getClass(), "crwd_str_1", "hulYxtowxw");
        setIntField(term14661, term14661.getClass(), "cerwd_kind", 1008080511);
        setIntField(term14661, term14661.getClass(), "cerwd_value", 1935707624);
        setField(term14661, term14661.getClass(), "cerwd_str_0", "GNEmuHPNcU");
        setField(term14661, term14661.getClass(), "cerwd_str_1", "IoSfuKDFRe");
        setField(term14661, term14661.getClass(), "ttl_str_ary", "AWYyZiNfsm");
        setField(term14661, term14661.getClass(), "ttl_plt_id_ary", "ITRRYiuDwH");
        setField(term14661, term14661.getClass(), "ttl_desc_ary", "llRfwANcVF");
        setField(term14661, term14661.getClass(), "skin_id_ary", "sUEeHQTWkA");
        setField(term14661, term14661.getClass(), "skin_name_ary", "BDIRCxAWLA");
        setField(term14661, term14661.getClass(), "skin_illust_ary", "eOJfbiZLnb");
        setField(term14661, term14661.getClass(), "skin_desc_ary", "nKZKnxWYCK");
        setIntField(term14661, term14661.getClass(), "pdddt_flg", 1507074215);
        setIntField(term14857, term14857.getClass(), "year", 2019);
        setShortField(term14857, term14857.getClass(), "month", (short) 2);
        setShortField(term14857, term14857.getClass(), "day", (short) 21);
        setField(term14856, term14856.getClass(), "date", term14857);
        setByteField(term14861, term14861.getClass(), "hour", (byte) 5);
        setByteField(term14861, term14861.getClass(), "minute", (byte) 41);
        setByteField(term14861, term14861.getClass(), "second", (byte) 11);
        setIntField(term14861, term14861.getClass(), "nano", 859829782);
        setField(term14856, term14856.getClass(), "time", term14861);
        setField(term14661, term14661.getClass(), "pdddt_tm", term14856);
        setIntField(term14661, term14661.getClass(), "nblss_ltt_stts", -282881827);
        setIntField(term14661, term14661.getClass(), "nblss_ltt_tckt", -1183353915);
        setIntField(term14661, term14661.getClass(), "nblss_ltt_is_opn", -420030135);
        setIntField(term14661, term14661.getClass(), "nblss_ltt_prz", 267763294);
        setIntField(term14661, term14661.getClass(), "nblss_ltt_nxt_stts", -1497710478);
        setIntField(term14661, term14661.getClass(), "nblss_ltt_nxt_tckt", 49950830);
        setField(term14661, term14661.getClass(), "my_qst_id", "JOqQxuzRuZ");
        setField(term14661, term14661.getClass(), "my_qst_r_qid", "RSaoipUlsg");
        setField(term14661, term14661.getClass(), "my_qst_r_knd", "cSHGbqKqlN");
        setField(term14661, term14661.getClass(), "my_qst_r_vl", "pFAfANnxup");
        setField(term14661, term14661.getClass(), "my_qst_r_nflg", "FbSIUZyBXZ");
        setField(term14661, term14661.getClass(), "my_ccd_r_qid", "mhQDwIyrRi");
        setField(term14661, term14661.getClass(), "my_ccd_r_hnd", "HpZXWDPhlg");
        setField(term14661, term14661.getClass(), "my_ccd_r_vp", "lBOokzEPfe");
        setField(term14661, term14661.getClass(), "cmd", "dtGZCsKXbW");
        setField(term14661, term14661.getClass(), "req_id", "bdyhHbDAmJ");
        setField(term14661, term14661.getClass(), "stat", "BBXiTNHqGE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrsnt_vcld_pts", argTypes, term14661, args);
    }

};


