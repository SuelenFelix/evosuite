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

public class PreStartResponse_setSkneqp_61397178139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287421;
     Object term287572;

    public PreStartResponse_setSkneqp_61397178139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term287575 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term287574 = ((Class) term287575).getDeclaredField((String) "FAILED");
        ((Field) term287574).setAccessible(true);
        Object enum694 = ((Field) term287574).get((Object) null);
        Integer term287433 = new Integer(-1415256843);
        Integer term287435 = new Integer(612177768);
        Integer term287437 = new Integer(-1626451656);
        Integer term287439 = new Integer(173952451);
        Integer term287441 = new Integer(-1972033388);
        Class<? extends Object> term287880 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term287879 = ((Class) term287880).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term287879).setAccessible(true);
        Object enum695 = ((Field) term287879).get((Object) null);
        Integer term287472 = new Integer(-1005024758);
        Integer term287474 = new Integer(2634669);
        Integer term287488 = new Integer(-1912429941);
        Integer term287490 = new Integer(1801052257);
        Integer term287514 = new Integer(-2110556060);
        Integer term287516 = new Integer(313459791);
        Integer term287518 = new Integer(752615112);
        Integer term287520 = new Integer(-1674430871);
        Integer term287522 = new Integer(794352120);
        Integer term287524 = new Integer(340719678);
        Class<? extends Object> term288183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term288182 = ((Class) term288183).getDeclaredField((String) "RESET");
        ((Field) term288182).setAccessible(true);
        Object enum696 = ((Field) term288182).get((Object) null);
        term287421 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term287504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287509 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term287421, term287421.getClass(), "ps_result", enum694);
        setField(term287421, term287421.getClass(), "accept_idx", term287433);
        setField(term287421, term287421.getClass(), "nblss_ltt_stts", term287435);
        setField(term287421, term287421.getClass(), "nblss_ltt_tckt", term287437);
        setField(term287421, term287421.getClass(), "nblss_ltt_is_opn", term287439);
        setField(term287421, term287421.getClass(), "pd_id", term287441);
        setField(term287421, term287421.getClass(), "player_name", "ilMWoyWLja");
        setField(term287421, term287421.getClass(), "sort_kind", enum695);
        setField(term287421, term287421.getClass(), "lv_num", term287472);
        setField(term287421, term287421.getClass(), "lv_pnt", term287474);
        setField(term287421, term287421.getClass(), "lv_str", "DejzaVMRwf");
        setField(term287421, term287421.getClass(), "lv_efct_id", term287488);
        setField(term287421, term287421.getClass(), "lv_plt_id", term287490);
        setField(term287421, term287421.getClass(), "mdl_eqp_ary", "vpcvPRFXOI");
        setIntField(term287505, term287505.getClass(), "year", 2022);
        setShortField(term287505, term287505.getClass(), "month", (short) 11);
        setShortField(term287505, term287505.getClass(), "day", (short) 2);
        setField(term287504, term287504.getClass(), "date", term287505);
        setByteField(term287509, term287509.getClass(), "hour", (byte) 4);
        setByteField(term287509, term287509.getClass(), "minute", (byte) 14);
        setByteField(term287509, term287509.getClass(), "second", (byte) 5);
        setIntField(term287509, term287509.getClass(), "nano", 604465127);
        setField(term287504, term287504.getClass(), "time", term287509);
        setField(term287421, term287421.getClass(), "mdl_eqp_tm", term287504);
        setField(term287421, term287421.getClass(), "skn_eqp", term287514);
        setField(term287421, term287421.getClass(), "btn_se_eqp", term287516);
        setField(term287421, term287421.getClass(), "sld_se_eqp", term287518);
        setField(term287421, term287421.getClass(), "chn_sld_se_eqp", term287520);
        setField(term287421, term287421.getClass(), "sldr_tch_se_eqp", term287522);
        setField(term287421, term287421.getClass(), "vcld_pts", term287524);
        setField(term287421, term287421.getClass(), "passwd_stat", enum696);
        setField(term287421, term287421.getClass(), "cmd", "LpBQSpICQX");
        setField(term287421, term287421.getClass(), "req_id", "uPhRdRCFnR");
        setField(term287421, term287421.getClass(), "stat", "HdiCCAVvaY");
        term287572 = new Integer(299791142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term287572;
        callMethod(klass, "setSkn_eqp", argTypes, term287421, args);
    }

};


