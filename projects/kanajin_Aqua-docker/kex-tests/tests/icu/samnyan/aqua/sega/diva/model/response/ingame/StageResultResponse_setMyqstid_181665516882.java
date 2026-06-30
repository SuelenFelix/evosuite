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

public class StageResultResponse_setMyqstid_181665516882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57854;

    public StageResultResponse_setMyqstid_181665516882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57854 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term58049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58054 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term57854, term57854.getClass(), "chllng_kind", 218346781);
        setIntField(term57854, term57854.getClass(), "lv_num_old", -984660976);
        setIntField(term57854, term57854.getClass(), "lv_pnt_old", -1419341969);
        setIntField(term57854, term57854.getClass(), "lv_num", -89522625);
        setIntField(term57854, term57854.getClass(), "lv_pnt", 1475906894);
        setField(term57854, term57854.getClass(), "lv_str", "dnYvoLZjCf");
        setIntField(term57854, term57854.getClass(), "lv_efct_id", -2004794532);
        setIntField(term57854, term57854.getClass(), "lv_plt_id", 1232958763);
        setIntField(term57854, term57854.getClass(), "vcld_pts", -1702132549);
        setIntField(term57854, term57854.getClass(), "prsnt_vcld_pts", -1786136772);
        setIntField(term57854, term57854.getClass(), "cnp_cid", -1510967747);
        setIntField(term57854, term57854.getClass(), "cnp_val", -2014792457);
        setField(term57854, term57854.getClass(), "cnp_sp", "ZsvLlzqETk");
        setField(term57854, term57854.getClass(), "crwd_kind", "DqrZwuHriF");
        setField(term57854, term57854.getClass(), "crwd_value", "daaMmTkwOR");
        setField(term57854, term57854.getClass(), "crwd_str_0", "WfJKDOFrUv");
        setField(term57854, term57854.getClass(), "crwd_str_1", "CbwfWaINrF");
        setIntField(term57854, term57854.getClass(), "cerwd_kind", 1957633116);
        setIntField(term57854, term57854.getClass(), "cerwd_value", 1428598210);
        setField(term57854, term57854.getClass(), "cerwd_str_0", "AVCzSfXhGU");
        setField(term57854, term57854.getClass(), "cerwd_str_1", "nTUCmQGFDE");
        setField(term57854, term57854.getClass(), "ttl_str_ary", "rfFTBanxEx");
        setField(term57854, term57854.getClass(), "ttl_plt_id_ary", "MQJTCGewxT");
        setField(term57854, term57854.getClass(), "ttl_desc_ary", "DRdgywxCcP");
        setField(term57854, term57854.getClass(), "skin_id_ary", "uelmUHzwnS");
        setField(term57854, term57854.getClass(), "skin_name_ary", "iKuSKqVzvy");
        setField(term57854, term57854.getClass(), "skin_illust_ary", "SgyGAlytLF");
        setField(term57854, term57854.getClass(), "skin_desc_ary", "OoXopVvpwr");
        setIntField(term57854, term57854.getClass(), "pdddt_flg", 1071776561);
        setIntField(term58050, term58050.getClass(), "year", 2021);
        setShortField(term58050, term58050.getClass(), "month", (short) 3);
        setShortField(term58050, term58050.getClass(), "day", (short) 13);
        setField(term58049, term58049.getClass(), "date", term58050);
        setByteField(term58054, term58054.getClass(), "hour", (byte) 6);
        setByteField(term58054, term58054.getClass(), "minute", (byte) 25);
        setByteField(term58054, term58054.getClass(), "second", (byte) 42);
        setIntField(term58054, term58054.getClass(), "nano", 282924199);
        setField(term58049, term58049.getClass(), "time", term58054);
        setField(term57854, term57854.getClass(), "pdddt_tm", term58049);
        setIntField(term57854, term57854.getClass(), "nblss_ltt_stts", 1846399918);
        setIntField(term57854, term57854.getClass(), "nblss_ltt_tckt", 35388821);
        setIntField(term57854, term57854.getClass(), "nblss_ltt_is_opn", -598803400);
        setIntField(term57854, term57854.getClass(), "nblss_ltt_prz", 25560022);
        setIntField(term57854, term57854.getClass(), "nblss_ltt_nxt_stts", -1090136985);
        setIntField(term57854, term57854.getClass(), "nblss_ltt_nxt_tckt", -355574894);
        setField(term57854, term57854.getClass(), "my_qst_id", "lwwreKJCFL");
        setField(term57854, term57854.getClass(), "my_qst_r_qid", "PWBggYjpOQ");
        setField(term57854, term57854.getClass(), "my_qst_r_knd", "FDzNpfjYDI");
        setField(term57854, term57854.getClass(), "my_qst_r_vl", "vSbbcByIuA");
        setField(term57854, term57854.getClass(), "my_qst_r_nflg", "QSvdWzkkPx");
        setField(term57854, term57854.getClass(), "my_ccd_r_qid", "vStdEtWvae");
        setField(term57854, term57854.getClass(), "my_ccd_r_hnd", "iApJWgnQkP");
        setField(term57854, term57854.getClass(), "my_ccd_r_vp", "kHKzzYJxiP");
        setField(term57854, term57854.getClass(), "cmd", "INFnBrMIka");
        setField(term57854, term57854.getClass(), "req_id", "EwmpEgdvZs");
        setField(term57854, term57854.getClass(), "stat", "vRjHouXWLC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XghDInkWEe";
        callMethod(klass, "setMy_qst_id", argTypes, term57854, args);
    }

};


