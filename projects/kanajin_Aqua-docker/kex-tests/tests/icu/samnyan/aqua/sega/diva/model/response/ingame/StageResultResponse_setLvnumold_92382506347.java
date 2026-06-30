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

public class StageResultResponse_setLvnumold_92382506347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36371;
     Object term36714;

    public StageResultResponse_setLvnumold_92382506347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36371 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term36566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36571 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term36371, term36371.getClass(), "chllng_kind", -897937940);
        setIntField(term36371, term36371.getClass(), "lv_num_old", 1523261232);
        setIntField(term36371, term36371.getClass(), "lv_pnt_old", -428988337);
        setIntField(term36371, term36371.getClass(), "lv_num", 48047085);
        setIntField(term36371, term36371.getClass(), "lv_pnt", 1902784843);
        setField(term36371, term36371.getClass(), "lv_str", "QbfKDAwhSB");
        setIntField(term36371, term36371.getClass(), "lv_efct_id", 2021136615);
        setIntField(term36371, term36371.getClass(), "lv_plt_id", 1778570695);
        setIntField(term36371, term36371.getClass(), "vcld_pts", -1142164411);
        setIntField(term36371, term36371.getClass(), "prsnt_vcld_pts", -1619435313);
        setIntField(term36371, term36371.getClass(), "cnp_cid", 1013801066);
        setIntField(term36371, term36371.getClass(), "cnp_val", 1512541853);
        setField(term36371, term36371.getClass(), "cnp_sp", "ckTRHEIcCK");
        setField(term36371, term36371.getClass(), "crwd_kind", "NYSBqIpNlD");
        setField(term36371, term36371.getClass(), "crwd_value", "OWglDUWQYb");
        setField(term36371, term36371.getClass(), "crwd_str_0", "FiqETbKjpv");
        setField(term36371, term36371.getClass(), "crwd_str_1", "FxXtdhhXyS");
        setIntField(term36371, term36371.getClass(), "cerwd_kind", -965421502);
        setIntField(term36371, term36371.getClass(), "cerwd_value", 1319026002);
        setField(term36371, term36371.getClass(), "cerwd_str_0", "HxCEzaCcgj");
        setField(term36371, term36371.getClass(), "cerwd_str_1", "PDYPOQncAB");
        setField(term36371, term36371.getClass(), "ttl_str_ary", "cHqLMqZSmc");
        setField(term36371, term36371.getClass(), "ttl_plt_id_ary", "hkWmAkXSOW");
        setField(term36371, term36371.getClass(), "ttl_desc_ary", "DwQmZEKeOp");
        setField(term36371, term36371.getClass(), "skin_id_ary", "DbxrFiyttv");
        setField(term36371, term36371.getClass(), "skin_name_ary", "iVIrSxTsaM");
        setField(term36371, term36371.getClass(), "skin_illust_ary", "FmJNEfmYgq");
        setField(term36371, term36371.getClass(), "skin_desc_ary", "NqQofgWsJd");
        setIntField(term36371, term36371.getClass(), "pdddt_flg", -1368173231);
        setIntField(term36567, term36567.getClass(), "year", 2027);
        setShortField(term36567, term36567.getClass(), "month", (short) 8);
        setShortField(term36567, term36567.getClass(), "day", (short) 23);
        setField(term36566, term36566.getClass(), "date", term36567);
        setByteField(term36571, term36571.getClass(), "hour", (byte) 15);
        setByteField(term36571, term36571.getClass(), "minute", (byte) 12);
        setByteField(term36571, term36571.getClass(), "second", (byte) 6);
        setIntField(term36571, term36571.getClass(), "nano", 541218258);
        setField(term36566, term36566.getClass(), "time", term36571);
        setField(term36371, term36371.getClass(), "pdddt_tm", term36566);
        setIntField(term36371, term36371.getClass(), "nblss_ltt_stts", 1956006038);
        setIntField(term36371, term36371.getClass(), "nblss_ltt_tckt", -1062304878);
        setIntField(term36371, term36371.getClass(), "nblss_ltt_is_opn", -1377876610);
        setIntField(term36371, term36371.getClass(), "nblss_ltt_prz", -1456184732);
        setIntField(term36371, term36371.getClass(), "nblss_ltt_nxt_stts", 1689228897);
        setIntField(term36371, term36371.getClass(), "nblss_ltt_nxt_tckt", 892205855);
        setField(term36371, term36371.getClass(), "my_qst_id", "ZlVRdHsBMO");
        setField(term36371, term36371.getClass(), "my_qst_r_qid", "UMMXkhuqzw");
        setField(term36371, term36371.getClass(), "my_qst_r_knd", "KyGXZcXJwq");
        setField(term36371, term36371.getClass(), "my_qst_r_vl", "TqiCjeuoWE");
        setField(term36371, term36371.getClass(), "my_qst_r_nflg", "GWWfkXOYLP");
        setField(term36371, term36371.getClass(), "my_ccd_r_qid", "qvykDllgpT");
        setField(term36371, term36371.getClass(), "my_ccd_r_hnd", "hzdUbcLZhZ");
        setField(term36371, term36371.getClass(), "my_ccd_r_vp", "GlxnEJvYeC");
        setField(term36371, term36371.getClass(), "cmd", "SLdOGaqmNv");
        setField(term36371, term36371.getClass(), "req_id", "QZfhwDBzyR");
        setField(term36371, term36371.getClass(), "stat", "HvnMmAOZev");
        term36714 = new Integer(1955560079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36714;
        callMethod(klass, "setLv_num_old", argTypes, term36371, args);
    }

};


