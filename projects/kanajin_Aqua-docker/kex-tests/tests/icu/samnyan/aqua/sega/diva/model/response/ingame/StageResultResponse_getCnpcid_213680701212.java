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

public class StageResultResponse_getCnpcid_213680701212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15264;

    public StageResultResponse_getCnpcid_213680701212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15264 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term15459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15464 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15264, term15264.getClass(), "chllng_kind", -525257914);
        setIntField(term15264, term15264.getClass(), "lv_num_old", 147209682);
        setIntField(term15264, term15264.getClass(), "lv_pnt_old", 34470066);
        setIntField(term15264, term15264.getClass(), "lv_num", 2058711405);
        setIntField(term15264, term15264.getClass(), "lv_pnt", 1743683601);
        setField(term15264, term15264.getClass(), "lv_str", "IEYhJmgCVd");
        setIntField(term15264, term15264.getClass(), "lv_efct_id", -945116798);
        setIntField(term15264, term15264.getClass(), "lv_plt_id", 1593461795);
        setIntField(term15264, term15264.getClass(), "vcld_pts", 515182546);
        setIntField(term15264, term15264.getClass(), "prsnt_vcld_pts", -936895502);
        setIntField(term15264, term15264.getClass(), "cnp_cid", -129547140);
        setIntField(term15264, term15264.getClass(), "cnp_val", 199287428);
        setField(term15264, term15264.getClass(), "cnp_sp", "KSJeYkkvpk");
        setField(term15264, term15264.getClass(), "crwd_kind", "qUtkFGMNUV");
        setField(term15264, term15264.getClass(), "crwd_value", "mGRiYhnMcR");
        setField(term15264, term15264.getClass(), "crwd_str_0", "NFlvfJCVPO");
        setField(term15264, term15264.getClass(), "crwd_str_1", "KarbTXFmUU");
        setIntField(term15264, term15264.getClass(), "cerwd_kind", -1195339592);
        setIntField(term15264, term15264.getClass(), "cerwd_value", -376422566);
        setField(term15264, term15264.getClass(), "cerwd_str_0", "jiUSjqwSIQ");
        setField(term15264, term15264.getClass(), "cerwd_str_1", "MgLCedQfoj");
        setField(term15264, term15264.getClass(), "ttl_str_ary", "zgKiINdgNu");
        setField(term15264, term15264.getClass(), "ttl_plt_id_ary", "zLMTXDQHYH");
        setField(term15264, term15264.getClass(), "ttl_desc_ary", "PqywFWJlpE");
        setField(term15264, term15264.getClass(), "skin_id_ary", "OzXRsFGTIp");
        setField(term15264, term15264.getClass(), "skin_name_ary", "TjWpyghUWN");
        setField(term15264, term15264.getClass(), "skin_illust_ary", "dkZFDZxcde");
        setField(term15264, term15264.getClass(), "skin_desc_ary", "WXcZEtUKlI");
        setIntField(term15264, term15264.getClass(), "pdddt_flg", 306847454);
        setIntField(term15460, term15460.getClass(), "year", 2018);
        setShortField(term15460, term15460.getClass(), "month", (short) 9);
        setShortField(term15460, term15460.getClass(), "day", (short) 28);
        setField(term15459, term15459.getClass(), "date", term15460);
        setByteField(term15464, term15464.getClass(), "hour", (byte) 3);
        setByteField(term15464, term15464.getClass(), "minute", (byte) 37);
        setByteField(term15464, term15464.getClass(), "second", (byte) 46);
        setIntField(term15464, term15464.getClass(), "nano", 763326845);
        setField(term15459, term15459.getClass(), "time", term15464);
        setField(term15264, term15264.getClass(), "pdddt_tm", term15459);
        setIntField(term15264, term15264.getClass(), "nblss_ltt_stts", 1745276158);
        setIntField(term15264, term15264.getClass(), "nblss_ltt_tckt", 2009020256);
        setIntField(term15264, term15264.getClass(), "nblss_ltt_is_opn", 2049577015);
        setIntField(term15264, term15264.getClass(), "nblss_ltt_prz", 1236004505);
        setIntField(term15264, term15264.getClass(), "nblss_ltt_nxt_stts", 1050765721);
        setIntField(term15264, term15264.getClass(), "nblss_ltt_nxt_tckt", 474518942);
        setField(term15264, term15264.getClass(), "my_qst_id", "IkpjUOuWQU");
        setField(term15264, term15264.getClass(), "my_qst_r_qid", "boSSpezHeU");
        setField(term15264, term15264.getClass(), "my_qst_r_knd", "OUeBWNTQDh");
        setField(term15264, term15264.getClass(), "my_qst_r_vl", "gltJarNuUk");
        setField(term15264, term15264.getClass(), "my_qst_r_nflg", "ZwZIDwYcSW");
        setField(term15264, term15264.getClass(), "my_ccd_r_qid", "sOdkipUKRu");
        setField(term15264, term15264.getClass(), "my_ccd_r_hnd", "oKwCDqywym");
        setField(term15264, term15264.getClass(), "my_ccd_r_vp", "zjZYTddemL");
        setField(term15264, term15264.getClass(), "cmd", "QtrylgCLiF");
        setField(term15264, term15264.getClass(), "req_id", "orEuhCStGM");
        setField(term15264, term15264.getClass(), "stat", "HhEaSXWvrY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_cid", argTypes, term15264, args);
    }

};


