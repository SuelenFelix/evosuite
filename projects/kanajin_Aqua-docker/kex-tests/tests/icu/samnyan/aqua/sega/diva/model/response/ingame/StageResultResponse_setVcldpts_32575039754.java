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

public class StageResultResponse_setVcldpts_32575039754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40626;
     Object term40969;

    public StageResultResponse_setVcldpts_32575039754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40626 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term40821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40826 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40626, term40626.getClass(), "chllng_kind", 183531701);
        setIntField(term40626, term40626.getClass(), "lv_num_old", -974923743);
        setIntField(term40626, term40626.getClass(), "lv_pnt_old", 1876738932);
        setIntField(term40626, term40626.getClass(), "lv_num", -1870339027);
        setIntField(term40626, term40626.getClass(), "lv_pnt", -1549603566);
        setField(term40626, term40626.getClass(), "lv_str", "anSZCikKpS");
        setIntField(term40626, term40626.getClass(), "lv_efct_id", 1077223540);
        setIntField(term40626, term40626.getClass(), "lv_plt_id", -1823813592);
        setIntField(term40626, term40626.getClass(), "vcld_pts", -1644358555);
        setIntField(term40626, term40626.getClass(), "prsnt_vcld_pts", -388591034);
        setIntField(term40626, term40626.getClass(), "cnp_cid", -1270258033);
        setIntField(term40626, term40626.getClass(), "cnp_val", 1677994069);
        setField(term40626, term40626.getClass(), "cnp_sp", "zvMQGbTtsV");
        setField(term40626, term40626.getClass(), "crwd_kind", "DyUuIDzZPG");
        setField(term40626, term40626.getClass(), "crwd_value", "EGQLusEtRN");
        setField(term40626, term40626.getClass(), "crwd_str_0", "GwGUMPdvZq");
        setField(term40626, term40626.getClass(), "crwd_str_1", "iXRAYcFyfS");
        setIntField(term40626, term40626.getClass(), "cerwd_kind", -439999692);
        setIntField(term40626, term40626.getClass(), "cerwd_value", 924095007);
        setField(term40626, term40626.getClass(), "cerwd_str_0", "lokyclbLEz");
        setField(term40626, term40626.getClass(), "cerwd_str_1", "hAPmQGaxkI");
        setField(term40626, term40626.getClass(), "ttl_str_ary", "ojrnLnJZjT");
        setField(term40626, term40626.getClass(), "ttl_plt_id_ary", "rtvXSMjOdJ");
        setField(term40626, term40626.getClass(), "ttl_desc_ary", "EDkfjuDpNv");
        setField(term40626, term40626.getClass(), "skin_id_ary", "LNHkTUfuHX");
        setField(term40626, term40626.getClass(), "skin_name_ary", "SVWcOAHiTp");
        setField(term40626, term40626.getClass(), "skin_illust_ary", "oShLCaneoQ");
        setField(term40626, term40626.getClass(), "skin_desc_ary", "nwKkzNpzyC");
        setIntField(term40626, term40626.getClass(), "pdddt_flg", 1302110708);
        setIntField(term40822, term40822.getClass(), "year", 2012);
        setShortField(term40822, term40822.getClass(), "month", (short) 7);
        setShortField(term40822, term40822.getClass(), "day", (short) 21);
        setField(term40821, term40821.getClass(), "date", term40822);
        setByteField(term40826, term40826.getClass(), "hour", (byte) 13);
        setByteField(term40826, term40826.getClass(), "minute", (byte) 41);
        setByteField(term40826, term40826.getClass(), "second", (byte) 44);
        setIntField(term40826, term40826.getClass(), "nano", 394467282);
        setField(term40821, term40821.getClass(), "time", term40826);
        setField(term40626, term40626.getClass(), "pdddt_tm", term40821);
        setIntField(term40626, term40626.getClass(), "nblss_ltt_stts", 594705497);
        setIntField(term40626, term40626.getClass(), "nblss_ltt_tckt", -600102466);
        setIntField(term40626, term40626.getClass(), "nblss_ltt_is_opn", -899986714);
        setIntField(term40626, term40626.getClass(), "nblss_ltt_prz", 1307244466);
        setIntField(term40626, term40626.getClass(), "nblss_ltt_nxt_stts", -252262096);
        setIntField(term40626, term40626.getClass(), "nblss_ltt_nxt_tckt", -37129068);
        setField(term40626, term40626.getClass(), "my_qst_id", "CwrsdYnHpH");
        setField(term40626, term40626.getClass(), "my_qst_r_qid", "jifjXNXluS");
        setField(term40626, term40626.getClass(), "my_qst_r_knd", "uDayZDXPOP");
        setField(term40626, term40626.getClass(), "my_qst_r_vl", "kbjWxMAIhY");
        setField(term40626, term40626.getClass(), "my_qst_r_nflg", "GmtlSgqKcI");
        setField(term40626, term40626.getClass(), "my_ccd_r_qid", "ssSbvPoMjB");
        setField(term40626, term40626.getClass(), "my_ccd_r_hnd", "mhRVADhaKm");
        setField(term40626, term40626.getClass(), "my_ccd_r_vp", "rLldJrTAay");
        setField(term40626, term40626.getClass(), "cmd", "HvSKssbEES");
        setField(term40626, term40626.getClass(), "req_id", "UjIAQAHhul");
        setField(term40626, term40626.getClass(), "stat", "oWBXOvjPUT");
        term40969 = new Integer(-861014847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term40969;
        callMethod(klass, "setVcld_pts", argTypes, term40626, args);
    }

};


