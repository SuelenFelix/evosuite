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

public class StageResultResponse_setMyqstrnflg_14214124386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60354;

    public StageResultResponse_setMyqstrnflg_14214124386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60354 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term60549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60554 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term60354, term60354.getClass(), "chllng_kind", -491132382);
        setIntField(term60354, term60354.getClass(), "lv_num_old", 918882916);
        setIntField(term60354, term60354.getClass(), "lv_pnt_old", 1544012770);
        setIntField(term60354, term60354.getClass(), "lv_num", 1922068039);
        setIntField(term60354, term60354.getClass(), "lv_pnt", -410564443);
        setField(term60354, term60354.getClass(), "lv_str", "uyuWzXeJvn");
        setIntField(term60354, term60354.getClass(), "lv_efct_id", 996017434);
        setIntField(term60354, term60354.getClass(), "lv_plt_id", -983870300);
        setIntField(term60354, term60354.getClass(), "vcld_pts", 360715062);
        setIntField(term60354, term60354.getClass(), "prsnt_vcld_pts", 1047409266);
        setIntField(term60354, term60354.getClass(), "cnp_cid", 1427248961);
        setIntField(term60354, term60354.getClass(), "cnp_val", 1445291866);
        setField(term60354, term60354.getClass(), "cnp_sp", "jvQHxWAYDO");
        setField(term60354, term60354.getClass(), "crwd_kind", "mntnLPfhte");
        setField(term60354, term60354.getClass(), "crwd_value", "rIKLUjcdnZ");
        setField(term60354, term60354.getClass(), "crwd_str_0", "MQaKKukkYD");
        setField(term60354, term60354.getClass(), "crwd_str_1", "ThGyaiqnHq");
        setIntField(term60354, term60354.getClass(), "cerwd_kind", -139927812);
        setIntField(term60354, term60354.getClass(), "cerwd_value", -2065157320);
        setField(term60354, term60354.getClass(), "cerwd_str_0", "AtEuOtHJrK");
        setField(term60354, term60354.getClass(), "cerwd_str_1", "gzqokHWvLu");
        setField(term60354, term60354.getClass(), "ttl_str_ary", "ANCcRsABGP");
        setField(term60354, term60354.getClass(), "ttl_plt_id_ary", "MBadwVIvwu");
        setField(term60354, term60354.getClass(), "ttl_desc_ary", "zTMIjtwMQL");
        setField(term60354, term60354.getClass(), "skin_id_ary", "cjJhlsbSLZ");
        setField(term60354, term60354.getClass(), "skin_name_ary", "BvcBilSFZf");
        setField(term60354, term60354.getClass(), "skin_illust_ary", "ppUmoMssug");
        setField(term60354, term60354.getClass(), "skin_desc_ary", "FcponInvBb");
        setIntField(term60354, term60354.getClass(), "pdddt_flg", 1782011477);
        setIntField(term60550, term60550.getClass(), "year", 2025);
        setShortField(term60550, term60550.getClass(), "month", (short) 12);
        setShortField(term60550, term60550.getClass(), "day", (short) 16);
        setField(term60549, term60549.getClass(), "date", term60550);
        setByteField(term60554, term60554.getClass(), "hour", (byte) 7);
        setByteField(term60554, term60554.getClass(), "minute", (byte) 53);
        setByteField(term60554, term60554.getClass(), "second", (byte) 23);
        setIntField(term60554, term60554.getClass(), "nano", 532991944);
        setField(term60549, term60549.getClass(), "time", term60554);
        setField(term60354, term60354.getClass(), "pdddt_tm", term60549);
        setIntField(term60354, term60354.getClass(), "nblss_ltt_stts", 2129957018);
        setIntField(term60354, term60354.getClass(), "nblss_ltt_tckt", 691663312);
        setIntField(term60354, term60354.getClass(), "nblss_ltt_is_opn", -1236696275);
        setIntField(term60354, term60354.getClass(), "nblss_ltt_prz", 575249858);
        setIntField(term60354, term60354.getClass(), "nblss_ltt_nxt_stts", -297957951);
        setIntField(term60354, term60354.getClass(), "nblss_ltt_nxt_tckt", -1816920588);
        setField(term60354, term60354.getClass(), "my_qst_id", "IFOOxmFxbX");
        setField(term60354, term60354.getClass(), "my_qst_r_qid", "aDEuPKrSZt");
        setField(term60354, term60354.getClass(), "my_qst_r_knd", "aDhkmoCCUK");
        setField(term60354, term60354.getClass(), "my_qst_r_vl", "ibnuoVVkVm");
        setField(term60354, term60354.getClass(), "my_qst_r_nflg", "mXVgkxjTjD");
        setField(term60354, term60354.getClass(), "my_ccd_r_qid", "qodBmKUkev");
        setField(term60354, term60354.getClass(), "my_ccd_r_hnd", "QJuqwUQEyr");
        setField(term60354, term60354.getClass(), "my_ccd_r_vp", "qqUAzxxpNB");
        setField(term60354, term60354.getClass(), "cmd", "WqaQxuPbzr");
        setField(term60354, term60354.getClass(), "req_id", "bjLZqJqmnv");
        setField(term60354, term60354.getClass(), "stat", "TPbMBzbcHs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "spkDvqsOhJ";
        callMethod(klass, "setMy_qst_r_nflg", argTypes, term60354, args);
    }

};


