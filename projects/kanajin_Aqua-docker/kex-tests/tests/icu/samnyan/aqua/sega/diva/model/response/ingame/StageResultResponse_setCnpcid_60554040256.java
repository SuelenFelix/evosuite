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

public class StageResultResponse_setCnpcid_60554040256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41836;
     Object term42179;

    public StageResultResponse_setCnpcid_60554040256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41836 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term42031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42036 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term41836, term41836.getClass(), "chllng_kind", 1378805929);
        setIntField(term41836, term41836.getClass(), "lv_num_old", 695052304);
        setIntField(term41836, term41836.getClass(), "lv_pnt_old", -179937218);
        setIntField(term41836, term41836.getClass(), "lv_num", 940896043);
        setIntField(term41836, term41836.getClass(), "lv_pnt", -1156002984);
        setField(term41836, term41836.getClass(), "lv_str", "IWNJVfvTuw");
        setIntField(term41836, term41836.getClass(), "lv_efct_id", 1676254730);
        setIntField(term41836, term41836.getClass(), "lv_plt_id", -1661200819);
        setIntField(term41836, term41836.getClass(), "vcld_pts", -235039141);
        setIntField(term41836, term41836.getClass(), "prsnt_vcld_pts", -1414233013);
        setIntField(term41836, term41836.getClass(), "cnp_cid", -1174440096);
        setIntField(term41836, term41836.getClass(), "cnp_val", -679614653);
        setField(term41836, term41836.getClass(), "cnp_sp", "DLpKfwPpvr");
        setField(term41836, term41836.getClass(), "crwd_kind", "DLFXidLbuT");
        setField(term41836, term41836.getClass(), "crwd_value", "FjkxfTXGIH");
        setField(term41836, term41836.getClass(), "crwd_str_0", "KJkWSFFnmR");
        setField(term41836, term41836.getClass(), "crwd_str_1", "FBYRIDZvmW");
        setIntField(term41836, term41836.getClass(), "cerwd_kind", -561851867);
        setIntField(term41836, term41836.getClass(), "cerwd_value", -1809928454);
        setField(term41836, term41836.getClass(), "cerwd_str_0", "IyjLfrDZrV");
        setField(term41836, term41836.getClass(), "cerwd_str_1", "BRMTHqqoRg");
        setField(term41836, term41836.getClass(), "ttl_str_ary", "nOElYZBeyU");
        setField(term41836, term41836.getClass(), "ttl_plt_id_ary", "eUXPtGmoNg");
        setField(term41836, term41836.getClass(), "ttl_desc_ary", "ZjqXyUmAJY");
        setField(term41836, term41836.getClass(), "skin_id_ary", "pjEERkBbYo");
        setField(term41836, term41836.getClass(), "skin_name_ary", "FQPqmjhWog");
        setField(term41836, term41836.getClass(), "skin_illust_ary", "sYtJsiIiSX");
        setField(term41836, term41836.getClass(), "skin_desc_ary", "KgfsAwTFFn");
        setIntField(term41836, term41836.getClass(), "pdddt_flg", -191639503);
        setIntField(term42032, term42032.getClass(), "year", 2011);
        setShortField(term42032, term42032.getClass(), "month", (short) 9);
        setShortField(term42032, term42032.getClass(), "day", (short) 25);
        setField(term42031, term42031.getClass(), "date", term42032);
        setByteField(term42036, term42036.getClass(), "hour", (byte) 16);
        setByteField(term42036, term42036.getClass(), "minute", (byte) 45);
        setByteField(term42036, term42036.getClass(), "second", (byte) 19);
        setIntField(term42036, term42036.getClass(), "nano", 962864785);
        setField(term42031, term42031.getClass(), "time", term42036);
        setField(term41836, term41836.getClass(), "pdddt_tm", term42031);
        setIntField(term41836, term41836.getClass(), "nblss_ltt_stts", -1563700756);
        setIntField(term41836, term41836.getClass(), "nblss_ltt_tckt", -208314837);
        setIntField(term41836, term41836.getClass(), "nblss_ltt_is_opn", 697841387);
        setIntField(term41836, term41836.getClass(), "nblss_ltt_prz", -1749591213);
        setIntField(term41836, term41836.getClass(), "nblss_ltt_nxt_stts", 1703093401);
        setIntField(term41836, term41836.getClass(), "nblss_ltt_nxt_tckt", 47607734);
        setField(term41836, term41836.getClass(), "my_qst_id", "hFnFlgThhp");
        setField(term41836, term41836.getClass(), "my_qst_r_qid", "aEZAnHuGSR");
        setField(term41836, term41836.getClass(), "my_qst_r_knd", "uMzGGnJFYF");
        setField(term41836, term41836.getClass(), "my_qst_r_vl", "iAIRLRjFkP");
        setField(term41836, term41836.getClass(), "my_qst_r_nflg", "cdXvvxXVTz");
        setField(term41836, term41836.getClass(), "my_ccd_r_qid", "tXsfWIqIPn");
        setField(term41836, term41836.getClass(), "my_ccd_r_hnd", "tDmfqEyHaN");
        setField(term41836, term41836.getClass(), "my_ccd_r_vp", "mTSMXFkWRr");
        setField(term41836, term41836.getClass(), "cmd", "qdIiMKwfzT");
        setField(term41836, term41836.getClass(), "req_id", "qrmUWIxufo");
        setField(term41836, term41836.getClass(), "stat", "SeWCUkXfZv");
        term42179 = new Integer(1717232691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42179;
        callMethod(klass, "setCnp_cid", argTypes, term41836, args);
    }

};


