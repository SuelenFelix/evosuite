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

public class StageResultResponse_getVcldpts_110350886310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14058;

    public StageResultResponse_getVcldpts_110350886310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14058 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term14253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14258 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14058, term14058.getClass(), "chllng_kind", 371943306);
        setIntField(term14058, term14058.getClass(), "lv_num_old", 982388293);
        setIntField(term14058, term14058.getClass(), "lv_pnt_old", -159494544);
        setIntField(term14058, term14058.getClass(), "lv_num", -75206835);
        setIntField(term14058, term14058.getClass(), "lv_pnt", -1618206977);
        setField(term14058, term14058.getClass(), "lv_str", "RDnkgWkcbz");
        setIntField(term14058, term14058.getClass(), "lv_efct_id", -1747406163);
        setIntField(term14058, term14058.getClass(), "lv_plt_id", 388157121);
        setIntField(term14058, term14058.getClass(), "vcld_pts", 1684998508);
        setIntField(term14058, term14058.getClass(), "prsnt_vcld_pts", -1476644457);
        setIntField(term14058, term14058.getClass(), "cnp_cid", 1270666529);
        setIntField(term14058, term14058.getClass(), "cnp_val", -1146679443);
        setField(term14058, term14058.getClass(), "cnp_sp", "IBpaxltauX");
        setField(term14058, term14058.getClass(), "crwd_kind", "hePqROaplw");
        setField(term14058, term14058.getClass(), "crwd_value", "PJcSNDruWd");
        setField(term14058, term14058.getClass(), "crwd_str_0", "VVNNlAePXF");
        setField(term14058, term14058.getClass(), "crwd_str_1", "jnwVnmKAFv");
        setIntField(term14058, term14058.getClass(), "cerwd_kind", -860131894);
        setIntField(term14058, term14058.getClass(), "cerwd_value", -1022990421);
        setField(term14058, term14058.getClass(), "cerwd_str_0", "TXyHhqeCjR");
        setField(term14058, term14058.getClass(), "cerwd_str_1", "lZIgPZPgTu");
        setField(term14058, term14058.getClass(), "ttl_str_ary", "iuCxnHGMoW");
        setField(term14058, term14058.getClass(), "ttl_plt_id_ary", "GPSEWEDSTo");
        setField(term14058, term14058.getClass(), "ttl_desc_ary", "RCOqfVsRHt");
        setField(term14058, term14058.getClass(), "skin_id_ary", "TSyCeEZPaT");
        setField(term14058, term14058.getClass(), "skin_name_ary", "JeZFtaqkzW");
        setField(term14058, term14058.getClass(), "skin_illust_ary", "vOVuNSCCLe");
        setField(term14058, term14058.getClass(), "skin_desc_ary", "fzeqPnzpnt");
        setIntField(term14058, term14058.getClass(), "pdddt_flg", 1045547089);
        setIntField(term14254, term14254.getClass(), "year", 2022);
        setShortField(term14254, term14254.getClass(), "month", (short) 11);
        setShortField(term14254, term14254.getClass(), "day", (short) 16);
        setField(term14253, term14253.getClass(), "date", term14254);
        setByteField(term14258, term14258.getClass(), "hour", (byte) 15);
        setByteField(term14258, term14258.getClass(), "minute", (byte) 54);
        setByteField(term14258, term14258.getClass(), "second", (byte) 2);
        setIntField(term14258, term14258.getClass(), "nano", 733274103);
        setField(term14253, term14253.getClass(), "time", term14258);
        setField(term14058, term14058.getClass(), "pdddt_tm", term14253);
        setIntField(term14058, term14058.getClass(), "nblss_ltt_stts", -1122880881);
        setIntField(term14058, term14058.getClass(), "nblss_ltt_tckt", -542712742);
        setIntField(term14058, term14058.getClass(), "nblss_ltt_is_opn", -1254072822);
        setIntField(term14058, term14058.getClass(), "nblss_ltt_prz", -1111249833);
        setIntField(term14058, term14058.getClass(), "nblss_ltt_nxt_stts", -1692331299);
        setIntField(term14058, term14058.getClass(), "nblss_ltt_nxt_tckt", 479531250);
        setField(term14058, term14058.getClass(), "my_qst_id", "RxbhrFBjkO");
        setField(term14058, term14058.getClass(), "my_qst_r_qid", "aanyiAOJCl");
        setField(term14058, term14058.getClass(), "my_qst_r_knd", "VDokbsCuqq");
        setField(term14058, term14058.getClass(), "my_qst_r_vl", "xClUIcPECX");
        setField(term14058, term14058.getClass(), "my_qst_r_nflg", "avhRaGZaBF");
        setField(term14058, term14058.getClass(), "my_ccd_r_qid", "JkgoRtImdE");
        setField(term14058, term14058.getClass(), "my_ccd_r_hnd", "qFGKIJjlmV");
        setField(term14058, term14058.getClass(), "my_ccd_r_vp", "IHqvyhMtuM");
        setField(term14058, term14058.getClass(), "cmd", "dAldIGYAXV");
        setField(term14058, term14058.getClass(), "req_id", "mLwibAPEsa");
        setField(term14058, term14058.getClass(), "stat", "zsWKWiTFuo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term14058, args);
    }

};


