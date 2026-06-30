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

public class StageResultResponse_setCrwdstr1_62749453762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45546;

    public StageResultResponse_setCrwdstr1_62749453762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45546 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term45741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45746 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term45546, term45546.getClass(), "chllng_kind", 1516598327);
        setIntField(term45546, term45546.getClass(), "lv_num_old", 82353584);
        setIntField(term45546, term45546.getClass(), "lv_pnt_old", -758778797);
        setIntField(term45546, term45546.getClass(), "lv_num", 765680355);
        setIntField(term45546, term45546.getClass(), "lv_pnt", -1012090049);
        setField(term45546, term45546.getClass(), "lv_str", "JiSIFtJnYv");
        setIntField(term45546, term45546.getClass(), "lv_efct_id", -2025214553);
        setIntField(term45546, term45546.getClass(), "lv_plt_id", -154750730);
        setIntField(term45546, term45546.getClass(), "vcld_pts", -2047179134);
        setIntField(term45546, term45546.getClass(), "prsnt_vcld_pts", 44908093);
        setIntField(term45546, term45546.getClass(), "cnp_cid", 887198203);
        setIntField(term45546, term45546.getClass(), "cnp_val", 12581312);
        setField(term45546, term45546.getClass(), "cnp_sp", "wxAHQRVgKc");
        setField(term45546, term45546.getClass(), "crwd_kind", "bYsZEHeoeV");
        setField(term45546, term45546.getClass(), "crwd_value", "IwvwrQylib");
        setField(term45546, term45546.getClass(), "crwd_str_0", "ZWJgSttNjg");
        setField(term45546, term45546.getClass(), "crwd_str_1", "LQTIjJLkXH");
        setIntField(term45546, term45546.getClass(), "cerwd_kind", 2087383644);
        setIntField(term45546, term45546.getClass(), "cerwd_value", 405527523);
        setField(term45546, term45546.getClass(), "cerwd_str_0", "RvkBwedFKx");
        setField(term45546, term45546.getClass(), "cerwd_str_1", "DYzWJljbaE");
        setField(term45546, term45546.getClass(), "ttl_str_ary", "idwbHVHUcz");
        setField(term45546, term45546.getClass(), "ttl_plt_id_ary", "sWJHIWZMuX");
        setField(term45546, term45546.getClass(), "ttl_desc_ary", "PwMdJRwzDW");
        setField(term45546, term45546.getClass(), "skin_id_ary", "sMiHxgXUuN");
        setField(term45546, term45546.getClass(), "skin_name_ary", "oVChCWWDag");
        setField(term45546, term45546.getClass(), "skin_illust_ary", "EteTxkDxin");
        setField(term45546, term45546.getClass(), "skin_desc_ary", "mKgLwPdYbY");
        setIntField(term45546, term45546.getClass(), "pdddt_flg", -1123526433);
        setIntField(term45742, term45742.getClass(), "year", 2029);
        setShortField(term45742, term45742.getClass(), "month", (short) 1);
        setShortField(term45742, term45742.getClass(), "day", (short) 10);
        setField(term45741, term45741.getClass(), "date", term45742);
        setByteField(term45746, term45746.getClass(), "hour", (byte) 8);
        setByteField(term45746, term45746.getClass(), "minute", (byte) 46);
        setByteField(term45746, term45746.getClass(), "second", (byte) 35);
        setIntField(term45746, term45746.getClass(), "nano", 58807194);
        setField(term45741, term45741.getClass(), "time", term45746);
        setField(term45546, term45546.getClass(), "pdddt_tm", term45741);
        setIntField(term45546, term45546.getClass(), "nblss_ltt_stts", 910269225);
        setIntField(term45546, term45546.getClass(), "nblss_ltt_tckt", -298852874);
        setIntField(term45546, term45546.getClass(), "nblss_ltt_is_opn", 1094297953);
        setIntField(term45546, term45546.getClass(), "nblss_ltt_prz", -329141819);
        setIntField(term45546, term45546.getClass(), "nblss_ltt_nxt_stts", -963204620);
        setIntField(term45546, term45546.getClass(), "nblss_ltt_nxt_tckt", 172898580);
        setField(term45546, term45546.getClass(), "my_qst_id", "zqykonsLIo");
        setField(term45546, term45546.getClass(), "my_qst_r_qid", "KoPzTuvIeK");
        setField(term45546, term45546.getClass(), "my_qst_r_knd", "SMoWUILIhn");
        setField(term45546, term45546.getClass(), "my_qst_r_vl", "SvSKSCjgTM");
        setField(term45546, term45546.getClass(), "my_qst_r_nflg", "UFxnRbWtog");
        setField(term45546, term45546.getClass(), "my_ccd_r_qid", "NSxzAUSujy");
        setField(term45546, term45546.getClass(), "my_ccd_r_hnd", "FEezgglqXC");
        setField(term45546, term45546.getClass(), "my_ccd_r_vp", "rvYqMRgiPA");
        setField(term45546, term45546.getClass(), "cmd", "qOZXeUUmdz");
        setField(term45546, term45546.getClass(), "req_id", "FCovVZHqPx");
        setField(term45546, term45546.getClass(), "stat", "jSTBfkWjge");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uKYhZULSHp";
        callMethod(klass, "setCrwd_str_1", argTypes, term45546, args);
    }

};


