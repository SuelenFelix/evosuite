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

public class PreStartResponse_setVcldpts_184033100544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292690;
     Object term292845;

    public PreStartResponse_setVcldpts_184033100544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292848 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term292847 = ((Class) term292848).getDeclaredField((String) "CARD_BANNED");
        ((Field) term292847).setAccessible(true);
        Object enum709 = ((Field) term292847).get((Object) null);
        Integer term292707 = new Integer(-31751777);
        Integer term292709 = new Integer(-246967963);
        Integer term292711 = new Integer(-1777140369);
        Integer term292713 = new Integer(993627098);
        Integer term292715 = new Integer(872295704);
        Class<? extends Object> term293168 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term293167 = ((Class) term293168).getDeclaredField((String) "MY_LIST_C");
        ((Field) term293167).setAccessible(true);
        Object enum710 = ((Field) term293167).get((Object) null);
        Integer term292743 = new Integer(86041387);
        Integer term292745 = new Integer(1010721666);
        Integer term292759 = new Integer(27043781);
        Integer term292761 = new Integer(-1367122405);
        Integer term292785 = new Integer(-1703625118);
        Integer term292787 = new Integer(1104108112);
        Integer term292789 = new Integer(1648665618);
        Integer term292791 = new Integer(633765954);
        Integer term292793 = new Integer(269110087);
        Integer term292795 = new Integer(1545119095);
        Class<? extends Object> term293462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term293461 = ((Class) term293462).getDeclaredField((String) "REISSUE");
        ((Field) term293461).setAccessible(true);
        Object enum711 = ((Field) term293461).get((Object) null);
        term292690 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term292775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292780 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term292690, term292690.getClass(), "ps_result", enum709);
        setField(term292690, term292690.getClass(), "accept_idx", term292707);
        setField(term292690, term292690.getClass(), "nblss_ltt_stts", term292709);
        setField(term292690, term292690.getClass(), "nblss_ltt_tckt", term292711);
        setField(term292690, term292690.getClass(), "nblss_ltt_is_opn", term292713);
        setField(term292690, term292690.getClass(), "pd_id", term292715);
        setField(term292690, term292690.getClass(), "player_name", "ZTUqSMjJHU");
        setField(term292690, term292690.getClass(), "sort_kind", enum710);
        setField(term292690, term292690.getClass(), "lv_num", term292743);
        setField(term292690, term292690.getClass(), "lv_pnt", term292745);
        setField(term292690, term292690.getClass(), "lv_str", "TAvUGVCPaa");
        setField(term292690, term292690.getClass(), "lv_efct_id", term292759);
        setField(term292690, term292690.getClass(), "lv_plt_id", term292761);
        setField(term292690, term292690.getClass(), "mdl_eqp_ary", "oacMptGUKE");
        setIntField(term292776, term292776.getClass(), "year", 2027);
        setShortField(term292776, term292776.getClass(), "month", (short) 5);
        setShortField(term292776, term292776.getClass(), "day", (short) 2);
        setField(term292775, term292775.getClass(), "date", term292776);
        setByteField(term292780, term292780.getClass(), "hour", (byte) 6);
        setByteField(term292780, term292780.getClass(), "minute", (byte) 10);
        setByteField(term292780, term292780.getClass(), "second", (byte) 19);
        setIntField(term292780, term292780.getClass(), "nano", 422884120);
        setField(term292775, term292775.getClass(), "time", term292780);
        setField(term292690, term292690.getClass(), "mdl_eqp_tm", term292775);
        setField(term292690, term292690.getClass(), "skn_eqp", term292785);
        setField(term292690, term292690.getClass(), "btn_se_eqp", term292787);
        setField(term292690, term292690.getClass(), "sld_se_eqp", term292789);
        setField(term292690, term292690.getClass(), "chn_sld_se_eqp", term292791);
        setField(term292690, term292690.getClass(), "sldr_tch_se_eqp", term292793);
        setField(term292690, term292690.getClass(), "vcld_pts", term292795);
        setField(term292690, term292690.getClass(), "passwd_stat", enum711);
        setField(term292690, term292690.getClass(), "cmd", "vjVwvYdNhl");
        setField(term292690, term292690.getClass(), "req_id", "sqJqznmMco");
        setField(term292690, term292690.getClass(), "stat", "ZufWIAjLXm");
        term292845 = new Integer(1671229683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term292845;
        callMethod(klass, "setVcld_pts", argTypes, term292690, args);
    }

};


