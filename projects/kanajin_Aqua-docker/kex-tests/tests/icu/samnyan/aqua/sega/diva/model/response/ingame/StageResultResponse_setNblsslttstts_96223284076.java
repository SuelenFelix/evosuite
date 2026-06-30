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
import java.lang.Integer;

public class StageResultResponse_setNblsslttstts_96223284076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54224;
     Object term54567;

    public StageResultResponse_setNblsslttstts_96223284076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54224 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term54419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54424 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54224, term54224.getClass(), "chllng_kind", -1476037190);
        setIntField(term54224, term54224.getClass(), "lv_num_old", -718204437);
        setIntField(term54224, term54224.getClass(), "lv_pnt_old", 468974358);
        setIntField(term54224, term54224.getClass(), "lv_num", 346282818);
        setIntField(term54224, term54224.getClass(), "lv_pnt", -857876056);
        setField(term54224, term54224.getClass(), "lv_str", "EZJmAIzdHM");
        setIntField(term54224, term54224.getClass(), "lv_efct_id", 1392910876);
        setIntField(term54224, term54224.getClass(), "lv_plt_id", 1086383182);
        setIntField(term54224, term54224.getClass(), "vcld_pts", 1425319286);
        setIntField(term54224, term54224.getClass(), "prsnt_vcld_pts", 1729919228);
        setIntField(term54224, term54224.getClass(), "cnp_cid", 872351195);
        setIntField(term54224, term54224.getClass(), "cnp_val", -1664328399);
        setField(term54224, term54224.getClass(), "cnp_sp", "LAOkeXXkDr");
        setField(term54224, term54224.getClass(), "crwd_kind", "YkZqFgrgVM");
        setField(term54224, term54224.getClass(), "crwd_value", "QEJBgSNviH");
        setField(term54224, term54224.getClass(), "crwd_str_0", "bjigisSVNp");
        setField(term54224, term54224.getClass(), "crwd_str_1", "yJCCaWqQuK");
        setIntField(term54224, term54224.getClass(), "cerwd_kind", 1422430512);
        setIntField(term54224, term54224.getClass(), "cerwd_value", 1796581482);
        setField(term54224, term54224.getClass(), "cerwd_str_0", "tgBNqkdndl");
        setField(term54224, term54224.getClass(), "cerwd_str_1", "GXKhRJLVFZ");
        setField(term54224, term54224.getClass(), "ttl_str_ary", "qDflhZTJjR");
        setField(term54224, term54224.getClass(), "ttl_plt_id_ary", "bzQSjpIauE");
        setField(term54224, term54224.getClass(), "ttl_desc_ary", "ESQqarFUtp");
        setField(term54224, term54224.getClass(), "skin_id_ary", "TiCRQbKtcf");
        setField(term54224, term54224.getClass(), "skin_name_ary", "shGEZulpDG");
        setField(term54224, term54224.getClass(), "skin_illust_ary", "twDnEqZglX");
        setField(term54224, term54224.getClass(), "skin_desc_ary", "TWzZFATLAj");
        setIntField(term54224, term54224.getClass(), "pdddt_flg", 1286440081);
        setIntField(term54420, term54420.getClass(), "year", 2011);
        setShortField(term54420, term54420.getClass(), "month", (short) 8);
        setShortField(term54420, term54420.getClass(), "day", (short) 1);
        setField(term54419, term54419.getClass(), "date", term54420);
        setByteField(term54424, term54424.getClass(), "hour", (byte) 7);
        setByteField(term54424, term54424.getClass(), "minute", (byte) 2);
        setByteField(term54424, term54424.getClass(), "second", (byte) 46);
        setIntField(term54424, term54424.getClass(), "nano", 187178462);
        setField(term54419, term54419.getClass(), "time", term54424);
        setField(term54224, term54224.getClass(), "pdddt_tm", term54419);
        setIntField(term54224, term54224.getClass(), "nblss_ltt_stts", -928538452);
        setIntField(term54224, term54224.getClass(), "nblss_ltt_tckt", -1313207353);
        setIntField(term54224, term54224.getClass(), "nblss_ltt_is_opn", 402612318);
        setIntField(term54224, term54224.getClass(), "nblss_ltt_prz", -1628481565);
        setIntField(term54224, term54224.getClass(), "nblss_ltt_nxt_stts", -217226756);
        setIntField(term54224, term54224.getClass(), "nblss_ltt_nxt_tckt", 1608000247);
        setField(term54224, term54224.getClass(), "my_qst_id", "QjsqHrtVMY");
        setField(term54224, term54224.getClass(), "my_qst_r_qid", "PlQZGGhnZK");
        setField(term54224, term54224.getClass(), "my_qst_r_knd", "sTtLCWDEPO");
        setField(term54224, term54224.getClass(), "my_qst_r_vl", "UGMtNRjhnC");
        setField(term54224, term54224.getClass(), "my_qst_r_nflg", "oTnPmmIphJ");
        setField(term54224, term54224.getClass(), "my_ccd_r_qid", "vTgJolwQXF");
        setField(term54224, term54224.getClass(), "my_ccd_r_hnd", "QuNSfeKtAH");
        setField(term54224, term54224.getClass(), "my_ccd_r_vp", "vFhRdscfFA");
        setField(term54224, term54224.getClass(), "cmd", "ZmfocrvaII");
        setField(term54224, term54224.getClass(), "req_id", "LTbQXrGKuA");
        setField(term54224, term54224.getClass(), "stat", "gzmGmDALUv");
        term54567 = new Integer(1354560887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54567;
        callMethod(klass, "setNblss_ltt_stts", argTypes, term54224, args);
    }

};


