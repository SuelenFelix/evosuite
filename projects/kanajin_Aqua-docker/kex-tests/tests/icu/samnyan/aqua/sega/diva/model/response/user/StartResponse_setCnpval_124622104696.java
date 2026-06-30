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
import java.lang.Integer;

public class StartResponse_setCnpval_124622104696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202435;
     Object term202876;

    public StartResponse_setCnpval_124622104696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202879 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term202878 = ((Class) term202879).getDeclaredField((String) "SUCCESS");
        ((Field) term202878).setAccessible(true);
        Object enum481 = ((Field) term202878).get((Object) null);
        Class<? extends Object> term203147 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term203146 = ((Class) term203147).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term203146).setAccessible(true);
        Object enum482 = ((Field) term203146).get((Object) null);
        Class<? extends Object> term203490 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term203489 = ((Class) term203490).getDeclaredField((String) "HARD");
        ((Field) term203489).setAccessible(true);
        Object enum483 = ((Field) term203489).get((Object) null);
        Class<? extends Object> term203759 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term203758 = ((Class) term203759).getDeclaredField((String) "EXTRA");
        ((Field) term203758).setAccessible(true);
        Object enum484 = ((Field) term203758).get((Object) null);
        Class<? extends Object> term204066 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term204065 = ((Class) term204066).getDeclaredField((String) "GOLD");
        ((Field) term204065).setAccessible(true);
        Object enum485 = ((Field) term204065).get((Object) null);
        term202435 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term202536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202541 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term202435, term202435.getClass(), "pd_id", 212698793);
        setField(term202435, term202435.getClass(), "start_result", enum481);
        setIntField(term202435, term202435.getClass(), "accept_idx", 1169519385);
        setIntField(term202435, term202435.getClass(), "start_idx", 1846078344);
        setField(term202435, term202435.getClass(), "player_name", "jCEXysSVZf");
        setIntField(term202435, term202435.getClass(), "hp_vol", 1692543802);
        setBooleanField(term202435, term202435.getClass(), "btn_se_vol", false);
        setIntField(term202435, term202435.getClass(), "btn_se_vol2", 376341151);
        setIntField(term202435, term202435.getClass(), "sldr_se_vol2", -1607267243);
        setField(term202435, term202435.getClass(), "sort_kind", enum482);
        setIntField(term202435, term202435.getClass(), "lv_num", 1641377218);
        setIntField(term202435, term202435.getClass(), "lv_pnt", 1235375204);
        setField(term202435, term202435.getClass(), "lv_str", "jWrmcNnNoB");
        setIntField(term202435, term202435.getClass(), "lv_efct_id", 258334639);
        setIntField(term202435, term202435.getClass(), "lv_plt_id", 1432187207);
        setField(term202435, term202435.getClass(), "mdl_eqp_ary", "MoncgugUfo");
        setField(term202435, term202435.getClass(), "c_itm_eqp_ary", "OdbuOWCJTS");
        setField(term202435, term202435.getClass(), "ms_itm_flg_ary", "ksvfEdmpqg");
        setIntField(term202537, term202537.getClass(), "year", 2014);
        setShortField(term202537, term202537.getClass(), "month", (short) 10);
        setShortField(term202537, term202537.getClass(), "day", (short) 7);
        setField(term202536, term202536.getClass(), "date", term202537);
        setByteField(term202541, term202541.getClass(), "hour", (byte) 12);
        setByteField(term202541, term202541.getClass(), "minute", (byte) 59);
        setByteField(term202541, term202541.getClass(), "second", (byte) 39);
        setIntField(term202541, term202541.getClass(), "nano", 603709306);
        setField(term202536, term202536.getClass(), "time", term202541);
        setField(term202435, term202435.getClass(), "mdl_eqp_tm", term202536);
        setField(term202435, term202435.getClass(), "mdl_have", "mNzFmmNjDi");
        setField(term202435, term202435.getClass(), "cstmz_itm_have", "UxkbStdccR");
        setBooleanField(term202435, term202435.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term202435, term202435.getClass(), "use_mdl_pri", false);
        setBooleanField(term202435, term202435.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term202435, term202435.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term202435, term202435.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term202435, term202435.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term202435, term202435.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term202435, term202435.getClass(), "vcld_pts", -91068927);
        setIntField(term202435, term202435.getClass(), "nxt_pv_id", 680714112);
        setField(term202435, term202435.getClass(), "nxt_dffclty", enum483);
        setField(term202435, term202435.getClass(), "nxt_edtn", enum484);
        setField(term202435, term202435.getClass(), "cv_cid", "kizVhsjIpC");
        setField(term202435, term202435.getClass(), "cv_sc", "uDuPkYdemJ");
        setField(term202435, term202435.getClass(), "cv_rr", "FfynoMXicS");
        setField(term202435, term202435.getClass(), "cv_bv", "mbofhtwtHb");
        setField(term202435, term202435.getClass(), "cv_bf", "goCKhChLTQ");
        setIntField(term202435, term202435.getClass(), "cnp_cid", 385297023);
        setIntField(term202435, term202435.getClass(), "cnp_val", -134092543);
        setField(term202435, term202435.getClass(), "cnp_rr", enum485);
        setField(term202435, term202435.getClass(), "cnp_sp", "VkjCLLOwvZ");
        setField(term202435, term202435.getClass(), "my_lst_0", "YQaoPDOhWH");
        setField(term202435, term202435.getClass(), "my_lst_1", "SJPzCePrEj");
        setField(term202435, term202435.getClass(), "my_lst_2", "tYasEQgFbL");
        setField(term202435, term202435.getClass(), "my_lst_3", "hqURWIdULb");
        setField(term202435, term202435.getClass(), "my_lst_4", "kWDcKMrObe");
        setField(term202435, term202435.getClass(), "dsp_clr_brdr", "yQIuIaxdRt");
        setBooleanField(term202435, term202435.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term202435, term202435.getClass(), "dsp_clr_sts", true);
        setField(term202435, term202435.getClass(), "clr_sts", "mppqyavbHE");
        setBooleanField(term202435, term202435.getClass(), "rgo_sts", true);
        setField(term202435, term202435.getClass(), "my_qst_id", "XRhNVGJlMP");
        setField(term202435, term202435.getClass(), "my_qst_sts", "OGvydrXtac");
        setField(term202435, term202435.getClass(), "my_qst_prgrs", "SaPfgULGFp");
        setField(term202435, term202435.getClass(), "my_qst_et", "olLmzJWshP");
        setField(term202435, term202435.getClass(), "p_std_ie_have", "VbgHjUqRYR");
        setField(term202435, term202435.getClass(), "p_std_se_have", "qZzSujRYqy");
        setField(term202435, term202435.getClass(), "cmd", "IJXeeXjhgd");
        setField(term202435, term202435.getClass(), "req_id", "QTDAUOmsVV");
        setField(term202435, term202435.getClass(), "stat", "ODrpsXzKlX");
        term202876 = new Integer(-1703642288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term202876;
        callMethod(klass, "setCnp_val", argTypes, term202435, args);
    }

};


