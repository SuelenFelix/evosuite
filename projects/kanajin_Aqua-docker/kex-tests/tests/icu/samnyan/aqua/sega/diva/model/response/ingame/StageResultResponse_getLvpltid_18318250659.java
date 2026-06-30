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

public class StageResultResponse_getLvpltid_18318250659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13455;

    public StageResultResponse_getLvpltid_18318250659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13455 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term13650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13655 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13455, term13455.getClass(), "chllng_kind", -1214628358);
        setIntField(term13455, term13455.getClass(), "lv_num_old", 1102721075);
        setIntField(term13455, term13455.getClass(), "lv_pnt_old", -426764678);
        setIntField(term13455, term13455.getClass(), "lv_num", -1222614956);
        setIntField(term13455, term13455.getClass(), "lv_pnt", -1870495012);
        setField(term13455, term13455.getClass(), "lv_str", "vLerpqavFM");
        setIntField(term13455, term13455.getClass(), "lv_efct_id", -1310015129);
        setIntField(term13455, term13455.getClass(), "lv_plt_id", -2104981311);
        setIntField(term13455, term13455.getClass(), "vcld_pts", -571169753);
        setIntField(term13455, term13455.getClass(), "prsnt_vcld_pts", 318591690);
        setIntField(term13455, term13455.getClass(), "cnp_cid", -165587447);
        setIntField(term13455, term13455.getClass(), "cnp_val", -1347358701);
        setField(term13455, term13455.getClass(), "cnp_sp", "qnvxzwuGKX");
        setField(term13455, term13455.getClass(), "crwd_kind", "EdPAvpluZg");
        setField(term13455, term13455.getClass(), "crwd_value", "DzHVBMqWtE");
        setField(term13455, term13455.getClass(), "crwd_str_0", "THZSpzBRYP");
        setField(term13455, term13455.getClass(), "crwd_str_1", "ZfBIVGBQOE");
        setIntField(term13455, term13455.getClass(), "cerwd_kind", 806595993);
        setIntField(term13455, term13455.getClass(), "cerwd_value", 548228925);
        setField(term13455, term13455.getClass(), "cerwd_str_0", "QSrDQfEsTR");
        setField(term13455, term13455.getClass(), "cerwd_str_1", "PsqusYmejD");
        setField(term13455, term13455.getClass(), "ttl_str_ary", "NTWMiBEaDF");
        setField(term13455, term13455.getClass(), "ttl_plt_id_ary", "SPBstwKFVr");
        setField(term13455, term13455.getClass(), "ttl_desc_ary", "WxYUTuqmIq");
        setField(term13455, term13455.getClass(), "skin_id_ary", "OeQLvhVERT");
        setField(term13455, term13455.getClass(), "skin_name_ary", "IlvgFINwIa");
        setField(term13455, term13455.getClass(), "skin_illust_ary", "GEJABPlHSI");
        setField(term13455, term13455.getClass(), "skin_desc_ary", "aQFUvuaYxd");
        setIntField(term13455, term13455.getClass(), "pdddt_flg", -749861210);
        setIntField(term13651, term13651.getClass(), "year", 2029);
        setShortField(term13651, term13651.getClass(), "month", (short) 8);
        setShortField(term13651, term13651.getClass(), "day", (short) 29);
        setField(term13650, term13650.getClass(), "date", term13651);
        setByteField(term13655, term13655.getClass(), "hour", (byte) 15);
        setByteField(term13655, term13655.getClass(), "minute", (byte) 50);
        setByteField(term13655, term13655.getClass(), "second", (byte) 1);
        setIntField(term13655, term13655.getClass(), "nano", 277971904);
        setField(term13650, term13650.getClass(), "time", term13655);
        setField(term13455, term13455.getClass(), "pdddt_tm", term13650);
        setIntField(term13455, term13455.getClass(), "nblss_ltt_stts", 1694224101);
        setIntField(term13455, term13455.getClass(), "nblss_ltt_tckt", 937859191);
        setIntField(term13455, term13455.getClass(), "nblss_ltt_is_opn", -916584829);
        setIntField(term13455, term13455.getClass(), "nblss_ltt_prz", -2131181468);
        setIntField(term13455, term13455.getClass(), "nblss_ltt_nxt_stts", 282916351);
        setIntField(term13455, term13455.getClass(), "nblss_ltt_nxt_tckt", 880977281);
        setField(term13455, term13455.getClass(), "my_qst_id", "zNFLXMifnS");
        setField(term13455, term13455.getClass(), "my_qst_r_qid", "HHQcYMSBVc");
        setField(term13455, term13455.getClass(), "my_qst_r_knd", "wdoqITnaAP");
        setField(term13455, term13455.getClass(), "my_qst_r_vl", "rIPMBcrNqB");
        setField(term13455, term13455.getClass(), "my_qst_r_nflg", "UDaboHZHhz");
        setField(term13455, term13455.getClass(), "my_ccd_r_qid", "nRvKihUSPj");
        setField(term13455, term13455.getClass(), "my_ccd_r_hnd", "BbNeQJpYPr");
        setField(term13455, term13455.getClass(), "my_ccd_r_vp", "riMtzCoxNj");
        setField(term13455, term13455.getClass(), "cmd", "YAXkVjQZcV");
        setField(term13455, term13455.getClass(), "req_id", "pumvwBWvpy");
        setField(term13455, term13455.getClass(), "stat", "HwLHeGLyhe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_plt_id", argTypes, term13455, args);
    }

};


