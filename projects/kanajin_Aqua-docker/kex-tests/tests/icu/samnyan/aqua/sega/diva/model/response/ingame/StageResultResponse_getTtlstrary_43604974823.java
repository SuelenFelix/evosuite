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

public class StageResultResponse_getTtlstrary_43604974823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21897;

    public StageResultResponse_getTtlstrary_43604974823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21897 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term22092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22097 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21897, term21897.getClass(), "chllng_kind", -763166094);
        setIntField(term21897, term21897.getClass(), "lv_num_old", -222941705);
        setIntField(term21897, term21897.getClass(), "lv_pnt_old", 291864719);
        setIntField(term21897, term21897.getClass(), "lv_num", -1549607466);
        setIntField(term21897, term21897.getClass(), "lv_pnt", 853609788);
        setField(term21897, term21897.getClass(), "lv_str", "fRujHWvXjJ");
        setIntField(term21897, term21897.getClass(), "lv_efct_id", -197820800);
        setIntField(term21897, term21897.getClass(), "lv_plt_id", 723812297);
        setIntField(term21897, term21897.getClass(), "vcld_pts", 1639448749);
        setIntField(term21897, term21897.getClass(), "prsnt_vcld_pts", 873659088);
        setIntField(term21897, term21897.getClass(), "cnp_cid", -975748721);
        setIntField(term21897, term21897.getClass(), "cnp_val", 433248783);
        setField(term21897, term21897.getClass(), "cnp_sp", "EAIAAStlTz");
        setField(term21897, term21897.getClass(), "crwd_kind", "yIWXcOQTgy");
        setField(term21897, term21897.getClass(), "crwd_value", "xAWekqanqc");
        setField(term21897, term21897.getClass(), "crwd_str_0", "GSOWFHMlbF");
        setField(term21897, term21897.getClass(), "crwd_str_1", "vpZIqpFbKM");
        setIntField(term21897, term21897.getClass(), "cerwd_kind", -507944154);
        setIntField(term21897, term21897.getClass(), "cerwd_value", -1736183862);
        setField(term21897, term21897.getClass(), "cerwd_str_0", "dAbwpJCDif");
        setField(term21897, term21897.getClass(), "cerwd_str_1", "ATSXJPySio");
        setField(term21897, term21897.getClass(), "ttl_str_ary", "XZkOUcbfFg");
        setField(term21897, term21897.getClass(), "ttl_plt_id_ary", "TGiJfagfky");
        setField(term21897, term21897.getClass(), "ttl_desc_ary", "BJklinBmhN");
        setField(term21897, term21897.getClass(), "skin_id_ary", "IOddzvEWcl");
        setField(term21897, term21897.getClass(), "skin_name_ary", "bIrtpkYJWT");
        setField(term21897, term21897.getClass(), "skin_illust_ary", "VuLLXpvPpZ");
        setField(term21897, term21897.getClass(), "skin_desc_ary", "UEdzEKEEEV");
        setIntField(term21897, term21897.getClass(), "pdddt_flg", 897010381);
        setIntField(term22093, term22093.getClass(), "year", 2015);
        setShortField(term22093, term22093.getClass(), "month", (short) 3);
        setShortField(term22093, term22093.getClass(), "day", (short) 10);
        setField(term22092, term22092.getClass(), "date", term22093);
        setByteField(term22097, term22097.getClass(), "hour", (byte) 23);
        setByteField(term22097, term22097.getClass(), "minute", (byte) 34);
        setByteField(term22097, term22097.getClass(), "second", (byte) 44);
        setIntField(term22097, term22097.getClass(), "nano", 587322824);
        setField(term22092, term22092.getClass(), "time", term22097);
        setField(term21897, term21897.getClass(), "pdddt_tm", term22092);
        setIntField(term21897, term21897.getClass(), "nblss_ltt_stts", -15712667);
        setIntField(term21897, term21897.getClass(), "nblss_ltt_tckt", 1964967720);
        setIntField(term21897, term21897.getClass(), "nblss_ltt_is_opn", 1351900243);
        setIntField(term21897, term21897.getClass(), "nblss_ltt_prz", -330897705);
        setIntField(term21897, term21897.getClass(), "nblss_ltt_nxt_stts", 1065595802);
        setIntField(term21897, term21897.getClass(), "nblss_ltt_nxt_tckt", 21031843);
        setField(term21897, term21897.getClass(), "my_qst_id", "BcENaQFYSd");
        setField(term21897, term21897.getClass(), "my_qst_r_qid", "POPYycoDBy");
        setField(term21897, term21897.getClass(), "my_qst_r_knd", "LuWMOXdAPA");
        setField(term21897, term21897.getClass(), "my_qst_r_vl", "blSffTnsOv");
        setField(term21897, term21897.getClass(), "my_qst_r_nflg", "qbUMcIvEXH");
        setField(term21897, term21897.getClass(), "my_ccd_r_qid", "TVxGTjeDcu");
        setField(term21897, term21897.getClass(), "my_ccd_r_hnd", "ABPtcyCzkR");
        setField(term21897, term21897.getClass(), "my_ccd_r_vp", "QgHhxMyKvr");
        setField(term21897, term21897.getClass(), "cmd", "VGiXZZTWRO");
        setField(term21897, term21897.getClass(), "req_id", "MlPtwXnJOJ");
        setField(term21897, term21897.getClass(), "stat", "DbfiyFeaTe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTtl_str_ary", argTypes, term21897, args);
    }

};


