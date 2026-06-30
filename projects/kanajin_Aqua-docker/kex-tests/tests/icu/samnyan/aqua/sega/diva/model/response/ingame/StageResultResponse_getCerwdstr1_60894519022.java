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

public class StageResultResponse_getCerwdstr1_60894519022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21294;

    public StageResultResponse_getCerwdstr1_60894519022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21294 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term21489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21494 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21294, term21294.getClass(), "chllng_kind", 1887772522);
        setIntField(term21294, term21294.getClass(), "lv_num_old", 354196060);
        setIntField(term21294, term21294.getClass(), "lv_pnt_old", -1840305774);
        setIntField(term21294, term21294.getClass(), "lv_num", 1365087144);
        setIntField(term21294, term21294.getClass(), "lv_pnt", -1537255112);
        setField(term21294, term21294.getClass(), "lv_str", "RbQmXqfXAT");
        setIntField(term21294, term21294.getClass(), "lv_efct_id", 934477462);
        setIntField(term21294, term21294.getClass(), "lv_plt_id", 4900410);
        setIntField(term21294, term21294.getClass(), "vcld_pts", -1252345779);
        setIntField(term21294, term21294.getClass(), "prsnt_vcld_pts", -2063365430);
        setIntField(term21294, term21294.getClass(), "cnp_cid", 812570053);
        setIntField(term21294, term21294.getClass(), "cnp_val", -1488938905);
        setField(term21294, term21294.getClass(), "cnp_sp", "fcCAsvfBbe");
        setField(term21294, term21294.getClass(), "crwd_kind", "mUNcKUxghj");
        setField(term21294, term21294.getClass(), "crwd_value", "lnvLKbtveE");
        setField(term21294, term21294.getClass(), "crwd_str_0", "FfrrEhTHzQ");
        setField(term21294, term21294.getClass(), "crwd_str_1", "LXnDNrMsqT");
        setIntField(term21294, term21294.getClass(), "cerwd_kind", 1916544127);
        setIntField(term21294, term21294.getClass(), "cerwd_value", -1133405894);
        setField(term21294, term21294.getClass(), "cerwd_str_0", "ZLQamJFBmu");
        setField(term21294, term21294.getClass(), "cerwd_str_1", "ZWcOCwKNvd");
        setField(term21294, term21294.getClass(), "ttl_str_ary", "GTmoNrziyc");
        setField(term21294, term21294.getClass(), "ttl_plt_id_ary", "LvztehSlhM");
        setField(term21294, term21294.getClass(), "ttl_desc_ary", "njvnWFTMxN");
        setField(term21294, term21294.getClass(), "skin_id_ary", "fLRqcTSfzF");
        setField(term21294, term21294.getClass(), "skin_name_ary", "EBYHwsuWAU");
        setField(term21294, term21294.getClass(), "skin_illust_ary", "PtIjKpiSix");
        setField(term21294, term21294.getClass(), "skin_desc_ary", "NZdTuwSCIM");
        setIntField(term21294, term21294.getClass(), "pdddt_flg", 1289741214);
        setIntField(term21490, term21490.getClass(), "year", 2023);
        setShortField(term21490, term21490.getClass(), "month", (short) 3);
        setShortField(term21490, term21490.getClass(), "day", (short) 7);
        setField(term21489, term21489.getClass(), "date", term21490);
        setByteField(term21494, term21494.getClass(), "hour", (byte) 21);
        setByteField(term21494, term21494.getClass(), "minute", (byte) 15);
        setByteField(term21494, term21494.getClass(), "second", (byte) 43);
        setIntField(term21494, term21494.getClass(), "nano", 639721472);
        setField(term21489, term21489.getClass(), "time", term21494);
        setField(term21294, term21294.getClass(), "pdddt_tm", term21489);
        setIntField(term21294, term21294.getClass(), "nblss_ltt_stts", 243280944);
        setIntField(term21294, term21294.getClass(), "nblss_ltt_tckt", -726681073);
        setIntField(term21294, term21294.getClass(), "nblss_ltt_is_opn", -1724487863);
        setIntField(term21294, term21294.getClass(), "nblss_ltt_prz", -128490829);
        setIntField(term21294, term21294.getClass(), "nblss_ltt_nxt_stts", 202214133);
        setIntField(term21294, term21294.getClass(), "nblss_ltt_nxt_tckt", 1543091617);
        setField(term21294, term21294.getClass(), "my_qst_id", "dDHcmzPAmP");
        setField(term21294, term21294.getClass(), "my_qst_r_qid", "HEaTkWYBgv");
        setField(term21294, term21294.getClass(), "my_qst_r_knd", "MpJsPKLTIU");
        setField(term21294, term21294.getClass(), "my_qst_r_vl", "IiNCZfdouL");
        setField(term21294, term21294.getClass(), "my_qst_r_nflg", "AhOHzCsHKW");
        setField(term21294, term21294.getClass(), "my_ccd_r_qid", "UqgLPaaAHi");
        setField(term21294, term21294.getClass(), "my_ccd_r_hnd", "xypryEkUPF");
        setField(term21294, term21294.getClass(), "my_ccd_r_vp", "zyZTzHNjQr");
        setField(term21294, term21294.getClass(), "cmd", "YSrFKQQwXE");
        setField(term21294, term21294.getClass(), "req_id", "qxhOsmyyjm");
        setField(term21294, term21294.getClass(), "stat", "DuKcNfVVYR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCerwd_str_1", argTypes, term21294, args);
    }

};


