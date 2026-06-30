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

public class StageResultResponse_setSkinnameary_60964995771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51131;

    public StageResultResponse_setSkinnameary_60964995771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51131 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term51326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51331 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51131, term51131.getClass(), "chllng_kind", -945759470);
        setIntField(term51131, term51131.getClass(), "lv_num_old", 657342039);
        setIntField(term51131, term51131.getClass(), "lv_pnt_old", 1483999606);
        setIntField(term51131, term51131.getClass(), "lv_num", 1871761182);
        setIntField(term51131, term51131.getClass(), "lv_pnt", 233983728);
        setField(term51131, term51131.getClass(), "lv_str", "lNbVasLAKL");
        setIntField(term51131, term51131.getClass(), "lv_efct_id", -1650132476);
        setIntField(term51131, term51131.getClass(), "lv_plt_id", 1719680265);
        setIntField(term51131, term51131.getClass(), "vcld_pts", -1890898783);
        setIntField(term51131, term51131.getClass(), "prsnt_vcld_pts", 1357632911);
        setIntField(term51131, term51131.getClass(), "cnp_cid", 1768195761);
        setIntField(term51131, term51131.getClass(), "cnp_val", -1382661134);
        setField(term51131, term51131.getClass(), "cnp_sp", "wKeyHBCSLZ");
        setField(term51131, term51131.getClass(), "crwd_kind", "iQCLduwSPi");
        setField(term51131, term51131.getClass(), "crwd_value", "ZcODLNhxqg");
        setField(term51131, term51131.getClass(), "crwd_str_0", "iNtHOROBMq");
        setField(term51131, term51131.getClass(), "crwd_str_1", "GbvfbbsrOl");
        setIntField(term51131, term51131.getClass(), "cerwd_kind", -1042022818);
        setIntField(term51131, term51131.getClass(), "cerwd_value", 317372051);
        setField(term51131, term51131.getClass(), "cerwd_str_0", "IIZlqzOmtY");
        setField(term51131, term51131.getClass(), "cerwd_str_1", "iRFRSxtnkr");
        setField(term51131, term51131.getClass(), "ttl_str_ary", "iGWkLjLGBY");
        setField(term51131, term51131.getClass(), "ttl_plt_id_ary", "jUkXaNkoAg");
        setField(term51131, term51131.getClass(), "ttl_desc_ary", "mZsPsRzyhQ");
        setField(term51131, term51131.getClass(), "skin_id_ary", "IExlbTemvJ");
        setField(term51131, term51131.getClass(), "skin_name_ary", "zaljyXXCoy");
        setField(term51131, term51131.getClass(), "skin_illust_ary", "dKoYnXLGEI");
        setField(term51131, term51131.getClass(), "skin_desc_ary", "MQvSpklpkB");
        setIntField(term51131, term51131.getClass(), "pdddt_flg", 892170444);
        setIntField(term51327, term51327.getClass(), "year", 2022);
        setShortField(term51327, term51327.getClass(), "month", (short) 4);
        setShortField(term51327, term51327.getClass(), "day", (short) 15);
        setField(term51326, term51326.getClass(), "date", term51327);
        setByteField(term51331, term51331.getClass(), "hour", (byte) 20);
        setByteField(term51331, term51331.getClass(), "minute", (byte) 58);
        setByteField(term51331, term51331.getClass(), "second", (byte) 46);
        setIntField(term51331, term51331.getClass(), "nano", 435562727);
        setField(term51326, term51326.getClass(), "time", term51331);
        setField(term51131, term51131.getClass(), "pdddt_tm", term51326);
        setIntField(term51131, term51131.getClass(), "nblss_ltt_stts", -82417507);
        setIntField(term51131, term51131.getClass(), "nblss_ltt_tckt", -511400358);
        setIntField(term51131, term51131.getClass(), "nblss_ltt_is_opn", -742178468);
        setIntField(term51131, term51131.getClass(), "nblss_ltt_prz", 694989162);
        setIntField(term51131, term51131.getClass(), "nblss_ltt_nxt_stts", -65504209);
        setIntField(term51131, term51131.getClass(), "nblss_ltt_nxt_tckt", 1745199030);
        setField(term51131, term51131.getClass(), "my_qst_id", "SbTxRdDQQc");
        setField(term51131, term51131.getClass(), "my_qst_r_qid", "MrVdoUYAdO");
        setField(term51131, term51131.getClass(), "my_qst_r_knd", "schPUnVfDW");
        setField(term51131, term51131.getClass(), "my_qst_r_vl", "CpdMEgjUka");
        setField(term51131, term51131.getClass(), "my_qst_r_nflg", "WRisHdgnmm");
        setField(term51131, term51131.getClass(), "my_ccd_r_qid", "XxZiwWPLOx");
        setField(term51131, term51131.getClass(), "my_ccd_r_hnd", "nyqsjMHTba");
        setField(term51131, term51131.getClass(), "my_ccd_r_vp", "ylUHzURWyg");
        setField(term51131, term51131.getClass(), "cmd", "VuAuFBlHxQ");
        setField(term51131, term51131.getClass(), "req_id", "nOLtCslMMH");
        setField(term51131, term51131.getClass(), "stat", "dIQWOeKQVj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tHiDGaNXAL";
        callMethod(klass, "setSkin_name_ary", argTypes, term51131, args);
    }

};


