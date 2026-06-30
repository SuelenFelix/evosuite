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

public class StageResultResponse_getMyqstrvl_147098573641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32751;

    public StageResultResponse_getMyqstrvl_147098573641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32751 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term32946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32951 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32751, term32751.getClass(), "chllng_kind", -407582855);
        setIntField(term32751, term32751.getClass(), "lv_num_old", 1190753616);
        setIntField(term32751, term32751.getClass(), "lv_pnt_old", -752378450);
        setIntField(term32751, term32751.getClass(), "lv_num", 848907965);
        setIntField(term32751, term32751.getClass(), "lv_pnt", 1865070548);
        setField(term32751, term32751.getClass(), "lv_str", "pLbTzSMbsN");
        setIntField(term32751, term32751.getClass(), "lv_efct_id", 1904515443);
        setIntField(term32751, term32751.getClass(), "lv_plt_id", 1361126430);
        setIntField(term32751, term32751.getClass(), "vcld_pts", 1728588701);
        setIntField(term32751, term32751.getClass(), "prsnt_vcld_pts", -355769268);
        setIntField(term32751, term32751.getClass(), "cnp_cid", -114460662);
        setIntField(term32751, term32751.getClass(), "cnp_val", -355376034);
        setField(term32751, term32751.getClass(), "cnp_sp", "lFSbxerCPP");
        setField(term32751, term32751.getClass(), "crwd_kind", "vjaZIyixCm");
        setField(term32751, term32751.getClass(), "crwd_value", "gAAPyftlIR");
        setField(term32751, term32751.getClass(), "crwd_str_0", "kevWstoxwq");
        setField(term32751, term32751.getClass(), "crwd_str_1", "aSYOhFwzSm");
        setIntField(term32751, term32751.getClass(), "cerwd_kind", 588390599);
        setIntField(term32751, term32751.getClass(), "cerwd_value", -95969566);
        setField(term32751, term32751.getClass(), "cerwd_str_0", "pVZlzrBeDB");
        setField(term32751, term32751.getClass(), "cerwd_str_1", "EfSUvjuZAA");
        setField(term32751, term32751.getClass(), "ttl_str_ary", "PrHWfHydsG");
        setField(term32751, term32751.getClass(), "ttl_plt_id_ary", "igruEzTbBE");
        setField(term32751, term32751.getClass(), "ttl_desc_ary", "LFjgROsRUV");
        setField(term32751, term32751.getClass(), "skin_id_ary", "kHxujKiCsr");
        setField(term32751, term32751.getClass(), "skin_name_ary", "cseZveWowm");
        setField(term32751, term32751.getClass(), "skin_illust_ary", "idfslIPhgx");
        setField(term32751, term32751.getClass(), "skin_desc_ary", "HyFLOXeoDX");
        setIntField(term32751, term32751.getClass(), "pdddt_flg", -68615285);
        setIntField(term32947, term32947.getClass(), "year", 2015);
        setShortField(term32947, term32947.getClass(), "month", (short) 12);
        setShortField(term32947, term32947.getClass(), "day", (short) 23);
        setField(term32946, term32946.getClass(), "date", term32947);
        setByteField(term32951, term32951.getClass(), "hour", (byte) 14);
        setByteField(term32951, term32951.getClass(), "minute", (byte) 17);
        setByteField(term32951, term32951.getClass(), "second", (byte) 50);
        setIntField(term32951, term32951.getClass(), "nano", 325544804);
        setField(term32946, term32946.getClass(), "time", term32951);
        setField(term32751, term32751.getClass(), "pdddt_tm", term32946);
        setIntField(term32751, term32751.getClass(), "nblss_ltt_stts", -337504086);
        setIntField(term32751, term32751.getClass(), "nblss_ltt_tckt", 2074130991);
        setIntField(term32751, term32751.getClass(), "nblss_ltt_is_opn", 532588266);
        setIntField(term32751, term32751.getClass(), "nblss_ltt_prz", -1286686332);
        setIntField(term32751, term32751.getClass(), "nblss_ltt_nxt_stts", -284885486);
        setIntField(term32751, term32751.getClass(), "nblss_ltt_nxt_tckt", 1791984446);
        setField(term32751, term32751.getClass(), "my_qst_id", "crkNabVaWs");
        setField(term32751, term32751.getClass(), "my_qst_r_qid", "qBcAJgrABE");
        setField(term32751, term32751.getClass(), "my_qst_r_knd", "JKdZuLFRwC");
        setField(term32751, term32751.getClass(), "my_qst_r_vl", "hfhLLoWnRU");
        setField(term32751, term32751.getClass(), "my_qst_r_nflg", "RpofnOPYha");
        setField(term32751, term32751.getClass(), "my_ccd_r_qid", "CQYmAsjvPU");
        setField(term32751, term32751.getClass(), "my_ccd_r_hnd", "NNkIIFpxiB");
        setField(term32751, term32751.getClass(), "my_ccd_r_vp", "sBmtvFPDso");
        setField(term32751, term32751.getClass(), "cmd", "qsUIxrLolr");
        setField(term32751, term32751.getClass(), "req_id", "IlQxArYcgB");
        setField(term32751, term32751.getClass(), "stat", "lIgKCvCuoH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_r_vl", argTypes, term32751, args);
    }

};


