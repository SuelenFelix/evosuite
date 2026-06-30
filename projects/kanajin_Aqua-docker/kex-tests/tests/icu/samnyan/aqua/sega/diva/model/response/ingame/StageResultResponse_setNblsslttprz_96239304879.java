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

public class StageResultResponse_setNblsslttprz_96239304879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56039;
     Object term56382;

    public StageResultResponse_setNblsslttprz_96239304879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56039 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term56234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56239 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term56039, term56039.getClass(), "chllng_kind", 433039357);
        setIntField(term56039, term56039.getClass(), "lv_num_old", 1469939797);
        setIntField(term56039, term56039.getClass(), "lv_pnt_old", 252799294);
        setIntField(term56039, term56039.getClass(), "lv_num", -2072618022);
        setIntField(term56039, term56039.getClass(), "lv_pnt", -269909549);
        setField(term56039, term56039.getClass(), "lv_str", "TnUXNtKOns");
        setIntField(term56039, term56039.getClass(), "lv_efct_id", 686286032);
        setIntField(term56039, term56039.getClass(), "lv_plt_id", -1277201854);
        setIntField(term56039, term56039.getClass(), "vcld_pts", 1691516034);
        setIntField(term56039, term56039.getClass(), "prsnt_vcld_pts", 335681723);
        setIntField(term56039, term56039.getClass(), "cnp_cid", -773707674);
        setIntField(term56039, term56039.getClass(), "cnp_val", 383244929);
        setField(term56039, term56039.getClass(), "cnp_sp", "umsYdaPflb");
        setField(term56039, term56039.getClass(), "crwd_kind", "CnNmpSyiBE");
        setField(term56039, term56039.getClass(), "crwd_value", "JvKKIGdUWh");
        setField(term56039, term56039.getClass(), "crwd_str_0", "DInvDrzBtt");
        setField(term56039, term56039.getClass(), "crwd_str_1", "igZJubDPuK");
        setIntField(term56039, term56039.getClass(), "cerwd_kind", -2114034003);
        setIntField(term56039, term56039.getClass(), "cerwd_value", 207213904);
        setField(term56039, term56039.getClass(), "cerwd_str_0", "qxBdFhLbAN");
        setField(term56039, term56039.getClass(), "cerwd_str_1", "KyUmXHRrED");
        setField(term56039, term56039.getClass(), "ttl_str_ary", "eOMBFVrNcf");
        setField(term56039, term56039.getClass(), "ttl_plt_id_ary", "gOwOIsocMB");
        setField(term56039, term56039.getClass(), "ttl_desc_ary", "GqTBOhQBgV");
        setField(term56039, term56039.getClass(), "skin_id_ary", "DQhxOWqEyi");
        setField(term56039, term56039.getClass(), "skin_name_ary", "dSszYGDwAk");
        setField(term56039, term56039.getClass(), "skin_illust_ary", "gNeMyGSVIG");
        setField(term56039, term56039.getClass(), "skin_desc_ary", "qxEkaqdKPG");
        setIntField(term56039, term56039.getClass(), "pdddt_flg", -484303394);
        setIntField(term56235, term56235.getClass(), "year", 2028);
        setShortField(term56235, term56235.getClass(), "month", (short) 5);
        setShortField(term56235, term56235.getClass(), "day", (short) 2);
        setField(term56234, term56234.getClass(), "date", term56235);
        setByteField(term56239, term56239.getClass(), "hour", (byte) 2);
        setByteField(term56239, term56239.getClass(), "minute", (byte) 59);
        setByteField(term56239, term56239.getClass(), "second", (byte) 30);
        setIntField(term56239, term56239.getClass(), "nano", 222274238);
        setField(term56234, term56234.getClass(), "time", term56239);
        setField(term56039, term56039.getClass(), "pdddt_tm", term56234);
        setIntField(term56039, term56039.getClass(), "nblss_ltt_stts", -31125530);
        setIntField(term56039, term56039.getClass(), "nblss_ltt_tckt", 1909773180);
        setIntField(term56039, term56039.getClass(), "nblss_ltt_is_opn", -970417907);
        setIntField(term56039, term56039.getClass(), "nblss_ltt_prz", 1097894139);
        setIntField(term56039, term56039.getClass(), "nblss_ltt_nxt_stts", 390256347);
        setIntField(term56039, term56039.getClass(), "nblss_ltt_nxt_tckt", 1471619998);
        setField(term56039, term56039.getClass(), "my_qst_id", "VclIptmKrF");
        setField(term56039, term56039.getClass(), "my_qst_r_qid", "wcTeSHCZwz");
        setField(term56039, term56039.getClass(), "my_qst_r_knd", "fxxnbYOiZZ");
        setField(term56039, term56039.getClass(), "my_qst_r_vl", "CTnRYaYXia");
        setField(term56039, term56039.getClass(), "my_qst_r_nflg", "SUIYUFtCCe");
        setField(term56039, term56039.getClass(), "my_ccd_r_qid", "eKCrPCkedw");
        setField(term56039, term56039.getClass(), "my_ccd_r_hnd", "VAFSknHLsZ");
        setField(term56039, term56039.getClass(), "my_ccd_r_vp", "MamzBtwhiz");
        setField(term56039, term56039.getClass(), "cmd", "wVOypfVLsP");
        setField(term56039, term56039.getClass(), "req_id", "pEazBcUUWX");
        setField(term56039, term56039.getClass(), "stat", "nlvRWrTxvz");
        term56382 = new Integer(-1623489521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56382;
        callMethod(klass, "setNblss_ltt_prz", argTypes, term56039, args);
    }

};


