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

public class StageResultResponse_setCerwdstr0_71199504565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47381;

    public StageResultResponse_setCerwdstr0_71199504565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47381 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term47576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47581 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47381, term47381.getClass(), "chllng_kind", -1016087889);
        setIntField(term47381, term47381.getClass(), "lv_num_old", 1968287557);
        setIntField(term47381, term47381.getClass(), "lv_pnt_old", 1101385603);
        setIntField(term47381, term47381.getClass(), "lv_num", 1980267589);
        setIntField(term47381, term47381.getClass(), "lv_pnt", -2009434910);
        setField(term47381, term47381.getClass(), "lv_str", "jgywFOzBDw");
        setIntField(term47381, term47381.getClass(), "lv_efct_id", -374887532);
        setIntField(term47381, term47381.getClass(), "lv_plt_id", -165487736);
        setIntField(term47381, term47381.getClass(), "vcld_pts", -608393431);
        setIntField(term47381, term47381.getClass(), "prsnt_vcld_pts", 298082829);
        setIntField(term47381, term47381.getClass(), "cnp_cid", -1494372780);
        setIntField(term47381, term47381.getClass(), "cnp_val", 703799187);
        setField(term47381, term47381.getClass(), "cnp_sp", "yKIXLtCWYi");
        setField(term47381, term47381.getClass(), "crwd_kind", "EhuyRKrUJu");
        setField(term47381, term47381.getClass(), "crwd_value", "UlBxuoBXcJ");
        setField(term47381, term47381.getClass(), "crwd_str_0", "PqduvNFXXw");
        setField(term47381, term47381.getClass(), "crwd_str_1", "bMQrxvaBAI");
        setIntField(term47381, term47381.getClass(), "cerwd_kind", -1305898281);
        setIntField(term47381, term47381.getClass(), "cerwd_value", 140501130);
        setField(term47381, term47381.getClass(), "cerwd_str_0", "StFtysZlWm");
        setField(term47381, term47381.getClass(), "cerwd_str_1", "CoqUcmjnkF");
        setField(term47381, term47381.getClass(), "ttl_str_ary", "oOrXvGaFwa");
        setField(term47381, term47381.getClass(), "ttl_plt_id_ary", "KJSTLGsSvO");
        setField(term47381, term47381.getClass(), "ttl_desc_ary", "kSkiIpaepq");
        setField(term47381, term47381.getClass(), "skin_id_ary", "FzJhDecyvI");
        setField(term47381, term47381.getClass(), "skin_name_ary", "zOxseYMSdY");
        setField(term47381, term47381.getClass(), "skin_illust_ary", "jEKlkqpHMQ");
        setField(term47381, term47381.getClass(), "skin_desc_ary", "QpEVWispEh");
        setIntField(term47381, term47381.getClass(), "pdddt_flg", -1458890291);
        setIntField(term47577, term47577.getClass(), "year", 2028);
        setShortField(term47577, term47577.getClass(), "month", (short) 1);
        setShortField(term47577, term47577.getClass(), "day", (short) 18);
        setField(term47576, term47576.getClass(), "date", term47577);
        setByteField(term47581, term47581.getClass(), "hour", (byte) 12);
        setByteField(term47581, term47581.getClass(), "minute", (byte) 4);
        setByteField(term47581, term47581.getClass(), "second", (byte) 39);
        setIntField(term47581, term47581.getClass(), "nano", 651287093);
        setField(term47576, term47576.getClass(), "time", term47581);
        setField(term47381, term47381.getClass(), "pdddt_tm", term47576);
        setIntField(term47381, term47381.getClass(), "nblss_ltt_stts", 1016087323);
        setIntField(term47381, term47381.getClass(), "nblss_ltt_tckt", 1957748979);
        setIntField(term47381, term47381.getClass(), "nblss_ltt_is_opn", -1290093259);
        setIntField(term47381, term47381.getClass(), "nblss_ltt_prz", -1200934890);
        setIntField(term47381, term47381.getClass(), "nblss_ltt_nxt_stts", 1765633108);
        setIntField(term47381, term47381.getClass(), "nblss_ltt_nxt_tckt", 1312888741);
        setField(term47381, term47381.getClass(), "my_qst_id", "STofGrqXqL");
        setField(term47381, term47381.getClass(), "my_qst_r_qid", "IoRhBfdSuN");
        setField(term47381, term47381.getClass(), "my_qst_r_knd", "JGdxVjQzts");
        setField(term47381, term47381.getClass(), "my_qst_r_vl", "jEdjRikQtN");
        setField(term47381, term47381.getClass(), "my_qst_r_nflg", "fSNUaokVWs");
        setField(term47381, term47381.getClass(), "my_ccd_r_qid", "dTxnMmHoVm");
        setField(term47381, term47381.getClass(), "my_ccd_r_hnd", "iswxaQUQgT");
        setField(term47381, term47381.getClass(), "my_ccd_r_vp", "MxUSQqhNse");
        setField(term47381, term47381.getClass(), "cmd", "skwxdosvQV");
        setField(term47381, term47381.getClass(), "req_id", "DBYTggnCkD");
        setField(term47381, term47381.getClass(), "stat", "RyXrJxJQiY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JfnQeTdzWs";
        callMethod(klass, "setCerwd_str_0", argTypes, term47381, args);
    }

};


