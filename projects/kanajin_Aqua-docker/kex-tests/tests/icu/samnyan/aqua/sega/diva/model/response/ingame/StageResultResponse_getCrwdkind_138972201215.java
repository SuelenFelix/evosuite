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

public class StageResultResponse_getCrwdkind_138972201215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17073;

    public StageResultResponse_getCrwdkind_138972201215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17073 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term17268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17273 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17073, term17073.getClass(), "chllng_kind", 278355793);
        setIntField(term17073, term17073.getClass(), "lv_num_old", -310648604);
        setIntField(term17073, term17073.getClass(), "lv_pnt_old", -648200466);
        setIntField(term17073, term17073.getClass(), "lv_num", 2007134147);
        setIntField(term17073, term17073.getClass(), "lv_pnt", 993388358);
        setField(term17073, term17073.getClass(), "lv_str", "VUkRVwROTl");
        setIntField(term17073, term17073.getClass(), "lv_efct_id", -765191335);
        setIntField(term17073, term17073.getClass(), "lv_plt_id", -1697741155);
        setIntField(term17073, term17073.getClass(), "vcld_pts", 1295839803);
        setIntField(term17073, term17073.getClass(), "prsnt_vcld_pts", -1891015523);
        setIntField(term17073, term17073.getClass(), "cnp_cid", -1560631747);
        setIntField(term17073, term17073.getClass(), "cnp_val", 1215150180);
        setField(term17073, term17073.getClass(), "cnp_sp", "UDlkdccCRn");
        setField(term17073, term17073.getClass(), "crwd_kind", "McpzErOcYb");
        setField(term17073, term17073.getClass(), "crwd_value", "jqrVEUvYEz");
        setField(term17073, term17073.getClass(), "crwd_str_0", "QITgiBrmfj");
        setField(term17073, term17073.getClass(), "crwd_str_1", "pXxkiXgQnq");
        setIntField(term17073, term17073.getClass(), "cerwd_kind", -1422859977);
        setIntField(term17073, term17073.getClass(), "cerwd_value", -1972436591);
        setField(term17073, term17073.getClass(), "cerwd_str_0", "tKmrUDURku");
        setField(term17073, term17073.getClass(), "cerwd_str_1", "JeZbrwZmsP");
        setField(term17073, term17073.getClass(), "ttl_str_ary", "bxyfeicqrK");
        setField(term17073, term17073.getClass(), "ttl_plt_id_ary", "vBnWPlsZMk");
        setField(term17073, term17073.getClass(), "ttl_desc_ary", "fIZsWucfXz");
        setField(term17073, term17073.getClass(), "skin_id_ary", "IApvtmfhnq");
        setField(term17073, term17073.getClass(), "skin_name_ary", "VSaNnhMpRc");
        setField(term17073, term17073.getClass(), "skin_illust_ary", "QNjNTLlUaV");
        setField(term17073, term17073.getClass(), "skin_desc_ary", "hIYsRyOZxk");
        setIntField(term17073, term17073.getClass(), "pdddt_flg", 68922753);
        setIntField(term17269, term17269.getClass(), "year", 2012);
        setShortField(term17269, term17269.getClass(), "month", (short) 2);
        setShortField(term17269, term17269.getClass(), "day", (short) 19);
        setField(term17268, term17268.getClass(), "date", term17269);
        setByteField(term17273, term17273.getClass(), "hour", (byte) 8);
        setByteField(term17273, term17273.getClass(), "minute", (byte) 4);
        setByteField(term17273, term17273.getClass(), "second", (byte) 43);
        setIntField(term17273, term17273.getClass(), "nano", 114930008);
        setField(term17268, term17268.getClass(), "time", term17273);
        setField(term17073, term17073.getClass(), "pdddt_tm", term17268);
        setIntField(term17073, term17073.getClass(), "nblss_ltt_stts", -220791533);
        setIntField(term17073, term17073.getClass(), "nblss_ltt_tckt", 1741500243);
        setIntField(term17073, term17073.getClass(), "nblss_ltt_is_opn", -2070466617);
        setIntField(term17073, term17073.getClass(), "nblss_ltt_prz", -1127721881);
        setIntField(term17073, term17073.getClass(), "nblss_ltt_nxt_stts", 1074848808);
        setIntField(term17073, term17073.getClass(), "nblss_ltt_nxt_tckt", -146054762);
        setField(term17073, term17073.getClass(), "my_qst_id", "RjNoEywJbC");
        setField(term17073, term17073.getClass(), "my_qst_r_qid", "RTTvrwwhou");
        setField(term17073, term17073.getClass(), "my_qst_r_knd", "lRORwXipuk");
        setField(term17073, term17073.getClass(), "my_qst_r_vl", "fVdTcjgHdw");
        setField(term17073, term17073.getClass(), "my_qst_r_nflg", "wwAwLLcLPp");
        setField(term17073, term17073.getClass(), "my_ccd_r_qid", "nHpMKOmlpQ");
        setField(term17073, term17073.getClass(), "my_ccd_r_hnd", "fKhrQsJToZ");
        setField(term17073, term17073.getClass(), "my_ccd_r_vp", "wsysQLGFnl");
        setField(term17073, term17073.getClass(), "cmd", "ckQLZGFjMX");
        setField(term17073, term17073.getClass(), "req_id", "qphdrqUtNx");
        setField(term17073, term17073.getClass(), "stat", "bwlLFAfNWx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrwd_kind", argTypes, term17073, args);
    }

};


