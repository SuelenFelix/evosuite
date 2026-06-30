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

public class StageResultResponse_setCerwdkind_134058095663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46171;
     Object term46514;

    public StageResultResponse_setCerwdkind_134058095663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46171 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term46366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46371 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46171, term46171.getClass(), "chllng_kind", -777833461);
        setIntField(term46171, term46171.getClass(), "lv_num_old", 1583691829);
        setIntField(term46171, term46171.getClass(), "lv_pnt_old", -1468541076);
        setIntField(term46171, term46171.getClass(), "lv_num", -1796760393);
        setIntField(term46171, term46171.getClass(), "lv_pnt", -2099267271);
        setField(term46171, term46171.getClass(), "lv_str", "xdYuLllgpn");
        setIntField(term46171, term46171.getClass(), "lv_efct_id", 1134565344);
        setIntField(term46171, term46171.getClass(), "lv_plt_id", -1747434000);
        setIntField(term46171, term46171.getClass(), "vcld_pts", 1611620166);
        setIntField(term46171, term46171.getClass(), "prsnt_vcld_pts", 249657454);
        setIntField(term46171, term46171.getClass(), "cnp_cid", 1734630901);
        setIntField(term46171, term46171.getClass(), "cnp_val", -703815246);
        setField(term46171, term46171.getClass(), "cnp_sp", "ayonlqalLA");
        setField(term46171, term46171.getClass(), "crwd_kind", "fzzIOVxKdF");
        setField(term46171, term46171.getClass(), "crwd_value", "cdvmxZaBEK");
        setField(term46171, term46171.getClass(), "crwd_str_0", "QHYZiyDyPC");
        setField(term46171, term46171.getClass(), "crwd_str_1", "kcHMyiheuH");
        setIntField(term46171, term46171.getClass(), "cerwd_kind", 157300746);
        setIntField(term46171, term46171.getClass(), "cerwd_value", -1600748613);
        setField(term46171, term46171.getClass(), "cerwd_str_0", "DGMBBNDEYs");
        setField(term46171, term46171.getClass(), "cerwd_str_1", "vpuKZSMmKQ");
        setField(term46171, term46171.getClass(), "ttl_str_ary", "IXQQwaXITf");
        setField(term46171, term46171.getClass(), "ttl_plt_id_ary", "fNzFTiRCjp");
        setField(term46171, term46171.getClass(), "ttl_desc_ary", "yaCGGogKro");
        setField(term46171, term46171.getClass(), "skin_id_ary", "qxrRUnjshF");
        setField(term46171, term46171.getClass(), "skin_name_ary", "WmVcapKAeJ");
        setField(term46171, term46171.getClass(), "skin_illust_ary", "jevOVdQdpc");
        setField(term46171, term46171.getClass(), "skin_desc_ary", "TLLVSGTNsz");
        setIntField(term46171, term46171.getClass(), "pdddt_flg", -1509192782);
        setIntField(term46367, term46367.getClass(), "year", 2016);
        setShortField(term46367, term46367.getClass(), "month", (short) 10);
        setShortField(term46367, term46367.getClass(), "day", (short) 20);
        setField(term46366, term46366.getClass(), "date", term46367);
        setByteField(term46371, term46371.getClass(), "hour", (byte) 18);
        setByteField(term46371, term46371.getClass(), "minute", (byte) 39);
        setByteField(term46371, term46371.getClass(), "second", (byte) 1);
        setIntField(term46371, term46371.getClass(), "nano", 196253988);
        setField(term46366, term46366.getClass(), "time", term46371);
        setField(term46171, term46171.getClass(), "pdddt_tm", term46366);
        setIntField(term46171, term46171.getClass(), "nblss_ltt_stts", -867925573);
        setIntField(term46171, term46171.getClass(), "nblss_ltt_tckt", 478422495);
        setIntField(term46171, term46171.getClass(), "nblss_ltt_is_opn", 1727771237);
        setIntField(term46171, term46171.getClass(), "nblss_ltt_prz", 2033663549);
        setIntField(term46171, term46171.getClass(), "nblss_ltt_nxt_stts", 1766479154);
        setIntField(term46171, term46171.getClass(), "nblss_ltt_nxt_tckt", 533171496);
        setField(term46171, term46171.getClass(), "my_qst_id", "mbBWfaHCrP");
        setField(term46171, term46171.getClass(), "my_qst_r_qid", "wFyiZloCxg");
        setField(term46171, term46171.getClass(), "my_qst_r_knd", "xYztJEIPWy");
        setField(term46171, term46171.getClass(), "my_qst_r_vl", "TDQIAXaJru");
        setField(term46171, term46171.getClass(), "my_qst_r_nflg", "frPMFqGmrE");
        setField(term46171, term46171.getClass(), "my_ccd_r_qid", "DvfOYWcNBN");
        setField(term46171, term46171.getClass(), "my_ccd_r_hnd", "cvbvwpPlNk");
        setField(term46171, term46171.getClass(), "my_ccd_r_vp", "uCdLbhvYeG");
        setField(term46171, term46171.getClass(), "cmd", "ipoyEHBfoG");
        setField(term46171, term46171.getClass(), "req_id", "iSBTpbiteU");
        setField(term46171, term46171.getClass(), "stat", "MTwFbEoMZj");
        term46514 = new Integer(1369020869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46514;
        callMethod(klass, "setCerwd_kind", argTypes, term46171, args);
    }

};


