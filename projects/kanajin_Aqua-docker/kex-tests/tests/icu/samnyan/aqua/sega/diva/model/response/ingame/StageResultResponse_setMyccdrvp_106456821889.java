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

public class StageResultResponse_setMyccdrvp_106456821889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62229;

    public StageResultResponse_setMyccdrvp_106456821889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62229 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term62424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62429 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term62229, term62229.getClass(), "chllng_kind", -334716487);
        setIntField(term62229, term62229.getClass(), "lv_num_old", -1739012814);
        setIntField(term62229, term62229.getClass(), "lv_pnt_old", 1989014880);
        setIntField(term62229, term62229.getClass(), "lv_num", -330280702);
        setIntField(term62229, term62229.getClass(), "lv_pnt", -1858425735);
        setField(term62229, term62229.getClass(), "lv_str", "zeBhlhyhkL");
        setIntField(term62229, term62229.getClass(), "lv_efct_id", 1818274550);
        setIntField(term62229, term62229.getClass(), "lv_plt_id", 1044519085);
        setIntField(term62229, term62229.getClass(), "vcld_pts", 2095699770);
        setIntField(term62229, term62229.getClass(), "prsnt_vcld_pts", -1365904757);
        setIntField(term62229, term62229.getClass(), "cnp_cid", -1487263349);
        setIntField(term62229, term62229.getClass(), "cnp_val", -1009732764);
        setField(term62229, term62229.getClass(), "cnp_sp", "PxinRhWgwT");
        setField(term62229, term62229.getClass(), "crwd_kind", "pZcEKUNIXL");
        setField(term62229, term62229.getClass(), "crwd_value", "QbRtvZIDtW");
        setField(term62229, term62229.getClass(), "crwd_str_0", "fbsmDvjMqr");
        setField(term62229, term62229.getClass(), "crwd_str_1", "tycssGWZvU");
        setIntField(term62229, term62229.getClass(), "cerwd_kind", 950783153);
        setIntField(term62229, term62229.getClass(), "cerwd_value", -801175078);
        setField(term62229, term62229.getClass(), "cerwd_str_0", "jcvrILwbgt");
        setField(term62229, term62229.getClass(), "cerwd_str_1", "AphrAHzPMC");
        setField(term62229, term62229.getClass(), "ttl_str_ary", "iwismCnYjB");
        setField(term62229, term62229.getClass(), "ttl_plt_id_ary", "GerBZdiruT");
        setField(term62229, term62229.getClass(), "ttl_desc_ary", "VzkPDPPGQl");
        setField(term62229, term62229.getClass(), "skin_id_ary", "iojOXjfZFr");
        setField(term62229, term62229.getClass(), "skin_name_ary", "yyrkuIYJKj");
        setField(term62229, term62229.getClass(), "skin_illust_ary", "reGIMbnrGF");
        setField(term62229, term62229.getClass(), "skin_desc_ary", "yquSngBHqd");
        setIntField(term62229, term62229.getClass(), "pdddt_flg", 2085098404);
        setIntField(term62425, term62425.getClass(), "year", 2015);
        setShortField(term62425, term62425.getClass(), "month", (short) 2);
        setShortField(term62425, term62425.getClass(), "day", (short) 5);
        setField(term62424, term62424.getClass(), "date", term62425);
        setByteField(term62429, term62429.getClass(), "hour", (byte) 3);
        setByteField(term62429, term62429.getClass(), "minute", (byte) 26);
        setByteField(term62429, term62429.getClass(), "second", (byte) 49);
        setIntField(term62429, term62429.getClass(), "nano", 995758570);
        setField(term62424, term62424.getClass(), "time", term62429);
        setField(term62229, term62229.getClass(), "pdddt_tm", term62424);
        setIntField(term62229, term62229.getClass(), "nblss_ltt_stts", -684064427);
        setIntField(term62229, term62229.getClass(), "nblss_ltt_tckt", -1981080836);
        setIntField(term62229, term62229.getClass(), "nblss_ltt_is_opn", -176676344);
        setIntField(term62229, term62229.getClass(), "nblss_ltt_prz", 1949009312);
        setIntField(term62229, term62229.getClass(), "nblss_ltt_nxt_stts", -432054743);
        setIntField(term62229, term62229.getClass(), "nblss_ltt_nxt_tckt", -859726380);
        setField(term62229, term62229.getClass(), "my_qst_id", "ZSdaJkZZPm");
        setField(term62229, term62229.getClass(), "my_qst_r_qid", "ICnzwgujDT");
        setField(term62229, term62229.getClass(), "my_qst_r_knd", "RfDgUkIYjW");
        setField(term62229, term62229.getClass(), "my_qst_r_vl", "QnZKCwkmMh");
        setField(term62229, term62229.getClass(), "my_qst_r_nflg", "RVQbteztJx");
        setField(term62229, term62229.getClass(), "my_ccd_r_qid", "yjmUdvwSdd");
        setField(term62229, term62229.getClass(), "my_ccd_r_hnd", "COsGswsrtI");
        setField(term62229, term62229.getClass(), "my_ccd_r_vp", "ebUWnoVDmk");
        setField(term62229, term62229.getClass(), "cmd", "wCcojFgWKb");
        setField(term62229, term62229.getClass(), "req_id", "iHtqLPNWTt");
        setField(term62229, term62229.getClass(), "stat", "TQgECVDMEf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KIBOVYItqe";
        callMethod(klass, "setMy_ccd_r_vp", argTypes, term62229, args);
    }

};


