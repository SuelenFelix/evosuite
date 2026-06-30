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

public class StageResultResponse_setNblssltttckt_97489497677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54829;
     Object term55172;

    public StageResultResponse_setNblssltttckt_97489497677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54829 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term55024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55029 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54829, term54829.getClass(), "chllng_kind", -749474542);
        setIntField(term54829, term54829.getClass(), "lv_num_old", -47907780);
        setIntField(term54829, term54829.getClass(), "lv_pnt_old", 1131462369);
        setIntField(term54829, term54829.getClass(), "lv_num", -1161206731);
        setIntField(term54829, term54829.getClass(), "lv_pnt", -992847709);
        setField(term54829, term54829.getClass(), "lv_str", "ZRoptBRTDM");
        setIntField(term54829, term54829.getClass(), "lv_efct_id", 1125156671);
        setIntField(term54829, term54829.getClass(), "lv_plt_id", 1203107925);
        setIntField(term54829, term54829.getClass(), "vcld_pts", 1825448944);
        setIntField(term54829, term54829.getClass(), "prsnt_vcld_pts", 1769496642);
        setIntField(term54829, term54829.getClass(), "cnp_cid", -947460705);
        setIntField(term54829, term54829.getClass(), "cnp_val", -1435758764);
        setField(term54829, term54829.getClass(), "cnp_sp", "vVVFChfeBQ");
        setField(term54829, term54829.getClass(), "crwd_kind", "aASfcqfBbh");
        setField(term54829, term54829.getClass(), "crwd_value", "DwpOIkpRFT");
        setField(term54829, term54829.getClass(), "crwd_str_0", "LPlTDoLrUy");
        setField(term54829, term54829.getClass(), "crwd_str_1", "XETimBHIKG");
        setIntField(term54829, term54829.getClass(), "cerwd_kind", 752858379);
        setIntField(term54829, term54829.getClass(), "cerwd_value", -370819357);
        setField(term54829, term54829.getClass(), "cerwd_str_0", "nOKVZSyfbZ");
        setField(term54829, term54829.getClass(), "cerwd_str_1", "adHZFgDoEH");
        setField(term54829, term54829.getClass(), "ttl_str_ary", "vjNETNMDhQ");
        setField(term54829, term54829.getClass(), "ttl_plt_id_ary", "pexqQqwSNj");
        setField(term54829, term54829.getClass(), "ttl_desc_ary", "myfXkIEBSV");
        setField(term54829, term54829.getClass(), "skin_id_ary", "LSrqDVjzEP");
        setField(term54829, term54829.getClass(), "skin_name_ary", "CPZCLJxTuA");
        setField(term54829, term54829.getClass(), "skin_illust_ary", "ivAOXnVjmg");
        setField(term54829, term54829.getClass(), "skin_desc_ary", "FivesaUeHG");
        setIntField(term54829, term54829.getClass(), "pdddt_flg", -71819242);
        setIntField(term55025, term55025.getClass(), "year", 2020);
        setShortField(term55025, term55025.getClass(), "month", (short) 9);
        setShortField(term55025, term55025.getClass(), "day", (short) 3);
        setField(term55024, term55024.getClass(), "date", term55025);
        setByteField(term55029, term55029.getClass(), "hour", (byte) 10);
        setByteField(term55029, term55029.getClass(), "minute", (byte) 44);
        setByteField(term55029, term55029.getClass(), "second", (byte) 5);
        setIntField(term55029, term55029.getClass(), "nano", 572560230);
        setField(term55024, term55024.getClass(), "time", term55029);
        setField(term54829, term54829.getClass(), "pdddt_tm", term55024);
        setIntField(term54829, term54829.getClass(), "nblss_ltt_stts", 1268893136);
        setIntField(term54829, term54829.getClass(), "nblss_ltt_tckt", -1472700822);
        setIntField(term54829, term54829.getClass(), "nblss_ltt_is_opn", 1626670889);
        setIntField(term54829, term54829.getClass(), "nblss_ltt_prz", -2117361140);
        setIntField(term54829, term54829.getClass(), "nblss_ltt_nxt_stts", 407708341);
        setIntField(term54829, term54829.getClass(), "nblss_ltt_nxt_tckt", -287519200);
        setField(term54829, term54829.getClass(), "my_qst_id", "TnpXhZmCRY");
        setField(term54829, term54829.getClass(), "my_qst_r_qid", "ECVAXFhrTP");
        setField(term54829, term54829.getClass(), "my_qst_r_knd", "ypytdNbrBc");
        setField(term54829, term54829.getClass(), "my_qst_r_vl", "XvrJCOSYei");
        setField(term54829, term54829.getClass(), "my_qst_r_nflg", "QdRcxOxNSl");
        setField(term54829, term54829.getClass(), "my_ccd_r_qid", "lvdsucnNvR");
        setField(term54829, term54829.getClass(), "my_ccd_r_hnd", "mSjSKfeMUn");
        setField(term54829, term54829.getClass(), "my_ccd_r_vp", "nVXCBYnEcg");
        setField(term54829, term54829.getClass(), "cmd", "fcLnKXxzfM");
        setField(term54829, term54829.getClass(), "req_id", "FtyaWnfsgn");
        setField(term54829, term54829.getClass(), "stat", "qphbpPdwrD");
        term55172 = new Integer(-1490696181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55172;
        callMethod(klass, "setNblss_ltt_tckt", argTypes, term54829, args);
    }

};


