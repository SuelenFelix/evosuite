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

public class StageResultResponse_getMyqstrnflg_129829875742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33354;

    public StageResultResponse_getMyqstrnflg_129829875742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33354 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term33549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33554 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33354, term33354.getClass(), "chllng_kind", 804070622);
        setIntField(term33354, term33354.getClass(), "lv_num_old", 1850364894);
        setIntField(term33354, term33354.getClass(), "lv_pnt_old", 915367534);
        setIntField(term33354, term33354.getClass(), "lv_num", 1949983666);
        setIntField(term33354, term33354.getClass(), "lv_pnt", 154111854);
        setField(term33354, term33354.getClass(), "lv_str", "dHuWgRwLOm");
        setIntField(term33354, term33354.getClass(), "lv_efct_id", 710986341);
        setIntField(term33354, term33354.getClass(), "lv_plt_id", -873958002);
        setIntField(term33354, term33354.getClass(), "vcld_pts", -1780848958);
        setIntField(term33354, term33354.getClass(), "prsnt_vcld_pts", 1235045850);
        setIntField(term33354, term33354.getClass(), "cnp_cid", -75143033);
        setIntField(term33354, term33354.getClass(), "cnp_val", 797015478);
        setField(term33354, term33354.getClass(), "cnp_sp", "PsTQDxNIld");
        setField(term33354, term33354.getClass(), "crwd_kind", "uoBijJjvaj");
        setField(term33354, term33354.getClass(), "crwd_value", "BdsLFSRWda");
        setField(term33354, term33354.getClass(), "crwd_str_0", "tMhhBYonAI");
        setField(term33354, term33354.getClass(), "crwd_str_1", "AaQRshwIQC");
        setIntField(term33354, term33354.getClass(), "cerwd_kind", 717574276);
        setIntField(term33354, term33354.getClass(), "cerwd_value", 1795369860);
        setField(term33354, term33354.getClass(), "cerwd_str_0", "rHgKCfgCsg");
        setField(term33354, term33354.getClass(), "cerwd_str_1", "AWtIUOuutt");
        setField(term33354, term33354.getClass(), "ttl_str_ary", "jBgJZpHifl");
        setField(term33354, term33354.getClass(), "ttl_plt_id_ary", "azMTTmEXnh");
        setField(term33354, term33354.getClass(), "ttl_desc_ary", "BjJtxwsIpt");
        setField(term33354, term33354.getClass(), "skin_id_ary", "gUQhOyGfzF");
        setField(term33354, term33354.getClass(), "skin_name_ary", "IqDObvPBZX");
        setField(term33354, term33354.getClass(), "skin_illust_ary", "NITCrIISoC");
        setField(term33354, term33354.getClass(), "skin_desc_ary", "nSzzeexTDI");
        setIntField(term33354, term33354.getClass(), "pdddt_flg", -570164389);
        setIntField(term33550, term33550.getClass(), "year", 2027);
        setShortField(term33550, term33550.getClass(), "month", (short) 11);
        setShortField(term33550, term33550.getClass(), "day", (short) 8);
        setField(term33549, term33549.getClass(), "date", term33550);
        setByteField(term33554, term33554.getClass(), "hour", (byte) 11);
        setByteField(term33554, term33554.getClass(), "minute", (byte) 59);
        setByteField(term33554, term33554.getClass(), "second", (byte) 14);
        setIntField(term33554, term33554.getClass(), "nano", 322375591);
        setField(term33549, term33549.getClass(), "time", term33554);
        setField(term33354, term33354.getClass(), "pdddt_tm", term33549);
        setIntField(term33354, term33354.getClass(), "nblss_ltt_stts", 43200329);
        setIntField(term33354, term33354.getClass(), "nblss_ltt_tckt", 998679955);
        setIntField(term33354, term33354.getClass(), "nblss_ltt_is_opn", 953741504);
        setIntField(term33354, term33354.getClass(), "nblss_ltt_prz", 1389452261);
        setIntField(term33354, term33354.getClass(), "nblss_ltt_nxt_stts", 1615957955);
        setIntField(term33354, term33354.getClass(), "nblss_ltt_nxt_tckt", 1779370220);
        setField(term33354, term33354.getClass(), "my_qst_id", "WBrpvMhmsz");
        setField(term33354, term33354.getClass(), "my_qst_r_qid", "ZzqRHVEXcM");
        setField(term33354, term33354.getClass(), "my_qst_r_knd", "YYwIEARNxi");
        setField(term33354, term33354.getClass(), "my_qst_r_vl", "rblXBUdTFc");
        setField(term33354, term33354.getClass(), "my_qst_r_nflg", "rbsXSOJFKW");
        setField(term33354, term33354.getClass(), "my_ccd_r_qid", "sAgGDoUNlf");
        setField(term33354, term33354.getClass(), "my_ccd_r_hnd", "TSTZcXdFFi");
        setField(term33354, term33354.getClass(), "my_ccd_r_vp", "RyaaOzWfYO");
        setField(term33354, term33354.getClass(), "cmd", "HAkxFBZZzz");
        setField(term33354, term33354.getClass(), "req_id", "yejonZnVuy");
        setField(term33354, term33354.getClass(), "stat", "ouesGIsvuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_r_nflg", argTypes, term33354, args);
    }

};


