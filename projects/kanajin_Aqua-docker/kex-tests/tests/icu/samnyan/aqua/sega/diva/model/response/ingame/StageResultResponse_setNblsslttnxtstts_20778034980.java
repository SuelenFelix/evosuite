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

public class StageResultResponse_setNblsslttnxtstts_20778034980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56644;
     Object term56987;

    public StageResultResponse_setNblsslttnxtstts_20778034980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56644 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term56839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56844 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term56644, term56644.getClass(), "chllng_kind", 1179937517);
        setIntField(term56644, term56644.getClass(), "lv_num_old", 200150950);
        setIntField(term56644, term56644.getClass(), "lv_pnt_old", -366198044);
        setIntField(term56644, term56644.getClass(), "lv_num", -1350380769);
        setIntField(term56644, term56644.getClass(), "lv_pnt", -1432215030);
        setField(term56644, term56644.getClass(), "lv_str", "isMKwgUmka");
        setIntField(term56644, term56644.getClass(), "lv_efct_id", 1233186320);
        setIntField(term56644, term56644.getClass(), "lv_plt_id", -1303269101);
        setIntField(term56644, term56644.getClass(), "vcld_pts", 1435572720);
        setIntField(term56644, term56644.getClass(), "prsnt_vcld_pts", 1437618365);
        setIntField(term56644, term56644.getClass(), "cnp_cid", 1122535239);
        setIntField(term56644, term56644.getClass(), "cnp_val", 1158923260);
        setField(term56644, term56644.getClass(), "cnp_sp", "pDIyzhDtTy");
        setField(term56644, term56644.getClass(), "crwd_kind", "wXiUlhXQoC");
        setField(term56644, term56644.getClass(), "crwd_value", "gKhmgJzimH");
        setField(term56644, term56644.getClass(), "crwd_str_0", "OzRiWLVXNx");
        setField(term56644, term56644.getClass(), "crwd_str_1", "pktmgYsknu");
        setIntField(term56644, term56644.getClass(), "cerwd_kind", 1633508772);
        setIntField(term56644, term56644.getClass(), "cerwd_value", -545275970);
        setField(term56644, term56644.getClass(), "cerwd_str_0", "SsMHzYNeji");
        setField(term56644, term56644.getClass(), "cerwd_str_1", "wzAFLFdaEQ");
        setField(term56644, term56644.getClass(), "ttl_str_ary", "IcbBNUXJqX");
        setField(term56644, term56644.getClass(), "ttl_plt_id_ary", "LONFjqAsUp");
        setField(term56644, term56644.getClass(), "ttl_desc_ary", "tAhydlbSMf");
        setField(term56644, term56644.getClass(), "skin_id_ary", "wNYtcPFyIe");
        setField(term56644, term56644.getClass(), "skin_name_ary", "tlIqgTUSQw");
        setField(term56644, term56644.getClass(), "skin_illust_ary", "UvweyXjDhG");
        setField(term56644, term56644.getClass(), "skin_desc_ary", "wnoVhNwdJy");
        setIntField(term56644, term56644.getClass(), "pdddt_flg", 1355471365);
        setIntField(term56840, term56840.getClass(), "year", 2011);
        setShortField(term56840, term56840.getClass(), "month", (short) 4);
        setShortField(term56840, term56840.getClass(), "day", (short) 19);
        setField(term56839, term56839.getClass(), "date", term56840);
        setByteField(term56844, term56844.getClass(), "hour", (byte) 12);
        setByteField(term56844, term56844.getClass(), "minute", (byte) 0);
        setByteField(term56844, term56844.getClass(), "second", (byte) 14);
        setIntField(term56844, term56844.getClass(), "nano", 849079063);
        setField(term56839, term56839.getClass(), "time", term56844);
        setField(term56644, term56644.getClass(), "pdddt_tm", term56839);
        setIntField(term56644, term56644.getClass(), "nblss_ltt_stts", -1746962742);
        setIntField(term56644, term56644.getClass(), "nblss_ltt_tckt", -575810668);
        setIntField(term56644, term56644.getClass(), "nblss_ltt_is_opn", 256028547);
        setIntField(term56644, term56644.getClass(), "nblss_ltt_prz", -750603024);
        setIntField(term56644, term56644.getClass(), "nblss_ltt_nxt_stts", 1255234202);
        setIntField(term56644, term56644.getClass(), "nblss_ltt_nxt_tckt", -223786928);
        setField(term56644, term56644.getClass(), "my_qst_id", "uQGMBLrmAj");
        setField(term56644, term56644.getClass(), "my_qst_r_qid", "vNFaheDeBv");
        setField(term56644, term56644.getClass(), "my_qst_r_knd", "CiPMRxGoHO");
        setField(term56644, term56644.getClass(), "my_qst_r_vl", "LauKpKmenw");
        setField(term56644, term56644.getClass(), "my_qst_r_nflg", "TydzbTXvbY");
        setField(term56644, term56644.getClass(), "my_ccd_r_qid", "yNogNNecFu");
        setField(term56644, term56644.getClass(), "my_ccd_r_hnd", "tcaaotqgDF");
        setField(term56644, term56644.getClass(), "my_ccd_r_vp", "bXInWdOeyi");
        setField(term56644, term56644.getClass(), "cmd", "HdwopulXkf");
        setField(term56644, term56644.getClass(), "req_id", "FuCKfgAhpC");
        setField(term56644, term56644.getClass(), "stat", "gqMysJhxfA");
        term56987 = new Integer(1703103733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56987;
        callMethod(klass, "setNblss_ltt_nxt_stts", argTypes, term56644, args);
    }

};


