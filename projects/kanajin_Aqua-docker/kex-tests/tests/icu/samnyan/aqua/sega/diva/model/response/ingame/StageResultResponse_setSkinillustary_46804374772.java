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

public class StageResultResponse_setSkinillustary_46804374772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51756;

    public StageResultResponse_setSkinillustary_46804374772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51756 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term51951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51956 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51756, term51756.getClass(), "chllng_kind", -1440013173);
        setIntField(term51756, term51756.getClass(), "lv_num_old", -288126597);
        setIntField(term51756, term51756.getClass(), "lv_pnt_old", -218831961);
        setIntField(term51756, term51756.getClass(), "lv_num", 826765055);
        setIntField(term51756, term51756.getClass(), "lv_pnt", 1358117317);
        setField(term51756, term51756.getClass(), "lv_str", "VsizBWhPWL");
        setIntField(term51756, term51756.getClass(), "lv_efct_id", 229989439);
        setIntField(term51756, term51756.getClass(), "lv_plt_id", -1620126913);
        setIntField(term51756, term51756.getClass(), "vcld_pts", -1095121979);
        setIntField(term51756, term51756.getClass(), "prsnt_vcld_pts", -1674851914);
        setIntField(term51756, term51756.getClass(), "cnp_cid", -1891353352);
        setIntField(term51756, term51756.getClass(), "cnp_val", 113007640);
        setField(term51756, term51756.getClass(), "cnp_sp", "jAFSxnVMcD");
        setField(term51756, term51756.getClass(), "crwd_kind", "BuNQAVaNCe");
        setField(term51756, term51756.getClass(), "crwd_value", "iaYiUQnOLD");
        setField(term51756, term51756.getClass(), "crwd_str_0", "upnleTLVdf");
        setField(term51756, term51756.getClass(), "crwd_str_1", "pvjlKAnxzJ");
        setIntField(term51756, term51756.getClass(), "cerwd_kind", 1782226794);
        setIntField(term51756, term51756.getClass(), "cerwd_value", 1115327577);
        setField(term51756, term51756.getClass(), "cerwd_str_0", "ejxUBDQQKB");
        setField(term51756, term51756.getClass(), "cerwd_str_1", "IbOvZLmtSE");
        setField(term51756, term51756.getClass(), "ttl_str_ary", "AOsIglRFcp");
        setField(term51756, term51756.getClass(), "ttl_plt_id_ary", "bdONLhBZoA");
        setField(term51756, term51756.getClass(), "ttl_desc_ary", "qPVeRcolUe");
        setField(term51756, term51756.getClass(), "skin_id_ary", "AscZyfQFkU");
        setField(term51756, term51756.getClass(), "skin_name_ary", "nPfruizWey");
        setField(term51756, term51756.getClass(), "skin_illust_ary", "RvgkUqMUFX");
        setField(term51756, term51756.getClass(), "skin_desc_ary", "nOqmldTbXj");
        setIntField(term51756, term51756.getClass(), "pdddt_flg", 840704993);
        setIntField(term51952, term51952.getClass(), "year", 2026);
        setShortField(term51952, term51952.getClass(), "month", (short) 10);
        setShortField(term51952, term51952.getClass(), "day", (short) 31);
        setField(term51951, term51951.getClass(), "date", term51952);
        setByteField(term51956, term51956.getClass(), "hour", (byte) 17);
        setByteField(term51956, term51956.getClass(), "minute", (byte) 6);
        setByteField(term51956, term51956.getClass(), "second", (byte) 30);
        setIntField(term51956, term51956.getClass(), "nano", 785931660);
        setField(term51951, term51951.getClass(), "time", term51956);
        setField(term51756, term51756.getClass(), "pdddt_tm", term51951);
        setIntField(term51756, term51756.getClass(), "nblss_ltt_stts", 1297035285);
        setIntField(term51756, term51756.getClass(), "nblss_ltt_tckt", -826239685);
        setIntField(term51756, term51756.getClass(), "nblss_ltt_is_opn", -845551243);
        setIntField(term51756, term51756.getClass(), "nblss_ltt_prz", 370671198);
        setIntField(term51756, term51756.getClass(), "nblss_ltt_nxt_stts", 1426800646);
        setIntField(term51756, term51756.getClass(), "nblss_ltt_nxt_tckt", 954234820);
        setField(term51756, term51756.getClass(), "my_qst_id", "xNDnWDGUNx");
        setField(term51756, term51756.getClass(), "my_qst_r_qid", "faGVqjLquQ");
        setField(term51756, term51756.getClass(), "my_qst_r_knd", "MbsTNUmNqV");
        setField(term51756, term51756.getClass(), "my_qst_r_vl", "VdDIonpedU");
        setField(term51756, term51756.getClass(), "my_qst_r_nflg", "VjtXZcUFNx");
        setField(term51756, term51756.getClass(), "my_ccd_r_qid", "bOZSTccXbt");
        setField(term51756, term51756.getClass(), "my_ccd_r_hnd", "MBSsxxeNUU");
        setField(term51756, term51756.getClass(), "my_ccd_r_vp", "NmUhmPLSgG");
        setField(term51756, term51756.getClass(), "cmd", "WJosrfBMfA");
        setField(term51756, term51756.getClass(), "req_id", "ttlGywalKc");
        setField(term51756, term51756.getClass(), "stat", "rQFBspqBzf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FmWhAOGAMI";
        callMethod(klass, "setSkin_illust_ary", argTypes, term51756, args);
    }

};


