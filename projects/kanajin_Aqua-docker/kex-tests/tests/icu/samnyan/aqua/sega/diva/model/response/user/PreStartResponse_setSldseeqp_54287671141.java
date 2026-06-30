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

public class PreStartResponse_setSldseeqp_54287671141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289531;
     Object term289687;

    public PreStartResponse_setSldseeqp_54287671141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289690 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term289689 = ((Class) term289690).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term289689).setAccessible(true);
        Object enum700 = ((Field) term289689).get((Object) null);
        Integer term289553 = new Integer(-706253892);
        Integer term289555 = new Integer(-1341439819);
        Integer term289557 = new Integer(-728760750);
        Integer term289559 = new Integer(-1617383807);
        Integer term289561 = new Integer(-1244386281);
        Class<? extends Object> term290025 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term290024 = ((Class) term290025).getDeclaredField((String) "MY_LIST_C");
        ((Field) term290024).setAccessible(true);
        Object enum701 = ((Field) term290024).get((Object) null);
        Integer term289589 = new Integer(-885788574);
        Integer term289591 = new Integer(-865722613);
        Integer term289605 = new Integer(-1551355284);
        Integer term289607 = new Integer(-1381970335);
        Integer term289631 = new Integer(1213549815);
        Integer term289633 = new Integer(-1518419301);
        Integer term289635 = new Integer(674879025);
        Integer term289637 = new Integer(-1538936030);
        Integer term289639 = new Integer(-752870423);
        Integer term289641 = new Integer(-1698809299);
        Class<? extends Object> term290319 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term290318 = ((Class) term290319).getDeclaredField((String) "SET");
        ((Field) term290318).setAccessible(true);
        Object enum702 = ((Field) term290318).get((Object) null);
        term289531 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term289621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289626 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term289531, term289531.getClass(), "ps_result", enum700);
        setField(term289531, term289531.getClass(), "accept_idx", term289553);
        setField(term289531, term289531.getClass(), "nblss_ltt_stts", term289555);
        setField(term289531, term289531.getClass(), "nblss_ltt_tckt", term289557);
        setField(term289531, term289531.getClass(), "nblss_ltt_is_opn", term289559);
        setField(term289531, term289531.getClass(), "pd_id", term289561);
        setField(term289531, term289531.getClass(), "player_name", "BSkkjeLezA");
        setField(term289531, term289531.getClass(), "sort_kind", enum701);
        setField(term289531, term289531.getClass(), "lv_num", term289589);
        setField(term289531, term289531.getClass(), "lv_pnt", term289591);
        setField(term289531, term289531.getClass(), "lv_str", "uAlTVusgen");
        setField(term289531, term289531.getClass(), "lv_efct_id", term289605);
        setField(term289531, term289531.getClass(), "lv_plt_id", term289607);
        setField(term289531, term289531.getClass(), "mdl_eqp_ary", "PAUaymMOSJ");
        setIntField(term289622, term289622.getClass(), "year", 2010);
        setShortField(term289622, term289622.getClass(), "month", (short) 11);
        setShortField(term289622, term289622.getClass(), "day", (short) 1);
        setField(term289621, term289621.getClass(), "date", term289622);
        setByteField(term289626, term289626.getClass(), "hour", (byte) 5);
        setByteField(term289626, term289626.getClass(), "minute", (byte) 32);
        setByteField(term289626, term289626.getClass(), "second", (byte) 8);
        setIntField(term289626, term289626.getClass(), "nano", 918832231);
        setField(term289621, term289621.getClass(), "time", term289626);
        setField(term289531, term289531.getClass(), "mdl_eqp_tm", term289621);
        setField(term289531, term289531.getClass(), "skn_eqp", term289631);
        setField(term289531, term289531.getClass(), "btn_se_eqp", term289633);
        setField(term289531, term289531.getClass(), "sld_se_eqp", term289635);
        setField(term289531, term289531.getClass(), "chn_sld_se_eqp", term289637);
        setField(term289531, term289531.getClass(), "sldr_tch_se_eqp", term289639);
        setField(term289531, term289531.getClass(), "vcld_pts", term289641);
        setField(term289531, term289531.getClass(), "passwd_stat", enum702);
        setField(term289531, term289531.getClass(), "cmd", "OcTjqWhWJS");
        setField(term289531, term289531.getClass(), "req_id", "XkidVezikV");
        setField(term289531, term289531.getClass(), "stat", "xSsMPNRSUV");
        term289687 = new Integer(401512128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term289687;
        callMethod(klass, "setSld_se_eqp", argTypes, term289531, args);
    }

};


