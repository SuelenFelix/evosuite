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

public class StageResultResponse_setCrwdkind_155247945259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43671;

    public StageResultResponse_setCrwdkind_155247945259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43671 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term43866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43871 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term43671, term43671.getClass(), "chllng_kind", -824369460);
        setIntField(term43671, term43671.getClass(), "lv_num_old", -1573760035);
        setIntField(term43671, term43671.getClass(), "lv_pnt_old", -1147965121);
        setIntField(term43671, term43671.getClass(), "lv_num", -867099093);
        setIntField(term43671, term43671.getClass(), "lv_pnt", -1091199008);
        setField(term43671, term43671.getClass(), "lv_str", "VUVgiQvSYa");
        setIntField(term43671, term43671.getClass(), "lv_efct_id", 1837886253);
        setIntField(term43671, term43671.getClass(), "lv_plt_id", -269528550);
        setIntField(term43671, term43671.getClass(), "vcld_pts", 2108571355);
        setIntField(term43671, term43671.getClass(), "prsnt_vcld_pts", 1909966089);
        setIntField(term43671, term43671.getClass(), "cnp_cid", 1827255916);
        setIntField(term43671, term43671.getClass(), "cnp_val", 2039815750);
        setField(term43671, term43671.getClass(), "cnp_sp", "sEGgJJplmE");
        setField(term43671, term43671.getClass(), "crwd_kind", "jyexiarswN");
        setField(term43671, term43671.getClass(), "crwd_value", "ZBLFNFVEHD");
        setField(term43671, term43671.getClass(), "crwd_str_0", "miNxpUfOyL");
        setField(term43671, term43671.getClass(), "crwd_str_1", "BAPTojeHRU");
        setIntField(term43671, term43671.getClass(), "cerwd_kind", 2079590265);
        setIntField(term43671, term43671.getClass(), "cerwd_value", -435079567);
        setField(term43671, term43671.getClass(), "cerwd_str_0", "uqDEIRoVVf");
        setField(term43671, term43671.getClass(), "cerwd_str_1", "HnLeZhnLzz");
        setField(term43671, term43671.getClass(), "ttl_str_ary", "ziYEsRkZmD");
        setField(term43671, term43671.getClass(), "ttl_plt_id_ary", "RFbJNwiLtv");
        setField(term43671, term43671.getClass(), "ttl_desc_ary", "eCxWMOpomA");
        setField(term43671, term43671.getClass(), "skin_id_ary", "pkQawlBtEF");
        setField(term43671, term43671.getClass(), "skin_name_ary", "rdKTcvHHnV");
        setField(term43671, term43671.getClass(), "skin_illust_ary", "ELfUfLbXZf");
        setField(term43671, term43671.getClass(), "skin_desc_ary", "SAglaHkagn");
        setIntField(term43671, term43671.getClass(), "pdddt_flg", -1017617829);
        setIntField(term43867, term43867.getClass(), "year", 2025);
        setShortField(term43867, term43867.getClass(), "month", (short) 3);
        setShortField(term43867, term43867.getClass(), "day", (short) 28);
        setField(term43866, term43866.getClass(), "date", term43867);
        setByteField(term43871, term43871.getClass(), "hour", (byte) 19);
        setByteField(term43871, term43871.getClass(), "minute", (byte) 56);
        setByteField(term43871, term43871.getClass(), "second", (byte) 52);
        setIntField(term43871, term43871.getClass(), "nano", 738558930);
        setField(term43866, term43866.getClass(), "time", term43871);
        setField(term43671, term43671.getClass(), "pdddt_tm", term43866);
        setIntField(term43671, term43671.getClass(), "nblss_ltt_stts", 270928865);
        setIntField(term43671, term43671.getClass(), "nblss_ltt_tckt", -308526089);
        setIntField(term43671, term43671.getClass(), "nblss_ltt_is_opn", -359675864);
        setIntField(term43671, term43671.getClass(), "nblss_ltt_prz", -1671982964);
        setIntField(term43671, term43671.getClass(), "nblss_ltt_nxt_stts", 776218451);
        setIntField(term43671, term43671.getClass(), "nblss_ltt_nxt_tckt", -1362132929);
        setField(term43671, term43671.getClass(), "my_qst_id", "eZGxUfdoFn");
        setField(term43671, term43671.getClass(), "my_qst_r_qid", "yCWSlaOrSv");
        setField(term43671, term43671.getClass(), "my_qst_r_knd", "PFpWKxDIRz");
        setField(term43671, term43671.getClass(), "my_qst_r_vl", "qePuOCwoCf");
        setField(term43671, term43671.getClass(), "my_qst_r_nflg", "vJPujDInGq");
        setField(term43671, term43671.getClass(), "my_ccd_r_qid", "cHZGcMhatT");
        setField(term43671, term43671.getClass(), "my_ccd_r_hnd", "OZGyrUPedG");
        setField(term43671, term43671.getClass(), "my_ccd_r_vp", "GAxMzRqmXU");
        setField(term43671, term43671.getClass(), "cmd", "XMhUDGKSWO");
        setField(term43671, term43671.getClass(), "req_id", "jLgzxtuvVo");
        setField(term43671, term43671.getClass(), "stat", "wmmxjOkPnH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jgRohUQWxJ";
        callMethod(klass, "setCrwd_kind", argTypes, term43671, args);
    }

};


