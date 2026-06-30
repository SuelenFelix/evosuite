package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StartResponse_setMdleqpary_168396856373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154223;

    public StartResponse_setMdleqpary_168396856373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term154684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term154683 = ((Class) term154684).getDeclaredField((String) "FAILED");
        ((Field) term154683).setAccessible(true);
        Object enum366 = ((Field) term154683).get((Object) null);
        Class<? extends Object> term154949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term154948 = ((Class) term154949).getDeclaredField((String) "COMPLEXITY");
        ((Field) term154948).setAccessible(true);
        Object enum367 = ((Field) term154948).get((Object) null);
        Class<? extends Object> term155286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term155285 = ((Class) term155286).getDeclaredField((String) "UNDEFINED");
        ((Field) term155285).setAccessible(true);
        Object enum368 = ((Field) term155285).get((Object) null);
        Class<? extends Object> term155570 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term155569 = ((Class) term155570).getDeclaredField((String) "ORIGINAL");
        ((Field) term155569).setAccessible(true);
        Object enum369 = ((Field) term155569).get((Object) null);
        Class<? extends Object> term155886 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term155885 = ((Class) term155886).getDeclaredField((String) "BRONZE");
        ((Field) term155885).setAccessible(true);
        Object enum370 = ((Field) term155885).get((Object) null);
        term154223 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term154321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154326 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term154223, term154223.getClass(), "pd_id", -1584779593);
        setField(term154223, term154223.getClass(), "start_result", enum366);
        setIntField(term154223, term154223.getClass(), "accept_idx", 303007547);
        setIntField(term154223, term154223.getClass(), "start_idx", 1498738343);
        setField(term154223, term154223.getClass(), "player_name", "gqMysJhxfA");
        setIntField(term154223, term154223.getClass(), "hp_vol", -1635571857);
        setBooleanField(term154223, term154223.getClass(), "btn_se_vol", true);
        setIntField(term154223, term154223.getClass(), "btn_se_vol2", 1407309162);
        setIntField(term154223, term154223.getClass(), "sldr_se_vol2", -534033672);
        setField(term154223, term154223.getClass(), "sort_kind", enum367);
        setIntField(term154223, term154223.getClass(), "lv_num", -1162790806);
        setIntField(term154223, term154223.getClass(), "lv_pnt", -1264595049);
        setField(term154223, term154223.getClass(), "lv_str", "HtLEppUqzI");
        setIntField(term154223, term154223.getClass(), "lv_efct_id", -2058884635);
        setIntField(term154223, term154223.getClass(), "lv_plt_id", 1064185088);
        setField(term154223, term154223.getClass(), "mdl_eqp_ary", "bVlRrMQeRY");
        setField(term154223, term154223.getClass(), "c_itm_eqp_ary", "SXaXhlzAIB");
        setField(term154223, term154223.getClass(), "ms_itm_flg_ary", "UPVTXSXUNh");
        setIntField(term154322, term154322.getClass(), "year", 2018);
        setShortField(term154322, term154322.getClass(), "month", (short) 11);
        setShortField(term154322, term154322.getClass(), "day", (short) 9);
        setField(term154321, term154321.getClass(), "date", term154322);
        setByteField(term154326, term154326.getClass(), "hour", (byte) 6);
        setByteField(term154326, term154326.getClass(), "minute", (byte) 8);
        setByteField(term154326, term154326.getClass(), "second", (byte) 32);
        setIntField(term154326, term154326.getClass(), "nano", 750733310);
        setField(term154321, term154321.getClass(), "time", term154326);
        setField(term154223, term154223.getClass(), "mdl_eqp_tm", term154321);
        setField(term154223, term154223.getClass(), "mdl_have", "cjCXbXuiFn");
        setField(term154223, term154223.getClass(), "cstmz_itm_have", "fhdhDeWdoi");
        setBooleanField(term154223, term154223.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term154223, term154223.getClass(), "use_mdl_pri", true);
        setBooleanField(term154223, term154223.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term154223, term154223.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term154223, term154223.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term154223, term154223.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term154223, term154223.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term154223, term154223.getClass(), "vcld_pts", -1249782654);
        setIntField(term154223, term154223.getClass(), "nxt_pv_id", 399302934);
        setField(term154223, term154223.getClass(), "nxt_dffclty", enum368);
        setField(term154223, term154223.getClass(), "nxt_edtn", enum369);
        setField(term154223, term154223.getClass(), "cv_cid", "FqrcltWSUd");
        setField(term154223, term154223.getClass(), "cv_sc", "kAbILlhsZw");
        setField(term154223, term154223.getClass(), "cv_rr", "QsIOCSpRow");
        setField(term154223, term154223.getClass(), "cv_bv", "gcFzvYOUch");
        setField(term154223, term154223.getClass(), "cv_bf", "NnFSMXLOUA");
        setIntField(term154223, term154223.getClass(), "cnp_cid", -1823255084);
        setIntField(term154223, term154223.getClass(), "cnp_val", 793345010);
        setField(term154223, term154223.getClass(), "cnp_rr", enum370);
        setField(term154223, term154223.getClass(), "cnp_sp", "bacruLIvDW");
        setField(term154223, term154223.getClass(), "my_lst_0", "ydbVEuslYx");
        setField(term154223, term154223.getClass(), "my_lst_1", "DKWEhukBpG");
        setField(term154223, term154223.getClass(), "my_lst_2", "YaowqyqxBH");
        setField(term154223, term154223.getClass(), "my_lst_3", "dbxhsKyZWZ");
        setField(term154223, term154223.getClass(), "my_lst_4", "oXxafKyyrx");
        setField(term154223, term154223.getClass(), "dsp_clr_brdr", "TapDFGQNLY");
        setBooleanField(term154223, term154223.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term154223, term154223.getClass(), "dsp_clr_sts", false);
        setField(term154223, term154223.getClass(), "clr_sts", "vgHeAegSfV");
        setBooleanField(term154223, term154223.getClass(), "rgo_sts", false);
        setField(term154223, term154223.getClass(), "my_qst_id", "qShfKMgKGs");
        setField(term154223, term154223.getClass(), "my_qst_sts", "bLCaDnEUyS");
        setField(term154223, term154223.getClass(), "my_qst_prgrs", "yfHcOCDrGy");
        setField(term154223, term154223.getClass(), "my_qst_et", "juKqILstcn");
        setField(term154223, term154223.getClass(), "p_std_ie_have", "QSCQJRyiPa");
        setField(term154223, term154223.getClass(), "p_std_se_have", "jPPOVoAOLQ");
        setField(term154223, term154223.getClass(), "cmd", "kZKzEkUFFI");
        setField(term154223, term154223.getClass(), "req_id", "dnYvoLZjCf");
        setField(term154223, term154223.getClass(), "stat", "ZsvLlzqETk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DqrZwuHriF";
        callMethod(klass, "setMdl_eqp_ary", argTypes, term154223, args);
    }

};


