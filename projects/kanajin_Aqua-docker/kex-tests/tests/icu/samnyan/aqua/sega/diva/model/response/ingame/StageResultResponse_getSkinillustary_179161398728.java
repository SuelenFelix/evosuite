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

public class StageResultResponse_getSkinillustary_179161398728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24912;

    public StageResultResponse_getSkinillustary_179161398728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24912 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term25107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25112 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24912, term24912.getClass(), "chllng_kind", -1972033388);
        setIntField(term24912, term24912.getClass(), "lv_num_old", -1005024758);
        setIntField(term24912, term24912.getClass(), "lv_pnt_old", 2634669);
        setIntField(term24912, term24912.getClass(), "lv_num", -1912429941);
        setIntField(term24912, term24912.getClass(), "lv_pnt", 1801052257);
        setField(term24912, term24912.getClass(), "lv_str", "MGorMVGauT");
        setIntField(term24912, term24912.getClass(), "lv_efct_id", -2110556060);
        setIntField(term24912, term24912.getClass(), "lv_plt_id", 313459791);
        setIntField(term24912, term24912.getClass(), "vcld_pts", 752615112);
        setIntField(term24912, term24912.getClass(), "prsnt_vcld_pts", -1674430871);
        setIntField(term24912, term24912.getClass(), "cnp_cid", 794352120);
        setIntField(term24912, term24912.getClass(), "cnp_val", 340719678);
        setField(term24912, term24912.getClass(), "cnp_sp", "jXKxUGTuEF");
        setField(term24912, term24912.getClass(), "crwd_kind", "nDCcyhiTnS");
        setField(term24912, term24912.getClass(), "crwd_value", "Bcivwcjece");
        setField(term24912, term24912.getClass(), "crwd_str_0", "QTefjRuiez");
        setField(term24912, term24912.getClass(), "crwd_str_1", "SQZVNkAVBB");
        setIntField(term24912, term24912.getClass(), "cerwd_kind", 299791142);
        setIntField(term24912, term24912.getClass(), "cerwd_value", 1862191391);
        setField(term24912, term24912.getClass(), "cerwd_str_0", "mrSAYJlddZ");
        setField(term24912, term24912.getClass(), "cerwd_str_1", "KbwxawvYsw");
        setField(term24912, term24912.getClass(), "ttl_str_ary", "gvjdfHNzOa");
        setField(term24912, term24912.getClass(), "ttl_plt_id_ary", "HqitWglYWX");
        setField(term24912, term24912.getClass(), "ttl_desc_ary", "pOuFRlHmbK");
        setField(term24912, term24912.getClass(), "skin_id_ary", "WrzdBkinqV");
        setField(term24912, term24912.getClass(), "skin_name_ary", "vydWXHfFTw");
        setField(term24912, term24912.getClass(), "skin_illust_ary", "DRhkpDneCC");
        setField(term24912, term24912.getClass(), "skin_desc_ary", "vuIJRrypuA");
        setIntField(term24912, term24912.getClass(), "pdddt_flg", 1131398807);
        setIntField(term25108, term25108.getClass(), "year", 2027);
        setShortField(term25108, term25108.getClass(), "month", (short) 2);
        setShortField(term25108, term25108.getClass(), "day", (short) 19);
        setField(term25107, term25107.getClass(), "date", term25108);
        setByteField(term25112, term25112.getClass(), "hour", (byte) 17);
        setByteField(term25112, term25112.getClass(), "minute", (byte) 37);
        setByteField(term25112, term25112.getClass(), "second", (byte) 27);
        setIntField(term25112, term25112.getClass(), "nano", 920380537);
        setField(term25107, term25107.getClass(), "time", term25112);
        setField(term24912, term24912.getClass(), "pdddt_tm", term25107);
        setIntField(term24912, term24912.getClass(), "nblss_ltt_stts", -344907703);
        setIntField(term24912, term24912.getClass(), "nblss_ltt_tckt", 824341437);
        setIntField(term24912, term24912.getClass(), "nblss_ltt_is_opn", -1794965320);
        setIntField(term24912, term24912.getClass(), "nblss_ltt_prz", 520504102);
        setIntField(term24912, term24912.getClass(), "nblss_ltt_nxt_stts", -457396133);
        setIntField(term24912, term24912.getClass(), "nblss_ltt_nxt_tckt", -1793950607);
        setField(term24912, term24912.getClass(), "my_qst_id", "AxfSZmaiyA");
        setField(term24912, term24912.getClass(), "my_qst_r_qid", "lBpveIKbea");
        setField(term24912, term24912.getClass(), "my_qst_r_knd", "uyLBVQYcOV");
        setField(term24912, term24912.getClass(), "my_qst_r_vl", "PoTZjDuBHa");
        setField(term24912, term24912.getClass(), "my_qst_r_nflg", "MIwvgVrhzP");
        setField(term24912, term24912.getClass(), "my_ccd_r_qid", "HcUUieXdep");
        setField(term24912, term24912.getClass(), "my_ccd_r_hnd", "AbonCTtbef");
        setField(term24912, term24912.getClass(), "my_ccd_r_vp", "maXrGOGoKA");
        setField(term24912, term24912.getClass(), "cmd", "zAkgWQVCpM");
        setField(term24912, term24912.getClass(), "req_id", "yQUDyOroXU");
        setField(term24912, term24912.getClass(), "stat", "xweqkPdyJH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkin_illust_ary", argTypes, term24912, args);
    }

};


