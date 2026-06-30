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

public class StageResultResponse_setLvnum_24368377549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37581;
     Object term37924;

    public StageResultResponse_setLvnum_24368377549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37581 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term37776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37781 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term37581, term37581.getClass(), "chllng_kind", 805176809);
        setIntField(term37581, term37581.getClass(), "lv_num_old", -82632953);
        setIntField(term37581, term37581.getClass(), "lv_pnt_old", -1473876284);
        setIntField(term37581, term37581.getClass(), "lv_num", -1389314671);
        setIntField(term37581, term37581.getClass(), "lv_pnt", -499699841);
        setField(term37581, term37581.getClass(), "lv_str", "VesRqDfjMa");
        setIntField(term37581, term37581.getClass(), "lv_efct_id", 360972386);
        setIntField(term37581, term37581.getClass(), "lv_plt_id", -2063884849);
        setIntField(term37581, term37581.getClass(), "vcld_pts", 1054887169);
        setIntField(term37581, term37581.getClass(), "prsnt_vcld_pts", 692873905);
        setIntField(term37581, term37581.getClass(), "cnp_cid", 1734759369);
        setIntField(term37581, term37581.getClass(), "cnp_val", 1841493736);
        setField(term37581, term37581.getClass(), "cnp_sp", "AQTTebOiZR");
        setField(term37581, term37581.getClass(), "crwd_kind", "mgeIhswNtk");
        setField(term37581, term37581.getClass(), "crwd_value", "QwKYpiVQlL");
        setField(term37581, term37581.getClass(), "crwd_str_0", "kSGsHNQQoW");
        setField(term37581, term37581.getClass(), "crwd_str_1", "MWezlyjdaG");
        setIntField(term37581, term37581.getClass(), "cerwd_kind", 320739944);
        setIntField(term37581, term37581.getClass(), "cerwd_value", 760218111);
        setField(term37581, term37581.getClass(), "cerwd_str_0", "drpBJuEKQG");
        setField(term37581, term37581.getClass(), "cerwd_str_1", "GGpORnLrOW");
        setField(term37581, term37581.getClass(), "ttl_str_ary", "gDGZwlpOZx");
        setField(term37581, term37581.getClass(), "ttl_plt_id_ary", "gkDpxkHPDg");
        setField(term37581, term37581.getClass(), "ttl_desc_ary", "pADwkrWiMW");
        setField(term37581, term37581.getClass(), "skin_id_ary", "FDORDJuAXQ");
        setField(term37581, term37581.getClass(), "skin_name_ary", "yjqoDeLBLg");
        setField(term37581, term37581.getClass(), "skin_illust_ary", "DCepDqVwas");
        setField(term37581, term37581.getClass(), "skin_desc_ary", "wKIBUlfNCx");
        setIntField(term37581, term37581.getClass(), "pdddt_flg", -1986366126);
        setIntField(term37777, term37777.getClass(), "year", 2012);
        setShortField(term37777, term37777.getClass(), "month", (short) 4);
        setShortField(term37777, term37777.getClass(), "day", (short) 25);
        setField(term37776, term37776.getClass(), "date", term37777);
        setByteField(term37781, term37781.getClass(), "hour", (byte) 21);
        setByteField(term37781, term37781.getClass(), "minute", (byte) 14);
        setByteField(term37781, term37781.getClass(), "second", (byte) 15);
        setIntField(term37781, term37781.getClass(), "nano", 561700934);
        setField(term37776, term37776.getClass(), "time", term37781);
        setField(term37581, term37581.getClass(), "pdddt_tm", term37776);
        setIntField(term37581, term37581.getClass(), "nblss_ltt_stts", -1963228619);
        setIntField(term37581, term37581.getClass(), "nblss_ltt_tckt", -709868952);
        setIntField(term37581, term37581.getClass(), "nblss_ltt_is_opn", 847207929);
        setIntField(term37581, term37581.getClass(), "nblss_ltt_prz", -1665928103);
        setIntField(term37581, term37581.getClass(), "nblss_ltt_nxt_stts", 1574458332);
        setIntField(term37581, term37581.getClass(), "nblss_ltt_nxt_tckt", -975856245);
        setField(term37581, term37581.getClass(), "my_qst_id", "iGfMUWRvod");
        setField(term37581, term37581.getClass(), "my_qst_r_qid", "zUXaSvayQe");
        setField(term37581, term37581.getClass(), "my_qst_r_knd", "bPVcnnQPSC");
        setField(term37581, term37581.getClass(), "my_qst_r_vl", "PQLyoEKWSa");
        setField(term37581, term37581.getClass(), "my_qst_r_nflg", "HOgkhttJZS");
        setField(term37581, term37581.getClass(), "my_ccd_r_qid", "goqNSmXSSS");
        setField(term37581, term37581.getClass(), "my_ccd_r_hnd", "AkViBLdqXM");
        setField(term37581, term37581.getClass(), "my_ccd_r_vp", "UlxGFzEifL");
        setField(term37581, term37581.getClass(), "cmd", "HilHTbDKDF");
        setField(term37581, term37581.getClass(), "req_id", "IaEqlVwmNS");
        setField(term37581, term37581.getClass(), "stat", "ljNOgdPWrL");
        term37924 = new Integer(-1023366103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37924;
        callMethod(klass, "setLv_num", argTypes, term37581, args);
    }

};


