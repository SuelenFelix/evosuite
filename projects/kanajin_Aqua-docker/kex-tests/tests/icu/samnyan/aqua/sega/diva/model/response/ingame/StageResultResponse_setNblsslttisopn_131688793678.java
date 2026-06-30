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

public class StageResultResponse_setNblsslttisopn_131688793678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55434;
     Object term55777;

    public StageResultResponse_setNblsslttisopn_131688793678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55434 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term55629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55634 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term55434, term55434.getClass(), "chllng_kind", 623717232);
        setIntField(term55434, term55434.getClass(), "lv_num_old", -1413291732);
        setIntField(term55434, term55434.getClass(), "lv_pnt_old", 203264365);
        setIntField(term55434, term55434.getClass(), "lv_num", -1066281036);
        setIntField(term55434, term55434.getClass(), "lv_pnt", 30837706);
        setField(term55434, term55434.getClass(), "lv_str", "xHdHafzFSM");
        setIntField(term55434, term55434.getClass(), "lv_efct_id", 379523101);
        setIntField(term55434, term55434.getClass(), "lv_plt_id", 1017354215);
        setIntField(term55434, term55434.getClass(), "vcld_pts", 695330987);
        setIntField(term55434, term55434.getClass(), "prsnt_vcld_pts", -267289967);
        setIntField(term55434, term55434.getClass(), "cnp_cid", 773432822);
        setIntField(term55434, term55434.getClass(), "cnp_val", -488294922);
        setField(term55434, term55434.getClass(), "cnp_sp", "fAsiOEKVaH");
        setField(term55434, term55434.getClass(), "crwd_kind", "EltrILhEwT");
        setField(term55434, term55434.getClass(), "crwd_value", "wCcSeUJzhg");
        setField(term55434, term55434.getClass(), "crwd_str_0", "HlVHAsOBmJ");
        setField(term55434, term55434.getClass(), "crwd_str_1", "nyThJEXHhd");
        setIntField(term55434, term55434.getClass(), "cerwd_kind", -397161164);
        setIntField(term55434, term55434.getClass(), "cerwd_value", -703717191);
        setField(term55434, term55434.getClass(), "cerwd_str_0", "TRfRRMMCZw");
        setField(term55434, term55434.getClass(), "cerwd_str_1", "rwbfUcOMVc");
        setField(term55434, term55434.getClass(), "ttl_str_ary", "ljTkNgJRUl");
        setField(term55434, term55434.getClass(), "ttl_plt_id_ary", "siRXAywvyp");
        setField(term55434, term55434.getClass(), "ttl_desc_ary", "ZRLaReQeFg");
        setField(term55434, term55434.getClass(), "skin_id_ary", "cOcXspUxKR");
        setField(term55434, term55434.getClass(), "skin_name_ary", "JNzgWUmqtl");
        setField(term55434, term55434.getClass(), "skin_illust_ary", "UxVfWaXiSr");
        setField(term55434, term55434.getClass(), "skin_desc_ary", "yTrvklotrs");
        setIntField(term55434, term55434.getClass(), "pdddt_flg", -1255535445);
        setIntField(term55630, term55630.getClass(), "year", 2020);
        setShortField(term55630, term55630.getClass(), "month", (short) 8);
        setShortField(term55630, term55630.getClass(), "day", (short) 16);
        setField(term55629, term55629.getClass(), "date", term55630);
        setByteField(term55634, term55634.getClass(), "hour", (byte) 4);
        setByteField(term55634, term55634.getClass(), "minute", (byte) 37);
        setByteField(term55634, term55634.getClass(), "second", (byte) 19);
        setIntField(term55634, term55634.getClass(), "nano", 605410923);
        setField(term55629, term55629.getClass(), "time", term55634);
        setField(term55434, term55434.getClass(), "pdddt_tm", term55629);
        setIntField(term55434, term55434.getClass(), "nblss_ltt_stts", -2033952124);
        setIntField(term55434, term55434.getClass(), "nblss_ltt_tckt", 560401653);
        setIntField(term55434, term55434.getClass(), "nblss_ltt_is_opn", 1633691536);
        setIntField(term55434, term55434.getClass(), "nblss_ltt_prz", 898165245);
        setIntField(term55434, term55434.getClass(), "nblss_ltt_nxt_stts", 1810754549);
        setIntField(term55434, term55434.getClass(), "nblss_ltt_nxt_tckt", 338342107);
        setField(term55434, term55434.getClass(), "my_qst_id", "kNkFIdfwqs");
        setField(term55434, term55434.getClass(), "my_qst_r_qid", "sHLdqoTjnP");
        setField(term55434, term55434.getClass(), "my_qst_r_knd", "UakuVGzEav");
        setField(term55434, term55434.getClass(), "my_qst_r_vl", "DxiwTTouEo");
        setField(term55434, term55434.getClass(), "my_qst_r_nflg", "ghoklPMuMt");
        setField(term55434, term55434.getClass(), "my_ccd_r_qid", "uAgfQbLPeZ");
        setField(term55434, term55434.getClass(), "my_ccd_r_hnd", "aZiFZfzhQT");
        setField(term55434, term55434.getClass(), "my_ccd_r_vp", "HbzAbCwWRh");
        setField(term55434, term55434.getClass(), "cmd", "yBgWgFtVxP");
        setField(term55434, term55434.getClass(), "req_id", "NAwiEDVBcB");
        setField(term55434, term55434.getClass(), "stat", "jxuVQHHLqy");
        term55777 = new Integer(-650288950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55777;
        callMethod(klass, "setNblss_ltt_is_opn", argTypes, term55434, args);
    }

};


