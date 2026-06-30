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

public class StageResultResponse_getTtlpltidary_190343671924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22500;

    public StageResultResponse_getTtlpltidary_190343671924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22500 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term22695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22700 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22500, term22500.getClass(), "chllng_kind", -380787857);
        setIntField(term22500, term22500.getClass(), "lv_num_old", 319853052);
        setIntField(term22500, term22500.getClass(), "lv_pnt_old", -1097563716);
        setIntField(term22500, term22500.getClass(), "lv_num", 1572907769);
        setIntField(term22500, term22500.getClass(), "lv_pnt", 1608016787);
        setField(term22500, term22500.getClass(), "lv_str", "dQxXGBtDLZ");
        setIntField(term22500, term22500.getClass(), "lv_efct_id", -516303035);
        setIntField(term22500, term22500.getClass(), "lv_plt_id", -2143043890);
        setIntField(term22500, term22500.getClass(), "vcld_pts", -2138825831);
        setIntField(term22500, term22500.getClass(), "prsnt_vcld_pts", 1454781562);
        setIntField(term22500, term22500.getClass(), "cnp_cid", -27944011);
        setIntField(term22500, term22500.getClass(), "cnp_val", -20614472);
        setField(term22500, term22500.getClass(), "cnp_sp", "EgSgEFIyyN");
        setField(term22500, term22500.getClass(), "crwd_kind", "iAOFcXaLSf");
        setField(term22500, term22500.getClass(), "crwd_value", "EHoNUaeyvT");
        setField(term22500, term22500.getClass(), "crwd_str_0", "ZwKmasCVIy");
        setField(term22500, term22500.getClass(), "crwd_str_1", "pxokrVaeMd");
        setIntField(term22500, term22500.getClass(), "cerwd_kind", 1126618861);
        setIntField(term22500, term22500.getClass(), "cerwd_value", 947449400);
        setField(term22500, term22500.getClass(), "cerwd_str_0", "ujxmmZZcbT");
        setField(term22500, term22500.getClass(), "cerwd_str_1", "BOvgwHfoHQ");
        setField(term22500, term22500.getClass(), "ttl_str_ary", "hPpFNeDBIb");
        setField(term22500, term22500.getClass(), "ttl_plt_id_ary", "DNOtiLPAIY");
        setField(term22500, term22500.getClass(), "ttl_desc_ary", "FnEkAHBfyV");
        setField(term22500, term22500.getClass(), "skin_id_ary", "VfmNFpEuax");
        setField(term22500, term22500.getClass(), "skin_name_ary", "ANHjlWPmZG");
        setField(term22500, term22500.getClass(), "skin_illust_ary", "SibzENsyyy");
        setField(term22500, term22500.getClass(), "skin_desc_ary", "mrqGHotaef");
        setIntField(term22500, term22500.getClass(), "pdddt_flg", -763799087);
        setIntField(term22696, term22696.getClass(), "year", 2027);
        setShortField(term22696, term22696.getClass(), "month", (short) 8);
        setShortField(term22696, term22696.getClass(), "day", (short) 26);
        setField(term22695, term22695.getClass(), "date", term22696);
        setByteField(term22700, term22700.getClass(), "hour", (byte) 5);
        setByteField(term22700, term22700.getClass(), "minute", (byte) 11);
        setByteField(term22700, term22700.getClass(), "second", (byte) 9);
        setIntField(term22700, term22700.getClass(), "nano", 219245092);
        setField(term22695, term22695.getClass(), "time", term22700);
        setField(term22500, term22500.getClass(), "pdddt_tm", term22695);
        setIntField(term22500, term22500.getClass(), "nblss_ltt_stts", 1207142014);
        setIntField(term22500, term22500.getClass(), "nblss_ltt_tckt", -876426634);
        setIntField(term22500, term22500.getClass(), "nblss_ltt_is_opn", 213831054);
        setIntField(term22500, term22500.getClass(), "nblss_ltt_prz", 330043745);
        setIntField(term22500, term22500.getClass(), "nblss_ltt_nxt_stts", -509349195);
        setIntField(term22500, term22500.getClass(), "nblss_ltt_nxt_tckt", -1639041228);
        setField(term22500, term22500.getClass(), "my_qst_id", "UbZGBpQZQW");
        setField(term22500, term22500.getClass(), "my_qst_r_qid", "SvGTualQPa");
        setField(term22500, term22500.getClass(), "my_qst_r_knd", "mdxcgZwsaP");
        setField(term22500, term22500.getClass(), "my_qst_r_vl", "XildIRoZHG");
        setField(term22500, term22500.getClass(), "my_qst_r_nflg", "lEcrFlxJXH");
        setField(term22500, term22500.getClass(), "my_ccd_r_qid", "VNdDwXMYxR");
        setField(term22500, term22500.getClass(), "my_ccd_r_hnd", "bVbexZPmwW");
        setField(term22500, term22500.getClass(), "my_ccd_r_vp", "tvxYdqiyGc");
        setField(term22500, term22500.getClass(), "cmd", "ZEXFoMSKeG");
        setField(term22500, term22500.getClass(), "req_id", "HvxahUfZcJ");
        setField(term22500, term22500.getClass(), "stat", "WkLpmqoQxy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTtl_plt_id_ary", argTypes, term22500, args);
    }

};


