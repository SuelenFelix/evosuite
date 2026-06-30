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

public class StageResultResponse_getNblsslttisopn_43824115034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28530;

    public StageResultResponse_getNblsslttisopn_43824115034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28530 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term28725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28730 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28530, term28530.getClass(), "chllng_kind", 716486048);
        setIntField(term28530, term28530.getClass(), "lv_num_old", -466708718);
        setIntField(term28530, term28530.getClass(), "lv_pnt_old", 1038029515);
        setIntField(term28530, term28530.getClass(), "lv_num", 1137154606);
        setIntField(term28530, term28530.getClass(), "lv_pnt", -100681578);
        setField(term28530, term28530.getClass(), "lv_str", "ceGeARYMoa");
        setIntField(term28530, term28530.getClass(), "lv_efct_id", 296568835);
        setIntField(term28530, term28530.getClass(), "lv_plt_id", 1431951992);
        setIntField(term28530, term28530.getClass(), "vcld_pts", -1608123016);
        setIntField(term28530, term28530.getClass(), "prsnt_vcld_pts", -896473214);
        setIntField(term28530, term28530.getClass(), "cnp_cid", 401203924);
        setIntField(term28530, term28530.getClass(), "cnp_val", -1212399479);
        setField(term28530, term28530.getClass(), "cnp_sp", "fFWllaiFvh");
        setField(term28530, term28530.getClass(), "crwd_kind", "PFTdEDSbvZ");
        setField(term28530, term28530.getClass(), "crwd_value", "TbiwoiebNe");
        setField(term28530, term28530.getClass(), "crwd_str_0", "laTITSWZuc");
        setField(term28530, term28530.getClass(), "crwd_str_1", "fkzRpxlAqS");
        setIntField(term28530, term28530.getClass(), "cerwd_kind", 2107679041);
        setIntField(term28530, term28530.getClass(), "cerwd_value", 2040965507);
        setField(term28530, term28530.getClass(), "cerwd_str_0", "VYvbTGKslj");
        setField(term28530, term28530.getClass(), "cerwd_str_1", "owLqDDnwZA");
        setField(term28530, term28530.getClass(), "ttl_str_ary", "eBcTbweeYp");
        setField(term28530, term28530.getClass(), "ttl_plt_id_ary", "drcmjfQUDq");
        setField(term28530, term28530.getClass(), "ttl_desc_ary", "GjdWUoUSyA");
        setField(term28530, term28530.getClass(), "skin_id_ary", "YEkxWsWaUl");
        setField(term28530, term28530.getClass(), "skin_name_ary", "RINhPkhhct");
        setField(term28530, term28530.getClass(), "skin_illust_ary", "vjNPcTSqmS");
        setField(term28530, term28530.getClass(), "skin_desc_ary", "fFhdWuJbdC");
        setIntField(term28530, term28530.getClass(), "pdddt_flg", -1281083262);
        setIntField(term28726, term28726.getClass(), "year", 2010);
        setShortField(term28726, term28726.getClass(), "month", (short) 6);
        setShortField(term28726, term28726.getClass(), "day", (short) 14);
        setField(term28725, term28725.getClass(), "date", term28726);
        setByteField(term28730, term28730.getClass(), "hour", (byte) 6);
        setByteField(term28730, term28730.getClass(), "minute", (byte) 22);
        setByteField(term28730, term28730.getClass(), "second", (byte) 20);
        setIntField(term28730, term28730.getClass(), "nano", 25133051);
        setField(term28725, term28725.getClass(), "time", term28730);
        setField(term28530, term28530.getClass(), "pdddt_tm", term28725);
        setIntField(term28530, term28530.getClass(), "nblss_ltt_stts", 1059930704);
        setIntField(term28530, term28530.getClass(), "nblss_ltt_tckt", -1967153290);
        setIntField(term28530, term28530.getClass(), "nblss_ltt_is_opn", -1397251956);
        setIntField(term28530, term28530.getClass(), "nblss_ltt_prz", -796934571);
        setIntField(term28530, term28530.getClass(), "nblss_ltt_nxt_stts", 405295896);
        setIntField(term28530, term28530.getClass(), "nblss_ltt_nxt_tckt", -814977075);
        setField(term28530, term28530.getClass(), "my_qst_id", "JlgLIHPabR");
        setField(term28530, term28530.getClass(), "my_qst_r_qid", "LHnkeoNwHq");
        setField(term28530, term28530.getClass(), "my_qst_r_knd", "gVnDVbSyKa");
        setField(term28530, term28530.getClass(), "my_qst_r_vl", "kdCYNMSuoD");
        setField(term28530, term28530.getClass(), "my_qst_r_nflg", "eRYlSLwtvV");
        setField(term28530, term28530.getClass(), "my_ccd_r_qid", "duOyJsARTD");
        setField(term28530, term28530.getClass(), "my_ccd_r_hnd", "xPnOHsNlyc");
        setField(term28530, term28530.getClass(), "my_ccd_r_vp", "OTSPWPJefj");
        setField(term28530, term28530.getClass(), "cmd", "EOTYMqXRmE");
        setField(term28530, term28530.getClass(), "req_id", "iTxNduwSjE");
        setField(term28530, term28530.getClass(), "stat", "MQUTfIiFnh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_is_opn", argTypes, term28530, args);
    }

};


