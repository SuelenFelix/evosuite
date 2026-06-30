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

public class StageResultResponse_setPdddtflg_63134744474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53006;
     Object term53349;

    public StageResultResponse_setPdddtflg_63134744474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53006 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term53201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53206 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53006, term53006.getClass(), "chllng_kind", -2064148945);
        setIntField(term53006, term53006.getClass(), "lv_num_old", 494400151);
        setIntField(term53006, term53006.getClass(), "lv_pnt_old", 1588058685);
        setIntField(term53006, term53006.getClass(), "lv_num", 1677707412);
        setIntField(term53006, term53006.getClass(), "lv_pnt", -297367861);
        setField(term53006, term53006.getClass(), "lv_str", "NOSJtfgqAs");
        setIntField(term53006, term53006.getClass(), "lv_efct_id", -1133541490);
        setIntField(term53006, term53006.getClass(), "lv_plt_id", 942412391);
        setIntField(term53006, term53006.getClass(), "vcld_pts", 751596480);
        setIntField(term53006, term53006.getClass(), "prsnt_vcld_pts", 1971485144);
        setIntField(term53006, term53006.getClass(), "cnp_cid", 2059603512);
        setIntField(term53006, term53006.getClass(), "cnp_val", -1308902065);
        setField(term53006, term53006.getClass(), "cnp_sp", "SUDRrjpChc");
        setField(term53006, term53006.getClass(), "crwd_kind", "pmpprxfFwy");
        setField(term53006, term53006.getClass(), "crwd_value", "AQbnQoJwOO");
        setField(term53006, term53006.getClass(), "crwd_str_0", "NnicBPzNzw");
        setField(term53006, term53006.getClass(), "crwd_str_1", "WADNPbexnT");
        setIntField(term53006, term53006.getClass(), "cerwd_kind", 605255795);
        setIntField(term53006, term53006.getClass(), "cerwd_value", 1743438307);
        setField(term53006, term53006.getClass(), "cerwd_str_0", "rMbsSfMKvX");
        setField(term53006, term53006.getClass(), "cerwd_str_1", "oCsqRJXMBc");
        setField(term53006, term53006.getClass(), "ttl_str_ary", "npPxKNoqdS");
        setField(term53006, term53006.getClass(), "ttl_plt_id_ary", "tGgCtmAQPu");
        setField(term53006, term53006.getClass(), "ttl_desc_ary", "HokisXXNMR");
        setField(term53006, term53006.getClass(), "skin_id_ary", "JbtvoXZZHr");
        setField(term53006, term53006.getClass(), "skin_name_ary", "eMlkqCfrnK");
        setField(term53006, term53006.getClass(), "skin_illust_ary", "HCiwohQDUV");
        setField(term53006, term53006.getClass(), "skin_desc_ary", "RRWTUIdKkl");
        setIntField(term53006, term53006.getClass(), "pdddt_flg", -1122596893);
        setIntField(term53202, term53202.getClass(), "year", 2018);
        setShortField(term53202, term53202.getClass(), "month", (short) 11);
        setShortField(term53202, term53202.getClass(), "day", (short) 9);
        setField(term53201, term53201.getClass(), "date", term53202);
        setByteField(term53206, term53206.getClass(), "hour", (byte) 6);
        setByteField(term53206, term53206.getClass(), "minute", (byte) 8);
        setByteField(term53206, term53206.getClass(), "second", (byte) 32);
        setIntField(term53206, term53206.getClass(), "nano", 750733310);
        setField(term53201, term53201.getClass(), "time", term53206);
        setField(term53006, term53006.getClass(), "pdddt_tm", term53201);
        setIntField(term53006, term53006.getClass(), "nblss_ltt_stts", -2147297900);
        setIntField(term53006, term53006.getClass(), "nblss_ltt_tckt", 539095138);
        setIntField(term53006, term53006.getClass(), "nblss_ltt_is_opn", 1462297654);
        setIntField(term53006, term53006.getClass(), "nblss_ltt_prz", 1009915858);
        setIntField(term53006, term53006.getClass(), "nblss_ltt_nxt_stts", 500127209);
        setIntField(term53006, term53006.getClass(), "nblss_ltt_nxt_tckt", -1482530168);
        setField(term53006, term53006.getClass(), "my_qst_id", "pBnfJsGPNO");
        setField(term53006, term53006.getClass(), "my_qst_r_qid", "hzaRTeUQpV");
        setField(term53006, term53006.getClass(), "my_qst_r_knd", "RlIgxHiNOB");
        setField(term53006, term53006.getClass(), "my_qst_r_vl", "kSpBCSqyfl");
        setField(term53006, term53006.getClass(), "my_qst_r_nflg", "OUrtbTvuiW");
        setField(term53006, term53006.getClass(), "my_ccd_r_qid", "UnkpYLSsCR");
        setField(term53006, term53006.getClass(), "my_ccd_r_hnd", "AaxnITALtd");
        setField(term53006, term53006.getClass(), "my_ccd_r_vp", "RdnRRpWglh");
        setField(term53006, term53006.getClass(), "cmd", "YcXTXuOFYV");
        setField(term53006, term53006.getClass(), "req_id", "HGhIlMCaKM");
        setField(term53006, term53006.getClass(), "stat", "pPxivEPfHY");
        term53349 = new Integer(-432987116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53349;
        callMethod(klass, "setPdddt_flg", argTypes, term53006, args);
    }

};


