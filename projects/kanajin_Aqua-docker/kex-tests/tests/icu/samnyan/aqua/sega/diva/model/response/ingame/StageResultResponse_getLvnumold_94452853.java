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

public class StageResultResponse_getLvnumold_94452853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9837;

    public StageResultResponse_getLvnumold_94452853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9837 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term10032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10037 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9837, term9837.getClass(), "chllng_kind", 972867650);
        setIntField(term9837, term9837.getClass(), "lv_num_old", 1655935355);
        setIntField(term9837, term9837.getClass(), "lv_pnt_old", -481533957);
        setIntField(term9837, term9837.getClass(), "lv_num", 1240914516);
        setIntField(term9837, term9837.getClass(), "lv_pnt", -1465035361);
        setField(term9837, term9837.getClass(), "lv_str", "GgZWSjxjyE");
        setIntField(term9837, term9837.getClass(), "lv_efct_id", 1090617576);
        setIntField(term9837, term9837.getClass(), "lv_plt_id", -1547384488);
        setIntField(term9837, term9837.getClass(), "vcld_pts", 1442160736);
        setIntField(term9837, term9837.getClass(), "prsnt_vcld_pts", 1114000454);
        setIntField(term9837, term9837.getClass(), "cnp_cid", -556405712);
        setIntField(term9837, term9837.getClass(), "cnp_val", -1772434990);
        setField(term9837, term9837.getClass(), "cnp_sp", "EeBVbzjcCI");
        setField(term9837, term9837.getClass(), "crwd_kind", "UfQtPRyWRC");
        setField(term9837, term9837.getClass(), "crwd_value", "FPvxVzzSvD");
        setField(term9837, term9837.getClass(), "crwd_str_0", "WHcwFgsGFC");
        setField(term9837, term9837.getClass(), "crwd_str_1", "HzqpegHiRq");
        setIntField(term9837, term9837.getClass(), "cerwd_kind", -1845499264);
        setIntField(term9837, term9837.getClass(), "cerwd_value", -505439934);
        setField(term9837, term9837.getClass(), "cerwd_str_0", "jwsfVjMoJT");
        setField(term9837, term9837.getClass(), "cerwd_str_1", "ZfdXfCCFDf");
        setField(term9837, term9837.getClass(), "ttl_str_ary", "MwwjNtdOFT");
        setField(term9837, term9837.getClass(), "ttl_plt_id_ary", "VYkqXKVlAJ");
        setField(term9837, term9837.getClass(), "ttl_desc_ary", "XkIoWJRNwN");
        setField(term9837, term9837.getClass(), "skin_id_ary", "aNWLJdrZMq");
        setField(term9837, term9837.getClass(), "skin_name_ary", "HHmNoYxIGj");
        setField(term9837, term9837.getClass(), "skin_illust_ary", "PtirvZmsGt");
        setField(term9837, term9837.getClass(), "skin_desc_ary", "HWkpTmtlrc");
        setIntField(term9837, term9837.getClass(), "pdddt_flg", -344842608);
        setIntField(term10033, term10033.getClass(), "year", 2015);
        setShortField(term10033, term10033.getClass(), "month", (short) 9);
        setShortField(term10033, term10033.getClass(), "day", (short) 19);
        setField(term10032, term10032.getClass(), "date", term10033);
        setByteField(term10037, term10037.getClass(), "hour", (byte) 9);
        setByteField(term10037, term10037.getClass(), "minute", (byte) 4);
        setByteField(term10037, term10037.getClass(), "second", (byte) 10);
        setIntField(term10037, term10037.getClass(), "nano", 401765865);
        setField(term10032, term10032.getClass(), "time", term10037);
        setField(term9837, term9837.getClass(), "pdddt_tm", term10032);
        setIntField(term9837, term9837.getClass(), "nblss_ltt_stts", 941650513);
        setIntField(term9837, term9837.getClass(), "nblss_ltt_tckt", 444029505);
        setIntField(term9837, term9837.getClass(), "nblss_ltt_is_opn", -1034506028);
        setIntField(term9837, term9837.getClass(), "nblss_ltt_prz", -1263114719);
        setIntField(term9837, term9837.getClass(), "nblss_ltt_nxt_stts", -894662986);
        setIntField(term9837, term9837.getClass(), "nblss_ltt_nxt_tckt", 304775596);
        setField(term9837, term9837.getClass(), "my_qst_id", "hMmaoREuCK");
        setField(term9837, term9837.getClass(), "my_qst_r_qid", "VeDtgDzGAN");
        setField(term9837, term9837.getClass(), "my_qst_r_knd", "aWYOWZFyaX");
        setField(term9837, term9837.getClass(), "my_qst_r_vl", "BRIVNtfUWU");
        setField(term9837, term9837.getClass(), "my_qst_r_nflg", "DbiCVtPPCT");
        setField(term9837, term9837.getClass(), "my_ccd_r_qid", "WzFopsaDuG");
        setField(term9837, term9837.getClass(), "my_ccd_r_hnd", "PapWxkhEWe");
        setField(term9837, term9837.getClass(), "my_ccd_r_vp", "smnHEqRFRx");
        setField(term9837, term9837.getClass(), "cmd", "XYtryyobou");
        setField(term9837, term9837.getClass(), "req_id", "OYbzXylRWW");
        setField(term9837, term9837.getClass(), "stat", "DSNsTGYXDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_num_old", argTypes, term9837, args);
    }

};


