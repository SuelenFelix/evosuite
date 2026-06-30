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

public class StageResultResponse_getMyccdrqid_144053043043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33957;

    public StageResultResponse_getMyccdrqid_144053043043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33957 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term34152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34157 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33957, term33957.getClass(), "chllng_kind", -1716046610);
        setIntField(term33957, term33957.getClass(), "lv_num_old", 65264024);
        setIntField(term33957, term33957.getClass(), "lv_pnt_old", -252449812);
        setIntField(term33957, term33957.getClass(), "lv_num", -1885268968);
        setIntField(term33957, term33957.getClass(), "lv_pnt", 277855691);
        setField(term33957, term33957.getClass(), "lv_str", "pHBHlmLIZQ");
        setIntField(term33957, term33957.getClass(), "lv_efct_id", 675891483);
        setIntField(term33957, term33957.getClass(), "lv_plt_id", -317900470);
        setIntField(term33957, term33957.getClass(), "vcld_pts", -979568);
        setIntField(term33957, term33957.getClass(), "prsnt_vcld_pts", -1422131197);
        setIntField(term33957, term33957.getClass(), "cnp_cid", -20399281);
        setIntField(term33957, term33957.getClass(), "cnp_val", -830170410);
        setField(term33957, term33957.getClass(), "cnp_sp", "ZWRAbOuktl");
        setField(term33957, term33957.getClass(), "crwd_kind", "iqFRvFmVID");
        setField(term33957, term33957.getClass(), "crwd_value", "pNAEtppZdv");
        setField(term33957, term33957.getClass(), "crwd_str_0", "VsFWNMdyRt");
        setField(term33957, term33957.getClass(), "crwd_str_1", "QaoYFZhScg");
        setIntField(term33957, term33957.getClass(), "cerwd_kind", -1742790308);
        setIntField(term33957, term33957.getClass(), "cerwd_value", -1592093430);
        setField(term33957, term33957.getClass(), "cerwd_str_0", "UTvXIenLCR");
        setField(term33957, term33957.getClass(), "cerwd_str_1", "PLeKpWaxhQ");
        setField(term33957, term33957.getClass(), "ttl_str_ary", "EBSKhqDdUW");
        setField(term33957, term33957.getClass(), "ttl_plt_id_ary", "LvLbdICdfA");
        setField(term33957, term33957.getClass(), "ttl_desc_ary", "rtifrlITwl");
        setField(term33957, term33957.getClass(), "skin_id_ary", "yGWXZDjnPS");
        setField(term33957, term33957.getClass(), "skin_name_ary", "vZucxbGVyo");
        setField(term33957, term33957.getClass(), "skin_illust_ary", "ZZoLNbeORl");
        setField(term33957, term33957.getClass(), "skin_desc_ary", "XjIOUIzJUP");
        setIntField(term33957, term33957.getClass(), "pdddt_flg", 1178214545);
        setIntField(term34153, term34153.getClass(), "year", 2020);
        setShortField(term34153, term34153.getClass(), "month", (short) 8);
        setShortField(term34153, term34153.getClass(), "day", (short) 15);
        setField(term34152, term34152.getClass(), "date", term34153);
        setByteField(term34157, term34157.getClass(), "hour", (byte) 2);
        setByteField(term34157, term34157.getClass(), "minute", (byte) 0);
        setByteField(term34157, term34157.getClass(), "second", (byte) 38);
        setIntField(term34157, term34157.getClass(), "nano", 146431486);
        setField(term34152, term34152.getClass(), "time", term34157);
        setField(term33957, term33957.getClass(), "pdddt_tm", term34152);
        setIntField(term33957, term33957.getClass(), "nblss_ltt_stts", -985334541);
        setIntField(term33957, term33957.getClass(), "nblss_ltt_tckt", -1870004228);
        setIntField(term33957, term33957.getClass(), "nblss_ltt_is_opn", 380484139);
        setIntField(term33957, term33957.getClass(), "nblss_ltt_prz", 1822317628);
        setIntField(term33957, term33957.getClass(), "nblss_ltt_nxt_stts", -608830309);
        setIntField(term33957, term33957.getClass(), "nblss_ltt_nxt_tckt", -537786484);
        setField(term33957, term33957.getClass(), "my_qst_id", "iGTpXnnTqB");
        setField(term33957, term33957.getClass(), "my_qst_r_qid", "XgJzBOYfQB");
        setField(term33957, term33957.getClass(), "my_qst_r_knd", "GAPGgDekVG");
        setField(term33957, term33957.getClass(), "my_qst_r_vl", "WmTogHwGLE");
        setField(term33957, term33957.getClass(), "my_qst_r_nflg", "qYOIXsGycY");
        setField(term33957, term33957.getClass(), "my_ccd_r_qid", "sJNXNshRLe");
        setField(term33957, term33957.getClass(), "my_ccd_r_hnd", "AYnbmgRCKr");
        setField(term33957, term33957.getClass(), "my_ccd_r_vp", "iQRfDlaoYD");
        setField(term33957, term33957.getClass(), "cmd", "kpcyrjDQzN");
        setField(term33957, term33957.getClass(), "req_id", "IyukykAHLQ");
        setField(term33957, term33957.getClass(), "stat", "CwZcgFJqMh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_ccd_r_qid", argTypes, term33957, args);
    }

};


