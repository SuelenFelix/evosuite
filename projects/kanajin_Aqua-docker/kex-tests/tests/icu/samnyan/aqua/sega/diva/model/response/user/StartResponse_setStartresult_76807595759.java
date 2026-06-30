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

public class StartResponse_setStartresult_76807595759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124735;
     Object enum295;

    public StartResponse_setStartresult_76807595759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term125178 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term125177 = ((Class) term125178).getDeclaredField((String) "FAILED");
        ((Field) term125177).setAccessible(true);
        enum295 = ((Field) term125177).get((Object) null);
        Class<? extends Object> term125443 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term125442 = ((Class) term125443).getDeclaredField((String) "NAME");
        ((Field) term125442).setAccessible(true);
        Object enum296 = ((Field) term125442).get((Object) null);
        Class<? extends Object> term125762 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term125761 = ((Class) term125762).getDeclaredField((String) "UNDEFINED");
        ((Field) term125761).setAccessible(true);
        Object enum297 = ((Field) term125761).get((Object) null);
        Class<? extends Object> term126046 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term126045 = ((Class) term126046).getDeclaredField((String) "ORIGINAL");
        ((Field) term126045).setAccessible(true);
        Object enum298 = ((Field) term126045).get((Object) null);
        Class<? extends Object> term126362 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term126361 = ((Class) term126362).getDeclaredField((String) "BRONZE");
        ((Field) term126361).setAccessible(true);
        Object enum299 = ((Field) term126361).get((Object) null);
        term124735 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term124827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124832 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term124735, term124735.getClass(), "pd_id", -1885268968);
        setField(term124735, term124735.getClass(), "start_result", enum295);
        setIntField(term124735, term124735.getClass(), "accept_idx", 277855691);
        setIntField(term124735, term124735.getClass(), "start_idx", 675891483);
        setField(term124735, term124735.getClass(), "player_name", "IoRhBfdSuN");
        setIntField(term124735, term124735.getClass(), "hp_vol", -317900470);
        setBooleanField(term124735, term124735.getClass(), "btn_se_vol", true);
        setIntField(term124735, term124735.getClass(), "btn_se_vol2", -979568);
        setIntField(term124735, term124735.getClass(), "sldr_se_vol2", -1422131197);
        setField(term124735, term124735.getClass(), "sort_kind", enum296);
        setIntField(term124735, term124735.getClass(), "lv_num", -20399281);
        setIntField(term124735, term124735.getClass(), "lv_pnt", -830170410);
        setField(term124735, term124735.getClass(), "lv_str", "JGdxVjQzts");
        setIntField(term124735, term124735.getClass(), "lv_efct_id", -1742790308);
        setIntField(term124735, term124735.getClass(), "lv_plt_id", -1592093430);
        setField(term124735, term124735.getClass(), "mdl_eqp_ary", "jEdjRikQtN");
        setField(term124735, term124735.getClass(), "c_itm_eqp_ary", "fSNUaokVWs");
        setField(term124735, term124735.getClass(), "ms_itm_flg_ary", "dTxnMmHoVm");
        setIntField(term124828, term124828.getClass(), "year", 2024);
        setShortField(term124828, term124828.getClass(), "month", (short) 2);
        setShortField(term124828, term124828.getClass(), "day", (short) 29);
        setField(term124827, term124827.getClass(), "date", term124828);
        setByteField(term124832, term124832.getClass(), "hour", (byte) 17);
        setByteField(term124832, term124832.getClass(), "minute", (byte) 54);
        setByteField(term124832, term124832.getClass(), "second", (byte) 21);
        setIntField(term124832, term124832.getClass(), "nano", 605973408);
        setField(term124827, term124827.getClass(), "time", term124832);
        setField(term124735, term124735.getClass(), "mdl_eqp_tm", term124827);
        setField(term124735, term124735.getClass(), "mdl_have", "iswxaQUQgT");
        setField(term124735, term124735.getClass(), "cstmz_itm_have", "MxUSQqhNse");
        setBooleanField(term124735, term124735.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term124735, term124735.getClass(), "use_mdl_pri", false);
        setBooleanField(term124735, term124735.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term124735, term124735.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term124735, term124735.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term124735, term124735.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term124735, term124735.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term124735, term124735.getClass(), "vcld_pts", 1178214545);
        setIntField(term124735, term124735.getClass(), "nxt_pv_id", -985334541);
        setField(term124735, term124735.getClass(), "nxt_dffclty", enum297);
        setField(term124735, term124735.getClass(), "nxt_edtn", enum298);
        setField(term124735, term124735.getClass(), "cv_cid", "skwxdosvQV");
        setField(term124735, term124735.getClass(), "cv_sc", "DBYTggnCkD");
        setField(term124735, term124735.getClass(), "cv_rr", "RyXrJxJQiY");
        setField(term124735, term124735.getClass(), "cv_bv", "JfnQeTdzWs");
        setField(term124735, term124735.getClass(), "cv_bf", "HGhGqMiMOk");
        setIntField(term124735, term124735.getClass(), "cnp_cid", -1870004228);
        setIntField(term124735, term124735.getClass(), "cnp_val", 380484139);
        setField(term124735, term124735.getClass(), "cnp_rr", enum299);
        setField(term124735, term124735.getClass(), "cnp_sp", "VtTzFdKpZI");
        setField(term124735, term124735.getClass(), "my_lst_0", "yCqQIOXRXO");
        setField(term124735, term124735.getClass(), "my_lst_1", "aevLPMVcYW");
        setField(term124735, term124735.getClass(), "my_lst_2", "orHcHVrwHz");
        setField(term124735, term124735.getClass(), "my_lst_3", "mkEWcQdwUn");
        setField(term124735, term124735.getClass(), "my_lst_4", "VRjVlzFSIx");
        setField(term124735, term124735.getClass(), "dsp_clr_brdr", "fNlDLqQZFT");
        setBooleanField(term124735, term124735.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term124735, term124735.getClass(), "dsp_clr_sts", true);
        setField(term124735, term124735.getClass(), "clr_sts", "szCfpoTDXX");
        setBooleanField(term124735, term124735.getClass(), "rgo_sts", false);
        setField(term124735, term124735.getClass(), "my_qst_id", "blnSDUyHkS");
        setField(term124735, term124735.getClass(), "my_qst_sts", "byyepwHlHN");
        setField(term124735, term124735.getClass(), "my_qst_prgrs", "akVNsUcFra");
        setField(term124735, term124735.getClass(), "my_qst_et", "BKiHMTzLoY");
        setField(term124735, term124735.getClass(), "p_std_ie_have", "arrHHpXCBD");
        setField(term124735, term124735.getClass(), "p_std_se_have", "zzfzxQYlis");
        setField(term124735, term124735.getClass(), "cmd", "TJJQwVEzxz");
        setField(term124735, term124735.getClass(), "req_id", "kHtEHBrsFo");
        setField(term124735, term124735.getClass(), "stat", "EmAvkhGlPV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum295;
        callMethod(klass, "setStart_result", argTypes, term124735, args);
    }

};


