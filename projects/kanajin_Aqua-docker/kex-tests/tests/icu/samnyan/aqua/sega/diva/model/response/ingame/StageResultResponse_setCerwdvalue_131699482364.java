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

public class StageResultResponse_setCerwdvalue_131699482364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46776;
     Object term47119;

    public StageResultResponse_setCerwdvalue_131699482364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46776 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term46971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46976 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46776, term46776.getClass(), "chllng_kind", -1428947021);
        setIntField(term46776, term46776.getClass(), "lv_num_old", -134324004);
        setIntField(term46776, term46776.getClass(), "lv_pnt_old", -1813266173);
        setIntField(term46776, term46776.getClass(), "lv_num", -1201819537);
        setIntField(term46776, term46776.getClass(), "lv_pnt", 2135922049);
        setField(term46776, term46776.getClass(), "lv_str", "uEQbnHbyAn");
        setIntField(term46776, term46776.getClass(), "lv_efct_id", -263876378);
        setIntField(term46776, term46776.getClass(), "lv_plt_id", -755209283);
        setIntField(term46776, term46776.getClass(), "vcld_pts", -616562794);
        setIntField(term46776, term46776.getClass(), "prsnt_vcld_pts", 750084083);
        setIntField(term46776, term46776.getClass(), "cnp_cid", -1603460382);
        setIntField(term46776, term46776.getClass(), "cnp_val", -298939768);
        setField(term46776, term46776.getClass(), "cnp_sp", "JpFIuyNEKW");
        setField(term46776, term46776.getClass(), "crwd_kind", "NksHsgcqDx");
        setField(term46776, term46776.getClass(), "crwd_value", "RjSNvOEvcT");
        setField(term46776, term46776.getClass(), "crwd_str_0", "HLzuMxigqS");
        setField(term46776, term46776.getClass(), "crwd_str_1", "wiBOoDCyzd");
        setIntField(term46776, term46776.getClass(), "cerwd_kind", -767031634);
        setIntField(term46776, term46776.getClass(), "cerwd_value", -2072469750);
        setField(term46776, term46776.getClass(), "cerwd_str_0", "TIaFKUJELS");
        setField(term46776, term46776.getClass(), "cerwd_str_1", "IPmndzGjtG");
        setField(term46776, term46776.getClass(), "ttl_str_ary", "pkQiBgYrkQ");
        setField(term46776, term46776.getClass(), "ttl_plt_id_ary", "SJLRFsNagf");
        setField(term46776, term46776.getClass(), "ttl_desc_ary", "UsCZaSgXzI");
        setField(term46776, term46776.getClass(), "skin_id_ary", "IXZCeVwvBM");
        setField(term46776, term46776.getClass(), "skin_name_ary", "ElTdyUVQYi");
        setField(term46776, term46776.getClass(), "skin_illust_ary", "KkgJnxXxVl");
        setField(term46776, term46776.getClass(), "skin_desc_ary", "TGnzPlGFMb");
        setIntField(term46776, term46776.getClass(), "pdddt_flg", 2106616847);
        setIntField(term46972, term46972.getClass(), "year", 2019);
        setShortField(term46972, term46972.getClass(), "month", (short) 1);
        setShortField(term46972, term46972.getClass(), "day", (short) 6);
        setField(term46971, term46971.getClass(), "date", term46972);
        setByteField(term46976, term46976.getClass(), "hour", (byte) 18);
        setByteField(term46976, term46976.getClass(), "minute", (byte) 8);
        setByteField(term46976, term46976.getClass(), "second", (byte) 46);
        setIntField(term46976, term46976.getClass(), "nano", 934136445);
        setField(term46971, term46971.getClass(), "time", term46976);
        setField(term46776, term46776.getClass(), "pdddt_tm", term46971);
        setIntField(term46776, term46776.getClass(), "nblss_ltt_stts", 403107947);
        setIntField(term46776, term46776.getClass(), "nblss_ltt_tckt", -1433815725);
        setIntField(term46776, term46776.getClass(), "nblss_ltt_is_opn", -1445089135);
        setIntField(term46776, term46776.getClass(), "nblss_ltt_prz", -291618851);
        setIntField(term46776, term46776.getClass(), "nblss_ltt_nxt_stts", -378436487);
        setIntField(term46776, term46776.getClass(), "nblss_ltt_nxt_tckt", 584949609);
        setField(term46776, term46776.getClass(), "my_qst_id", "yEvLMSpdHy");
        setField(term46776, term46776.getClass(), "my_qst_r_qid", "qdErlZeTVv");
        setField(term46776, term46776.getClass(), "my_qst_r_knd", "OCCDQbndDE");
        setField(term46776, term46776.getClass(), "my_qst_r_vl", "NMANMKfctU");
        setField(term46776, term46776.getClass(), "my_qst_r_nflg", "mQsaqUltLU");
        setField(term46776, term46776.getClass(), "my_ccd_r_qid", "jwENwZiGlR");
        setField(term46776, term46776.getClass(), "my_ccd_r_hnd", "rfFHGPcfpz");
        setField(term46776, term46776.getClass(), "my_ccd_r_vp", "fViQeyMrrL");
        setField(term46776, term46776.getClass(), "cmd", "zzeaToyLmI");
        setField(term46776, term46776.getClass(), "req_id", "sKYWhmRMLx");
        setField(term46776, term46776.getClass(), "stat", "SOJpgWUZCf");
        term47119 = new Integer(879795058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term47119;
        callMethod(klass, "setCerwd_value", argTypes, term46776, args);
    }

};


