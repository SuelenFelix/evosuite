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

public class StageResultResponse_getLvstr_17498924677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12249;

    public StageResultResponse_getLvstr_17498924677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12249 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term12444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12449 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12249, term12249.getClass(), "chllng_kind", 1283079251);
        setIntField(term12249, term12249.getClass(), "lv_num_old", -523949691);
        setIntField(term12249, term12249.getClass(), "lv_pnt_old", 1398204340);
        setIntField(term12249, term12249.getClass(), "lv_num", 229204365);
        setIntField(term12249, term12249.getClass(), "lv_pnt", -461771056);
        setField(term12249, term12249.getClass(), "lv_str", "vOuMEpOQAg");
        setIntField(term12249, term12249.getClass(), "lv_efct_id", -243422082);
        setIntField(term12249, term12249.getClass(), "lv_plt_id", 1384592638);
        setIntField(term12249, term12249.getClass(), "vcld_pts", -1002370457);
        setIntField(term12249, term12249.getClass(), "prsnt_vcld_pts", -2014576105);
        setIntField(term12249, term12249.getClass(), "cnp_cid", 1296895584);
        setIntField(term12249, term12249.getClass(), "cnp_val", 628918458);
        setField(term12249, term12249.getClass(), "cnp_sp", "SIODFGaQhr");
        setField(term12249, term12249.getClass(), "crwd_kind", "qYzsiuXOgS");
        setField(term12249, term12249.getClass(), "crwd_value", "bxrCBbrrct");
        setField(term12249, term12249.getClass(), "crwd_str_0", "CKWpJaaaxX");
        setField(term12249, term12249.getClass(), "crwd_str_1", "UBRmXJmfrt");
        setIntField(term12249, term12249.getClass(), "cerwd_kind", -1274456137);
        setIntField(term12249, term12249.getClass(), "cerwd_value", 1041916673);
        setField(term12249, term12249.getClass(), "cerwd_str_0", "WZzvmIHhzZ");
        setField(term12249, term12249.getClass(), "cerwd_str_1", "doQLHkjpNm");
        setField(term12249, term12249.getClass(), "ttl_str_ary", "lCyLIcSuom");
        setField(term12249, term12249.getClass(), "ttl_plt_id_ary", "CGOpQSZZwI");
        setField(term12249, term12249.getClass(), "ttl_desc_ary", "ypEdrstygY");
        setField(term12249, term12249.getClass(), "skin_id_ary", "sNQFlATEeQ");
        setField(term12249, term12249.getClass(), "skin_name_ary", "ZKMLioamsY");
        setField(term12249, term12249.getClass(), "skin_illust_ary", "WVbxuoDBcn");
        setField(term12249, term12249.getClass(), "skin_desc_ary", "pvDEABOxLt");
        setIntField(term12249, term12249.getClass(), "pdddt_flg", -601863069);
        setIntField(term12445, term12445.getClass(), "year", 2025);
        setShortField(term12445, term12445.getClass(), "month", (short) 4);
        setShortField(term12445, term12445.getClass(), "day", (short) 24);
        setField(term12444, term12444.getClass(), "date", term12445);
        setByteField(term12449, term12449.getClass(), "hour", (byte) 18);
        setByteField(term12449, term12449.getClass(), "minute", (byte) 11);
        setByteField(term12449, term12449.getClass(), "second", (byte) 40);
        setIntField(term12449, term12449.getClass(), "nano", 137454929);
        setField(term12444, term12444.getClass(), "time", term12449);
        setField(term12249, term12249.getClass(), "pdddt_tm", term12444);
        setIntField(term12249, term12249.getClass(), "nblss_ltt_stts", 663292551);
        setIntField(term12249, term12249.getClass(), "nblss_ltt_tckt", -1885090354);
        setIntField(term12249, term12249.getClass(), "nblss_ltt_is_opn", -2066804303);
        setIntField(term12249, term12249.getClass(), "nblss_ltt_prz", -1731761810);
        setIntField(term12249, term12249.getClass(), "nblss_ltt_nxt_stts", 197109649);
        setIntField(term12249, term12249.getClass(), "nblss_ltt_nxt_tckt", -1239406390);
        setField(term12249, term12249.getClass(), "my_qst_id", "beAMpkroCQ");
        setField(term12249, term12249.getClass(), "my_qst_r_qid", "uSUvKAyuvd");
        setField(term12249, term12249.getClass(), "my_qst_r_knd", "onQLVONGuf");
        setField(term12249, term12249.getClass(), "my_qst_r_vl", "SOrEHbcbmn");
        setField(term12249, term12249.getClass(), "my_qst_r_nflg", "bnsyeQXFdu");
        setField(term12249, term12249.getClass(), "my_ccd_r_qid", "BwtdjiefJn");
        setField(term12249, term12249.getClass(), "my_ccd_r_hnd", "jDmhBrIoDa");
        setField(term12249, term12249.getClass(), "my_ccd_r_vp", "SPtPatHeOm");
        setField(term12249, term12249.getClass(), "cmd", "ywmcuThdfL");
        setField(term12249, term12249.getClass(), "req_id", "GBOEuByOfr");
        setField(term12249, term12249.getClass(), "stat", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term12249, args);
    }

};


