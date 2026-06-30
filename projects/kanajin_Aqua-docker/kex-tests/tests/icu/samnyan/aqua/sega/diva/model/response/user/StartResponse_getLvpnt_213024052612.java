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

public class StartResponse_getLvpnt_213024052612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26899;

    public StartResponse_getLvpnt_213024052612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term27338 = ((Class) term27339).getDeclaredField((String) "FAILED");
        ((Field) term27338).setAccessible(true);
        Object enum60 = ((Field) term27338).get((Object) null);
        Class<? extends Object> term27604 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term27603 = ((Class) term27604).getDeclaredField((String) "NAME");
        ((Field) term27603).setAccessible(true);
        Object enum61 = ((Field) term27603).get((Object) null);
        Class<? extends Object> term27923 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term27922 = ((Class) term27923).getDeclaredField((String) "NORMAL");
        ((Field) term27922).setAccessible(true);
        Object enum62 = ((Field) term27922).get((Object) null);
        Class<? extends Object> term28198 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term28197 = ((Class) term28198).getDeclaredField((String) "ORIGINAL");
        ((Field) term28197).setAccessible(true);
        Object enum63 = ((Field) term28197).get((Object) null);
        Class<? extends Object> term28514 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term28513 = ((Class) term28514).getDeclaredField((String) "BRONZE");
        ((Field) term28513).setAccessible(true);
        Object enum64 = ((Field) term28513).get((Object) null);
        term26899 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term26991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26996 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26899, term26899.getClass(), "pd_id", -1618206977);
        setField(term26899, term26899.getClass(), "start_result", enum60);
        setIntField(term26899, term26899.getClass(), "accept_idx", -1747406163);
        setIntField(term26899, term26899.getClass(), "start_idx", 388157121);
        setField(term26899, term26899.getClass(), "player_name", "KAORSSPSeV");
        setIntField(term26899, term26899.getClass(), "hp_vol", 1684998508);
        setBooleanField(term26899, term26899.getClass(), "btn_se_vol", false);
        setIntField(term26899, term26899.getClass(), "btn_se_vol2", -1476644457);
        setIntField(term26899, term26899.getClass(), "sldr_se_vol2", 1270666529);
        setField(term26899, term26899.getClass(), "sort_kind", enum61);
        setIntField(term26899, term26899.getClass(), "lv_num", -1146679443);
        setIntField(term26899, term26899.getClass(), "lv_pnt", -860131894);
        setField(term26899, term26899.getClass(), "lv_str", "UimMMORkzd");
        setIntField(term26899, term26899.getClass(), "lv_efct_id", -1022990421);
        setIntField(term26899, term26899.getClass(), "lv_plt_id", 1045547089);
        setField(term26899, term26899.getClass(), "mdl_eqp_ary", "huVIXUWLtI");
        setField(term26899, term26899.getClass(), "c_itm_eqp_ary", "vhKzFyKPOT");
        setField(term26899, term26899.getClass(), "ms_itm_flg_ary", "nQhIgWXdRc");
        setIntField(term26992, term26992.getClass(), "year", 2012);
        setShortField(term26992, term26992.getClass(), "month", (short) 9);
        setShortField(term26992, term26992.getClass(), "day", (short) 11);
        setField(term26991, term26991.getClass(), "date", term26992);
        setByteField(term26996, term26996.getClass(), "hour", (byte) 22);
        setByteField(term26996, term26996.getClass(), "minute", (byte) 10);
        setByteField(term26996, term26996.getClass(), "second", (byte) 8);
        setIntField(term26996, term26996.getClass(), "nano", 380008862);
        setField(term26991, term26991.getClass(), "time", term26996);
        setField(term26899, term26899.getClass(), "mdl_eqp_tm", term26991);
        setField(term26899, term26899.getClass(), "mdl_have", "EusenEbIoF");
        setField(term26899, term26899.getClass(), "cstmz_itm_have", "SScVQYSvWH");
        setBooleanField(term26899, term26899.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term26899, term26899.getClass(), "use_mdl_pri", false);
        setBooleanField(term26899, term26899.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term26899, term26899.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term26899, term26899.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term26899, term26899.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term26899, term26899.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term26899, term26899.getClass(), "vcld_pts", -1122880881);
        setIntField(term26899, term26899.getClass(), "nxt_pv_id", -542712742);
        setField(term26899, term26899.getClass(), "nxt_dffclty", enum62);
        setField(term26899, term26899.getClass(), "nxt_edtn", enum63);
        setField(term26899, term26899.getClass(), "cv_cid", "MnovcqFhCl");
        setField(term26899, term26899.getClass(), "cv_sc", "qYtAeLzOhW");
        setField(term26899, term26899.getClass(), "cv_rr", "tJzmOfcUnY");
        setField(term26899, term26899.getClass(), "cv_bv", "TKlccZUpjz");
        setField(term26899, term26899.getClass(), "cv_bf", "GGzwMoHZXC");
        setIntField(term26899, term26899.getClass(), "cnp_cid", -1254072822);
        setIntField(term26899, term26899.getClass(), "cnp_val", -1111249833);
        setField(term26899, term26899.getClass(), "cnp_rr", enum64);
        setField(term26899, term26899.getClass(), "cnp_sp", "IpmgwHTgnG");
        setField(term26899, term26899.getClass(), "my_lst_0", "tIpkeYIezR");
        setField(term26899, term26899.getClass(), "my_lst_1", "YkZtEtthvz");
        setField(term26899, term26899.getClass(), "my_lst_2", "dwlZSxlXOo");
        setField(term26899, term26899.getClass(), "my_lst_3", "lKrEAkypza");
        setField(term26899, term26899.getClass(), "my_lst_4", "KtuuNAqGCQ");
        setField(term26899, term26899.getClass(), "dsp_clr_brdr", "OGQsfjmReM");
        setBooleanField(term26899, term26899.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term26899, term26899.getClass(), "dsp_clr_sts", false);
        setField(term26899, term26899.getClass(), "clr_sts", "YsUtbngnRO");
        setBooleanField(term26899, term26899.getClass(), "rgo_sts", true);
        setField(term26899, term26899.getClass(), "my_qst_id", "JisaWUxcNb");
        setField(term26899, term26899.getClass(), "my_qst_sts", "NxgmYPzWCI");
        setField(term26899, term26899.getClass(), "my_qst_prgrs", "SqjyKmayBx");
        setField(term26899, term26899.getClass(), "my_qst_et", "XjDhvToxJy");
        setField(term26899, term26899.getClass(), "p_std_ie_have", "nxSTJflLQy");
        setField(term26899, term26899.getClass(), "p_std_se_have", "FlHzxEfFzI");
        setField(term26899, term26899.getClass(), "cmd", "aSATgQUpoe");
        setField(term26899, term26899.getClass(), "req_id", "VkPSXewZfB");
        setField(term26899, term26899.getClass(), "stat", "ubodzJoMGW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_pnt", argTypes, term26899, args);
    }

};


