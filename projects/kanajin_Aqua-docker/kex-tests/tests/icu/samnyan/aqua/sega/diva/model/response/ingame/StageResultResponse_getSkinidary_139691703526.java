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

public class StageResultResponse_getSkinidary_139691703526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23706;

    public StageResultResponse_getSkinidary_139691703526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23706 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term23901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23906 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23706, term23706.getClass(), "chllng_kind", -1622760744);
        setIntField(term23706, term23706.getClass(), "lv_num_old", 2068435279);
        setIntField(term23706, term23706.getClass(), "lv_pnt_old", -1556527718);
        setIntField(term23706, term23706.getClass(), "lv_num", 895255351);
        setIntField(term23706, term23706.getClass(), "lv_pnt", -1317044799);
        setField(term23706, term23706.getClass(), "lv_str", "utCuuVCKqE");
        setIntField(term23706, term23706.getClass(), "lv_efct_id", -1428063820);
        setIntField(term23706, term23706.getClass(), "lv_plt_id", -1271375703);
        setIntField(term23706, term23706.getClass(), "vcld_pts", 1136208236);
        setIntField(term23706, term23706.getClass(), "prsnt_vcld_pts", -1220630391);
        setIntField(term23706, term23706.getClass(), "cnp_cid", -995822131);
        setIntField(term23706, term23706.getClass(), "cnp_val", -687282231);
        setField(term23706, term23706.getClass(), "cnp_sp", "zSfoqzJbPT");
        setField(term23706, term23706.getClass(), "crwd_kind", "QUymMnsCIj");
        setField(term23706, term23706.getClass(), "crwd_value", "ikTtOgdVYS");
        setField(term23706, term23706.getClass(), "crwd_str_0", "JptuwlirlS");
        setField(term23706, term23706.getClass(), "crwd_str_1", "TKOMaGswbU");
        setIntField(term23706, term23706.getClass(), "cerwd_kind", 1200440315);
        setIntField(term23706, term23706.getClass(), "cerwd_value", 40571662);
        setField(term23706, term23706.getClass(), "cerwd_str_0", "YcTbglHiUq");
        setField(term23706, term23706.getClass(), "cerwd_str_1", "TiUqHrjoEU");
        setField(term23706, term23706.getClass(), "ttl_str_ary", "eoEvZbdLjL");
        setField(term23706, term23706.getClass(), "ttl_plt_id_ary", "BkIxsyPkGy");
        setField(term23706, term23706.getClass(), "ttl_desc_ary", "mrMGwoRgVY");
        setField(term23706, term23706.getClass(), "skin_id_ary", "mxVLTgCwki");
        setField(term23706, term23706.getClass(), "skin_name_ary", "wCurppnDSA");
        setField(term23706, term23706.getClass(), "skin_illust_ary", "JydxSNTMYt");
        setField(term23706, term23706.getClass(), "skin_desc_ary", "KpurAcrHYT");
        setIntField(term23706, term23706.getClass(), "pdddt_flg", 1863910269);
        setIntField(term23902, term23902.getClass(), "year", 2023);
        setShortField(term23902, term23902.getClass(), "month", (short) 9);
        setShortField(term23902, term23902.getClass(), "day", (short) 23);
        setField(term23901, term23901.getClass(), "date", term23902);
        setByteField(term23906, term23906.getClass(), "hour", (byte) 12);
        setByteField(term23906, term23906.getClass(), "minute", (byte) 55);
        setByteField(term23906, term23906.getClass(), "second", (byte) 58);
        setIntField(term23906, term23906.getClass(), "nano", 159178396);
        setField(term23901, term23901.getClass(), "time", term23906);
        setField(term23706, term23706.getClass(), "pdddt_tm", term23901);
        setIntField(term23706, term23706.getClass(), "nblss_ltt_stts", 864645689);
        setIntField(term23706, term23706.getClass(), "nblss_ltt_tckt", 279384872);
        setIntField(term23706, term23706.getClass(), "nblss_ltt_is_opn", 1427305953);
        setIntField(term23706, term23706.getClass(), "nblss_ltt_prz", -781832877);
        setIntField(term23706, term23706.getClass(), "nblss_ltt_nxt_stts", 797203987);
        setIntField(term23706, term23706.getClass(), "nblss_ltt_nxt_tckt", 1973060703);
        setField(term23706, term23706.getClass(), "my_qst_id", "QjvDwgKJGz");
        setField(term23706, term23706.getClass(), "my_qst_r_qid", "ngYxiXTZrk");
        setField(term23706, term23706.getClass(), "my_qst_r_knd", "YTxBqWRAlo");
        setField(term23706, term23706.getClass(), "my_qst_r_vl", "ReruUQRXwl");
        setField(term23706, term23706.getClass(), "my_qst_r_nflg", "DWEsVQwuaE");
        setField(term23706, term23706.getClass(), "my_ccd_r_qid", "qGkNzZAeDN");
        setField(term23706, term23706.getClass(), "my_ccd_r_hnd", "wdtiuPgTVJ");
        setField(term23706, term23706.getClass(), "my_ccd_r_vp", "HUgzMgrpsK");
        setField(term23706, term23706.getClass(), "cmd", "ubaBUfLolu");
        setField(term23706, term23706.getClass(), "req_id", "itAUCFhZhq");
        setField(term23706, term23706.getClass(), "stat", "bIqaKgXgPm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkin_id_ary", argTypes, term23706, args);
    }

};


