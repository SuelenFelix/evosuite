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

public class StageResultResponse_setLvpntold_8829584948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36976;
     Object term37319;

    public StageResultResponse_setLvpntold_8829584948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36976 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term37171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37176 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term36976, term36976.getClass(), "chllng_kind", -1330529019);
        setIntField(term36976, term36976.getClass(), "lv_num_old", 237134844);
        setIntField(term36976, term36976.getClass(), "lv_pnt_old", 2076413861);
        setIntField(term36976, term36976.getClass(), "lv_num", 66817373);
        setIntField(term36976, term36976.getClass(), "lv_pnt", 1459628013);
        setField(term36976, term36976.getClass(), "lv_str", "JTPAQsfRtT");
        setIntField(term36976, term36976.getClass(), "lv_efct_id", -1641507499);
        setIntField(term36976, term36976.getClass(), "lv_plt_id", -33436796);
        setIntField(term36976, term36976.getClass(), "vcld_pts", -1527326823);
        setIntField(term36976, term36976.getClass(), "prsnt_vcld_pts", 469871899);
        setIntField(term36976, term36976.getClass(), "cnp_cid", -1348703436);
        setIntField(term36976, term36976.getClass(), "cnp_val", -2027012650);
        setField(term36976, term36976.getClass(), "cnp_sp", "otxkkKfDfl");
        setField(term36976, term36976.getClass(), "crwd_kind", "bqIuFFFwnP");
        setField(term36976, term36976.getClass(), "crwd_value", "hDxvvVgGlk");
        setField(term36976, term36976.getClass(), "crwd_str_0", "XdjSvjaTqk");
        setField(term36976, term36976.getClass(), "crwd_str_1", "ukrlYVcvsg");
        setIntField(term36976, term36976.getClass(), "cerwd_kind", 1343432022);
        setIntField(term36976, term36976.getClass(), "cerwd_value", -1767079160);
        setField(term36976, term36976.getClass(), "cerwd_str_0", "cpjqTCNflQ");
        setField(term36976, term36976.getClass(), "cerwd_str_1", "wiYGATEfmw");
        setField(term36976, term36976.getClass(), "ttl_str_ary", "FiALSqneIg");
        setField(term36976, term36976.getClass(), "ttl_plt_id_ary", "lGVACSQceQ");
        setField(term36976, term36976.getClass(), "ttl_desc_ary", "jpgWRbSvyQ");
        setField(term36976, term36976.getClass(), "skin_id_ary", "tFMlYmPEBX");
        setField(term36976, term36976.getClass(), "skin_name_ary", "ljkZxGNgjZ");
        setField(term36976, term36976.getClass(), "skin_illust_ary", "hrFtgdcZKS");
        setField(term36976, term36976.getClass(), "skin_desc_ary", "ZhZJvpPaTU");
        setIntField(term36976, term36976.getClass(), "pdddt_flg", -201010601);
        setIntField(term37172, term37172.getClass(), "year", 2013);
        setShortField(term37172, term37172.getClass(), "month", (short) 5);
        setShortField(term37172, term37172.getClass(), "day", (short) 26);
        setField(term37171, term37171.getClass(), "date", term37172);
        setByteField(term37176, term37176.getClass(), "hour", (byte) 4);
        setByteField(term37176, term37176.getClass(), "minute", (byte) 39);
        setByteField(term37176, term37176.getClass(), "second", (byte) 5);
        setIntField(term37176, term37176.getClass(), "nano", 392869354);
        setField(term37171, term37171.getClass(), "time", term37176);
        setField(term36976, term36976.getClass(), "pdddt_tm", term37171);
        setIntField(term36976, term36976.getClass(), "nblss_ltt_stts", 2060027076);
        setIntField(term36976, term36976.getClass(), "nblss_ltt_tckt", 2084868811);
        setIntField(term36976, term36976.getClass(), "nblss_ltt_is_opn", 314478878);
        setIntField(term36976, term36976.getClass(), "nblss_ltt_prz", 1425342686);
        setIntField(term36976, term36976.getClass(), "nblss_ltt_nxt_stts", -1042470635);
        setIntField(term36976, term36976.getClass(), "nblss_ltt_nxt_tckt", -524352937);
        setField(term36976, term36976.getClass(), "my_qst_id", "NZwUsJxDLI");
        setField(term36976, term36976.getClass(), "my_qst_r_qid", "wlusYBOfXW");
        setField(term36976, term36976.getClass(), "my_qst_r_knd", "HEWWLhfKIa");
        setField(term36976, term36976.getClass(), "my_qst_r_vl", "mJJkYzNPob");
        setField(term36976, term36976.getClass(), "my_qst_r_nflg", "mRDwekkZQg");
        setField(term36976, term36976.getClass(), "my_ccd_r_qid", "RIGChgqpTI");
        setField(term36976, term36976.getClass(), "my_ccd_r_hnd", "YCrgXnhgoK");
        setField(term36976, term36976.getClass(), "my_ccd_r_vp", "nQodIeQekM");
        setField(term36976, term36976.getClass(), "cmd", "YXORpHCDcd");
        setField(term36976, term36976.getClass(), "req_id", "XzZbAcRADD");
        setField(term36976, term36976.getClass(), "stat", "UqSNWSoTRy");
        term37319 = new Integer(1472218987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37319;
        callMethod(klass, "setLv_pnt_old", argTypes, term36976, args);
    }

};


