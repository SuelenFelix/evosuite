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

public class StageResultResponse_getCerwdstr0_60894422921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20691;

    public StageResultResponse_getCerwdstr0_60894422921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20691 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term20886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20891 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20691, term20691.getClass(), "chllng_kind", -97742366);
        setIntField(term20691, term20691.getClass(), "lv_num_old", 1638851942);
        setIntField(term20691, term20691.getClass(), "lv_pnt_old", 1374790203);
        setIntField(term20691, term20691.getClass(), "lv_num", 1160010161);
        setIntField(term20691, term20691.getClass(), "lv_pnt", -423900705);
        setField(term20691, term20691.getClass(), "lv_str", "YfkhviKZwl");
        setIntField(term20691, term20691.getClass(), "lv_efct_id", -525570815);
        setIntField(term20691, term20691.getClass(), "lv_plt_id", 754055848);
        setIntField(term20691, term20691.getClass(), "vcld_pts", -19246901);
        setIntField(term20691, term20691.getClass(), "prsnt_vcld_pts", -370828664);
        setIntField(term20691, term20691.getClass(), "cnp_cid", 1168633950);
        setIntField(term20691, term20691.getClass(), "cnp_val", 1607082164);
        setField(term20691, term20691.getClass(), "cnp_sp", "DcOhhAfJTI");
        setField(term20691, term20691.getClass(), "crwd_kind", "gYTIkBFOoS");
        setField(term20691, term20691.getClass(), "crwd_value", "xmzSoVgiED");
        setField(term20691, term20691.getClass(), "crwd_str_0", "pdSvedKgPq");
        setField(term20691, term20691.getClass(), "crwd_str_1", "epPTwvcoyb");
        setIntField(term20691, term20691.getClass(), "cerwd_kind", 1890399366);
        setIntField(term20691, term20691.getClass(), "cerwd_value", -1867239125);
        setField(term20691, term20691.getClass(), "cerwd_str_0", "UBPHmOICBs");
        setField(term20691, term20691.getClass(), "cerwd_str_1", "IDJUVPgUJf");
        setField(term20691, term20691.getClass(), "ttl_str_ary", "JmnWRJUxGr");
        setField(term20691, term20691.getClass(), "ttl_plt_id_ary", "wgRGBNrTGP");
        setField(term20691, term20691.getClass(), "ttl_desc_ary", "FIdNVptZpW");
        setField(term20691, term20691.getClass(), "skin_id_ary", "rQjxAhisjm");
        setField(term20691, term20691.getClass(), "skin_name_ary", "ZDhASPHjDG");
        setField(term20691, term20691.getClass(), "skin_illust_ary", "HNVOAXYNEZ");
        setField(term20691, term20691.getClass(), "skin_desc_ary", "gbbYBYyfvr");
        setIntField(term20691, term20691.getClass(), "pdddt_flg", 952869601);
        setIntField(term20887, term20887.getClass(), "year", 2014);
        setShortField(term20887, term20887.getClass(), "month", (short) 7);
        setShortField(term20887, term20887.getClass(), "day", (short) 13);
        setField(term20886, term20886.getClass(), "date", term20887);
        setByteField(term20891, term20891.getClass(), "hour", (byte) 21);
        setByteField(term20891, term20891.getClass(), "minute", (byte) 46);
        setByteField(term20891, term20891.getClass(), "second", (byte) 0);
        setIntField(term20891, term20891.getClass(), "nano", 887884128);
        setField(term20886, term20886.getClass(), "time", term20891);
        setField(term20691, term20691.getClass(), "pdddt_tm", term20886);
        setIntField(term20691, term20691.getClass(), "nblss_ltt_stts", 91958879);
        setIntField(term20691, term20691.getClass(), "nblss_ltt_tckt", -645429025);
        setIntField(term20691, term20691.getClass(), "nblss_ltt_is_opn", -688213483);
        setIntField(term20691, term20691.getClass(), "nblss_ltt_prz", 644154104);
        setIntField(term20691, term20691.getClass(), "nblss_ltt_nxt_stts", 76650923);
        setIntField(term20691, term20691.getClass(), "nblss_ltt_nxt_tckt", 1003743923);
        setField(term20691, term20691.getClass(), "my_qst_id", "SrWMUlbtWV");
        setField(term20691, term20691.getClass(), "my_qst_r_qid", "VePIumgrrU");
        setField(term20691, term20691.getClass(), "my_qst_r_knd", "DPwIqlszZo");
        setField(term20691, term20691.getClass(), "my_qst_r_vl", "mNgDshwZNc");
        setField(term20691, term20691.getClass(), "my_qst_r_nflg", "pDqgDbJoFw");
        setField(term20691, term20691.getClass(), "my_ccd_r_qid", "iVOvTzOxwt");
        setField(term20691, term20691.getClass(), "my_ccd_r_hnd", "BjZQdecXvB");
        setField(term20691, term20691.getClass(), "my_ccd_r_vp", "iUkOOQhEkw");
        setField(term20691, term20691.getClass(), "cmd", "wmVoFoUVmU");
        setField(term20691, term20691.getClass(), "req_id", "lLiSiPCciB");
        setField(term20691, term20691.getClass(), "stat", "PsMKIIEwdR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCerwd_str_0", argTypes, term20691, args);
    }

};


