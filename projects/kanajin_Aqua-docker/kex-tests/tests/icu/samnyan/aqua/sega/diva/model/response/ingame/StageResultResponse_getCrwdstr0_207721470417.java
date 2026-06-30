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

public class StageResultResponse_getCrwdstr0_207721470417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18279;

    public StageResultResponse_getCrwdstr0_207721470417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18279 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term18474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18479 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18279, term18279.getClass(), "chllng_kind", 719656595);
        setIntField(term18279, term18279.getClass(), "lv_num_old", -1516995753);
        setIntField(term18279, term18279.getClass(), "lv_pnt_old", -390501023);
        setIntField(term18279, term18279.getClass(), "lv_num", -1667482829);
        setIntField(term18279, term18279.getClass(), "lv_pnt", 1116576792);
        setField(term18279, term18279.getClass(), "lv_str", "ktbqerIaKW");
        setIntField(term18279, term18279.getClass(), "lv_efct_id", -942194446);
        setIntField(term18279, term18279.getClass(), "lv_plt_id", -938508470);
        setIntField(term18279, term18279.getClass(), "vcld_pts", 1242676024);
        setIntField(term18279, term18279.getClass(), "prsnt_vcld_pts", -1865023308);
        setIntField(term18279, term18279.getClass(), "cnp_cid", 1698510819);
        setIntField(term18279, term18279.getClass(), "cnp_val", -1553893255);
        setField(term18279, term18279.getClass(), "cnp_sp", "VoghngXfsK");
        setField(term18279, term18279.getClass(), "crwd_kind", "GbahCBMvct");
        setField(term18279, term18279.getClass(), "crwd_value", "iiHBhsNFgk");
        setField(term18279, term18279.getClass(), "crwd_str_0", "HknsTajwxJ");
        setField(term18279, term18279.getClass(), "crwd_str_1", "XtiurrVYKw");
        setIntField(term18279, term18279.getClass(), "cerwd_kind", 1303442927);
        setIntField(term18279, term18279.getClass(), "cerwd_value", 794568325);
        setField(term18279, term18279.getClass(), "cerwd_str_0", "rsumfoDNHa");
        setField(term18279, term18279.getClass(), "cerwd_str_1", "ceCWHUTQUM");
        setField(term18279, term18279.getClass(), "ttl_str_ary", "LrqwfrKKtS");
        setField(term18279, term18279.getClass(), "ttl_plt_id_ary", "ZUdnQXfzCI");
        setField(term18279, term18279.getClass(), "ttl_desc_ary", "EULDrUNQvw");
        setField(term18279, term18279.getClass(), "skin_id_ary", "BtvAvsJSei");
        setField(term18279, term18279.getClass(), "skin_name_ary", "vqnBkkxoIa");
        setField(term18279, term18279.getClass(), "skin_illust_ary", "bycpZjxXFn");
        setField(term18279, term18279.getClass(), "skin_desc_ary", "jQWttOAiwL");
        setIntField(term18279, term18279.getClass(), "pdddt_flg", -434468428);
        setIntField(term18475, term18475.getClass(), "year", 2015);
        setShortField(term18475, term18475.getClass(), "month", (short) 9);
        setShortField(term18475, term18475.getClass(), "day", (short) 16);
        setField(term18474, term18474.getClass(), "date", term18475);
        setByteField(term18479, term18479.getClass(), "hour", (byte) 6);
        setByteField(term18479, term18479.getClass(), "minute", (byte) 19);
        setByteField(term18479, term18479.getClass(), "second", (byte) 42);
        setIntField(term18479, term18479.getClass(), "nano", 630084975);
        setField(term18474, term18474.getClass(), "time", term18479);
        setField(term18279, term18279.getClass(), "pdddt_tm", term18474);
        setIntField(term18279, term18279.getClass(), "nblss_ltt_stts", 1559605714);
        setIntField(term18279, term18279.getClass(), "nblss_ltt_tckt", 1146601902);
        setIntField(term18279, term18279.getClass(), "nblss_ltt_is_opn", -1938881385);
        setIntField(term18279, term18279.getClass(), "nblss_ltt_prz", -1629418973);
        setIntField(term18279, term18279.getClass(), "nblss_ltt_nxt_stts", -100825168);
        setIntField(term18279, term18279.getClass(), "nblss_ltt_nxt_tckt", 768407648);
        setField(term18279, term18279.getClass(), "my_qst_id", "DzKFxEuEEC");
        setField(term18279, term18279.getClass(), "my_qst_r_qid", "CAMnvfDLJL");
        setField(term18279, term18279.getClass(), "my_qst_r_knd", "mfHtgSbdjD");
        setField(term18279, term18279.getClass(), "my_qst_r_vl", "cmuaUiHMVL");
        setField(term18279, term18279.getClass(), "my_qst_r_nflg", "xjoSGPWUgu");
        setField(term18279, term18279.getClass(), "my_ccd_r_qid", "uzmqjnOUXu");
        setField(term18279, term18279.getClass(), "my_ccd_r_hnd", "xeyjTOCOJb");
        setField(term18279, term18279.getClass(), "my_ccd_r_vp", "DGRqjjdhzy");
        setField(term18279, term18279.getClass(), "cmd", "lQFkjJUPAR");
        setField(term18279, term18279.getClass(), "req_id", "BsuVlGUUjV");
        setField(term18279, term18279.getClass(), "stat", "bHHjfDCntT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrwd_str_0", argTypes, term18279, args);
    }

};


