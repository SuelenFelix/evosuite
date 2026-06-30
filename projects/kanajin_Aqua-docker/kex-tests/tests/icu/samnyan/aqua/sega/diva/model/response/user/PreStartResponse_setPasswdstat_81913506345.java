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

public class PreStartResponse_setPasswdstat_81913506345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293759;
     Object enum715;

    public PreStartResponse_setPasswdstat_81913506345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293929 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term293928 = ((Class) term293929).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term293928).setAccessible(true);
        Object enum712 = ((Field) term293928).get((Object) null);
        Integer term293781 = new Integer(34167717);
        Integer term293783 = new Integer(-514195141);
        Integer term293785 = new Integer(-297946422);
        Integer term293787 = new Integer(385463636);
        Integer term293789 = new Integer(-1677599962);
        Class<? extends Object> term294264 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term294263 = ((Class) term294264).getDeclaredField((String) "COMPLEXITY");
        ((Field) term294263).setAccessible(true);
        Object enum713 = ((Field) term294263).get((Object) null);
        Integer term293818 = new Integer(-1790275458);
        Integer term293820 = new Integer(-497534255);
        Integer term293834 = new Integer(1588942911);
        Integer term293836 = new Integer(-2129828854);
        Integer term293860 = new Integer(-47438786);
        Integer term293862 = new Integer(-1955400589);
        Integer term293864 = new Integer(626179200);
        Integer term293866 = new Integer(-511077684);
        Integer term293868 = new Integer(-711507760);
        Integer term293870 = new Integer(1053773809);
        Class<? extends Object> term294561 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term294560 = ((Class) term294561).getDeclaredField((String) "SET");
        ((Field) term294560).setAccessible(true);
        Object enum714 = ((Field) term294560).get((Object) null);
        term293759 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term293850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293855 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term293759, term293759.getClass(), "ps_result", enum712);
        setField(term293759, term293759.getClass(), "accept_idx", term293781);
        setField(term293759, term293759.getClass(), "nblss_ltt_stts", term293783);
        setField(term293759, term293759.getClass(), "nblss_ltt_tckt", term293785);
        setField(term293759, term293759.getClass(), "nblss_ltt_is_opn", term293787);
        setField(term293759, term293759.getClass(), "pd_id", term293789);
        setField(term293759, term293759.getClass(), "player_name", "rXhBlGnTbp");
        setField(term293759, term293759.getClass(), "sort_kind", enum713);
        setField(term293759, term293759.getClass(), "lv_num", term293818);
        setField(term293759, term293759.getClass(), "lv_pnt", term293820);
        setField(term293759, term293759.getClass(), "lv_str", "RXrliVaPrQ");
        setField(term293759, term293759.getClass(), "lv_efct_id", term293834);
        setField(term293759, term293759.getClass(), "lv_plt_id", term293836);
        setField(term293759, term293759.getClass(), "mdl_eqp_ary", "QWnrSwmKgP");
        setIntField(term293851, term293851.getClass(), "year", 2029);
        setShortField(term293851, term293851.getClass(), "month", (short) 10);
        setShortField(term293851, term293851.getClass(), "day", (short) 19);
        setField(term293850, term293850.getClass(), "date", term293851);
        setByteField(term293855, term293855.getClass(), "hour", (byte) 15);
        setByteField(term293855, term293855.getClass(), "minute", (byte) 8);
        setByteField(term293855, term293855.getClass(), "second", (byte) 15);
        setIntField(term293855, term293855.getClass(), "nano", 25396748);
        setField(term293850, term293850.getClass(), "time", term293855);
        setField(term293759, term293759.getClass(), "mdl_eqp_tm", term293850);
        setField(term293759, term293759.getClass(), "skn_eqp", term293860);
        setField(term293759, term293759.getClass(), "btn_se_eqp", term293862);
        setField(term293759, term293759.getClass(), "sld_se_eqp", term293864);
        setField(term293759, term293759.getClass(), "chn_sld_se_eqp", term293866);
        setField(term293759, term293759.getClass(), "sldr_tch_se_eqp", term293868);
        setField(term293759, term293759.getClass(), "vcld_pts", term293870);
        setField(term293759, term293759.getClass(), "passwd_stat", enum714);
        setField(term293759, term293759.getClass(), "cmd", "wOeJuAGSwi");
        setField(term293759, term293759.getClass(), "req_id", "lCalUsJPRJ");
        setField(term293759, term293759.getClass(), "stat", "gFHKkRGUax");
        Class<? extends Object> term294847 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term294846 = ((Class) term294847).getDeclaredField((String) "REISSUE");
        ((Field) term294846).setAccessible(true);
        enum715 = ((Field) term294846).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Object[] args = new Object[1];
        args[0] = enum715;
        callMethod(klass, "setPasswd_stat", argTypes, term293759, args);
    }

};


