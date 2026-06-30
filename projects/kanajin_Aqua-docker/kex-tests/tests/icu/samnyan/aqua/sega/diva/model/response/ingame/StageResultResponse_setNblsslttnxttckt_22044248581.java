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

public class StageResultResponse_setNblsslttnxttckt_22044248581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57249;
     Object term57592;

    public StageResultResponse_setNblsslttnxttckt_22044248581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57249 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term57444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57449 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term57249, term57249.getClass(), "chllng_kind", 1057562436);
        setIntField(term57249, term57249.getClass(), "lv_num_old", 646610000);
        setIntField(term57249, term57249.getClass(), "lv_pnt_old", 2003399396);
        setIntField(term57249, term57249.getClass(), "lv_num", 1223703911);
        setIntField(term57249, term57249.getClass(), "lv_pnt", -1824905298);
        setField(term57249, term57249.getClass(), "lv_str", "HtLEppUqzI");
        setIntField(term57249, term57249.getClass(), "lv_efct_id", -2062724184);
        setIntField(term57249, term57249.getClass(), "lv_plt_id", -716654499);
        setIntField(term57249, term57249.getClass(), "vcld_pts", 1641117123);
        setIntField(term57249, term57249.getClass(), "prsnt_vcld_pts", -1084408453);
        setIntField(term57249, term57249.getClass(), "cnp_cid", -1466822773);
        setIntField(term57249, term57249.getClass(), "cnp_val", -230022261);
        setField(term57249, term57249.getClass(), "cnp_sp", "bVlRrMQeRY");
        setField(term57249, term57249.getClass(), "crwd_kind", "SXaXhlzAIB");
        setField(term57249, term57249.getClass(), "crwd_value", "UPVTXSXUNh");
        setField(term57249, term57249.getClass(), "crwd_str_0", "cjCXbXuiFn");
        setField(term57249, term57249.getClass(), "crwd_str_1", "fhdhDeWdoi");
        setIntField(term57249, term57249.getClass(), "cerwd_kind", 831967494);
        setIntField(term57249, term57249.getClass(), "cerwd_value", -1858635791);
        setField(term57249, term57249.getClass(), "cerwd_str_0", "FqrcltWSUd");
        setField(term57249, term57249.getClass(), "cerwd_str_1", "kAbILlhsZw");
        setField(term57249, term57249.getClass(), "ttl_str_ary", "QsIOCSpRow");
        setField(term57249, term57249.getClass(), "ttl_plt_id_ary", "gcFzvYOUch");
        setField(term57249, term57249.getClass(), "ttl_desc_ary", "NnFSMXLOUA");
        setField(term57249, term57249.getClass(), "skin_id_ary", "bacruLIvDW");
        setField(term57249, term57249.getClass(), "skin_name_ary", "ydbVEuslYx");
        setField(term57249, term57249.getClass(), "skin_illust_ary", "DKWEhukBpG");
        setField(term57249, term57249.getClass(), "skin_desc_ary", "YaowqyqxBH");
        setIntField(term57249, term57249.getClass(), "pdddt_flg", 1919079331);
        setIntField(term57445, term57445.getClass(), "year", 2014);
        setShortField(term57445, term57445.getClass(), "month", (short) 8);
        setShortField(term57445, term57445.getClass(), "day", (short) 17);
        setField(term57444, term57444.getClass(), "date", term57445);
        setByteField(term57449, term57449.getClass(), "hour", (byte) 19);
        setByteField(term57449, term57449.getClass(), "minute", (byte) 32);
        setByteField(term57449, term57449.getClass(), "second", (byte) 5);
        setIntField(term57449, term57449.getClass(), "nano", 604713831);
        setField(term57444, term57444.getClass(), "time", term57449);
        setField(term57249, term57249.getClass(), "pdddt_tm", term57444);
        setIntField(term57249, term57249.getClass(), "nblss_ltt_stts", 144872711);
        setIntField(term57249, term57249.getClass(), "nblss_ltt_tckt", -720037395);
        setIntField(term57249, term57249.getClass(), "nblss_ltt_is_opn", 1232105469);
        setIntField(term57249, term57249.getClass(), "nblss_ltt_prz", -1547322575);
        setIntField(term57249, term57249.getClass(), "nblss_ltt_nxt_stts", -61444233);
        setIntField(term57249, term57249.getClass(), "nblss_ltt_nxt_tckt", -400720912);
        setField(term57249, term57249.getClass(), "my_qst_id", "dbxhsKyZWZ");
        setField(term57249, term57249.getClass(), "my_qst_r_qid", "oXxafKyyrx");
        setField(term57249, term57249.getClass(), "my_qst_r_knd", "TapDFGQNLY");
        setField(term57249, term57249.getClass(), "my_qst_r_vl", "vgHeAegSfV");
        setField(term57249, term57249.getClass(), "my_qst_r_nflg", "qShfKMgKGs");
        setField(term57249, term57249.getClass(), "my_ccd_r_qid", "bLCaDnEUyS");
        setField(term57249, term57249.getClass(), "my_ccd_r_hnd", "yfHcOCDrGy");
        setField(term57249, term57249.getClass(), "my_ccd_r_vp", "juKqILstcn");
        setField(term57249, term57249.getClass(), "cmd", "QSCQJRyiPa");
        setField(term57249, term57249.getClass(), "req_id", "jPPOVoAOLQ");
        setField(term57249, term57249.getClass(), "stat", "kZKzEkUFFI");
        term57592 = new Integer(1266192397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57592;
        callMethod(klass, "setNblss_ltt_nxt_tckt", argTypes, term57249, args);
    }

};


