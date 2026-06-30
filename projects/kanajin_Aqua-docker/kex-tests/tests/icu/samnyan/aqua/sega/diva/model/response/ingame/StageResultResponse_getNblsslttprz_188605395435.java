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

public class StageResultResponse_getNblsslttprz_188605395435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29133;

    public StageResultResponse_getNblsslttprz_188605395435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29133 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term29328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29333 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29133, term29133.getClass(), "chllng_kind", 808614267);
        setIntField(term29133, term29133.getClass(), "lv_num_old", 1611734632);
        setIntField(term29133, term29133.getClass(), "lv_pnt_old", 868908117);
        setIntField(term29133, term29133.getClass(), "lv_num", 1789351397);
        setIntField(term29133, term29133.getClass(), "lv_pnt", 2145528170);
        setField(term29133, term29133.getClass(), "lv_str", "JeyKRznnft");
        setIntField(term29133, term29133.getClass(), "lv_efct_id", -585773976);
        setIntField(term29133, term29133.getClass(), "lv_plt_id", 852806940);
        setIntField(term29133, term29133.getClass(), "vcld_pts", 698551724);
        setIntField(term29133, term29133.getClass(), "prsnt_vcld_pts", -1631048635);
        setIntField(term29133, term29133.getClass(), "cnp_cid", 1342808731);
        setIntField(term29133, term29133.getClass(), "cnp_val", -64893740);
        setField(term29133, term29133.getClass(), "cnp_sp", "vQJUCtuYpK");
        setField(term29133, term29133.getClass(), "crwd_kind", "GHtOeztAdz");
        setField(term29133, term29133.getClass(), "crwd_value", "gSAtqakaLY");
        setField(term29133, term29133.getClass(), "crwd_str_0", "taPBiMFNEZ");
        setField(term29133, term29133.getClass(), "crwd_str_1", "NoAFAfGyYL");
        setIntField(term29133, term29133.getClass(), "cerwd_kind", -222012928);
        setIntField(term29133, term29133.getClass(), "cerwd_value", -146564963);
        setField(term29133, term29133.getClass(), "cerwd_str_0", "MFtfkBMyOD");
        setField(term29133, term29133.getClass(), "cerwd_str_1", "rdiIyXfRtL");
        setField(term29133, term29133.getClass(), "ttl_str_ary", "douzkltmiI");
        setField(term29133, term29133.getClass(), "ttl_plt_id_ary", "MFKjhvLtpe");
        setField(term29133, term29133.getClass(), "ttl_desc_ary", "xpbLKEsput");
        setField(term29133, term29133.getClass(), "skin_id_ary", "urlyLwPBVn");
        setField(term29133, term29133.getClass(), "skin_name_ary", "SPQVzOlOzZ");
        setField(term29133, term29133.getClass(), "skin_illust_ary", "bOUAgAptAI");
        setField(term29133, term29133.getClass(), "skin_desc_ary", "KSZfGbvzPE");
        setIntField(term29133, term29133.getClass(), "pdddt_flg", -83178716);
        setIntField(term29329, term29329.getClass(), "year", 2010);
        setShortField(term29329, term29329.getClass(), "month", (short) 5);
        setShortField(term29329, term29329.getClass(), "day", (short) 2);
        setField(term29328, term29328.getClass(), "date", term29329);
        setByteField(term29333, term29333.getClass(), "hour", (byte) 2);
        setByteField(term29333, term29333.getClass(), "minute", (byte) 22);
        setByteField(term29333, term29333.getClass(), "second", (byte) 33);
        setIntField(term29333, term29333.getClass(), "nano", 530835039);
        setField(term29328, term29328.getClass(), "time", term29333);
        setField(term29133, term29133.getClass(), "pdddt_tm", term29328);
        setIntField(term29133, term29133.getClass(), "nblss_ltt_stts", -1292704466);
        setIntField(term29133, term29133.getClass(), "nblss_ltt_tckt", 1991858584);
        setIntField(term29133, term29133.getClass(), "nblss_ltt_is_opn", -1300947782);
        setIntField(term29133, term29133.getClass(), "nblss_ltt_prz", 188512644);
        setIntField(term29133, term29133.getClass(), "nblss_ltt_nxt_stts", 1851127634);
        setIntField(term29133, term29133.getClass(), "nblss_ltt_nxt_tckt", 783730213);
        setField(term29133, term29133.getClass(), "my_qst_id", "YfgYGgzYER");
        setField(term29133, term29133.getClass(), "my_qst_r_qid", "IDClvDZuqE");
        setField(term29133, term29133.getClass(), "my_qst_r_knd", "cMvKxpZOvg");
        setField(term29133, term29133.getClass(), "my_qst_r_vl", "WWBYemIuiK");
        setField(term29133, term29133.getClass(), "my_qst_r_nflg", "nHYQYkycCR");
        setField(term29133, term29133.getClass(), "my_ccd_r_qid", "yBiVacDcZX");
        setField(term29133, term29133.getClass(), "my_ccd_r_hnd", "QrKfEgQeoy");
        setField(term29133, term29133.getClass(), "my_ccd_r_vp", "oApgdbwnti");
        setField(term29133, term29133.getClass(), "cmd", "YcgHACNgyo");
        setField(term29133, term29133.getClass(), "req_id", "MrUPJzBTEn");
        setField(term29133, term29133.getClass(), "stat", "IaSymdfFGa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_prz", argTypes, term29133, args);
    }

};


